package com.lanxingfu.lanxingfu11_button_imagebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button b2,b3,b4,b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //绑定ID
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);

        //监听事件
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);

        //使用内部类方式实现OnClick
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"使用内部类实现OnClick!",Toast.LENGTH_LONG).show();
            }
        });

    }

    public void click1(View v) {
        Toast.makeText(MainActivity.this,"Button常用属性，click事件！",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button2:
                Toast.makeText(MainActivity.this,"Button2--OnClick",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Toast.makeText(MainActivity.this,"Button3--OnClick",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                Toast.makeText(MainActivity.this,"Button4--OnClick",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
