package com.example.androideco;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivityD extends AppCompatActivity {
    private DrawerLayout mml;
    private TextView Tvv;
private NavigationView nav;
    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_d);
        Toolbar toolbar = findViewById(R.id.toolbar);
        mml=findViewById(R.id.drawer_layout);
        Tvv=findViewById(R.id.tvv);
        nav=findViewById(R.id.nav_view);
        Load_setting();
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                 R.id.orders,R.id.rewards,R.id.nav_cart,R.id.nav_wishlist,R.id.account)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    private void Load_setting(){
        SharedPreferences sp= PreferenceManager.getDefaultSharedPreferences(this);
        boolean Chk_night = sp.getBoolean("NOGHT",false);
        if(Chk_night){
            //give id ,retrieve boolean
            mml.setBackgroundColor(Color.parseColor("#222222"));
            Tvv.setTextColor(Color.parseColor("#ffffff"));}
        else{
            mml.setBackgroundColor(Color.parseColor("#ffffff"));
            Tvv.setTextColor(Color.parseColor("#222222"));}

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity_d, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //now doing for menu items of main_activity_d.xml
        switch (item.getItemId()){
      case R.id.action_settings:
     Intent i=new Intent(this,Preference.class);
      startActivity(i);
      case R.id.action_search:
         return true;
      case R.id.action_notifiy:
         return true;
      case R.id.action_cart:
         return true;
      default:
     return super.onOptionsItemSelected(item);
    }}

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
    //@Override
   // public boolean onNavigationItemSelected(MenuItem item)
    //{

    //}

   @Override
   protected void onResume() {
     Load_setting();
   super.onResume();
   }


}