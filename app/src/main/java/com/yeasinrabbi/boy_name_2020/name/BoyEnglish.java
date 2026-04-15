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


public class BoyEnglish extends AppCompatActivity implements View.OnClickListener {


    private InterstitialAd mInterstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.boyenglish);


        MobileAds.initialize(this, initializationStatus -> {
        });


        LinearLayout Backlayout = findViewById(R.id.BackLayaout);


        Backlayout.setOnClickListener(v -> finish());




        LinearLayout boyenglish1 = findViewById(R.id.boyenglish1);
        LinearLayout boyenglish2 = findViewById(R.id.boyenglish2);
        LinearLayout boyenglish3 = findViewById(R.id.boyenglish3);



        boyenglish1.setOnClickListener(this);
        boyenglish2.setOnClickListener(this);
        boyenglish3.setOnClickListener(this);

        loadInterstitialAd();



    }

    @Override
    public void onClick(View view) {


        if (view.getId()==R.id.boyenglish1){


            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {


                        Intent intent = new Intent(BoyEnglish.this, NamecontentActivity.class);
                        intent.putExtra("name", "boyenglish1");
                        startActivity(intent);





                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            }
            else {



                Intent intent = new Intent(BoyEnglish.this, NamecontentActivity.class);
                intent.putExtra("name", "boyenglish1");
                startActivity(intent);



            }




        }

        if (view.getId()==R.id.boyenglish2){



            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {



                        Intent intent = new Intent(BoyEnglish.this, NamecontentActivity.class);
                        intent.putExtra("name", "boyenglish2");
                        startActivity(intent);



                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            }
            else {




                Intent intent = new Intent(BoyEnglish.this, NamecontentActivity.class);
                intent.putExtra("name", "boyenglish2");
                startActivity(intent);



            }




        }

        if (view.getId()==R.id.boyenglish3){



            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {



                        Intent intent = new Intent(BoyEnglish.this, NamecontentActivity.class);
                        intent.putExtra("name", "boyenglish3");
                        startActivity(intent);




                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            }
            else {




                Intent intent = new Intent(BoyEnglish.this, NamecontentActivity.class);
                intent.putExtra("name", "boyenglish3");
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

        if (mInterstitialAd != null) {
            mInterstitialAd.show(this);
        } else {
            Toast.makeText(this, "Ad did not load", Toast.LENGTH_SHORT).show();

        }
    }
}