package com.example.android.us;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

    private LinearLayout home;
    private LinearLayout myProfile;
    private LinearLayout events;
    private LinearLayout favorite;
    private RelativeLayout inbox;
    private LinearLayout contactUs;
    private LinearLayout feedback;
    private LinearLayout setting;
    private LinearLayout mySchool;
    private LinearLayout addSchool;
    private LinearLayout useApp;
    private RelativeLayout logOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //make my own toolbar
        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //set menu icon
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.menu_white);


        drawerLayout = (DrawerLayout) findViewById(R.id.main_drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.navigation_view);


//        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                item.setChecked(true);
//
//                drawerLayout.closeDrawers();
//                return true;
//            }
//        });

        home = (LinearLayout) findViewById(R.id.homee);
        myProfile = (LinearLayout) findViewById(R.id.my_profile);
        events = (LinearLayout) findViewById(R.id.events);
        favorite = (LinearLayout) findViewById(R.id.favorite);
        inbox = (RelativeLayout) findViewById(R.id.inbox);
        contactUs = (LinearLayout) findViewById(R.id.contact_us);
        feedback = (LinearLayout) findViewById(R.id.feed_back);
        setting = (LinearLayout) findViewById(R.id.setting);
        mySchool = (LinearLayout) findViewById(R.id.my_school);
        addSchool = (LinearLayout) findViewById(R.id.add_school);
        useApp = (LinearLayout) findViewById(R.id.use_app);
        logOut = (RelativeLayout) findViewById(R.id.log_out);


        clickListen(home);
        clickListen(myProfile);
        clickListen(events);
        clickListen(favorite);
        clickListen(inbox);
        clickListen(contactUs);
        clickListen(feedback);
        clickListen(setting);
        clickListen(mySchool);
        clickListen(addSchool);
        clickListen(useApp);
        clickListen(logOut);

      ImageView noti = (ImageView) findViewById(R.id.notifications);
      boolean getNoti = true;
      if ( getNoti){
          noti.setVisibility(View.VISIBLE);
          noti.setImageResource(R.drawable.yellow_num);
      }else{
          noti.setVisibility(View.GONE);
      }



    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case android.R.id.home:
            drawerLayout.openDrawer(GravityCompat.START);

            ImageView imageview = (ImageView) findViewById(R.id.back);
            imageview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    drawerLayout.closeDrawers();
                }
            });

            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    public void clickListen(View view){
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = view.getId();
                switch (id) {
                    case R.id.homee: Toast.makeText(MainActivity.this, "home", Toast.LENGTH_SHORT).show(); break;
                    case R.id.my_profile: Toast.makeText(MainActivity.this, "My Profile", Toast.LENGTH_SHORT).show(); break;
                    case R.id.events: Toast.makeText(MainActivity.this, "Events", Toast.LENGTH_SHORT).show(); break;
                    case R.id.favorite: Toast.makeText(MainActivity.this, "Favorites", Toast.LENGTH_SHORT).show(); break;
                    case R.id.inbox: Toast.makeText(MainActivity.this, "Inbox", Toast.LENGTH_SHORT).show(); break;
                    case R.id.contact_us: Toast.makeText(MainActivity.this, "Contact Us", Toast.LENGTH_SHORT).show(); break;
                    case R.id.feed_back: Toast.makeText(MainActivity.this, "Feed Back", Toast.LENGTH_SHORT).show(); break;
                    case R.id.setting: Toast.makeText(MainActivity.this, "Setting", Toast.LENGTH_SHORT).show(); break;
                    case R.id.my_school: Toast.makeText(MainActivity.this, "My schools", Toast.LENGTH_SHORT).show(); break;
                    case R.id.add_school: Toast.makeText(MainActivity.this, "Add a school", Toast.LENGTH_SHORT).show(); break;
                    case R.id.use_app: Toast.makeText(MainActivity.this, "How to use Application", Toast.LENGTH_SHORT).show(); break;
                    case R.id.log_out: Toast.makeText(MainActivity.this, "Log out", Toast.LENGTH_SHORT).show(); break;
                }
                }
        });
    }

}
