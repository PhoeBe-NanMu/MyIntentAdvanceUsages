package com.example.parcelable;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by LeiYang on 2016/8/28 0028.
 */

public class Second extends Activity {
    private TextView show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        show = (TextView) findViewById(R.id.show);
        Person person = getIntent().getParcelableExtra("person_text");
        show.setText("Info: Name: "+ person.getName()+"\n         Age    : "+person.getAge());

    }
}
