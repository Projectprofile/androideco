package com.example.androideco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_activity_main);
        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        img =findViewById(R.id.image);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //btn1.setText("Please Log in  ");
                Toast.makeText(MainActivity.this, "Please Log in", Toast.LENGTH_SHORT).show();
                openActivity1();
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //btn2.setText("signed in ");

                Toast.makeText(MainActivity.this, "Please Sign Up For Free", Toast.LENGTH_SHORT).show();
                openActivity2();
            }
        });
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //btn2.setText("signed in ");

                //Toast.makeText(MainActivity.this, "Please Sign Up For Free", Toast.LENGTH_SHORT).show();
                openActivity0ii();
            }
        });
    }
    public void openActivity0ii(){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);

    }


    public void openActivity1(){
        Intent intent=new Intent(this,LoginActivity.class);
        startActivity(intent);

    }
    public void openActivity2(){
        Intent intent=new Intent(this,SignUpActivity.class);
        startActivity(intent);

    }
}

