package com.example.tanush.maindemo2;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

public class Sponsors extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
//
//    final int[] i = new int[1];
//    ImageView iv1,iv2,iv3,iv4,iv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponsors);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);



        //Kunal's Code



        //JUST CREATED FOR FIVE BUTTONS WE CAN INCREASE AS I DONT KNOW EXACT NO OF SPONSORS!!

//
//            iv1=(ImageView)findViewById(R.id.first);
//            iv2=(ImageView)findViewById(R.id.sec);
//            iv3=(ImageView)findViewById(R.id.third);
//            iv4=(ImageView)findViewById(R.id.forth);
//            iv5=(ImageView)findViewById(R.id.fifth);
//
//            iv1.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    //button execution
//                    i[0] =1;
//                    showdialog();
//                }
//            });
//            iv2.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    //button execution
//                    i[0] =2;
//                    showdialog();
//                }
//            });
//            iv3.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    //button execution
//                    i[0] =3;
//                    showdialog();
//                }
//            });
//            iv4.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    //button execution
//                    i[0] =4;
//                    showdialog();
//                }
//            });
//            iv5.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    //button execution
//                    i[0] =5;
//                    showdialog();
//                }
//            });

        }
        public void showdialog()
        {
//            Dialog dialog=new Dialog(Sponsors.this);
//            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
//            dialog.setContentView(R.layout.dialog_sponsers);
//            TextView spon_title=dialog.findViewById(R.id.spon_title);
//            TextView company_name=dialog.findViewById(R.id.company_name);
//            TextView website=dialog.findViewById(R.id.website);
//            ImageView spon_imag=dialog.findViewById(R.id.spon_imag);
//            if(i[0]==1)
//            {
//                spon_title.setText("TITLE SPONSOR");
//                company_name.setText("PERSISTENT");
//                //spon_imag.setImageResource(R.mipmap.persistent);
//                Glide.with(this).load(getResources().getDrawable(R.mipmap.persistent)).into(spon_imag);
//
//                website.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Uri uri= Uri.parse("https://www.persistent.com/");
//                        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
//                        startActivity(intent);
//                    }
//                });
//            }
//            else if(i[0]==2)
//            {
//                spon_title.setText("ASSOCIATE SPONSOR");
//                company_name.setText("TIETO");
//                spon_imag.setImageResource(R.mipmap.tieto);
//                website.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Uri uri= Uri.parse("https://www.tieto.com/");
//                        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
//                        startActivity(intent);
//                    }
//                });
//            }
//            else if(i[0]==3)
//            {
//                spon_title.setText("EVENT SPONSOR");
//                company_name.setText("GOOGLE");
//                spon_imag.setImageResource(R.mipmap.persistent);
//                website.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Uri uri= Uri.parse("https://www.google.com/");
//                        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
//                        startActivity(intent);
//                    }
//                });
//            }
//            else if(i[0]==4)
//            {
//                spon_title.setText("FOOD PARTNER");
//                company_name.setText("FACEBOOK");
//                spon_imag.setImageResource(R.mipmap.tieto);
//                website.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Uri uri= Uri.parse("https://www.facebook.com/");
//                        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
//                        startActivity(intent);
//                    }
//                });
//            }
//            else if(i[0]==5)
//            {
//                spon_title.setText("CODING SPONSOR");
//                company_name.setText("MICROSOFT");
//                Glide.with(this).load(getResources().getDrawable(R.mipmap.microsoft)).into(spon_imag);
//                //spon_imag.setImageResource(R.mipmap.microsoft);
//                website.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Uri uri= Uri.parse("https://www.microsoft.com/");
//                        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
//                        startActivity(intent);
//                    }
//                });
//            }
//            dialog.show();
//
//     //END OF KUNAL'sCODE
   }
//
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                Intent intent = new Intent(Sponsors.this, settings.class);
                startActivity(intent);
                return true;
            case R.id.bug_report:
                Intent intent1 = new Intent(Sponsors.this, bug_report.class);
                startActivity(intent1);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        switch(id)
        {
            case R.id.nav_events:
                Intent h= new Intent(Sponsors.this,Events.class);
                startActivity(h);
                finish();
                break;
            case R.id.nav_receipts:
                Intent i= new Intent(Sponsors.this,Receipts.class);
                startActivity(i);
                finish();
                break;
            case R.id.nav_sponsors:
                Intent g= new Intent(Sponsors.this,Sponsors.class);
                startActivity(g);
                finish();
                break;
            case R.id.nav_aboutus:
                Intent s= new Intent(Sponsors.this,AboutUs.class);
                startActivity(s);
                finish();
                break;
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
