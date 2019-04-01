package project.pb;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.EditText;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import project.pb.fragments.ContactPageFragment;
import project.pb.fragments.FAQFragment;
import project.pb.fragments.HomeScreenFragment;
import project.pb.fragments.SettingsFragment;
import project.pb.fragments.SettlementFragment;
import project.pb.fragments.StudyPageFragment;

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

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new HomeScreenFragment()).commit();

        final EditText your_name        = (EditText) findViewById(R.id.textName);
        final EditText your_email       = (EditText) findViewById(R.id.textEmail);
        final EditText your_subject     = (EditText) findViewById(R.id.textSubject);
        final EditText your_message     = (EditText) findViewById(R.id.textMessage);

    }

    private boolean isValidEmail(String email) {
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
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

}