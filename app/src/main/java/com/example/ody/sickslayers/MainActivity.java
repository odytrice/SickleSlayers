package com.example.ody.sickslayers;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;

import com.example.ody.sickslayers.databinding.ActivityMainBinding;

import adapters.PeopleAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.rvPeople.setLayoutManager(new GridLayoutManager(this, 2));

        String[] people = new String[]{ "Ody", "Onyie", "Vivien", "Judith", "Osasu" };

        PeopleAdapter adapter = new PeopleAdapter(people);
        binding.rvPeople.setAdapter(adapter);
    }
}
