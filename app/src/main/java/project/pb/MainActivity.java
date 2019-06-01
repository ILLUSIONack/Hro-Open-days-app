package project.pb;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import java.util.Timer;
import java.util.TimerTask;

import project.pb.fragments.ContactPageFragment;
import project.pb.fragments.FAQFragment;
import project.pb.fragments.HomeScreenFragment;
import project.pb.fragments.SettingsFragment;
import project.pb.fragments.SettlementFragment;
import project.pb.fragments.StudyPageFragment;
import project.pb.notifications.NotificationCreation;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeChannels();
        //preLoadNotification(); <- Notification TODO
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new HomeScreenFragment()).commit();

        navigationView.setCheckedItem(R.id.nav_home_screen);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
//uuhfghamzaisde beste in deze wereld en hij gaat zeker stuk maken/
    //in de ring enzo enzo yeye wtf dude whatsup met jou
    //dit stukje code is een tering slechte stuk geschreven door hamza
    //hij is shit en weet niet hoe hij moet coderen dus hij moet gwn basicly stoppen
    //met wtf hij zit te doen etc etc etc en dat is gwn zo dus stop maar
    /**
     * Fetches what menu id is being pressed and executes the clicked item
     * @param item
     * @return
     */
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.nav_home_screen:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new HomeScreenFragment()).commit();
                break;
            case R.id.nav_studies:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                       new StudyPageFragment()).commit();
                break;
            case R.id.nav_settlement:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new SettlementFragment()).commit();
                break;
            case R.id.nav_askedquestions:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new FAQFragment()).commit();
                break;
            case R.id.nav_contact_page:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new ContactPageFragment()).commit();
                break;
            case R.id.nav_settings:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new SettingsFragment()).commit();
                break;
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void initializeChannels() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel notificationChannel =
                    new NotificationChannel("main_channel", "main_channel",
                            NotificationManager.IMPORTANCE_HIGH);
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(notificationChannel);

        }
    }

}