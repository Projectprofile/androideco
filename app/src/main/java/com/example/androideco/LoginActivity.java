package com.example.androideco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText Username;
    EditText Email;
    EditText password;
    Button loginbtn;
    TextView forgot;
    TextView Signlog;
    ImageView Img;
String User,pass,email;
//email pattern
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        Img=findViewById(R.id.image);
        Username=findViewById(R.id.usernamelogin);
        Email=findViewById(R.id.etemail);
        password=findViewById(R.id.etpasswordlogin);
        loginbtn=findViewById(R.id.loginpage);
        forgot=findViewById(R.id.forgot);
        Signlog=findViewById(R.id.signupup);




        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email=Email.getText().toString();
                User=Username.getText().toString();
                pass=password.getText().toString();

                    //forgot.setText("Logged in  ");
                    Toast.makeText(LoginActivity.this,"Get new Password", Toast.LENGTH_SHORT).show();
                    openActivity24();

               /* if(User.isEmpty()){
                    Toast.makeText(LoginActivity.this, "Enter The Username", Toast.LENGTH_SHORT).show();
                } else if(email.isEmpty()){
                    Toast.makeText(LoginActivity.this, "Enter The Username", Toast.LENGTH_SHORT).show();
                }
                //else if (email.matches(emailpattern)) {
                  //  Toast.makeText(LoginActivity.this, "Pls.enter valid email", Toast.LENGTH_SHORT).show();

                //}
                else if (pass.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Enter password pls.", Toast.LENGTH_SHORT).show();
                }
                else if(Username.getText().toString().equals("Admin") && Email.getText().toString().equals("sv3085684@gmail.com")&& password.getText().toString().equals("12345")){
                    openActivity2();
                    //not backtrack in previous class
                    finish();
                }
                else{
                    Toast.makeText(LoginActivity.this, "Please try again", Toast.LENGTH_SHORT).show();
                    finish();
                    openActivityi0i();
                }
            }*/}
        });


        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //forgot.setText("Logged in  ");
                Toast.makeText(LoginActivity.this,"Get new Password", Toast.LENGTH_SHORT).show();
                openActivity4();
            }
        });

        Signlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //forgot.setText("Logged in  ");
                Toast.makeText(LoginActivity.this,"Get SignUp", Toast.LENGTH_SHORT).show();
                openActivity5();
            }
        });
        Img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //btn2.setText("signed in ");

                //Toast.makeText(MainActivity.this, "Please Sign Up For Free", Toast.LENGTH_SHORT).show();
                openActivityi0i();
            }
        });
    }
    public void openActivityi0i(){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);

    }//
    //   private void validate(String user , String pass){
    //      if ({user.equals("Admin")}&&{pass.equals("12345")}) {
    //        Intent intent = new Intent(this, HomeScreenAc.class);
    //  }
    //startActivity(intent);
    //}else{

    //}





    public void openActivity2(){
        Intent intent=new Intent(this,MainActivityD.class);
        startActivity(intent);

    }
    public void openActivity24(){
        Intent intent=new Intent(this,MainActivityD.class);
        startActivity(intent);

    }

    public void openActivity4(){
        Intent intent=new Intent(this,ForgotPasswordScreenActivity.class);
        startActivity(intent);

    }
    public void openActivity5(){
        Intent intent=new Intent(this,SignUpActivity.class);
        startActivity(intent);}


}
