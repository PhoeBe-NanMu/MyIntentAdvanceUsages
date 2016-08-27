package com.example.parcelable;

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
                Intent intent = new Intent(MainActivity.this,Second.class);
                /*Parcelable方式的原理是将一个完整的对象进行分解，分解后的每一部分都是Intent支持的数据类型，这样效率更高*/
                Person person = new Person();
                person.setName("LeiYang");
                person.setAge(20);
                intent.putExtra("person_text",person);
                startActivity(intent);
            }
        });
    }
}
