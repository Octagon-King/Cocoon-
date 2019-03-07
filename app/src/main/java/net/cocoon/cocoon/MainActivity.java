package net.cocoon.cocoon;




import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


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
                    new EventsFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_events);
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
            case R.id.nav_facebook:
                Intent facebookIntent = new Intent(Intent.ACTION_VIEW);
                String facebookUrl = getFacebookPageURL(this);
                facebookIntent.setData(Uri.parse(facebookUrl));
                startActivity(facebookIntent);
                break;
            case R.id.nav_instagram:
             Uri uri = Uri.parse("http://instagram.com/_u/cocoon_official");
             Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);
             likeIng.setPackage("com.instagram.android");

             try {
                 startActivity(likeIng);
             } catch (ActivityNotFoundException e){
                 startActivity(new Intent(Intent.ACTION_VIEW,
                         Uri.parse("http://instagram.com/cocoon_official")));
             }
             break;

            case R.id.nav_twitter:
                Intent intent = null;
                try {
                    this.getPackageManager().getPackageInfo("com.twitter.android", 0);
                    intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("twitter://user?user_id=323222280"));
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                } catch (Exception e) {
                    intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://twitter.com/cocoon_official/"));
                }
                this.startActivity(intent);
                break;

            case R.id.nav_youtube:
                Intent intenty = new Intent(Intent.ACTION_VIEW);
                intenty.setData(Uri.parse("http://www.youtube.com/user/cocoonrecordings"));
                startActivity(intenty);
                break;
        }



        drawer.closeDrawer(GravityCompat.START);
        return true;
    }




    public static String FACEBOOK_URL = "https://www.facebook.com/COCOON.OFFICIAL/";
    public static String FACEBOOK_PAGE_ID = "132954121040";

    public String getFacebookPageURL(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            int versionCode = packageManager.getPackageInfo("com.facebook.katana", 0).versionCode;
            if (versionCode >= 3002850) {
                return "fb://facewebmodal/f?href=" + FACEBOOK_URL;
            } else {
                return "fb://page/" + FACEBOOK_PAGE_ID;
            }
        } catch (PackageManager.NameNotFoundException e) {
            return FACEBOOK_URL;
        }

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