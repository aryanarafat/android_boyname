package com.yeasinrabbi.boy_name_2020.name;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.yeasinrabbi.boy_name_2020.R;
import com.yeasinrabbi.boy_name_2020.ads.Ads;

public class GirlNamePorbo extends AppCompatActivity implements View.OnClickListener {


    private InterstitialAd mInterstitialAd;

    public LinearLayout Gporbo1;
    LinearLayout Gporbo2;
    LinearLayout Gporbo3;
    LinearLayout Gporbo4;
    LinearLayout Gporbo5;
    LinearLayout Gporbo6;
    LinearLayout Gporbo7;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girl_name_porbo);



        MobileAds.initialize(this, initializationStatus -> {
        });



        loadInterstitialAd();





        Gporbo1 = findViewById(R.id.girlPorbo1);
        Gporbo2 = findViewById(R.id.girlPorbo2);
        Gporbo3 = findViewById(R.id.girlPorbo3);
        Gporbo4 = findViewById(R.id.girlPorbo4);
        Gporbo5 = findViewById(R.id.girlPorbo5);
        Gporbo6 = findViewById(R.id.girlPorbo6);
        Gporbo7 = findViewById(R.id.girlPorbo7);


        Gporbo1.setOnClickListener(this);
        Gporbo2.setOnClickListener(this);
        Gporbo3.setOnClickListener(this);
        Gporbo4.setOnClickListener(this);
        Gporbo5.setOnClickListener(this);
        Gporbo6.setOnClickListener(this);
        Gporbo7.setOnClickListener(this);


        LinearLayout Backlayout = findViewById(R.id.BackLayaout);


        Backlayout.setOnClickListener(v -> finish());


    }




    @Override
    public void onClick(View v) {


        if (v.getId() == R.id.girlPorbo1) {


            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {


                        Intent intent = new Intent(GirlNamePorbo.this, NamecontentActivity.class);
                        intent.putExtra("name", "g1");
                        startActivity(intent);


                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            } else {


                Intent intent = new Intent(GirlNamePorbo.this, NamecontentActivity.class);
                intent.putExtra("name", "g1");
                startActivity(intent);

            }


        }

        if (v.getId() == R.id.girlPorbo2) {


            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {


                        Intent intent = new Intent(GirlNamePorbo.this, NamecontentActivity.class);
                        intent.putExtra("name", "g2");
                        startActivity(intent);


                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            } else {


                Intent intent = new Intent(GirlNamePorbo.this, NamecontentActivity.class);
                intent.putExtra("name", "g2");
                startActivity(intent);


            }


        }


        if (v.getId() == R.id.girlPorbo3) {


            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {


                        Intent intent = new Intent(GirlNamePorbo.this, NamecontentActivity.class);
                        intent.putExtra("name", "g3");
                        startActivity(intent);


                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            } else {


                Intent intent = new Intent(GirlNamePorbo.this, NamecontentActivity.class);
                intent.putExtra("name", "g3");
                startActivity(intent);


            }


        }


        if (v.getId() == R.id.girlPorbo4) {


            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {

                        Intent intent = new Intent(GirlNamePorbo.this, NamecontentActivity.class);
                        intent.putExtra("name", "g4");
                        startActivity(intent);

                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            } else {

                Intent intent = new Intent(GirlNamePorbo.this, NamecontentActivity.class);
                intent.putExtra("name", "g4");
                startActivity(intent);

            }


        }


        if (v.getId() == R.id.girlPorbo5) {


            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {


                        Intent intent = new Intent(GirlNamePorbo.this, NamecontentActivity.class);
                        intent.putExtra("name", "g5");
                        startActivity(intent);


                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            } else {


                Intent intent = new Intent(GirlNamePorbo.this, NamecontentActivity.class);
                intent.putExtra("name", "g5");
                startActivity(intent);


            }


        }


        if (v.getId() == R.id.girlPorbo6) {


            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {


                        Intent intent = new Intent(GirlNamePorbo.this, NamecontentActivity.class);
                        intent.putExtra("name", "g6");
                        startActivity(intent);


                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            } else {


                Intent intent = new Intent(GirlNamePorbo.this, NamecontentActivity.class);
                intent.putExtra("name", "g6");
                startActivity(intent);


            }


        }


        if (v.getId() == R.id.girlPorbo7) {

            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {


                        Intent intent = new Intent(GirlNamePorbo.this, NamecontentActivity.class);
                        intent.putExtra("name", "g7");
                        startActivity(intent);


                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            } else {


                Intent intent = new Intent(GirlNamePorbo.this, NamecontentActivity.class);
                intent.putExtra("name", "g7");
                startActivity(intent);

            }


        }


    }


    public void loadInterstitialAd() {
        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(this, Ads.interstitial, adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        mInterstitialAd = interstitialAd;

                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        mInterstitialAd = null;


                    }


                });


    }

    private void showInterstitial() {
        // Show the ad if it"s ready. Otherwise toast and reload the ad.
        if (mInterstitialAd != null) {
            mInterstitialAd.show(this);
        } else {
            Toast.makeText(this, "Ad did not load", Toast.LENGTH_SHORT).show();

        }
    }


}