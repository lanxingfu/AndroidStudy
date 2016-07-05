package com.lanxingfu.lanxingfu13_checkbox_radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    private CheckBox cb_novel,cb_movie,cb_sport,cb_music;
    private RadioButton rb_male,rb_female;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb_novel = (CheckBox) findViewById(R.id.checkBox_novel);
        cb_movie = (CheckBox) findViewById(R.id.checkBox_movie);
        cb_sport = (CheckBox) findViewById(R.id.checkBox_sport);
        cb_music = (CheckBox) findViewById(R.id.checkBox_music);

        rb_male = (RadioButton) findViewById(R.id.radioButton_male);
        rb_female = (RadioButton) findViewById(R.id.radioButton_female);

        rb_male.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this,"Radio checked="+isChecked,Toast.LENGTH_SHORT).show();
            }
        });

        //注册事件
        cb_novel.setOnCheckedChangeListener(this);
        cb_movie.setOnCheckedChangeListener(this);
        cb_sport.setOnCheckedChangeListener(this);
        cb_music.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()) {
            case R.id.checkBox_novel:
                if (isChecked) Toast.makeText(this,"选中小说选项",Toast.LENGTH_SHORT).show();
                else Toast.makeText(this,"取消小说选项",Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox_movie:
                if (isChecked) Toast.makeText(this,"选中电影选项",Toast.LENGTH_SHORT).show();
                else Toast.makeText(this,"取消电影选项",Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox_sport:
                if (isChecked) Toast.makeText(this,"选中户外运动选项",Toast.LENGTH_SHORT).show();
                else Toast.makeText(this,"取消户外运动选项",Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox_music:
                if (isChecked) Toast.makeText(this,"选中听音乐选项",Toast.LENGTH_SHORT).show();
                else Toast.makeText(this,"取消听音乐选项",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
