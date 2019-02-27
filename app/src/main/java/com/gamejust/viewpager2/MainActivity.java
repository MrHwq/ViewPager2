package com.gamejust.viewpager2;

import android.os.Bundle;

import java.util.LinkedList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager2 viewPager2 = findViewById(R.id.viewpager2);
        List<String> str = new LinkedList<>();
        str.add("hello");
        str.add("world");
        str.add("u need");
        CheesePagerAdapter adapter = new CheesePagerAdapter(str);
        viewPager2.setAdapter(adapter);
    }
}
