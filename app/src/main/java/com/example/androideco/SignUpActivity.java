package com.example.androideco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {
    EditText usernmsn;
    EditText Emailsn;
    EditText passwordsn;
    Button signbtnsn;
    EditText phone;
    ImageView img;
    TextView signlogg;
    String email,User,pass;
    String  emailpattern="[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        img=findViewById(R.id.image);
        usernmsn=findViewById(R.id.usernamesign);
        Emailsn=findViewById(R.id.editTextTextEmailAddress);
        passwordsn=findViewById(R.id.signuppassword);
        signbtnsn=findViewById(R.id.signupsignup);
        phone=findViewById(R.id.phone);
        signlogg=findViewById(R.id.signloginn);


        signbtnsn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email = Emailsn.getText().toString();
                User = usernmsn.getText().toString();
                pass = passwordsn.getText().toString();

                if (User.isEmpty()) {
                    Toast.makeText(SignUpActivity.this, "Enter The Username", Toast.LENGTH_SHORT).show();
                } else if (email.isEmpty()) {
                    Toast.makeText(SignUpActivity.this, "Enter The Username", Toast.LENGTH_SHORT).show();
                } else if (pass.isEmpty()) {
                    Toast.makeText(SignUpActivity.this, "Enter password pls.", Toast.LENGTH_SHORT).show();
                }
                else {
                    openActivity();
                    //not backtrack in previous class
                    finish();
                }
            }});


                //Toast.makeText(MainActivity.this, "Please Sign Up For Free", Toast.LENGTH_SHORT).show();


        signlogg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //btn2.setText("signed in ");

                //Toast.makeText(MainActivity.this, "Please Sign Up For Free", Toast.LENGTH_SHORT).show();
                openActivity9();
            }
        });


        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //btn2.setText("signed in ");

                //Toast.makeText(MainActivity.this, "Please Sign Up For Free", Toast.LENGTH_SHORT).show();
                openActivity0i();
            }
        });
    }
    public void openActivity0i(){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);

    }


    public void openActivity(){
        Intent intent=new Intent(this,MainActivityD.class);
        startActivity(intent);

    }

    public void openActivity9(){
        Intent intent=new Intent(this,SignUpActivity.class);
        startActivity(intent);

    }



}
