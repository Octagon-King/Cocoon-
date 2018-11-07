package net.cocoon.cocoon;




import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new NewsletterFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_newsletter);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_newsletter:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new NewsletterFragment()).commit();
                break;
            case R.id.nav_events:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new EventsFragment()).commit();
                break;
            case R.id.nav_ibiza:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new IbizaFragment()).commit();
                break;
            case R.id.nav_sven:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new SvenFragment()).commit();
                break;
            case R.id.nav_shop:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new ShopFragment()).commit();
                break;
            case R.id.nav_dj_app:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new DjAppFragment()).commit();
                break;
            case R.id.nav_flash:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new FlashFragment()).commit();
                break;

        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}