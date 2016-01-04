package com.bambu.mobile.materialtabexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.tabs1)
    public void tabs1() {
        startActivity(new Intent(MainActivity.this, Tabs1Activity.class));
    }

    @OnClick(R.id.tabs2)
    public void tabs2() {
        startActivity(new Intent(MainActivity.this, Tabs2Activity.class));
    }

    @OnClick(R.id.tabs3)
    public void tabs3() {
        startActivity(new Intent(MainActivity.this, Tabs3Activity.class));
    }

    @OnClick(R.id.tabs4)
    public void tabs4() {
        startActivity(new Intent(MainActivity.this, Tabs4Activity.class));
    }
}
