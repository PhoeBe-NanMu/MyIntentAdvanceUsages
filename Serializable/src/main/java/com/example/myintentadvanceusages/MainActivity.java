package com.example.myintentadvanceusages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Person person = new Person();
                person.setAge(20);
                person.setName("Make");
                Intent intent = new Intent(MainActivity.this,Second.class);
            /**
             * 使用Intent传递对象
             * Serializable方式 传递的对象为继承Serializable接口的类的实例：person
             */
                intent.putExtra("person_text",person);
                startActivity(intent);
            }
        });


    }
}
