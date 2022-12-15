package com.itschool.practise261.exerciseextends;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.itschool.practise261.exerciseextends.databinding.ActivityMain3Binding;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMain3Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_main3);
        String name = getIntent().getExtras().getString("NAME_UNIT");
        binding.setName(name);
        binding.setDesc("test");
        switch (name) {
            case "Joe":
                binding.setDesc(getResources().getString(R.string.human));
                break;
            case "Scary Monster":
                binding.setDesc(getResources().getString(R.string.monster));
                break;
            case "Spooky Skeleton":
                binding.setDesc(getResources().getString(R.string.skeleton));
        }
    }
}