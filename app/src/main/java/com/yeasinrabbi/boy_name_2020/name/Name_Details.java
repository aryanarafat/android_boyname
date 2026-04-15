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


public class Name_Details extends AppCompatActivity implements View.OnClickListener {


    private InterstitialAd mInterstitialAd;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_details);


        MobileAds.initialize(this, initializationStatus -> {
        });



        LinearLayout NamerPovab = findViewById(R.id.NamerPovab);
        LinearLayout NameKoronerSomoy = findViewById(R.id.NameKoronerSomoy);
        LinearLayout UttomName = findViewById(R.id.UttomName);
        LinearLayout HaramName = findViewById(R.id.HaramName);
        LinearLayout MakruhName = findViewById(R.id.MakruhName);
        LinearLayout SHirkiName = findViewById(R.id.SHirkiName);
        LinearLayout NObiName = findViewById(R.id.NObiName);
        LinearLayout SahbahderName = findViewById(R.id.SahbahderName);


        NamerPovab.setOnClickListener(this);
        NameKoronerSomoy.setOnClickListener(this);
        UttomName.setOnClickListener(this);
        HaramName.setOnClickListener(this);
        MakruhName.setOnClickListener(this);
        SHirkiName.setOnClickListener(this);
        NObiName.setOnClickListener(this);
        SahbahderName.setOnClickListener(this);



        LinearLayout Backlayout = findViewById(R.id.BackLayaout);


        Backlayout.setOnClickListener(v -> finish());

        loadInterstitialAd();


    }

    @Override
    public void onClick(View v) {


        if (v.getId()==R.id.NamerPovab){


            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {

                        Intent intent = new Intent(Name_Details.this, NamecontentActivity.class);
                        intent.putExtra("name", "NamerPovab");
                        startActivity(intent);




                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            }
            else {


                Intent intent = new Intent(Name_Details.this, NamecontentActivity.class);
                intent.putExtra("name", "NamerPovab");
                startActivity(intent);


            }




        }



        if (v.getId()==R.id.NameKoronerSomoy){


            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {



                        Intent intent = new Intent(Name_Details.this, NamecontentActivity.class);
                        intent.putExtra("name", "NameKoronerSomoy");
                        startActivity(intent);



                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            }
            else {




                Intent intent = new Intent(Name_Details.this, NamecontentActivity.class);
                intent.putExtra("name", "NameKoronerSomoy");
                startActivity(intent);



            }




        }

        if (v.getId()==R.id.UttomName){



            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {


                        Intent intent = new Intent(Name_Details.this, NamecontentActivity.class);
                        intent.putExtra("name", "UttomName");
                        startActivity(intent);



                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            }
            else {



                Intent intent = new Intent(Name_Details.this, NamecontentActivity.class);
                intent.putExtra("name", "UttomName");
                startActivity(intent);


            }




        }

        if (v.getId()==R.id.HaramName){



            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {

                        Intent intent = new Intent(Name_Details.this, NamecontentActivity.class);
                        intent.putExtra("name", "HaramName");
                        startActivity(intent);



                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            }
            else {


                Intent intent = new Intent(Name_Details.this, NamecontentActivity.class);
                intent.putExtra("name", "HaramName");
                startActivity(intent);

            }




        }

        if (v.getId()==R.id.MakruhName){


            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {



                        Intent intent = new Intent(Name_Details.this, NamecontentActivity.class);
                        intent.putExtra("name", "MakruhName");
                        startActivity(intent);



                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            }
            else {




                Intent intent = new Intent(Name_Details.this, NamecontentActivity.class);
                intent.putExtra("name", "MakruhName");
                startActivity(intent);



            }




        }

        if (v.getId()==R.id.SHirkiName){



            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {


                        Intent intent = new Intent(Name_Details.this, NamecontentActivity.class);
                        intent.putExtra("name", "SHirkiName");
                        startActivity(intent);



                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            }
            else {



                Intent intent = new Intent(Name_Details.this, NamecontentActivity.class);
                intent.putExtra("name", "SHirkiName");
                startActivity(intent);



            }




        }

        if (v.getId()==R.id.NObiName){


            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {


                        Intent intent = new Intent(Name_Details.this, NamecontentActivity.class);
                        intent.putExtra("name", "NObiName");
                        startActivity(intent);



                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            }
            else {



                Intent intent = new Intent(Name_Details.this, NamecontentActivity.class);
                intent.putExtra("name", "NObiName");
                startActivity(intent);

            }




        }

        if (v.getId()==R.id.SahbahderName){




            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {

                        Intent intent = new Intent(Name_Details.this, NamecontentActivity.class);
                        intent.putExtra("name", "SahbahderName");
                        startActivity(intent);

                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            }
            else {


                Intent intent = new Intent(Name_Details.this, NamecontentActivity.class);
                intent.putExtra("name", "SahbahderName");
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