package com.example.topmarks3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    //Toolbar toolbar = findByViewId(R.id.toolbar1);
//setSupportActionBar(toolbar);

    DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawer = findViewById(R.id.drawer_Layout);
    }

    public void ClickMenu(View view){
        openDrawer(drawer);
    }

    public static void openDrawer(DrawerLayout drawer){
        drawer.openDrawer(GravityCompat.START);
    }

    public void ClickLogo(View view){
        closeDrawer(drawer);
    }

    public static void closeDrawer(DrawerLayout drawer){
        //close drawer layout
        if(drawer.isDrawerOpen(GravityCompat.START)){
            //when drawer is already open
            //close drawer
            drawer.closeDrawer(GravityCompat.START);
        }
    }

    public void ClickHome(View view){
        // recreate activity
        recreate();
    }

    public void ClickNotifications(View view){
        //redirect activity to notifications
        redirectActivity(this,Notifications.class);
    }

    public void ClickLayout(View view){
        //redirect activity to layout
        redirectActivity(this,Layout.class);
    }

    public void ClickRecoverData(View view){
        //redirect activity to recover data
        redirectActivity(this,RecoverData.class);
    }

    public static void redirectActivity(Activity activity, Class aClass){
        Intent intent = new Intent(activity, aClass);
        //set flag
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(intent);
    }

    @Override
    protected void onPause(){
        super.onPause();
        //close drawer
        closeDrawer(drawer);
    }

}
