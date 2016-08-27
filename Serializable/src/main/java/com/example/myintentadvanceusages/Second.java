package com.example.myintentadvanceusages;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by LeiYang on 2016/8/27 0027.
 */

public class Second extends Activity {
    private TextView show_info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        show_info = (TextView) findViewById(R.id.show_text);
        Person person = (Person) getIntent().getSerializableExtra("person_text");
//        Log.i("info","Info: \nName:"+ person.getName()+"\nAge:"+person.getAge());
        show_info.setText("Info: Name: "+ person.getName()+"\n         Age    : "+person.getAge());
    }
}
