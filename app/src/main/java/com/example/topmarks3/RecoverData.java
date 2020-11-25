package com.example.topmarks3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;

public class RecoverData extends AppCompatActivity {

    DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recover_data);

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
        MainActivity.redirectActivity(this, Notifications.class);

    }

    public void ClickLayout(View view){
        MainActivity.redirectActivity(this, Layout.class);
    }

    public void ClickRecoverData(View view){
        recreate();
    }

    @Override
    protected void onPause(){
        super.onPause();
        MainActivity.closeDrawer(drawer);
    }
}