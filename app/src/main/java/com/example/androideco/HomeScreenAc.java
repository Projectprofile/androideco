package com.example.androideco;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class HomeScreenAc extends AppCompatActivity {
   private ConstraintLayout ml;
   private TextView Tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
     ml=findViewById(R.id.mlayout);
     Tv=findViewById(R.id.tv);
     Load_setting();
    }
    private void Load_setting(){
        SharedPreferences sp= PreferenceManager.getDefaultSharedPreferences(this);
        boolean Chk_night = sp.getBoolean("NOGHT",false);
        if(Chk_night){
            //give id ,retrieve boolean
            ml.setBackgroundColor(Color.parseColor("#222222"));
             Tv.setTextColor(Color.parseColor("#ffffff"));}
        else{
            ml.setBackgroundColor(Color.parseColor("#ffffff"));
            Tv.setTextColor(Color.parseColor("#222222"));}

        }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(this, "Item 1 selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2:
                Intent i=new Intent(this,Preference.class);
                startActivity(i);
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onResume() {
        Load_setting();
        super.onResume();
    }
}
