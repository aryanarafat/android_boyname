package com.yeasinrabbi.boy_name_2020;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.exifinterface.media.ExifInterface;

import com.google.android.gms.ads.RequestConfiguration;


public class SettingsActivity extends AppCompatActivity {
    private SharedPreferences data;
    private SharedPreferences f;
    private ImageView imageview_back;
    private LinearLayout linear_action_bar;
    private LinearLayout linear_division_1;
    private LinearLayout linear_division_2;
    private LinearLayout linear_division_3;
    private LinearLayout linear_main;
    private SeekBar seekbar_arabic;
    private SeekBar seekbar_content;
    private SeekBar seekbar_heading;
    private SeekBar seekbar_onubad;
    private SeekBar seekbar_syllable;
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    private Switch switch_english;
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    private Switch switch_hindi;
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    private Switch switch_onubad;
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    private Switch switch_syllable;
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    private Switch switch_urdu;
    private TextView textview_rp_chg_1;
    private TextView textview_rp_chg_2;
    private TextView textview_rp_dif_1;
    private TextView textview_rp_dif_2;
    private TextView tv_arabic_def;
    private TextView tv_font_arabic;
    private TextView tv_font_onubad;
    private TextView tv_font_syllable;
    private TextView tv_onubad_def;
    private TextView tv_syllable_dif;
    private ScrollView vscroll1;
    private String colorPrimary = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String colorPrimaryDark = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;


    @Override  
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_settings);
        initialize();
        initializeLogic();
    }

    private void initialize() {
        this.linear_main =  findViewById(R.id.linear_main);
        this.linear_action_bar =  findViewById(R.id.linear_action_bar);
        this.vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
        this.imageview_back = (ImageView) findViewById(R.id.imageview_back);
        this.linear_division_1 =  findViewById(R.id.linear_division_1);
        this.linear_division_2 =  findViewById(R.id.linear_division_2);
        this.linear_division_3 =  findViewById(R.id.linear_division_3);
        this.switch_onubad = (Switch) findViewById(R.id.switch_onubad);
        this.switch_syllable = (Switch) findViewById(R.id.switch_syllable);
        this.switch_english = (Switch) findViewById(R.id.switch_english);
        this.switch_hindi = (Switch) findViewById(R.id.switch_hindi);
        this.switch_urdu = (Switch) findViewById(R.id.switch_urdu);
        this.tv_font_arabic = (TextView) findViewById(R.id.tv_font_arabic);
        this.tv_font_syllable = (TextView) findViewById(R.id.tv_font_syllable);
        this.tv_font_onubad = (TextView) findViewById(R.id.tv_font_onubad);
        ImageView imageview_reset_font = (ImageView) findViewById(R.id.imageview_reset_font);
        this.seekbar_arabic = (SeekBar) findViewById(R.id.seekbar_arabic);
        this.tv_arabic_def = (TextView) findViewById(R.id.tv_arabic_def);
        this.seekbar_syllable = (SeekBar) findViewById(R.id.seekbar_syllable);
        this.tv_syllable_dif = (TextView) findViewById(R.id.tv_syllable_dif);
        this.seekbar_onubad = (SeekBar) findViewById(R.id.seekbar_onubad);
        this.tv_onubad_def = (TextView) findViewById(R.id.tv_onubad_def);
        this.textview_rp_chg_1 = (TextView) findViewById(R.id.textview_rp_chg_1);
        this.textview_rp_chg_2 = (TextView) findViewById(R.id.textview_rp_chg_2);
        ImageView imageview_rp_reset = (ImageView) findViewById(R.id.imageview_rp_reset);
        this.seekbar_heading = (SeekBar) findViewById(R.id.seekbar_heading);
        this.textview_rp_dif_1 = (TextView) findViewById(R.id.textview_rp_dif_1);
        this.seekbar_content = (SeekBar) findViewById(R.id.seekbar_content);
        this.textview_rp_dif_2 = (TextView) findViewById(R.id.textview_rp_dif_2);
        this.f = getSharedPreferences("f", 0);
        this.data = getSharedPreferences("data", 0);
       
        this.imageview_back.setOnClickListener(view -> SettingsActivity.this.finish());

        this.switch_onubad.setOnCheckedChangeListener((compoundButton, z) -> {
            if (z) {
                SettingsActivity.this.f.edit().putString("onubad", "true").apply();
                SettingsActivity.this.switch_onubad.setChecked(true);
                return;
            }
            SettingsActivity.this.f.edit().putString("onubad", "false").apply();
            SettingsActivity.this.switch_onubad.setChecked(false);
        });
    
        this.switch_syllable.setOnCheckedChangeListener((compoundButton, z) -> {
            if (z) {
                SettingsActivity.this.f.edit().putString("syllable", "true").apply();
                SettingsActivity.this.switch_syllable.setChecked(true);
                return;
            }
            SettingsActivity.this.f.edit().putString("syllable", "false").apply();
            SettingsActivity.this.switch_syllable.setChecked(false);
        });
   
        this.switch_english.setOnCheckedChangeListener((compoundButton, z) -> {
            if (z) {
                SettingsActivity.this.f.edit().putString("english", "true").apply();
                SettingsActivity.this.switch_english.setChecked(true);
                return;
            }
            SettingsActivity.this.f.edit().putString("english", "false").apply();
            SettingsActivity.this.switch_english.setChecked(false);
        });
  
        this.switch_hindi.setOnCheckedChangeListener((compoundButton, z) -> {
            if (z) {
                SettingsActivity.this.f.edit().putString("hindi", "true").apply();
                SettingsActivity.this.switch_hindi.setChecked(true);
                return;
            }
            SettingsActivity.this.f.edit().putString("hindi", "false").apply();
            SettingsActivity.this.switch_hindi.setChecked(false);
        });
     
        this.switch_urdu.setOnCheckedChangeListener((compoundButton, z) -> {
            if (z) {
                SettingsActivity.this.f.edit().putString("urdu", "true").apply();
                SettingsActivity.this.switch_urdu.setChecked(true);
                return;
            }
            SettingsActivity.this.f.edit().putString("urdu", "false").apply();
            SettingsActivity.this.switch_urdu.setChecked(false);
        });
    
        imageview_reset_font.setOnClickListener(view -> {
            SettingsActivity.this.seekbar_syllable.setProgress(3);
            SettingsActivity.this.seekbar_onubad.setProgress(3);
            SettingsActivity.this.seekbar_arabic.setProgress(5);
            SketchwareUtil.showMessage(SettingsActivity.this.getApplicationContext(), "resets default");
        });
        this.seekbar_arabic.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override 
            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (i == 1) {
                    SettingsActivity.this.f.edit().putString("font_arabic", "1").apply();
                    SettingsActivity.this.tv_font_arabic.setTextSize(12.0f);
                    SettingsActivity.this.tv_arabic_def.setText("১২");
                }
                if (i == 2) {
                    SettingsActivity.this.f.edit().putString("font_arabic", ExifInterface.GPS_MEASUREMENT_2D).apply();
                    SettingsActivity.this.tv_font_arabic.setTextSize(14.0f);
                    SettingsActivity.this.tv_arabic_def.setText("১২");
                }
                if (i == 3) {
                    SettingsActivity.this.f.edit().putString("font_arabic", ExifInterface.GPS_MEASUREMENT_3D).apply();
                    SettingsActivity.this.tv_font_arabic.setTextSize(16.0f);
                    SettingsActivity.this.tv_arabic_def.setText("১৬");
                }
                if (i == 4) {
                    SettingsActivity.this.f.edit().putString("font_arabic", "4").apply();
                    SettingsActivity.this.tv_font_arabic.setTextSize(18.0f);
                    SettingsActivity.this.tv_arabic_def.setText("১৮");
                }
                if (i == 5) {
                    SettingsActivity.this.f.edit().putString("font_arabic", "5").apply();
                    SettingsActivity.this.tv_font_arabic.setTextSize(20.0f);
                    SettingsActivity.this.tv_arabic_def.setText("২০");
                }
                if (i == 6) {
                    SettingsActivity.this.f.edit().putString("font_arabic", "6").apply();
                    SettingsActivity.this.tv_font_arabic.setTextSize(22.0f);
                    SettingsActivity.this.tv_arabic_def.setText("২২");
                }
                if (i == 7) {
                    SettingsActivity.this.f.edit().putString("font_arabic", "7").apply();
                    SettingsActivity.this.tv_font_arabic.setTextSize(24.0f);
                    SettingsActivity.this.tv_arabic_def.setText("২৪");
                }
                if (i == 8) {
                    SettingsActivity.this.f.edit().putString("font_arabic", "8").apply();
                    SettingsActivity.this.tv_font_arabic.setTextSize(26.0f);
                    SettingsActivity.this.tv_arabic_def.setText("২৬");
                }
                if (i == 9) {
                    SettingsActivity.this.f.edit().putString("font_arabic", "9").apply();
                    SettingsActivity.this.tv_font_arabic.setTextSize(28.0f);
                    SettingsActivity.this.tv_arabic_def.setText("২৮");
                }
                if (i == 10) {
                    SettingsActivity.this.f.edit().putString("font_arabic", "10").apply();
                    SettingsActivity.this.tv_font_arabic.setTextSize(30.0f);
                    SettingsActivity.this.tv_arabic_def.setText("৩০");
                }
            }

            @Override  
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override  
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        this.seekbar_syllable.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.yeasinrabbi.girl_name.SettingsActivity.9
            @Override  
            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (i == 1) {
                    SettingsActivity.this.f.edit().putString("font_syllable", "1").apply();
                    SettingsActivity.this.tv_font_syllable.setTextSize(12.0f);
                    SettingsActivity.this.tv_syllable_dif.setText("১২");
                }
                if (i == 2) {
                    SettingsActivity.this.f.edit().putString("font_syllable", ExifInterface.GPS_MEASUREMENT_2D).apply();
                    SettingsActivity.this.tv_font_syllable.setTextSize(14.0f);
                    SettingsActivity.this.tv_syllable_dif.setText("১৪");
                }
                if (i == 3) {
                    SettingsActivity.this.f.edit().putString("font_syllable", ExifInterface.GPS_MEASUREMENT_3D).apply();
                    SettingsActivity.this.tv_font_syllable.setTextSize(16.0f);
                    SettingsActivity.this.tv_syllable_dif.setText("১৬");
                }
                if (i == 4) {
                    SettingsActivity.this.f.edit().putString("font_syllable", "4").apply();
                    SettingsActivity.this.tv_font_syllable.setTextSize(18.0f);
                    SettingsActivity.this.tv_syllable_dif.setText("১৮");
                }
                if (i == 5) {
                    SettingsActivity.this.f.edit().putString("font_syllable", "5").apply();
                    SettingsActivity.this.tv_font_syllable.setTextSize(20.0f);
                    SettingsActivity.this.tv_syllable_dif.setText("২০");
                }
                if (i == 6) {
                    SettingsActivity.this.f.edit().putString("font_syllable", "6").apply();
                    SettingsActivity.this.tv_font_syllable.setTextSize(22.0f);
                    SettingsActivity.this.tv_syllable_dif.setText("২২");
                }
                if (i == 7) {
                    SettingsActivity.this.f.edit().putString("font_syllable", "7").apply();
                    SettingsActivity.this.tv_font_syllable.setTextSize(24.0f);
                    SettingsActivity.this.tv_syllable_dif.setText("২৪");
                }
                if (i == 8) {
                    SettingsActivity.this.f.edit().putString("font_syllable", "8").apply();
                    SettingsActivity.this.tv_font_syllable.setTextSize(26.0f);
                    SettingsActivity.this.tv_syllable_dif.setText("২৬");
                }
                if (i == 9) {
                    SettingsActivity.this.f.edit().putString("font_syllable", "9").apply();
                    SettingsActivity.this.tv_font_syllable.setTextSize(28.0f);
                    SettingsActivity.this.tv_syllable_dif.setText("২৮");
                }
                if (i == 10) {
                    SettingsActivity.this.f.edit().putString("font_syllable", "10").apply();
                    SettingsActivity.this.tv_font_syllable.setTextSize(30.0f);
                    SettingsActivity.this.tv_syllable_dif.setText("৩০");
                }
            }

            @Override  
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override  
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        this.seekbar_onubad.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.yeasinrabbi.girl_name.SettingsActivity.10
            @Override  
            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (i == 1) {
                    SettingsActivity.this.f.edit().putString("font_onubad", "1").apply();
                    SettingsActivity.this.tv_font_onubad.setTextSize(12.0f);
                    SettingsActivity.this.tv_onubad_def.setText("১২");
                }
                if (i == 2) {
                    SettingsActivity.this.f.edit().putString("font_onubad", ExifInterface.GPS_MEASUREMENT_2D).apply();
                    SettingsActivity.this.tv_font_onubad.setTextSize(14.0f);
                    SettingsActivity.this.tv_onubad_def.setText("১৪");
                }
                if (i == 3) {
                    SettingsActivity.this.f.edit().putString("font_onubad", ExifInterface.GPS_MEASUREMENT_3D).apply();
                    SettingsActivity.this.tv_font_onubad.setTextSize(16.0f);
                    SettingsActivity.this.tv_onubad_def.setText("১৬");
                }
                if (i == 4) {
                    SettingsActivity.this.f.edit().putString("font_onubad", "4").apply();
                    SettingsActivity.this.tv_font_onubad.setTextSize(18.0f);
                    SettingsActivity.this.tv_onubad_def.setText("১৮");
                }
                if (i == 5) {
                    SettingsActivity.this.f.edit().putString("font_onubad", "5").apply();
                    SettingsActivity.this.tv_font_onubad.setTextSize(20.0f);
                    SettingsActivity.this.tv_onubad_def.setText("২০");
                }
                if (i == 6) {
                    SettingsActivity.this.f.edit().putString("font_onubad", "6").apply();
                    SettingsActivity.this.tv_font_onubad.setTextSize(22.0f);
                    SettingsActivity.this.tv_onubad_def.setText("২২");
                }
                if (i == 7) {
                    SettingsActivity.this.f.edit().putString("font_onubad", "7").apply();
                    SettingsActivity.this.tv_font_onubad.setTextSize(24.0f);
                    SettingsActivity.this.tv_onubad_def.setText("২৪");
                }
                if (i == 8) {
                    SettingsActivity.this.f.edit().putString("font_onubad", "8").apply();
                    SettingsActivity.this.tv_font_onubad.setTextSize(26.0f);
                    SettingsActivity.this.tv_onubad_def.setText("২৬");
                }
                if (i == 9) {
                    SettingsActivity.this.f.edit().putString("font_onubad", "9").apply();
                    SettingsActivity.this.tv_font_onubad.setTextSize(28.0f);
                    SettingsActivity.this.tv_onubad_def.setText("২৮");
                }
                if (i == 10) {
                    SettingsActivity.this.f.edit().putString("font_onubad", "10").apply();
                    SettingsActivity.this.tv_font_onubad.setTextSize(30.0f);
                    SettingsActivity.this.tv_onubad_def.setText("৩০");
                }
            }

            @Override  
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override  
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
 
        imageview_rp_reset.setOnClickListener(view -> {
            SettingsActivity.this.seekbar_heading.setProgress(3);
            SettingsActivity.this.seekbar_content.setProgress(3);
            SketchwareUtil.showMessage(SettingsActivity.this.getApplicationContext(), "resets default");
        });
        this.seekbar_heading.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.yeasinrabbi.girl_name.SettingsActivity.12
            @Override  
            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (i == 1) {
                    SettingsActivity.this.f.edit().putString("font_heading", "1").apply();
                    SettingsActivity.this.textview_rp_chg_1.setTextSize(12.0f);
                    SettingsActivity.this.textview_rp_dif_1.setText("১২");
                }
                if (i == 2) {
                    SettingsActivity.this.f.edit().putString("font_heading", ExifInterface.GPS_MEASUREMENT_2D).apply();
                    SettingsActivity.this.textview_rp_chg_1.setTextSize(14.0f);
                    SettingsActivity.this.textview_rp_dif_1.setText("১৪");
                }
                if (i == 3) {
                    SettingsActivity.this.f.edit().putString("font_heading", ExifInterface.GPS_MEASUREMENT_3D).apply();
                    SettingsActivity.this.textview_rp_chg_1.setTextSize(16.0f);
                    SettingsActivity.this.textview_rp_dif_1.setText("১৬");
                }
                if (i == 4) {
                    SettingsActivity.this.f.edit().putString("font_heading", "4").apply();
                    SettingsActivity.this.textview_rp_chg_1.setTextSize(18.0f);
                    SettingsActivity.this.textview_rp_dif_1.setText("১৮");
                }
                if (i == 5) {
                    SettingsActivity.this.f.edit().putString("font_heading", "5").apply();
                    SettingsActivity.this.textview_rp_chg_1.setTextSize(20.0f);
                    SettingsActivity.this.textview_rp_dif_1.setText("২০");
                }
                if (i == 6) {
                    SettingsActivity.this.f.edit().putString("font_heading", "6").apply();
                    SettingsActivity.this.textview_rp_chg_1.setTextSize(22.0f);
                    SettingsActivity.this.textview_rp_dif_1.setText("২২");
                }
                if (i == 7) {
                    SettingsActivity.this.f.edit().putString("font_heading", "7").apply();
                    SettingsActivity.this.textview_rp_chg_1.setTextSize(24.0f);
                    SettingsActivity.this.textview_rp_dif_1.setText("২৪");
                }
                if (i == 8) {
                    SettingsActivity.this.f.edit().putString("font_heading", "8").apply();
                    SettingsActivity.this.textview_rp_chg_1.setTextSize(26.0f);
                    SettingsActivity.this.textview_rp_dif_1.setText("২৬");
                }
                if (i == 9) {
                    SettingsActivity.this.f.edit().putString("font_heading", "9").apply();
                    SettingsActivity.this.textview_rp_chg_1.setTextSize(28.0f);
                    SettingsActivity.this.textview_rp_dif_1.setText("২৮");
                }
                if (i == 10) {
                    SettingsActivity.this.f.edit().putString("font_heading", "10").apply();
                    SettingsActivity.this.textview_rp_chg_1.setTextSize(30.0f);
                    SettingsActivity.this.textview_rp_dif_1.setText("৩০");
                }
            }

            @Override  
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override  
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        this.seekbar_content.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.yeasinrabbi.girl_name.SettingsActivity.13
            @Override  
            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (i == 1) {
                    SettingsActivity.this.f.edit().putString("font_content", "1").apply();
                    SettingsActivity.this.textview_rp_chg_2.setTextSize(12.0f);
                    SettingsActivity.this.textview_rp_dif_2.setText("১২");
                }
                if (i == 2) {
                    SettingsActivity.this.f.edit().putString("font_content", ExifInterface.GPS_MEASUREMENT_2D).apply();
                    SettingsActivity.this.textview_rp_chg_2.setTextSize(14.0f);
                    SettingsActivity.this.textview_rp_dif_2.setText("১৪");
                }
                if (i == 3) {
                    SettingsActivity.this.f.edit().putString("font_content", ExifInterface.GPS_MEASUREMENT_3D).apply();
                    SettingsActivity.this.textview_rp_chg_2.setTextSize(16.0f);
                    SettingsActivity.this.textview_rp_dif_2.setText("১৬");
                }
                if (i == 4) {
                    SettingsActivity.this.f.edit().putString("font_content", "4").apply();
                    SettingsActivity.this.textview_rp_chg_2.setTextSize(18.0f);
                    SettingsActivity.this.textview_rp_dif_2.setText("১৮");
                }
                if (i == 5) {
                    SettingsActivity.this.f.edit().putString("font_content", "5").apply();
                    SettingsActivity.this.textview_rp_chg_2.setTextSize(20.0f);
                    SettingsActivity.this.textview_rp_dif_2.setText("২০");
                }
                if (i == 6) {
                    SettingsActivity.this.f.edit().putString("font_content", "6").apply();
                    SettingsActivity.this.textview_rp_chg_2.setTextSize(22.0f);
                    SettingsActivity.this.textview_rp_dif_2.setText("২২");
                }
                if (i == 7) {
                    SettingsActivity.this.f.edit().putString("font_content", "7").apply();
                    SettingsActivity.this.textview_rp_chg_2.setTextSize(24.0f);
                    SettingsActivity.this.textview_rp_dif_2.setText("২৪");
                }
                if (i == 8) {
                    SettingsActivity.this.f.edit().putString("font_content", "8").apply();
                    SettingsActivity.this.textview_rp_chg_2.setTextSize(26.0f);
                    SettingsActivity.this.textview_rp_dif_2.setText("২৬");
                }
                if (i == 9) {
                    SettingsActivity.this.f.edit().putString("font_content", "9").apply();
                    SettingsActivity.this.textview_rp_chg_2.setTextSize(28.0f);
                    SettingsActivity.this.textview_rp_dif_2.setText("২৮");
                }
                if (i == 10) {
                    SettingsActivity.this.f.edit().putString("font_content", "10").apply();
                    SettingsActivity.this.textview_rp_chg_2.setTextSize(30.0f);
                    SettingsActivity.this.textview_rp_dif_2.setText("৩০");
                }
            }

            @Override  
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override  
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }

    private void initializeLogic() {
        _ColorsOnly();
        if (!this.f.getString("font_default", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("true")) {
            this.seekbar_syllable.setProgress(3);
            this.seekbar_onubad.setProgress(3);
            this.seekbar_arabic.setProgress(5);
            this.tv_arabic_def.setText("২০");
            this.tv_onubad_def.setText("১৬");
            this.tv_syllable_dif.setText("১৬");
            this.seekbar_heading.setProgress(3);
            this.seekbar_content.setProgress(3);
            this.textview_rp_dif_1.setText("১৬");
            this.textview_rp_dif_2.setText("১৬");
            this.f.edit().putString("font_default", "true").apply();
        }
        this.seekbar_arabic.setMax(10);
        this.seekbar_syllable.setMax(10);
        this.seekbar_onubad.setMax(10);
        this.seekbar_heading.setMax(10);
        this.seekbar_content.setMax(10);
        this.imageview_back.setClickable(true);
    }



    @Override
    public void onStart() {
        super.onStart();

        this.linear_main.setBackgroundColor(Color.parseColor(this.colorPrimary));
        this.switch_onubad.setChecked(this.f.getString("onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("true"));
        this.switch_syllable.setChecked(this.f.getString("syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("true"));
        this.switch_english.setChecked(this.f.getString("english", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("true"));
        this.switch_hindi.setChecked(this.f.getString("hindi", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("true"));
        this.switch_urdu.setChecked(this.f.getString("urdu", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("true"));
        if (this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("1")) {
            this.seekbar_arabic.setProgress(1);
            this.tv_font_arabic.setTextSize(12.0f);
            this.tv_arabic_def.setText("১২");
        } else if (this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(ExifInterface.GPS_MEASUREMENT_2D)) {
            this.seekbar_arabic.setProgress(2);
            this.tv_font_arabic.setTextSize(14.0f);
            this.tv_arabic_def.setText("১৪");
        } else if (this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(ExifInterface.GPS_MEASUREMENT_3D)) {
            this.seekbar_arabic.setProgress(3);
            this.tv_font_arabic.setTextSize(16.0f);
            this.tv_arabic_def.setText("১৬");
        } else if (this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("4")) {
            this.seekbar_arabic.setProgress(4);
            this.tv_font_arabic.setTextSize(18.0f);
            this.tv_arabic_def.setText("১৮");
        } else if (this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("5")) {
            this.seekbar_arabic.setProgress(5);
            this.tv_font_arabic.setTextSize(20.0f);
            this.tv_arabic_def.setText("২০");
        } else if (this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("6")) {
            this.seekbar_arabic.setProgress(6);
            this.tv_font_arabic.setTextSize(22.0f);
            this.tv_arabic_def.setText("২২");
        } else if (this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("7")) {
            this.seekbar_arabic.setProgress(7);
            this.tv_font_arabic.setTextSize(24.0f);
            this.tv_arabic_def.setText("২৪");
        } else if (this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("8")) {
            this.seekbar_arabic.setProgress(8);
            this.tv_font_arabic.setTextSize(26.0f);
            this.tv_arabic_def.setText("২৬");
        } else if (this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("9")) {
            this.seekbar_arabic.setProgress(9);
            this.tv_font_arabic.setTextSize(28.0f);
            this.tv_arabic_def.setText("২৮");
        } else if (this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("10")) {
            this.seekbar_arabic.setProgress(10);
            this.tv_font_arabic.setTextSize(30.0f);
            this.tv_arabic_def.setText("৩০");
        }
        if (this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("1")) {
            this.seekbar_syllable.setProgress(1);
            this.tv_font_syllable.setTextSize(12.0f);
            this.tv_syllable_dif.setText("১২");
        } else if (this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(ExifInterface.GPS_MEASUREMENT_2D)) {
            this.seekbar_syllable.setProgress(2);
            this.tv_font_syllable.setTextSize(14.0f);
            this.tv_syllable_dif.setText("১৪");
        } else if (this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(ExifInterface.GPS_MEASUREMENT_3D)) {
            this.seekbar_syllable.setProgress(3);
            this.tv_font_syllable.setTextSize(16.0f);
            this.tv_syllable_dif.setText("১৬");
        } else if (this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("4")) {
            this.seekbar_syllable.setProgress(4);
            this.tv_font_syllable.setTextSize(18.0f);
            this.tv_syllable_dif.setText("১৮");
        } else if (this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("5")) {
            this.seekbar_syllable.setProgress(5);
            this.tv_font_syllable.setTextSize(20.0f);
            this.tv_syllable_dif.setText("২০");
        } else if (this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("6")) {
            this.seekbar_syllable.setProgress(6);
            this.tv_font_syllable.setTextSize(22.0f);
            this.tv_syllable_dif.setText("২২");
        } else if (this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("7")) {
            this.seekbar_arabic.setProgress(7);
            this.tv_font_syllable.setTextSize(24.0f);
            this.tv_syllable_dif.setText("২৪");
        } else if (this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("8")) {
            this.seekbar_syllable.setProgress(8);
            this.tv_font_syllable.setTextSize(26.0f);
            this.tv_syllable_dif.setText("২৬");
        } else if (this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("9")) {
            this.seekbar_syllable.setProgress(9);
            this.tv_font_syllable.setTextSize(28.0f);
            this.tv_syllable_dif.setText("২৮");
        } else if (this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("10")) {
            this.seekbar_syllable.setProgress(10);
            this.tv_font_syllable.setTextSize(30.0f);
            this.tv_syllable_dif.setText("৩০");
        }
        if (this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("1")) {
            this.seekbar_onubad.setProgress(1);
            this.tv_font_onubad.setTextSize(12.0f);
            this.tv_onubad_def.setText("১২");
        } else if (this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(ExifInterface.GPS_MEASUREMENT_2D)) {
            this.seekbar_onubad.setProgress(2);
            this.tv_font_onubad.setTextSize(14.0f);
            this.tv_onubad_def.setText("১৪");
        } else if (this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(ExifInterface.GPS_MEASUREMENT_3D)) {
            this.seekbar_onubad.setProgress(3);
            this.tv_font_onubad.setTextSize(16.0f);
            this.tv_onubad_def.setText("১৬");
        } else if (this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("4")) {
            this.seekbar_onubad.setProgress(4);
            this.tv_font_onubad.setTextSize(18.0f);
            this.tv_onubad_def.setText("১৮");
        } else if (this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("5")) {
            this.seekbar_onubad.setProgress(5);
            this.tv_font_onubad.setTextSize(20.0f);
            this.tv_onubad_def.setText("২০");
        } else if (this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("6")) {
            this.seekbar_onubad.setProgress(6);
            this.tv_font_onubad.setTextSize(22.0f);
            this.tv_onubad_def.setText("২০");
        } else if (this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("7")) {
            this.seekbar_onubad.setProgress(7);
            this.tv_font_onubad.setTextSize(24.0f);
            this.tv_onubad_def.setText("২৪");
        } else if (this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("8")) {
            this.seekbar_onubad.setProgress(8);
            this.tv_font_onubad.setTextSize(26.0f);
            this.tv_onubad_def.setText("২৬");
        } else if (this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("9")) {
            this.seekbar_onubad.setProgress(9);
            this.tv_font_onubad.setTextSize(28.0f);
            this.tv_onubad_def.setText("২৮");
        } else if (this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("10")) {
            this.seekbar_onubad.setProgress(10);
            this.tv_font_onubad.setTextSize(30.0f);
            this.tv_onubad_def.setText("৩০");
        }
        if (this.f.getString("font_heading", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("1")) {
            this.seekbar_heading.setProgress(1);
            this.textview_rp_chg_1.setTextSize(12.0f);
            this.textview_rp_dif_1.setText("১২");
        } else if (this.f.getString("font_heading", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(ExifInterface.GPS_MEASUREMENT_2D)) {
            this.seekbar_heading.setProgress(2);
            this.textview_rp_chg_1.setTextSize(14.0f);
            this.textview_rp_dif_1.setText("১৪");
        } else if (this.f.getString("font_heading", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(ExifInterface.GPS_MEASUREMENT_3D)) {
            this.seekbar_heading.setProgress(3);
            this.textview_rp_chg_1.setTextSize(16.0f);
            this.textview_rp_dif_1.setText("১৬");
        } else if (this.f.getString("font_heading", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("4")) {
            this.seekbar_heading.setProgress(4);
            this.textview_rp_chg_1.setTextSize(18.0f);
            this.textview_rp_dif_1.setText("১৮");
        } else if (this.f.getString("font_heading", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("5")) {
            this.seekbar_heading.setProgress(5);
            this.textview_rp_chg_1.setTextSize(20.0f);
            this.textview_rp_dif_1.setText("২০");
        } else if (this.f.getString("font_heading", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("6")) {
            this.seekbar_heading.setProgress(6);
            this.textview_rp_chg_1.setTextSize(22.0f);
            this.textview_rp_dif_1.setText("২২");
        } else if (this.f.getString("font_heading", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("7")) {
            this.seekbar_heading.setProgress(7);
            this.textview_rp_chg_1.setTextSize(24.0f);
            this.textview_rp_dif_1.setText("২৪");
        } else if (this.f.getString("font_heading", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("8")) {
            this.seekbar_heading.setProgress(8);
            this.textview_rp_chg_1.setTextSize(26.0f);
            this.textview_rp_dif_1.setText("২৬");
        } else if (this.f.getString("font_heading", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("9")) {
            this.seekbar_heading.setProgress(9);
            this.textview_rp_chg_1.setTextSize(28.0f);
            this.textview_rp_dif_1.setText("২৮");
        } else if (this.f.getString("font_heading", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("10")) {
            this.seekbar_heading.setProgress(10);
            this.textview_rp_chg_1.setTextSize(30.0f);
            this.textview_rp_dif_1.setText("৩০");
        }
        if (this.f.getString("font_content", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("1")) {
            this.seekbar_content.setProgress(1);
            this.textview_rp_chg_2.setTextSize(12.0f);
            this.textview_rp_dif_2.setText("১২");
        } else if (this.f.getString("font_content", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(ExifInterface.GPS_MEASUREMENT_2D)) {
            this.seekbar_content.setProgress(2);
            this.textview_rp_chg_2.setTextSize(14.0f);
            this.textview_rp_dif_2.setText("১৪");
        } else if (this.f.getString("font_content", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(ExifInterface.GPS_MEASUREMENT_3D)) {
            this.seekbar_content.setProgress(3);
            this.textview_rp_chg_2.setTextSize(16.0f);
            this.textview_rp_dif_2.setText("১৬");
        } else if (this.f.getString("font_content", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("4")) {
            this.seekbar_content.setProgress(4);
            this.textview_rp_chg_2.setTextSize(18.0f);
            this.textview_rp_dif_2.setText("১৮");
        } else if (this.f.getString("font_content", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("5")) {
            this.seekbar_content.setProgress(5);
            this.textview_rp_chg_2.setTextSize(20.0f);
            this.textview_rp_dif_2.setText("২০");
        } else if (this.f.getString("font_content", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("6")) {
            this.seekbar_content.setProgress(6);
            this.textview_rp_chg_2.setTextSize(22.0f);
            this.textview_rp_dif_2.setText("২২");
        } else if (this.f.getString("font_content", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("7")) {
            this.seekbar_content.setProgress(7);
            this.textview_rp_chg_2.setTextSize(24.0f);
            this.textview_rp_dif_2.setText("২৪");
        } else if (this.f.getString("font_content", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("8")) {
            this.seekbar_content.setProgress(8);
            this.textview_rp_chg_2.setTextSize(26.0f);
            this.textview_rp_dif_2.setText("২৬");
        } else if (this.f.getString("font_content", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("9")) {
            this.seekbar_content.setProgress(9);
            this.textview_rp_chg_2.setTextSize(28.0f);
            this.textview_rp_dif_2.setText("২৮");
        } else if (this.f.getString("font_content", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("10")) {
            this.seekbar_content.setProgress(10);
            this.textview_rp_chg_2.setTextSize(30.0f);
            this.textview_rp_dif_2.setText("৩০");
        }
    }

    private void _ColorsOnly() {
        if (this.data.getString("theme", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("theme6")) {
            this.colorPrimary = "#3F51B5";
            this.colorPrimaryDark = "#1A237E";
        } else if (this.data.getString("theme", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("theme5")) {
            this.colorPrimary = "#607D8B";
            this.colorPrimaryDark = "#37474F";
        } else if (this.data.getString("theme", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("theme4")) {
            this.colorPrimary = "#4CAF50";
            this.colorPrimaryDark = "#1B5E20";
        } else if (this.data.getString("theme", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("theme3")) {
            this.colorPrimary = "#424242";
            this.colorPrimaryDark = "#171717";
        } else if (this.data.getString("theme", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("theme2")) {
            this.colorPrimary = "#FFF3E0";
            this.colorPrimaryDark = "#FFE0B2";
        } else {
            this.colorPrimary = "#FFFFFF";
            this.colorPrimaryDark = "#E0E0E0";
        }
    }

    
}
