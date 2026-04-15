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

public class BoyNamePorbo extends AppCompatActivity implements View.OnClickListener {


    private InterstitialAd mInterstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boy_name_porbo);


        MobileAds.initialize(this, initializationStatus -> {
        });


        loadInterstitialAd();


        LinearLayout Backlayout = findViewById(R.id.BackLayaout);


        Backlayout.setOnClickListener(v -> finish());





        LinearLayout Porbo1 = findViewById(R.id.boyPorbo1);
        LinearLayout Porbo2 = findViewById(R.id.boyPorbo2);
        LinearLayout Porbo3 = findViewById(R.id.boyPorbo3);
        LinearLayout Porbo4 = findViewById(R.id.boyPorbo4);
        LinearLayout Porbo5 = findViewById(R.id.boyPorbo5);
        LinearLayout Porbo6 = findViewById(R.id.boyPorbo6);
        LinearLayout Porbo7 = findViewById(R.id.boyPorbo7);


        Porbo1.setOnClickListener(this);
        Porbo2.setOnClickListener(this);
        Porbo3.setOnClickListener(this);
        Porbo4.setOnClickListener(this);
        Porbo5.setOnClickListener(this);
        Porbo6.setOnClickListener(this);
        Porbo7.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {


        if (view.getId()==R.id.boyPorbo1){


            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {


                        Intent intent = new Intent(BoyNamePorbo.this, NamecontentActivity.class);
                        intent.putExtra("name", "boyPorbo1");
                        startActivity(intent);





                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            }
            else {



                Intent intent = new Intent(BoyNamePorbo.this, NamecontentActivity.class);
                intent.putExtra("name", "boyPorbo1");
                startActivity(intent);



            }




        }

        if (view.getId()==R.id.boyPorbo2){



            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {



                        Intent intent = new Intent(BoyNamePorbo.this, NamecontentActivity.class);
                        intent.putExtra("name", "boyPorbo2");
                        startActivity(intent);



                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            }
            else {




                Intent intent = new Intent(BoyNamePorbo.this, NamecontentActivity.class);
                intent.putExtra("name", "boyPorbo2");
                startActivity(intent);



            }




        }

        if (view.getId()==R.id.boyPorbo3){



            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {



                        Intent intent = new Intent(BoyNamePorbo.this, NamecontentActivity.class);
                        intent.putExtra("name", "boyPorbo3");
                        startActivity(intent);




                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            }
            else {




                Intent intent = new Intent(BoyNamePorbo.this, NamecontentActivity.class);
                intent.putExtra("name", "boyPorbo3");
                startActivity(intent);



            }



        }

        if (view.getId()==R.id.boyPorbo4){


            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {


                        Intent intent = new Intent(BoyNamePorbo.this, NamecontentActivity.class);
                        intent.putExtra("name", "boyPorbo4");
                        startActivity(intent);




                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            }
            else {



                Intent intent = new Intent(BoyNamePorbo.this, NamecontentActivity.class);
                intent.putExtra("name", "boyPorbo4");
                startActivity(intent);



            }




        }

        if (view.getId()==R.id.boyPorbo5){



            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {


                        Intent intent = new Intent(BoyNamePorbo.this, NamecontentActivity.class);
                        intent.putExtra("name", "boyPorbo5");
                        startActivity(intent);



                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            }
            else {



                Intent intent = new Intent(BoyNamePorbo.this, NamecontentActivity.class);
                intent.putExtra("name", "boyPorbo5");
                startActivity(intent);



            }





        }

        if (view.getId()==R.id.boyPorbo6){



            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {



                        Intent intent = new Intent(BoyNamePorbo.this, NamecontentActivity.class);
                        intent.putExtra("name", "boyPorbo6");
                        startActivity(intent);



                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            }
            else {




                Intent intent = new Intent(BoyNamePorbo.this, NamecontentActivity.class);
                intent.putExtra("name", "boyPorbo6");
                startActivity(intent);



            }





        }

        if (view.getId()==R.id.boyPorbo7){


            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {


                        Intent intent = new Intent(BoyNamePorbo.this, NamecontentActivity.class);
                        intent.putExtra("name", "boyPorbo7");
                        startActivity(intent);




                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            }
            else {



                Intent intent = new Intent(BoyNamePorbo.this, NamecontentActivity.class);
                intent.putExtra("name", "boyPorbo7");
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