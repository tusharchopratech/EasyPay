package co.easy.easypay.activities;

import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import co.easy.easypay.R;
import co.easy.easypay.fragments.BillerFragment;
import co.easy.easypay.fragments.PaymentFragment;
import co.easy.easypay.fragments.viewpagerfragments.AdhocFragment;
import co.easy.easypay.fragments.viewpagerfragments.PaymentsDueFragment;
import co.easy.easypay.fragments.viewpagerfragments.PaymentsMadeFragment;

public class NavigationDrawerActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener,
        PaymentFragment.OnFragmentInteractionListener, BillerFragment.OnFragmentInteractionListener, AdhocFragment.OnFragmentInteractionListener,
        PaymentsDueFragment.OnFragmentInteractionListener, PaymentsMadeFragment.OnFragmentInteractionListener {

    private static final String TAG = "#NavDrawerActivity";
    TextView textViewTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarHomeScreen);
        setSupportActionBar(toolbar);

        textViewTitle = (TextView) findViewById(R.id.textViewHeadingId);
        Typeface typeFace = Typeface.createFromAsset(getAssets(), "fonts/big_noodle_titling.ttf");
        textViewTitle.setTypeface(typeFace);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        setMainFragment(new PaymentFragment());


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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_biller) {
            setMainFragment(new BillerFragment());
        } else if (id == R.id.nav_paymet) {
            setMainFragment(new PaymentFragment());

        } else if (id == R.id.nav_help) {
            Toast.makeText(NavigationDrawerActivity.this, "Help Clicked", Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_settings) {
            Toast.makeText(NavigationDrawerActivity.this, "Settings Clicked", Toast.LENGTH_LONG).show();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void setMainFragment(Fragment fragment) {

        if (fragment != null) {

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.main_container, fragment)
                    .disallowAddToBackStack()
                    .commit();

            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            if (drawer.isDrawerOpen(GravityCompat.START)) {
                drawer.closeDrawer(GravityCompat.START);
            }
        } else {
            Log.v(TAG, "Error in creating fragment");
        }

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
