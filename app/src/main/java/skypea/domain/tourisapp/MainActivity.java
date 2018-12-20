package skypea.domain.tourisapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener  {

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
                    new FragmentHome()).commit();
            navigationView.setCheckedItem(R.id.home);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new FragmentHome()).commit();
                break;
            case R.id.nav_camera:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new FragmentSatu()).commit();
                break;
            case R.id.nav_gallery:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new FragmentDua()).commit();
                break;
            case R.id.nav_slideshow:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new FragmentTiga()).commit();
                break;
            case R.id.nav_manage:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new FragmentEmpat()).commit();
                break;
            case R.id.nav_gas:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new FragmentTujuh()).commit();
                break;
            case R.id.nav_shop:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new FragmentDelapan()).commit();

//            case R.id.nav_share:
//                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
//                        new FragmentLima()).commit();
//                break;

            case R.id.nav_send:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new FragmentEnam()).commit();
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
