package com.example.junxiantan.textvieweffect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //显示标题的文本框
    private TextView mTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //为文本显示框设置文本内容
        mTitle=(TextView)findViewById(R.id.title);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }
}
