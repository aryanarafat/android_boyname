package com.yeasinrabbi.boy_name_2020.name;

import android.annotation.SuppressLint;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.yeasinrabbi.boy_name_2020.R;
import com.yeasinrabbi.boy_name_2020.SketchwareUtil;


public class NamecontentActivity extends AppCompatActivity {
    private SharedPreferences f;
    @SuppressLint("StaticFieldLeak")
    private static LinearLayout linear_formatting;
    private SeekBar seekbar1;
    private SeekBar seekbar2;
    private TextView textview1;
    private TextView textview2;
    private double num = 0.0d;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);


        MobileAds.initialize(this, initializationStatus -> {
        });


        AdView mAdView = findViewById(R.id.s_ad_view);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        linear_formatting = findViewById(R.id.linear_formatting);
        ImageView imageview_back =   findViewById(R.id.imageview_back);
        textview1 = findViewById(R.id.textview1);
        ImageView imageview_format =   findViewById(R.id.imageview_format);
        TextView textview4 = findViewById(R.id.textview4);
        seekbar1 = findViewById(R.id.seekbar1);
        seekbar2 = findViewById(R.id.seekbar2);
        textview2 = findViewById(R.id.textview2);


        f = getSharedPreferences("f", 0);


        imageview_back.setOnClickListener(v -> NamecontentActivity.this.finish());


        imageview_format.setOnClickListener(view -> {

            NamecontentActivity.this.num += 1.0d;
            if (NamecontentActivity.this.num == 1.0d) {
                NamecontentActivity.linear_formatting.setVisibility(View.VISIBLE);
                return;
            }
            NamecontentActivity.this.num = 0.0d;
            NamecontentActivity.linear_formatting.setVisibility(View.GONE);


        });

        textview4.setOnClickListener(view -> {
            NamecontentActivity.this.seekbar1.setProgress(2);
            NamecontentActivity.this.seekbar2.setProgress(2);
            SketchwareUtil.showMessage(NamecontentActivity.this.getApplicationContext(), "reset to default");
        });


        seekbar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (i == 1) {
                    NamecontentActivity.this.f.edit().putString("font", "1").apply();
                    NamecontentActivity.this.textview1.setTextSize(14.0f);
                    NamecontentActivity.this.textview2.setTextSize(12.0f);
                }
                if (i == 2) {
                    NamecontentActivity.this.f.edit().putString("font", "2").apply();
                    NamecontentActivity.this.textview1.setTextSize(16.0f);
                    NamecontentActivity.this.textview2.setTextSize(14.0f);
                }
                if (i == 3) {
                    NamecontentActivity.this.f.edit().putString("font", "3").apply();
                    NamecontentActivity.this.textview1.setTextSize(18.0f);
                    NamecontentActivity.this.textview2.setTextSize(16.0f);
                }
                if (i == 4) {
                    NamecontentActivity.this.f.edit().putString("font", "4").apply();
                    NamecontentActivity.this.textview1.setTextSize(20.0f);
                    NamecontentActivity.this.textview2.setTextSize(18.0f);
                }
                if (i == 5) {
                    NamecontentActivity.this.f.edit().putString("font", "5").apply();
                    NamecontentActivity.this.textview1.setTextSize(22.0f);
                    NamecontentActivity.this.textview2.setTextSize(20.0f);
                }
                if (i == 6) {
                    NamecontentActivity.this.f.edit().putString("font", "6").apply();
                    NamecontentActivity.this.textview1.setTextSize(24.0f);
                    NamecontentActivity.this.textview2.setTextSize(22.0f);
                }
                if (i == 7) {
                    NamecontentActivity.this.f.edit().putString("font", "7").apply();
                    NamecontentActivity.this.textview1.setTextSize(26.0f);
                    NamecontentActivity.this.textview2.setTextSize(24.0f);
                }
                if (i == 8) {
                    NamecontentActivity.this.f.edit().putString("font", "8").apply();
                    NamecontentActivity.this.textview1.setTextSize(28.0f);
                    NamecontentActivity.this.textview2.setTextSize(26.0f);
                }
                if (i == 9) {
                    NamecontentActivity.this.f.edit().putString("font", "9").apply();
                    NamecontentActivity.this.textview1.setTextSize(30.0f);
                    NamecontentActivity.this.textview2.setTextSize(28.0f);
                }
                if (i == 10) {
                    NamecontentActivity.this.f.edit().putString("font", "10").apply();
                    NamecontentActivity.this.textview1.setTextSize(32.0f);
                    NamecontentActivity.this.textview2.setTextSize(30.0f);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        seekbar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override

            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (i == 1) {
                    NamecontentActivity.this.f.edit().putString("Spacing", "1").apply();
                    NamecontentActivity.this.textview2.setLineSpacing(0.0f, 0.75f);
                }
                if (i == 2) {
                    NamecontentActivity.this.f.edit().putString("Spacing", "2").apply();
                    NamecontentActivity.this.textview2.setLineSpacing(0.0f, 1.0f);
                }
                if (i == 3) {
                    NamecontentActivity.this.f.edit().putString("Spacing", "3").apply();
                    NamecontentActivity.this.textview2.setLineSpacing(0.0f, 1.25f);
                }
                if (i == 4) {
                    NamecontentActivity.this.f.edit().putString("Spacing", "4").apply();
                    NamecontentActivity.this.textview2.setLineSpacing(0.0f, 1.5f);
                }
                if (i == 5) {
                    NamecontentActivity.this.f.edit().putString("Spacing", "5").apply();
                    NamecontentActivity.this.textview2.setLineSpacing(0.0f, 1.75f);
                }
                if (i == 6) {
                    NamecontentActivity.this.f.edit().putString("Spacing", "6").apply();
                    NamecontentActivity.this.textview2.setLineSpacing(0.0f, 2.0f);
                }
                if (i == 7) {
                    NamecontentActivity.this.f.edit().putString("Spacing", "7").apply();
                    NamecontentActivity.this.textview2.setLineSpacing(0.0f, 2.25f);
                }
                if (i == 8) {
                    NamecontentActivity.this.f.edit().putString("Spacing", "8").apply();
                    NamecontentActivity.this.textview2.setLineSpacing(0.0f, 2.5f);
                }
                if (i == 9) {
                    NamecontentActivity.this.f.edit().putString("Spacing", "9").apply();
                    NamecontentActivity.this.textview2.setLineSpacing(0.0f, 2.75f);
                }
                if (i == 10) {
                    NamecontentActivity.this.f.edit().putString("Spacing", "10").apply();
                    NamecontentActivity.this.textview2.setLineSpacing(0.0f, 3.0f);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });


        getApplicationContext();


        ((ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE)).addPrimaryClipChangedListener(() -> {

        });


        num = 0.0d;
        linear_formatting.setVisibility(View.GONE);

        textview1.setText(getIntent().getStringExtra(AppMeasurementSdk.ConditionalUserProperty.NAME));
        textview2.setText(getIntent().getStringExtra("content"));

        if (!this.f.getString("font_default", "").equals("true")) {
            this.seekbar1.setProgress(2);
            this.seekbar2.setProgress(2);
            this.f.edit().putString("font_default", "true").apply();
        }







        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {


            String detils = bundle.getString("name");
            showdetils(detils);


        }



    }


    @SuppressLint("SetTextI18n")
    private void showdetils(String detils) {


        if (detils.equals("g1")) {

            textview1.setText(R.string.girlPorbo1);
            textview2.setText(R.string.porvo1text);

        }
        if (detils.equals("g2")) {

            textview1.setText(R.string.girlPorbo2);
            textview2.setText(R.string.porvo2text);

        }
        if (detils.equals("g3")) {

            textview1.setText(R.string.girlPorbo3);
            textview2.setText(R.string.porvo3text);

        }
        if (detils.equals("g4")) {

            textview1.setText(R.string.girlPorbo4);
            textview2.setText(R.string.porvo4text);

        }
        if (detils.equals("g5")) {

            textview1.setText(R.string.girlPorbo5);
            textview2.setText(R.string.porvo5text);

        }
        if (detils.equals("g6")) {

            textview1.setText(R.string.girlPorbo6);
            textview2.setText(R.string.porvo6text);

        }

        if (detils.equals("g7")) {

            textview1.setText(R.string.girlPorbo7);
            textview2.setText(R.string.porvo7text);

        }

        if (detils.equals("boyPorbo1")) {

            textview1.setText(R.string.boyPorbo1);
            textview2.setText(R.string.porvo1);

        }

        if (detils.equals("boyPorbo2")) {

            textview1.setText(R.string.boyPorbo2);
            textview2.setText(R.string.porvo2);

        }

        if (detils.equals("boyPorbo3")) {

            textview1.setText(R.string.boyPorbo3);
            textview2.setText(R.string.porvo3);

        }

        if (detils.equals("boyPorbo4")) {

            textview1.setText(R.string.boyPorbo4);
            textview2.setText(R.string.porvo4);

        }

        if (detils.equals("boyPorbo5")) {

            textview1.setText(R.string.boyPorbo5);
            textview2.setText(R.string.porvo5);

        }

        if (detils.equals("boyPorbo6")) {

            textview1.setText(R.string.boyPorbo6);
            textview2.setText(R.string.porvo6);

        }

        if (detils.equals("boyPorbo7")) {

            textview1.setText(R.string.boyPorbo7);
            textview2.setText(R.string.porvo7);

        }


        //Borno Start

        if (detils.equals("GSoreoDiyaName")) {

            textview1.setText(R.string.GSoreoDiyaName);
            textview2.setText(R.string.soreadiya);

        }


        if (detils.equals("GNoDiyaName")) {

            textview1.setText(R.string.GNoDiyaName);
            textview2.setText(R.string.ndiya);

        }

        if (detils.equals("GFoDiyeName")) {

            textview1.setText(R.string.GFoDiyeName);
            textview2.setText(R.string.fodiya);

        }
        if (detils.equals("GModiyaName")) {

            textview1.setText(R.string.GModiyaName);
            textview2.setText(R.string.mdiya);

        }

        if (detils.equals("GToDiyeName")) {

            textview1.setText(R.string.GToDiyeName);
            textview2.setText(R.string.tdiya);

        }

        if (detils.equals("BacaiKoraMeyederName")) {

            textview1.setText(R.string.BacaiKoraMeyederName);
            textview2.setText(R.string.bacay_kora_meyeder_name);

        }

        if (detils.equals("RoDiyaName")) {

            textview1.setText(R.string.RoDiyaName);
            textview2.setText(R.string.rdiya_meyeder_name);

        }

        if (detils.equals("SAnDShoDIyaName")) {

            textview1.setText(R.string.SAnDShoDIyaName);
            textview2.setText(R.string.sdiya_meyer_name);

        }

        if (detils.equals("JDiyaName")) {

            textview1.setText(R.string.JDiyaName);
            textview2.setText(R.string.jdiya_meyeder_name);

        }

        //boyname borno

        if (detils.equals("CSoreaDiyaName")) {

            textview1.setText(R.string.CSoreaDiyaName);
            textview2.setText(R.string.Csorea_diya_name);

        }
        if (detils.equals("CFodiyaName")) {

            textview1.setText(R.string.CFodiyaName);
            textview2.setText(R.string.Cfo_diya_name);

        }
        if (detils.equals("CMoDIyaName")) {

            textview1.setText(R.string.CMoDIyaName);
            textview2.setText(R.string.Cmo_diya_name);

        }
        if (detils.equals("CRodiyaName")) {

            textview1.setText(R.string.CRodiyaName);
            textview2.setText(R.string.Crdiya_celeder_name);

        }


        //Name Bistarito


        if (detils.equals("NamerPovab")) {

            textview1.setText(R.string.NamerPovab);
            textview2.setText(R.string.good_or_bad_name_effect);

        }
        if (detils.equals("NameKoronerSomoy")) {

            textview1.setText(R.string.NameKoronerSomoy);
            textview2.setText(R.string.name_koroner_somoy);

        }
        if (detils.equals("UttomName")) {

            textview1.setText(R.string.UttomName);
            textview2.setText(R.string.better_name);

        }
        if (detils.equals("HaramName")) {

            textview1.setText(R.string.HaramName);
            textview2.setText(R.string.haram_name);

        }
        if (detils.equals("MakruhName")) {

            textview1.setText(R.string.MakruhName);
            textview2.setText(R.string.makruh_name);

        }
        if (detils.equals("SHirkiName")) {

            textview1.setText(R.string.SHirkiName);
            textview2.setText(R.string.shirki_name);

        }
        if (detils.equals("NObiName")) {

            textview1.setText(R.string.NObiName);
            textview2.setText(R.string.nobidername);

        }
        if (detils.equals("SahbahderName")) {

            textview1.setText(R.string.SahbahderName);
            textview2.setText(R.string.sahaba);

        }

        //allah 99 name
        if (detils.equals("allah99name")) {

            textview1.setText(R.string.TitelAllah99Name);
            textview2.setText(R.string.allahr_name);

        }

        if (detils.equals("boy418name")) {

            textview1.setText("ছেলে শিশুদের ৪১৮ টি নাম");
            textview2.setText("  আব্দুর রহীম =অর্থ =-করুণাময়ের বান্দা\n" +
                    "                    \n" +
                    "২ আব্দুল আহাদ=অর্থ =এক সত্তার বান্দা\n" +
                    "                    \n" +
                    "৩ আব্দুস সামাদ=অর্থ =পূর্ণাঙ্গ কর্তৃত্বের অধিকারীর বান্দা\n" +
                    "                    \n" +
                    "৪  আব্দুল ওয়াহেদ=অর্থ =একক সত্তার বান্দা\n" +
                    "                    \n" +
                    "৫  আব্দুল কাইয়্যুম =অর্থ =অবিনশ্বরের বান্দা\n" +
                    "                    \n" +
                    "৬ আব্দুস সামী=অর্থ =সর্বশ্রোতার বান্দা\n" +
                    "                    \n" +
                    "৭ আব্দুল হাইয়্য =অর্থ =চিরঞ্জীবের বান্দা\n" +
                    "                    \n" +
                    "৮  আব্দুল খালেক =অর্থ =সৃষ্টিকর্তার বান্দা\n" +
                    "                    \n" +
                    "৯ আব্দুল বারী =অর্থ =স্রষ্টার বান্দা\n" +
                    "                    \n" +
                    "১০ আব্দুল মাজীদ =অর্থ =মহিমান্বিত সত্তার বান্দা\n" +
                    "                    \n" +
                    "১১ আইদ=অর্থ =কল্যাণ\n" +
                    "                    \n" +
                    "১২ আমির=অর্থ =বিশ্বাসী\n" +
                    "                    \n" +
                    "১৩ আরিব=অর্থ =বন্ধু\n" +
                    "                    \n" +
                    "১৪ আরফান=অর্থ = দয়ালু\n" +
                    "                    \n" +
                    "১৫ আরমান =অর্থ =পুরুষ সেনা\n" +
                    "                    \n" +
                    "১৬ আবদুল হালিম=অর্থ =মহা ধৈর্যশীলের গোলাম\n" +
                    "                    \n" +
                    "১৭ আবদুল হামি=অর্থ =রক্ষাকারী সেবক\n" +
                    "                    \n" +
                    "১৮ আবদুল হামিদ=অর্থ =মহা প্রশংসাভাজনের গোলাম\n" +
                    "                    \n" +
                    "১৯ আবদুল হক=অর্থ =মহাসত্যের গোলাম\n" +
                    "                    \n" +
                    "২০ আবদুল হাসিব=অর্থ =হিসাব গ্রহনকারীর গোলাম\n" +
                    "                    \n" +
                    "২১ আবদুল জাব্বার=অর্থ =মহাশক্তিশালীর গোলাম\n" +
                    "                    \n" +
                    "২২ আবদুল জলিল=অর্থ =মহাপ্রতাপশালীর গোলাম\n" +
                    "                    \n" +
                    "২৩ আবদুল কাহহার=অর্থ =পরাত্রুমশীলের গোলাম\n" +
                    "                    \n" +
                    "২৪ আবদুল কারীম=অর্থ =দানকর্তার গোলাম\n" +
                    "                    \n" +
                    "২৫ আবদুল খালেক=অর্থ =সৃষ্টিকর্তার গোলাম\n" +
                    "                    \n" +
                    "২৬ আবদুল লতিফ=অর্থ =মেহেরবানের গোলাম\n" +
                    "                    \n" +
                    "২৭ আবদুল মাজিদ=অর্থ =বুযুর্গের গোলাম\n" +
                    "                    \n" +
                    "২৮ আবদুল মুবীন=অর্থ =প্রকাশের দাস\n" +
                    "                    \n" +
                    "২৯ আবদুল মোহাইমেন=অর্থ =মহাপ্রহরীর গোলাম\n" +
                    "                    \n" +
                    "৩০ আবদুল মুহীত=অর্থ =বেষ্টনকারী গোলাম\n" +
                    "                    \n" +
                    "৩১ আবদুল মুজিব=অর্থ =কবুলকারীর গোলাম\n" +
                    "                    \n" +
                    "৩২ আবদুল মুতী=অর্থ =মহাদাতার গোলাম\n" +
                    "                    \n" +
                    "৩৩ আবদুল নাসের=অর্থ =সাহায্যকারীর গোলাম\n" +
                    "                    \n" +
                    "৩৪ আব দুল কাদির=অর্থ =ক্ষমতাবানের গোলাম\n" +
                    "                    \n" +
                    "৩৫ আবদুল কাহহার=অর্থ =মহা প্রতাপশালীর গোলাম\n" +
                    "                    \n" +
                    "৩৬ আবদুল কুদ্দুছ=অর্থ =মহাপাক পবিত্রের গোলাম\n" +
                    "                    \n" +
                    "৩৭ আবদুল শাকুর=অর্থ =প্রতিদানকারীর গোলাম\n" +
                    "                    \n" +
                    "৩৮ আবদুল ওয়াদুদ=অর্থ =প্রেমময়ের গোলাম\n" +
                    "                    \n" +
                    "৩৯ আবদুল ওয়াহেদ=অর্থ =এককের গোলাম\n" +
                    "                    \n" +
                    "৪০ আবদুল ওয়ারিছ=অর্থ =মালিকের দাস\n" +
                    "                    \n" +
                    "৪১ আবদুল ওয়াহহাব=অর্থ = দাতার দাস\n" +
                    "                    \n" +
                    "৪২ আবদুর রাফি=অর্থ = মহিয়ানের গোলাম\n" +
                    "                    \n" +
                    "৪৩ আবদুর রাহিম=অর্থ =দয়ালুর গোলাম\n" +
                    "                    \n" +
                    "৪৪ আবদুর রহমান=অর্থ =করুনাময়ের গোলাম\n" +
                    "                    \n" +
                    "৪৫ আবদুর রশিদ=অর্থ =সরল সত্যপথে পরিচালকের গোলাম\n" +
                    "                    \n" +
                    "৪৬ আদুর রউফ=অর্থ =মহাস্নেহশীলের গোলাম\n" +
                    "                    \n" +
                    "৪৭ আবদুর রাজ্জাক=অর্থ =রিযিকদাতার গোলাম\n" +
                    "                    \n" +
                    "৪৮ আবদুস সবুর=অর্থ = মহাধৈর্যশীলের গোলাম\n" +
                    "                    \n" +
                    "৪৯ আবদুস সালাম=অর্থ =শান্তিকর্তার গোলাম\n" +
                    "                    \n" +
                    "৫০ আবদুস সামাদ=অর্থ =অভাবহীনের গোলাম\n" +
                    "                    \n" +
                    "৫১ আবদুস সামী=অর্থ =সর্ব শ্রোতার গোলাম\n" +
                    "                    \n" +
                    "৫২ আবদুস ছাত্তার=অর্থ =মহাগোপনকারীর গোলাম\n" +
                    "                    \n" +
                    "৫৩ আবদুজ জাহির=অর্থ =দৃশ্যমানের গোলাম\n" +
                    "                    \n" +
                    "৫৪ আবেদ=অর্থ =উপাসক\n" +
                    "                    \n" +
                    "৫৫ আবীদ=অর্থ =গোলাম\n" +
                    "                    \n" +
                    "৫৬ আদিব আখতাব=অর্থ =ভাষাবিদ বক্তা\n" +
                    "                    \n" +
                    "৫৭ আবরার=অর্থ =ন্যায়বান, গুণাবলী\n" +
                    "                    \n" +
                    "৫৮ আবরার আজমল=অর্থ = ন্যায়বান নিখুঁত\n" +
                    "                    \n" +
                    "৫৯ আবরার আখলাক=অর্থ =ন্যায়বান চরিত্র\n" +
                    "                    \n" +
                    "৬০ আবরার আখইয়ার=অর্থ =ন্যায়বান মানুষ\n" +
                    "                    \n" +
                    "৬১ আবরার আওসাফ=অর্থ =ন্যায় গুনাবলী\n" +
                    "                    \n" +
                    "৬২ আবরার ফাহাদ=অর্থ =ন্যায়বান সিংহ\n" +
                    "                    \n" +
                    "৬৩ আবরার ফাহিম=অর্থ =ন্যায়বান বুদ্ধিমান\n" +
                    "                    \n" +
                    "৬৪ আবরার ফয়সাল=অর্থ =ন্যায় বিচারক\n" +
                    "                    \n" +
                    "৬৫ আবরার ফাইয়াজ=অর্থ =ন্যায়বান দাতা\n" +
                    "                    \n" +
                    "৬৬ আবরার ফসীহ=অর্থ =ন্যায়বান বিশুদ্ধভাষী\n" +
                    "                    \n" +
                    "৬৭ আবরার ফুয়াদ=অর্থ =ন্যায়পরায়ন অন্তর\n" +
                    "                    \n" +
                    "৬৮ আবরার গালিব=অর্থ =ন্যায়বান বিজয়ী\n" +
                    "                    \n" +
                    "৬৯ আবরার হাফিজ=অর্থ =ন্যায়বান রক্ষাকারী\n" +
                    "                    \n" +
                    "৭০ আবরার হামি=অর্থ =ন্যায়বান রক্ষাকারী\n" +
                    "                    \n" +
                    "৭১ আবরার হামিদ=অর্থ =ন্যায়বান প্রশংসাকারী\n" +
                    "                    \n" +
                    "৭২ আবরার হামিম=অর্থ =ন্যায়বান বন্ধু\n" +
                    "                    \n" +
                    "৭৩ আবরার হানীফ=অর্থ =ন্যায়বান ধার্মিক\n" +
                    "                    \n" +
                    "৭৪ আবরার হাসান=অর্থ =ন্যায়বান উত্তম\n" +
                    "                    \n" +
                    "৭৫ আবরার হাসিন=অর্থ =ন্যায়বান সুন্দর\n" +
                    "                    \n" +
                    "৭৬ আবরার হাসানাত=অর্থ =ন্যায়বান গুনাবলী\n" +
                    "                    \n" +
                    "৭৭ আবরার জাহিন=অর্থ =ন্যায়বান বিচক্ষন\n" +
                    "                    \n" +
                    "৭৮ আবরার জলীল=অর্থ =ন্যায়বান মহান\n" +
                    "                    \n" +
                    "৭৯ আবরার জামিল=অর্থ =ন্যায়বান মহান\n" +
                    "                    \n" +
                    "৮০ আবরার জাওয়াদ =অর্থ =ন্যায়বান দানশীল\n" +
                    "                    \n" +
                    "৮১ আবরার খলিল=অর্থ =ন্যায়বান বন্ধু\n" +
                    "                    \n" +
                    "৮২ আবরার করীম=অর্থ =ন্যায়বান দয়ালু\n" +
                    "                    \n" +
                    "৮৩ আবরার মাহির=অর্থ =ন্যায়বান দক্ষ\n" +
                    "                    \n" +
                    "৮৪ আবরার মোহসেন=অর্থ =ন্যায়বান উপকারী\n" +
                    "                    \n" +
                    "৮৫ আবরার নাদিম=অর্থ =ন্যায়বান সঙ্গী\n" +
                    "                    \n" +
                    "৮৬ আবরার নাসির=অর্থ =ন্যায়বান সাহায্যকারী\n" +
                    "                    \n" +
                    "৮৭ আবরার রইস=অর্থ =ন্যায়বান ভদ্রব্যক্তি\n" +
                    "                    \n" +
                    "৮৮ আবরার শাহরিয়ার=অর্থ =ন্যায়বান রাজা\n" +
                    "                    \n" +
                    "৮৯ আবরার শাকিল=অর্থ =ন্যায়বান সুপুরুষ\n" +
                    "                    \n" +
                    "৯০ আবরার তাজওয়ার=অর্থ =ন্যায়বান রাজা\n" +
                    "                    \n" +
                    "৯১ আবরার ওয়াদুদ=অর্থ =ন্যায়পরায়ন বন্ধু\n" +
                    "                    \n" +
                    "৯২ আবরার ইয়াসির=অর্থ =ন্যায়বান ধনী\n" +
                    "                    \n" +
                    "৯৩ আবসার=অর্থ =দৃষ্টি\n" +
                    "                    \n" +
                    "৯৪ আবতাহী=অর্থ =নবী-(স:)-এর উপাধি\n" +
                    "                    \n" +
                    "৯৫ আবুল হাসান=অর্থ =সুন্দরের কল্যাণ\n" +
                    "                    \n" +
                    "৯৬ আবইয়াজ আজবাব=অর্থ =সাদা পাহাড়\n" +
                    "                    \n" +
                    "৯৭ আদম=অর্থ =মাটির সৃষ্টি\n" +
                    "                    \n" +
                    "৯৮ আদেল=অর্থ =ন্যায়পরায়ন\n" +
                    "                    \n" +
                    "৯৯ আহদাম=অর্থ =একজন বুজুর্গ ব্যক্তির নাম\n" +
                    "                    \n" +
                    "১০০ আদীব=অর্থ =ন্যায় বিচারক\n" +
                    "                    \n" +
                    "১০১ আদিল=অর্থ =ন্যায়বান\n" +
                    "                    \n" +
                    "১০২ আদিল আহনাফ=অর্থ =ন্যায়পরায়ন ধার্মিক\n" +
                    "                    \n" +
                    "১০৩ আফিয়া মাদেহা=অর্থ =পুণ্যবতী প্রশংসাকারিনী\n" +
                    "                    \n" +
                    "১০৪ আফতাব হুসাইন=অর্থ =সুন্দর চন্দ্র\n" +
                    "                    \n" +
                    "১০৫ আফতাবুদ্দীন=অর্থ =দ্বীনের মহান ব্যক্তিত্ব\n" +
                    "                    \n" +
                    "১০৬ আফজাল=অর্থ =অতি উত্তম\n" +
                    "                    \n" +
                    "১০৭ আফজাল আহবাব=অর্থ =দয়ালু অতি উত্তম বন্ধু\n" +
                    "                    \n" +
                    "১০৮ আহনাফ রাশিদ=অর্থ =ধর্মবিশ্বাসী পথ প্রদর্শক\n" +
                    "                    \n" +
                    "১০৯ আহকাম=অর্থ =অত্যন্ত শক্তিশালী\n" +
                    "                    \n" +
                    "১১০ আহমেদ=অর্থ =প্রশংসিত\n" +
                    "                    \n" +
                    "১১১ আহমাদ আওসাফ=অর্থ =অতি প্রশংসনীয় গুনাবলী\n" +
                    "                    \n" +
                    "১১২ আহমাদ হুসাইন=অর্থ =সুন্দর মহত্ত্ব\n" +
                    "                    \n" +
                    "১১৩ আহমাদুল হক=অর্থ =যথার্থ প্রশংসিত\n" +
                    "                    \n" +
                    "১১৪ আহমাম আবরেশমা=অর্থ =লাল বর্নেরসিল্ক\n" +
                    "                    \n" +
                    "১১৫ আহমার=অর্থ =অধিক লাল\n" +
                    "                    \n" +
                    "১১৬ আহমার আজবাব=অর্থ =লাল পাহাড়\n" +
                    "                    \n" +
                    "১১৭ আহমার আখতার=অর্থ =লাল তারা\n" +
                    "                    \n" +
                    "১১৮ আহনাফ=অর্থ =ধর্মবিশ্বাসে অতিখাঁটি\n" +
                    "                    \n" +
                    "১১৯ আহনাফ আবিদ=অর্থ =ধর্মবিশ্বাসী ইবাদতকারী\n" +
                    "                    \n" +
                    "১২০ আহনাফ আবরার=অর্থ =অতিপ্রশংসনীয় ন্যায়বান\n" +
                    "                    \n" +
                    "১২১ আহনাফ আদিল=অর্থ =ধর্মবিশ্বাসী ন্যায়পরায়ন\n" +
                    "                    \n" +
                    "১২২ আহনাফ আহমাদ=অর্থ =ধার্মিক অতি প্রশংসনীয়\n" +
                    "                    \n" +
                    "১২৩ আহনাফ আকিফ=অর্থ =ধর্মবিশ্বাসী উপাসক\n" +
                    "                    \n" +
                    "১২৪ আহনাফ আমের=অর্থ =ধর্মবিশ্বাসী শাসক\n" +
                    "                    \n" +
                    "১২৫ আহনাফ আনসার=অর্থ =ধর্মবিশ্বাসী সাহায্যকারী\n" +
                    "                    \n" +
                    "১২৬ আহনাফ আতেফ=অর্থ =ধর্মবিশ্বাসী দয়ালু\n" +
                    "                    \n" +
                    "১২৭ আহনাফ হাবিব=অর্থ =ধর্মবিশ্বাসী বন্ধু\n" +
                    "                    \n" +
                    "১২৮ আহনাফ হামিদ=অর্থ =ধর্মবিশ্বাসী প্রশংসাকারী\n" +
                    "                    \n" +
                    "১২৯ আহনাফ হাসান=অর্থ =ধর্মবিশ্বাসী উত্তম\n" +
                    "                    \n" +
                    "১৩০ আহনাফ মনসুর=অর্থ =ধর্মবিশ্বাসী প্রত্যয়নকারী\n" +
                    "                    \n" +
                    "১৩১ আহনাফ মোহসেন=অর্থ =ধর্মবিশ্বাসী উপকারী\n" +
                    "                    \n" +
                    "১৩২ আহনাফ মোসাদ্দেক=অর্থ =ধর্মবিশ্বাসী প্রত্যয়নকারী\n" +
                    "                    \n" +
                    "১৩৩ আহনাফ মুইয=অর্থ =ধর্মবিশ্বাসী সম্মানিত\n" +
                    "                    \n" +
                    "১৩৪ আহনাফ মুজাহিদ=অর্থ =ধর্মবিশ্বাসী ধর্মযোদ্ধা\n" +
                    "                    \n" +
                    "১৩৫ আহনাফ মুরশেদ=অর্থ =ধর্মবিশ্বাসী পথপ্রদর্শক\n" +
                    "                    \n" +
                    "১৩৬ আহনাফ মুত্তাকী=অর্থ =ধর্মবিশ্বাসী ধর্মযোদ্ধা\n" +
                    "                    \n" +
                    "১৩৭ আহনাফ শাকিল=অর্থ =ধর্মবিশ্বাসী সুপুরুষ\n" +
                    "                    \n" +
                    "১৩৮ আহনাফ শাহরিয়ার=অর্থ =ধর্মবিশ্বাসী রাজা\n" +
                    "                    \n" +
                    "১৩৯ আহনাফ তাজওয়ার=অর্থ =ধর্মবিশ্বাসী রাজা\n" +
                    "                    \n" +
                    "১৪০ আহনাফ ওয়াদুদ=অর্থ =ধর্মবিশ্বাসী বন্ধু\n" +
                    "                    \n" +
                    "১৪১ আহরার=অর্থ =আজাদী প্রাপ্তদান\n" +
                    "                    \n" +
                    "১৪২ আইনুদ্দীন=অর্থ =দ্বীনের আলো\n" +
                    "                    \n" +
                    "১৪৩ আইনুল হাসান=অর্থ =সুন্দর ইঙ্গিতদাতা\n" +
                    "                    \n" +
                    "১৪৪ আজমাইন আদিল=অর্থ =সম্পূর্ন ন্যায়পরায়ন\n" +
                    "                    \n" +
                    "১৪৫ আজফার=অর্থ =বিজয়\n" +
                    "                    \n" +
                    "১৪৬ আযহার=অর্থ =অপরিস্ফুট ফুল\n" +
                    "                    \n" +
                    "১৪৭ আজমাইন ইকতিদার=অর্থ =পূর্ন ক্ষমতা\n" +
                    "                    \n" +
                    "১৪৮আজমাইন ফায়েক=অর্থ =সম্পূর্ন উত্তম\n" +
                    "                    \n" +
                    "১৪৯ আজমাইন ইনকিশাফ=অর্থ =পূর্ন সূর্যগ্রহন\n" +
                    "                    \n" +
                    "১৫০ আজমাইন ইনকিয়াদ=অর্থ =পূর্ন বাধ্যতা\n" +
                    "                    \n" +
                    "১৫১ আজমাইন মাহতাব=অর্থ =পূর্ন চাঁদ\n" +
                    "                    \n" +
                    "১৫২ আজমাল=অর্থ =অতি সুন্দর\n" +
                    "                    \n" +
                    "১৫৩ আজমল আফসার=অর্থ =নিখুঁত দৃষ্টি\n" +
                    "                    \n" +
                    "১৫৪ আজমাল আহমাদ=অর্থ =নিখুঁত অতিপ্রশংসনীয়\n" +
                    "                    \n" +
                    "১৫৫ আজমল আওসাফ=অর্থ =নিখুঁত গুনাবলী\n" +
                    "                    \n" +
                    "১৫৬ আজমল ফুয়াদ=অর্থ =নিখুঁত অন্তর\n" +
                    "                    \n" +
                    "১৫৭ আজরফ=অর্থ =সুচতুর\n" +
                    "                    \n" +
                    "১৫৮ আজরফ আমের=অর্থ =অতিবুদ্ধিমান শাসক\n" +
                    "                    \n" +
                    "১৫৯ আজওয়াদ আবরার=অর্থ =অতিউত্তম ন্যায়বান\n" +
                    "                    \n" +
                    "১৬০ আজওয়াদ আহবাব=অর্থ =অতিউত্তম বন্ধু\n" +
                    "                    \n" +
                    "১৬১ আকবার=অর্থ =অতি দানশীল\n" +
                    "                    \n" +
                    "১৬২ আকবর আওসাফ=অর্থ =মহান গুনাবলী\n" +
                    "                    \n" +
                    "১৬৩ আকবর ফিদা=অর্থ =মহান উৎসর্গ\n" +
                    "                    \n" +
                    "১৬৪ আখফাশ=অর্থ =এক বিজ্ঞ ব্যক্তি\n" +
                    "                    \n" +
                    "১৬৫ আখলাক=অর্থ =চারিত্রিক গুনাবলী\n" +
                    "                    \n" +
                    "১৬৬ আখতাব=অর্থ =বক্তৃতা দানে বিশারদ\n" +
                    "                    \n" +
                    "১৬৭ আখজার আবরেশাম=অর্থ =সবুজ বর্ণের সিল্ক\n" +
                    "                    \n" +
                    "১৬৮ আকমল=অর্থ =ত্রুটিহীন\n" +
                    "                    \n" +
                    "১৬৯ আকরাম=অর্থ =অতিদানশীল\n" +
                    "                    \n" +
                    "১৭০ আকরাম আনওয়ার=অর্থ =অতি উজ্জ্বল গুনাবলী\n" +
                    "                    \n" +
                    "১৭১ আখতার নেহাল=অর্থ =সবুজ চার গাছ\n" +
                    "                    \n" +
                    "১৭২ আল-বা=অর্থ =দর্শনকারী\n" +
                    "                    \n" +
                    "১৭৩ আলম=অর্থ =বিশ্ব\n" +
                    "                    \n" +
                    "১৭৪ আলমগীর=অর্থ =বিশ্বজয়ী\n" +
                    "                    \n" +
                    "১৭৫ আলাউদ্দীন =অর্থ =দ্বীনের নেতা\n" +
                    "                    \n" +
                    "১৭৬ আলাউল হক=অর্থ =প্রকৃত অস্ত্র\n" +
                    "                    \n" +
                    "১৭৭ আলী আফসার=অর্থ =উচ্চ দৃষ্টি\n" +
                    "                    \n" +
                    "১৭৮ আলী আহমদ=অর্থ =প্রশংসিত সূর্য\n" +
                    "                    \n" +
                    "১৭৯ আলি আরমান=অর্থ =উচ্চ ইচ্ছা\n" +
                    "                    \n" +
                    "১৮০ আলি আওসাফ=অর্থ =উচ্চগুনাবলী\n" +
                    "                    \n" +
                    "১৮১ আলী হাসান=অর্থ =সুন্দরের নেতা\n" +
                    "                    \n" +
                    "১৮২ আলিফ=অর্থ =আরবী অক্ষর\n" +
                    "                    \n" +
                    "১৮৩ আলিম=অর্থ =বিদ্যান\n" +
                    "                    \n" +
                    "১৮৪ আলীমুদ্দীন =অর্থ =দ্বীনের শৃংখলা\n" +
                    "                    \n" +
                    "১৮৫ আলিউদ্দীন =অর্থ =দ্বীনের উজ্জ্বলতা\n" +
                    "                    \n" +
                    "১৮৬ আলতাফ=অর্থ =দয়ালু, অনুগ্রহ\n" +
                    "                    \n" +
                    "১৮৭আলতাফ হুসাইন=অর্থ =সুন্দর সূর্য্য\n" +
                    "                    \n" +
                    "১৮৮ আলতাফুর রহমান=অর্থ =দয়াময়ের বন্ধু\n" +
                    "                    \n" +
                    "১৮৯ আমান=অর্থ =নিরাপদ\n" +
                    "                    \n" +
                    "১৯০ আমানাত=অর্থ =গচ্ছিত ধন\n" +
                    "                    \n" +
                    "১৯১ আমিন=অর্থ =বিশ্বস্ত\n" +
                    "                    \n" +
                    "১৯২ আ-মের=অর্থ =নির্দেশদাতা\n" +
                    "                    \n" +
                    "১৯৩ আমীর আহমদ=অর্থ =প্রশংসিত বিশ্বস্ত\n" +
                    "                    \n" +
                    "১৯৪ আমিন আহমদ=অর্থ =প্রশংসিত বক্তা\n" +
                    "                    \n" +
                    "১৯৫ আমীনুদ্দীন=অর্থ =দ্বীনের সৌন্দর্য্য\n" +
                    "                    \n" +
                    "১৯৬ আমীনুল হক=অর্থ =যথার্থ বিশ্বস্ত\n" +
                    "                    \n" +
                    "১৯৭  আমীলুন ইসলাম =অর্থ =ইসলামের চাঁদ\n" +
                    "                    \n" +
                    "১৯৮ আমীর=অর্থ =নেতা\n" +
                    "                    \n" +
                    "১৯৯ আমির আহমদ=অর্থ =প্রশংসিত বিশ্বস্ত\n" +
                    "                    \n" +
                    "২০০ আমীর হাসান=অর্থ =সুন্দরের বন্ধু\n" +
                    "                    \n" +
                    "২০১ আমীরুল হক=অর্থ =প্রকৃত নেতা\n" +
                    "                    \n" +
                    "২০২ আমিরুল ইসলাম=অর্থ =ইসলামের জ্যোতি\n" +
                    "                    \n" +
                    "২০৩ আমজাদ আবিদ=অর্থ =সম্মানিত ইবাদতকারী\n" +
                    "                    \n" +
                    "২০৪ আমজাদ আকিব=অর্থ =সম্মানিত উপাসক\n" +
                    "                    \n" +
                    "২০৫ আমজাদ আলি=অর্থ =সম্মানিত উচ্চ\n" +
                    "                    \n" +
                    "২০৬ আমজাদ আমের=অর্থ =সম্মানিত শাসক\n" +
                    "                    \n" +
                    "২০৭ আমজাদ আনিস=অর্থ =সম্মানিত বন্ধু\n" +
                    "                    \n" +
                    "২০৮ আমজাদ আরিফ=অর্থ =সম্মানিত জ্ঞানী\n" +
                    "                    \n" +
                    "২০৯ আমজাদ আসাদ=অর্থ =সম্মানিত সিংহ\n" +
                    "                    \n" +
                    "২১০ আমজাদ আশহাব=অর্থ =সম্মানিত বীর\n" +
                    "                    \n" +
                    "২১১ আমজাদ আজিম=অর্থ = সম্মানিত শক্তিশালী\n" +
                    "                    \n" +
                    "২১২ আমজাদ আজিজ=অর্থ =সম্মানিত ক্ষমতাবান\n" +
                    "                    \n" +
                    "২১৩ আমজাদ বখতিয়ার=অর্থ =সম্মানিত সৌভাগ্যবান\n" +
                    "                    \n" +
                    "২১৪ আমজাদ বশীর=অর্থ =সম্মানিত সুসংবাদবহনকারী\n" +
                    "                    \n" +
                    "২১৫ আমজাদ ফুয়াদ=অর্থ =সম্মানিত অন্তর\n" +
                    "                    \n" +
                    "২১৬ আমজাদ গালিব=অর্থ =সম্মানিত বিজয়ী\n" +
                    "                    \n" +
                    "২১৭ আমজাদ হাবীব=অর্থ =সম্মানিত প্রিয় বন্ধু\n" +
                    "                    \n" +
                    "২১৮ আমজাদ হামি=অর্থ =সম্মানিত রক্ষাকারী\n" +
                    "                    \n" +
                    "২১৯ আমজাদ জলিল=অর্থ =সম্মানিত মহান\n" +
                    "                    \n" +
                    "২২০ আমজাদ খলিল=অর্থ =সম্মানিত বন্ধু\n" +
                    "                    \n" +
                    "২২১ আমজাদ লাবিব=অর্থ =সম্মানিত বুদ্ধিমান\n" +
                    "                    \n" +
                    "২২২ আমজাদ লতিফ=অর্থ =সম্মানিত পবিত্র\n" +
                    "                    \n" +
                    "২২৩ আমজাদ মাহবুব=অর্থ =সম্মানিত বন্ধু\n" +
                    "                    \n" +
                    "২২৪ আমজাদ মোসাদ্দেক=অর্থ =সম্মানিত প্রত্যয়নকারী\n" +
                    "                    \n" +
                    "২২৫ আমজাদ মুনিফ=অর্থ = সম্মানিত বিখ্যাত\n" +
                    "                    \n" +
                    "২২৬ আমজাদ নাদিম=অর্থ =সম্মানিত সঙ্গী\n" +
                    "                    \n" +
                    "২২৭ আমজাদ রফিক=অর্থ =সম্মানিত বন্ধু\n" +
                    "                    \n" +
                    "২২৮ আমজাদ রইস=অর্থ =সম্মানিত ভদ্র ব্যাক্তি\n" +
                    "                    \n" +
                    "২২৯ আমজাদ সাদিক=অর্থ =সম্মানিত সত্যবান\n" +
                    "                    \n" +
                    "২৩০ আমজাদ শাকিল=অর্থ =সম্মানিত সুপুরুষ\n" +
                    "                    \n" +
                    "২৩১ আমজাদ=অর্থ =সম্মানিত\n" +
                    "                    \n" +
                    "২৩২ আমজাদ হুসাইন=অর্থ =সুন্দর সত্যবাদী\n" +
                    "                    \n" +
                    "২৩৩ আনাস=অর্থ =অনুরাগ\n" +
                    "                    \n" +
                    "২৩৪ আনিস=অর্থ =আনন্দিত\n" +
                    "                    \n" +
                    "২৩৫ আনীসুল হক=অর্থ =প্রকৃত মহব্বত\n" +
                    "                    \n" +
                    "২৩৬ আনিসুর রহমান=অর্থ =দয়াময়ের বন্ধু\n" +
                    "                    \n" +
                    "২৩৭ আনসার=অর্থ =সাহায্যকারী\n" +
                    "                    \n" +
                    "২৩৮ আনওয়ার=অর্থ =জ্যোতির্মালা\n" +
                    "                    \n" +
                    "২৩৯ আব্দুল ইলাহ=অর্থ = উপাস্যের বান্দা\n" +
                    "                    \n" +
                    "২৪০ আনোয়ার হুসাইন=অর্থ = সুন্দর দয়ালু\n" +
                    "                    \n" +
                    "২৪১ আনোয়ারুল হক=অর্থ =প্রকৃত আলো\n" +
                    "                    \n" +
                    "২৪২ আকিব=অর্থ =সবশেষে আগমনকারী\n" +
                    "                    \n" +
                    "২৪৩ আকীল=অর্থ =বিচক্ষন,জ্ঞানী\n" +
                    "                    \n" +
                    "২৪৪ আদিল আখতাব=অর্থ =বিচক্ষন বক্তা\n" +
                    "                    \n" +
                    "২৪৫ আকমার আবসার=অর্থ =অতিউজ্জ্বল দৃষ্টি\n" +
                    "                    \n" +
                    "২৪৬ আকমার আহমার=অর্থ =অতিউজ্জ্বল লাল\n" +
                    "                    \n" +
                    "২৪৭ আকমার আজমাল=অর্থ =অতিউজ্জ্বল অতিসুন্দর\n" +
                    "                    \n" +
                    "২৪৮ আকমার আকতাব=অর্থ =যোগ্য নেতা\n" +
                    "                    \n" +
                    "২৪৯ আকমার আমের=অর্থ =অতিদানশীল শাসক\n" +
                    "                    \n" +
                    "২৫০ আকমার আনজুম=অর্থ =অতিউজ্জ্বল তারকা\n" +
                    "                    \n" +
                    "২৫১ আরাবী=অর্থ =রাসূল (স.)-এর উপাধি\n" +
                    "                    \n" +
                    "২৫২ আরাফ=অর্থ =চেনার স্থান\n" +
                    "                    \n" +
                    "২৫৩ আরহাম আহবাব=অর্থ =সবচাইতে সংবেদনশীল বন্ধু\n" +
                    "                    \n" +
                    "২৫৪ আরহাম আখইয়ার=অর্থ =সবচেয়ে সংবেদনশীল চমৎকারমানুষ\n" +
                    "                    \n" +
                    "২৫৫ আরিফ আবসার=অর্থ =পবিত্র দৃষ্টি\n" +
                    "                    \n" +
                    "২৫৬ আরিফ আজমল=অর্থ =পবিত্র অতি সুন্দর\n" +
                    "                    \n" +
                    "২৫৭ আরিফ আকরাম=অর্থ =জ্ঞানী অতিদানশীল\n" +
                    "                    \n" +
                    "২৫৮ আরিফ আখতার=অর্থ =পবিত্র তারকা\n" +
                    "                    \n" +
                    "২৫৯ আরিফ আলমাস=অর্থ =পবিত্র হীরা\n" +
                    "                    \n" +
                    "২৬০ আরিফ আমের=অর্থ =জ্ঞানী শাসক\n" +
                    "                    \n" +
                    "২৬১ আরিফ আনজুম=অর্থ =পবিত্র তারকা\n" +
                    "                    \n" +
                    "২৬২ আরিফ আনওয়ার=অর্থ =পবিত্র জ্যোতিমালা\n" +
                    "                    \n" +
                    "২৬৩ আরিফ আকতাব=অর্থ =জ্ঞানী নেতা\n" +
                    "                    \n" +
                    "২৬৪ আরিফ আরমান=অর্থ =পবিত্র ইচ্ছা\n" +
                    "                    \n" +
                    "২৬৫ আরিফ আশহাব=অর্থ =জ্ঞানী বীর\n" +
                    "                    \n" +
                    "২৬৬ আরিফ আসমার=অর্থ =পবিত্র ফলমুল\n" +
                    "                    \n" +
                    "২৬৭  আরিফ আওসাফ=অর্থ =পবিত্র গুনাবলী\n" +
                    "                    \n" +
                    "২৬৮ আরিফ বখতিয়ার =অর্থ =পবিত্র সৌভাগ্যবান\n" +
                    "                    \n" +
                    "২৬৯ আরিফ ফয়সাল=অর্থ =পবিত্র বিচারক\n" +
                    "                    \n" +
                    "২৭০ আরিফ ফুয়াদ=অর্থ =জ্ঞানী অন্তর\n" +
                    "                    \n" +
                    "২৭১ আরিফ গওহর=অর্থ =পবিত্র গুনাবলী\n" +
                    "                    \n" +
                    "২৭২ আরিফ হামিম=অর্থ =জ্ঞানী বন্ধু\n" +
                    "                    \n" +
                    "২৭৩ আরিফ হানিফ=অর্থ =জ্ঞানী ধার্মিক\n" +
                    "                    \n" +
                    "২৭৪ আরিফ হাসনাত=অর্থ =পবিত্র গুনাবলী\n" +
                    "                    \n" +
                    "২৭৫ আরিফ জামাল=অর্থ =পবিত্র ইচ্ছা\n" +
                    "                    \n" +
                    "২৭৬ আরিফ জাওয়াদ=অর্থ =পবিত্র দানশীল\n" +
                    "                    \n" +
                    "২৭৭ আরিফ মাহির=অর্থ =জ্ঞানী দক্ষ\n" +
                    "                    \n" +
                    "২৭৮ আরিফ মনসুর=অর্থ =জ্ঞানী বিজয়ী\n" +
                    "                    \n" +
                    "২৭৯ আরিফ মোসলেহ=অর্থ = জ্ঞানী সংস্কারক\n" +
                    "                    \n" +
                    "২৮০ আরিফ মুইয=অর্থ =জ্ঞানী সম্মানিত\n" +
                    "                    \n" +
                    "২৮১ আরিফ নেসার=অর্থ =পবিত্র উৎসর্গ\n" +
                    "                    \n" +
                    "২৮২ আরিফ রায়হান=অর্থ =পবিত্র সুগন্ধীফুল\n" +
                    "                    \n" +
                    "২৮৩ আরিফ রমিজ=অর্থ =পবিত্র প্রতিক\n" +
                    "                    \n" +
                    "২৮৪ আরিফ সাদিক=অর্থ =জ্ঞানী সত্যবাদী\n" +
                    "                    \n" +
                    "২৮৫ জ্ঞানী সুপুরুষ=অর্থ =জ্ঞানী সুপুরুষ\n" +
                    "                    \n" +
                    "২৮৬ আরিফ সালেহ=অর্থ =জ্ঞানী চরিত্রবান\n" +
                    "                    \n" +
                    "২৮৭ আরিফ শাহরিয়ার=অর্থ =জ্ঞানী রাজা\n" +
                    "                    \n" +
                    "২৮৮ আরিফ জুহায়ের=অর্থ =অতি পবিত্র উজ্জ্বল\n" +
                    "                    \n" +
                    "২৮৯ আরিক=অর্থ =অধিক উজ্জ্বল\n" +
                    "                    \n" +
                    "২৯০ আরমান=অর্থ =সুদর্শন প্রেমিক\n" +
                    "                    \n" +
                    "২৯১ আরকাম=অর্থ =অধিক লেখক\n" +
                    "                    \n" +
                    "২৯২ আরশাদ=অর্থ =সৎপথের অনুসারী\n" +
                    "                    \n" +
                    "২৯৩ আরশাদ আলমাস=অর্থ =অতি স্বচ্ছ হীরা\n" +
                    "                    \n" +
                    "২৯৪ আরশাদ আওসাফ=অর্থ =সবচাইতে সৎগুনাবলী\n" +
                    "                    \n" +
                    "২৯৫ এরশাদুল হক=অর্থ =প্রকৃত পথপ্রদর্শক\n" +
                    "                    \n" +
                    "২৯৬ আস-আদ=অর্থ =অতি সৌভাগ্যবান\n" +
                    "                    \n" +
                    "২৯৭ আসাদুল হক=অর্থ =প্রকৃত সিংহ\n" +
                    "                    \n" +
                    "২৯৮ আসার=অর্থ =চিহ্ন\n" +
                    "                    \n" +
                    "২৯৯ আসীর আবরার=অর্থ =সম্মানিত ন্যায়বান\n" +
                    "                    \n" +
                    "৩০০ আসীর আহবার=অর্থ =সম্মানিত বন্ধু\n" +
                    "                    \n" +
                    "৩০১ আসীর আজমল=অর্থ =সম্মানিত নিখুঁত\n" +
                    "                    \n" +
                    "৩০২  আসীর আওসাফ=অর্থ =সম্মানিত গুনাবলী\n" +
                    "                    \n" +
                    "৩০৩ আসীর ফয়সাল=অর্থ =সম্মানিত বিচারক\n" +
                    "                    \n" +
                    "৩০৪ আসীর হামিদ=অর্থ =সম্মানিত বন্ধু\n" +
                    "                    \n" +
                    "৩০৫ আসীর ইনতিসার=অর্থ =সম্মানিত বিজয়\n" +
                    "                    \n" +
                    "৩০৬ আসীর মনসুর=অর্থ =সম্মানিত বিজয়ী\n" +
                    "                    \n" +
                    "৩০৭ আসীর মোসাদ্দেক=অর্থ =সম্মানিত\n" +
                    "                    \n" +
                    "৩০৮ আসীর মুজতবা=অর্থ =সম্মানিত মনোনীত\n" +
                    "                    \n" +
                    "৩০৯ আসেফ আমের=অর্থ =যোগ্য শাসক\n" +
                    "                    \n" +
                    "৩১০ আশেকুর রহমান=অর্থ =দয়াময়ের পাগল\n" +
                    "                    \n" +
                    "৩১১ আশফাক আহবাব=অর্থ =অধিক স্নেহশীল বন্ধু\n" +
                    "                    \n" +
                    "৩১২ আসগর=অর্থ =ক্ষুদ্রতম\n" +
                    "                    \n" +
                    "৩১৩ আশহাব আওসাফ=অর্থ =বীর গুনাবলী\n" +
                    "                    \n" +
                    "৩১৪ আশিক=অর্থ =প্রেমিক\n" +
                    "                    \n" +
                    "৩১৫ আসীম=অর্থ =রক্ষাকারী\n" +
                    "                    \n" +
                    "৩১৬ আসিল=অর্থ =উত্তম\n" +
                    "                    \n" +
                    "৩১৭ আসীরুল হক=অর্থ =প্রকৃত বন্দী\n" +
                    "                    \n" +
                    "৩১৮  আসলাম=অর্থ =নিরাপদ\n" +
                    "                    \n" +
                    "৩১৯ আসলাম আনজুম=অর্থ =নিরাপদ তারকা\n" +
                    "                    \n" +
                    "৩২০ আসলাম জলীল=অর্থ =নিরাপদ আশ্রয়স্থান\n" +
                    "                    \n" +
                    "৩২১ রহস্যাবলী=অর্থ =রহস্যাবলী\n" +
                    "                    \n" +
                    "৩২২ আতয়াব=অর্থ =সুবাস\n" +
                    "                    \n" +
                    "৩২৩ আতাউর রহমান=অর্থ =দয়াময়ের সাহায্য\n" +
                    "                    \n" +
                    "৩২৪ আতেফ আবরার=অর্থ =দয়ালু ন্যয়বান\n" +
                    "                    \n" +
                    "৩২৫ দয়ালু দৃষ্টি=অর্থ =দয়ালু দৃষ্টি\n" +
                    "                    \n" +
                    "৩২৬ আতেফ আহবাব=অর্থ =দয়ালু বন্ধু\n" +
                    "                    \n" +
                    "৩২৭ আতেফ আহমাদ=অর্থ =দয়ালু অতি প্রশংসনীয়\n" +
                    "                    \n" +
                    "৩২৮ আওয়াদ=অর্থ = ভাগ্য\n" +
                    "                    \n" +
                    "৩২৯ আতেফ আকবার=অর্থ =দয়ালু মহান\n" +
                    "                    \n" +
                    "৩৩০ আতেফ আকরাম=অর্থ =দয়ালু অতিদানশীল\n" +
                    "                    \n" +
                    "৩৩১ আতেফ আমের=অর্থ =দয়ালু শাসক\n" +
                    "                    \n" +
                    "৩৩২ আতেফ আনিস=অর্থ =দয়ালু বন্ধু\n" +
                    "                    \n" +
                    "৩৩৩ আতেফ আরহাম=অর্থ =দয়ালু সংবেদনশীল\n" +
                    "                    \n" +
                    "৩৩৪ আতেফ আরমান=অর্থ =দয়ালু ইচ্ছা\n" +
                    "                    \n" +
                    "৩৩৫ আতেফ আসাদ=অর্থ =দয়ালু সিংহ\n" +
                    "                    \n" +
                    "৩৩৬ আতেফ আশহাব=অর্থ =দয়ালু বীর\n" +
                    "                    \n" +
                    "৩৬৭ আতেফ আজিজ=অর্থ =দয়ালু ক্ষমতাবান\n" +
                    "                    \n" +
                    "৩৩৮ আতেফ বখতিয়ার=অর্থ =দয়ালু সৌভাগ্যবান\n" +
                    "                    \n" +
                    "৩৩৯ আতাহার=অর্থ =অতি পবিত্র\n" +
                    "                    \n" +
                    "৩৪০ আতহার আনওয়ার=অর্থ =অতি পবিত্র জ্যোতির্মালা\n" +
                    "                    \n" +
                    "৩৪১ আতহার আশহাব =অর্থ =অতি প্রশংসনীয় বীর\n" +
                    "                    \n" +
                    "৩৪২ আতহার ফিদা=অর্থ =অতি পবিত্র জ্যোতির্মালা\n" +
                    "                    \n" +
                    "৩৪৩ আতহার ইহসাস=অর্থ =অতি পবিত্র অনুভূতি\n" +
                    "                    \n" +
                    "৩৪৪ আতহার ইশরাক=অর্থ =অতি পবিত্র সকাল\n" +
                    "                    \n" +
                    "৩৪৫ আতহার ইশতিয়াক=অর্থ =অতি পবিত্র ইচ্ছ\n" +
                    "                    \n" +
                    "৩৪৬ আতহার জামাল=অর্থ =অতি পবিত্র সৌন্দর্য\n" +
                    "                    \n" +
                    "৩৪৭  আতহার মাসুম=অর্থ =অতি পবিত্র নিষ্পাপ\n" +
                    "                    \n" +
                    "৩৪৮ আতহার মেসবাহ=অর্থ =অতি পবিত্র প্রদীপ\n" +
                    "                    \n" +
                    "৩৪৯ আতহার মুবারক=অর্থ =অতি পবিত্র শুভ\n" +
                    "                    \n" +
                    "৩৫০ আতহার নূর=অর্থ =অতি পবিত্র আলো\n" +
                    "                    \n" +
                    "৩৫১ আতহার শাহাদ=অর্থ =অতি পবিত্র মধু\n" +
                    "                    \n" +
                    "৩৫২ আতহার শিহাব=অর্থ =অতি পবিত্র আলো\n" +
                    "                    \n" +
                    "৩৫৩ আতহার সিপার=অর্থ =অতি পবিত্র বর্ম\n" +
                    "                    \n" +
                    "৩৫৪ আতিক=অর্থ =যোগ্য ব্যাক্তি\n" +
                    "                    \n" +
                    "৩৫৫ আতিক সাদিক=অর্থ =সম্মানিত সত্যবান\n" +
                    "                    \n" +
                    "৩৫৬ আতিক আবরার=অর্থ =সম্মানিত ন্যায়বান\n" +
                    "                    \n" +
                    "৩৫৭ আতিক আদিল=অর্থ =সম্মানিত ন্যায়পরায়ণ\n" +
                    "                    \n" +
                    "৩৫৮ আতিক আহমাদ=অর্থ =সম্মানিত অতি প্রশংসনীয়\n" +
                    "                    \n" +
                    "৩৫৯ আতিক আহনাফ=অর্থ =সম্মানিত খাঁটি ধার্মিক\n" +
                    "                    \n" +
                    "৩৬০ আতিক আহরাম=অর্থ = সম্মানিত স্বাধীন\n" +
                    "                    \n" +
                    "৩৬১ আতিক আকবর=অর্থ =সম্মানিত মহান\n" +
                    "                    \n" +
                    "৩৬২ আতিক আমের=অর্থ =সম্মানিত শাসক\n" +
                    "                    \n" +
                    "৩৬৩ আতিক আনসার=অর্থ =সম্মানিত সাহায্যকারী\n" +
                    "                    \n" +
                    "৩৬৪ আতিক আসেফ=অর্থ =সম্মানিত যোগ্যব্যক্তি\n" +
                    "                    \n" +
                    "৩৬৫ আতিক আশহাব=অর্থ =সম্মানিত বীর\n" +
                    "                    \n" +
                    "৩৬৬ আতিক আশহাব=অর্থ =সম্মানিত শক্তিশালী\n" +
                    "                    \n" +
                    "৩৬৭ আতিক বখতিয়ার=অর্থ =সম্মানিত সৌভাগ্যবান\n" +
                    "                    \n" +
                    "৩৬৮ আতিক ফয়সাল=অর্থ =সম্মানিত বিচারক\n" +
                    "                    \n" +
                    "৩৬৯ আতিক ইশরাক=অর্থ =সম্মানিত প্রভাত\n" +
                    "                    \n" +
                    "৩৭০ আতিক জামাল=অর্থ =সম্মানিত সৌন্দর্য্য\n" +
                    "                    \n" +
                    "৩৭১ আতিক জাওয়াদ=অর্থ =সম্মানিত দানশীল\n" +
                    "                    \n" +
                    "৩৭২ আতিক মাহবুব=অর্থ =সম্মানিত প্রিয় বন্ধু\n" +
                    "                    \n" +
                    "৩৭৩ আতিক মনসুর=অর্থ =সম্মানিত বিজয়ী\n" +
                    "                    \n" +
                    "৩৭৪ আতিক মাসুদ=অর্থ =সম্মানিত সৌভাগ্যবান\n" +
                    "                    \n" +
                    "৩৭৫ আতিক মোসাদ্দেক=অর্থ =সম্মানিত প্রত্যয়নকারী\n" +
                    "                    \n" +
                    "৩৭৬ আতিক মুহিব=অর্থ =সম্মানিত প্রেমিক\n" +
                    "                    \n" +
                    "৩৭৭ আতিক মুজাহিদ=অর্থ =সম্মানিত ধর্মযোদ্ধা\n" +
                    "                    \n" +
                    "৩৭৮ আতিক মুরশেদ=অর্থ =সম্মানিত পথ প্রদর্শক\n" +
                    "                    \n" +
                    "৩৭৯ আতিক শাকিল=অর্থ =সম্মানিত সুপুরুষ\n" +
                    "                    \n" +
                    "৩৮০ আতিক শাহরিয়ার=অর্থ =সম্মানিত রাজা\n" +
                    "                    \n" +
                    "৩৮১ আতিক তাজওয়ার=অর্থ =সম্মানিত রাজা\n" +
                    "                    \n" +
                    "৩৮২ আতিক ওয়াদুদ=অর্থ =সম্মানিত বন্ধু\n" +
                    "                    \n" +
                    "৩৮৩ আতিক ইয়াসির=অর্থ =সম্মানিত ধনবান\n" +
                    "                    \n" +
                    "৩৮৪ চাল-চলন=অর্থ =চাল-চলন\n" +
                    "                    \n" +
                    "৩৮৫ আওলা=অর্থ =ঘনিষ্ঠতর\n" +
                    "                    \n" +
                    "৩৮৬ আউলিয়া=অর্থ =আল্লাহর বন্ধু\n" +
                    "                    \n" +
                    "৩৮৭ আউয়াল=অর্থ =প্রথম\n" +
                    "                    \n" +
                    "৩৮৮ আয়মান=অর্থ =অত্যন্ত শুভ\n" +
                    "                    \n" +
                    "৩৮৯ আয়মান আওসাফ=অর্থ =নির্ভীক গুনাবলী\n" +
                    "                    \n" +
                    "৩৯০ আইউব=অর্থ =একজন নবীর নাম\n" +
                    "                    \n" +
                    "৩৯১ আজম=অর্থ =শ্রেষ্ঠতম\n" +
                    "                    \n" +
                    "৩৯২ আযহার=অর্থ =সুস্পষ্ট\n" +
                    "                    \n" +
                    "৩৯৩ আজীমুদ্দীন=অর্থ =দ্বীনের মুকুট\n" +
                    "                    \n" +
                    "৩৯৪ আজিজ=অর্থ =ক্ষমতাবান\n" +
                    "                    \n" +
                    "৩৯৫ আজীজ আহমদ=অর্থ =প্রশংসিত নেতা 396 আজিজুল হক=অর্থ =প্রকৃত প্রিয় পাত্র \n" +
                    "                    \n" +
                    "৩৯৬ আজীজুল ইসলাম=অর্থ =ইসলামের কল্যাণ\n" +
                    "                    \n" +
                    "৩৯৭ আজিজুর রহমান =অর্থ = দয়াময়ের উদ্দেশ্য\n" +
                    "                    \n" +
                    "৩৯৮ আব্দুল আযীয =অর্থ =পরাক্রমশালীর বান্দা\n" +
                    "                    \n" +
                    "৩৯৯  আব্দুল কারীম =অর্থ =সম্মানিতের বান্দা\n" +
                    "                    \n" +
                    "৪০০ আশিকুল ইসলাম=অর্থ = ইসলামের বন্ধু\n" +
                    "                    \n" +
                    "৪০১ আব্বাস=অর্থ =সিংহ\n" +
                    "                    \n" +
                    "৪০২ আবদুল্লাহ=অর্থ =আল্লাহর দাস\n" +
                    "                    \n" +
                    "৪০৩ আবদুল আলি=অর্থ =মহানের গোলাম\n" +
                    "                    \n" +
                    "৪০৪  আবদুল আলিম=অর্থ =মহাজ্ঞানীর গোলাম\n" +
                    "                    \n" +
                    "৪০৫ আবদুল আযীম=অর্থ =মহাশ্রেষ্ঠের গোলাম\n" +
                    "                    \n" +
                    "৪০৬ আবদুল আযীয=অর্থ =মহাশ্রেষ্ঠের গোলাম\n" +
                    "                    \n" +
                    "৪০৭ আবদুল বারী=অর্থ =সৃষ্টিকর্তার গোলাম\n" +
                    "                    \n" +
                    "৪০৮ আবদুল দাইয়ান=অর্থ =সুবিচারের দাস\n" +
                    "                    \n" +
                    "৪০৯ আবদুল ফাত্তাহ=অর্থ =বিজয়কারীর গোলাম\n" +
                    "                    \n" +
                    "৪১০ আবদুল গাফফার=অর্থ = মহাক্ষমাশীলের গোলাম\n" +
                    "                    \n" +
                    "৪১১ আবদুল গফুর=অর্থ =ক্ষমাশীলের গোলাম\n" +
                    "                    \n" +
                    "৪১২ আবদুল হাদী=অর্থ =পথপ্রর্দশকের গোলাম\n" +
                    "                    \n" +
                    "৪১৩ আবদুল হাফিজ=অর্থ =হিফাজতকারীর গোলাম\n" +
                    "                    \n" +
                    "৪১৪ আবদুল হাকীম=অর্থ =মহাবিচারকের গোলাম\n" +
                    "                    \n" +
                    "৪১৫ আজহার=অর্থ = সর্বোত্তম\n" +
                    "                    \n" +
                    "৪১৬ আমিম=অর্থ = ব্যাপক / পরিচিত\n" +
                    "                    \n" +
                    "৪১৭ আন্দালিব=অর্থ = বুলবুল\n" +
                    "                    \n" +
                    "৪১৮ আলওয়ান=অর্থ = উন্নত\n");

        }


        if (detils.equals("digitalname")) {

            textview1.setText(R.string.digitalnametitel);
            textview2.setText("শিশুদের আধুনিক নাম\n" +
                    "\n" +
                    "আযীন - সৌন্দর্য - Aazeen\n" +
                    "\n" +
                    "আব্বাস - হ্যাঁক, আন্তরিক - Abbas\n" +
                    "\n" +
                    "আব্বুদ - আল্লাহর পূজারী - Abbud\n" +
                    "\n" +
                    "আব্বুল্লা - ঈশ্বরের দাস, আল্লাহ / ভৃত্য - Abbulla\n" +
                    "\n" +
                    "আব্দাল আব্দ আল - মধ্যে variant - Abdal\n" +
                    "\n" +
                    "আব্দাল - আতি - আল্লাহর ভৃত্য - Abdal - Ati\n" +
                    "\n" +
                    "আব্দাল - আযিয - বলশালী ভৃত্য - Abdal - Aziz\n" +
                    "\n" +
                    "আব্দাল - ফাত্তাহ - শক্তি দেয় এক ভৃত্য - Abdal - Fattah\n" +
                    "\n" +
                    "আব্দাল - মুহসিন - একটি দাতব্য ভৃত্য - Abdal - Muhsin\n" +
                    "\n" +
                    "আবান-Angel নাম-Aaban\n" +
                    "\n" +
                    "আয়ীশা  - জীবনের পুরো জীবন, - Aaeesha\n" +
                    "\n" +
                    "আহিল - রাজকুমার - Aahil\n" +
                    "\n" +
                    "আলেয়াহ - ঈশ্বর সর্বশ্রেষ্ঠ উপহার - Aaleyah\n" +
                    "\n" +
                    "আনিসাহ - মেডেন - Aanisah\n" +
                    "\n" +
                    "আব্দাল - হাদি - নেতা ভৃত্য - Abdal - Hadi\n" +
                    "\n" +
                    "আব্দাল - জাবির - কম্ফ্টার ভৃত্য - Abdal - Jabir\n" +
                    "\n" +
                    "আব্দাল - জাউউাদ - উন্নতচরিত্র ভৃত্য - Abdal - Jawwad\n" +
                    "\n" +
                    "আব্দাল - কারিম - উদার একটি চাকর - Abdal - Karim\n" +
                    "\n" +
                    "আব্দাল - মাজিদ - মহিমান্বিত ভৃত্য - Abdal - Majid\n" +
                    "\n" +
                    "আব্দালরাহ্মান - দয়ালু এক ভৃত্য - Abdalrahman\n" +
                    "\n" +
                    "আব্দেল - আল্লাহ / ভৃত্য - Abdel\n" +
                    "\n" +
                    "আব্দেল - আতি - আল্লাহর ভৃত্য - Abdel - Ati\n" +
                    "\n" +
                    "আব্দেলাযিয - পরাক্রমশালী এর ভৃত্য - Abdelaziz\n" +
                    "\n" +
                    "আব্দিরাহ্মান - দানশীল ভৃত্য - Abdirahman\n" +
                    "\n" +
                    "আব্দুল - আযিয - পরাক্রমশালী এর ভৃত্য - Abdul - Aziz\n" +
                    "\n" +
                    "আব্দুল - জাব্বার - কম্ফ্টার যে এক - Abdul - Jabbar\n" +
                    "\n" +
                    "আব্দুল - কারিম - একটি অর্থী যে এক - Abdul - Karim\n" +
                    "\n" +
                    "আরিয - শালীন - Aariz\n" +
                    "\n" +
                    "আর\u200D্যান  - সর্বাধিক শক্তি - Aaryan\n" +
                    "\n" +
                    "আয়ান - দেবতা উপহার - Aayan\n" +
                    "\n" +
                    "আব্দাল - কাদির - রাষ্ট্র ভৃত্য - Abdal - Qadir\n" +
                    "\n" +
                    "আব্দাল - ড়াহিম - সকরুণ ভৃত্য - Abdal - Rahim\n" +
                    "\n" +
                    "আব্দাল - ড়াহ্মান - করুণাময় এর ভৃত্য - Abdal - Rahman\n" +
                    "\n" +
                    "আব্দলরাহেম - করুণাময় এর ভৃত্য - Abdolrahem\n" +
                    "\n" +
                    "আব্দৌল - ভৃত্য - Abdoul\n" +
                    "\n" +
                    "আব্দুয়াল - ভৃত্য - Abdual\n" +
                    "\n" +
                    "আব্দুয়াল্লা - ঈশ্বরের ভৃত্য - Abdualla\n" +
                    "\n" +
                    "আব্দুক্রাহ্মান - করুণাময় ঈশ্বরের দাস - Abdukrahman\n" +
                    "\n" +
                    "আব্দুল - ঈশ্বরের ভৃত্য, আল্লাহ / ভৃত্য - Abdul\n" +
                    "\n" +
                    "আব্দাল - ওয়াহাব - দেবার ভৃত্য -  Abdal - Wahab\n" +
                    "\n" +
                    "আব্দালাহ - ঈশ্বরের ভৃত্য - Abdalah\n" +
                    "\n" +
                    "আব্দাল্লাহ - ঈশ্বরের ভৃত্য - Abdallah\n" +
                    "\n" +
                    "আব্দেলহাদি - গাইড ভৃত্য - Abdelhadi\n" +
                    "\n" +
                    "আব্দেল্লাহ - ঈশ্বরের দাস, আল্লাহ / ভৃত্য - Abdellah\n" +
                    "\n" +
                    "আব্দাল - ড়াউফ - সকরুণ ভৃত্য -  Abdal - Rauf\n" +
                    "\n" +
                    "আব্দাল - ড়াযিক - সেবা কর্মী - Abdal - Raziq\n" +
                    "\n" +
                    "আব্দাল - শালাম - শান্তির ভৃত্য - Abdal - Salam\n" +
                    "\n" +
                    "আব্দেলরাহিম - করুণাময় এর ভৃত্য - Abdelrahim\n" +
                    "\n" +
                    "আব্দেলরাহ্মান - দানশীল ভৃত্য - Abdelrahman\n" +
                    "\n" +
                    "আব্দুল - কাদির - একটি সক্ষম মানুষ যে এক - Abdul - Qadir");

        }


        //girlname english

        if (detils.equals("girlenglish1")) {

            textview1.setText(R.string.girlenglishname1);
            textview2.setText("মেয়ে শিশুর বাংলা থেকে ইংলিশ নাম পর্ব-১\n" +
                    "\n" +
                    "১.) আফিয়া= Afhia =পূণ্যবর্তী\n" +
                    "\n" +
                    "২.) হামিদা = Hamida =প্রশংসাকারিনী\n" +
                    "\n" +
                    "৩.) ফারজানা =Farjana =বিদুষী\n" +
                    "\n" +
                    "৪.) বিলকিস =Bilkis =রানী\n" +
                    "\n" +
                    "৫.) আমিনা= Amina =বিশ্বাসী\n" +
                    "\n" +
                    "৬.) আয়েশা= Ayesha= সমৃদ্ধিশালী\n" +
                    "\n" +
                    "৭.) আনজুম= Anzum =তারা।\n" +
                    "\n" +
                    "৮.) আনতারা =Antara =বীরাঈনা\n" +
                    "\n" +
                    "৯.) আকিলা =Akila= বুদ্ধিমসিত\n" +
                    "\n" +
                    "১০.) মাজেদা =Majeda= মহতি\n" +
                    "\n" +
                    "১১.) সাহেবী =Saheby= বান্ধবী\n" +
                    "\n" +
                    "১২.) হোমায়রা =Homaira =রূপসী\n" +
                    "\n" +
                    "১৩.) সামিয়া =Samia= রোজাদার\n" +
                    "\n" +
                    "১৪.) রওশান= Rowsan= উজ্জ্বল\n" +
                    "\n" +
                    "১৫.) রাওনাফ =Rawnaf= সৌন্দর্য\n" +
                    "\n" +
                    "১৬.) শাহানা =Sahana= রাজকুমারী\n" +
                    "\n" +
                    "১৭.) রোশনী =Rosni= আলো\n" +
                    "\n" +
                    "১৮.) রুমালী =Rumali= কবুতর\n" +
                    "\n" +
                    "১৯.) রীমা =Rima =সাদা হরিণ\n" +
                    "\n" +
                    "২০.) রুম্মন =Rummon =ডালিম\n" +
                    "\n" +
                    "২১.) সাবিহা =Sabiha= রূপসী\n" +
                    "\n" +
                    "২২.) শাকিলা =Sakila =রূপবতী\n" +
                    "\n" +
                    "২৩.) শাফিয়া=Safia =মধ্যস্থতাকারিণী\n" +
                    "\n" +
                    "২৪.) সাকেরা =Sakera= কৃতজ্ঞ\n" +
                    "\n" +
                    "২৫.) সাজেদা =Sajeda =ধার্মিক\n" +
                    "\n" +
                    "২৬.) সাইদা =Saiyda= নদী\n" +
                    "\n" +
                    "২৭.) নাজীফা=Najifa= পবিত্র\n" +
                    "\n" +
                    "২৮.) নীলুফার =Nilufa= পদ্ম\n" +
                    "\n" +
                    "২৯.) নিশাত =Nitas =আনন্দ\n" +
                    "\n" +
                    "৩০.) নিরাল =Nirala= আনন্দ\n" +
                    "\n" +
                    "৩১.) নিবাল= Nibala= তীর\n" +
                    "\n" +
                    "৩২.) নুদার= Nudar= স্বর্ণ\n" +
                    "\n" +
                    "৩৩.) নুসরাত =Nusrat =সাহায্য\n" +
                    "\n" +
                    "৩৪.) পারভীন= Parvin= দিপ্তিময়তারা\n" +
                    "\n" +
                    "৩৫.) রাফিয়া =Rafia =উন্নত\n" +
                    "\n" +
                    "৩৬.) রাহিলা=Rahila =পাত্রী\n" +
                    "\n" +
                    "৩৭.) রাবিয়াহ =Rabiah= বাগান\n" +
                    "\n" +
                    "৩৮.) রাদিআহ= Radiah =সন্তুষ্টি\n" +
                    "\n" +
                    "৩৯.) রাইসা =Raisa =রানী\n" +
                    "\n" +
                    "৪০.) লামিসা= Lamia= নিরাপদ\n" +
                    "\n" +
                    "৪১.) রায়হানা =Rahana= সুগন্ধী ফুল\n" +
                    "\n" +
                    "৪২.) রাশীদা =Rashida= বিদূষী\n" +
                    "\n" +
                    "৪৩.) হুমায়রা =Hunaira= রূপসী\n" +
                    "\n" +
                    "৪৪.) লাবীবা= Labiba= জ্ঞানী\n" +
                    "\n" +
                    "৪৫.) সুখী= Sukhi =ফারিহা\n" +
                    "\n" +
                    "৪৬.) মাহবুবা= Mahbuba =প্রেমপাত্রী\n" +
                    "\n" +
                    "৪৭.) নার্গিস =Nargis= ফুলের নাম\n" +
                    "\n" +
                    "৪৮.) তামান্না =Tamanna= ইচ্ছা-আখাংকা\n" +
                    "\n" +
                    "৪৯.) জাবিরা =Jabira =রাজি হওয়া\n" +
                    "\n" +
                    "৫০.) জাদিদাহ =Jadida= নতুন \n" +
                    "\n" +
                    "৫১.) জাদওয়াহ =Jadoah= উপহার\n" +
                    "\n" +
                    "৫২.) জাহান =Jahan =পৃথিবী\n" +
                    "\n" +
                    "৫৩.) জালসান =Jalsan=বাগান\n" +
                    "\n" +
                    "৫৪.) জমিমা =Jamima =ভাগ্য\n" +
                    "\n" +
                    "৫৫.) আয়েশা=Ayasha= সমৃদ্ধিশালী\n" +
                    "\n" +
                    "৫৬.) হোমায়রা= Homaira= রূপসী\n" +
                    "\n" +
                    "৫৭.) তানজীম =Tanjeen= সুবিনাসত\n" +
                    "\n" +
                    "৫৮.) মাহফুজা= Mahfuza =নিরাপদ\n" +
                    "\n" +
                    "৫৯.) ফারহানা= Farzana =প্রান চঞ্চল");

        }
        if (detils.equals("girlenglish2")) {

            textview1.setText(R.string.girlenglishname2);
            textview2.setText("মেয়ে শিশুর বাংলা থেকে ইংলিশ নাম পর্ব-২\n" +
                    "\n" +
                    "৬০.) ফরিদা =Forida =অনুপমা\n" +
                    "\n" +
                    "৬১.) আসিয়া= Asiya =শান্তি স্থাপনকারী\n" +
                    "\n" +
                    "৬২.) আশরাফী =Asrafia =সম্মানিত\n" +
                    "\n" +
                    "৬৩.) আনিসা= Anisha= কুমারী\n" +
                    "\n" +
                    "৬৪.) আনিফা= Anifa =রূপসী\n" +
                    "\n" +
                    "৬৫.) আনোয়ারা =Anwoara =জ্যোতিকাল\n" +
                    "\n" +
                    "৬৬.) আরিফা= Arifa= প্রবল বাতাস\n" +
                    "\n" +
                    "৬৭.) আয়িশা= Ayasha =জীবন যাপন কারিণী\n" +
                    "\n" +
                    "৬৮.) তাযকিয়া= Taykia =পবিত্রতা\n" +
                    "\n" +
                    "৬৯.) তাবাসসুম =Tabassum =মুচকী হাসি\n" +
                    "\n" +
                    "৭০.) তুবা =Tuba= সুসংবাদ\n" +
                    "\n" +
                    "৭১.) তাবিয়া =Tabia= অনুগতা\n" +
                    "\n" +
                    "৭২.) তাহেরা= Tahera= পবিত্র\n" +
                    "\n" +
                    "৭৩.) শায়িরা =Sayra =কবি\n" +
                    "\n" +
                    "৭৪.) শাফিয়া =Shakira =সুস্থ\n" +
                    "\n" +
                    "৭৫.) ওয়াজিহা= Wajeha= সুন্দরী\n" +
                    "\n" +
                    "৭৬.) ওয়ামিয়া =Wamia= বৃষ্টি\n" +
                    "\n" +
                    "৭৭.) মাসরুরা =Masruba= আনন্দিতা\n" +
                    "\n" +
                    "৭৮.) নাদিরা =Nadira= বিরল\n" +
                    "\n" +
                    "৭৯.) নাজিয়া =Najea= মুক্ত\n" +
                    "\n" +
                    "৮০.) নাজিবা= Nazba= সম্মানিতা \n" +
                    "\n" +
                    "৮১.) নাফিসা =Nafisa =মূল্যবান\n" +
                    "\n" +
                    "৮২.) মামদূহা= Mamuduha= প্রশংসিতা\n" +
                    "\n" +
                    "৮৩.) মুসাররাত= Musarrat= আনন্দ\n" +
                    "\n" +
                    "৮৪.) লুবাবা =Lubaba =খাঁটি\n" +
                    "\n" +
                    "৮৫.) ফারাহ =Farah= আনন্দ\n" +
                    "\n" +
                    "৮৬.) আযরা= Ayra= কুমারী\n" +
                    "\n" +
                    "৮৭.) ঈশাত =Isat= বসবাস\n" +
                    "\n" +
                    "৮৮.) কানিজ= Kaniz =অনুগতা\n" +
                    "\n" +
                    "৮৯.) উমায়ের =Umayer= দীর্ঘায়ু বৃক্ষ\n" +
                    "\n" +
                    "৯০.) যীনাত= Jenat =সৌন্দর্য\n" +
                    "\n" +
                    "৯১.) জেবা =Jeba= যথার্থ\n" +
                    "\n" +
                    "৯২.) সীমা =Sima= কপাল\n" +
                    "\n" +
                    "৯৩.) আকলিমা= Aklima= দেশ\n" +
                    "\n" +
                    "৯৪.) সান্না =Sanna =পদ্ধতি তৈরি করা\n" +
                    "\n" +
                    "৯৫.) হেনা =Hena= মেহেদি\n" +
                    "\n" +
                    "৯৬.) তাহিয়া =Tahiya= প্রিয়তমা\n" +
                    "\n" +
                    "৯৭.) ফারযানা =Farzana= কৌশলী\n" +
                    "\n" +
                    "৯৮.) ফিরোজা =Firoza =উজ্জ্বলদ্বীপ্তি\n" +
                    "\n" +
                    "৯৯.) শামীমা =Samima= খুশবু\n" +
                    "\n" +
                    "১০০.) সুফিয়া= Sufia =আধ্যাত্নিক সাধনাকারী\n" +
                    "\n" +
                    "১০১.) সায়িমা =Samima= রোজাদার\n" +
                    "\n" +
                    "১০২.) সাদীয়া= Sadia =সৌভাগ্যবতী\n" +
                    "\n" +
                    "১০৩.) সালমা =Salma= প্রশান্ত\n" +
                    "\n" +
                    "১০৪.) তাসনিয়া =Tasnia= প্রশংসা\n" +
                    "\n" +
                    "১০৫.) তাহিরা =Tahira= সতী\n" +
                    "\n" +
                    "১০৬.) তাসনিম =Tasnim= বেহশ্তী ঝর্ণা\n" +
                    "\n" +
                    "১০৭.) ফাইরুজ =Fairuz =সমূদ্ধিশীলা \n" +
                    "\n" +
                    "১০৮.) সুরাইয়া =Suraia= সপ্তর্ষি মন্ডল\n" +
                    "\n" +
                    "১০৯.) শিরিন =Sirin= আনন্দকর\n" +
                    "\n" +
                    "১১০.) লবীবা =Labiba= জ্ঞানী\n" +
                    "\n" +
                    "১১১.) তানহা =Tanha= একা\n" +
                    "\n" +
                    "১১২.) নুসাইবা =Lusaiba= ভাগ্যবাতী\n" +
                    "\n" +
                    "১১৩.) আফিফা= Afifa =সাধ্বী\n" +
                    "\n" +
                    "১১৪.) তাহমিনা= Tahmina= মূল্যবান\n" +
                    "\n" +
                    "১১৫.) সাদিয়া =Sadia =সৌভাগ্যবতী\n" +
                    "\n" +
                    "১১৬.) হুমায়রা =Humayra =রূপসী\n" +
                    "\n" +
                    "১১৭.) ফাহমিদা =Fahmida= বুদ্ধিমতী");

        }


        //Boy Name english

        if (detils.equals("boyenglish1")) {

            textview1.setText(R.string.boyenglishname1);
            textview2.setText("ছেলে শিশুর বাংলা থেকে ইংলিশ নাম\n" +
                    "\n" +
                    "০১. আহমাদ=Ahmad = অর্থ => অধিক প্রশংসাকারী\n" +
                    "\n" +
                    "০২. আতহার=Athar = অর্থ => অতি পবিত্র\n" +
                    "\n" +
                    "০৩. আজহার=Azhar = অর্থ => প্রকাশ্য\n" +
                    "\n" +
                    "০৪. আফাক=Afacg = অর্থ => আকাশের কিনারা\n" +
                    "\n" +
                    "০৫. আফজাল=Afjal = অর্থ => বুজুর্গ, উত্তম\n" +
                    "\n" +
                    "০৬. আনসার=Anser = অর্থ => সাহায্যকারী\n" +
                    "\n" +
                    "০৭. আসিম =Asim = অর্থ => পাহারাদার\n" +
                    "\n" +
                    "০৮. আশিক=Asik = অর্থ => প্রেমিক\n" +
                    "\n" +
                    "০৯. আরিফ=Arif = অর্থ => আধ্যাত্নিক দৃষ্টি সম্পন্ন\n" +
                    "\n" +
                    "১০. এরশাদ= Arshad = অর্থ => ব্যক্তি\n" +
                    "\n" +
                    "১১. আশহাব=Ashab = অর্থ => রজ্জুপ্রাপ্ত\n" +
                    "\n" +
                    "১২. আবরার=Abrar = অর্থ => বীর\n" +
                    "\n" +
                    "১৩. আসলাম=Aslam = অর্থ => সৎ কর্মশীল\n" +
                    "\n" +
                    "১৪. আমীন=Amen = অর্থ => নিরাপদ\n" +
                    "\n" +
                    "১৫. আমীর=Ameer = অর্থ => আমানতদার\n" +
                    "\n" +
                    "১৬. আমান=Aman = অর্থ => নেতা\n" +
                    "\n" +
                    "১৭. আফসার=Afsar = অর্থ => আশ্রুয়, নিরাপত্তা\n" +
                    "\n" +
                    "১৮. আফতাব=Aftab = অর্থ => সেনাধ্যক্ষ, নেতা সূর্য\n" +
                    "\n" +
                    "১৯. আবরিশাম=Abrisham = অর্থ => রেশমী\n" +
                    "\n" +
                    "২০. আবইয়াজ=Abyaz = অর্থ => শুভ্র, সাদা\n" +
                    "\n" +
                    "২১. আতকিয়া=Atqiya = অর্থ => পুণ্যবান\n" +
                    "\n" +
                    "২২. আসাস= Asas = অর্থ => আসবাবপত্র\n" +
                    "\n" +
                    "২৩. আসার =Asar = অর্থ => চিহ্ন\n" +
                    "\n" +
                    "২৪. আসীর=Aseer অগ্রগণ্য, মহান\n" +
                    "\n" +
                    "২৫. আসমার=Asmar = অর্থ => ফলসমূহ\n" +
                    "\n" +
                    "২৬. আজমাল=Ajmal = অর্থ => অতিসুন্দর\n" +
                    "\n" +
                    "২৭. আজওয়াদ=Ajwad = অর্থ => অতি উত্তম\n" +
                    "\n" +
                    "২৮. আজবাল=Azbal = অর্থ => পাহাড়সমূহ\n" +
                    "\n" +
                    "২৯. আজমাইন=Ajmain = অর্থ => পরিপূর্ণ\n" +
                    "\n" +
                    "৩০. আজমল=Ajmal = অর্থ => নিখুর্ত, সুন্দর\n" +
                    "\n" +
                    "৩১. আহবাব=Ahbab = অর্থ => বন্ধু-বান্ধব\n" +
                    "\n" +
                    "৩২. আহরার=Ahrar = অর্থ => আজাদী প্রাপ্তগণ\n" +
                    "\n" +
                    "৩৩. আহসান=Ahsan = অর্থ => উৎকৃষ্ট\n" +
                    "\n" +
                    "৩৪. আহকাম=Ahkam = অর্থ => অত্যন্ত মজবুত\n" +
                    "\n" +
                    "৩৫. আহমদ=Ahmad = অর্থ => অধিক প্রশংসাকারী\n" +
                    "\n" +
                    "৩৬. আহমার=Ahmar = অর্থ => অধিক লাল, রক্ত বর্ণ\n" +
                    "\n" +
                    "৩৭. আখতাব=Akhtab = অর্থ => পটু, বাগ্মী\n" +
                    "\n" +
                    "৩৮. আখফাশ=Akhfash = অর্থ => মধ্যযুগের প্রখ্যাত বৈরাক করণিকা ভাষা আত্তিবকা।\n" +
                    "\n" +
                    "৩৯. আখলাক=Akhlak = অর্থ => চারিত্রিক গুণাবলী\n" +
                    "\n" +
                    "৪০. আখতার=Akhtar = অর্থ => তারকা\n" +
                    "\n" +
                    "৪১. আখদার=Akahzar = অর্থ => সবুজ বর্ণ\n" +
                    "\n" +
                    "৪২. আখিয়ার=Akhyar = অর্থ => সুন্দর মানব\n" +
                    "\n" +
                    "৪৩. আদম=Adam = অর্থ => প্রথম মানব এবং নবীর নাম\n" +
                    "\n" +
                    "৪৪. আদীব=Adib = অর্থ => সাহিত্যিক, ভাষাবিদ\n" +
                    "\n" +
                    "৪৫. আদহাম=Adham = অর্থ => বিখ্যাত সাধক যিনি\n" +
                    "\n" +
                    "৪৬. আরশাদ=Arshad = অর্থ => পূর্বে বাদশা ছিলেন\n" +
                    "\n" +
                    "৪৭. আরাক্কু=Araccu = অর্থ => আধিক উজ্জল\n" +
                    "\n" +
                    "৪৮. আরকাম=Arcam = অর্থ => বিশিষ্ট সাহাবীর নাম\n" +
                    "\n" +
                    "৪৯. আরহাম=Arham = অর্থ => অতীব দয়ালু\n" +
                    "\n" +
                    "৫০. আরমান=Arman = অর্থ => বাসনা ৫১. আরজু=Arzu = অর্থ => আকাঙ্কা দেয়া জ্ঞানী\n" +
                    "\n" +
                    "৫২. আরজ=Arz = অর্থ => ফুল, ফুলের কলি\n" +
                    "\n" +
                    "৫৩. আরীব =Arib = অর্থ => অতি উজ্জল, মিসরের\n" +
                    "\n" +
                    "৫৪. আযহার=Azhar = অর্থ => বিখ্যাত বিশ্ববিদ্যালয়\n" +
                    "\n" +
                    "৫৫. আযহার=Azhar = অর্থ => নীন, আকাশী রং\n" +
                    "\n" +
                    "৫৬. আযরাক=Azrac = অর্থ => তুলনাহীন সুগন্ধি\n" +
                    "\n" +
                    "৫৭. আজফার=Ajfar = অর্থ => সিংহ\n" +
                    "\n" +
                    "৫৮. আসাদ=Asad = অর্থ => রহস্যাবলী \n" +
                    "\n" +
                    "৬০. আসআদ=Asad = অর্থ => অতি সৌভাগ্যবান\n" +
                    "\n" +
                    "৬১. আসলাম=Aslam = অর্থ => নিরাপদ\n" +
                    "\n" +
                    "৬২. আসনাফু =Asnaf = অর্থ => বিভিন্ন ধরনের\n" +
                    "\n" +
                    "৬৩. আসীফ=Asif = অর্থ => দুশ্চিন্ত গ্রস্থ\n" +
                    "\n" +
                    "৬৪. আশজা=Ashja = অর্থ => অতি সাহসী\n" +
                    "\n" +
                    "৬৫. আশরাফ=Ashraf = অর্থ => অভিজাত বৃন্দ\n" +
                    "\n" +
                    "৬৬. আশফাক=Ashfac = অর্থ => অধিক স্নেহশীল\n" +
                    "\n" +
                    "৬৭. আশরাফ=Ashraf = অর্থ => অতি ভদ্র\n" +
                    "\n" +
                    "৬৮. আশহাদ=Ashhad = অর্থ => অধিক সাক্ষ্যদানকারী\n" +
                    "\n" +
                    "৬৯. আসগার=Asghar = অর্থ => ক্ষুদ্রতম, ছোট\n" +
                    "\n" +
                    "৭০. আসিল= Asil = অর্থ => উত্তম বংশের উত্তম");

        }

        if (detils.equals("boyenglish2")) {

            textview1.setText(R.string.boyenglishname2);
            textview2.setText("ছেলেদের বাংলা-ইংলিশ নাম পর্ব-২\n" +
                    "\n" +
                    "৭১. আসিফ=Asif = অর্থ => যোগ্যব্যক্তি\n" +
                    "\n" +
                    "৭২. আতহার=Athar = অর্থ => অতিপবিত্র\n" +
                    "\n" +
                    "৭৩. আতওয়ার=A twar = অর্থ => চালচলন\n" +
                    "\n" +
                    "৭৪. আতইয়াব=Atyab = অর্থ => সুবাসিত, পবিত্রতম\n" +
                    "\n" +
                    "৭৫. আযহার=Azhar = অর্থ => অধিক সুস্পষ্ট\n" +
                    "\n" +
                    "৭৬. আজরফ=Azraf = অর্থ => সুচতুর অতি বুদ্ধিমান\n" +
                    "\n" +
                    "৭৭. আজফার=Azfar = অর্থ => অধিক বিজয়\n" +
                    "\n" +
                    "৭৮. আজ’জম=Azam = অর্থ => মধ্যবর্তী স্থান\n" +
                    "\n" +
                    "৭৯. আ’শা= Asha = অর্থ => শ্রেষ্ঠতম\n" +
                    "\n" +
                    "৮০. আগলাব=Aglab = অর্থ => রাতকানা\n" +
                    "\n" +
                    "৮১. আ’ওয়ান=A’oan = অর্থ => শক্তিশালী-বিজয়ী\n" +
                    "\n" +
                    "৮২. আফলাহ=Afin = অর্থ => সাহায্যকারী\n" +
                    "\n" +
                    "৮৩. আফযাল=Afdhal = অর্থ => অধিক কল্যাণকর উত্তম\n" +
                    "\n" +
                    "৮৪. আফলাতুন=Aflatoon = অর্থ => বিখ্যাতগ্রী চিকিৎসক\n" +
                    "\n" +
                    "৮৫. ইফতিহার=Iftikhar = অর্থ => গৌরবান্বিতবোধ করা\n" +
                    "\n" +
                    "৮৬. আকতাব=Aftab = অর্থ => দিকপাল, মেরু\n" +
                    "\n" +
                    "৮৭. আকমার=Akmar = অর্থ => অতি উজ্জল\n" +
                    "\n" +
                    "৮৮. আকদাস=Aqdas = অর্থ => অত্যন্ত পবিত্র\n" +
                    "\n" +
                    "৮৯. আকরাম=Akram = অর্থ => অতিদানশীল\n" +
                    "\n" +
                    "৯০. আকরাম=Akram = অর্থ => দয়াশীল\n" +
                    "\n" +
                    "৯১. আকমাল=Akmal = অর্থ => পরিপূর্ণ\n" +
                    "\n" +
                    "৯২. আকবার=Akbar = অর্থ =>  শ্রেষ্ঠ\n" +
                    "\n" +
                    "৯৩. আলতাফ=Altaf = অর্থ => অনুগ্রহাদি\n" +
                    "\n" +
                    "৯৪. আলমাস=Almas = অর্থ => মূল্যবান পাথর, হীরা\n" +
                    "\n" +
                    "৯৫. আমানত=Amanat = অর্থ => গচ্ছিত ধন, আমানত\n" +
                    "\n" +
                    "৯৬. আমীর= Amir = অর্থ => নির্দেশদাতা\n" +
                    "\n" +
                    "৯৭. আমান =Aman = অর্থ => শান্তি নিরাপত্তা\n" +
                    "\n" +
                    "৯৮. আমীর =Amir = অর্থ => নেতা, দলপতি\n" +
                    "\n" +
                    "৯৯. আমজাদ=Amjad = অর্থ => সম্মানিত\n" +
                    "\n" +
                    "১০০. আমীন=Amin = অর্থ => বিশ্বস্ত, আমানতদার ১০১. আনীস=Anis = অর্থ => অন্তরঙ্গ বন্ধু\n" +
                    "\n" +
                    "১০২. আঞ্জুম=Anjum = অর্থ => সেতারা, তারকা\n" +
                    "\n" +
                    "১০৩. আঞ্জাম=Anzam = অর্থ => সম্পাদন\n" +
                    "\n" +
                    "১০৪. আনোয়ার=Anwar = অর্থ => উজ্জল, জ্যোতির্ময়\n" +
                    "\n" +
                    "১০৫. আওসাফ=Awsaf = অর্থ => গুণাবলি\n" +
                    "\n" +
                    "১০৬. আওলিয়া=Awlia = অর্থ => মহাপুরুষগণ\n" +
                    "\n" +
                    "১০৭. আউয়াল=Awwal = অর্থ => প্রথম\n" +
                    "\n" +
                    "১০৮. আইমান=Ayman = অর্থ => দক্ষিণ, সৌভাগ্যমান\n" +
                    "\n" +
                    "১০৯. আইউব=Ayyub = অর্থ => বিখ্যাত একজন নবীর নাম\n" +
                    "\n" +
                    "১১০. আমানুল্লাহ=Amanulla = অর্থ => আল্লাহর প্রদত্ত নিরাপত্তা\n" +
                    "\n" +
                    "১১১. আছরী=Asri = অর্থ => সম্পদশালী\n" +
                    "\n" +
                    "১১২. আওয়ায়েস =Awaish = অর্থ => বিখ্যাত সাহাবীর নাম\n" +
                    "\n" +
                    "১১৩. আমরুদ=Amrud = অর্থ => পেয়ারা\n" +
                    "\n" +
                    "১১৪. আহসান হাবীব=Ahsan habib = অর্থ => উত্তম/ভালো বন্ধু\n" +
                    "\n" +
                    "১১৫. আতহার ইশরাক্ব=Athar Ishaq = অর্থ => অতি পবিত্র সকাল\n" +
                    "\n" +
                    "১১৬. আশফাক্ব হাবীব=Ashfaq Habib = অর্থ => অধিক স্নেহশীল বন্ধু\n" +
                    "\n" +
                    "১১৭. আবিদ=Abid = অর্থ => ভক্ত, ইবাদতকারী\n" +
                    "\n" +
                    "১১৮. আদিল=Adil = অর্থ => ন্যায় বিচারক\n" +
                    "\n" +
                    "১১৯. আরিজ=Arij = অর্থ => উঙ্খানকারী\n" +
                    "\n" +
                    "১২০. আরিফ=Arif = অর্থ => জ্ঞানী\n" +
                    "\n" +
                    "১২১. আশিক=Ashik = অর্থ => প্রেমিক\n" +
                    "\n" +
                    "১২২. আসিম=Asim = অর্থ => নিরাপদ-পুণ্যবান\n" +
                    "\n" +
                    "১২৩. আতেফ=Atif = অর্থ => সহনুভূত্তিশীল\n" +
                    "\n" +
                    "১২৪. আকিব=Aqib = অর্থ => অনুগামী\n" +
                    "\n" +
                    "১২৫. আকিফ=Akif = অর্থ => উপাসক, সাধক\n" +
                    "\n" +
                    "১২৬. আলিম=Alim = অর্থ => বুদ্ধিমান\n" +
                    "\n" +
                    "১২৭. আলী= Ali = অর্থ => উচ্চ, উন্নত\n" +
                    "\n" +
                    "১২৮. আব্বাস=Abbas = অর্থ => সিংহ\n" +
                    "\n" +
                    "১২৯. আবদ=Abd = অর্থ => সেবক, প্রার্থনাকারী\n" +
                    "\n" +
                    "১৩০. আবীর=Abir = অর্থ => সুগন্ধি\n" +
                    "\n" +
                    "১৩১. আবদুহু=Abduhu = অর্থ => আল্লাহর বান্দা\n" +
                    "\n" +
                    "১৩২. আতবান=Atban = অর্থ => উপদেশ দাতা\n" +
                    "\n" +
                    "১৩৩. আতিক=Atiq = অর্থ => সম্মানিত\n" +
                    "\n" +
                    "১৩৪. আদীল=Adeel = অর্থ => সাদৃশ ন্যায়বিচার\n" +
                    "\n" +
                    "১৩৫. আদী =Ade = অর্থ => যোদ্দা-জাতি\n" +
                    "\n" +
                    "১৩৬. আদনান= Adnan = অর্থ => রাসুলুল্লাহ সা এর পিতামহের নাম\n" +
                    "\n" +
                    "১৩৭. আরিফ=Areef = অর্থ => নেতা, জ্ঞানী\n" +
                    "\n" +
                    "১৩৮. আযীয=Aziz = অর্থ => শক্তিশালী\n" +
                    "\n" +
                    "১৩৯. আত্তার=Attar = অর্থ => আতর বিক্রেতা\n" +
                    "\n" +
                    "১৪০. আতা= Ata = অর্থ => দান");

        }


        if (detils.equals("boyenglish3")) {

            textview1.setText(R.string.boyenglishname3);
            textview2.setText("\n" +
                    "ছেলেদের বাংলা-ইংলিশ নাম পর্ব-৩\n" +
                    "\n" +
                    "১৪১. আতাউল্লাহ= Ataullah = অর্থ => আল্লাহ প্রদত\n" +
                    "\n" +
                    "১৪২. আতুফ=Atuf = অর্থ => দয়ালু, সহানুভূতিশীল\n" +
                    "\n" +
                    "১৪৩. আযীম=Azim = অর্থ => মহান বিরাট\n" +
                    "\n" +
                    "১৪৪. আরাফাত=Arafat = অর্থ => নেতৃত্ব, নেতৃত্ব লাভ করা\n" +
                    "\n" +
                    "১৪৫. আফাফ=Afaf = অর্থ => সাধুতা\n" +
                    "\n" +
                    "১৪৬. আফীফ=Afif = অর্থ => সৎপুণ্যবান\n" +
                    "\n" +
                    "১৪৭. আকীদ=Aqid = অর্থ => চুক্তি\n" +
                    "\n" +
                    "১৪৮. আকীল=Aqil = অর্থ => নিপুণ, বুদ্ধিমান\n" +
                    "\n" +
                    "১৪৯. আলী =Ali = অর্থ => সুমহান\n" +
                    "\n" +
                    "১৫০. আলী আরমান=Ali Arman = অর্থ => উচ্চ আকাঙ্ক্ষা\n" +
                    "\n" +
                    "১৫১. আলওয়ান=Alwan = অর্থ => উন্নত\n" +
                    "\n" +
                    "১৫২. আল্লাম=Allam = অর্থ => অধিক জ্ঞানী\n" +
                    "\n" +
                    "১৫৩. আলা =Ala = অর্থ => উচ্চ\n" +
                    "\n" +
                    "১৫৪. আলকামা=Alcakam = অর্থ => তিক্ত\n" +
                    "\n" +
                    "১৫৫. আম্মার=Ammar = অর্থ => দীর্ঘজীবী\n" +
                    "\n" +
                    "১৫৬. আমীদ=Ameed = অর্থ => সর্দার, নেতা\n" +
                    "\n" +
                    "১৫৭. আমীম=Ameem = অর্থ => ব্যাপক, সম্প্রসারণশীল\n" +
                    "\n" +
                    "১৫৮. আন্দালীব=Andalib = অর্থ => বুল বুল\n" +
                    "\n" +
                    "১৫৯. আন্দাল=Andal = অর্থ => সাহায্য\n" +
                    "\n" +
                    "১৬০. আওন=Awon = অর্থ => বাদ্য বাদক\n" +
                    "\n" +
                    "১৬১. আওয়াদ=Awad = অর্থ => ভাগ্য, সিংহ\n" +
                    "\n" +
                    "১৬২. আওফ=Auf = অর্থ => একজন সাহাবীর নাম\n" +
                    "\n" +
                    "১৬৩. আয়াজ আয়াজ=Ayad ayaz = অর্থ => বিনিময়\n" +
                    "\n" +
                    "১৬৪. আমর=Amar = অর্থ => জীবন\n" +
                    "\n" +
                    "১৬৫. আজীব=Azeeb = অর্থ => আশ্চর্যজনক\n" +
                    "\n" +
                    "১৬৬. আলাওয়াহ=Alawah = অর্থ => ছাড়া ব্যতীত\n" +
                    "\n" +
                    "১৬৭. আদীব মাহমুদ=Adib Mahmood = অর্থ => প্রমংসনীয় সাহিত্যিক\n" +
                    "\n" +
                    "১৬৮. আসআদ আল আদিল=Asad al adil = অর্থ => ভাগ্যবান ন্যায় বিচারক\n" +
                    "\n" +
                    "১৬৯. আশরাফ হুসাইন=Ashraf Hossain = অর্থ => অত্যন্ত ভদ্র, সুন্দর\n" +
                    "\n" +
                    "১৭০. আবরার জাওয়াদ=Abrar Zawad = অর্থ => পুন্যবান দানশীল\n" +
                    "\n" +
                    "১৭১. আবরার ফাহীম=Abrar Fahim = অর্থ => পুন্যবান বুদ্ধিমান\n" +
                    "\n" +
                    "১৭২. আবরার ফাহাদ=Abrar fahad = অর্থ => পুণ্যবান সিংহ\n" +
                    "\n" +
                    "১৭৩. আবুল খায়ের মোহাম্মদ=Abulkhair Mohammod = অর্থ => খ্যাতিমান কল্যাণের পিতা\n" +
                    "\n" +
                    "১৭৪. আতিকওয়াদুদ=Atiq wadud = অর্থ => সম্মানিত বন্ধু\n" +
                    "\n" +
                    "১৭৫. আবদুল মুহীত=Abdul Muhet = অর্থ => বেষ্টনকারীর দাস\n" +
                    "\n" +
                    "১৭৬. আশিক বিল্লাহ=Ahsik Billah = অর্থ => আল্লাহর প্রেমিক\n" +
                    "\n" +
                    "১৭৭. আমজাদ নাদিম=Amzad Nadim = অর্থ => বেশী সম্মানিত সঙ্গী\n" +
                    "\n" +
                    "১৭৮. আফনাফ হাবীব=Afnaf habib = অর্থ => ধর্ম বিশ্বাসী বন্ধু\n" +
                    "\n" +
                    "১৭৯. আফিফুল ইসলাম=Arif Ul Islam = অর্থ => আধ্যাত্মিক জ্ঞান সম্পন্ন ব্যক্তি ১৮০. আবরার ফাসী=Abrar fasi = অর্থ => পুণ্যবান বিশুদ্ধ ভাষী\n" +
                    "\n" +
                    "১৮১. আজমল ফুয়াদ=Azmal Fuad = অর্থ => অতি সৌন্দর্যময় অন্তর\n" +
                    "\n" +
                    "১৮২. আতিক আযীয=Atique aziz = অর্থ => দয়ালু, ক্ষমতাবান\n" +
                    "\n" +
                    "১৮৩. আব্দুল মুনইম=Abdul menyeem = অর্থ => ধনাঢ্যের বান্দা\n" +
                    "\n" +
                    "১৮৪. আনীসুজ্জামান=Anisuzzaman = অর্থ => জগতের বন্ধু\n" +
                    "\n" +
                    "১৮৫. আছরা মাহমুদ=Asra Mahmood = অর্থ => সম্পদশালী প্রশংসিত\n" +
                    "\n" +
                    "১৮৬. আত্তাব হুসাইন=Attab Hossain = অর্থ => চরিত্রবান সুন্দর\n" +
                    "\n" +
                    "১৮৭. আরশাদুল হক=Arshad ul Haqu = অর্থ => সত্যের পথ প্রদর্শনকারী\n" +
                    "\n" +
                    "১৮৮. আসগার আলী=Asgar Ali = অর্থ => অত্যধিক ছোট মহৎ\n" +
                    "\n" +
                    "১৮৯. আরিফ মাহমুদ=Arif Mahmood = অর্থ => অভিজ্ঞ প্রশংসনীয়\n" +
                    "\n" +
                    "১৯০. আকিল উদ্দিন=Akil uddin = অর্থ => দ্বীনের বিচক্ষণ ব্যক্তি\n" +
                    "\n" +
                    "১৯১. আযহারূল ইসলাম=Azharul islam = অর্থ => ইসলামের ফুল\n" +
                    "\n" +
                    "১৯২. আদিল মাহমুদ=Adil mahmood = অর্থ => প্রশংসিত বুদ্ধিমান\n" +
                    "\n" +
                    "১৯৩. আলমাস উদ্দীন=Almas Uddin = অর্থ => দ্বীনের হীরক\n" +
                    "\n" +
                    "১৯৪. আরীব মাহমুদ=Arib mahmood = অর্থ => প্রশংসিত বুদ্ধিমান\n" +
                    "\n" +
                    "১৯৫. আব্বাস উদ্দিন=Abbas Uddin = অর্থ => দ্বীনের বীর পুরুষ\n" +
                    "\n" +
                    "১৯৬. আসিফ মাসউদ=Asif Masud = অর্থ => যোগ্য বক্তি সৌভাগ্যবান\n" +
                    "\n" +
                    "১৯৭. আত্বীক হামীদ=Atecque hamid = অর্থ => সম্ভ্রান্ত প্রশংসাকারী\n" +
                    "\n" +
                    "১৯৮. আদিল আহনাফ=Adil Ahnaf = অর্থ => ন্যায়পরায়ণ ধার্মিক\n" +
                    "\n" +
                    "১৯৯. আনওয়ারূল হক=Anwarul Haq = অর্থ => সত্যের জ্যোতিমালা\n" +
                    "\n" +
                    "২০০. আনওয়ারুল আজীম=Anwarul = অর্থ => azim = অর্থ => বিরাট জ্যোতিমালা\n" +
                    "\n" +
                    "২০১. আব্দুল্লাহ আল মতী= Abdulla Al-Muti = অর্থ => আল্লাহর অনুগত বান্দা\n" +
                    "\n" +
                    "২০২. আফাকুজ্জামান=Afaqnzzama = অর্থ => আকাশের কিনারা\n" +
                    "\n" +
                    "২০৩. আলমগীর=Alamgeer = অর্থ => বিশ্বজয়ী\n" +
                    "\n" +
                    "২০৪. আলমগীর কবির=Alamgeerkabir = অর্থ => বিশ্বজয়ীমহৎ\n" +
                    "\n" +
                    "২০৫. আলমগীর হোসাইন=Alamgeer Hossain = অর্থ => উত্তম বিশ্বজয়ী\n" +
                    "\n" +
                    "২০৬. আহমাদ আলী=Ahmad Ali = অর্থ => উত্তম প্রশংসাকারী\n" +
                    "\n" +
                    "২০৭. আমজাদ আলী=Amzad Ali = অর্থ => দৃঢ় উন্নত\n" +
                    "\n" +
                    "২০৮. আমজাদ হোসাইন=Amzad Hossain = অর্থ => দৃঢ় সুন্দর\n" +
                    "\n" +
                    "২০৯. আকবর আলী=Akbar Ali = অর্থ => বড় সুন্দর\n" +
                    "\n" +
                    "২১০. আতহার আলী=Athar Ali = অর্থ => অতি উন্নত পবিত্র\n" +
                    "\n" +
                    "২১১. আব্বাস আলী=Abbas Ali = অর্থ => শক্তিশালী বীরপুরুষ\n" +
                    "\n" +
                    "২১২. আসাদুজ্জামান=Asaduzz Amman = অর্থ => যুগের সিংহ\n" +
                    "\n" +
                    "২১৩. আজিজুল হক=Azizul Haque = অর্থ => সৃষ্টিকর্তার প্রিয়\n" +
                    "\n" +
                    "২১৪. আজাহার উদ্দিন=Azhar uddin = অর্থ => ধর্মের ফুলসমূহ\n" +
                    "\n" +
                    "২১৫. আহমদ শিহাব=Ahmed Shihab = অর্থ => অতি প্রশংসাকারী তারকা\n" +
                    "\n" +
                    "২১৬. আবিদ উল্লাহ=Abid ullah = অর্থ => আল্লাহর ইবাদতকারী\n" +
                    "\n" +
                    "২১৭. আতিক মোসাদ্দিক=Atik Mosaddik = অর্থ => সম্মানিত প্রত্যায়নকারী\n" +
                    "\n" +
                    "২১৮.\n" +
                    "\n" +
                    "Arafat A1, [1/6/2023 3:14 AM]\n" +
                    "আতিক হাবীব=Artik habib = অর্থ => সম্মানিত বন্ধু\n" +
                    "\n" +
                    "২১৯. আরিফ সাদিক=Arif Sadik = অর্থ => সত্যবান জ্ঞানী\n" +
                    "\n" +
                    "২২০. আরিফ জামাল=Arif Jamal = অর্থ => সৌন্দর্যময় তত্ত্ব জ্ঞানী\n" +
                    "\n" +
                    "২২১. আবু হানিফ=Abu Hanif = অর্থ => হানিফার পিতা\n" +
                    "\n" +
                    "২২২. আতহার ইশতিয়াক=Athar Ishtiyak = অর্থ => অতি পবিত্র অনুরাগ\n" +
                    "\n" +
                    "২২৩. আসির ফায়সাল=Aseer Faisal = অর্থ => সম্মানিত বিচারক\n" +
                    "\n" +
                    "২২৪. আমির ফয়সাল=Amir Faisal = অর্থ => মাসকের পিতা\n" +
                    "\n" +
                    "২২৫. আনোয়ার হুসাইন =Anwar Hossain = অর্থ => সুন্দর জ্যোতির সৌভাগ্যবান বান্দা\n" +
                    "\n" +
                    "২২৬. আরিফ বখতিয়ার= Arif Bakhtiar = অর্থ => তত্ত্বজ্ঞ্যানী সৌভাগ্যবান\n" +
                    "\n" +
                    "২২৭. আজরাফ ফাহীম= Azraf Fahim = অর্থ => সুচতুর বুদ্ধিমান\n" +
                    "\n" +
                    "২২৮. আতিক মুর্শিদ=Atik Murshed = অর্থ => স্বাধীন পথ প্রদর্শক\n" +
                    "\n" +
                    "২২৯. আহমদ শরীফ=Ahmad Sharif = অর্থ => অতি প্রশংশিত ভদ্র\n" +
                    "\n" +
                    "২৩০. আনিসুর রহমান=Anisur Rahman = অর্থ => বন্ধুত্ত্বপ রায়ন করুনাময়");


        }


        if (detils.equals("popularboyname")) {

            textview1.setText(R.string.boypopulartitel);
            textview2.setText("বাংলাদেশে জনপ্রিয় ছেলেদের নাম\n" +
                    "\n" +
                    "১ ) অকম্প - অর্থ - স্থির\n" +
                    "\n" +
                    "২ ) অগ্নিধ্র - অর্থ - জম্বুদ্বীপের রাজা প্রিয়ব্রতর জ্যেষ্ঠপুত্র \n" +
                    "\n" +
                    "৩ ) অচিন্ত্য - অর্থ - চিন্তার বাইরে\n" +
                    "\n" +
                    "৪ ) অচ্যুত - অর্থ - যাকে ধবংস করা যায় না\n" +
                    "\n" +
                    "৫ ) অজিতাভ - অর্থ - যে আকাশ জয় করেছে\n" +
                    "\n" +
                    "৬ ) অজিন - অর্থ - মৃগচগর্ম\n" +
                    "\n" +
                    "৭ ) অজেয় - অর্থ - জয়করা যায় না এমন\n" +
                    "\n" +
                    "৮ ) অঞ্চিত - অর্থ - পূজিত, ভূষিত\n" +
                    "\n" +
                    "৯ ) অঞ্জন - অর্থ - চক্ষুর প্রসাধনদ্রব্য\n" +
                    "\n" +
                    "১০ ) অতনু - অর্থ - দেহশূন্য, অনঙ্গদেব\n" +
                    "\n" +
                    "১১ ) অতন্দ্র - অর্থ - সজাগ\n" +
                    "\n" +
                    "১২ ) অতিমান - অর্থ - অপরিমিত\n" +
                    "\n" +
                    "১৩ ) অত্রি - অর্থ - ঋগ্বেদের মন্ত্রদ্রষ্টা ঋষিদের অন্যতম \n" +
                    "\n" +
                    "১৪ ) অদেয় - অর্থ - দেওয়ার অসাধ্য \n" +
                    "\n" +
                    "১৫ ) অধীশ - অর্থ - সম্রাট \n" +
                    "\n" +
                    "১৬ ) অনঘ - অর্থ - পাপহীন\n" +
                    "\n" +
                    "১৭ ) অনন্য - অর্থ - অদ্বিতীয়, অভিন্ন\n" +
                    "\n" +
                    "১৮ ) অনিকেত - অর্থ - গৃহহীন\n" +
                    "\n" +
                    "১৯ ) অনিন্দ্য - অর্থ - নিন্দনীয় নয়\n" +
                    "\n" +
                    "২০ ) অনিরুদ্ধ - অর্থ - অনর্গল, রোধহীন\n" +
                    "\n" +
                    "২১ ) অনীক - অর্থ - সৈন্যদল\n" +
                    "\n" +
                    "২২ ) অনুব্রত - অর্থ - অনুকুল ব্রত যার\n" +
                    "\n" +
                    "২৩ ) অনুমিত - অর্থ - অনুমান, ব্যাপ্তিজ্ঞান দ্বারা লব্ধ জ্ঞান \n" +
                    "\n" +
                    "২৪ ) অবনীশ - অর্থ - পৃথিবীর রাজা \n" +
                    "\n" +
                    "২৫ ) অব্জ - অর্থ - চন্দ্র, পদ্ম\n" +
                    "\n" +
                    "২৬ ) অভিজাত - অর্থ - ভালো বংশ জাত\n" +
                    "\n" +
                    "২৭ ) অভিজিৎ - অর্থ - নক্ষত্রবিশেষ\n" +
                    "\n" +
                    "২৮ ) অভিনব - অর্থ - নতুন, আগে দেখা যায় নি\n" +
                    "\n" +
                    "২৯ ) অভিলাষ - অর্থ - বাসনা, ইচ্ছা\n" +
                    "\n" +
                    "৩০ ) অভিষেক - অর্থ - রাজসিংহাসনে স্থাপনের অনুষ্ঠান. অবগাহন \n" +
                    "\n" +
                    "৩১ ) অভ্যুদয় - অর্থ - উদীয়মান\n" +
                    "\n" +
                    "৩২ ) অভ্র - অর্থ - মেঘ, আকাশ, এক রকমের খনিজ \n" +
                    "\n" +
                    "৩৩ ) অমর্ক- অর্থ - দৈত্যগুরু শুক্রাচার্যের পুত্র\n" +
                    "\n" +
                    "৩৪ ) অমিত - অর্থ - অপরিমিত\n" +
                    "\n" +
                    "৩৫ ) অমিয় - অর্থ - অমৃত\n" +
                    "\n" +
                    "৩৬ ) অমৃত - অর্থ - মৃত্যুহীন\n" +
                    "\n" +
                    "৩৭ ) অমেয়- অর্থ - মহান\n" +
                    "\n" +
                    "৩৮ ) অম্বুজ - অর্থ - জলজাত\n" +
                    "\n" +
                    "৩৯ ) অম্বুদ - অর্থ - যে জল দেয়\n" +
                    "\n" +
                    "৪০ ) অম্লান - অর্থ - তাজা\n" +
                    "\n" +
                    "৪১ ) অয়ন - অর্থ - শাস্ত্র, বূ্যহপথ, ভহোমি\n" +
                    "\n" +
                    "৪২ ) অরণি- অর্থ - চকমকি পাথর\n" +
                    "\n" +
                    "৪৩ ) অরণ্য - অর্থ - কানন, বন\n" +
                    "\n" +
                    "৪৪ ) অরবিন্দ - অর্থ - পদ্ম\n" +
                    "\n" +
                    "৪৫ ) অরিজিৎ - অর্থ - শত্রুদমনকারক\n" +
                    "\n" +
                    "  ৪৬ ) অরিত্র- অর্থ - দাঁড়, নৌকো\n" +
                    "\n" +
                    "৪৭ ) অরিন্দম - অর্থ - শত্রুদমনকারক\n" +
                    "\n" +
                    "৪৮ ) অরূপ - অর্থ - নিরাকার\n" +
                    "\n" +
                    "৪৯ ) অর্ক - অর্থ - সূর্য\n" +
                    "\n" +
                    "৫০ ) অর্ণব - অর্থ - জলযুক্ত");

        }


        if (detils.equals("populargirlanme")) {

            textview1.setText(R.string.girlpopulartitel);
            textview2.setText("বাংলাদেশে জনপ্রিয় মেয়েদের নাম\n" +
                    "\n" +
                    "১ ) অচলা - অর্থ - গতিহীন\n" +
                    "\n" +
                    "২ ) অচিরা - অর্থ - ক্ষণস্থায়ী\n" +
                    "\n" +
                    "৩ ) অজন্তা - অর্থ - গুহাবিশেষ\n" +
                    "\n" +
                    "৪ ) অজপা - অর্থ - বিনা আয়াসে\n" +
                    "\n" +
                    "৫ ) অজলা - অর্থ - পৃথিবী\n" +
                    "\n" +
                    "৬ ) অঞ্চিতা - অর্থ - পুজনীয়া\n" +
                    "\n" +
                    "৭ ) অঞ্জনা - অর্থ - শাপভ্রষ্টা অপ্সরা, ঈশানদিকের দিককারিণী, হনুমানের জননী \n" +
                    "\n" +
                    "৮ ) অঞ্জলি - অর্থ - যুক্তকর\n" +
                    "\n" +
                    "৯ ) অণিমা - অর্থ - সূক্ষ্মত্ব\n" +
                    "\n" +
                    "১০ ) অতন্দ্রিতা - অর্থ - আলস্যহীনা\n" +
                    "\n" +
                    "১১ ) অতসী - অর্থ - পুষ্পবিশেষ\n" +
                    "\n" +
                    "১২ ) অদিতি - অর্থ - দক্ষ প্রজাপতির কন্যা, কশ্যপের স্ত্রী \n" +
                    "\n" +
                    "১৩ ) অদ্রিকা - অর্থ - অপ্সরা\n" +
                    "\n" +
                    "১৪ ) অনন্যা - অর্থ - একমাত্র, অদ্বিতীয়\n" +
                    "\n" +
                    "১৫ ) অনসূয়া - অর্থ - শকুন্তলার সখী, ঈর্ষার অভাব, মহর্ষি অত্রির স্ত্রী\n" +
                    "\n" +
                    "১৬ ) অনংশা - অর্থ - নন্দ ও যশোদার কন্যা\n" +
                    "\n" +
                    "১৭ ) অনাম্নী - অর্থ - নামহীন\n" +
                    "\n" +
                    "১৮ ) অনিন্দিতা - অর্থ - নিন্দার যোগ্য নয়\n" +
                    "\n" +
                    "  ১৯ ) অনিশা - অর্থ - নিরবচ্ছিন্য\n" +
                    "\n" +
                    "২০ ) অনীকিনী - অর্থ - সৈন্যবাহিনীবিশেষ\n" +
                    "\n" +
                    "২১ ) অনুপমা - অর্থ - তুলনাহীনা\n" +
                    "\n" +
                    "২২ ) অনুপ্রভা - অর্থ - ঔজ্বল্য\n" +
                    "\n" +
                    "২৩ ) অনুমিতা - অর্থ - সম্ভবতঃ অনুমিত থেকে\n" +
                    "\n" +
                    "  ২৪ ) অনুমিতি - অর্থ - অনুমান, ব্যাপ্তিজ্ঞান দ্বারা লব্ধ জ্ঞান\n" +
                    "\n" +
                    "২৫ ) অনুরাধা - অর্থ - উজ্জ্বল নক্ষত্র\n" +
                    "\n" +
                    "২৬ ) অনুশ্রী - অর্থ - সুন্দরী\n" +
                    "\n" +
                    "২৭ ) অঙ্কিতা - অর্থ - চিহ্ন\n" +
                    "\n" +
                    "২৮ ) অন্তরা - অর্থ - আস্থায়ী ও আভোগের মধ্যে উচ্চারিত সুর\n" +
                    "\n" +
                    "২৯ ) অপরাজিতা - অর্থ - পরাজিত হয় নি যে, এক ধরণের ফুল, দুর্গা\n" +
                    "\n" +
                    "৩০ ) অপর্ণা - অর্থ - দুর্গা, পার্বতী\n" +
                    "\n" +
                    "৩১ ) অপলা - অর্থ - অতি সুন্দরী\n" +
                    "\n" +
                    "৩২ ) অপ্সরা - অর্থ - স্বর্গ বারাঙ্গনা\n" +
                    "\n" +
                    "৩৩ ) অবন্তিকা - অর্থ - উজ্জয়িনীর রাজকুমারী\n" +
                    "\n" +
                    "৩৪ ) অবন্তী - অর্থ - মালবদেশ, উজ্জয়িনী\n" +
                    "\n" +
                    "৩৫ ) অভয়া - অর্থ - ভয়হীনা\n" +
                    "\n" +
                    "৩৬ ) অমৃতা - অর্থ - মৃত্যুহীনা\n" +
                    "\n" +
                    "৩৭ ) অমোঘা - অর্থ - মহর্ষি শান্তনুর স্ত্রী, পরম রূপলাবণ্যবতী\n" +
                    "\n" +
                    "৩৮ ) অম্বা - অর্থ - কাশীরাজের কন্যা পরে শিখণ্ডিনী হয়ে জন্মান\n" +
                    "\n" +
                    "৩৯ ) অম্বালিকা - অর্থ - কাশীরাজের কন্যা পাণ্ডুর মাতা\n" +
                    "\n" +
                    "৪০ ) অম্বিকা - অর্থ - কাশীরাজের কন্যা ধৃতরাষ্ট্রের মাতা\n" +
                    "\n" +
                    "৪১ ) অম্লিকা - অর্থ - তেঁতুল গাছ\n" +
                    "\n" +
                    "  ৪২ ) অরুণা - অর্থ - সন্ধ্যা, কশ্যপের পত্নী দক্ষের কন্যা\n" +
                    "\n" +
                    "৪৩ ) অরুণিমা - অর্থ - রক্তিমা, লৌহিত্য\n" +
                    "\n" +
                    "  ৪৪ ) অরুন্ধতী - অর্থ - বশিষ্ঠের পত্নি, সপ্তর্ষিমণ্ডলের পাশে একটি তারা\n" +
                    "\n" +
                    "৪৫ ) অর্চনা - অর্থ - পুজা \n" +
                    "\n" +
                    "৪৬ ) অর্চিতা- অর্থ - যাকে পুজা করা হয়\n" +
                    "\n" +
                    "  ৪৭ ) অর্চিশা - অর্থ - আলোর রশ্মি\n" +
                    "\n" +
                    "  ৪৮ ) অলকা- অর্থ - গন্ধর্বদের বাসস্থান\n" +
                    "\n" +
                    "  ৪৯ ) অলকানন্দা - অর্থ - ত্রুটিহীন, স্বর্গগঙ্গা\n" +
                    "\n" +
                    "  ৫০ ) অলম্বুষা - অর্থ - অপ্সরা");

        }


        //other Name


        if (detils.equals("mobilasahabi")) {

            textview1.setText(R.string.mohilatitel);
            textview2.setText("সম্মানিত মহিলাদের নাম\n" +
                    "\n" +
                    "খাদিজা (خَدِيْجَةُ) \n" +
                    "\n" +
                    "সাওদা (سَوْدَةُ) \n" +
                    "\n" +
                    "আয়েশা (عَائِشَةُ) \n" +
                    "\n" +
                    "হাফসা (حَفْصَةُ) \n" +
                    "\n" +
                    "যয়নব (زَيْنَبُ) \n" +
                    "\n" +
                    "উম্মে সালামা (أُمِّ سَلَمَة)\n" +
                    "\n" +
                    "উম্মে হাবিবা (أُمِّ حَبِيْبَة) \n" +
                    "\n" +
                    "জুওয়াইরিয়া (جُوَيْرِيَةُ) \n" +
                    "\n" +
                    "সাফিয়্যা (صَفِيَّةُ)।   \n" +
                    "\n" +
                    "রাসূল সাল্লাল্লাহু ‘আলাইহি ওয়াসাল্লাম এর কন্যাবর্গের নাম \n" +
                    "\n" +
                    "ফাতেমা (فَاطِمَةُ)\n" +
                    "\n" +
                    "রোকেয়া (رُقَيَّةُ)\n" +
                    "\n" +
                    "উম্মে কুলসুম (أُمُّ كلْثُوْم)। \n" +
                    "\n" +
                    "আরো কিছু নেককার নারীর নাম \n" +
                    "\n" +
                    "সারা (سَارَة)\n" +
                    "\n" +
                    "হাজেরা (هَاجِر) \n" +
                    "\n" +
                    "মরিয়ম مَرْيَم)। \n" +
                    "\n" +
                    "মহিলা সাহাবীবর্গের নাম \n" +
                    "\n" +
                    "রুফাইদা (رُفَيْدَةُ -সামান্য দান) \n" +
                    "\n" +
                    "আমেনা (آمِنَةُ -প্রশান্ত আত্মা) \n" +
                    "\n" +
                    "আসমা (أَسْمَاءُ -নাম) \n" +
                    "\n" +
                    "রাকিকা (رَقِيْقَةٌ-কোমলবতী) \n" +
                    "\n" +
                    "নাফিসা (نَفِيْسَةُ-মূল্যবান) \n" +
                    "\n" +
                    "উমামা (أُمَامَةُ- তিনশত উট) \n" +
                    "\n" +
                    "লায়লা (لَيْلى -মদ) \n" +
                    "\n" +
                    "ফারিআ (فَرِيْعَةُ -লম্বাদেহী) \n" +
                    "\n" +
                    "আতিকা (عَاتِكَةُ -সুগন্ধিনী) \n" +
                    "\n" +
                    "হুযাফা (حُذَافَةُ-সামান্য বস্তু) \n" +
                    "\n" +
                    "সুমাইয়্যা (سُمَيَّةُ -আলামত) \n" +
                    "\n" +
                    "খাওলা (خَوْلَةُ-সুন্দরী) \n" +
                    "\n" +
                    "হালিমা (حَلِيْمَةُ -ধৈর্য্যশীলা) \n" +
                    "\n" +
                    "উম্মে মাবাদ (أم مَعْبَد-মাবাদের মা) \n" +
                    "\n" +
                    "উম্মে আইমান (أمَّ أَيْمَن-আইমানের মা)\n" +
                    "\n" +
                    "রাবাব ( رَبَاب-শুভ্র মেঘ) \n" +
                    "\n" +
                    "আসিয়া (آسِيَةُ-সমবেদনাপ্রকাশকারিনী) \n" +
                    "\n" +
                    "আরওয়া (أرْوَى -কোমল ও হালকা) \n" +
                    "\n" +
                    "আনিসা (أنِيْسَةُ -ভাল মনের অধিকারিনী) \n" +
                    "\n" +
                    "জামিলা (جَمِيْلَةُ-সুন্দরী) \n" +
                    "\n" +
                    "দুর্\u200Cরা (دُرَّة-বড় মতি) \n" +
                    "\n" +
                    "রাইহানা (رَيْحَانَة-সুগন্ধি তরু) \n" +
                    "\n" +
                    "সালমা (سَلْمى-নিরাপদ) \n" +
                    "\n" +
                    "সুআদ (سُعَاد-সৌভাগ্যবতী) \n" +
                    "\n" +
                    "লুবাবা (لُبَابَة-সর্বোত্তম) \n" +
                    "\n" +
                    "আলিয়া (عَلِيَّةُ-উচ্চমর্যাদা সম্পন্না) \n" +
                    "\n" +
                    "কারিমা (كَرِيْمَةُ – উচ্চবংশী)। \n" +
                    "\n" +
                    "মেয়েদের আরো কিছু সুন্দর নাম: \n" +
                    "\n" +
                    "ছাফিয়্যা (صَفِيَّةُ) \n" +
                    "\n" +
                    "খাওলা (خَوْلَةُ) \n" +
                    "\n" +
                    "হাসনা (حَسْنَاء-সুন্দরী)\n" +
                    "\n" +
                    "সুরাইয়া (الثُّرَيا-বিশেষ একটি নক্ষত্র) \n" +
                    "\n" +
                    "হামিদা (حَمِيْدَةُ-প্রশংসিত) \n" +
                    "\n" +
                    "দারদা (دَرْدَاءُ) \n" +
                    "\n" +
                    "রামলা (رَمْلَةُ- বালিময় ভূমি) \n" +
                    "\n" +
                    "মাশকুরা (مَشْكُوْرَةٌ-কৃতজ্ঞতাপ্রাপ্ত) \n" +
                    "\n" +
                    "আফরা (عَفْرَاءُ-ফর্সা)।");

        }

        if (detils.equals("bodorname1")) {

            textview1.setText(R.string.bodorname1);
            textview2.setText("বদর যুদ্ধের সাহাবীদের নাম পর্ব-১\n" +
                    "\n" +
                    "মুহাজির সাহাবীঃ (মক্কা থেকে মদিনায় হিজরতকারী সাহাবীগণ)\n" +
                    "\n" +
                    "১. হযরত আবু বকর (রাঃ) \n" +
                    "\n" +
                    "২. হযরত উমর ফারুক (রাঃ) \n" +
                    "\n" +
                    "৩. হযরত উসমান (রাঃ) \n" +
                    "\n" +
                    "৪. হযরত আলী মোর্তাজা (রাঃ) \n" +
                    "\n" +
                    "৫. হযরত হামজা (রাঃ) \n" +
                    "\n" +
                    "৬. হযরত যায়েদ বিন হারেছা (রাঃ) \n" +
                    "\n" +
                    "৭. হযরত আবু কাবশাহ সুলাইম (রাঃ) \n" +
                    "\n" +
                    "৮. হযরত আবু মারছাদ গানাভী (রাঃ) \n" +
                    "\n" +
                    "৯. হযরত মারছাদ বিন আবু মারছাদ (রাঃ) \n" +
                    "\n" +
                    "১০. হযরত উবাইদা বিন হারেছ (রাঃ) \n" +
                    "\n" +
                    "১১. হযরত তোফায়েল বিন হারেছ (রাঃ) \n" +
                    "\n" +
                    "১২. হযরত হুসাইন বিন হারেছ (রাঃ) \n" +
                    "\n" +
                    "১৩. হযরত আউফ বিন উসাসা (রাঃ) \n" +
                    "\n" +
                    "১৪. হযরত আবু হুযায়ফা (রাঃ) \n" +
                    "\n" +
                    "১৫. হযরত ছালেম (রাঃ) \n" +
                    "\n" +
                    "১৬. হযরত সুহইব বিন সিনান (রাঃ) \n" +
                    "\n" +
                    "১৭. হযরত আব্দুল্লাহ্ বিন জাহাশ (রাঃ) \n" +
                    "\n" +
                    "১৮. হযরত উক্বাশা বিন মিহসান (রাঃ) \n" +
                    "\n" +
                    "১৯. হযরত শুজা’ বিন ওহাব (রাঃ) \n" +
                    "\n" +
                    "২০. হযরত ওতবা বিন রবীআহ (রাঃ) \n" +
                    "\n" +
                    "২১. হযরত ইয়াযীদ বিন রুকাইশ (রাঃ) \n" +
                    "\n" +
                    "২২. হযরত আবু সিনান (রাঃ) \n" +
                    "\n" +
                    "২৩. হযরত সিনান বিন আবু সিনান (রাঃ) \n" +
                    "\n" +
                    "২৪. হযরত মুহরিয বিন নাজলা (রাঃ) \n" +
                    "\n" +
                    "২৫. হযরত রবীআ’ বিন আক্সাম (রাঃ) \n" +
                    "\n" +
                    "২৬. হযরত হাতেব বিন আমর (রাঃ) \n" +
                    "\n" +
                    "২৭. হযরত মালেক বিন আমর (রাঃ) \n" +
                    "\n" +
                    "২৮. হযরত মিদ্লাজ বিন আমর (রাঃ) \n" +
                    "\n" +
                    "২৯. হযরত সুওয়ায়েদ ইবনে মাখশী (রাঃ) \n" +
                    "\n" +
                    "৩০. হযরত উৎবা বিন গাযওয়ান (রাঃ) \n" +
                    "\n" +
                    "৩১. হযরত জুবাইর বিন আউওয়াম (রাঃ) \n" +
                    "\n" +
                    "৩২. হযরত হাতেব বিন আবি বালতাআহ (রাঃ) \n" +
                    "\n" +
                    "৩৩. হযরত সা’দ বিন খাওলা (রাঃ) \n" +
                    "\n" +
                    "৩৪. হযরত মুসআব বিন উমায়ের(রাঃ) \n" +
                    "\n" +
                    "৩৫. হযরত মাসউদ বিন সা’দ (রাঃ) \n" +
                    "\n" +
                    "৩৬. হযরত আবদুর রহমান বিন আউফ (রাঃ) \n" +
                    "\n" +
                    "৩৭. হযরত সা’দ বিন আবু উবায়দা (রাঃ) \n" +
                    "\n" +
                    "৩৮. হযরত উমায়ের বিন আবিওয়াক্কাস (রাঃ) \n" +
                    "\n" +
                    "৩৯. হযরত মিক্বদাদ বিন আমর (রাঃ) \n" +
                    "\n" +
                    "৪০. হযরত আব্দুল্লাহ্ বিন মাসউদ (রাঃ) \n" +
                    "\n" +
                    "৪১. হযরত মাসউদ বিন রাবীআ (রাঃ) \n" +
                    "\n" +
                    "৪২. হযরত যুশ্ শিমালাইন (রাঃ) \n" +
                    "\n" +
                    "৪৩. হযরত খাব্বাব বিন আরাত (রাঃ) \n" +
                    "\n" +
                    "৪৪. হযরত বিলাল বিন রবাহ্ (রাঃ) \n" +
                    "\n" +
                    "৪৫. হযরত আমের বিন ফুহায়রা (রাঃ) \n" +
                    "\n" +
                    "৪৬. হযরত ছুহাইব বিন সিনান (রাঃ) \n" +
                    "\n" +
                    "৪৭. হযরত তালহা বিন উবাইদুল্লাহ্ (রাঃ) \n" +
                    "\n" +
                    "৪৮. হযরত আবু সালমা বিন আব্দুল আসাদ (রাঃ) \n" +
                    "\n" +
                    "৪৯. হযরত শাম্মাস বিন উসমান (রাঃ) \n" +
                    "\n" +
                    "৫০. হযরত আকরাম বিন আবুল আকরাম (রাঃ) \n" +
                    "\n" +
                    "৫১. হযরত আম্মার বিন ইয়াছির (রাঃ) \n" +
                    "\n" +
                    "৫২. হযরত মুআত্তিব বিন আউফ (রাঃ) \n" +
                    "\n" +
                    "৫৩. হযরত যায়েদ ইবনে খাত্তাব (রাঃ) \n" +
                    "\n" +
                    "৫৪. হযরত আমর বিন সুরাকা (রাঃ) \n" +
                    "\n" +
                    "৫৫. হযরত ওয়াকেদ বিন আব্দুল্লাহ্ (রাঃ) \n" +
                    "\n" +
                    "৫৬. হযরত খাওলা বিন আবু খাওলা (রাঃ) \n" +
                    "\n" +
                    "৫৭. হযরত আমের বিন রবীআহ (রাঃ) \n" +
                    "\n" +
                    "৫৮. হযরত আমের বিন হারিছ (রাঃ) \n" +
                    "\n" +
                    "৫৯. হযরত আমের বিন আব্দুল্লাহ্ (রাঃ) \n" +
                    "\n" +
                    "৬০. হযরত খালেদ বিন বুকাইর (রাঃ) \n" +
                    "\n" +
                    "৬১. হযরত ইয়ায বিন গানাম (রাঃ) \n" +
                    "\n" +
                    "৬২. হযরত সাঈদ বিন যায়েদ (রাঃ) \n" +
                    "\n" +
                    "৬৩. হযরত উসমান বিন মাজউন (রাঃ) \n" +
                    "\n" +
                    "৬৪. হযরত সাইব বিন উসমান (রাঃ) \n" +
                    "\n" +
                    "৬৫. হযরত কুদামা বিন মাজউন (রাঃ) \n" +
                    "\n" +
                    "৬৬. হযরত আব্দুল্লাহ্ বিন মাজউন (রাঃ) \n" +
                    "\n" +
                    "৬৭. হযরত মা’মার বিন হারেছ (রাঃ) \n" +
                    "\n" +
                    "৬৮. হযরত আবু উবায়দা ইবনুল জাররাহ (রাঃ) \n" +
                    "\n" +
                    "৬৯. হযরত আব্দুল্লাহ্ বিন মাখ্রামা (রাঃ) \n" +
                    "\n" +
                    "৭০. হযরত খাব্বাব মাওলা উতবা বিন গযওয়ান (রাঃ) \n" +
                    "\n" +
                    "৭১. হযরত আবুস্ সাইব উসমান বিন মাজউন (রাঃ) \n" +
                    "\n" +
                    "৭২. হযরত আমর বিন আবু সারাহ (রাঃ) \n" +
                    "\n" +
                    "৭৩. হযরত সাকাফ বিন আমর (রাঃ) \n" +
                    "\n" +
                    "৭৪. হযরত মুজায্যার বিন যিয়াদ (রাঃ) \n" +
                    "\n" +
                    "৭৫. হযরত খাব্বাব ইবনুল মুনযির (রাঃ) \n" +
                    "\n" +
                    "৭৬. হযরত উমায়ের বিন আবী ওয়াক্কাছ (রাঃ) \n" +
                    "\n" +
                    "৭৭. হযরত মিকদাদ বিন আমর (রাঃ) \n" +
                    "\n" +
                    "৭৮. হযরত নোমান বিন আসার বিন হারেস (রাঃ) \n" +
                    "\n" +
                    "৭৯. হযরত মিহ্জা’ মাওলা উমর ফারুক (রাঃ) \n" +
                    "\n" +
                    "৮০. হযরত ওহাব বিন আবী সারাহ (রাঃ)");

        }

        if (detils.equals("bodorname2")) {

            textview1.setText(R.string.bodorname2);
            textview2.setText("আনসার সাহাবীঃ (মদীনার সাহাবীগণ)\n" +
                    "\n" +
                    "৮১. হযরত সা’দ বিন মুআজ (রাঃ) \n" +
                    "\n" +
                    "৮২. হযরত আমর বিন মুআজ (রাঃ) \n" +
                    "\n" +
                    "৮৩. হযরত হারেস বিন আউস (রাঃ) \n" +
                    "\n" +
                    "৮৪. হযরত হারেস বিন আনাস (রাঃ) \n" +
                    "\n" +
                    "৮৫. হযরত আব্বাদ বিন বিশর (রাঃ) \n" +
                    "\n" +
                    "৮৬. হযরত সালামা বিন সাবেত (রাঃ) \n" +
                    "\n" +
                    "৮৭. হযরত হারেস বিন খাযামা (রাঃ) \n" +
                    "\n" +
                    "৮৮. হযরত মুহাম্মদ বিন মাসলামা (রাঃ) \n" +
                    "\n" +
                    "৮৯. হযরত সালামা বিন আসলাম (রাঃ) \n" +
                    "\n" +
                    "৯০. হযরত উবায়েদ বিন তাইয়িহান (রাঃ) \n" +
                    "\n" +
                    "৯১. হযরত কাতাদা বিন নোমান (রাঃ) \n" +
                    "\n" +
                    "৯২. হযরত উবায়েদ বিন আউস (রাঃ) \n" +
                    "\n" +
                    "৯৩. হযরত নসর বিন হারেস (রাঃ) \n" +
                    "\n" +
                    "৯৪. হযরত আব্দুল্লাহ্ বিন তারেক (রাঃ) \n" +
                    "\n" +
                    "৯৫. হযরত আবু আবস (রাঃ) \n" +
                    "\n" +
                    "৯৬. হযরত আবু বুরদাহ্ হানী বিননিয়্যার (রাঃ) \n" +
                    "\n" +
                    "৯৭. হযরত আসেম বিন সাবেত (রাঃ) \n" +
                    "\n" +
                    "৯৮. হযরত মুআত্তিব বিন কুশাইর (রাঃ) \n" +
                    "\n" +
                    "৯৯. হযরত আমর বিন মা’বাদ (রাঃ) \n" +
                    "\n" +
                    "১০০. হযরত সাহল বিন হুনাইফ (রাঃ) \n" +
                    "\n" +
                    "১০১. হযরত মুবাশশির বিন আব্দুল মুনযির (রাঃ) \n" +
                    "\n" +
                    "১০২. হযরত রিফাআ বিন আঃ মুনযির (রাঃ) \n" +
                    "\n" +
                    "১০৩. হযরত খুনাইস বিন হুযাফা (রাঃ) \n" +
                    "\n" +
                    "১০৪. হযরত আবু সাবরা কুরাইশী (রাঃ) \n" +
                    "\n" +
                    "১০৫. হযরত আব্দুল্লাহ্ বিন সালামা (রাঃ) \n" +
                    "\n" +
                    "১০৬. হযরত আব্দুল্লাহ্ বিন সুহাইল (রাঃ) \n" +
                    "\n" +
                    "১০৭. হযরত সা’দ বিন মুআয (রাঃ) \n" +
                    "\n" +
                    "১০৮. হযরত উমায়ের বিন আউফ (রাঃ) \n" +
                    "\n" +
                    "১০৯. হযরত আমের বিন সালামা (রাঃ) \n" +
                    "\n" +
                    "১১০. হযরত ছফওয়ান বিন ওহাব (রাঃ) \n" +
                    "\n" +
                    "১১১. হযরত ইয়ায বিন বুকাইর (রাঃ) \n" +
                    "\n" +
                    "১১২. হযরত সা’দ বিন উবায়েদ (রাঃ) \n" +
                    "\n" +
                    "১১৩. হযরত উওয়াইম বিন সায়েদাহ (রাঃ) \n" +
                    "\n" +
                    "১১৪. হযরত রাফে বিন আনজাদা (রাঃ) \n" +
                    "\n" +
                    "১১৫. হযরত উবায়েদ বিন আবুউবয়েদ (রাঃ) \n" +
                    "\n" +
                    "১১৬. হযরত সা’লাবা বিন হাতেব (রাঃ) \n" +
                    "\n" +
                    "১১৭. হযরত আবু লুবাবাহ আব্দুল মুনযির (রাঃ) \n" +
                    "\n" +
                    "১১৮. হযরত হারেস বিন হাতেব (রাঃ) \n" +
                    "\n" +
                    "১১৯. হযরত আসেম বিন আদী (রাঃ) \n" +
                    "\n" +
                    "১২০. হযরত আনাছ বিন কাতাদা (রাঃ) \n" +
                    "\n" +
                    "১২১. হযরত মাআন বিন আদী (রাঃ) \n" +
                    "\n" +
                    "১২২. হযরত সাবেত বিন আকরাম (রাঃ) \n" +
                    "\n" +
                    "১২৩. হযরত আব্দুল্লাহ্ বিন ছাহল (রাঃ) \n" +
                    "\n" +
                    "১২৪. হযরত যায়েদ বিন আসলাম (রাঃ) \n" +
                    "\n" +
                    "১২৫. হযরত রিবয়ী বিন রাফে’ (রাঃ) \n" +
                    "\n" +
                    "১২৬. হযরত সা’দ বিন যায়েদ (রাঃ) \n" +
                    "\n" +
                    "১২৭. হযরত সালমা বিন সালামা (রাঃ) \n" +
                    "\n" +
                    "১২৮. হযরত আব্দুল্লাহ্ বিন যায়েদ (রাঃ) \n" +
                    "\n" +
                    "১২৯. হযরত আসেম বিন কায়েস (রাঃ) \n" +
                    "\n" +
                    "১৩০. হযরত আবুস্ সয়্যাহ বিন নোমান (রাঃ) \n" +
                    "\n" +
                    "১৩১. হযরত আবু হাব্বাহ বিন আমর (রাঃ) \n" +
                    "\n" +
                    "১৩২. হযরত হারেস বিন নোমান (রাঃ) \n" +
                    "\n" +
                    "১৩৩. হযরত খাওয়াত বিন যুবাইর (রাঃ) \n" +
                    "\n" +
                    "১৩৪. হযরত মুনযির বিন মুহাম্মদ (রাঃ) \n" +
                    "\n" +
                    "১৩৫. হযরত আবু আকীল আব্দুর রহমান (রাঃ) \n" +
                    "\n" +
                    "১৩৬. হযরত আবু দুজানা (রাঃ) \n" +
                    "\n" +
                    "১৩৭. হযরত সা’দ বিন খায়সামা (রাঃ) \n" +
                    "\n" +
                    "১৩৮. হযরত মুনযির বিন কুদামা (রাঃ) \n" +
                    "\n" +
                    "১৩৯. হযরত মালেক বিন কুদামা (রাঃ) \n" +
                    "\n" +
                    "১৪০. হযরত হারেস বিন আরফাজা (রাঃ) \n" +
                    "\n" +
                    "১৪১. হযরত জাবের বিন আব্দুল্লাহ (রাঃ) \n" +
                    "\n" +
                    "১৪২. হযরত মালেক বিন নুমায়লা (রাঃ) \n" +
                    "\n" +
                    "১৪৩. হযরত খারেজা বিন যায়েদ (রাঃ) \n" +
                    "\n" +
                    "১৪৪. হযরত সা’দ বিন রবী’ (রাঃ) \n" +
                    "\n" +
                    "১৪৫. হযরত আব্দুল্লাহ্ বিনরাওয়াহা (রাঃ) \n" +
                    "\n" +
                    "১৪৬. হযরত বশির বিন সা’দ (রাঃ) \n" +
                    "\n" +
                    "১৪৭. হযরত সিমাক বিন সা’দ (রাঃ) \n" +
                    "\n" +
                    "১৪৮. হযরত সুবাঈ বিন কায়েস (রাঃ) \n" +
                    "\n" +
                    "১৪৯. হযরত আব্বাদ বিন কায়েস (রাঃ) \n" +
                    "\n" +
                    "১৫০. হযরত ইয়াযিদ বিন হারেস (রাঃ) \n" +
                    "\n" +
                    "১৫১. হযরত খোবায়ের বিন য়াসাফ (রাঃ) \n" +
                    "\n" +
                    "১৫২. হযরত আব্দুল্লাহ্ বিন কায়েস (রাঃ) \n" +
                    "\n" +
                    "১৫৩. হযরত হারিস বিন যিয়াদ (রাঃ) \n" +
                    "\n" +
                    "১৫৪. হযরত তামীম বিন য়াআর (রাঃ) \n" +
                    "\n" +
                    "১৫৫. হযরত আব্দুল্লাহ্ বিন উমায়ের (রাঃ) \n" +
                    "\n" +
                    "১৫৬. হযরত যায়েদ বিন মুযাইন (রাঃ) \n" +
                    "\n" +
                    "১৫৭. হযরত আব্দুল্লাহ্ বিন উরফুতাহ্ (রাঃ) \n" +
                    "\n" +
                    "১৫৮. হযরত আব্দুল্লাহ্ বিন রবী’ (রাঃ) \n" +
                    "\n" +
                    "১৫৯. হযরত আব্দুল্লাহ্ বিন আব্দুল্লাহ্ (রাঃ) \n" +
                    "\n" +
                    "১৬০. হযরত আউস বিন খাওলা (রাঃ) \n" +
                    "\n" +
                    "১৬১. হযরত যায়েদ বিন উবায়েদ (রাঃ) \n" +
                    "\n" +
                    "১৬২. হযরত উকবাহ বিন ওহাব (রাঃ) \n" +
                    "\n" +
                    "১৬৩. হযরত রিফাআহ বিন আমর (রাঃ) \n" +
                    "\n" +
                    "১৬৪. হযরত উসায়ের বিন আসর (রাঃ) \n" +
                    "\n" +
                    "১৬৫. হযরত মা’বাদ বিন আব্বাদ (রাঃ) \n" +
                    "\n" +
                    "১৬৬. হযরত আমের বিন বুকাইর (রাঃ) \n" +
                    "\n" +
                    "১৬৭. হযরত নওফল বিন আব্দুল্লাহ্ (রাঃ) \n" +
                    "\n" +
                    "১৬৮. হযরত উবাদা বিন সামেত (রাঃ) \n" +
                    "\n" +
                    "১৬৯. হযরত নোমান বিন মালেক (রাঃ) \n" +
                    "\n" +
                    "১৭০. হযরত সাবেত বিন হায্যাল (রাঃ) \n" +
                    "\n" +
                    "১৭১. হযরত মালেক বিন দুখশুম (রাঃ) \n" +
                    "\n" +
                    "১৭২. হযরত রবী’ বিন ইয়াছ (রাঃ) \n" +
                    "\n" +
                    "১৭৩. হযরত ওয়ারাকা বিন ইয়াছ (রাঃ) \n" +
                    "\n" +
                    "১৭৪. হযরত আমর বিন ইয়াছ (রাঃ) \n" +
                    "\n" +
                    "১৭৫. হযরত আমর বিন কয়েস (রাঃ) \n" +
                    "\n" +
                    "১৭৬. হযরত ফাকেহ বিন বিশ্র (রাঃ) \n" +
                    "\n" +
                    "১৭৭. হযরত নওফল বিন সা’লাবা (রাঃ) \n" +
                    "\n" +
                    "১৭৮. হযরত আব্দুল্লাহ্ বিন সা’লাবা (রাঃ) \n" +
                    "\n" +
                    "১৭৯. হযরত মুনযির বিন আমর (রাঃ) \n" +
                    "\n" +
                    "১৮০. হযরত আবু উসায়েদ মালেক (রাঃ) \n" +
                    "\n" +
                    "১৮১. হযরত মালেক বিন মাসউদ (রাঃ) \n" +
                    "\n" +
                    "১৮২. হযরত আবদে রাব্বিহি (রাঃ) \n" +
                    "\n" +
                    "১৮৩. হযরত কা’ব বিন জাম্মায (রাঃ) \n" +
                    "\n" +
                    "১৮৪. হযরত জমরাহ বিন আমর (রাঃ) \n" +
                    "\n" +
                    "১৮৫. হযরত যিয়াদ বিন আমর (রাঃ) \n" +
                    "\n" +
                    "১৮৬. হযরত হুবাব বিন মুনযির (রাঃ) \n" +
                    "\n" +
                    "১৮৭. হযরত উমায়ের বিন হারাম (রাঃ) \n" +
                    "\n" +
                    "১৮৮. হযরত উমায়ের বিন হুমাম (রাঃ) \n" +
                    "\n" +
                    "১৮৯. হযরত আব্দুল্লাহ্ বিন আমর (রাঃ) \n" +
                    "\n" +
                    "১৯০. হযরত মুআজ বিন আমর (রাঃ) \n" +
                    "\n" +
                    "১৯১. হযরত মুআউওয়াজ বিন আমর (রাঃ) \n" +
                    "\n" +
                    "১৯২. হযরত খাল্লাদ বিন আমর (রাঃ) \n" +
                    "\n" +
                    "১৯৩. হযরত উকবাহ্ বিন আমের (রাঃ) \n" +
                    "\n" +
                    "১৯৪. হযরত সাবেত বিন খালেদ (রাঃ) \n" +
                    "\n" +
                    "১৯৫. হযরত বিশ্র বিন বারা (রাঃ)");

        }

        if (detils.equals("bodorname3")) {

            textview1.setText(R.string.bodorname3);
            textview2.setText("১৯৬. হযরত তোফায়েল বিন মালেক (রাঃ) \n" +
                    "\n" +
                    "১৯৭. হযরত তোফায়েল বিন নোমান (রাঃ) \n" +
                    "\n" +
                    "১৯৮. হযরত সিনান বিন সাঈফী (রাঃ) \n" +
                    "\n" +
                    "১৯৯. হযরত আব্দুল্লাহ্ বিন জাদ (রাঃ) \n" +
                    "\n" +
                    "২০০. হযরত উৎবা বিন আব্দুল্লাহ্ (রাঃ) \n" +
                    "\n" +
                    "২০১. হযরত জাব্বার বিন সাখর (রাঃ) \n" +
                    "\n" +
                    "২০২. হযরত খারেজা বিন হিময়ার (রাঃ) \n" +
                    "\n" +
                    "২০৩. হযরত আব্দুল্লাহ্ বিন হুমায়্যির (রাঃ) \n" +
                    "\n" +
                    "২০৪. হযরত ইয়াযিদ বিন মুনযির (রাঃ) \n" +
                    "\n" +
                    "২০৫. হযরত আব্দুল্লাহ্ বিন নোমান (রাঃ) \n" +
                    "\n" +
                    "২০৬. হযরত জহহাক বিন হারেসা (রাঃ) \n" +
                    "\n" +
                    "২০৭. হযরত আসওয়াদ বিন যুরাইক (রাঃ) \n" +
                    "\n" +
                    "২০৮. হযরত মা’বাদ বিন কায়েস (রাঃ) \n" +
                    "\n" +
                    "২০৯. হযরত আব্দুল্লাহ্ বিন কায়েস খালেদ (রাঃ) \n" +
                    "\n" +
                    "২১০. হযরত আব্দুল্লাহ্ বিন আব্দে মানাফ্ (রাঃ) \n" +
                    "\n" +
                    "২১১. হযরত খালিদ বিন কায়েস (রাঃ) \n" +
                    "\n" +
                    "২১২. হযরত সুলাইম বিন আমর (রাঃ) \n" +
                    "\n" +
                    "২১৩. হযরত কুতবা বিন আমের (রাঃ) \n" +
                    "\n" +
                    "২১৪. হযরত আন্তারা মাওলা বনী সুলাইম (রাঃ) \n" +
                    "\n" +
                    "২১৫. হযরত আব্স বিন আমের (রাঃ) \n" +
                    "\n" +
                    "২১৬. হযরত সা’লাবা বিন আনামা (রাঃ) \n" +
                    "\n" +
                    "২১৭. হযরত আবুল য়াসার বিন আমর (রাঃ) \n" +
                    "\n" +
                    "২১৮. হযরত উবাদা বিন কয়েস (রাঃ) \n" +
                    "\n" +
                    "২১৯. হযরত আমর বিন তাল্ক (রাঃ) \n" +
                    "\n" +
                    "২২০. হযরত মুআজ বিন জাবাল (রাঃ)\n" +
                    "\n" +
                    "Arafat A1, [1/6/2023 3:17 AM]\n" +
                    "২২১. হযরত কয়েস বিন মুহ্সান (রাঃ) \n" +
                    "\n" +
                    "২২২. হযরত হারেস বিন কয়েস (রাঃ) \n" +
                    "\n" +
                    "২২৩. হযরত সা’দ বিন উসমান (রাঃ) \n" +
                    "\n" +
                    "২২৪. হযরত উকবা বিন উসমান (রাঃ) \n" +
                    "\n" +
                    "২২৫. হযরত জাকওয়ান বিন আবদে কয়েস (রাঃ) \n" +
                    "\n" +
                    "২২৬. হযরত মুআজ বিন মায়েস (রাঃ) \n" +
                    "\n" +
                    "২২৭. হযরত আয়েজ বিন মায়েজ(রাঃ) \n" +
                    "\n" +
                    "২২৮. হযরত মাসউদ বিন সা’দ (রাঃ) \n" +
                    "\n" +
                    "২২৯. হযরত রিফাআ বিন রাফে’ (রাঃ) \n" +
                    "\n" +
                    "২৩০. হযরত খাল্লাদ বিন রাফে’ (রাঃ) \n" +
                    "\n" +
                    "২৩১. হযরত উবায়েদ বিন যায়েদ (রাঃ) \n" +
                    "\n" +
                    "২৩২. হযরত যিয়াদ বিন লাবীদ (রাঃ) \n" +
                    "\n" +
                    "২৩৩. হযরত ফারওয়াহ বিন আমর (রাঃ) \n" +
                    "\n" +
                    "২৩৪. হযরত আতিয়্যা বিন নুওয়াইরা (রাঃ) \n" +
                    "\n" +
                    "২৩৫. হযরত খলিফা বিন আদী (রাঃ) \n" +
                    "\n" +
                    "২৩৬. হযরত উমারা বিন হায্ম (রাঃ) \n" +
                    "\n" +
                    "২৩৭. হযরত সুরাকা বিন কা’ব (রাঃ) \n" +
                    "\n" +
                    "২৩৮. হযরত হারেসা বিন নোমান (রাঃ) \n" +
                    "\n" +
                    "২৩৯. হযরত সুলাইম বিন কয়েস (রাঃ) \n" +
                    "\n" +
                    "২৪০. হযরত সুহাইল বিন কয়েস (রাঃ) \n" +
                    "\n" +
                    "২৪১. হযরত আদী বিন আবুয্ যাগ্বা (রাঃ) \n" +
                    "\n" +
                    "২৪২. হযরত মাসউদ বিন আউস (রাঃ) \n" +
                    "\n" +
                    "২৪৩. হযরত আবু খুজাইমাহ্ বিন আউস (রাঃ) \n" +
                    "\n" +
                    "২৪৪. হযরত রাফে’ বিন হারেস (রাঃ) \n" +
                    "\n" +
                    "২৪৫. হযরত মুআওয়াজ বিন হারেস (রাঃ) \n" +
                    "\n" +
                    "২৪৬. হযরত নোমান বিন আমর (রাঃ) \n" +
                    "\n" +
                    "২৪৭. হযরত আমের বিন মুখাল্লাদ (রাঃ) \n" +
                    "\n" +
                    "২৪৮. হযরত উসাইমা আশযায়ী (রাঃ) \n" +
                    "\n" +
                    "২৪৯. হযরত ওদীআহ বিন আমর (রাঃ) \n" +
                    "\n" +
                    "২৫০. হযরত আবুল হামরা মাওলা হারেস (রাঃ) \n" +
                    "\n" +
                    "২৫১. হযরত সা’লাবা বিন আমর (রাঃ) \n" +
                    "\n" +
                    "২৫২. হযরত সুহাইল বিন আতীক (রাঃ) \n" +
                    "\n" +
                    "২৫৩. হযরত হারেস বিন আতীক (রাঃ) \n" +
                    "\n" +
                    "২৫৪. হযরত হারেস বিন ছিম্মাহ (রাঃ) \n" +
                    "\n" +
                    "২৫৫. হযরত উবাই বিন কা’ব (রাঃ) \n" +
                    "\n" +
                    "২৫৬. হযরত আনাস বিন মুআজ (রাঃ) \n" +
                    "\n" +
                    "২৫৭. হযরত আউস বিন সামেত (রাঃ) \n" +
                    "\n" +
                    "২৫৮. হযরত আবু তালহা যায়েদ বিন ছাহল (রাঃ) \n" +
                    "\n" +
                    "২৫৯. হযরত হারেসা বিন সুরাকা (রাঃ) \n" +
                    "\n" +
                    "২৬০. হযরত আমর বিন সা’লাবা (রাঃ) \n" +
                    "\n" +
                    "২৬১. হযরত সাবেত বিন খানছা (রাঃ) \n" +
                    "\n" +
                    "২৬২. হযরত আমের বিন উমাইয়াহ্ (রাঃ) \n" +
                    "\n" +
                    "২৬৩. হযরত মুহ্রিয বিন আমের (রাঃ) \n" +
                    "\n" +
                    "২৬৪. হযরত সাওয়াদ বিন গাযিয়্যাহ (রাঃ) \n" +
                    "\n" +
                    "২৬৫. হযরত আবু যায়েদ কয়েস বিন সাকান (রাঃ) \n" +
                    "\n" +
                    "২৬৬. হযরত আবুল আওয়ার বিন হারেস (রাঃ) \n" +
                    "\n" +
                    "২৬৭. হযরত হারাম বিন মিল্হান (রাঃ) \n" +
                    "\n" +
                    "২৬৮. হযরত কয়েস বিন আবী সা’সা (রাঃ) \n" +
                    "\n" +
                    "২৬৯. হযরত আব্দুল্লাহ্ বিন কা’ব (রাঃ) \n" +
                    "\n" +
                    "২৭০. হযরত উসাইমা আসাদী (রাঃ) \n" +
                    "\n" +
                    "২৭১. হযরত আবু দাউদ উমাইর (রাঃ) \n" +
                    "\n" +
                    "২৭২. হযরত সুরাকা বিন আমর (রাঃ) \n" +
                    "\n" +
                    "২৭৩. হযরত কয়েস বিন মাখলাদ (রাঃ) \n" +
                    "\n" +
                    "২৭৪. হযরত নোমান বিন আব্দে আমর (রাঃ) \n" +
                    "\n" +
                    "২৭৫. হযরত জহ্হাক বিন আব্দে আমর (রাঃ) \n" +
                    "\n" +
                    "২৭৬. হযরত সুলাইম বিন হারেস (রাঃ) \n" +
                    "\n" +
                    "২৭৭. হযরত জাবের বিন খালেদ (রাঃ) \n" +
                    "\n" +
                    "২৭৮. হযরত সা’দ বিন সুহাইল (রাঃ) \n" +
                    "\n" +
                    "২৭৯. হযরত কা’ব বিন যায়েদ (রাঃ) \n" +
                    "\n" +
                    "২৮০. হযরত বুজাইর বিন আবি বুজাইর (রাঃ) \n" +
                    "\n" +
                    "২৮১. হযরত ইৎবান বিন মালেক (রাঃ) \n" +
                    "\n" +
                    "২৮২. হযরত মুলাইল বিন ওবারাহ (রাঃ) \n" +
                    "\n" +
                    "২৮৩. হযরত হেলাল বিন মুআল্লাহ (রাঃ) \n" +
                    "\n" +
                    "২৮৪. হযরত আনাছাহ আল হাবাশী (রাঃ) \n" +
                    "\n" +
                    "২৮৫. হযরত বাহ্হাস বিন সালাবা (রাঃ) \n" +
                    "\n" +
                    "২৮৬. হযরত জাব্র বিন আতীক (রাঃ) \n" +
                    "\n" +
                    "২৮৭. হযরত আবু আয়্যুব আনছারী (রাঃ) \n" +
                    "\n" +
                    "২৮৮. হযরত খিরাশ ইবনুস সিম্মাহ (রাঃ) \n" +
                    "\n" +
                    "২৮৯. হযরত খুরাইম বিন ফাতেক (রাঃ) \n" +
                    "\n" +
                    "২৯০. হযরত খুবাইব বিন ইছাফ (রাঃ) \n" +
                    "\n" +
                    "২৯১. হযরত খুবাইব বিন আদী (রাঃ) \n" +
                    "\n" +
                    "২৯২. হযরত খিদাশ বিন কাতাদা (রাঃ) \n" +
                    "\n" +
                    "২৯৩. হযরত খালেদ বিন সুওয়াইদ (রাঃ) \n" +
                    "\n" +
                    "২৯৪. হযরত রাফে’ বিন আল মুআল্লা (রাঃ) \n" +
                    "\n" +
                    "২৯৫. হযরত রুখায়লা বিন সা’লাবা (রাঃ) \n" +
                    "\n" +
                    "২৯৬. হযরত সাব্রা বিন ফাতেক (রাঃ) \n" +
                    "\n" +
                    "২৯৭. হযরত সুহাইল বিন রাফে’ (রাঃ) \n" +
                    "\n" +
                    "২৯৮. হযরত সুওয়াইবিত বিন হারমালা (রাঃ) \n" +
                    "\n" +
                    "২৯৯. হযরত তুলাইব বিন উমাইর (রাঃ) \n" +
                    "\n" +
                    "৩০০. হযরত উবাদা বিন খাশখাশকুজায়ী (রাঃ) \n" +
                    "\n" +
                    "৩০১. হযরত আব্দুল্লাহ্ বিন জুবাইর বিন নোমান (রাঃ) \n" +
                    "\n" +
                    "৩০২. হযরত আবু সালামা বিন আব্দুল আসাদ (রাঃ) \n" +
                    "\n" +
                    "৩০৩. হযরত আব্দুল্লাহ্ বিন আবস (রাঃ) \n" +
                    "\n" +
                    "৩০৪. হযরত আব্দুল্লাহ্ বিন উনায়েছ (রাঃ) \n" +
                    "\n" +
                    "৩০৫. হযরত উবাইদ বিন সা’লাবা (রাঃ) \n" +
                    "\n" +
                    "৩০৬. হযরত উমায়ের বিন নিয়ার (রাঃ) \n" +
                    "\n" +
                    "৩০৭. হযরত মালেক বিন আবী খাওলা (রাঃ) \n" +
                    "\n" +
                    "৩০৮. হযরত মালেক বিন কুদামা (রাঃ) \n" +
                    "\n" +
                    "৩০৯. হযরত মুরারা বিন রবী’ (রাঃ) \n" +
                    "\n" +
                    "৩১০. হযরত মাসউদ বিন খাল্দাহ (রাঃ) \n" +
                    "\n" +
                    "৩১১. হযরত মুআজ বিন হারেস (রাঃ) \n" +
                    "\n" +
                    "৩১২. হযরত মা’কিল বিন আলমুনযির (রাঃ) \n" +
                    "\n" +
                    "৩১৩. হযরত নোমান বিন আছার বিন হারেছ (রাঃ)");

        }

        if (detils.equals("narisahabi")) {

            textview1.setText(R.string.narititel);
            textview2.setText("\n" +
                    "মহিলা সাহাবীর নাম\n" +
                    "\n" +
                    "হযরত রাসূলুল্লাহ (সাঃ) এর জীবদ্দশায় যে সকল মহলা ইসলাম গ্রহণ করে রাসূলুল্লাহ (সাঃ) কে স্ব-চোখে দেখেছেন এবং ঈমানের সাথে মৃত্যু বরণ করেছেন তারাই হলেন মহিলা সাহাবী। তাঁরা ছিলেন অত্যন্ত সৌভাগ্যবান।\n" +
                    "\n" +
                    "পূর্বেই বলা হয়েছে, মহিলারা তাঁদের নামের শেষে পিতার নাম যোগ করে পরিচয় দিত, পিতার নামের পরিবর্তে স্বামীর নাম যোগ করা কোরআন ও হাদীসের প্রত্যক্ষ নাফরমানী। আল্লাহ রাব্বুল আলামীন যা ন্যায় সঙ্গত মনে করেন তা না গ্রহণ করে পশ্চিমা বিজাতীয় অনুকরণে বিবাহিতা নারীর নামের শেষে স্বামীর নাম যুক্ত করা ইসলামী আদর্শের পরিপন্থী। সাহাবীদের মতো মহিলা সাহাবীরাও তাঁদের নামের শেষে নীসব অর্থাৎ পিতার নাম যুক্ত করে পরিচয় দিতেন। যেমন খদীজা বিনতে খুয়াইলিদ, আয়েশা বিনতে আবু বকর সিদ্দীক ইত্যাদি। মুহাম্মদ (সা) এর মতো জগত বরণ্য স্বামীর নামও তাদের নামের পরে যুক্ত করেননি। কিন্তু এযুগের মুসলিম নারীগণ তাঁদের বিবাহোত্তর জীবনে নিজেদের নামের পরে স্বামীর নাম যোগ করেন অবলীলাক্রমে এ প্রথা বা স্টাইল কুরআন ও সুন্নার বিপরীত। আল্লাহ তা’আলা চিরন্তন বাণীকে অস্বীকার করে যারা অন্যের অনুসরণ করে কিয়ামতের দিনে তাঁদের দলেই তাঁরা ঠাই পাবে। এ প্রসঙ্গে রাসূলুল্লাহ (সাঃ) বলেনঃ\n" +
                    "“ইবনে উমর (রাঃ) বর্ণনা করেন, রাসূলুল্লাহ (সাঃ) বলেছেনঃ ‘যে ব্যক্তি যে প্রাদায়ের অনুসরণ করে সে তাদেরই দলভুক্ত হবে।’ আবু দাউদ। (কিতাবিল লিবছ)\n" +
                    "সুতরাং যারা খাদীজাতুল কুবরা, আয়েশা সিদ্দীকা, ফাতেমাতুজ যোহরা এদের দলে শামীল হতে চায় তাঁরা এদেরই পদাঙ্ক অনুসরণ করবে। মুসলিম মা-বোন ও ভাইদের কাছে ইসলামের চির সুন্দর ও সত্য এবং কল্যাণের বাণী পৌঁছে দিয়ে সে অনুযায়ী আমল করার আহ্বান জানাই নিম্নে কয়েকজন সৌভাগ্যবান মহিলা সাহাবীর নাম উল্লেখ করা হলো, আমাদের মুসলিম কন্যাদের নাম মহিলা সাহাবীদের নামে নামকরণের তৌফিক আল্লাহ সবাইকে দান করুন। আমীন!\n" +
                    "\n" +
                    "০১.) আরওয়া বিনতে আব্দুল মুত্তালাব (রাঃ) - সংক্ষিপ্ত নাম - আরওয়া (রাঃ)\n" +
                    "\n" +
                    "০২.) আসমা বিনতে আবী বকর সিদ্দীকা (রাঃ) - সংক্ষিপ্ত নাম - আসমা (রাঃ)\n" +
                    "\n" +
                    "০৩.) উমাইয়া বিনতে আন-নাজ্জার আন আনসারী - সংক্ষিপ্ত নাম - উমাইয়া (রাঃ)\n" +
                    "\n" +
                    "০৪.) উনাইসাহ বিনতে আদী (রাঃ) - সংক্ষিপ্ত নাম - উনাইসাহ (রাঃ)\n" +
                    "\n" +
                    "০৫.) উম্মে আইমন (রাঃ) - সংক্ষিপ্ত নাম - উম্মে আইমন (রাঃ)\n" +
                    "\n" +
                    "০৬.) উম্মে ফজল (রাঃ) - সংক্ষিপ্ত নাম - উম্মে ফজল (রাঃ)\n" +
                    "\n" +
                    "০৭.) উম্মে রুমান (রাঃ) - সংক্ষিপ্ত নাম - উম্মে রুমান (রাঃ)\n" +
                    "\n" +
                    "০৮.) উম্মে সুলাইম (রাঃ) - সংক্ষিপ্ত নাম - উম্মে সুলাইম (রাঃ)\n" +
                    "\n" +
                    "০৯.) উম্মে উমারা (রাঃ) - সংক্ষিপ্ত নাম - উম্মে উমারা (রাঃ)\n" +
                    "\n" +
                    "১০.) উম্মে আতিয়া (রাঃ) - সংক্ষিপ্ত নাম - উম্মে আতিয়া (রাঃ)\n" +
                    "\n" +
                    "১১.) উম্মে হানী (রাঃ) - সংক্ষিপ্ত নাম - উম্মে হানী (রাঃ)\n" +
                    "\n" +
                    "১২.) বারীরাহ (মাওলাতে আয়েশা সিদ্দীকা (রাঃ) - সংক্ষিপ্ত নাম - বারীরাহ (রাঃ)\n" +
                    "\n" +
                    "১৩.) বুসরা বিনতে সাফওয়ান কুরাইশী (রাঃ)  - সংক্ষিপ্ত নাম - বুসরা (রাঃ)\n" +
                    "\n" +
                    "১৪.) তামাযুর বিনতে ‘আমের (রাঃ)  - সংক্ষিপ্ত নাম - তামাযুর (রাঃ)\n" +
                    "\n" +
                    "১৫.) তামীমা বিনতে ওহহাব (রাঃ) - সংক্ষিপ্ত নাম - তামীমা (রাঃ)\n" +
                    "\n" +
                    "১৬.) সুবাইতা বিনতে যাহাক/দাহাক (রাঃ) - সংক্ষিপ্ত নাম - সুবাইতা (রাঃ)\n" +
                    "\n" +
                    "১৭.) জামীলা বিনতে উমর ইবনুল খাত্তাব (রাঃ) - সংক্ষিপ্ত নাম - জামীলা (রাঃ)\n" +
                    "\n" +
                    "১৮.) জুমানা বিনতে আবী তালেব - সংক্ষিপ্ত নাম - জুমানা (রাঃ)\n" +
                    "\n" +
                    "১৯.) জুওয়াই রিয়া (উম্মুল মু’মেনীন) (রাঃ) - সংক্ষিপ্ত নাম - জুওয়াইরিয়া (রাঃ)\n" +
                    "\n" +
                    "২০.) হাবীবা বিনতে আবীফিয়ান (রাঃ) - সংক্ষিপ্ত নাম - হাবীবা (রাঃ)\n" +
                    "\n" +
                    "২১.) হাফসা (উম্মুল মু’মেনীন)(রাঃ) - সংক্ষিপ্ত নাম - হাফসা (রাঃ)\n" +
                    "\n" +
                    "২২.) হাকীমা বিনতে গাইলান (রাঃ) - সংক্ষিপ্ত নাম - হাকীমা (রাঃ)\n" +
                    "\n" +
                    "২৩.) হালিমাতুস সা’দিয়া (রাঃ) - সংক্ষিপ্ত নাম - হালীমা (রাঃ)\n" +
                    "\n" +
                    "২৪.) হামামা (মাওলাতে আবী বকর সিদ্দীক)  - সংক্ষিপ্ত নাম - হামামা (রাঃ)\n" +
                    "\n" +
                    "২৫.) হামনা বিনতে জাহান (রাঃ) - সংক্ষিপ্ত নাম - হামনা (রাঃ)\n" +
                    "\n" +
                    "২৬.) হাওয়া বিনতে ইয়াযীদ (রাঃ) - সংক্ষিপ্ত নাম - হাওয়া (রাঃ)\n" +
                    "\n" +
                    "২৭.) খালেদা বিনতে আসওয়াদ  - সংক্ষিপ্ত নাম - খালেদা (রাঃ)\n" +
                    "\n" +
                    "২৮.) খাদিজাতুল কোবরা (উম্মুল মু’মেনীন)(রাঃ) - সংক্ষিপ্ত নাম - খাদীজা (রাঃ)\n" +
                    "\n" +
                    "২৯.) খুযায়মা বিনতে জাহাম - সংক্ষিপ্ত নাম - খুযায়মা (রাঃ)\n" +
                    "\n" +
                    "৩০.) খালীদাহ বিনতে কা’নাব  - সংক্ষিপ্ত নাম - খালীদাহ (রাঃ)\n" +
                    "\n" +
                    "৩১.) খানসায়া বিনতে খাদ্দাম আলি আনসারী (রাঃ) - সংক্ষিপ্ত নাম - খানসায়া (রাঃ)\n" +
                    "\n" +
                    "৩২.) খাওলা বিনতে আবদুল্লাহ আল আনসারী (রাঃ) - সংক্ষিপ্ত নাম - খাওলা (রাঃ)\n" +
                    "\n" +
                    "৩৩.) দুজাজা বিনতে আসমা বিন সালত - সংক্ষিপ্ত নাম - দুজাজা (রাঃ)\n" +
                    "\n" +
                    "৩৪.) দুররা বিনতে আবী লাহাব - সংক্ষিপ্ত নাম - দুররা (রাঃ)\n" +
                    "\n" +
                    "৩৫.) রবীআ’হ বিনতে নযর আন-আনসারিয়াহ - সংক্ষিপ্ত নাম - রবীআহ (রাঃ)\n" +
                    "\n" +
                    "৩৬.) রযীনা (রাসূলুল্লাহর (সাঃ) খাদেমা (রাঃ) - সংক্ষিপ্ত নাম - রযীনা (রাঃ)\n" +
                    "\n" +
                    "৩৭.) রূফাইদা আনসারিয়া আন আসলামীয়া (রাঃ)- সংক্ষিপ্ত নাম - রূফাইদা (রাঃ)\n" +
                    "\n" +
                    "৩৮.) রুকাইয়া বিনতে রাসূলুল্লাহ (সাঃ) - সংক্ষিপ্ত নাম - রুকাইয়া (রাঃ)\n" +
                    "\n" +
                    "Arafat A1, [1/6/2023 3:16 AM]\n" +
                    "৩৯.) রমলা বিনতে আবী সুফিয়ান (রাঃ) - সংক্ষিপ্ত নাম - রমলা (রাঃ)\n" +
                    "\n" +
                    "৪০.) রুমাইছা বিনতে উমর (রাঃ)- সংক্ষিপ্ত নাম - রূমাইছা (রাঃ)\n" +
                    "\n" +
                    "৪১.) রায়হানা, রাসূলুল্লাহ (সা)-এর স্ত্রী - সংক্ষিপ্ত নাম - রায়হানা (রাঃ)\n" +
                    "\n" +
                    "৪২.) রায়তা বিনতে হারেছ (রাঃ) - সংক্ষিপ্ত নাম - রায়তা (রাঃ)\n" +
                    "\n" +
                    "৪৩.) সাবীয়া বিনতে হারেছ (রাঃ) - সংক্ষিপ্ত নাম - সাবীয়া (রাঃ)\n" +
                    "\n" +
                    "৪৪.) সাখবারা বিনতে তামীম (রাঃ) - সংক্ষিপ্ত নাম - সাখবারা (রাঃ)\n" +
                    "\n" +
                    "৪৫.) সুখাইলা বিনতে উবাইদা (রাঃ) - সংক্ষিপ্ত নাম - সুখাইলা (রাঃ)\n" +
                    "\n" +
                    "৪৬.) সায়ীদা বিনতে হারিছ (রাঃ) - সংক্ষিপ্ত নাম - সায়ীদা (রাঃ)\n" +
                    "\n" +
                    "৪৭.) সালামা বিনতে মা’কাল আনসারীয় (রাঃ) - সংক্ষিপ্ত নাম - সালামা (রাঃ)\n" +
                    "\n" +
                    "৪৮.) সামুরা বিনতে কাইস আনসারীয়া - সংক্ষিপ্ত নাম - সামরা (রাঃ)\n" +
                    "\n" +
                    "৪৯.) সালমা (রাসূলুল্লাহর (সা) খাদেমা - সংক্ষিপ্ত নাম - সালমা (রাঃ)\n" +
                    "\n" +
                    "৫০.) সুমাইয়া (আম্মার বিন তোইয়াসের এর মা) - সংক্ষিপ্ত নাম - সুমাইয়া (রাঃ)\n" +
                    "\n" +
                    "৫১.) সানা বিনতে আসমা বিনতে সালত- সংক্ষিপ্ত নাম - সানা (রাঃ)\n" +
                    "\n" +
                    "৫২.) সাহলা বিনতে সাহল (রাঃ) - সংক্ষিপ্ত নাম - সাহলা (রাঃ)\n" +
                    "\n" +
                    "৫৩.) সীরীন (মারিয়া কিবতীয়ার বোন) - সংক্ষিপ্ত নাম - সীরীন (রাঃ)\n" +
                    "\n" +
                    "৫৪.) শিফা বিনতে আবদুল্লাহ (রাঃ) - সংক্ষিপ্ত নাম - শিফা (রাঃ)\n" +
                    "\n" +
                    "৫৫.) শাফা বিনতে আওফ (রাল) - সংক্ষিপ্ত নাম - শাফা (রাঃ)\n" +
                    "\n" +
                    "৫৬.) শারমায়া সা’দিয়া (রাসূলুল্লাহর (সা) দুধ বোন - সংক্ষিপ্ত নাম - শায়মারা (রাঃ)\n" +
                    "\n" +
                    "৫৭.) সাফীয়া (উম্মুল মু’মেনীন) (রাঃ) - সংক্ষিপ্ত নাম - সাফীয়া (রাঃ)\n" +
                    "\n" +
                    "৫৮.) সুমাইতা লাইছা (রাঃ) - সংক্ষিপ্ত নাম - সুমাইতা (রাঃ)\n" +
                    "\n" +
                    "৫৯.) যুবায়া’ বিনতে হারেছা (রাঃ) - সংক্ষিপ্ত নাম - যুবায়া (রাঃ)\n" +
                    "\n" +
                    "৬০.) আতেকা বিনতে আব্দুল মুত্তালেব (রা) - সংক্ষিপ্ত নাম - আতেকা (রা)\n" +
                    "\n" +
                    "৬১.) আলীয়াহ বিনতে খবইয়ান (রা) - সংক্ষিপ্ত নাম - আলীয়াহ (রা)\n" +
                    "\n" +
                    "৬২.) ইযযা বিনতে আবী সুফিয়ান (রা) - সংক্ষিপ্ত নাম - ইযযা (রা)\n" +
                    "\n" +
                    "৬৩.) উমায়রা বিনতে সাহল আনসারীয়া - সংক্ষিপ্ত নাম - উমায়রা (রা)\n" +
                    "\n" +
                    "৬৪.) ফাখেতা (উম্মেহানী) বিনতে আবী তালেব - সংক্ষিপ্ত নাম - ফাখেতা (রা)\n" +
                    "\n" +
                    "৬৫.) ফাযেলা আনসারীয়া (রাঃ) - সংক্ষিপ্ত নাম - ফাযেলা (রাঃ)\n" +
                    "\n" +
                    "৬৬.) ফারেয়া বিনতে আব্দুর রহমান (রাঃ) - সংক্ষিপ্ত নাম - ফারেয়া (রাঃ)\n" +
                    "\n" +
                    "৬৭.) ফাতেমা বিনতে মালেক (রা) - সংক্ষিপ্ত নাম - ফাতেমা (রা)\n" +
                    "\n" +
                    "৬৮.) ফাতেমা বিনতে খাত্তাব (রা) - সংক্ষিপ্ত নাম - ফাতেমা (রা)\n" +
                    "\n" +
                    "৬৯.) ফাতিমা বিনতে উমাইস (রাঃ) - সংক্ষিপ্ত নাম - ফাতিমা (রাঃ)\n" +
                    "\n" +
                    "৭০.) আসমা বিনতে উমাইস (রাঃ) - সংক্ষিপ্ত নাম - আসমা (রা)\n" +
                    "\n" +
                    "৭১.) কাবীরা বিনতে সুফিয়ান (রা) - সংক্ষিপ্ত নাম - কাবীরা (রা)\n" +
                    "\n" +
                    "৭২.) লুবাবা বিনতে হারেছ (রাঃ) - সংক্ষিপ্ত নাম - লুবাবা (রা)\n" +
                    "\n" +
                    "৭৩.) লায়লা বিনতে হাকীম (রা) - সংক্ষিপ্ত নাম - লায়লা (রা)\n" +
                    "\n" +
                    "৭৪.) মরিয়ম বিনতে আইয়াস আনসারী - সংক্ষিপ্ত নাম - মরিয়ম (রা)\n" +
                    "\n" +
                    "৭৫.) মালীকা বিনতে উয়াইমার (রাঃ) - সংক্ষিপ্ত নাম - মালিকা (রা)\n" +
                    "\n" +
                    "৭৬.) নাফীসা বিনতে উমাইয়া (রাঃ) - সংক্ষিপ্ত নাম - নাফীসা (রা)\n" +
                    "\n" +
                    "৭৭.) নাওলা বিনতে আসলাম (রাঃ) - সংক্ষিপ্ত নাম - নাওলা (রা)\n" +
                    "\n" +
                    "৭৮.) হুযাইলা বিনতে হারেছ (রাঃ) - সংক্ষিপ্ত নাম - হুযাইলা (রাঃ)\n" +
                    "\n" +
                    "৭৯.) হিন্দ/হিন্দা বিনতে উৎবা (রাঃ) - সংক্ষিপ্ত নাম - হিন্দা (রাঃ)");

        }


    }



    @Override
    public void onStart() {
        super.onStart();


        if (this.f.getString("font", "").equals("1")) {
            this.seekbar1.setProgress(1);
           textview1.setTextSize(14.0f);
           textview2.setTextSize(12.0f);
        }
        if (this.f.getString("font", "").equals("2")) {
            this.seekbar1.setProgress(2);
           textview1.setTextSize(16.0f);
           textview2.setTextSize(14.0f);
        }
        if (this.f.getString("font", "").equals("3")) {
            this.seekbar1.setProgress(3);
           textview1.setTextSize(18.0f);
           textview2.setTextSize(16.0f);
        }
        if (this.f.getString("font", "").equals("4")) {
            this.seekbar1.setProgress(4);
           textview1.setTextSize(20.0f);
           textview2.setTextSize(18.0f);
        }
        if (this.f.getString("font", "").equals("5")) {
            this.seekbar1.setProgress(5);
           textview1.setTextSize(22.0f);
           textview2.setTextSize(20.0f);
        }
        if (this.f.getString("font", "").equals("6")) {
            this.seekbar1.setProgress(6);
           textview1.setTextSize(24.0f);
           textview2.setTextSize(22.0f);
        }
        if (this.f.getString("font", "").equals("7")) {
            this.seekbar1.setProgress(7);
           textview1.setTextSize(26.0f);
           textview2.setTextSize(24.0f);
        }
        if (this.f.getString("font", "").equals("8")) {
            this.seekbar1.setProgress(8);
           textview1.setTextSize(28.0f);
           textview2.setTextSize(26.0f);
        }
        if (this.f.getString("font", "").equals("9")) {
            this.seekbar1.setProgress(9);
           textview1.setTextSize(30.0f);
           textview2.setTextSize(28.0f);
        }
        if (this.f.getString("font", "").equals("10")) {
            this.seekbar1.setProgress(10);
           textview1.setTextSize(32.0f);
           textview2.setTextSize(30.0f);
        }
        if (this.f.getString("Spacing", "").equals("1")) {
            this.seekbar2.setProgress(1);
           textview2.setLineSpacing(0.0f, 0.75f);
        }
        if (this.f.getString("Spacing", "").equals("2")) {
            this.seekbar2.setProgress(2);
           textview2.setLineSpacing(0.0f, 1.0f);
        }
        if (this.f.getString("Spacing", "").equals("3")) {
            this.seekbar2.setProgress(3);
           textview2.setLineSpacing(0.0f, 1.25f);
        }
        if (this.f.getString("Spacing", "").equals("4")) {
            this.seekbar2.setProgress(4);
           textview2.setLineSpacing(0.0f, 1.5f);
        }
        if (this.f.getString("Spacing", "").equals("5")) {
            this.seekbar2.setProgress(5);
           textview2.setLineSpacing(0.0f, 1.75f);
        }
        if (this.f.getString("Spacing", "").equals("6")) {
            this.seekbar2.setProgress(6);
           textview2.setLineSpacing(0.0f, 2.0f);
        }
        if (this.f.getString("Spacing", "").equals("7")) {
            this.seekbar2.setProgress(7);
           textview2.setLineSpacing(0.0f, 2.25f);
        }
        if (this.f.getString("Spacing", "").equals("8")) {
            this.seekbar2.setProgress(8);
           textview2.setLineSpacing(0.0f, 2.5f);
        }
        if (this.f.getString("Spacing", "").equals("9")) {
            this.seekbar2.setProgress(9);
           textview2.setLineSpacing(0.0f, 2.75f);
        }
        if (this.f.getString("Spacing", "").equals("10")) {
            this.seekbar2.setProgress(10);
           textview2.setLineSpacing(0.0f, 3.0f);
        }
    }

}
