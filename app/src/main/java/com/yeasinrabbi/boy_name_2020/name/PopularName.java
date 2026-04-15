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

public class PopularName extends AppCompatActivity implements View.OnClickListener {


    private InterstitialAd mInterstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popularname);


        MobileAds.initialize(this, initializationStatus -> {
        });


        loadInterstitialAd();



        
        LinearLayout Backlayout = findViewById(R.id.BackLayaout);


        Backlayout.setOnClickListener(v -> finish());



       







        LinearLayout popularboyname = findViewById(R.id.popularboyname);
        LinearLayout populargirlanme = findViewById(R.id.populargirlanme);


        popularboyname.setOnClickListener(this);
        populargirlanme.setOnClickListener(this);





    }

    @Override
    public void onClick(View view) {


        if (view.getId()==R.id.popularboyname){


            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {


                        Intent intent = new Intent(PopularName.this, NamecontentActivity.class);
                        intent.putExtra("name", "popularboyname");
                        startActivity(intent);





                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            }
            else {



                Intent intent = new Intent(PopularName.this, NamecontentActivity.class);
                intent.putExtra("name", "popularboyname");
                startActivity(intent);



            }




        }

        if (view.getId()==R.id.populargirlanme){



            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {



                        Intent intent = new Intent(PopularName.this, NamecontentActivity.class);
                        intent.putExtra("name", "populargirlanme");
                        startActivity(intent);



                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            }
            else {




                Intent intent = new Intent(PopularName.this, NamecontentActivity.class);
                intent.putExtra("name", "populargirlanme");
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