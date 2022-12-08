package com.itschool.practise261.exerciseextends;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.itschool.practise261.exerciseextends.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.imageButton.setOnClickListener(this::goToCharacters);
    }

    public void goToCharacters(View view) {
        Intent intent = new Intent(MainActivity.this, SimpleUnit.class);
        startActivity(intent);
    }
}
