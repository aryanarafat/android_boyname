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

public class OtherName extends AppCompatActivity implements View.OnClickListener {


    private InterstitialAd mInterstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.othername);


        MobileAds.initialize(this, initializationStatus -> {
        });


        loadInterstitialAd();




        
        LinearLayout Backlayout = findViewById(R.id.BackLayaout);


        Backlayout.setOnClickListener(v -> finish());



       





        LinearLayout mobilasahabi = findViewById(R.id.mobilasahabi);
        LinearLayout bodorname1 = findViewById(R.id.bodorname1);
        LinearLayout bodorname2 = findViewById(R.id.bodorname2);
        LinearLayout bodorname3 = findViewById(R.id.bodorname3);
        LinearLayout narisahabi = findViewById(R.id.narisahabi);

        mobilasahabi.setOnClickListener(this);
        bodorname1.setOnClickListener(this);
        bodorname2.setOnClickListener(this);
        bodorname3.setOnClickListener(this);
        narisahabi.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {


        if (view.getId()==R.id.mobilasahabi){


            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {


                        Intent intent = new Intent(OtherName.this, NamecontentActivity.class);
                        intent.putExtra("name", "mobilasahabi");
                        startActivity(intent);





                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            }
            else {



                Intent intent = new Intent(OtherName.this, NamecontentActivity.class);
                intent.putExtra("name", "mobilasahabi");
                startActivity(intent);



            }




        }

        if (view.getId()==R.id.bodorname1){



            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {



                        Intent intent = new Intent(OtherName.this, NamecontentActivity.class);
                        intent.putExtra("name", "bodorname1");
                        startActivity(intent);



                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            }
            else {




                Intent intent = new Intent(OtherName.this, NamecontentActivity.class);
                intent.putExtra("name", "bodorname1");
                startActivity(intent);



            }




        }

        if (view.getId()==R.id.bodorname2){



            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {



                        Intent intent = new Intent(OtherName.this, NamecontentActivity.class);
                        intent.putExtra("name", "bodorname2");
                        startActivity(intent);




                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            }
            else {




                Intent intent = new Intent(OtherName.this, NamecontentActivity.class);
                intent.putExtra("name", "bodorname2");
                startActivity(intent);



            }



        }

        if (view.getId()==R.id.bodorname3){


            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {


                        Intent intent = new Intent(OtherName.this, NamecontentActivity.class);
                        intent.putExtra("name", "bodorname3");
                        startActivity(intent);




                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            }
            else {



                Intent intent = new Intent(OtherName.this, NamecontentActivity.class);
                intent.putExtra("name", "bodorname3");
                startActivity(intent);



            }




        }

        if (view.getId()==R.id.narisahabi){



            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {


                        Intent intent = new Intent(OtherName.this, NamecontentActivity.class);
                        intent.putExtra("name", "narisahabi");
                        startActivity(intent);



                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            }
            else {



                Intent intent = new Intent(OtherName.this, NamecontentActivity.class);
                intent.putExtra("name", "narisahabi");
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