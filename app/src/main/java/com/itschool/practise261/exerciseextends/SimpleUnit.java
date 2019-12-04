package com.itschool.practise261.exerciseextends;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.itschool.practise261.exerciseextends.units.Human;
import com.itschool.practise261.exerciseextends.units.Monster;
import com.itschool.practise261.exerciseextends.units.Skeleton;
import com.itschool.practise261.exerciseextends.units.Unit;

public class SimpleUnit extends AppCompatActivity {
    TextView tw_name, tw_healh, tw_attack;
    ImageView imageView;
    ImageButton forward, backward;

    int num = 0;
    Unit units[] = new Unit[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_unit);

        tw_name = findViewById(R.id.name_unit);
        tw_attack = findViewById(R.id.attack_unit);
        tw_healh = findViewById(R.id.health_unit);
        imageView = findViewById(R.id.picture_unit);
        forward = findViewById(R.id.bt_forward);
        backward = findViewById(R.id.bt_backword);


        units[0] = new Human(23, 12, "Joe", 2);
        units[1] = new Monster(42, 34, "Scary Monster", 3);
        units[2] = new Skeleton(10,10,"Spooky Skeleton",1);
        // добавьте еще одного юнита класса Дракон и перепишите логику обработчиков

        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                forward();

            }
        });


        backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backView();
            }
        });


        toView(num);
    }

    private void forward() {
        if (num <2){

            num++;
        }
        else {

            num =2;
        }

        toView(num);
    }

    private void backView() {
        if (num <0 || num-1 <0) {
            num = 0;
        }
        else {
            num--;
        }
        Log.d("Extern", "back:" + num);
        toView(num);
    }

    private void toView(int num) {
        Unit un = units[num];

        tw_name.setText(un.name);
        tw_attack.setText(Integer.toString(un.attack));
        tw_healh.setText(Integer.toString(un.health));
        Drawable im = getResources().getDrawable(Integer.parseInt(un.imageName));
        imageView.setImageDrawable(im);

        Log.d("Extern", Integer.toString(num));
    }


}
