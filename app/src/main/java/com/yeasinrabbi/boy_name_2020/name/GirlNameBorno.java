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
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.yeasinrabbi.boy_name_2020.R;
import com.yeasinrabbi.boy_name_2020.ads.Ads;


public class GirlNameBorno extends AppCompatActivity implements View.OnClickListener {




    private InterstitialAd mInterstitialAd;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girl_name_borno);

        loadInterstitialAd();

        LinearLayout GSoreoDiyaName = findViewById(R.id.GSoreoDiyaName);
        LinearLayout GNoDiyaName = findViewById(R.id.GNoDiyaName);
        LinearLayout GFoDiyeName = findViewById(R.id.GFoDiyeName);
        LinearLayout GModiyaName = findViewById(R.id.GModiyaName);
        LinearLayout GToDiyeName = findViewById(R.id.GToDiyeName);
        LinearLayout BacaiKoraMeyederName = findViewById(R.id.BacaiKoraMeyederName);
        LinearLayout RoDiyaName = findViewById(R.id.RoDiyaName);
        LinearLayout SAnDShoDIyaName = findViewById(R.id.SAnDShoDIyaName);
        LinearLayout JDiyaName = findViewById(R.id.JDiyaName);
 
        GSoreoDiyaName.setOnClickListener(this);
        GNoDiyaName.setOnClickListener(this);
        GFoDiyeName.setOnClickListener(this);
        GModiyaName.setOnClickListener(this);
        GToDiyeName.setOnClickListener(this);
        BacaiKoraMeyederName.setOnClickListener(this);
        RoDiyaName.setOnClickListener(this);
        SAnDShoDIyaName.setOnClickListener(this);
        JDiyaName.setOnClickListener(this);


        LinearLayout Backlayout = findViewById(R.id.BackLayaout);


        Backlayout.setOnClickListener(v -> finish());



    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.GSoreoDiyaName){

            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {

                        Intent intent = new Intent(GirlNameBorno.this, NamecontentActivity.class);
                        intent.putExtra("name", "GSoreoDiyaName");
                        startActivity(intent);



                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            }
            else {


                Intent intent = new Intent(GirlNameBorno.this, NamecontentActivity.class);
                intent.putExtra("name", "GSoreoDiyaName");
                startActivity(intent);

            }





        }

        if (v.getId()==R.id.GNoDiyaName){


            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {



                        Intent intent = new Intent(GirlNameBorno.this, NamecontentActivity.class);
                        intent.putExtra("name", "GNoDiyaName");
                        startActivity(intent);

                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            }
            else {




                Intent intent = new Intent(GirlNameBorno.this, NamecontentActivity.class);
                intent.putExtra("name", "GNoDiyaName");
                startActivity(intent);


            }



        }

        if (v.getId()==R.id.GFoDiyeName){


            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {


                        Intent intent = new Intent(GirlNameBorno.this, NamecontentActivity.class);
                        intent.putExtra("name", "GFoDiyeName");
                        startActivity(intent);


                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            }
            else {



                Intent intent = new Intent(GirlNameBorno.this, NamecontentActivity.class);
                intent.putExtra("name", "GFoDiyeName");
                startActivity(intent);


            }



        }

        if (v.getId()==R.id.GModiyaName){


            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {


                        Intent intent = new Intent(GirlNameBorno.this, NamecontentActivity.class);
                        intent.putExtra("name", "GModiyaName");
                        startActivity(intent);



                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            }
            else {



                Intent intent = new Intent(GirlNameBorno.this, NamecontentActivity.class);
                intent.putExtra("name", "GModiyaName");
                startActivity(intent);

            }


        }

        if (v.getId()==R.id.GToDiyeName){


            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {


                        Intent intent = new Intent(GirlNameBorno.this, NamecontentActivity.class);
                        intent.putExtra("name", "GToDiyeName");
                        startActivity(intent);


                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            }
            else {



                Intent intent = new Intent(GirlNameBorno.this, NamecontentActivity.class);
                intent.putExtra("name", "GToDiyeName");
                startActivity(intent);


            }



        }

        if (v.getId()==R.id.BacaiKoraMeyederName){


            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {




                        Intent intent = new Intent(GirlNameBorno.this, NamecontentActivity.class);
                        intent.putExtra("name", "BacaiKoraMeyederName");
                        startActivity(intent);


                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            }
            else {





                Intent intent = new Intent(GirlNameBorno.this, NamecontentActivity.class);
                intent.putExtra("name", "BacaiKoraMeyederName");
                startActivity(intent);

            }

        }

        if (v.getId()==R.id.RoDiyaName){


            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {

                        Intent intent = new Intent(GirlNameBorno.this, NamecontentActivity.class);
                        intent.putExtra("name", "RoDiyaName");
                        startActivity(intent);



                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            }
            else {


                Intent intent = new Intent(GirlNameBorno.this, NamecontentActivity.class);
                intent.putExtra("name", "RoDiyaName");
                startActivity(intent);

            }




        }

        if (v.getId()==R.id.SAnDShoDIyaName){


            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {



                        Intent intent = new Intent(GirlNameBorno.this, NamecontentActivity.class);
                        intent.putExtra("name", "SAnDShoDIyaName");
                        startActivity(intent);


                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            }
            else {




                Intent intent = new Intent(GirlNameBorno.this, NamecontentActivity.class);
                intent.putExtra("name", "SAnDShoDIyaName");
                startActivity(intent);


            }


        }

        if (v.getId()==R.id.JDiyaName){



            if (mInterstitialAd != null) {
                showInterstitial();
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {


                        Intent intent = new Intent(GirlNameBorno.this, NamecontentActivity.class);
                        intent.putExtra("name", "JDiyaName");
                        startActivity(intent);



                        mInterstitialAd = null;
                        loadInterstitialAd();

                    }


                });
            }
            else {



                Intent intent = new Intent(GirlNameBorno.this, NamecontentActivity.class);
                intent.putExtra("name", "JDiyaName");
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