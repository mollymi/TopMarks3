package com.example.topmarks3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;

public class Notifications extends AppCompatActivity  {

    DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);

        drawer = findViewById(R.id.drawer_layout);
    }

    public void ClickMenu(View view){
        //open drawer
        MainActivity.openDrawer(drawer);
    }

    public void ClickLogo(View view){
        //close drawer
        MainActivity.closeDrawer(drawer);
    }

    public void ClickHome(View view){

        MainActivity.redirectActivity(this, MainActivity.class);
    }

    public void ClickNotifications(View view){
        recreate();
    }

    public void ClickLayout(View view){
        MainActivity.redirectActivity(this, Layout.class);
    }

    public void ClickRecoverData(View view){
        MainActivity.redirectActivity(this, RecoverData.class);
    }

    @Override
    protected void onPause(){
        super.onPause();
        MainActivity.closeDrawer(drawer);
    }
}