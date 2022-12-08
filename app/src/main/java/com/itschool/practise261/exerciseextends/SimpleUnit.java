package com.itschool.practise261.exerciseextends;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;

import com.itschool.practise261.exerciseextends.databinding.ActivitySimpleUnitBinding;
import com.itschool.practise261.exerciseextends.model.Human;
import com.itschool.practise261.exerciseextends.model.Monster;
import com.itschool.practise261.exerciseextends.model.Skeleton;
import com.itschool.practise261.exerciseextends.model.Unit;

public class SimpleUnit extends AppCompatActivity {
    TextView tw_name, tw_healh, tw_attack;
    ImageView imageView;
    ImageButton forward, backward;

    int num = 0;
    Unit units[] = new Unit[3];
    private ActivitySimpleUnitBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_unit);
        units[0] = new Human(23, 12, "Joe", 2, this);
        units[1] = new Monster(42, 34, "Scary Monster", 3, this);
        units[2] = new Skeleton(10, 10, "Spooky Skeleton", 1, this);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_simple_unit);
        toView(binding, num);
        tw_name = binding.nameUnit;
        tw_attack = binding.attackUnit;
        tw_healh = binding.healthUnit;
        imageView = binding.pictureUnit;
        forward = binding.btForward;
        backward = binding.btBackword;


        forward.setOnClickListener(view -> forward());
        backward.setOnClickListener(view -> backView());

    }

    private void forward() {
        if (num >= 2) {
            num=0;
        } else {
            num++;
        }

        toView(binding, num);
    }

    private void backView() {
        if (num <= 0) {
            num = 2;
        } else {
            num--;
        }
        Log.d("Extern", "back:" + num);
        toView(binding, num);
    }

    private void toView(ActivitySimpleUnitBinding binding, int num) {
        Unit un = units[num];
        binding.setItem(un);
//        tw_name.setText(un.name);
//        tw_attack.setText(Integer.toString(un.attack));
//        tw_healh.setText(Integer.toString(un.health));
//        Drawable im = ContextCompat.getDrawable(this, Integer.parseInt(un.imageName));
//        imageView.setImageDrawable(im);

        Log.d("Extern", Integer.toString(num));
    }


}
