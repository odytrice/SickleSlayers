package com.example.ody.sickslayers;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.view.View;
import android.widget.Toast;

import com.example.ody.sickslayers.databinding.ActivityMainBinding;

import adapters.PeopleAdapter;
import functions.Consumer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.rvPeople.setLayoutManager(new GridLayoutManager(this, 2));

        String[] people = new String[]{"Ody", "Onyie", "Vivien", "Judith", "Osasu"};

        PeopleAdapter adapter = new PeopleAdapter(people, new Consumer<String>() {
            @Override
            public void Consume(String value) {
                Toast.makeText(MainActivity.this, value + " Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        binding.rvPeople.setAdapter(adapter);
    }
}
