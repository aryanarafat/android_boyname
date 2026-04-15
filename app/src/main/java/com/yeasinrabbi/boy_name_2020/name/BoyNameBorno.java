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

public class BoyNameBorno extends AppCompatActivity implements View.OnClickListener {


    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boy_name_borno);




        MobileAds.initialize(this, initializationStatus -> {
        });


        LinearLayout CSoreaDiyaName = findViewById(R.id.CSoreaDiyaName);
        LinearLayout CFodiyaName = findViewById(R.id.CFodiyaName);
        LinearLayout CMoDIyaName = findViewById(R.id.CMoDIyaName);
        LinearLayout CRodiyaName = findViewById(R.id.CRodiyaName);


        CSoreaDiyaName.setOnClickListener(this);
        CFodiyaName.setOnClickListener(this);
        CMoDIyaName.setOnClickListener(this);
        CRodiyaName.setOnClickListener(this);





        LinearLayout Backlayout = findViewById(R.id.BackLayaout);


        Backlayout.setOnClickListener(v -> finish());


        loadInterstitialAd();

    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.CSoreaDiyaName) {


            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {


                        Intent intent = new Intent(BoyNameBorno.this, NamecontentActivity.class);
                        intent.putExtra("name", "CSoreaDiyaName");
                        startActivity(intent);


                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            } else {


                Intent intent = new Intent(BoyNameBorno.this, NamecontentActivity.class);
                intent.putExtra("name", "CSoreaDiyaName");
                startActivity(intent);


            }


        }
        if (v.getId() == R.id.CFodiyaName) {


            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {


                        Intent intent = new Intent(BoyNameBorno.this, NamecontentActivity.class);
                        intent.putExtra("name", "CFodiyaName");
                        startActivity(intent);


                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            } else {


                Intent intent = new Intent(BoyNameBorno.this, NamecontentActivity.class);
                intent.putExtra("name", "CFodiyaName");
                startActivity(intent);


            }





        }
        if (v.getId() == R.id.CMoDIyaName) {


            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {


                        Intent intent = new Intent(BoyNameBorno.this, NamecontentActivity.class);
                        intent.putExtra("name", "CMoDIyaName");
                        startActivity(intent);


                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            } else {


                Intent intent = new Intent(BoyNameBorno.this, NamecontentActivity.class);
                intent.putExtra("name", "CMoDIyaName");
                startActivity(intent);


            }





        }
        if (v.getId() == R.id.CRodiyaName) {


            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {


                        Intent intent = new Intent(BoyNameBorno.this, NamecontentActivity.class);
                        intent.putExtra("name", "CRodiyaName");
                        startActivity(intent);


                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            } else {


                Intent intent = new Intent(BoyNameBorno.this, NamecontentActivity.class);
                intent.putExtra("name", "CRodiyaName");
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