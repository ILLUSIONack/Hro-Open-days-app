package project.pb;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import project.pb.fragments.ContactPage;
import project.pb.fragments.HomeScreenFragment;
import project.pb.fragments.SchoolInformationFragment;
import project.pb.fragments.SettingsFragment;
import project.pb.fragments.VeelGesteldeVragenFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

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
                        new SchoolInformationFragment()).commit();
                break;
            case R.id.nav_askedquestions:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new VeelGesteldeVragenFragment()).commit();
                break;
            case R.id.nav_contact_page:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new ContactPage()).commit();
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

}
