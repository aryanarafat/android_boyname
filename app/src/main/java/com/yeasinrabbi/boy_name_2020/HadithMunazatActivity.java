package com.yeasinrabbi.boy_name_2020;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.exifinterface.media.ExifInterface;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;


public class HadithMunazatActivity extends AppCompatActivity {
    private AdListener _interstitial_ad_listener;
    private AdView adview1;
    private SharedPreferences data;
    private SharedPreferences f;
    private AlertDialog.Builder fazilath;
    private ImageView imageview1;
    private ImageView imageview2;
    private LinearLayout linear1;
    private LinearLayout linear3;
    private LinearLayout linear_action_bar;
    private LinearLayout linear_for_arabic;
    private ListView listview_asmaul;
    private ListView listview_ebooks;
    private ListView listview_hadith;
    private ListView listview_manzil;
    private ListView listview_munazat;
    private ListView listview_parashmani;
    private ListView listview_qasida;
    private AlertDialog.Builder ref;
    private TextView textview1;
    private TextView textview2;
    private HashMap<String, Object> map_var = new HashMap<>();
    private String aa = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String bb = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String cc = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String dd = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String ee = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String ff = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String code = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String Fazilath = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String colorPrimary = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String colorPrimaryDark = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String ColorText = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private ArrayList<HashMap<String, Object>> map_list = new ArrayList<>();
    private Intent i = new Intent();
    private Intent ii = new Intent();

    
    @Override  
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_hadith_munazat);
        initialize(bundle);
        initializeLogic();
    }

    private void initialize(Bundle bundle) {
        this.linear1 =  findViewById(R.id.linear1);
        this.linear_action_bar =  findViewById(R.id.linear_action_bar);
        this.linear3 =  findViewById(R.id.linear3);
        this.adview1 =  findViewById(R.id.adview1);
        this.linear_for_arabic =  findViewById(R.id.linear_for_arabic);
        this.imageview1 = (ImageView) findViewById(R.id.imageview1);
        this.textview1 = (TextView) findViewById(R.id.textview1);
        this.imageview2 = (ImageView) findViewById(R.id.imageview2);
        this.listview_hadith = (ListView) findViewById(R.id.listview_hadith);
        this.listview_munazat = (ListView) findViewById(R.id.listview_munazat);
        this.listview_manzil = (ListView) findViewById(R.id.listview_manzil);
        this.listview_asmaul = (ListView) findViewById(R.id.listview_asmaul);
        this.listview_qasida = (ListView) findViewById(R.id.listview_qasida);
        this.listview_parashmani = (ListView) findViewById(R.id.listview_parashmani);
        this.listview_ebooks = (ListView) findViewById(R.id.listview_ebooks);
        this.textview2 = (TextView) findViewById(R.id.textview2);
        this.ref = new AlertDialog.Builder(this);
        this.f = getSharedPreferences("f", 0);
        this.fazilath = new AlertDialog.Builder(this);
        this.data = getSharedPreferences("data", 0);
        this.linear_for_arabic.setOnClickListener(new View.OnClickListener() { // from class: com.yeasinrabbi.girl_name.HadithMunazatActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HadithMunazatActivity.this.i.putExtra("title", HadithMunazatActivity.this.textview1.getText().toString());
                HadithMunazatActivity.this.i.setClass(HadithMunazatActivity.this.getApplicationContext(), ContentFromServerActivity.class);
                HadithMunazatActivity.this.startActivity(HadithMunazatActivity.this.i);
            }
        });
        this.imageview1.setOnClickListener(new View.OnClickListener() { // from class: com.yeasinrabbi.girl_name.HadithMunazatActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {

                HadithMunazatActivity.this.finish();
            }
        });
        this.imageview2.setOnClickListener(new View.OnClickListener() { // from class: com.yeasinrabbi.girl_name.HadithMunazatActivity.3
            @SuppressLint("ResourceType")
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (HadithMunazatActivity.this.getIntent().getStringExtra("Title").equals("তেত্রিশ আয়াত")) {
                    if (!HadithMunazatActivity.this.data.getString("theme", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("theme6")) {
                        if (!HadithMunazatActivity.this.data.getString("theme", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("theme5")) {
                            if (!HadithMunazatActivity.this.data.getString("theme", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("theme4")) {
                                if (!HadithMunazatActivity.this.data.getString("theme", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("theme3")) {
                                    if (HadithMunazatActivity.this.data.getString("theme", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("theme2")) {
                                        HadithMunazatActivity.this.setTheme(16974391);
                                    } else {
                                        HadithMunazatActivity.this.setTheme(16974391);
                                    }
                                } else {
                                    HadithMunazatActivity.this.setTheme(16974372);
                                }
                            } else {
                                HadithMunazatActivity.this.setTheme(16974372);
                            }
                        } else {
                            HadithMunazatActivity.this.setTheme(16974372);
                        }
                    } else {
                        HadithMunazatActivity.this.setTheme(16974372);
                    }
                    HadithMunazatActivity.this.Fazilath = "* ৩৩ আয়াত পরিচিতি :\nএ আমল ‘৩৩ আয়াতের আমল’ নামে অনেকের মুখে পরিচিত। এ নামকরণের কারণ হচ্ছে, শাহ ওয়ালি উল্লাহ দেহলবী রহ. এর বংশে এ আমল ৩৩ আয়াতের আমল নামে প্রচলিত ছিল। তবে সুস্পষ্ট যে, আয়াত সংখ্যার ব্যাপারে প্রচলিত মানযিলের সাথে এর গড়মিল রয়েছে। কারণ, প্রচলিত মানযিলের আয়াত সংখ্যা ৭৯ টি।\n\nশাহ ওয়ালি উল্লাহ দেহলভী রহ. তার পিতার কথা উল্লেখ করে লিখেছেন,\n\nوسمعته (يريد والده) يقول: ثلاث وثلاثون آية تنفع من السحر، وتكون حرزا من اللصوص والسباع، أربع آيات من أول البقرة، وآية الكرسي وآيتان بعدها إلى خالدون، وثلاث من آخر البقرة، وثلاث من الأعراف {إن ربكم الله} إلى {المحسنين}، وآخر بني إسرائيل {قل ادعو الله أو ادعو الرحمن}، وعشر آيات من أول الصافات إلى {لازب}، وآيتان من سورة الرحمن {يا معشر الجن} إلى {تنتصران}، وآخر سورة الحشر {لو أنزلنا هذا القرآن}، وآيتان من {قل أوحي} {وأنه تعالى جد ربنا} إلى {شططا}، فهذه هي الآيات المسميات بثلاث وثلاثين آية\n\nআমি আমার পিতাকে বলতে শুনেছি। তিনি বলেছেন, ৩৩ টি আয়াত এমন আছে যা যাদু-টোনা থেকে রক্ষার ক্ষেত্রে উপকারী এবং চোর-ডাকাত ও হিংস্র প্রাণী থেকে আত্মরক্ষার মাধ্যম। আয়াতগুলো এই,\n\n১. সূরা বাকারার প্রথম ৪ আয়াত\n২. আয়াতুল কুরসী ও তার পরবর্তী দুই আয়াত মোট ৩ আয়াত\n৩. সূরা বাকারার শেষ ৩ আয়াত\n৪. সূরা আরাফ এর ৫৪, ৫৫ ও ৫৬ নং আয়াত, মোট ৩ আয়াত\n৫. সূরা ইসরা এর ১১০ নং আয়াত\n৬. সূরা সাফ্ফাত এর প্রথম ১০ আয়াত\n৭. সূর আর রহমান এর ৩৩ ও ৩৪ নং আয়াত\n৮. সূরা হাশর এর শেষ ৪ আয়াত\n৯. সূরা জিন এর ৩য় ও ৪র্থ নং আয়াত\nএই মোট ৩৩ আয়াত। তবে এরপরেই শাহ ওয়ালি উল্লাহ দেহলভী রহ. লিখেছেন,\n\nوكان سيدي الوالد يزيد عليها الفاتحة، وقل أيها الكافرون، وقل هو الله أحد، والمعوذتين، ويأخذ من سورة قل {أوحي} إلى {شططا}.\n\nতবে আমার সম্মানিত পিতা এর যোগ করতেন, সূরা ফাতিহা (৭ আয়াত), সূরা কাফিরুন (৬ আয়াত), সূরা ইখলাস (৪ আয়াত), সূরা ফালাক (৫ আয়াত), সূরা নাস (৬ আয়াত) ও সূরা জ্বিন থেকে ‘শাত্বাত্বা’ পর্যন্ত (অতিরিক্ত ২ আয়াত)। [প্রাগুক্ত]\n\nঅর্থাৎ তিনি এই ৩৩ আয়াতের সাথে আরো ৩০ আয়াত যোগ করে ৬৩ আয়াত পড়তেন।\n\nআয়াত সংখ্যাই যাই হোক, এ আমলের ক্ষেত্রে এটি কোন বিবেচ্য বিষয় নয়; কারণ এ আমল বা এর আয়াত সংখ্যা কোন মানসূস আলাইহ (শরীয়তের পক্ষ থেকে নির্ধারিত) বিষয় নয়। তাই এতে কম-বেশ করার সুযোগ রয়েছে। আল্লাহ তায়ালা আমাদের সঠিক বুঝ দান করুন। আমীন।\n\n\n* উপকারিতা জানুন :\n\n        ক)\u200a\u200aজ্বিন-পরী\u200a \u200a\u200a\u200a\u200aঅথবা\u200a \u200a\u200a\u200a\u200aবান-টোনায় \u200a\u200a\u200a\u200aআক্রান্ত ব্যক্তিকে \u200a\u200a\u200aএই\u200a\u200a \u200a\u200a\u200a৩৩ \u200a\u200a\u200aআয়াতের \u200a\u200a\u200aতাবীজ \u200aলিখে খাওয়ার পানিতে ভিজিয়ে\u200a রেখে\u200a ১৩ দিন\u200a পর্যন্ত পানি\u200a \u200a\u200aপান \u200a\u200aকরালে\u200a \u200a\u200aএবং \u200a\u200aগোসল\u200a\u200a \u200a\u200aকরার \u200a\u200aপর কোমর পর্যন্ত পানিতে\u200a\u200a নেমে ১৩ দিন\u200a পর্যন্ত ৩৩ আয়াত ভিজানো পানি\u200a\u200a হতে\u200a কিছু\u200a পানি\u200a মাথায়ও সর্বাঙ্গে (কোমরের\u200a উপর\u200a\u200a পর্যন্ত) ঢেলে\u200a দিলে আল্লাহ\u200a\u200a \u200a\u200a\u200aতায়ালার \u200a\u200a\u200aরহমতে\u200a \u200a\u200a\u200aউল্লেখিত \u200a\u200a\u200aবিষয়ে আক্রান্ত লোক\u200a ভাল হবে। ইনশাআল্লাহ।একটি তাবীজে ভাল না হলে উক্ত নিয়মে ২, ৩, ৪, ৫, ৬ অথবা ৭টি তাবীজ ব্যবহার করতে হবে।\n\n        খ) যে ব্যক্তি এই ৩৩ আয়াত ভক্তির সাথে পাঠ করবে, আল্লাহ তায়ালা তার সকল নেক মকসুদ পূর্ণ\u200a করে দিবেন\u200a এবং\u200a সে নিরাপদে কালযাপন করবে। \u200a \u200a\u200a\u200a\u200aসে \u200a\u200a\u200a\u200a\u200aসব\u200a \u200a\u200a\u200a\u200a\u200aসময় \u200a\u200a\u200a\u200a\u200aআল্লাহ\u200a \u200a\u200a\u200a\u200a\u200aতায়ালার রহমতের মধ্যে থাকতে পারবে।\n\n        গ) \u200a\u200aএই \u200a\u200aসমস্ত \u200a\u200aআয়াত \u200a\u200aকিছুটা \u200a\u200aকম \u200a\u200aবেশি \u200a\u200aরদ \u200aবদলের \u200aসাথে\u200a \u200aআল \u200aকাওলুল \u200aজামিল\u200a\u200a \u200aকিতাবে আল্লামা\u200a শাহ\u200a অলি উল্লাহ\u200a\u200a\u200a মোহাদ্দিসে দেহলভী রাদিয়াল্লাহু \u200a\u200aআনহু\u200a\u200aলিখেন- \u200a\u200a‘এই \u200a\u200a৩৩ \u200a\u200aআয়াত \u200aযাদু\u200a\u200a \u200aটোনার \u200aআছরকে\u200a \u200aধ্বংস\u200a \u200aকরে \u200aদেয়\u200a \u200aএবং ভূত পেতনী জ্বিন\u200a পরী এবং\u200a\u200a চোর ডাকাত আর\u200a হিংস্র \u200aজন্তুর \u200aআক্রমণ \u200aও \u200aঅনিষ্ট \u200aহতে \u200aহেফাজত \u200aকরে।’";
                    HadithMunazatActivity.this._setDialogFont(HadithMunazatActivity.this.fazilath, "তেত্রিশ আয়াত", HadithMunazatActivity.this.Fazilath, "solaimanlipi.ttf");
                    HadithMunazatActivity.this.fazilath.setPositiveButton("Okey", new DialogInterface.OnClickListener() { // from class: com.yeasinrabbi.girl_name.HadithMunazatActivity.3.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    });
                    HadithMunazatActivity.this.fazilath.create().show();
                }
                if (HadithMunazatActivity.this.getIntent().getStringExtra("Title").equals("মনজিল")) {
                    if (!HadithMunazatActivity.this.data.getString("theme", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("theme6")) {
                        if (!HadithMunazatActivity.this.data.getString("theme", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("theme5")) {
                            if (!HadithMunazatActivity.this.data.getString("theme", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("theme4")) {
                                if (!HadithMunazatActivity.this.data.getString("theme", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("theme3")) {
                                    if (HadithMunazatActivity.this.data.getString("theme", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("theme2")) {
                                        HadithMunazatActivity.this.setTheme(16974391);
                                    } else {
                                        HadithMunazatActivity.this.setTheme(16974391);
                                    }
                                } else {
                                    HadithMunazatActivity.this.setTheme(16974372);
                                }
                            } else {
                                HadithMunazatActivity.this.setTheme(16974372);
                            }
                        } else {
                            HadithMunazatActivity.this.setTheme(16974372);
                        }
                    } else {
                        HadithMunazatActivity.this.setTheme(16974372);
                    }
                    HadithMunazatActivity.this.Fazilath = "মানযিল কী?\nমানযিল মূলত কুরআনে নির্বাচিত কিছু আয়াতের সমষ্টি। কুরআনের ১৮ টি স্থান থেকে মোট ৭৯ টি আয়াত নিয়ে প্রস্তুত হয়েছে মানযিল। যথা:\n\n১. সূরা ফাতেহা, ৭ আয়াত\n২. সূরা বাকারার শুরুর ৫ আয়াত\n৩. সূরা বাকারার ১৬৩ নং আয়াত\n৪. সূরা বাকারা আয়াত নং ২৫৫, ২৫৬ ও ২৫৭, অর্থাৎ আয়াতুল কুরসী ও তার পরবর্তী ২ আয়াত\n৫. সূরা বাকারার শেষ ৩ আয়াত, আয়াত নং ২৮৪, ২৮৫ ও ২৮৬\n৬. সূরা আলে ইমরান এর ১৮ নং আয়াত\n৭. সূরা আলে ইমরান এর ২৬ ও ২৭ নং আয়াত\n৮. সূরা আরাফ এর ৫৪, ৫৫ ও ৫৬ নং আয়াত\n৯. সূরা বনী ইসরাঈল এর শেষ ২ আয়াত, ১১০ ও ১১১ নং আয়াত\n১০. সূরা মুমিনুন এর শেষ ৪ আয়াত, ১১৫, ১১৬, ১১৭ ও ১১৮ নং আয়াত\n১১. সূরা সাফ্ফাত এর শুরু থেকে ১১ আয়াত\n১২. সূরা রহমান এর ৩৩ থেকে ৪০ পর্যন্ত, মোট ৮ আয়াত\n১৩. সূরা হাশর এর শেষ ৪ আয়াত। ২১, ২২, ২৩ ও ২৪ নং আয়াত\n১৪. সূরা জ্বিন এর শুরুর ৪ আয়াত\n১৫. সূরা কাফিরুন, মোট ৬ আয়াত\n১৬. সূরা ইখলাস, মোট ৪ আয়াত\n১৭. সূরা ফালাক্ব, মোট ৫ আয়াত\n১৮. সূরা নাস, মোট ৬ আয়াত\n\nআমাদের সমাজের দ্বীনদার শ্রেণীর মাঝে ‘মানযিল’ এর আয়াত সমষ্টি তেলাওয়াতের আমল প্রচলিত আছে। উলামায়ে কিরামও এ আমল করার প্রতি উৎসাহিত করে থাকেন।\n\nআমাদের জানামতে মানযিল নামে এ আমলের প্রচলন মূলত শাইখুল হাদীস মাওলানা যাকারিয়া কান্ধলভী রহ. (মৃত ১৪০২) এর মাধ্যমে। এটি শাইখুল হাদীস রহ. এর বংশের বুজুর্গদের আমল ছিল। আমাদের বাজারে যে মনযিল নামে ছোট পুস্তিকা পাওয়া যায় তা মূলত শাইখুল হাদীস মাওলানা যাকারিয়া রহ. এর সাহেবজাদা মাওলানা তালহা কান্ধলভী রহ. এর উদ্যোগে প্রথম প্রকাশিত হয়েছিল। পরবর্তীতে তার অনুকরণে অরো অনেক প্রকাশক ছাপার উদ্যোগ নিয়েছেন।\n\nহযরত মাওলানা তালহা কান্ধলভী রহ. এ পুস্তিকার ভূমিকায় লিখেছেন,\nআমাদের ঘরের নারীরা যখন কোন অসুস্থ নারীর জন্য মনযিল এর আমল দিতেন তখন তাদের মূল কুরআনে চিহ্নিত করে দিতে হত। তাই ইচ্ছা হল যে, এটিকে ভিন্নভাবে পাছানোর উদ্যোগ নেওয়া হোক, তাহলে তাদেরকে আমলটি বলে দেওয়া সহজ হবে। [মানযিল পৃষ্ঠা ৩]\n\nঅবশ্য এরও আগে শাহ ওয়ালি উল্লাহ দেহলভী রহ. (মৃত ১১৭৬) এর বংশেও এ আমলের কথা পাওয়া যায়। তবে তাদের সময় এ আমল ‘৩৩ আয়াতের আমল’ নামে পরিচিত ছিল। যার সাথে আমাদের প্রচলিত মানযিলের আয়াত সংখ্যার কিছু পার্থক্য রয়েছে। এর আলোচনা একটু পরেই আসছে।\n_____________________________________________________\n\n* এ আমলের ফযিলত ও বৈশিষ্ট্য\n\nএক.\nএতে সন্দেহের কোন অবকাশ নেই যে কুরআন তিলাওয়াত সর্বোত্তম যিকির। এর প্রতি অক্ষর তিলাওয়াতের বিনিময়ে কমপক্ষে দশ নেকি লাভ হয়। হযরত আব্দুল্লাহ ইবনে মাসউদ রা. বলেন, রাসূল সা. বলেছেন, যে ব্যক্তি কুরআনের একটি হরফ তিলাওয়াত করবে সে একটি নেকি লাভ করবে। আর একটি নেকি দশটি নেকিতে বৃদ্ধি করা হবে। আমি বলছি না ‘আলিফ লাম মিম’ একটি হরফ; বরং ‘আলিফ’ একটি হরফ, ‘লাম’ একটি হরফ ও ‘মিম’ একটি হরফ। [সুনানে তিরমিযী ২৯১০, সনদ সহীহ]\n\nতাই মানযিল এর নির্বাচিত কিছু আয়াত তিলাওয়াত করলে অবশ্যই উল্লেখিত সওয়াব লাভ হবে।\n\nদুই.\nপাশাপাশি এর যে সকল আয়াতের ব্যাপারে ভিন্ন কোন ফযিলত ও বৈশিষ্ট্যের কথা হাদীসে রয়েছে তেলাওয়াতের মাধ্যমে তাও লাভ হবে। নিচে উদাহরণ স্বরূপ এমন কিছু নির্ভরযোগ্য হাদীসের উদ্ধৃতি পেশ করা হল।\n\nসূরা ফাতেহা সম্পর্কে : আবূ সা’ঈদ খুদরী রা. বর্ণনা করেছেন। তিনি বলেন, একবার আমরা সফরে চলছিলাম। পথিমধ্যে অবতরণ করলাম। তখন একটি বালিকা এসে বলল, এখানকার গোত্রের সরদারকে সাপে কেটেছে। আমাদের পুরুষগণ বাড়িতে নেই। অতএব, আপনাদের মধ্যে এমন কেউ আছেন কি, যিনি ঝাড়-ফুঁক করতে পারেন? তখন আমাদের মধ্য থেকে একজন ঐ বালিকাটির সঙ্গে গেলেন। যদিও আমরা ভাবিনি যে সে ঝাড়-ফুঁক জানে। এরপর সে ঝাড়-ফুঁক করল এবং গোত্রের সরদার সুস্থ হয়ে উঠল। এতে সর্দার খুশী হয়ে তাকে ত্রিশটি বকরী দান করলেন এবং আমাদের সকলকে দুধ পান করালেন। ফিরে আসার পথে আমারা জিজ্ঞেস করলাম, তুমি ভালভাবে ঝাড়-ফুঁক করতে জান? সে উত্তর করল, না, আমি তো কেবল উম্মুল কিতাব- সূরা ফাতিহা দিয়েই ঝাড়-ফুঁক করেছি। আমরা তখন বললাম, যতক্ষণ না আমরা নবী সাল্লাল্লাহু আলাইহি ওয়া সাল্লাম এর কাছে পৌঁছে তাঁকে জিজ্ঞেস করি ততক্ষণ কেউ কিছু বলবে না। এরপর আমরা মদিনায় পৌঁছে নবী সাল্লাল্লাহু আলাইহি ওয়া সাল্লাম এর কাছে ঘটনাটি বললাম। তিনি বললেন, সে কেমন করে জানল যে, তা (সূরা ফাতিহা) রোগ আরোগ্যের জন্য ব্যবহার করা যেতে পারে? তোমরা নিজেদের মধ্যে এগুলো বণ্টন করে নাও এবং আমার জন্যও একটা ভাগ রেখো। [সহীহ বুখারী ৫০০৭]\n\nসূরা বাকারা সম্পর্কে : আবূ হুরায়রাহ রা. বর্ণনা করেছেন, রসূলুল্লাহ সা. বলেছেন, তোমাদের ঘরসমূহকে কবর সদৃশ করে রেখো না, কারণ যে ঘরে সূরাহ্ বাক্বারাহ্ পাঠ করা হয় শয়তান সে ঘর থেকে পালিয়ে যায়। [সহীহ মুসলিম ৭৮০]\n\nসূরা বাকারার শেষ দুই আয়াত সম্পর্কে : ১. হযরত আবু মাসউদ রা. বলেন, রাসূলুল্লাহ সা. বলেছেন, যে ব্যক্তি কোন রাতে সূরা বাকারার শেষ দুই আয়াত পাঠ করবে তার জন্য তা যথেষ্ট হয়ে যাবে। [সহীহ বুখারী ৪০০৮, ৫০০৮, ৫০৪০]\n\n২. নু‘মান ইবনু বাশীর রা. বর্ণনা করেছেন, নবী সা. বলেছেন, আল্লাহ তা‘আলা আসমান-জামিন সৃষ্টির দুই হাজার বছর পূর্বে একটি কিতাব লিখেছেন। সেই কিতাব হতে তিনি দু‘টি আয়াত নাযিল করছেন। সেই দু‘টি আয়াতের মাধ্যমেই সূরা আল-বাক্বারা সমাপ্ত করেছেন। যে ঘরে তিন রাত এ দু‘টি আয়াত তিলাওয়াত করা হয় শয়তান সেই ঘরের নিকট আসতে পারে না। [সুনানে তিরমিযী ২৮৮২, মুসনাদে আহমদ ১৮৪১৪, সনদ সহীহ]\n\nসূরা ফাতেহা ও সূরা বাকারার শেষাংশ সম্পর্কে : আবদুল্লাহ ইবনু আব্বাস রা. বর্ণনা করেছেন, তিনি বলেন, একদিন জিবরাঈল আ. নবী সা. এর কাছে বসেছিলেন। সে সময় তিনি উপর দিক থেকে দরজা খোলার একটা প্রচণ্ড আওয়াজ শুনতে পেয়ে মাথা উঠিয়ে বললেন, এটি আসমানের একটি দরজা। আজকেই এটি খোলা হলো- ইতোপূর্বে আর কখনো খোলা হয়নি। আর এ দরজা দিয়ে একজন ফেরেশতা পৃথিবীতে নেমে আসলেন। আজকের এ দিনের আগে আর কখনো তিনি পৃথিবীতে আসেননি। তারপর তিনি সালাম দিয়ে বললেন, আপনি আপনাকে দেয়া দু’টি নূর বা আলোর সুসংবাদ গ্রহণ করুন। আপনার পূর্বে আর কোন নবীকে তা দেয়া হয়নি। আর ঐ দু’টি নূর হলো সূরা ফাতিহা এবং সূরা আল বাক্বারাহ্ এর শেষাংশ। এর যে কোন হরফ আপনি পড়বেন তার মধ্যকার প্রার্থিত বিষয় আপনাকে দেয়া হবে। [সহীহ মুসলিম ৮০৬]\n\nআয়াতুল কুরসী সম্পর্কে : আবূ হুরায়রা (রাঃ) বর্ণনা করেছেন, তিনি বলেন, আল্লাহর রাসূল সা. আমাকে রমযানের যাকাত (সাদাকাতুল ফিতরের) হিফাজতের দায়িত্ব প্রদান করলেন। অতঃপর আমার নিকট এক আগন্তুক আসল। সে তার দু’হাতের আঁজলা ভরে খাদ্যশস্য গ্রহণ করতে লাগল। তখন আমি তাকে ধরে ফেললাম এবং বললাম, আমি অবশ্যই তোমাকে আল্লাহর রাসূল সা. এর নিকট নিয়ে যাব। তখন সে একটি হাদীস উল্লেখ করল এবং বলল, যখন তুমি বিছানায় শুতে যাবে, তখন আয়াতুল কুরসী পড়বে। তাহলে সর্বদা আল্লাহর পক্ষ হতে তোমার জন্য একজন হিফাযতকারী থাকবে এবং সকাল হওয়া অবধি তোমার নিকট শয়তান আসতে পারবে না। তখন নবী সা. বললেন, সে তোমাকে সত্য বলেছে, অথচ সে মিথ্যাচারী এবং শয়তান ছিল। [সহীহ বুখারী ৩২৭৫]\n\nসূরা আলে ইমরান সম্পর্কে : আবূ উসামা আল বাহিলী রা. বর্ণনা করেছেন, তিনি বলেন, আমি রসূলুল্লাহ সা. কে বলতে শুনেছি, তোমরা কুরআন পাঠ কর। কারন কিয়ামতের দিন তার পাঠকারীর জন্য সে শাফাআতকারী হিসেবে আসবে। তোমরা দু’টি উজ্জ্বল সূরা অর্থাৎ সূরা আল বাক্বারাহ এবং সূরা আল ইমরান পড়। ক্বিয়ামতের দিন এ দু’টি সুরা এমনভাবে আসবে যেন তা দু’খ- মেঘ অথবা দু’টি ছায়াদানকারী অথবা দু’ঝাঁক উড়ন্ত পাখি যা তার পাঠকারীর পক্ষ হয়ে কথা বলবে। [সহীহ মুসলিম ৮০৪]\n\nসূরা ইসরা সম্পর্কে : আয়িশা রা. বর্ণনা করেছেন, সূরা বানী ইসরাঈল ও সূরা আয্-যুমার তিলাওয়াত না করা পর্যন্ত নবী সা. ঘুমাতেন না। [সুনানে তিরমিযী ২৯২০, মুসনাদে আহমদ ২৪৯০৮, সনদ হাসান]\n\nসূরা কাফিরুন সম্পর্কে : ফরওয়াহ ইবনু নাওফাল রা. বর্ণনা করেছেন, তিনি নবী সা. এর কাছে এসে বললেন, হে আল্লাহর রাসূল! আমাকে কিছু শিখিয়ে দিন, যা আমি বিছানাগত হওয়াকালে বলতে পারি। তিনি বললেন, তুমি ‘কুল ইয়া আইয়্যুহাল কাফিরুন’ সূরাটি তিলাওয়াত কর। কারণ তা শিরক হতে মুক্তির ঘোষণা। [সুনানে তিরমিযী ৩৪০৩, সুনানে আবু দাউদ ৫০৫৫, সনদ হাসান]\n\nসূরা ইখলাস ও সূরা ফালাক-নাস সম্পর্কে : আবদুল্লাহ ইবনু খুবাইব রা. বর্ণনা করেছেন, তিনি বলেন, এক ঘুটঘুটে অন্ধকার ও বৃষ্টিমুখর রাতে আমাদের নামায আদায় করানোর জন্য আমরা রাসূল সা. এর সন্ধানে বের হলাম। আমি তাঁর দেখা পেলে তিনি বললেন, বল। কিন্তু আমি কিছুই বললাম না। তিনি পুনরায় বললেন, বল। এবারও আমি কিছুই বললাম না। তিনি আবার বললেন, বল। এবার আমি প্রশ্ন করলাম, আমি কি বলব? তিনি বললেন, তুমি প্রতি দিন বিকালে ও সকালে তিনবার সূরা আল-ইখলাস, সূরা আল-ফালাক্ব ও সুরা আন-নাস পাঠ করবে, তাহলে তা সবকিছু থেকে তোমার জন্য যথেষ্ট হয়ে যাবে। [সুনানে তিরমিযী ৩৫৭৫, মুসনাদে আহমদ ২২৬৬৪, সনদ হাসান].\n\n\nতিন.\nউক্ত ফযিলত ছাড়াও সুস্থতা লাভ কিংবা বিভিন্ন আছর ও যাদু-টোনা আত্মরক্ষার উদ্দেশ্যে কুরআনের আয়াত দ্বারা ঝাড়ফুঁক করাও জায়েয। তাই শুধু এ উদ্দেশ্যে হলেও এ আয়াতগুলো পড়া যেতে পারে। জৈনক ইসলামী পণ্ডিত বলেন,\n\nوَأَمَّا مُعَالَجَةُ الْمَصْرُوعِ بِالرُّقَى، وَالتَّعَوُّذَاتِ. فَهَذَا عَلَى وَجْهَيْنِ: فَإِنْ كَانَتْ الرُّقَى وَالتَّعَاوِيذُ مِمَّا يُعْرَفُ مَعْنَاهَا، وَمِمَّا يَجُوزُ فِي دِينِ الْإِسْلَامِ أَنْ يَتَكَلَّمَ بِهَا الرَّجُلُ، دَاعِيًا لِلَّهِ، ذَاكِرًا لَهُ، وَمُخَاطِبًا لِخَلْقِهِ، وَنَحْوُ ذَلِكَ، فَإِنَّهُ يَجُوزُ أَنْ يُرْقَى بِهَا الْمَصْرُوعُ، وَيُعَوَّذَ، فَإِنَّهُ قَدْ ثَبَتَ فِي الصَّحِيحِ عَنْ النَّبِيِّ – صَلَّى اللَّهُ عَلَيْهِ وَسَلَّمَ -: أَنَّهُ أَذِنَ فِي الرُّقَى، مَا لَمْ تَكُنْ شِرْكًا,. وَقَالَ: مَنْ اسْتَطَاعَ مِنْكُمْ أَنْ يَنْفَعَ أَخَاهُ فَلْيَفْعَلْ وَإِنْ كَانَ فِي ذَلِكَ كَلِمَاتٌ مُحَرَّمَةٌ مِثْلُ أَنْ يَكُونَ فِيهَا شِرْكٌ، أَوْ كَانَتْ مَجْهُولَةَ الْمَعْنَى يُحْتَمَلُ أَنْ يَكُونَ فِيهَا كُفْرٌ، فَلَيْسَ لِأَحَدٍ أَنْ يَرْقِيَ بِهَا.\n\nঅর্থ: আছরগ্রস্থ ব্যক্তিকে ঝাড়-ফুঁকের মাধ্যমে চিকিৎসা করা দুই প্রকার। তা যদি এমন শব্দ দ্বারা হয় যার অর্থ সুস্পষ্ট এবং তা ইসলামী শরীয়ত অনুযায়ী পড়াও বৈধ (যেমন, আল্লাহর কোন নাম, যিকির বা সৃষ্টিকুলকে লক্ষ করে আল্লাহর কোন সম্বোধন ইত্যাদি) দ্বারা আছরগ্রস্থ ব্যক্তিকে ঝাড়-ফুঁক করা জায়েয। কারণ, সহীহ হাদীসের বর্ণনা মতে রাসূল সা. শিরক না হলে ঝাড়-ফুঁক করার অনুমতি দিয়ে বলেছেন, তোমাদের কেউ যদি তার ভাইকে উপকার করতে সক্ষম হয় তাহলে সে যেন তা করে। আর যদি ঝাড়-ফুঁক হারাম বাক্য দ্বারা হয় (যেমন, কুফর-শিরকযুক্ত বাক্য) অথবা এমন বাক্য যার অর্থ জানা নেই (যাতে কুফর ও শিরকের সম্ভাবনা রয়েছে) তা দ্বারা ঝাড়-ফুঁক করা জায়েয নয়। [আল ফাতাওয়াল কুবরা ৩/১৩; মজমূউল ফাতাওয়া ২৪/২৭৮]\n\nহাফেজ ইবনে হাজার আসকালানী রহ. বলেন,\n\nوَقَدْ أَجْمَعَ الْعُلَمَاءُ عَلَى جَوَازِ الرُّقَى عِنْدَ اجْتِمَاعِ ثَلَاثَةِ شُرُوطٍ أَنْ يَكُونَ بِكَلَامِ اللَّهِ تَعَالَى أَوْ بِأَسْمَائِهِ وَصِفَاتِهِ وَبِاللِّسَانِ الْعَرَبِيِّ أَوْ بِمَا يُعْرَفُ مَعْنَاهُ مِنْ غَيْرِهِ وَأَنْ يُعْتَقَدَ أَنَّ الرُّقْيَةَ لَا تُؤَثِّرُ بِذَاتِهَا بَلْ بِذَاتِ اللَّهِ تَعَالَى.\n\nতিনটি শর্ত বিদ্যমান থাকার শর্তে উলামায়ে কিরাম ঝাড়-ফুঁক বৈধ হওয়ার ব্যাপারে একমত। ঝাড়-ফুঁকের বাক্যগুলো আল্লাহর কালাম, তাঁর নাম এ সিফাত হতে হবে, আরবই ভাষা বা অর্থ সুস্পষ্ট এমন বাক্য দ্বারা হতে হবে এবং বিশ্বাস রাখতে হবে যে ঝাড়-ফুঁক শুধু মাধ্যম মাত্র; মূলত পতিক্রিয়া সৃষ্টি করেন আল্লাহ তায়ালা। [ফাতহুল বারী ১০/১৯৫]";
                    HadithMunazatActivity.this._setDialogFont(HadithMunazatActivity.this.fazilath, "মনজিল", HadithMunazatActivity.this.Fazilath, "solaimanlipi.ttf");
                    HadithMunazatActivity.this.fazilath.setPositiveButton("Okey", new DialogInterface.OnClickListener() { // from class: com.yeasinrabbi.girl_name.HadithMunazatActivity.3.2
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    });
                    HadithMunazatActivity.this.fazilath.create().show();
                }
                if (HadithMunazatActivity.this.getIntent().getStringExtra("Title").equals("কাসীদা এ বুরদাহ")) {
                    if (!HadithMunazatActivity.this.data.getString("theme", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("theme6")) {
                        if (!HadithMunazatActivity.this.data.getString("theme", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("theme5")) {
                            if (!HadithMunazatActivity.this.data.getString("theme", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("theme4")) {
                                if (!HadithMunazatActivity.this.data.getString("theme", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("theme3")) {
                                    if (HadithMunazatActivity.this.data.getString("theme", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("theme2")) {
                                        HadithMunazatActivity.this.setTheme(16974391);
                                    } else {
                                        HadithMunazatActivity.this.setTheme(16974391);
                                    }
                                } else {
                                    HadithMunazatActivity.this.setTheme(16974372);
                                }
                            } else {
                                HadithMunazatActivity.this.setTheme(16974372);
                            }
                        } else {
                            HadithMunazatActivity.this.setTheme(16974372);
                        }
                    } else {
                        HadithMunazatActivity.this.setTheme(16974372);
                    }
                    HadithMunazatActivity.this.Fazilath = "\ufeff[ বিঃ দ্রঃ এ অতুলনীয় কাসীদাটির অনুবাদ নেয়া হয়েছে কবি \u200a\u200a\u200a\u200aমাওলানা \u200a\u200a\u200a\u200aমুহাম্মদ \u200a\u200a\u200a\u200aরূহুল \u200a\u200a\u200a\u200aআমীন\u200a \u200a\u200a\u200a\u200aখান \u200a\u200a\u200a\u200aকৃত\u200a কাব্যানুবাদ থেকে। কবিকে শ্রদ্ধাভরে স্মরণ করছি এবং দোয়া \u200aকরি \u200aআল্লাহ্ \u200aপাক\u200a \u200aতাঁকে \u200aযেন\u200a \u200aএর \u200aজন্য\u200a \u200aউত্তম প্রতিদান দান করেন। আমীন! ]\n\nওজিফা হিসাবে কাসীদা শরীফ পাঠের নিয়মঃ\n---------------------------\nকিবলামুখী হয়ে বসে\u200a কাসীদা\u200a পাঠের\u200a শুরুতে ও শেষে ১৭\u200a\u200a \u200a\u200aবার\u200a\u200a \u200a\u200aকরে\u200a\u200a \u200a\u200aনিম্নলিখিত \u200a\u200aদরূদ\u200a \u200a\u200aশরীফ \u200a\u200aপাঠ \u200a\u200aকরা উত্তম।\n\nاللهم صلي\u200a على سيدنا\u200a محمد النبي الأمي وعلى آله وصحبه و بارك و سلم\n\nঅর্থাৎ \u200a\u200aহে \u200a\u200aআল্লাহ, \u200a\u200aসাইয়্যেদেনা \u200a\u200aমুহম্মদ \u200a\u200a(ﷺ)\u200a\u200aতাঁর \u200aবংশধর\u200a ও সাহাবীগণের প্রতি\u200a শান্তি, করুণা ও\u200a বরকত নাযিল করুন।\n\nএরপর কাসীদা পাঠ শুরু করতে হবে।\n\nالحمد لله منشئ الخلق من عدم\nثم الصلاة على المختار في القـدمِ\nمولاي صلّ وسلّــم دائماً أبداً\nعلى حبيبك خيــــر الخلق كلهم\n\nবিশ্ব নিখিল নাস্তিক থেকে\nগড়লো যে তাঁর সব গুণ-গান,\nহাজার সালাম সত্তাকে সেই\nসৃষ্টিকুলের শ্রেষ্ঠ মহান।\n\nসৃষ্টিকুলের শ্রেষ্ঠতম\nতোমার প্রিয় সখার পরে\nসালাত সালাম পাঠাও গো রব\nযুগ থেকে যুগ যুগান্তরে।";
                    HadithMunazatActivity.this._setDialogFont(HadithMunazatActivity.this.fazilath, "ওজিফা হিসাবে কাসীদা শরীফ পাঠের নিয়ম", HadithMunazatActivity.this.Fazilath, "solaimanlipi.ttf");
                    HadithMunazatActivity.this.fazilath.setPositiveButton("Okey", new DialogInterface.OnClickListener() { // from class: com.yeasinrabbi.girl_name.HadithMunazatActivity.3.3
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    });
                    HadithMunazatActivity.this.fazilath.create().show();
                }
            }
        });

        this.listview_ebooks.setOnItemClickListener((adapterView, view, i, j) -> {
            HadithMunazatActivity.this.ii.putExtra(AppMeasurementSdk.ConditionalUserProperty.NAME, ((HashMap) HadithMunazatActivity.this.map_list.get(i)).get(AppMeasurementSdk.ConditionalUserProperty.NAME).toString());
            HadithMunazatActivity.this.ii.putExtra("drive_id", ((HashMap) HadithMunazatActivity.this.map_list.get(i)).get("content").toString());
            HadithMunazatActivity.this.ii.setClass(HadithMunazatActivity.this.getApplicationContext(), WebviewActivity.class);
            HadithMunazatActivity.this.startActivity(HadithMunazatActivity.this.ii);
        });
    }

    private void initializeLogic() {
        this.linear_for_arabic.setVisibility(View.GONE);
        getApplicationContext();

        ((ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE)).addPrimaryClipChangedListener(() -> {
        });
        _Extra();
        _ColorsOnly();
        this.imageview1.setClickable(true);
        this.imageview2.setClickable(true);
    }

   

    
    @Override  
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Override  
    public void onBackPressed() {

        finish();
    }

    @Override  
    public void onStart() {
        super.onStart();

    }

 
    public void _textSize(TextView textView, double d) {
        textView.setTextSize((int) d);
    }

 
    public void _setDialogFont(AlertDialog.Builder builder, String str, String str2, String str3) {
        if (!str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)) {
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new TypefaceSpan(this, str3), 0, spannableString.length(), 33);
            builder.setTitle(spannableString);
        }
        if (!str2.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)) {
            SpannableString spannableString2 = new SpannableString(str2);
            spannableString2.setSpan(new TypefaceSpan(this, str3), 0, spannableString2.length(), 33);
            builder.setMessage(spannableString2);
        }
    }

   
    public class TypefaceSpan extends MetricAffectingSpan {
        private Typeface mTypeface;
        private LruCache<String, Typeface> sTypefaceCache = new LruCache<>(12);

        public TypefaceSpan(Context context, String str) {
            this.mTypeface = this.sTypefaceCache.get(str);
            if (this.mTypeface == null) {
                this.mTypeface = Typeface.createFromAsset(context.getApplicationContext().getAssets(), String.format("fonts/%s", str));
                this.sTypefaceCache.put(str, this.mTypeface);
            }
        }

        @Override  
        public void updateMeasureState(TextPaint textPaint) {
            textPaint.setTypeface(this.mTypeface);
            textPaint.setFlags(textPaint.getFlags() | Paint.SUBPIXEL_TEXT_FLAG);
        }

        @Override  
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setTypeface(this.mTypeface);
            textPaint.setFlags(textPaint.getFlags() | Paint.SUBPIXEL_TEXT_FLAG);
        }
    }

 
    public void _CardStyle(final View view, double d, double d2, String str, boolean z) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor(str));
        gradientDrawable.setCornerRadius((int) d2);
        view.setBackground(gradientDrawable);
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation((int) d);
        }
        if (z) {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: com.yeasinrabbi.girl_name.HadithMunazatActivity.8
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (motionEvent.getAction()) {
                        case 0:
                            ObjectAnimator objectAnimator = new ObjectAnimator();
                            objectAnimator.setTarget(view);
                            objectAnimator.setPropertyName("scaleX");
                            objectAnimator.setFloatValues(0.9f);
                            objectAnimator.setDuration(100L);
                            objectAnimator.start();
                            ObjectAnimator objectAnimator2 = new ObjectAnimator();
                            objectAnimator2.setTarget(view);
                            objectAnimator2.setPropertyName("scaleY");
                            objectAnimator2.setFloatValues(0.9f);
                            objectAnimator2.setDuration(100L);
                            objectAnimator2.start();
                            break;
                        case 1:
                            ObjectAnimator objectAnimator3 = new ObjectAnimator();
                            objectAnimator3.setTarget(view);
                            objectAnimator3.setPropertyName("scaleX");
                            objectAnimator3.setFloatValues(1.0f);
                            objectAnimator3.setDuration(100L);
                            objectAnimator3.start();
                            ObjectAnimator objectAnimator4 = new ObjectAnimator();
                            objectAnimator4.setTarget(view);
                            objectAnimator4.setPropertyName("scaleY");
                            objectAnimator4.setFloatValues(1.0f);
                            objectAnimator4.setDuration(100L);
                            objectAnimator4.start();
                            break;
                    }
                    return false;
                }
            });
        }
    }

    private void _ThirtyThreeAyath() {
        this.map_var = new HashMap<>();
        this.map_var.put("title", "১. সূরা ফাতেহা, ৭ আয়াত");
        this.map_var.put("arabic", "بِسۡمِ اللهِ الرَّحۡمٰنِ الرَّحِيۡمِ\n اَلۡحَمۡدُ لِلّٰهِ رَبِّ الۡعٰلَمِيۡنَۙ\u200f ﴿۱﴾ الرَّحۡمٰنِ الرَّحِيۡمِۙ\u200f ﴿۲﴾ مٰلِكِ يَوۡمِ الدِّيۡنِؕ\u200f ﴿۳﴾ اِيَّاكَ نَعۡبُدُ وَاِيَّاكَ نَسۡتَعِيۡنُؕ\u200f ﴿۴﴾ اِهۡدِنَا الصِّرَاطَ الۡمُسۡتَقِيۡمَۙ\u200f ﴿۵﴾ صِرَاطَ الَّذِيۡنَ اَنۡعَمۡتَ عَلَيۡهِمۡ ۙ\u200f ﴿۶﴾ غَيۡرِ الۡمَغۡضُوۡبِ عَلَيۡهِمۡ وَلَا الضَّآلِّيۡنَ\ue022\u200f ﴿۷﴾");
        this.map_var.put("onubad", "(১) সকল প্রশংসা আল্লাহর জন্য, যিনি সমগ্র বিশ্বের প্রতিপালক, (২) সীমাহীন মেহেরবান, পরম দয়ালু, (৩) কর্মফল দিবসের মালিক। (৪) আমরা আপনারই এবাদত করি এবং আপনারই কাছে সাহায্য প্রার্থনা করি। (৫) আমাদের সরল পথ বাতলিয়ে দিন। (৬) তাদের পথ, যাদের প্রতি আপনি অনুগ্রহ করেছেন, (৭) যাদের উপর আপনার ক্রোধ পতিত হয়নি এবং যারা পথভ্রষ্টও হয়নি।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("title", "২. সূরা বাকারার শুরুর ৫ আয়াত");
        this.map_var.put("arabic", "بِسۡمِ اللهِ الرَّحۡمٰنِ الرَّحِيۡمِ\n الٓمّٓۚ\u200f ﴿۱﴾ ذٰ لِكَ الۡڪِتٰبُ لَا رَيۡبَۛۚۖ فِيۡهِۛۚ هُدًى لِّلۡمُتَّقِيۡنَۙ\u200f ﴿۲﴾ الَّذِيۡنَ يُؤۡمِنُوۡنَ بِالۡغَيۡبِ وَ يُقِيۡمُوۡنَ الصَّلٰوةَ وَمِمَّا رَزَقۡنٰهُمۡ يُنۡفِقُوۡنَۙ\u200f ﴿۳﴾ وَالَّذِيۡنَ يُؤۡمِنُوۡنَ بِمَۤا اُنۡزِلَ اِلَيۡكَ وَمَاۤ اُنۡزِلَ مِنۡ قَبۡلِكَۚ وَبِالۡاٰخِرَةِ هُمۡ يُوۡقِنُوۡنَؕ\u200f ﴿۴﴾ اُولٰٓٮِٕكَ عَلٰى هُدًى مِّنۡ رَّبِّهِمۡ\u200c\ue01c وَاُولٰٓٮِٕكَ هُمُ الۡمُفۡلِحُوۡنَ\u200f ﴿۵﴾");
        this.map_var.put("onubad", "(১) আলিফ লাম মীম। (২) এ সেই কিতাব যাতে কোনই সন্দেহ নেই। পথ প্রদর্শনকারী পরহেযগারদের জন্য, (৩) যারা অদেখা বিষয়ের উপর বিশ্বাস স্থাপন করে এবং নামায প্রতিষ্ঠা করে। আর আমি তাদেরকে যে রুযী দান করেছি তা থেকে ব্যয় করে (৪) এবং যারা বিশ্বাস স্থাপন করেছে সেসব বিষয়ের উপর যা কিছু তোমার প্রতি অবতীর্ণ হয়েছে এবং সেসব বিষয়ের উপর যা তোমার পূর্ববর্তীদের প্রতি অবতীর্ণ হয়েছে। আর আখেরাতকে যারা নিশ্চিত বলে বিশ্বাস করে। (৫) তারাই নিজেদের পালনকর্তার পক্ষ থেকে সুপথ প্রাপ্ত, আর তারাই যথার্থ সফলকাম।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("title", "৩. সূরা বাকারা আয়াত নং ২৫৫, ২৫৬ ও ২৫৭, অর্থাৎ আয়াতুল কুরসী ও তার পরবর্তী ২ আয়াত");
        this.map_var.put("arabic", "اللّٰهُ لَاۤ اِلٰهَ اِلَّا هُوَ الۡحَـىُّ الۡقَيُّوۡمُ\ue021ۚ \u2002لَا تَاۡخُذُهٗ سِنَةٌ وَّلَا نَوۡمٌ\u200cؕ لَهٗ مَا فِى السَّمٰوٰتِ وَمَا فِى الۡاَرۡضِ\u200cؕ مَنۡ ذَا الَّذِىۡ يَشۡفَعُ عِنۡدَهٗۤ اِلَّا بِاِذۡنِهٖ\u200cؕ يَعۡلَمُ مَا بَيۡنَ اَيۡدِيۡهِمۡ وَمَا خَلۡفَهُمۡ\u200cۚ وَلَا يُحِيۡطُوۡنَ بِشَىۡءٍ مِّنۡ عِلۡمِهٖۤ اِلَّا بِمَا شَآءَ ۚ وَسِعَ كُرۡسِيُّهُ السَّمٰوٰتِ وَالۡاَرۡضَ\u200c\u200cۚ وَلَا يَـــُٔوۡدُهٗ حِفۡظُهُمَا \u200cۚ وَ هُوَ الۡعَلِىُّ الۡعَظِيۡمُ\u200f ﴿۲۵۵﴾ لَاۤ اِكۡرَاهَ فِى الدِّيۡنِ\u200cۙ\u2002\ue01e قَد تَّبَيَّنَ الرُّشۡدُ مِنَ الۡغَىِّ\u200cۚ فَمَنۡ يَّكۡفُرۡ بِالطَّاغُوۡتِ وَيُؤۡمِنۡۢ بِاللّٰهِ فَقَدِ اسۡتَمۡسَكَ بِالۡعُرۡوَةِ الۡوُثۡقٰى\ue01c لَا انْفِصَامَ لَهَا\u200c\u200c ؕ وَاللّٰهُ سَمِيۡعٌ عَلِيۡمٌ\u200f ﴿۲۵۶﴾ اَللّٰهُ وَلِىُّ الَّذِيۡنَ اٰمَنُوۡا يُخۡرِجُهُمۡ مِّنَ الظُّلُمٰتِ اِلَى النُّوۡرِ\u200c\ue021ؕ \u2002وَالَّذِيۡنَ كَفَرُوۡۤا اَوۡلِيٰٓـــُٔهُمُ الطَّاغُوۡتُۙ يُخۡرِجُوۡنَهُمۡ مِّنَ النُّوۡرِ اِلَى الظُّلُمٰتِ\u200cؕ اُولٰٓٮِٕكَ اَصۡحٰبُ النَّارِ\u200c\u200cۚ هُمۡ فِيۡهَا خٰلِدُوۡنَ\ue022\u200f ﴿۲۵۷﴾");
        this.map_var.put("onubad", "(২৫৫) আল্লাহ ছাড়া অন্য কোন উপাস্য নেই, তিনি জীবিত, সবকিছুর ধারক। তাঁকে তন্দ্রাও স্পর্শ করতে পারে না এবং নিদ্রাও নয়। আসমান ও যমীনে যা কিছু রয়েছে, সবই তাঁর। কে আছ এমন, যে সুপারিশ করবে তাঁর কাছে তাঁর অনুমতি ছাড়া? দৃষ্টির সামনে কিংবা পিছনে যা কিছু রয়েছে সে সবই তিনি জানেন। তাঁর জ্ঞানসীমা থেকে তারা কোন কিছুকেই পরিবেষ্টিত করতে পারে না, কিন্তু যতটুকু তিনি ইচ্ছা করেন। তাঁর সিংহাসন সমস্ত আসমান ও যমীনকে পরিবেষ্টিত করে আছে। আর সেগুলোকে ধারণ করা তাঁর পক্ষে কঠিন নয়। তিনিই সর্বোচ্চ এবং সর্বাপেক্ষা মহান। (২৫৬) দ্বীনের ব্যাপারে কোন জবরদস্তি বা বাধ্য-বাধকতা নেই। নিঃসন্দেহে হেদায়াত গোমরাহী থেকে পৃথক হয়ে গেছে। এখন যারা গোমরাহকারী ‘তাগুত’দেরকে মানবে না এবং আল্লাহতে বিশ্বাস স্থাপন করবে, সে ধারণ করে নিয়েছে সুদৃঢ় হাতল যা ভাংবার নয়। আর আল্লাহ সবই শুনেন এবং জানেন। (২৫৭) যারা ঈমান এনেছে, আল্লাহ তাদের অভিভাবক। তাদেরকে তিনি বের করে আনেন অন্ধকার থেকে আলোর দিকে। আর যারা কুফরী করে তাদের অভিভাবক হচ্ছে তাগুত। তারা তাদেরকে আলো থেকে বের করে অন্ধকারের দিকে নিয়ে যায়। এরাই হলো দোযখের অধিবাসী, চিরকাল তারা সেখানেই থাকবে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("title", "৪. সূরা বাকারার শেষ ৩ আয়াত, আয়াত নং ২৮৪, ২৮৫ ও ২৮৬");
        this.map_var.put("arabic", "لِلّٰهِ مَا فِى السَّمٰوٰتِ وَمَا فِى الۡاَرۡضِ\u200cؕ وَاِنۡ تُبۡدُوۡا مَا فِىۡۤ اَنۡفُسِكُمۡ اَوۡ تُخۡفُوۡهُ يُحَاسِبۡكُمۡ بِهِ اللّٰهُ\u200cؕ فَيَـغۡفِرُ لِمَنۡ يَّشَآءُ وَيُعَذِّبُ مَنۡ يَّشَآءُ\u200c ؕ وَاللّٰهُ عَلٰى كُلِّ شَىۡءٍ قَدِيۡرٌ\u200f ﴿۲۸۴﴾ اٰمَنَ الرَّسُوۡلُ بِمَاۤ اُنۡزِلَ اِلَيۡهِ مِنۡ رَّبِّهٖ وَ الۡمُؤۡمِنُوۡنَ\u200cؕ كُلٌّ اٰمَنَ بِاللّٰهِ وَمَلٰٓٮِٕكَتِهٖ وَكُتُبِهٖ وَرُسُلِهٖ\ue01e لَا نُفَرِّقُ بَيۡنَ اَحَدٍ مِّنۡ رُّسُلِهٖ\u200c\ue01e وَقَالُوۡا سَمِعۡنَا وَاَطَعۡنَا\u200c غُفۡرَانَكَ رَبَّنَا وَاِلَيۡكَ الۡمَصِيۡرُ\u200f ﴿۲۸۵﴾ لَا يُكَلِّفُ اللّٰهُ نَفۡسًا اِلَّا وُسۡعَهَا\u2002\u200cؕ لَهَا مَا كَسَبَتۡ وَعَلَيۡهَا مَا اكۡتَسَبَتۡ\u200cؕ رَبَّنَا لَا تُؤَاخِذۡنَاۤ اِنۡ نَّسِيۡنَاۤ اَوۡ اَخۡطَاۡنَا\u2002\u200cۚ رَبَّنَا وَلَا تَحۡمِلۡ عَلَيۡنَاۤ اِصۡرًا كَمَا حَمَلۡتَهٗ عَلَى الَّذِيۡنَ مِنۡ قَبۡلِنَا\u2002\u200c\u200cۚرَبَّنَا وَلَا تُحَمِّلۡنَا مَا لَا طَاقَةَ لَنَا بِهٖ\u200c ۚ وَاعۡفُ عَنَّا\ue01f وَاغۡفِرۡ لَنَا\ue01f وَارۡحَمۡنَا\ue01f اَنۡتَ مَوۡلٰٮنَا فَانۡصُرۡنَا عَلَى الۡقَوۡمِ الۡكٰفِرِيۡنَ\ue022\u200f ﴿۲۸۶﴾");
        this.map_var.put("onubad", "(২৮৪) যা কিছু আকাশসমূহে রয়েছে এবং যা কিছু যমীনে আছে, সব আল্লাহরই। যদি তোমরা মনের কথা প্রকাশ কর কিংবা গোপন কর, আল্লাহ তোমাদের কাছ থেকে তার হিসাব নেবেন। অতঃপর যাকে ইচ্ছা তিনি ক্ষমা করবেন এবং যাকে ইচ্ছা তিনি শাস্তি দেবেন। আল্লাহ সর্ববিষয়ে শক্তিমান। (২৮৫) রসূল বিশ্বাস রাখেন ঐ সমস্ত বিষয় সম্পর্কে যা তাঁর পালনকর্তার পক্ষ থেকে তাঁর কাছে অবতীর্ণ হয়েছে এবং মুসলমানরাও সবাই বিশ্বাস রাখে আল্লাহর প্রতি, তাঁর ফেরেশতাদের প্রতি, তাঁর গ্রন্থসমুহের প্রতি এবং তাঁর পয়গম্বরগণের প্রতি। তারা বলে আমরা তাঁর পয়গম্বরদের মধ্যে কোন তারতম্য করিনা। তারা বলে, আমরা শুনেছি এবং কবুল করেছি। আমরা তোমার ক্ষমা চাই, হে আমাদের পালনকর্তা। তোমারই দিকে প্রত্যাবর্তন করতে হবে। (২৮৬) আল্লাহ কাউকে তার সাধ্যাতীত কোন কাজের ভার দেন না, সে তাই পায় যা সে উপার্জন করে এবং তাই তার উপর বর্তায় যা সে করে। হে আমাদের পালনকর্তা, যদি আমরা ভুলে যাই কিংবা ভুল করি, তবে আমাদেরকে অপরাধী করো না। হে আমাদের পালনকর্তা! এবং আমাদের উপর এমন দায়িত্ব অর্পণ করো না, যেমন আমাদের পূর্ববর্তীদের উপর অর্পণ করেছ, হে আমাদের প্রভূ! এবং আমাদের দ্বারা ঐ বোঝা বহন করিও না, যা বহন করার শক্তি আমাদের নাই। আমাদের পাপ মোচন কর। আমাদেরকে ক্ষমা কর এবং আমাদের প্রতি দয়া কর। তুমিই আমাদের প্রভু। সুতরাং কাফের সম্প্রদায়ের বিরুদ্ধে আমাদের কে সাহায্যে কর।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("title", "৫. সূরা আরাফ এর ৫৪, ৫৫ ও ৫৬ নং আয়াত");
        this.map_var.put("arabic", "اِنَّ رَبَّكُمُ اللّٰهُ الَّذِىۡ خَلَقَ السَّمٰوٰتِ وَ الۡاَرۡضَ فِىۡ سِتَّةِ اَيَّامٍ ثُمَّ اسۡتَوٰى عَلَى الۡعَرۡشِ\ue01e يُغۡشِى الَّيۡلَ النَّهَارَ يَطۡلُبُهٗ حَثِيۡثًا ۙ وَّالشَّمۡسَ وَالۡقَمَرَ وَالنُّجُوۡمَ مُسَخَّرٰتٍۢ بِاَمۡرِهٖ ؕ اَلَا لَـهُ الۡخَـلۡقُ وَالۡاَمۡرُ\u200c ؕ تَبٰرَكَ اللّٰهُ رَبُّ الۡعٰلَمِيۡنَ\u200f ﴿۵۴﴾ اُدۡعُوۡا رَبَّكُمۡ تَضَرُّعًا وَّخُفۡيَةً\u200c ؕ اِنَّهٗ لَا يُحِبُّ الۡمُعۡتَدِيۡنَ\u200c ۚ\u200f ﴿۵۵﴾ وَلَا تُفۡسِدُوۡا فِى الۡاَرۡضِ بَعۡدَ اِصۡلَاحِهَا وَادۡعُوۡهُ خَوۡفًا وَّطَمَعًا\u200c ؕ اِنَّ رَحۡمَتَ اللّٰهِ قَرِيۡبٌ مِّنَ الۡمُحۡسِنِيۡنَ\u200f ﴿۵۶﴾");
        this.map_var.put("onubad", "(৫৪) নিশ্চয় তোমাদের প্রতিপালক আল্লাহ। তিনি নভোমন্ডল ও ভূমন্ডলকে ছয় দিনে সৃষ্টি করেছেন। অতঃপর আরশের উপর অধিষ্টিত হয়েছেন। তিনি পরিয়ে দেন রাতের উপর দিনকে এমতাবস্থায় যে, দিন দৌড়ে রাতের পিছনে আসে। তিনি সৃষ্টি করেছেন সূর্য, চন্দ্র ও নক্ষত্র দৌড় স্বীয় আদেশের অনুগামী। শুনে রেখ, তাঁরই কাজ সৃষ্টি করা এবং আদেশ দান করা। আল্লাহ, বরকতময় যিনি বিশ্বজগতের প্রতিপালক। (৫৫) তোমরা স্বীয় প্রতিপালককে ডাক, কাকুতি-মিনতি করে এবং সংগোপনে। তিনি সীমা অতিক্রমকারীদেরকে পছন্দ করেন না। (৫৬) পৃথিবীকে কুসংস্কারমুক্ত ও ঠিক করার পর তাতে অনর্থ সৃষ্টি করো না। তাঁকে আহবান কর ভয় ও আশা সহকারে। নিশ্চয় আল্লাহর করুণা সৎকর্মশীলদের নিকটবর্তী।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("title", "৬. সূরা বনী ইসরাঈল এর শেষ ২ আয়াত, ১১০ ও ১১১ নং আয়াত");
        this.map_var.put("arabic", "قُلِ ادۡعُوا اللّٰهَ اَوِ ادۡعُوا الرَّحۡمٰنَ\u200c ؕ اَ يًّا مَّا تَدۡعُوۡا فَلَهُ الۡاَسۡمَآءُ الۡحُسۡنٰى \u200cۚ وَلَا تَجۡهَرۡ بِصَلَاتِكَ وَلَا تُخَافِتۡ بِهَا وَابۡتَغِ بَيۡنَ ذٰ لِكَ سَبِيۡلًا\u200f ﴿۱۱۰﴾ وَقُلِ الۡحَمۡدُ لِلّٰهِ الَّذِىۡ لَمۡ يَتَّخِذۡ وَلَدًا وَّلَمۡ يَكُنۡ لَّهٗ شَرِيۡكٌ فِى الۡمُلۡكِ وَلَمۡ يَكُنۡ لَّهٗ وَلِىٌّ مِّنَ الذُّلِّ\u200c وَكَبِّرۡهُ تَكۡبِيۡرًا\ue022\u200f ﴿۱۱۱﴾");
        this.map_var.put("onubad", "(১১০) বলুনঃ আল্লাহ বলে আহবান কর কিংবা রহমান বলে, যে নামেই আহবান কর না কেন, সব সুন্দর নাম তাঁরই। আপনি নিজের নামায আদায়কালে স্বর উচ্চগ্রাসে নিয়ে গিয়ে পড়বেন না এবং নিঃশব্দেও পড়বেন না। এতদুভয়ের মধ্যমপন্থা অবলম্বন করুন। (১১১) বলুনঃ সমস্ত প্রশংসা আল্লাহর যিনি না কোন সন্তান রাখেন, না তাঁর সার্বভৌমত্বে কোন শরীক আছে এবং যিনি দুর্দশাগ্রস্ত হন না, যে কারণে তাঁর কোন সাহয্যকারীর প্রয়োজন হতে পারে। সুতরাং আপনি স-সম্ভ্রমে তাঁর মাহাত্ন বর্ণনা করতে থাকুন।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("title", "৭. সূরা সাফফাত এর শুরু থেকে ১১ আয়াত");
        this.map_var.put("arabic", "بِسۡمِ اللهِ الرَّحۡمٰنِ الرَّحِيۡمِ\n وَالصّٰٓفّٰتِ صَفًّا ۙ\u200f ﴿۱﴾ فَالزّٰجِرٰتِ زَجۡرًا ۙ\u200f ﴿۲﴾ فَالتّٰلِيٰتِ ذِكۡرًا ۙ\u200f ﴿۳﴾ اِنَّ اِلٰهَكُمۡ لَوَاحِدٌ\u2002ؕ\u200f ﴿۴﴾ رَبُّ السَّمٰوٰتِ وَالۡاَرۡضِ وَمَا بَيۡنَهُمَا وَرَبُّ الۡمَشَارِقِ ؕ\u200f ﴿۵﴾ اِنَّا زَيَّنَّا السَّمَآءَ الدُّنۡيَا بِزِيۡنَةِ اۨلۡكَوَاكِبِۙ\u200f ﴿۶﴾ وَحِفۡظًا مِّنۡ كُلِّ شَيۡطٰنٍ مَّارِدٍ\u200cۚ\u200f ﴿۷﴾ لَّا يَسَّمَّعُوۡنَ اِلَى الۡمَلَاِ الۡاَعۡلٰى وَيُقۡذَفُوۡنَ مِنۡ كُلِّ جَانِبٍۖ \ue01c\u200f ﴿۸﴾ دُحُوۡرًا\ue021\u2002 وَّلَهُمۡ عَذَابٌ وَّاصِبٌ\u2002 ۙ\u200f ﴿۹﴾ اِلَّا مَنۡ خَطِفَ الۡخَطۡفَةَ فَاَتۡبَعَهٗ شِهَابٌ ثَاقِبٌ\u200f ﴿۱۰﴾ فَاسۡتَفۡتِهِمۡ اَهُمۡ اَشَدُّ خَلۡقًا اَمۡ مَّنۡ خَلَقۡنَاؕ اِنَّا خَلَقۡنٰهُمۡ مِّنۡ طِيۡنٍ لَّازِبٍ\u200f ﴿۱۱﴾");
        this.map_var.put("onubad", "(১) শপথ তাদের যারা সারিবদ্ধ হয়ে দাঁড়ানো, (২) অতঃপর ধমকিয়ে ভীতি প্রদর্শনকারীদের, (৩) অতঃপর মুখস্থ আবৃত্তিকারীদের- (৪) নিশ্চয় তোমাদের মাবুদ এক। (৫) তিনি আসমান সমূহ, যমীনও এতদুভয়ের মধ্যবর্তী সবকিছুর পালনকর্তা এবং পালনকর্তা উদয়াচলসমূহের। (৬) নিশ্চয় আমি নিকটবর্তী আকাশকে তারকারাজির দ্বারা সুশোভিত করেছি। (৭) এবং তাকে সংরক্ষিত করেছি প্রত্যেক অবাধ্য শয়তান থেকে। (৮) ওরা উর্ধ্ব জগতের কোন কিছু শ্রবণ করতে পারে না এবং চার দিক থেকে তাদের প্রতি উল্কা নিক্ষেপ করা হয়। (৯) ওদেরকে বিতাড়নের উদ্দেশে। ওদের জন্যে রয়েছে বিরামহীন শাস্তি। (১০) তবে কেউ ছোঁ মেরে কিছু শুনে ফেললে জ্বলন্ত উল্কাপিন্ড তার পশ্চাদ্ধাবন করে। (১১) আপনি তাদেরকে জিজ্ঞেস করুন, তাদেরকে সৃষ্টি করা কঠিনতর, না আমি অন্য যা সৃষ্টি করেছি? আমিই তাদেরকে সৃষ্টি করেছি এঁটেল মাটি থেকে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("title", "৮. সূরা আর-রহমান এর ৩৩ থেকে ৩৫ পর্যন্ত, মোট ৩ আয়াত");
        this.map_var.put("arabic", "يٰمَعۡشَرَ الۡجِنِّ وَالۡاِنۡسِ اِنِ اسۡتَطَعۡتُمۡ اَنۡ تَنۡفُذُوۡا مِنۡ اَقۡطَارِ السَّمٰوٰتِ وَالۡاَرۡضِ فَانْفُذُوۡا\u200cؕ لَا تَنۡفُذُوۡنَ اِلَّا بِسُلۡطٰنٍ\u200cۚ\u200f ﴿۳۳﴾ فَبِاَىِّ اٰلَاۤءِ رَبِّكُمَا تُكَذِّبٰنِ\u200f ﴿۳۴﴾ يُرۡسَلُ عَلَيۡكُمَا شُوَاظٌ مِّنۡ نَّارٍ\ue021\u2002ۙ وَّنُحَاسٌ فَلَا تَنۡتَصِرٰنِ\u200cۚ\u200f ﴿۳۵﴾");
        this.map_var.put("onubad", "(৩৩) হে জিন ও মানবকূল, নভোমন্ডল ও ভূমন্ডলের প্রান্ত অতিক্রম করা যদি তোমাদের সাধ্যে কুলায়, তবে অতিক্রম কর। কিন্তু ছাড়পত্র ব্যতীত তোমরা তা অতিক্রম করতে পারবে না। (৩৪) অতএব, তোমরা উভয়ে তোমাদের পালনকর্তার কোন কোন অবদানকে অস্বীকার করবে? (৩৫) ছাড়া হবে তোমাদের প্রতি অগ্নিস্ফুলিঙ্গ ও ধুম্রকুঞ্জ তখন তোমরা সেসব প্রতিহত করতে পারবে না।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("title", "৯. সূরা হাশর এর শেষ ৪ আয়াত। ২১, ২২, ২৩ ও ২৪ নং আয়াত");
        this.map_var.put("arabic", "لَوۡ اَنۡزَلۡنَا هٰذَا الۡقُرۡاٰنَ عَلٰى جَبَلٍ لَّرَاَيۡتَهٗ خَاشِعًا مُّتَصَدِّعًا مِّنۡ خَشۡيَةِ اللّٰهِ\u200cؕ وَتِلۡكَ الۡاَمۡثَالُ نَضۡرِبُهَا لِلنَّاسِ لَعَلَّهُمۡ يَتَفَكَّرُوۡنَ\u200f ﴿۲۱﴾ هُوَ اللّٰهُ الَّذِىۡ لَاۤ اِلٰهَ اِلَّا هُوَ\u200c ۚ عٰلِمُ الۡغَيۡبِ وَالشَّهَادَةِ\u200c ۚ هُوَ الرَّحۡمٰنُ الرَّحِيۡمُ\u200f ﴿۲۲﴾ هُوَ اللّٰهُ الَّذِىۡ لَاۤ اِلٰهَ اِلَّا هُوَ\u200cۚ اَلۡمَلِكُ الۡقُدُّوۡسُ السَّلٰمُ الۡمُؤۡمِنُ الۡمُهَيۡمِنُ الۡعَزِيۡزُ الۡجَـبَّارُ الۡمُتَكَبِّرُ\u200cؕ سُبۡحٰنَ اللّٰهِ عَمَّا يُشۡرِكُوۡنَ\u200f ﴿۲۳﴾ هُوَ اللّٰهُ الۡخَـالِـقُ الۡبَارِئُ الۡمُصَوِّرُ\u200c لَـهُ الۡاَسۡمَآءُ الۡحُسۡنٰى\u200cؕ يُسَبِّحُ لَهٗ مَا فِى السَّمٰوٰتِ وَالۡاَرۡضِ\u200cۚ وَهُوَ الۡعَزِيۡزُ الۡحَكِيۡمُ\ue022\u200f ﴿۲۴﴾");
        this.map_var.put("onubad", "(২১) যদি আমি এই কোরআন পাহাড়ের উপর অবতীর্ণ করতাম, তবে তুমি দেখতে যে, পাহাড় বিনীত হয়ে আল্লাহ তা’আলার ভয়ে বিদীর্ণ হয়ে গেছে। আমি এসব দৃষ্টান্ত মানুষের জন্যে বর্ণনা করি, যাতে তারা চিন্তা-ভাবনা করে। (২২) তিনিই আল্লাহ তা’আলা, তিনি ব্যতীত কোন উপাস্য নেই; তিনি দৃশ্য ও অদৃশ্যকে জানেন তিনি পরম দয়ালু, অসীম দাতা। (২৩) তিনিই আল্লাহ তিনি ব্যতিত কোন উপাস্য নেই। তিনিই একমাত্র মালিক, পবিত্র, শান্তি ও নিরাপত্তাদাতা, আশ্রয়দাতা, পরাক্রান্ত, প্রতাপান্বিত, মাহাত্ন?486;ীল। তারা যাকে অংশীদার করে আল্লাহ তা’ আলা তা থেকে পবিত্র। (২৪) তিনিই আল্লাহ তা’আলা, স্রষ্টা, উদ্ভাবক, রূপদাতা, উত্তম নাম সমূহ তাঁরই। নভোমন্ডলে ও ভূমন্ডলে যা কিছু আছে, সবই তাঁর পবিত্রতা ঘোষণা করে। তিনি পরাক্রান্ত প্রজ্ঞাময়।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("title", "১০. সূরা জ্বিন এর শুরুর ৪ আয়াত");
        this.map_var.put("arabic", "بِسۡمِ اللهِ الرَّحۡمٰنِ الرَّحِيۡمِ\n قُلۡ اُوۡحِىَ اِلَىَّ اَنَّهُ اسۡتَمَعَ نَفَرٌ مِّنَ الۡجِنِّ فَقَالُوۡۤا اِنَّا سَمِعۡنَا قُرۡاٰنًاعَجَبًا ۙ\u200f ﴿۱﴾ يَّهۡدِىۡۤ اِلَى الرُّشۡدِ فَاٰمَنَّا بِهٖ\u200c ؕ وَلَنۡ نُّشۡرِكَ بِرَبِّنَاۤ اَحَدًا ۙ\u200f ﴿۲﴾ وَّاَنَّهٗ تَعٰلٰى جَدُّ رَبِّنَا مَا اتَّخَذَ صَاحِبَةً وَّلَا وَلَدًا ۙ\u200f ﴿۳﴾ وَّ اَنَّهٗ كَانَ يَقُوۡلُ سَفِيۡهُنَا عَلَى اللّٰهِ شَطَطًا ۙ\u200f ﴿۴﴾");
        this.map_var.put("onubad", "(১) বলুনঃ আমার প্রতি ওহী নাযিল করা হয়েছে যে, জিনদের একটি দল কোরআন শ্রবণ করেছে, অতঃপর তারা বলেছেঃ আমরা বিস্ময়কর কোরআন শ্রবণ করেছি; (২) যা সৎপথ প্রদর্শন করে। ফলে আমরা তাতে বিশ্বাস স্থাপন করেছি। আমরা কখনও আমাদের পালনকর্তার সাথে কাউকে শরীক করব না। (৩) এবং আরও বিশ্বাস করি যে, আমাদের পালনকর্তার মহান মর্যাদা সবার উর্ধ্বে। তিনি কোন পত্নী গ্রহণ করেননি এবং তাঁর কোন সন্তান নেই। (৪) আমাদের মধ্যে নির্বোধেরা আল্লাহ তা’আলা সম্পর্কে বাড়াবাড়ির কথাবার্তা বলত।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("title", "১৫. সূরা কাফিরুন, মোট ৬ আয়াত");
        this.map_var.put("arabic", "بِسۡمِ اللهِ الرَّحۡمٰنِ الرَّحِيۡمِ\n قُلۡ يٰۤاَيُّهَا الۡكٰفِرُوۡنَۙ\u200f ﴿۱﴾ لَاۤ اَعۡبُدُ مَا تَعۡبُدُوۡنَۙ\u200f ﴿۲﴾ وَلَاۤ اَنۡـتُمۡ عٰبِدُوۡنَ مَاۤ اَعۡبُدُ\u200c ۚ\u200f ﴿۳﴾ وَلَاۤ اَنَا عَابِدٌ مَّا عَبَدۡتُّمۡۙ\u200f ﴿۴﴾ وَ لَاۤ اَنۡـتُمۡ عٰبِدُوۡنَ مَاۤ اَعۡبُدُ ؕ\u200f ﴿۵﴾ لَـكُمۡ دِيۡنُكُمۡ وَلِىَ دِيۡنِ\ue022\u200f ﴿۶﴾");
        this.map_var.put("onubad", "(১) বলুন, হে কাফেরকূল, (২) আমি এবাদত করিনা, তোমরা যার এবাদত কর। (৩) এবং তোমরাও এবাদতকারী নও, যার এবাদত আমি করি (৪) এবং আমি এবাদতকারী নই, যার এবাদত তোমরা কর। (৫) তোমরা এবাদতকারী নও, যার এবাদত আমি করি। (৬) তোমাদের কর্ম ও কর্মফল তোমাদের জন্যে এবং আমার কর্ম ও কর্মফল আমার জন্যে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("title", "১৬. সূরা ইখলাস, মোট ৪ আয়াত");
        this.map_var.put("arabic", "بِسۡمِ اللهِ الرَّحۡمٰنِ الرَّحِيۡمِ\n قُلۡ هُوَ اللّٰهُ اَحَدٌ\u200c ۚ\u200f ﴿۱﴾ اَللّٰهُ الصَّمَدُ\u200c ۚ\u200f ﴿۲﴾ لَمۡ يَلِدۡ\ue021 \u2002 ۙ وَلَمۡ يُوۡلَدۡ ۙ\u200f ﴿۳﴾ وَلَمۡ يَكُنۡ لَّهٗ كُفُوًا اَحَدٌ \ue022\u200f ﴿۴﴾");
        this.map_var.put("onubad", "(১) বলুন, তিনি আল্লাহ, এক, (২) আল্লাহ অমুখাপেক্ষী, (৩) তিনি কাউকে জন্ম দেননি এবং কেউ তাকে জন্ম দেয়নি (৪) এবং তার সমতুল্য কেউ নেই।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("title", "১৭. সূরা ফালাক্ব, মোট ৫ আয়াত");
        this.map_var.put("arabic", "بِسۡمِ اللهِ الرَّحۡمٰنِ الرَّحِيۡمِ\n قُلۡ اَعُوۡذُ بِرَبِّ الۡفَلَقِۙ\u200f ﴿۱﴾ مِنۡ شَرِّ مَا خَلَقَۙ\u200f ﴿۲﴾ وَمِنۡ شَرِّ غَاسِقٍ اِذَا وَقَبَۙ\u200f ﴿۳﴾ وَمِنۡ شَرِّ النَّفّٰثٰتِ فِى الۡعُقَدِۙ\u200f ﴿۴﴾ وَمِنۡ شَرِّ حَاسِدٍ اِذَا حَسَدَ\ue022\u200f ﴿۵﴾");
        this.map_var.put("onubad", "(১) বলুন, আমি আশ্রয় গ্রহণ করছি প্রভাতের পালনকর্তার, (২) তিনি যা সৃষ্টি করেছেন, তার অনিষ্ট থেকে, (৩) অন্ধকার রাত্রির অনিষ্ট থেকে, যখন তা সমাগত হয়, (৪) গ্রন্থিতে ফুঁৎকার দিয়ে জাদুকারিনীদের অনিষ্ট থেকে (৫) এবং হিংসুকের অনিষ্ট থেকে যখন সে হিংসা করে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("title", "১৮. সূরা নাস, মোট ৬ আয়াত");
        this.map_var.put("arabic", "بِسۡمِ اللهِ الرَّحۡمٰنِ الرَّحِيۡمِ\n قُلۡ اَعُوۡذُ بِرَبِّ النَّاسِۙ\u200f ﴿۱﴾ مَلِكِ النَّاسِۙ\u200f ﴿۲﴾ اِلٰهِ النَّاسِۙ\u200f ﴿۳﴾ مِنۡ شَرِّ الۡوَسۡوَاسِ\ue021 \u2002ۙ الۡخَـنَّاسِ\ue01b ۙ\u200f ﴿۴﴾ الَّذِىۡ يُوَسۡوِسُ فِىۡ صُدُوۡرِ النَّاسِۙ\u200f ﴿۵﴾ مِنَ الۡجِنَّةِ وَالنَّاسِ\ue022\u200f ﴿۶﴾");
        this.map_var.put("onubad", "(১) বলুন, আমি আশ্রয় গ্রহণ করিতেছি মানুষের পালনকর্তার, (২) মানুষের অধিপতির, (৩) মানুষের মা’বুদের (৪) তার অনিষ্ট থেকে, যে কুমন্ত্রণা দেয় ও আত্নগোপন করে, (৫) যে কুমন্ত্রণা দেয় মানুষের অন্তরে (৬) জ্বিনের মধ্য থেকে অথবা মানুষের মধ্য থেকে।");
        this.map_list.add(this.map_var);
    }

 
    @SuppressLint("ResourceType")
    public void _createSnackBar(String str) {
        Snackbar.make((ViewGroup) ((ViewGroup) findViewById(16908290)).getChildAt(0), str, 0).setAction("OK", new View.OnClickListener() { // from class: com.yeasinrabbi.girl_name.HadithMunazatActivity.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }).show();
    }

 
    public void _click(View view) {
        view.setClickable(true);
    }

    private void _Kasidaye_Gawsiya() {
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্রা");
        this.map_var.put("arabic", "السلام اے نور چشم انبیاء\nالسلام اے بادشاہ اولیاء");
        this.map_var.put("syllable", "আস্সালামায় নূরে চশমে আম্বিয়া\nআস্সালামায় বাদশাহে আউলিয়া");
        this.map_var.put("meaning", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "১");
        this.map_var.put("arabic", "١. سَقَانِي الْحُبُّ كَأسَاتِ الْوِصَالِ\nفَقُلْتُ لِخَمْرَتِىْ نَحْوِىْ تَعَالِ ");
        this.map_var.put("syllable", "১। সাক্বানিল হুব্বু কা’সাতিল বিসালী,\nফাক্বুলতু লিখামরাতি নাহ্ভী তা’আলী।\nআস্সালাম-");
        this.map_var.put("meaning", "অর্থ: খোদাপ্রেম আমাকে (আল্লাহর সাথে) মিলনের পাত্র পান করিয়েছে। (কারণ, ভালবাসার চূড়ান্ত ফল হচ্ছে মিলন।) অতঃপর আমি আমার পানীয় (সুধা বা আল্লাহর কল্যাণধারা)- কে (যা আমার জন্য নির্দ্ধারিত ছিলো) অথবা সাক্বীকে বল’লাম, ‘‘এদিকে এসো!’’ কারণ, মিলন-প্রাপ্ত হবার পর এমন আমার যোগ্যতা অর্জিত হয়েছে, যা এর পূর্বে আমার মধ্যে ছিলোনা।)");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "২");
        this.map_var.put("arabic", "٢. سَعتْ وَمَشَتْ لِنَحْوِىْ فِىْ كُئُوْسٍ\nفَهِمْتُ بِسُـــكْرَتِىْ بَيْنَ الْمَــوَالِ");
        this.map_var.put("syllable", "২। চা‘আত ওয়া মাশাত লি নাহ্ভী ফি কুঊসিন,\nফাহিমতু বি সুকরাতী বাইনাল মাওয়ালী।\nআস্সালাম-");
        this.map_var.put("meaning", "অর্থ: ওই পানীয় ( সুধা বা কল্যাণধারা) পান-পাত্রগুলোতে (ভর্তি হয়ে) আমার দিকে দৌঁড়ে এসেছে। অতঃপর আমি আমার বন্ধুদের (মজলিসের) মধ্যে ওই পানীয়ের নেশায় নেশাগ্রস্ত হয়ে গেছি। (অর্থাৎ যখন আমি আল্লাহর মিলন প্রাপ্ত হয়ে গেছি, তখন আমার হৃদয়রূপী পান-পাত্র আল্লাহর কল্যাণধারার পাত্রে পরিণত হয়ে গেছে। যেমন পানি নিচু যমীনের দিকে দ্রুত ধাবিত হয়, তেমনি ওই সুধা বা কল্যাণধারা আমার স্বভাবগত আকর্ষণে দৌঁড়ে এসেছে। অতঃপর আমিও তা পান করে বিভোর হয়ে গেছি। আর আমার নেশাগ্রস্ততা গোপন থাকেনি, বরং তা আমার বন্ধু-বান্ধবরাও দেখেছে।)");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৩");
        this.map_var.put("arabic", "٣.\tفَقُلْتُ لِسَـــاۤئِرِ الأَقْطَابِ لُمُّوْ\nبِحَالِىْ وَادْخُلُوْا اَنْتُمْ رِجَــالٖ");
        this.map_var.put("syllable", "৩। ফাক্বুলতু লিসায়িরিল আক্বত্বাবি লুম্মূ,\nবিহালী ওয়াদখুলূ আনতুম রিজ্বালী।\nআস্সালাম-");
        this.map_var.put("meaning", "অর্থ: অতঃপর আমি সমস্ত ‘ক্বুত্বব’কে (যারা আমার বন্ধু-বান্ধবই ছিলেন) বললাম, ‘‘আপনারাও প্রতিজ্ঞা করুন এবং আমার হাল (বিশেষ অবস্থা বা রং)-এ এসে যান; কেননা, আপনারাও আমার ভাই-বেরাদর। (অর্থাৎ ওই পানীয় পান করার পর যখন আমার অন্তর্চক্ষু খুলে গেলো, তখন আমি দেখতে পেলাম যে, অন্যান্য কুত্বব ও খোদা পরিচিতির এ নেশা সম্পর্কে অবগত নন। তখন আমি ওই সমস্ত ক্বুত্ববকে দাওয়াত দিলাম- আপনারা তরীক্বতের সফরসঙ্গীরা, আমার অনুসরণ করুন! যাতে আপনারাও আমার রঙ্গে রঞ্জিত হয়ে যান।)");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৪");
        this.map_var.put("arabic", "٤. وَهَــمُّوْا وَاشْرَبُوا اَنْتُمْ جُنُودِىْ\n \t فَسَــاقِى الْقَوْمِ بِالْوَافِـي الْمَلَالِ");
        this.map_var.put("syllable", "৪। ওয়া হাম্মূ ওয়াশরাবূ আনতুম জুনুদী,\nফাসাক্বীল কাওমি বিল ওয়াফিল মালালী।\nআস্সালাম-");
        this.map_var.put("meaning", "অর্থ: আর আমি ক্বুত্ববদেরকে বললাম, ‘ইচ্ছা করো!’’ (হাত বাড়ান!) এবং প্রেমসুধা পান করুন! আপনারা তো আমারই সেনাদল। আর সম্প্রদায়কুলের সাক্বী (রসূল-ই আকরাম সাল্লাল্লাহু তা‘আলা আলায়হি ওয়াসাল্লাম) আমার জন্য ওই পানীয়ের পাত্র পরিপূর্ণভাবে ভর্তি করে দিয়েছেন। (যা কখনো শেষ হবার নয়; কারণ, এটা হুযূর-ই আকরামের মু‘জিযা যে, অল্প পানি অনেককে তৃপ্ত করতো।)");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৫");
        this.map_var.put("arabic", "٥.\tشَــرِبْتُمْ فُضْلَتِي مِنْ   ۘبَعْدِ سُكْرِىْ\t\n\t\tوَ لَا نِلْتُمْ عُلُوِّىْ وَاتِّصَالٖ");
        this.map_var.put("syllable", "৫। শারিবতুম ফুদ্ব্লাতী মিম বা’দি সুকরী,\nওয়ালা নিল তুম উলুব্বী ওয়াত্তিসালী।\nআস্সালাম-");
        this.map_var.put("meaning", "অর্থ: যখন (ওই উপচে পড়া পানপাত্র পান করার পর) আমি নেশাগ্রস্ত হয়ে গেলাম, তখন আপনারা (হে কুত্ববগণ) আমার উচ্ছিষ্ট পান করেছেন। কিন্তু আপনারা আমার উচুঁ মর্যাদায় নৈকট্য ও (আল্লাহর সাথে মিলনের) বৈশিষ্ট্যে পৌঁছতে পারেন নি। (সুতরাং আপনাদের আরো উন্নতি করার চেষ্টা করতে হবে।)");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৬");
        this.map_var.put("arabic", "٦. مَــقَامُكُمُ الْعُلٰى جَمْعَاً وَّلَكِنْ\nمَــقَامِىْ فَوْقَــكُمْ مَا زَالَ عَــالٖ");
        this.map_var.put("syllable", "৬। মক্বামুকুমুল উলা জ্বামআওঁ ওয়ালাকিন,\nমক্বামী ফাউক্বাক্বুম মা যালা ‘আলী।\nআস্সালাম-");
        this.map_var.put("meaning", "অর্থ: যদিও আপনারা সবার (হে ক্বুত্ববগণ!) বিশেষ স্তর অনেক ঊর্ধ্বে, কিন্তু আমার মর্যাদার স্তর আপনাদের মর্যাদার স্তর অপেক্ষা অনেক ঊর্ধ্বে। আর এটা উঁচু হতেই থাকবে। (বস্তুত: ইরফান বা খোদা-পরিচিতির ময়দানের কোন সীমা নেই। এ জন্য কোন আরিফ এ ময়দান অতিক্রম করতে পারেনা। সর্বদা এ অন্তহীন ময়দানে মুরীদ আপন মুর্শিদের পেছনে পেছনে এগিয়ে যায়; কিন্তু মুর্শিদের মর্যাদা পর্যন্ত পৌছঁতে পারে না। কেননা, মুর্শিদও উন্নতি করতে থাকেন।)");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৭");
        this.map_var.put("arabic", "٧.\tأَنَا فِى حَضْرَةِ التَّقْرِيْبِ وَحْــدِىْ\t\n\t\tيُصَرِّفُنِىْ وَحَسْبِىْ ذُو الْجَلَالٖ");
        this.map_var.put("syllable", "৭। আনা ফি হাদ্বরাতিত তক্বরীবি ওয়াহ্দী,\nইয়ুসাররিফুনী ওয়া হাছ্বী যুল জ্বালালী।\nআস্সালাম-");
        this.map_var.put("meaning", "অর্থ: আমি ‘তাক্বরীব’-এর দরবারে (অর্থাৎ খোদার নৈকট্য অর্জনের প্রচেষ্টার ক্ষেত্রে) একাকী বা অনন্য। আল্লাহ্ তা‘আলা আমাকে (যেভাবে চান ‘মনযিল’ বা যাত্রাপথের সোপানগুলোতে একের পর এক করে) ফেরান (ভ্রমণ করান)। আর আমার জন্য মহামহিম আল্লাহ্ তা‘আলাই যথেষ্ট। (আমি অন্য কারো মুখাপেক্ষী নই) আর আমি যেহেতু সিপাহসালারের মতো প্রতিটি কদমে এগিয়ে থাকি, সেহেতু আমি আমার মর্যাদার স্তরে একাকীই থাকি। অভিযাত্রায় সিপাহী যেমন সিপাহ্সালারের পেছনে পেছনে থাকে, আর সিপাহ্সালার আগে আগে আপন মর্যাদায় একাকী থাকেন, তেমনি মুর্শিদও উন্নতির পথে এগিয়ে থাকেন এবং অগ্রণী থাকাবস্থায় তিনি আপন মর্যাদায় একাকী ও অনন্য হন।)");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৮");
        this.map_var.put("arabic", "٨. اَنَا الْبَازِيُّ اَشْهَبُ كُلَّ شَيْخٍ\nوَمَنْ ذَا فِي الرِّجَالِ أُعْطٰى مِثَالٖ");
        this.map_var.put("syllable", "৮। আনাল বাযিয়্যু আসহাবু কুল্লা শাইখিন,\nওয়া মানযা ফির রিজালী উ’তা মিসালী। \nআস্সালাম-");
        this.map_var.put("meaning", "অর্থ: আমি আল্লাহর প্রত্যেক ওলীর উপর এভাবে বিজয়ী থাকি, যেভাবে ‘সাদা বাযপাখী’ অন্যসব পাখীর উপর বিজয়ী থাকে। (আমাকে দেখাও!) পুরুষগণ (আরিফ বান্দাগণ)-এর মধ্যে কাকে আমার মতো মর্যাদা দেওয়া হয়েছে? (এতে নি’মাতের কৃতজ্ঞতা প্রকাশ করে অন্য ওলীগণকেও উন্নতি করার জন্য উৎসাহিত করা হয়েছে।)");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৯");
        this.map_var.put("arabic", "٩.\tكَسَـــــانِىْ خِلْعَةً بِطْرَازِ عَزْمٍ\n\t\tوَتَوَّجَنِــىْ بِتِيجَانِ الْكَـــمَالٖ");
        this.map_var.put("syllable", "৯। কাছানী খিল আতান বিতরাযি আয্মিন,\nওয়া তাওয়াজানী বিতীজানিল কামালী।\nআস্সালাম-");
        this.map_var.put("meaning", "অর্থ: আল্লাহ্ তা‘আলা আমাকে ওই বিশেষ পোশাক পরিধান করিয়েছেন, যার উপর দৃঢ় প্রতীজ্ঞার চিত্রাবলী অঙ্কিত (কারুকার্য খচিত) রয়েছে। আর আমার মাথায় কামালাত (গুণাবলী)-এর তাজ রেখেছেন। (অর্থাৎ আল্লাহ্ তা‘আলা আমাকে তাঁর মা’রিফাতের ওই পোশাক পরিয়েছেন, যার আঁচলে দৃঢ় প্রতিজ্ঞার নকশা খচিত রয়েছে, আমার ইচ্ছায় কখনো বিচ্যুতি আসে না। অনুরূপ, আমাকে বেলায়তের প্রতিটি ত্বরীক্বা (বা পথে)’র পূর্ণতার তাজ দান করা হয়েছে।)");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "১০");
        this.map_var.put("arabic", "١٠. وَأَطْلَعَنِــىْ عَلٰى سِرٍّ قَدِيْـــمٍ\nوَقَلَّدَنِــىْ وَأَعْطَانِىْ سُــؤَالٖ");
        this.map_var.put("syllable", "১০। ওয়া আত্ব্লাআনী আলা সিররিন ক্বাদী-মিন,\nওয়া ক্বাল্লাদানী ওয়া আ’ত্বানী সুআলী।\nআস্সালাম -");
        this.map_var.put("meaning", "অর্থ: আর আল্লাহ্ তা‘আলা আমাকে ‘সিররে\nক্বাদীম’ (অনাদি-অনন্তের রহস্য, অর্থাৎ ক্বোরআন কিংবা হায়াত, মওত, ইলমে গায়ব ও ইস্মে আ’যম-এর রহস্যাবলী) সম্পর্কে অবহিত করেছেন। আর আমার ঘাড়ে (সন্তুষ্টি ও আত্মসমর্পণ)-এর ‘গলাবন্দ’ পরিয়েছেন এবং আমি যা কিছু চেয়েছি সবই দিয়েছেন। (যেহেতু ওই ‘সিররে ক্বাদীম’ সম্পর্কে জ্ঞান লাভ করার জন্য রেযা, তাসলীম ও সবর (যথাক্রমে, সন্তুষ্টি, আত্মসমর্পণ ও ধৈর্য)-এর প্রয়োজন, সেহেতু আল্লাহ্ তা‘আলা আমাকে আগে ভাগে এগুলোর মালা আমার গলায় পরিয়েছেন। যেহেতু ‘র্সিরে ক্বাদীম’ প্রত্যেক বিষয়ের ধারক, সেহেতু হুযূর গাউসে আ’যম দস্তগীরের একথা বলা, ‘আমি আল্লাহর দরবারে যা চেয়েছি, তা আমি পেয়েছি’ তিনি ‘র্সিরে ক্বাদীম’ -এর জ্ঞানপ্রাপ্ত হবার উজ্জ্বল প্রমাণ।)");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "১১");
        this.map_var.put("arabic", "١١. وَوَلاَّنِــي عَلَى الْأَقْطَابِ جَمْعًا\nفَحُكْمِــــىْ نَافِذٌ فِىْ كُلِّ حَالٖ");
        this.map_var.put("syllable", "১১। ওয়া ওয়াল্লানী আলাল আক্বতাবি জ্বামআন,\nফা হুকমি নাফিযুন ফী কুল্লি হালী।\nআস্সালাম-");
        this.map_var.put("meaning", "অর্থ: আল্লাহ্ তা‘আলা আমাকে সমস্ত ক্বুত্ববের উপর হাকিম করেছেন। আর আমার হুকুম সব সময় জারী রয়েছে। (কেননা, আমাকে ‘র্সিরে ক্বাদীম’ (অনাদি রহস্য) সম্পর্কে অবহিত করা হয়েছে। যার অনিবার্য সুফল হচ্ছে - সমস্ত কুত্ববের উপর সরদার হওয়া এবং সব সময় তাঁর হুকুম জারী হওয়া।)");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "১২");
        this.map_var.put("arabic", "١٢.\tوَلَوْ أَلقَيْتُ سِرِّىْ فِي بِحَــــار ٍ\t\n\t\tلَصَــارَ الْكُلَّ غَوْرًا فِىْ زَوَالٖ");
        this.map_var.put("syllable", "১২। ওয়া লাও আলক্বায়তু সিররি ফী বিহারিন্,\nলাসা-রাল্ কুল্লু গাওরান ফী যাওয়ালী।\nআস্সালাম-");
        this.map_var.put("meaning", "অর্থ: যদি আমার ‘গোপন রহস্য’ (অথবা একাগ্র দৃষ্টি অথবা খোদা প্রদত্ত ক্ষমতা) সমুদ্রগুলোর উপর নিক্ষেপ করি, তাহলে সব সমুদ্র শুষ্ক হয়ে নিশ্চিহ্ন হয়ে যাবে। (তখন সেগুলোর নাম নিশানা পর্যন্ত থাকবে না।)");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "১৩");
        this.map_var.put("arabic", "١٣. وَلَوْ أَلْقَيْتُ سِرِّىْ فِي جِبَالٍ\nلَدُكَّتْ وَاخْتَفَتْ بَيْنَ الرِّمَالٖ");
        this.map_var.put("syllable", "১৩। ওয়া লাও আলক্বায়তু সিররী ফী জিবালীন্,\nলাদুক্কাত ওয়াখ তাফাত বাইনার রিমালী।\nআস্সালাম-");
        this.map_var.put("meaning", "অর্থ: যদি আমি আমার গোপন রহস্য পাহাড়গুলোর উপর রাখি, তবে সেগুলো পিষে বালুর মতো সুক্ষ্ম হয়ে যাবে, এমনকি দেখাও যাবে না।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "১৪");
        this.map_var.put("arabic", "١٤. وَلَوْ أَلْقَيْتُ سِرِّىْ فَوْقَ نَارٍ\nلَخَمَدَتْ وَانْطَفَتْ مِنْ سِرِّ حَالٖ");
        this.map_var.put("syllable", "১৪। ওয়া লাও আলক্বায়তু সিররী ফাউক্বা নারিন্,\nলাখামাদাত ওয়ান ত্বাফাত মিন সিররি হালী।\nআস্সালাম-");
        this.map_var.put("meaning", "অর্থ: যদি আমি আমার গোপন রহস্য আগুনের উপর ঢেলে দিই, তাবে আমার হালের রহস্যের প্রভাবে তা নিভে ছাই হয়ে যাবে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "১৫");
        this.map_var.put("arabic", "١٥. وَلَوْ أَلْقَيْتُ سِـرِّىْ فَوْقَ مَيْتٍ\nلَــقَامَ بِقُدْرَةِ الْمَوْلٰى تَعَــالٖ");
        this.map_var.put("syllable", "১৫। ওয়া লাও আলক্বায়তু সিররী ফাউক্বা মায়্তিন্,\nলাক্বামা বিক্বুদরাতিল মাওলা তা’আলী।\nআস্সালাম-");
        this.map_var.put("meaning", "অর্থ: যদি আমি আমার গোপন রহস্যকে মৃতের উপর রাখি, তাহলে সে (তাৎক্ষণিকভাবে) আল্লাহ্ তা‘আলার ক্বুদরতে (জীবিত হয়ে) দাঁড়িয়ে যাবে। (উল্লেখ্য, এসব ক’টির নমুনা তো পূর্ববর্তী নবীগণের সাথেও ঘটেছিলো। পবিত্র ক্বোরআনে এসবের বর্ণনা এসেছে। যেমন- কাফিরগণ হযরত ইব্রাহীম আলায়হিস্ সালামকে আগুনে নিক্ষেপ করেছিলো। তখন আল্লাহ্র নির্দেশে আগুন নিভে গিয়েছিলো। হযরত মুসা আলায়হিস্ সালাম-এর জন্য সমুদ্র শুষ্ক হয়ে রাস্তা হয়ে গিয়েছিলো। পর্বতমালা উপড়িয়ে উপরে তুলে ধরা হয়েছিলো। এদিকে ওই সব পাহাড়ের স্থানে তখন পাহাড়ের নাম-নিশানাও ছিলো না। আর হযরত ঈসা আলায়হিস্ সালাম আল্লাহ্র প্রদত্ত ক্ষমতা বলে মৃতকে জীবিত করেছিলেন। ভূগোল শাস্ত্র থেকেও প্রমাণিত হয় যে, ভূ-পৃষ্ঠের কয়েকটা সমুদ্র শুষ্ক হয়ে গিয়েছে, কতেক অগ্নিকুণ্ড নির্বাপিত হয়ে আছে, আর কতেক পাহাড় যমীনে ধ্বসে গুপ্ত হয়ে গেছে। মোটকথা, এসব ক’টি সম্ভব। আল্লাহর হুকুমেই এমন পরিবর্তন হয়। সুতরাং ‘আল্লাহর ক্ষমতাক্রমে বাক্যটা উপরিউক্ত প্রত্যেকটা পংক্তির শেষে উহ্য ও প্রযোজ্য। যেমনটি কোন কোন ব্যাখ্যা কারক লিখেছেন।)");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "১৬");
        this.map_var.put("arabic", "١٦. وَمَا مِنْهَا شُهُورٌ اَوْ دُهُوْرٌ\nتَــمُرُّ وَتَنْقَضِـىْ اِلَّا اَتَــالٖ");
        this.map_var.put("syllable", "১৬। ওয়ামা মিনহা শুহূরুন আও দুহূরুন,\nতামুররু ওয়াতানক্বাদ্বী ইল্লা আতালী। \nআস্সালাম-");
        this.map_var.put("meaning", "অর্থ: (হে কারামতকে অস্বীকারকারী)! ঝগড়া করো না, (বাস্তবাবস্থা হচ্ছে এ যে,) মাস ও দীর্ঘকাল থেকে যা যা অতিবাহিত হয়েছে ও হচ্ছে, তন্মধ্যে এমন কোন মাস বা যুগ নেই, যা আমার নিকট আসে না। (অবশ্যই আসে।)");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "১৭");
        this.map_var.put("arabic", "١٧.\tوَتُخْبِرُنِىْ بِمَا يأَتِىْ وَ يَجْــرِىْ\n\t\tوَتُعْــلِمُنِىْ فَأُقْصِرْ عَنْ جِدَالٖ");
        this.map_var.put("syllable", "১৭। ওয়া তুখবিরুনী বিমা ইয়া’তী ওয়া ইয়াজরী,\nওয়া তু’লিমুনী ফা আক্বসির আন জ্বিদালী।\nআস্সালাম-");
        this.map_var.put("meaning", "অর্থ: আর সেগুলো আমাকে অতীত ও ভবিষ্যতের ঘটনাবলী সম্পর্কে খবর দেয় ও অবহিত করে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "১৮");
        this.map_var.put("arabic", "١٨. مُريْــدِيْهِمْ وَطِبْ وَاشْطَحْ وَغَنٍّ\nوَاِفْعَلْ مَاتَشَاءُ فَالْاِسْمُ عَــــالٖ");
        this.map_var.put("syllable", "১৮। মুরীদী হিম ওয়াত্বিব ওয়াশতাহ ওয়া গান্নিন,\nওয়া ইফআল মা তাশা-উ, ফাল ইসমু আলী।\nআস্সালাম-");
        this.map_var.put("meaning", "অর্থ: হে আমার মুরীদ! আল্লাহর প্রেমে বিভোর হয়ে যাও, খুশী হও আর নির্ভয়ে গাও এবং তোমার মন যা চায় করো। কেননা, আমার নাম মহান। অর্থাৎ হায়মান, ত্বীব, শাত্বহ ও গেনা, যথাক্রমে প্রেমে বিভোর হওয়া, খুশী হওয়া, নির্ভয় হওয়া ও গাওয়া) মা’রিফাতের কতগুলো সোপান। সুতরাং হে আমার মুরীদরা! তোমরাও এগুলো অতিক্রম করো। তা করতে পারলে তোমাদের ইচ্ছা খোদার ইচ্ছা হয়ে যাবে। তখন আর উন্নতির যাত্রাপথে কখনো পদস্খলন ঘটবে না, বরং উন্নীতই হতে থাকবে।)");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "১৯");
        this.map_var.put("arabic", "١٩. مُرِيْـــدِىْ لَاتَخَفْ اللهُ رَبِّــــىْ\nعَطَانِي رِفْعَــةً نِــلْتُ الْمَناَلٖ");
        this.map_var.put("syllable", "১৯। মুরীদী লা তাখাফ্ আল্লাহু রব্বী,\nআত্বানী রিফআতান নিলতুম মানালী।\nআস্সালাম-");
        this.map_var.put("meaning", "অর্থ: হে আমার মুরীদ! তুমি কাউকে ভয় করো না। আল্লাহ্-ই আমার মালিক, যিনি আমাকে ওই উচুঁ মর্যাদা দিয়েছেন, যার মাধ্যমে উচুঁতর মর্যাদাগুলোতে (আমার আরজুগুলো) পর্যন্ত পৌঁছে গিয়েছি।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "২০");
        this.map_var.put("arabic", "٢٠. طُبُوْلِىْ فِىْ السَّمَاءِ والْأَرْضِ دُقَّتْ\nوَشَـــاؤٗسُ السَّعَادَةِ قَدْ بَـــدَالٖ");
        this.map_var.put("syllable", "২০। তুবূলী ফিস সামা-ই ওয়াল আরদ্বি দুক্বক্বাত,\nওয়া শা-ঊচুচ সা‘আদাত ক্বদ বাদালী।\nআস্সালাম-");
        this.map_var.put("meaning", "অর্থ: আসমান ও যমীনে আমার নামের ডঙ্কা বাজানো হচ্ছে। আর সৌভাগ্যের প্রধান দলপতি (ঘোষণাকারী) আমার জন্য আত্মপ্রকাশ করেছেন।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "২১");
        this.map_var.put("arabic", "٢١. بِــــلاَدُ اللهِ مُلْكِىْ تَحْتَ حُكْمِىْ\nوَ وَقْتِىْ قَبْلَ قَبْلِــىْ قَدْ صَفَالٖ");
        this.map_var.put("syllable", "২১। বিলাদুল্লাহি মুলকী তাহ্তা হুকমী,\nওয়া ওয়াক্বতী ক্ববলা ক্ববলী ক্বদ ছফালী।\nআস্সালাম-");
        this.map_var.put("meaning", "অর্থ: আল্লাহর সমস্ত শহর হচ্ছে আমার রাজ্য, সেগুলো আমার হুকুমের তাঁবেদার। আর আমার ‘সময়’ (হৃদয় উন্মুক্ত করণের মানযিল বা সোপান) আমি সৃষ্টি হবার পূর্বেই পরিচ্ছন্ন ছিলো। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "২২");
        this.map_var.put("arabic", "٢٢. نَظَرْتُ اِلٰى بِــلَادِ اللهِ جَمْعًا\nكَـــخَرْدَلَةٍ عَلٰى حُكْمِ  اتِّصَالٖ");
        this.map_var.put("syllable", "২২। নাযরতু ইলা বিলাদিল্লাহি জ্বাম্‘আন্,\nকা খারদালাতির ‘আলা হুকমিত তিসালী।\nআস্সালাম-");
        this.map_var.put("meaning", "অর্থ: আমি আল্লাহর সমস্ত শহরের প্রতি তাকিয়েছি। তখন (দেখলাম) সবগুলো মিলে ষরিষার দানার সমান ছিলো। (কারণ, আল্লাহ্ তা‘আলা আমার দৃষ্টি শক্তিকে এতো প্রশস্ত ও তীক্ষ্ম করেছেন যে, দুনিয়ার সমস্ত শহরকে একত্রিত করে একসাথে দেখলেও ষরিষার দানার মতো দেখায়।)");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "২৩");
        this.map_var.put("arabic", "٢٣. وَكُلُّ وَلِىٍّ عَلٰى قَــــــــدَمٍ وَّاِنِّىْ\n\t\tعَلٰــــــــى قَدَمِ النَّبِىْ بَدْرِ الْكَمَالٖ");
        this.map_var.put("syllable", "২৩। ওয়া কুল্লু ওলিয়্যিন আলা কদমিউঁ ওয়া ইন্নী,\nআলা ক্বদামিন নাবী বাদরিল কামালী। \nআস্সালাম-");
        this.map_var.put("meaning", "অর্থ: প্রত্যেক ওলী আমার পদাঙ্কের অনুসারী। আর আমি আল্লাহর নবী সাল্লাল্লাহু তা‘আলা আলায়হি ওয়াসাল্লাম-এর পদাঙ্ক শরীফের অনুসারী, যিনি (রিসালতাকাশের) পূর্ণাঙ্গ চাঁদ। (কেননা কেউ হুযূর-ই আকরাম মুহাম্মদুর রসূলুল্লাহ্ সাল্লাল্লাহু তা‘আলা আলায়হি ওয়াসাল্লাম-এর শরীয়ত ব্যতীত হিদায়তই পেতে পারে না। তাই আমি শরীয়তের পূর্ণ পাবন্দ। আর আমার মুরীদগণ্ হলো আমার অনুসারী। সুন্নাতে রসূলের অনুসরণের কারণে ধন্য আমার এ ‘কদম’কে তাই। এমন মহা মর্যাদা দান করা হয়েছে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "২৪");
        this.map_var.put("arabic", "٢٤. مُرِيْدِىْ لَا تَخَفْ وَاشٍ فَاِنِّىْ\nعَــزُوْمٌ قَاتِــلٌ عِنْدَ الْقِــتَالٖ");
        this.map_var.put("syllable", "২৪। মুরীদী লা তাখাফ ওয়াশিন ফা ইন্নী,\nআযূমুন ক্বাতিলুন ‘ইনদাল ক্বিতালী।\nআস্সালাম-");
        this.map_var.put("meaning", "অর্থ: হে আমার মুরীদ! তুমি কোন চোগলখোরকে ভয় করো না! কেননা, আমি যুদ্ধ ক্ষেত্রে স্থিরপদ অটল, (শত্র“দের) হত্যাকারী। (বস্তুতঃ চোগলখোরেরা অপবাদ ছড়িয়ে বিরোধিতা করলেও যুদ্ধ ক্ষেত্রে আল্লাহর দলই জয় যুক্ত হন।)");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "২৫");
        this.map_var.put("arabic", "٢٥. دَرَسْتُ الْعِلْمَ حَتّٰى صِرْتُ قُطْبًا\nوَنِلْتُ السَّــعْدَ مِنْ مَوْلَى الْمَوَالٖ");
        this.map_var.put("syllable", "২৫। দারাসতুল ইলমা হাত্তা সিরতু ক্বুত্বুবান্,\nওয়া নিলতুছ সা’দা মিম মাওলাল মাওয়ালী।\nআস্সালাম-");
        this.map_var.put("meaning", "➤ অর্থ: আমি (যাহেরী ও বাতেনী) ইলম পড়তে পড়তে ‘ক্বুত্বব’ হয়ে গেছি। আর আমি রাজাধিরাজ (আল্লাহ্ তা‘আলা)’র সাহায্য ক্রমে সৌভাগ্য (-এর সোপান) পর্যন্ত পৌঁছে গেছি। (কারণ, ইশ্ক্ব ও মুহাব্বত যেমন ‘মিলন’ পাবার মাধ্যম, তেমনি ইল্ম হচ্ছে কুত্বব ও সৌভাগ্যের মর্যাদা লাভ করার উপায়। কবির ভাষায় ‘‘কেহ্ বে ইল্ম নাতাওয়াঁ খোদারা শেনাখ্ত।’’ (অর্থাৎ ইল্ম ব্যতীত আল্লাহকে চেনা সম্ভব নয়। উল্লেখ্য ‘ক্বুত্বব’ সা’আদত ও মা’রিফাতের অতি উঁচু মান্যিল বা সোপান। ‘‘এটা আল্লাহর অনুগ্রহ, তিনি যাকে চান দান করেন।’’)");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "২৬");
        this.map_var.put("arabic", "٢٦. فَمَنْ فِىْ اَوْلِيَاءَ اللهِ مِثْــــــلِىْ\n\t\tوَمَنْ فِىْ الْعِلْمِ وَالتَّصْرِيفِ حَالٖ");
        this.map_var.put("syllable", "২৬। ফামান ফী আউলিয়া ইল্লাহি মিসলী,\nওয়ামান ফিল ইলমি ওয়াত তাসরিফি হালি।\nআস্সালাম-");
        this.map_var.put("meaning", "অর্থ: সুতরাং আল্লাহর ওলীগণের মধ্যে আমার মতো কে আছে? আর ইল্মও ‘হাল’-এর পরিবর্তন আনয়নে (আমার মতো) কে আছে? (অর্থাৎ এমনই আর কেউ নেই। ওলীগণের মধ্যে আমি হলাম অনন্য।)");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "২৭");
        this.map_var.put("arabic", "٢٧. كَـــذَا اِبْنُ الرِّفَاعِىْ كَانَ مِنِّــــىْ\nفَيَسْلُكُ فِىْ طَرِيْقِىْ وَاشْــتِغَالٖ");
        this.map_var.put("syllable", "২৭। কাযা ইবনুর রিফা‘ঈ কা-না মিন্নী,\nফা ইয়াসলুকু ফী ত্বরীক্বী ওয়াশ তিগালী।\nআস্সালাম-");
        this.map_var.put("meaning", "অর্থ: যেমন ইবনে রিফা‘ঈ আমার অনুসারী ছিলেন, সুতরাং তিনি আমারই পথের পথিক ও আমার মতো কর্ম সম্পন্নকারী।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "২৮");
        this.map_var.put("arabic", "٢٨. رِجَالٌ فِىْ هَوَاجِرْهِـــمْ صِيَامٌ\nوَفِىْ ظُلَــــــــمِ اللَّيَالِىْ كَاللَّاٰلٖ");
        this.map_var.put("syllable", "২৮। রিজ্বালুন ফী হাওয়াজিরি হিম সিয়ামুন্,\nওয়া ফী যুলামিল লায়ালী কাল লা আলী। \nআস্সালাম-");
        this.map_var.put("meaning", "অর্থ: আমার ভাই-বন্ধুরা (মুরীদান) গ্রীষ্মকালেও রোযা পালনকারী। আর অন্ধকার রাতগুলোতেও (ইবাদতের আলো দ্বারা মনি-মুক্তার মতো চমকিত।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "২৯");
        this.map_var.put("arabic", "٢٩. نَبِيٌّ هَـــاشِمِىْ مَكِّىْ حِجَـازِىْ\n\t\tهُوَ جَدِّىْ بِهٖ نِلْتُ الْمَـــــوَالٖ");
        this.map_var.put("syllable", "২৯। নাবিয়্যুন হাশিমী মাক্কী হিজাযী \nহুয়া জাদ্দী বিহী নিলতুল মাওয়ালী। \nআস্সালাম-");
        this.map_var.put("meaning", "অর্থ: যিনি মহান নবী, হাশেমী বংশীয় ও মক্কায় জন্মগ্রহণকারী, হেজায ভূমিতে শুভাগমনকারী, তিনি আমার পিতামহ। তারঁই মাধ্যমে আমি আমার কাক্সিক্ষত সব কিছু পেয়েছি।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৩০");
        this.map_var.put("arabic", "٣٠. اَنَا الْحَسَنِىْ وَالْمخْدَعْ مَقَامِىْ\nوَأَقْدَامِىْ عَلى عُنُقِ الرِّجَالٖ");
        this.map_var.put("syllable", "৩০। আনাল হাসানী ওয়াল মাখ্দা’ মাক্বামী,\nওয়া-আক্বদা-মী ‘আলা উনুক্বির রিজ্বালী। \nআস্সালাম-");
        this.map_var.put("meaning", "অর্থ: আমি ইমাম হাসান রাদ্বিয়াল্লাহু তা‘আলা আনহুর বংশের আর ‘মুখদা’ (মা’রিফাতের এক অতি উচ্চ মর্যাদা) আমার স্তর। আমার কদম সমস্ত পুরুষের (সম্মানিত ওলীগণ) - এর ঘাড়ের উপর।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৩১");
        this.map_var.put("arabic", "٣١. وَعَبْدُ الْقَادِرِ الْمَشْهُوْرُ اِسْمِىْ\nوَجَدِّىْ صَاحِبُ الْعَيْنِ الْكَمَالٖ");
        this.map_var.put("syllable", "৩১। ওয়া আবদুল কাদিরিল মাশহুর ইসমী,\nওয়া জ্বাদ্দী সাহিবুল আইনিল কামালী।\nআস্সালাম-");
        this.map_var.put("meaning", "অর্থ: আমার প্রসিদ্ধ নাম ‘আবদুল কাদির’। আমার নানা হলেন পূর্ণতার উৎসের মালিক। সাল্লাল্লাহু তা‘আলা আলায়হি ওয়াসাল্লাম।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৩২");
        this.map_var.put("arabic", "٣٢. اَنَا الْجِيْلِىْ مُحِىُ الدِّيْنُ اِسْمِىْ\nوَأَعْلَامِىْ عَلٰى رَأْسِ الْجِبَالٖ");
        this.map_var.put("syllable", "৩২। আনাল জীলী মুহিউদ্দীনু ইসমী,\nওয়া আ’লামী আলা রা’সিল জ্বিবালী। \nআস্সালামাম,");
        this.map_var.put("meaning", "অর্থ: আমি গীলানের বাসিন্দা, ‘মুহিউদ্দীন’ (দ্বীনকে পুনর্জীবিতকারী) আমার উপাধি। আর আমার উচুঁ মর্যাদার নিশান পর্বতমালার চূড়ার উপর (সমুজ্জ্বল)।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৩৩");
        this.map_var.put("arabic", "٣٣. تَقَبَّلْنِىْ وَلَا تَرْدُدْ سُؤَالِىْ\nأَغِثْنِىْ سَيِّدِىْ أُنْظُرْ بِحَالٖ");
        this.map_var.put("syllable", "৩৩। তাক্বাববালানি ওয়ালা তারদুদ সু‘আলী,\nআগিসনি সায়্যাদী উনযুর বিহা-লী। \nআস্সালাম-");
        this.map_var.put("meaning", "অর্থ: (হে আল্লাহ!) আমাকে কবূল করো, আমার প্রার্থনা রদ্দ্ করো না। আমার আহ্বানে আমাকে সাহায্য করো, হে আমার মালিক, আমার অবস্থার প্রতি কৃপাদৃষ্টি দাও।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৩৪");
        this.map_var.put("arabic", "٣٤. فَحَــلِّلْ يَــا اِلٰهِىْ كُلَّ صَـــعْبٍ\nبِحَقِّ الْمُصْطَفٰــى بَدْرِ الْكَمَالٖ");
        this.map_var.put("syllable", "৩৪। ফাহাল্লিল ইয়া ইলাহী কুল্লা স’বিন,\nবিহাক্বিল মুস্তফা (দ.) বাদরিল কামালী।\nআস্সালাম-");
        this.map_var.put("meaning", "অর্থ: সুতরাং হে আল্লাহ্! প্রতিটি জটিল-কঠিন ব্যাপারকে আমার জন্য সহজ করে দাও, হুযূর মোস্তফা সাল্লাল্লাহু তা‘আলা আলায়হি ওয়াসাল্লাম-এর ওসীলায়, যিনি পূর্ণতার পরিপূর্ণ চাঁদ।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "শে");
        this.map_var.put("arabic", "السلام اے نور چشم انبیاء\nالسلام اے بادشاہ اولیاء");
        this.map_var.put("syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        this.map_var.put("meaning", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        this.map_list.add(this.map_var);
    }

    private void _Qasidatul_Burdah() {
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্রথম অধ্যায়ঃ ইশকে রাসূল ﷺ");
        this.map_var.put("arabic", "\ufeffبسم الله الرحمن الرحيم\n\nأمِنْ تَــذَكِّرِ جيرانٍ بــذي سَــلَم\nإقرأ المزيد على موضوع.كوم");
        this.map_var.put("meaning", "১। ‘সলিম' বনে পড়শিগণের\nবিয়োগব্যথা স্মরণ করে\nনয়ন যুগল হতে কি ওই\nরক্তমাখা অশ্রু ঝরে?");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্রথম অধ্যায়ঃ ইশকে রাসূল ﷺ");
        this.map_var.put("arabic", "أَم هَبَّتِ الريحُ مِن تلقــاءِ كــاظِمَةٍ\nوأومَضَ البرقُ في الظَّلمـاءِ مِن إضَمِ");
        this.map_var.put("meaning", "২। দূর কাজেমা’র প্রান্ত হতে\nমাতাল হাওয়া বইছে ফিরে\nকিংবা “এজাম” গিরির কোলে\nবিজলি হাসে আঁধার চিরে?");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্রথম অধ্যায়ঃ ইশকে রাসূল ﷺ");
        this.map_var.put("arabic", "فما لِعَينـيك إن قُلتَ اكْفُفَـا هَمَـتَا\nوما لقلبِكَ إن قلتَ اسـتَفِقْ يَهِــمِ");
        this.map_var.put("meaning", "৩। বারণ করি যতোই আমি\nততোই আঁসু ঝরায় আঁখি\nততোই হিয়া হয় পেরেশান\nযতোই নিষেধ করতে থাকি।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্রথম অধ্যায়ঃ ইশকে রাসূল ﷺ");
        this.map_var.put("arabic", "أيحَسـب الصَبُّ أنَّ الحبَّ مُنكَتِــمٌ\nما بينَ منسَــجِمٍ منه ومُضْـطَـرِمِ");
        this.map_var.put("meaning", "৪। বাঁধনহারা আঁসুর ধারা\nপ্রণয় ব্যাকুল তাপিত মন\nপ্রেমের সুধা সুপ্ত এতেই\nবুঝে কি তা প্রেমিক সুজন?");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্রথম অধ্যায়ঃ ইশকে রাসূল ﷺ");
        this.map_var.put("arabic", "لولا الهوى لم تُرِقْ دمعاً على طَلِلِ\nولا أَرِقْتَ لِــذِكْرِ البـانِ والعَلَـمِ");
        this.map_var.put("meaning", "৫। নাইবা হলে আশেক তবে\nকেন বিজন টিলার পরে\n‘আলমগিরী’ ‘বান’ বিটপী\nস্মরে এমন অশ্রু ঝরে?");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্রথম অধ্যায়ঃ ইশকে রাসূল ﷺ");
        this.map_var.put("arabic", "فكيفَ تُنْكِـرُ حبا بعدمـا شَــهِدَت\nبه عليـك عُدولُ الدمـعِ والسَّـقَمِ");
        this.map_var.put("meaning", "৬। মিছেই কেবল করছে গোপন\nপ্রেম অস্বীকার করছে মিছে\nসজল আঁখি, কঠিন পীড়া\nদাঁড়ানো দুই স্বাক্ষী পিছে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্রথম অধ্যায়ঃ ইশকে রাসূল ﷺ");
        this.map_var.put("arabic", "وأثبَتَ الـوَجْدُ خَـطَّي عَبْرَةٍ وضَـنَى\nمثلَ البَهَـارِ على خَدَّيـك والعَنَـمِ");
        this.map_var.put("meaning", "৭। পীড়ার ক্ষত, অশ্রুধারা\nদুই আলামত সর্বনেশে\nহলদে কুসুম, রক্তজবা\nরয়েছে দুই গণ্ডদেশে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্রথম অধ্যায়ঃ ইশকে রাসূল ﷺ");
        this.map_var.put("arabic", "نَعَم سـرى طيفُ مَن أهـوى فـأَرَّقَنِي\nوالحُبُّ يعتَـرِضُ اللـذاتِ بالأَلَـمِ");
        this.map_var.put("meaning", "৮। পেলাম সখার মধুর পরশ\nনিদ্রা কোলে বিভোর যখন\nমনের আগুন বাড়লো দ্বিগুণ\nভাঙতেই সে মধুর স্বপন।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্রথম অধ্যায়ঃ ইশকে রাসূল ﷺ");
        this.map_var.put("arabic", "يا لائِمي في الهوى العُذْرِيِّ مَعـذرَةً\nمِنِّي إليـك ولَو أنْصَفْـتَ لَم تَلُـمِ");
        this.map_var.put("meaning", "৯। ‘উজাড়া’ সম গভীরতর\nজানলে আমার প্রণয় মীড়ে\nকরতে না আর বে-ইনসাফি\nবিঁধতে না আর নিন্দা তীরে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্রথম অধ্যায়ঃ ইশকে রাসূল ﷺ");
        this.map_var.put("arabic", "عَدَتْـــكَ حالي لا سِـرِّي بمُسْـتَتِرٍ\nعن الوُشـاةِ ولا دائي بمُنحَسِــمِ");
        this.map_var.put("meaning", "১০। প্রেমিক হলেই স্বাদ পেতে মোর\nএই নিদারুণ মর্ম জ্বালার\nবুঝতে তখন নেই উপশম\nতীব্রতর এই বেদনার।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্রথম অধ্যায়ঃ ইশকে রাসূল ﷺ");
        this.map_var.put("arabic", "مَحَّضْتَنِي النُّصْحَ لكِنْ لَستُ أسمَعُهُ\nإنَّ المُحِبَّ عَنِ العُــذَّالِ في صَمَـمِ");
        this.map_var.put("meaning", "১১। ভালোবাসা ভুলতে আমায়\nযতোই খুশী বলতে পারো\nমিছে সবই, আশেক বধির\nলয়না কানে মন্ত্র কারো।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্রথম অধ্যায়ঃ ইশকে রাসূল ﷺ");
        this.map_var.put("arabic", "إنِّي إتَّهَمْتُ نصيحَ الشَّـيْبِ فِي عَذَلِي\nوالشَّـيْبُ أبعَـدُ في نُصْحٍ عَنِ التُّهَمِ");
        this.map_var.put("meaning", "১২। প্রবীণতার সৎ উপদেশ\nযতোই ভাবো সর্বনেশে\nমন্দ কিছু নেই আসলে\n‘তুলহায়াতে'র উপদেশে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "দ্বিতীয় অধ্যায়ঃ আত্মসংযমতা");
        this.map_var.put("arabic", "فـانَّ أمَّارَتِي بالسـوءِ مــا إتَّعَظَت\nمِن جهلِـهَا بنذير الشَّـيْبِ والهَـرَمِ");
        this.map_var.put("meaning", "১৩। জ্ঞান ধীষণায় শীর্ণ জীর্ণ\n'দুষ্টমতি আত্মা’ আমার\nলয়নি কানে সৎ উপদেশ\n‘তুল হায়াতী’ অভিজ্ঞতার।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "দ্বিতীয় অধ্যায়ঃ আত্মসংযমতা");
        this.map_var.put("arabic", "ولا أعَــدَّتْ مِنَ الفِعلِ الجميلِ قِرَى\nضَيفٍ أَلَـمَّ برأسـي غيرَ مُحتشِـمِ");
        this.map_var.put("meaning", "১৪। জরা নামের সেই অতিথি\nএলো যখন দেহের ঘরে\nনেক আমলের অর্ঘ দানি\nলইনি তারে বরণ করে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "দ্বিতীয় অধ্যায়ঃ আত্মসংযমতা");
        this.map_var.put("arabic", "لـو كنتُ أعلـمُ أنِّي مــا أُوَقِّرُهُ\nكتمتُ سِـرَّا بَــدَا لي منه بالكَتَمِ");
        this.map_var.put("meaning", "১৫। সেই অতিথি আপ্যায়নের\nনেই ক্ষমতা জানলে পরে\nআমার সকল গুপ্ত বিষয়\nরেখে দিতাম গোপন করে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "দ্বিতীয় অধ্যায়ঃ আত্মসংযমতা");
        this.map_var.put("arabic", "مَن لي بِرَدِّ جِمَــاح مِن غَوَايتِهَــا\nكما يُرَدُّ جِمَاَحُ الخيــلِ بالُّلُـجُمِ");
        this.map_var.put("meaning", "১৬। পাগলা ঘোড়া এই বেয়াড়া\nমনটাকে মোর ভবঘুরে\nবশে এনে কে দেবে হায়\nনিপুণভাবে বলগা জুড়ে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "দ্বিতীয় অধ্যায়ঃ আত্মসংযমতা");
        this.map_var.put("arabic", "فـلا تَرُمْ بالمعاصي كَسْـرَ شـهوَتهَا\nإنَّ الطعـامَ يُقوِّي شــهوةَ النَّهِمِ");
        this.map_var.put("meaning", "১৭। তুষ্ট কভু হয় না যে মন\nপাপের পথে, কলুষ দ্বারা\nভোজন বিলাস লোভকে করে\nতীক্ষ্ণতর বলগা হারা।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "দ্বিতীয় অধ্যায়ঃ আত্মসংযমতা");
        this.map_var.put("arabic", "والنَّفسُ كَالطّفلِ إِنْ تُهمِلْه ُشَبَّ عَلَى\nحُبِّ الرّضَاع وَإِِِنْ تَفْطِمْهُ يَنفَطِــمِ");
        this.map_var.put("meaning", "১৮। ’দুষ্টমতি আত্না’ যে ঠিক\nদুগ্ধপায়ী শিশুর মত\nবাগড়া না দাও-বাড়বে তবু\nদুগ্ধ পানেই থাকবে রত।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "দ্বিতীয় অধ্যায়ঃ আত্মসংযমতা");
        this.map_var.put("arabic", "فاصْرِف هواهــا وحاذِر أَن تُوَلِّيَهُ\nإنَّ الهوى مـا تَـوَلَّى يُصْمِ أو يَصِمِ");
        this.map_var.put("meaning", "১৯। দমন কর রিপু নিচয়\nটেনে ধরো কামনা রাস\nবানিয়ে নিলে প্রভু তাকে\nকরবে তোমায় সমূলে নাশ।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "দ্বিতীয় অধ্যায়ঃ আত্মসংযমতা");
        this.map_var.put("arabic", "وراعِهَـا وهْيَ في الأعمال سـائِمَةٌ\nوإنْ هِيَ إستَحْلَتِ المَرعى فلا تُسِـمِ");
        this.map_var.put("meaning", "২০। চরণভূমে চলার কালে\nকঠোরভাবে দাও পাহারা\nগণ্ডি ছেড়ে যায় সে খোশে\nঅমনি হলে বাঁধনহারা।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "দ্বিতীয় অধ্যায়ঃ আত্মসংযমতা");
        this.map_var.put("arabic", "كَـم حسَّــنَتْ لَـذَّةً للمرءِ قاتِلَةً\nمِن حيثُ لم يَدْرِ أَنَّ السُّمَّ في الدَّسَـمِ");
        this.map_var.put("meaning", "২১। দুষ্ট রিপু, ভোগ বিলাসে\nনয়ন মোহন দেখায় সোজা\nকচর্বিতে যে গরল থাকে\nসহজে তা যায় না বোঝা।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "দ্বিতীয় অধ্যায়ঃ আত্মসংযমতা");
        this.map_var.put("arabic", "واخْشَ الدَّسَائِسَ مِن جوعٍ ومِن شِبَعٍ\nفَرُبَّ مخمَصَةٍ شَـــرٌّ مِنَ التُّـخَمِ");
        this.map_var.put("meaning", "২২। রিপু-ক্ষুধার ছোবল হতে\nসতর্কতায় থাকবে অতি\nক্ষুধার চেয়ে অতিভোজন\nবদহজমে দারুণ ক্ষতি।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "দ্বিতীয় অধ্যায়ঃ আত্মসংযমতা");
        this.map_var.put("arabic", "واستَفرِغِ الدمعَ مِن عينٍ قَـدِ إمْتَلأتْ\nمِن المَحَـارِمِ والْزَمْ حِميَـةَ َالنَّـدَمِ");
        this.map_var.put("meaning", "২৩ ৷ ঢ়ের জমেছে পাপের বোঝা\nবহাও চোখে অশ্রুধারা\nহয় না মোচন পাপের কালি\nঅনুতাপের কান্না ছাড়া।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "দ্বিতীয় অধ্যায়ঃ আত্মসংযমতা");
        this.map_var.put("arabic", "وخالِفِ النفسَ والشيطانَ واعصِهِـمَا\nوإنْ همـا مَحَّضَـاكَ النُّصحَ فاتَّهِـمِ");
        this.map_var.put("meaning", "২৪। উল্টো চলো শয়তানের ও\nদুষ্ট রিপুর হর হামেশা\nমন্দ কাজের মন্ত্রদানই\nএদের পেশা এদের নেশা।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "দ্বিতীয় অধ্যায়ঃ আত্মসংযমতা");
        this.map_var.put("arabic", "فلا تُطِعْ منهما خصمَا ولا حكَمَا\nفأنت تعرفُ كيـدَ الخَصمِ والحَكَـمِ");
        this.map_var.put("meaning", "২৫। এই দুজনা দুষ্ট ভীষণ\n পথটা এদের দারুণ টেরা\nনেই সেখানে ভালোর কিছু\n যেই খানেতেই থাক না এরা।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "দ্বিতীয় অধ্যায়ঃ আত্মসংযমতা");
        this.map_var.put("arabic", "أستغفر الله من قول بـلا عمل\nلقــد نسبت به نسلا لذي عقـم");
        this.map_var.put("meaning", "২৬। কর্মবিহীন ভাষণ থেকে\n শরণ যাচি আল্লাহ্ পাকের\nবন্ধ্যা নারীর বংশধারার\n দাবী নিছক উপহাসের।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "দ্বিতীয় অধ্যায়ঃ আত্মসংযমতা");
        this.map_var.put("arabic", "امرتك الخير لكن ما تمرت به\nوما استقمت فما قولى لك استقم");
        this.map_var.put("meaning", "২৭। দিই উপদেশ ভালো কাজের\n খোদ চলেছি মন্দ পথে\nএই নসিহত শুধুই ফাঁকা\n দেয় না সুফল কোনো মতে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "দ্বিতীয় অধ্যায়ঃ আত্মসংযমতা");
        this.map_var.put("arabic", "ولا تزودت قبل الموت نافلة\nولم اصل سواى فرض ولم اصم");
        this.map_var.put("meaning", "২৮। আখেরাতের দীর্ঘ পথের\n নেই পাথেয় শূন্য খামার\nফরয রোজা নামাজ ছাড়া\n নফল কিছু নেইকো আমার।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "তৃতীয় অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর প্রশংসা");
        this.map_var.put("arabic", "\ufeffظَلمـتُ سُـنَّةَ مَن أحيــا الظـلامَ إلـى\nأنِ اشـتَكَـتْ قدمَــاهُ الضُّـرَّ مِن وَرَمِ");
        this.map_var.put("meaning", "২৯। তরীকা তাঁর ত্যাগ করে-ই\nকরছি যুলুম পড়ছি ভুলে\nদাঁড়িয়ে থেকে সালাতে যার\nচরণ যুগল উঠতো ফুলে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "তৃতীয় অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর প্রশংসা");
        this.map_var.put("arabic", "وشَـدَّ مِـن سَغَـبٍ أحشــاءَهُ وطَـوَى\nتحـتَ الحجـارةِ كَشْــحَاَ ًمُـتْرَفَ الأَدَمِ");
        this.map_var.put("meaning", "৩০। বাঁধেন কাপড় পাক উদরে\nদারুণ ক্ষুধার তীব্র জ্বালায়\nকুসুম তনু রাখতে ঋজু\nকঠিন শিলা বাঁধেন মাজায়।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "তৃতীয় অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর প্রশংসা");
        this.map_var.put("arabic", "وراوَدَتْــهُ الجبـالُ الشُّــمُّ مِن ذَهَـبٍ\nعـن نفسِـه فـأراها أيَّمَـــا شَمَـمِ");
        this.map_var.put("meaning", "৩১। সোনার পাহাড় সামনে এলো\nমুখ ফিরালেন অবহেলে\nআরাম আয়েশ তুচ্ছভরে\nদুই চরণে দিলেন ঠেলে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "তৃতীয় অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর প্রশংসা");
        this.map_var.put("arabic", "وأكَّــدَت زُهـدَهُ فيهـا ضـرورَتُــهُ\nاِنَّ الضـرورةَ لا تعــدُو على العِـصَـمِ");
        this.map_var.put("meaning", "৩২। অভাব তাঁকে করল উঁচু\nঅভ্রভেদী গিরির মত\nতাঁর সততা গুণের কাছে\nতামাম জাহান হলো নত।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "তৃতীয় অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর প্রশংসা");
        this.map_var.put("arabic", "وكيـف تدعـو إلى الدنيـا ضرورة مـن\nلـولاه لم تخـرج الدنيـا مـن العــدمِ");
        this.map_var.put("meaning", "৩৩। কেমনে তাঁকে করবে কাবু\nলোভ-লালসার মোহন মায়া\nবিশ্ব ভুবন যার কারণে\nনাস্তি থেকে পাইল কায়া।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "তৃতীয় অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর প্রশংসা");
        this.map_var.put("arabic", "مـحـمـدٌّ سـيدُ الكــونينِ والثقَلَـيْنِ\nوالفريقـيـن مِن عُـربٍ ومِن عَـجَـمِ");
        this.map_var.put("meaning", "৩৪। প্রিয়নবী “মুহাম্মদ”ই\nদুই জাহানের মহান নেতা\nআরব-আজম অধিপতি\nবিশ্বগুরু জগৎ জেতা।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "তৃতীয় অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর প্রশংসা");
        this.map_var.put("arabic", "نَبِيُّـنَـا الآمِـرُ النَّــاهِي فـلا أَحَــدٌ\nأبَـرُّ فـي قَــولِ لا منـه ولا نَـعَــمِ");
        this.map_var.put("meaning", "৩৫। আদেশ-নিষেধ হা ও না-এর\nহুকুমদাতা নবী আমার\nসত্য-সঠিক হুকুম জারীর\nনেই যে কোনো তুলনা তাঁর।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "তৃতীয় অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর প্রশংসা");
        this.map_var.put("arabic", "هُو الحبيـبُ الــذي تُرجَى شـفاعَتُـهُ\nلكُـلِّ هَـوْلٍ مِن الأهــوالِ مُقـتَـحَـمِ");
        this.map_var.put("meaning", "৩৬। প্রিয় সখা খোদ এলাহির\nপরকালের কাণ্ডারি সে\nকঠোর কঠিন বিপদকালে\nমুক্তি দয়ার ভাণ্ডারী সে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "তৃতীয় অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর প্রশংসা");
        this.map_var.put("arabic", "دَعَـا إلى اللـهِ فالمُسـتَمسِـكُـون بِـهِ\nمُستَمسِـكُـونَ بِحبـلٍ غيـرِ مُنفَـصِـمِ");
        this.map_var.put("meaning", "৩৭। ডাকলো তাঁহার সত্য পথে\nসেই ডাকে দেয় দৃপ্ত সাড়া\nশক্ত হাতে বজ্র অটুট\nরজ্জু কষে ধরলো তারা।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "তৃতীয় অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর প্রশংসা");
        this.map_var.put("arabic", "فــاقَ النَّبيـيـنَ في خَلْـقٍ وفي خُلُـقٍ\nولـم يُـدَانُـوهُ في عِـلــمٍ ولا كَـرَمِ");
        this.map_var.put("meaning", "৩৮। জ্ঞানে-গুণে ধী মনীষায়\nনবীকুলের শ্রেষ্ঠ নবী\nসব অনুপম সব বেনজীর\nস্বভাব চরিত সুরত ছবি।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "তৃতীয় অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর প্রশংসা");
        this.map_var.put("arabic", "وكُــلُّهُم مِن رســولِ اللـهِ مُلتَمِـسٌ\nغَرْفَـا مِنَ البحـرِ أو رَشفَـاً مِنَ الدِّيَـمِ");
        this.map_var.put("meaning", "৩৯। সকলে তাঁর সাগর থেকে\nআঁজলা পানি যাচনা করে\nএই বাদলের বিন্দু বারি\nসবাই মাগে সকাতরে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "তৃতীয় অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর প্রশংসা");
        this.map_var.put("arabic", "وواقِـفُـونَ لَدَيــهِ عنـدَ حَـدِّهِــمِ\nمِن نُقطَـةِ العلمِ أو مِن شَكْـلَـةِ الحِكَـمِ");
        this.map_var.put("meaning", "৪০। সবাই যে তাঁর জ্ঞান মনীষার\nসাগর বেলায় অপেক্ষমাণ\nসবাই গভীর পিয়াস নিয়ে\nবিন্দু বারি চায় অনুদান।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "তৃতীয় অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর প্রশংসা");
        this.map_var.put("arabic", "فَهْوَ الـــذي تَمَّ معنــاهُ وصـورَتُـهُ\nثم اصطفـاهُ حبيبـاً بـارِيءُ النَّـسَــمِ");
        this.map_var.put("meaning", "৪১। পূর্ণ, নিখুঁত, নজিরবিহীন\nমন মননে ছায়ায় কায়ায়\nস্রষ্টা স্বয়ং বন্ধু বলে\nকরলো বরণ গভীর মায়ায়।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "তৃতীয় অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর প্রশংসা");
        this.map_var.put("arabic", "مُنَـزَّهٌ عـن شـريـكٍ في محاسِـنِـهِ\nفجَـوهَرُ الحُسـنِ فيه غيرُ منقَـسِــمِ");
        this.map_var.put("meaning", "৪২। সকল গুণের মৌল আদিম\nউৎসধারা রূপ সুষমার\nশরীকবিহীন ভাজ্যবিহীন\nঅদ্বিতীয় সত্তা যে তাঁর।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "তৃতীয় অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর প্রশংসা");
        this.map_var.put("arabic", "دَع مــا ادَّعَتـهُ النصـارى في نَبِيِّهِـمِ\nواحكُـم بما شئـتَ مَدحَـاً فيه واحتَكِـمِ");
        this.map_var.put("meaning", "৪৩। নবী ঈসায় নাসারাগণ\nখোদার বেটা ডাকছে ভুলে\nসেইটি বাদে নবীগুণের\nগান গেয়ে যাও পরাণ খুলে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "তৃতীয় অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর প্রশংসা");
        this.map_var.put("arabic", "وانسُـبْ إلى ذاتِهِ ما شئتَ مِن شَــرَفٍ\nوانسُـب إلى قَـدْرِهِ ما شئتَ مِن عِظَـمِ");
        this.map_var.put("meaning", "৪৪। মহত্ত্ব গুণ মর্যাদা মান\nউচ্চ থেকে উচ্চতর\nতাঁর সুবিশাল সত্তা সনে\nযতোই খুশী যুক্ত করো।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "তৃতীয় অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর প্রশংসা");
        this.map_var.put("arabic", "فَــاِنَّ فَضـلَ رســولِ اللهِ ليـس لـه\nحَــدٌّ فَيُعـرِبَ عنـهُ نــاطِـقٌ بِفَـمِ");
        this.map_var.put("meaning", "৪৫। কেননা সেই মহানবীর\nনেই কোনো শেষ গুণ গরিমার\nঊর্ধ্বে তিনি বাগ্মী, কবির\nসব বয়ানের সাধ্যসীমার");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "তৃতীয় অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর প্রশংসা");
        this.map_var.put("arabic", "لو نـاسَـبَتْ قَـدْرَهُ آيـاتُـهُ عِظَمَــاً\nأحيا اسمُـهُ حين يُـدعَى دارِسَ الرِّمَـمِ");
        this.map_var.put("meaning", "৪৬। সেই সুমহান সত্তা এমন\nডাকলে পূত নাম নিয়ে তাঁর\nজীবন পেয়ে উঠবে হেসে\nহাজামজা গলিত হাড়।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "তৃতীয় অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর প্রশংসা");
        this.map_var.put("arabic", "لم يمتَحِنَّــا بمـا تَعيَــا العقـولُ بـه\nحِرصَـاً علينـا فلـم نرتَـبْ ولـم نَهِـمِ");
        this.map_var.put("meaning", "৪৭। দয়াল তিনি তাঁর সুবিশাল\nহৃদয়খানি দরদভরা\nএমন হুকুম দেননি তিনি\nঅসাধ্য যা পালন করা।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "তৃতীয় অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর প্রশংসা");
        this.map_var.put("arabic", "أعيـا الـورى فَهْمُ معنـاهُ فليسَ يُـرَى\nفي القُـرْبِ والبُعـدِ فيه غـيرُ مُنفَـحِـمِ");
        this.map_var.put("meaning", "৪৮। সত্তা তাঁহার দীপ্ত রবি\nতীব্র জ্যোতির উৎসধারা\nদেখতে কি চাও পূর্ণ রূপে\nঝলসে যাবে নয়নতারা।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "তৃতীয় অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর প্রশংসা");
        this.map_var.put("arabic", "كالشمـسِ تظهَرُ للعينَيْـنِ مِن بُــعُـدٍ\nصغيـرةً وتُكِـلُّ الطَّـرْفَ مِـن أَمَـــمِ");
        this.map_var.put("meaning", "৪৯। দূর থেকে ওই আদিত্যকে\nদেখায় ছোট, নিকট গেলে\nক্ষর তেজের দীপ্ত তনু\nযায় না দেখা নয়ন মেলে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "তৃতীয় অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর প্রশংসা");
        this.map_var.put("arabic", "وكيفَ يُــدرِكُ في الدنيــا حقيقَـتَـهُ\nقَــوْمٌ نِيَــامٌ تَسَلَّـوا عنه بـالحُـلُـمِ");
        this.map_var.put("meaning", "৫০। ব্যর্থ হলো কাছের মানুষ\nবুঝতে যে রূপ চিত্তহারী\nসেই সুষমার তত্ত্ব গভীর\nবুঝবে কী আর স্বপ্লচারী।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "তৃতীয় অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর প্রশংসা");
        this.map_var.put("arabic", "فمَـبْـلَـغُ العِــلمِ فيه أنــه بَشَــرٌ\nوأَنَّــهُ خيـرُ خلْـقِ اللـه كُـــلِّهِـمِ");
        this.map_var.put("meaning", "৫১। এই টুকুনে তুষ্ট থাকো\nতিনিই সেরা সৃষ্টি খোদার\nমানব বটে—তবু ধরায়\nনেই যে কোনোই তুলনা তার।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "তৃতীয় অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর প্রশংসা");
        this.map_var.put("arabic", "وكُــلُّ آيٍ أتَى الرُّسْــلُ الكِـرَامُ بِهَـا\nفـإنمـا اتصَلَـتْ مِـن نـورِهِ بِـهِــمِ");
        this.map_var.put("meaning", "৫২। তাঁর মহান নূর উৎসভূমি\nসকল নবীর সব মো’জেযার\nএ নূর বলেই দেখান তাঁরা\nযুগে যুগে নিশান খোদার।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "তৃতীয় অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর প্রশংসা");
        this.map_var.put("arabic", "فـاِنَّهُ شمــسُ فَضْلٍ هُـم كـواكِـبُـهَا\nيُظهِـرْنَ أنـوارَهَـا للنـاسِ في الظُّلَـمِ");
        this.map_var.put("meaning", "৫৩। সূর্য তিনি – তাঁর আকাশে\nনবী সমাজ গ্রহ-তারা\nতাঁরই জ্যোতির কেন্দ্র থেকে\nসবাই পেলো জ্যোতির ধারা।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "তৃতীয় অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর প্রশংসা");
        this.map_var.put("arabic", "حَتَّى إِذَا طَلَعَتْ في الْكَونِ عَمَّ هُدَاهَا\nالْعَالَمِينَ وَأَحْيَتْ سَآئِرَ الأُمَمِ");
        this.map_var.put("meaning", "৫৪। উদয় হতে সেই দিবাকর\nনিখিল ভুবন উঠলো মাতি\nসেই সুবিমল আলোক ধারায়\nকরলো গাহন সকল জাতি।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "তৃতীয় অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর প্রশংসা");
        this.map_var.put("arabic", "أكــرِمْ بخَلْـقِ نبـيٍّ زانَــهُ خُـلُـقٌ\nبالحُسـنِ مشـتَمِـلٌ بالبِشْـرِ مُتَّسِــمِ");
        this.map_var.put("meaning", "৫৫। চারু স্বভাব মঞ্জু কায়া\nদেহ মনের রূপ মাধুরী\nদুয়ে মিলে সেই অপরূপ\nরূপকুমারের নেই যে জুড়ি।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "তৃতীয় অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর প্রশংসা");
        this.map_var.put("arabic", "كالزَّهـرِ في تَرَفٍ والبـدرِ فـي شَـرَفٍ\nوالبحـرِ في كَـرَمٍ والـدهـرِ في هِمَـمِ");
        this.map_var.put("meaning", "৫৬। কোমলতায় গোলাপ কলি\nউজ্জ্বলতায় তারাপতি\nবদ্যান্যতায় মহাসাগর\nশৌর্যে অমোঘ কালের গতি।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "তৃতীয় অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর প্রশংসা");
        this.map_var.put("arabic", "كــأنَّهُ وهْـوَ فَـرْدٌ مِـن جلالَـتِــهِ\nفي عسـكَـرٍ حينَ تلقـاهُ وفي حَشَــمِ");
        this.map_var.put("meaning", "৫৭। কুসুম কোমল তবু যে তাঁর\nস্বভাবসুলভ তেজঃমহিমায়\nএক লোকেও মনে হতো\nঘেরা বিপুল সৈন্য-সেনায়।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "তৃতীয় অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর প্রশংসা");
        this.map_var.put("arabic", "كـأنَّمَا اللـؤلُـؤُ المَكـنُـونُ في صَـدَفٍ\nمِن مَعْــدِنَـيْ مَنْطِـقٍ منه ومبتَسَــمِ");
        this.map_var.put("meaning", "৫৮। মুচকি হাসির অন্তরালে\nঝিলিক হানে দন্ত সারি\nযেন সাগর-ঝিনুক থেকে\nআনলো তাজা মুক্তো পাড়ি।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "তৃতীয় অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর প্রশংসা");
        this.map_var.put("arabic", "لا طيـبَ يَعــدِلُ تُرْبَـا ضَمَّ أعظُـمَـهُ\nطوبـى لمُنتَشِــقٍ منـه ومـلـتَـثِـمِ");
        this.map_var.put("meaning", "৫৯। শয়ান তিনি যেই মাটিতে\nখোশবু যে নেই তার মতো আর\nভাগ্য দারাজ চুমলো যারা\nশুঁকলো যারা সুরভি তাঁর।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "চতুর্থ অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর বেলাদত");
        this.map_var.put("arabic", "\ufeffأبـانَ مولِـدُهُ عن طِـيـبِ عنـصُـرِهِ\nيـا طِيـبَ مُبتَـدَاٍ منـه ومُـخـتَـتَـمِ");
        this.map_var.put("meaning", "৬০। অন্ত-আদি সব উপাদান\nপবিত্র যার পূর্ণ নূরে\nআবির্ভাবে সেই নায়কের\nলাগলো চমক বিশ্ব জুড়ে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "চতুর্থ অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর বেলাদত");
        this.map_var.put("arabic", "يَـومٌ تَفَـرَّسَ فـيـه الفُـرسُ أنَّـهُـمُ\nقَـد أُنـذِرُوا بِحُلُـولِ البُـؤسِ والنِّـقَـم");
        this.map_var.put("meaning", "৬১। উঠলো কেঁপে ইরান ভূমি\nরইলো না আর বাকী বুঝার\nমঞ্চে হাজির ন্যায়ের রাজা\nসময় খতম অগ্নিপূজার।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "চতুর্থ অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর বেলাদত");
        this.map_var.put("arabic", "وبـاتَ اِيـوَانُ كِسـرَى وَهْوَ مُنْـصَـدِعٌ\nكَشَـمـلِ أصحـابِ كِسـرَى غيرَ مُلتَئِـمِ");
        this.map_var.put("meaning", "৬২। ধরলো ফাটল খসরু রাজের\nবালাখানার উচ্চশিরে\nলাগলো বিবাদ সৈন্যদলে\nএলো না আর শান্তি ফিরে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "চতুর্থ অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর বেলাদত");
        this.map_var.put("arabic", "والنارُ خـامِـدَةُ الأنفـاسِ مِـن أَسَـفٍ\nعليه والنهـرُ سـاهي العَيْـنِ مِن سَـدَمِ");
        this.map_var.put("meaning", "৬৩। সেই বেদনার দীর্ঘশ্বাসে\nনিভলো পূজার বহ্নিশিখা\nশুকিয়ে গেলো ফোরাত নদীর\nসলিলধারা চলন্তিকা।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "চতুর্থ অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর বেলাদত");
        this.map_var.put("arabic", "وسـاءَ سـاوَةَ أنْ غاضَـتْ بُحَيرَتُـهَـا\nوَرُدَّ وارِدُهَــا بـالغَيْـظِ حينَ ظَـمِـي");
        this.map_var.put("meaning", "৬৪। সাওয়া হ্রদের অম্বুরাশি\nশুষ্ক হলো সেই বেদনায়\nজলকে চলো পিয়াসু দল\nফিরে গেলো ভগ্ন হিয়ায়।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "চতুর্থ অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর বেলাদত");
        this.map_var.put("arabic", "كـأَنَّ بالنـارِ مـا بالمـاءِ مِـن بَـلَـلٍ\nحُزْنَـاً وبـالمـاءِ ما بالنـار مِن ضَـرَمِ");
        this.map_var.put("meaning", "৬৫। অগ্নি যেন সলিল হলো\nসলিল পেলো রূপ আগুনের\nসেই বিষাদে সর্বব্যাপী\nবইলো তুফান ইনকিলাবের।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "চতুর্থ অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর বেলাদত");
        this.map_var.put("arabic", "والجِـنُّ تَهتِـفُ والأنـوارُ سـاطِـعَـةٌ\nوالحـقُّ يظهَـرُ مِـن معنـىً ومِن كَلِـمِ");
        this.map_var.put("meaning", "৬৬। জানিয়ে দিলো জিনেরা তাঁর\nআবির্ভাবের খোশ খবরী\nছড়িয়ে গেলো সেই বারতা\nত্বরলিৎ বেগে ভুবন ভরি।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "চতুর্থ অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর বেলাদত");
        this.map_var.put("arabic", "عَمُـوا وصَمُّـوا فـإِعلانُ البشـائِرِ لـم\nتُسمَـعْ وبارِقَـةُ الاِنـذارِ لـم تُـشَــمِ");
        this.map_var.put("meaning", "৬৭। ঘাড় বাঁকিয়ে রইলো তবু\nঅন্ধ বধির ভ্রান্ত কাফের\nজাগালো না হৃদে সাড়া\nদীপ্ত নিশান নবুওয়াতের।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "চতুর্থ অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর বেলাদত");
        this.map_var.put("arabic", "مِن بعـدِ ما أخبَـرَ الأقـوامَ كـاهِـنُهُـم\nبـأنَّ دينَـهُـمُ المُعــوَجَّ لـم يَـقُــمِ");
        this.map_var.put("meaning", "৬৮। আকাশ হতে উজল তারা\nপড়লো খসে মাটির ভূমে\nদেব দেবীদের মূর্তিগুলো\nউল্টে পড়ে জমিন চুমে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "চতুর্থ অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর বেলাদত");
        this.map_var.put("arabic", "وبعـد ما عاينُوا في الأُفقِ مِن شُـهُـبٍ\nمُنقَضَّةٍ وَفـقَ مـا في الأرضِ مِن صَنَـمِ");
        this.map_var.put("meaning", "৬৯। জ্যোতিষ তাদের বলেছিলো\nভ্রান্ত ধরম টিকবে না আর\nতবু অটল রইলো তাতে\nজ্ঞান না করে মিথ্যাকে সার।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "চতুর্থ অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর বেলাদত");
        this.map_var.put("arabic", "حتى غَـدا عن طـريقِ الوَحـيِ مُنهَـزِمٌ\nمِن الشـياطيـنِ يقفُـو اِثْـرَ مُنـهَـزِمِ");
        this.map_var.put("meaning", "৭০। শয়তানেরা নিক্ষেপিত\nঅগ্নিবাণের তীব্র জ্বালায়\nওহীর আকাশ - সড়ক ছেড়ে\nএকের পিছে অন্যে পালায়।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "চতুর্থ অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর বেলাদত");
        this.map_var.put("arabic", "كأنَّـهُـم هَـرَبَـا أبـطـالُ أبْـرَهَــةٍ\nأو عَسكَـرٌ بالحَصَى مِن راحَتَيْـهِ رُمِ");
        this.map_var.put("meaning", "৭১। পালায় যথা হস্তিসেনা\nআবরাহা শা’ মহাপাপীর\nনিক্ষেপিত নবীর ধূলায়\nকিংবা যথা পালায় কাফির।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "চতুর্থ অধ্যায়ঃ রাসূলুল্লাহ ﷺ এর বেলাদত");
        this.map_var.put("arabic", "نَبْـذاً به بَعـدَ تسـبيـحٍ بِبَـطنِهِمَــا\nنَبْـذَ المُسَبِّـحِ مِن أحشـاءِ ملـتَـقِـمِ");
        this.map_var.put("meaning", "৭২। ইউনুস নবীর তসবি পাঠে\nমৎস যথা শীঘ্র অতি\nউদগারি তায় ফেলল চরায়\nঅধীর হয়ে তীব্রগতি।\n\nতেমনি নবীর হস্ত হতে\nকাঁকরগুলো তসবিরত\nধাইল ত্বরা লক্ষ্যভেদী\nতীক্ষ্ণ গতি তীরের মতো।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "পঞ্চম অধ্যায়ঃ হুজুর ﷺ এর দ্বীনের দাওয়াত");
        this.map_var.put("arabic", "\ufeffجـاءت لِـدَعوَتِهِ الأشـجـارُ سـاجِـدَةً\nتمشِـي إِليـه علـى ســاقٍ بلا قَـدَمِ");
        this.map_var.put("meaning", "৭৩। চরণবিহীন বৃক্ষরাজি\nমোর পিয়ারা নবীর ডাকে\nহাজির হলো কাণ্ডভারে\nসিজদারত পত্রে শাখে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "পঞ্চম অধ্যায়ঃ হুজুর ﷺ এর দ্বীনের দাওয়াত");
        this.map_var.put("arabic", "كـأنَّمَا سَـطَـرَتْ سـطرا لِمَا كَتَـبَـتْ\nفُرُوعُهَـا مِـن بـديـعِ الخَطِّ في الَّلقَـمِ");
        this.map_var.put("meaning", "৭৪। আসলো তারা শির আনত\nমুহাব্বতের গভীর টানে\nআসলো যেন গুণোগানের\nপঙক্তি লিখে তাঁহার শানে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "পঞ্চম অধ্যায়ঃ হুজুর ﷺ এর দ্বীনের দাওয়াত");
        this.map_var.put("arabic", "مثـلَ الغمـامَـةِ أَنَّـى سـارَ سـائِـرَةً\nتَقِيـهِ حَرَّ وَطِيـسٍ للهَجِـيـرِ حَـمِـي");
        this.map_var.put("meaning", "৭৫। রৌদ্র তাপে চলতে পথে\nমাথার উপর বাদল এসে\nধরতো ছায়া নিবিড়ভাবে\nশূন্যে থেকে হাওয়ায় ভেসে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "পঞ্চম অধ্যায়ঃ হুজুর ﷺ এর দ্বীনের দাওয়াত");
        this.map_var.put("arabic", "أقسـمـت بالقمـر المنـشـق إن لـه\nمن قلبـه نسبـةً مـبـرورة القـسـمِ");
        this.map_var.put("meaning", "৭৬। চাঁদ বিদারণ বুক বিদারণ\nদুয়ের মাঝে মিল যে মেলা\nখোদার কসম দুই ঘটনা\nনূরের মেলা, নূরের খেলা।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "পঞ্চম অধ্যায়ঃ হুজুর ﷺ এর দ্বীনের দাওয়াত");
        this.map_var.put("arabic", "وما حـوى الغـارُ مِن خيـرٍ ومِن كَـرَمِ\nوكُـلُّ طَـرْفٍ مِنَ الكفـارِ عنه عَـمِ");
        this.map_var.put("meaning", "৭৭। সওর গিরি গুহার কোলে\nলুকান নবী সংগোপনে\nচিরদিনের প্রাণের সাথী\nআবু বকর তাঁহার সনে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "পঞ্চম অধ্যায়ঃ হুজুর ﷺ এর দ্বীনের দাওয়াত");
        this.map_var.put("arabic", "فالصدقُ في الغارِ والصـدِّيـقُ لم يَرِمَـا\nوهُم يـقـولـون مـا بالغـارِ مِـن أَرِمِ");
        this.map_var.put("meaning", "৭৮। উভয় সাথী গুহার মাঝে\nতবু কাফির দেখতে না পায়\nচক্ষু তাদের অন্ধ হলো\nমহানবীর পাক মো’জেযায়।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "পঞ্চম অধ্যায়ঃ হুজুর ﷺ এর দ্বীনের দাওয়াত");
        this.map_var.put("arabic", "ظنُّـوا الحمـامَةَ وظنُّوا العنكبوتَ علـى\nخـيـرِ البَرِّيَّـةِ لم تَنـسُـجْ ولم تَـحُـمِ");
        this.map_var.put("meaning", "৭৯। দেখলো তারা উর্ণনাভে\nজাল বুনেছে গুহার মুখে\nতারই পাশে কবুতরে\nডিম পেড়েছে মনের সুখে।\n\nবললো তারা এই গুহাতে\nকেউ ঢুকেনি আজ নিশীথে\nপুরান এসব শীঘ্র চলো\nতালাশ করি অন্য ভিতে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "পঞ্চম অধ্যায়ঃ হুজুর ﷺ এর দ্বীনের দাওয়াত");
        this.map_var.put("arabic", "وِقَـايَةُ اللـهِ أغنَـتْ عَن مُضَاعَـفَـةٍ\nمِـنَ الدُّرُوعِ وعـن عـالٍ مِـنَ الأُطُـمِ");
        this.map_var.put("meaning", "৮০। শত্রুকুলের বিপুল রসদ\nতীর তলোয়ার দূর্গ থেকে\nভয়-ভীতিহীন বেপরোয়া\nকরলো খোদা তাঁর নবীকে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "পঞ্চম অধ্যায়ঃ হুজুর ﷺ এর দ্বীনের দাওয়াত");
        this.map_var.put("arabic", "ما سامَنِي الدَّهـرُ ضيمَاً واسـتَجَرتُ بِـهِ\nاِلا ونِـلـتُ جِـوَارَاً منـه لـم يُـضَـمِ");
        this.map_var.put("meaning", "৮১ ৷ যেই বিপদে যখন আমি\nতাঁর সমীপে চাইছি শরণ\nপেয়েছি তাঁর মদদ নিতি\nবিফল কভু হয়নি কখন।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "পঞ্চম অধ্যায়ঃ হুজুর ﷺ এর দ্বীনের দাওয়াত");
        this.map_var.put("arabic", "ولا التَمسـتُ غِنَـى الدَّارَيْـنِ مِن يَـدِهِ\nاِلا استَلَمـتُ النَّدَى مِن خيـرِ مُسـتَلَـمِ");
        this.map_var.put("meaning", "৮২। দুই জাহানের নিয়ামতের\nযখনই যা দরবারে তাঁর\nযাচনা করে হাত পেতেছি\nব্যর্থ কভু হইনি তো আর।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "পঞ্চম অধ্যায়ঃ হুজুর ﷺ এর দ্বীনের দাওয়াত");
        this.map_var.put("arabic", "لا تُنـكِـرِ الوَحْـيَ مِـن رُؤيَـاهُ اِنَّ لَـهُ\nقَلْـبـاً اِذا نـامَـتِ العينـانِ لم يَـنَـمِ");
        this.map_var.put("meaning", "৮৩৷ স্বপ্নতেও পেতেন ওহী\nপষ্ট দ্বিধা-দ্বন্দ্ব ছাড়া\nনয়নে তাঁর নিদ এলেও\nহৃদয় ছিলো তন্দ্রাহারা।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "পঞ্চম অধ্যায়ঃ হুজুর ﷺ এর দ্বীনের দাওয়াত");
        this.map_var.put("arabic", "وذاكَ حـيـنَ بـُلُـوغٍ مِـن نُـبُـوَّتِـهِ\nفليسَ يُنـكَـرُ فيـهِ حـالُ مُـحـتَـلِـمِ");
        this.map_var.put("meaning", "৮৪। অপেক্ষা শেষ – সজ্জিত মন\nজ্যোতির্লোকের দীপ্ত ভূষায়\nস্বপ্নে ওহী শুরু হলো\nনবুওয়াতের রাঙা ঊষায়।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "পঞ্চম অধ্যায়ঃ হুজুর ﷺ এর দ্বীনের দাওয়াত");
        this.map_var.put("arabic", "تبـارَكَ اللـهُ ما وَحـيٌ بمُـكـتَـسَـبٍ\nولا نبـيٌّ علـى غـيـبٍ بـمُـتَّـهَـمِ");
        this.map_var.put("meaning", "৮৫। খোদার সেরা দান নবুওয়াত\nআহরণের বস্তু এ নয়\nগায়বী কথা কয় না নবী\nখোদার ওহী কণ্ঠে শোনায়।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "পঞ্চম অধ্যায়ঃ হুজুর ﷺ এর দ্বীনের দাওয়াত");
        this.map_var.put("arabic", "اياته الغر لا يخفى على احد\nبدوتها العدل بين الناس لم يقم");
        this.map_var.put("meaning", "৮৬। মো’জেযা তাঁর পষ্টতর\nদীপ্ত উজল চিহ্ন হকের\nকায়েম ছিলো সাধ্যাতীত\nএই ব্যতীত সত্য ন্যায়ের।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "পঞ্চম অধ্যায়ঃ হুজুর ﷺ এর দ্বীনের দাওয়াত");
        this.map_var.put("arabic", "كَـم أبْرَأَتْ وَصِـبَـاً باللمـسِ راحَـتُـهُ\nوأطلَقَـتْ أَرِبَـاً مِـن رِبـقَـةِ اللـمَـمِ");
        this.map_var.put("meaning", "৮৭। কতোই হলো রোগ নিরাময়\nতাঁহার হাতের পরশ মেখে\nকতো পাগল মুক্তি পেলো\nউন্মাদনার শেকল থেকে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "পঞ্চম অধ্যায়ঃ হুজুর ﷺ এর দ্বীনের দাওয়াত");
        this.map_var.put("arabic", "وأَحْيـت السَـنَةَ الشَّـهبـاءَ دَعـوَتُـهُ\nحتى حَكَـتْ غُرَّةً في الأَعصُـرِ الدُّهُــمِ");
        this.map_var.put("meaning", "৮৮। খরায় মরা আকাল ভরা\nবর্ষ কতো সর্বনেশে\nদোয়াতে তাঁর জীবন পেলো\nফুল-ফসলে উঠলো হেসে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "পঞ্চম অধ্যায়ঃ হুজুর ﷺ এর দ্বীনের দাওয়াত");
        this.map_var.put("arabic", "بعارِضٍ جـادَ أو خِلْـتَ البِطَـاحَ بهــا\nسَـيْـبٌ مِنَ اليـمِّ أو سَـيْلٌ مِنَ العَـرِمِ");
        this.map_var.put("meaning", "৮৯। সেই দোয়াতে বৃষ্টি জলের\nঢল বয়ে যায় বাঁধনহারা\n'এরেম’ বাঁধের দেয়াল ভেঙে\nবইল যেমন বন্যাধারা।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "ষষ্ঠ অধ্যায়ঃ কোরআন শরীফের মর্যাদার বর্ণনা");
        this.map_var.put("arabic", "\ufeffدَعنِـي وَوَصفِـيَ آيـاتٍ لـه ظـهَـرَتْ\nظهُـورَ نارِ القِـرَى ليـلا على عَــلَـمِ");
        this.map_var.put("meaning", "৯০। গিরি শিখর উজল করা\nদিক-দিশারী অগ্নি যথা\nদাও আমাকে বলতে এবার\nপুণ্যে ভরা সে সব কথা।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "ষষ্ঠ অধ্যায়ঃ কোরআন শরীফের মর্যাদার বর্ণনা");
        this.map_var.put("arabic", "فالـدُّرُ يزدادُ حُسـنـاً وَهْـوَ مُنتَـظِـمُ\nوليس يَـنقُـصُ قَـدرَاً غيـرَ مُنتَـظِـمِ");
        this.map_var.put("meaning", "৯১। মুক্তো মানিক গাঁথলে মালায়\nবাড়ে বটে তাহার শোভা\nনা গাঁথলেও দীপ্তি সমান\nএকই সমান মনোলোভা\n\nতেমনি কুরআন করলে বয়ান\nদীপ্তি বাড়ে লোক সমাজের\nনা করলেও বয়ান তাতে\nকোনই ক্ষতি নেই কুরআনের।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "ষষ্ঠ অধ্যায়ঃ কোরআন শরীফের মর্যাদার বর্ণনা");
        this.map_var.put("arabic", "فـمَـا تَـطَـاوُلُ آمـالِ المـدِيـحِ إلـى\nما فيـه مِن كَـرَمِ الأخـلاقِ والشِّـيَـمِ");
        this.map_var.put("meaning", "৯২। মহিমা তার এতোই বেশী\nউচ্চ এতো তাঁর মহাশির\nপায় কি কভু নাগাল তাঁহার\nকল্পনাতে কোনো কবির?");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "ষষ্ঠ অধ্যায়ঃ কোরআন শরীফের মর্যাদার বর্ণনা");
        this.map_var.put("arabic", "آيـاتُ حَـقٍّ مِـنَ الرحمـنِ مُـحدَثَـةٌ\nقديمَـةٌ صِفَـةُ المـوصـوفِ بالقِــدَمِ");
        this.map_var.put("meaning", "৯৩। অনাদি সেই সত্তা সম\nকালাম ’কাদিম’ শুরু-বিহীন\nঅথচ তার অর্থমালা\nচির নতুন, চির নবীন।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "ষষ্ঠ অধ্যায়ঃ কোরআন শরীফের মর্যাদার বর্ণনা");
        this.map_var.put("arabic", "لـم تَقتَـرِن بزمـانٍ وَهْـيَ تُخبِـرُنـا\nعَـنِ المَـعَـادِ وعَـن عـادٍ وعَـن إِرَمِ");
        this.map_var.put("meaning", "৯৪। মুক্ত কালের পাঞ্জা থেকে\nতবু আছে বার্তা কালের\nখবর আছে বিচার দিনের\nআছে খবর ‘আদ’ ‘এরেমের।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "ষষ্ঠ অধ্যায়ঃ কোরআন শরীফের মর্যাদার বর্ণনা");
        this.map_var.put("arabic", "دامَـتْ لدينـا ففـاقَـتْ كُـلَّ مُعـجِـزَةٍ\nمِنَ النَّـبـيـيـنَ اِذ جـاءَتْ ولَـم تَـدُمِ");
        this.map_var.put("meaning", "৯৫। সব কিতাবের শ্রেষ্ঠ কিতাব\nশ্রেষ্ঠ এ যে সব মো’জেযার\nশেষ হয়েছে সব মো’জেযা\nহবে না শেষ মো’জেযা তাঁর।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "ষষ্ঠ অধ্যায়ঃ কোরআন শরীফের মর্যাদার বর্ণনা");
        this.map_var.put("arabic", "مَـاتٌ فمـا تُبقِيـنَ مِـن شُــبَـهٍ\nلـذي شِـقَاقٍ وما تَبغِـيـنَ مِن حِـكَـمِ");
        this.map_var.put("meaning", "৯৬। আয়াতমালা পষ্টতর\nবিন্দুও লেশ নেই জড়তার\nসব বিচারের ঊর্ধ্বে কুরআন\nঊর্ধ্বে সকল দ্বন্দ্ব-দ্বিধার।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "ষষ্ঠ অধ্যায়ঃ কোরআন শরীফের মর্যাদার বর্ণনা");
        this.map_var.put("arabic", "ما حُورِبَـت قَـطُّ إلا عـادَ مِـن حَـرَبٍ\nأَعـدَى الأعـادِي إليها مُلقِـيَ السَّـلَـمِ");
        this.map_var.put("meaning", "৯৭। নামলো যখন অরাতিকুল\nমোকাবেলায় এই কিতাবের\nবাধ্য হলো সন্ধি করায়\nক্লান্তি বয়ে পরাজয়ের।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "ষষ্ঠ অধ্যায়ঃ কোরআন শরীফের মর্যাদার বর্ণনা");
        this.map_var.put("arabic", "رَدَّتْ بلاغَتُـهَـا دَعـوى مُعـارِضِـهَـا\nرَدَّ الغَـيُـورِ يَـدَ الجـانِي عَـن الحُـرَمِ");
        this.map_var.put("meaning", "৯৮। সম্মানী বীর দুরাচারের\nহামলা যেমন ব্যর্থ করে\nমর্যাদা-মান পরিবারের\nরক্ষা করে শৌর্য ভরে।\n\nতেমনি কুরআন ভাষা এবং\nঅলংকারে তার অনাবিল\nবিরোধীদের সকল চ্যালেঞ্জ\nঅলীক দাবী করলো বাতিল।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "ষষ্ঠ অধ্যায়ঃ কোরআন শরীফের মর্যাদার বর্ণনা");
        this.map_var.put("arabic", "لهـا مَعَـانٍ كَمـوْجِ البحـرِ في مَــدَدٍ\nوفَـوقَ جَوهَـرِهِ في الحُســنِ والقِيَـمِ");
        this.map_var.put("meaning", "৯৯। নিতুই বাড়ে মর্ম-মানে\nঊর্মি সম নীল সাগরের\nহীরে মোতি পান্না থেকে\nকান্তি কিমত ঢের বেশী এর।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "ষষ্ঠ অধ্যায়ঃ কোরআন শরীফের মর্যাদার বর্ণনা");
        this.map_var.put("arabic", "فَمَـا تُعَـدُّ ولا تُحصَـى عجـائِـبُـهَـا\nولا تُـسَـامُ علـى الاِكـثـارِ بـالسَّـأَمِ");
        this.map_var.put("meaning", "১০০। নেই অবসাদ তিলাওয়াতে\nঅবাক অবাক মর্মে ভরা\nএর অবদান বিপুল বিশাল\nহিসাব নিকাশ যায় না করা।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "ষষ্ঠ অধ্যায়ঃ কোরআন শরীফের মর্যাদার বর্ণনা");
        this.map_var.put("arabic", "قَـرَّتْ بَها عيـنُ قارِيـهـا فقُلـتُ لـه\nلقد ظَفِـرتَ بحَبْـلِ اللـه فاعـتَـصِـمِ");
        this.map_var.put("meaning", "১০১। নয়ন শীতল হয় পঠনে\nবলছি শোন পাঠকদেরে\nধরেছো ঠিক অটুট রশি\nদিও না এই রজ্জু ছেড়ে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "ষষ্ঠ অধ্যায়ঃ কোরআন শরীফের মর্যাদার বর্ণনা");
        this.map_var.put("arabic", "إن تتلـهـا خيفـةً من حـر نـار لظـى\nأطفـأت حـر لظـى من وردهـا الشـبم");
        this.map_var.put("meaning", "১০২। এর তিলাওয়াত দেয় নিভিয়ে\nজাহান্নামের অগ্নিশিখা\nভাগ্য দুয়ার দেয় খুলে এ\nপরায় ভালে বিজয়টিকা।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "ষষ্ঠ অধ্যায়ঃ কোরআন শরীফের মর্যাদার বর্ণনা");
        this.map_var.put("arabic", "كأنَّهـا الحـوضُ تَبيَـضُّ الوُجُـوهُ بِـهِ\nمِنَ العُـصَـاةِ وقَـد جـاؤُوهُ كالحُـمَـمِ");
        this.map_var.put("meaning", "১০৩। জান্নাতী জাম কাওছারের এ\nস্বচ্ছ শীতল পুণ্যধারা\nহয় উজালা এর পরশে\nপাপীর কালো রূপ চেহারা।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "ষষ্ঠ অধ্যায়ঃ কোরআন শরীফের মর্যাদার বর্ণনা");
        this.map_var.put("arabic", "وكـالصِّـراطِ وكـالميـزانِ مَـعـدَلَـةً\nفالقِسطُ مِن غيرِهَـا في الناسِ لم يَقُـمِ");
        this.map_var.put("meaning", "১০৪। ন্যায় বিচারের নিক্তি সঠিক\nসূক্ষ্ম সড়ক পুলসিরাতের\nফরক্বকারী ঈমান-কুফর\nআলো-আঁধার, হক্ব-বাতিলের।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "ষষ্ঠ অধ্যায়ঃ কোরআন শরীফের মর্যাদার বর্ণনা");
        this.map_var.put("arabic", "لا تَعجَبَـنْ لِحَسُــودٍ راحَ يُنـكِـرُهَـا\nتجـاهُـلا وَهْوَ عينُ الحـاذِقِ الفَـهِـمِ");
        this.map_var.put("meaning", "১০৫ ৷ বিদ্যাবিনোদ ধীমান কাফের\nঝুট বলে যে এই কুরআনে\nহিংসা-দ্বেষের ফল তা শুধু\nমনে ঠিকই সত্য জানে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "ষষ্ঠ অধ্যায়ঃ কোরআন শরীফের মর্যাদার বর্ণনা");
        this.map_var.put("arabic", "قد تُنكِـرُ العينُ ضَوْءَ الشمسِ مِن رَمَـدٍ\nويُنكِـرُ الفَـمُ طعـمَ المـاءِ مِن سَـقَـمِ");
        this.map_var.put("meaning", "১০৬। চক্ষু পীড়ায় রোগীর কাছে\nখারাপ লাগে সূর্য-আলো\nরোগের দরুন মিঠে জলও\nলাগে না আর জিভে ভালো।\n\nতেমনি যতো পীড়িত জন\nহৃদে যাদের ব্যারাম আছে\nএই কুরআনের মধুর বাণী\nলাগবে খারাপ তাদের কাছে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "সপ্তম অধ্যায়ঃ মে’রাজের বর্ণনা");
        this.map_var.put("arabic", "\ufeffيا خيـرَ مَن يَمَّـمَ العـافُـونَ ساحَـتَـهُ\nسعيَـا وفَـوقَ مُتُونِ الأَيْنُـقِ الرُّسُــمِ");
        this.map_var.put("meaning", "১০৭। উট হাঁকিয়ে, পায়দলে কেউ\nসুদূর মরু দিয়ে পাড়ি\nতোমার দ্বারে দানের আশে\nভিড় করে সব যাচনাকারী।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "সপ্তম অধ্যায়ঃ মে’রাজের বর্ণনা");
        this.map_var.put("arabic", "ومَن هُـوَ الآيـةُ الكُبـرَى لمُعـتَـبِـرٍ\nومَن هُـوَ النِّعمَـةُ العُظمَـى لِمُغـتَـنِـمِ");
        this.map_var.put("meaning", "১০৮। তুমি সেরা নজির নিশান\nধ্যানী-জ্ঞানী চিন্তাবিদের\nশ্রেষ্ঠতর বিভব তুমি\nভদ্র মানী সম্মানীদের।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "সপ্তম অধ্যায়ঃ মে’রাজের বর্ণনা");
        this.map_var.put("arabic", "سَـرَيـتَ مِـن حَـرَمٍ ليـلا إلى حَـرَمِ\nكما سَـرَى البَـدرُ في داجٍ مِنَ الظّـُلَـمِ");
        this.map_var.put("meaning", "১০৯। পৌঁছলে রাতে এক হারামে\nআর হারামের প্রান্ত ছাড়ি\nপূর্ণমাসী চন্দ্র যেমন\nরাত-সাগরে জমায় পাড়ি।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "সপ্তম অধ্যায়ঃ মে’রাজের বর্ণনা");
        this.map_var.put("arabic", "وبِـتَّ ترقَـى إلـى أن نِلـتَ مَنـزِلَـةً\nمِن قابَ قوسَـيْـنِ لم تُـدرَكْ ولَم تُـرَمِ");
        this.map_var.put("meaning", "১১০। পৌঁছলে “কাবা কাওসাইনে”\nদরবারে খোদ আল্লাহ্ তায়ালার\nঅবাক সফর ভূমন্ডলে\nকরেনি কেউ কল্পনা যার।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "সপ্তম অধ্যায়ঃ মে’রাজের বর্ণনা");
        this.map_var.put("arabic", "وقَـدَّمَـتْـكَ جمـيـعُ الأنبـيـاءِ بهـا\nوالرُّسْــلِ تقديـمَ مخـدومٍ على خَـدَمِ");
        this.map_var.put("meaning", "১১১। নবী সমাজ তোমায় নিয়ে\nকরলো খাড়া সবার আগে\nভূত্য যেমন প্রভুকে তার\nদেয় এগিয়ে অগ্রভাগে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "সপ্তম অধ্যায়ঃ মে’রাজের বর্ণনা");
        this.map_var.put("arabic", "وأنتَ تَختَـرِقُ السبـعَ الطِّبَـاقَ بـهـم\nفي مَوكِـبٍ كُنـتَ فيه صاحِـبَ العَـلَـمِ");
        this.map_var.put("meaning", "১১২। সপ্ত আকাশ করলে সফর\nফেরেশতাদের মিছিল লয়ে\nযেমনি চলে সেনাপতি\nসবার আগে ঝাণ্ডা বয়ে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "সপ্তম অধ্যায়ঃ মে’রাজের বর্ণনা");
        this.map_var.put("arabic", "حتـى إذا لم تـدَعْ شَـأْوَاً لمُسـتَـبِـقٍ\nمِـنَ الدُّنُـوِّ ولا مَـرقَـىً لمُسـتَـنِـمِ");
        this.map_var.put("meaning", "১১৩। অবশেষে পৌঁছলে খোদার\nনিকট থেকে নিকট আরো\nপৌঁছা যেথায় হয়নি এবং\nহবে না আর সাধ্য কারো।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "সপ্তম অধ্যায়ঃ মে’রাজের বর্ণনা");
        this.map_var.put("arabic", "خَفَـضْـتَ كُـلَّ مَـقَـامٍ بالإضـافَـةِ إِذ\nنُـودِيـتَ بالرَّفـعِ مثـلَ المُفـرَدِ العَـلَمِ");
        this.map_var.put("meaning", "১১৪। সবার পিছে ফেললে তুমি\nনেই তুলনা কারুর সনে\nধন্য তুমি ‘আরশে আলায়’\nএকক রূপে আমন্ত্রণে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "সপ্তম অধ্যায়ঃ মে’রাজের বর্ণনা");
        this.map_var.put("arabic", "كيمـا تَـفُـوزَ بِوَصْـلٍ أيِّ مُسـتَـتِـرِ\nعَنِ العُـيـون وسِـرٍّ أيِّ مُـكـتَـتِـمِ");
        this.map_var.put("meaning", "১১৫। সংগোপনে পার্শ্বে নিয়ে\nদিলেন খুলে রহস্য দ্বার\nনেই ক্ষমতা তুমি ছাড়া\nকারুরই তা জানার বুঝার।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "সপ্তম অধ্যায়ঃ মে’রাজের বর্ণনা");
        this.map_var.put("arabic", "فَحُـزتَ كُلَّ فَـخَـارٍ غيـرَ مُشــتَـرَكٍ\nوجُـزْتَ كُـلَّ مَـقَـامٍ غيـرَ مُـزدَحَـمِ");
        this.map_var.put("meaning", "১১৬। কামালতের সোপানরাজি\nনীরব ধ্যানে সব হয়ে পার\nপৌঁছলে তুমি এককভাবে\nশীর্ষ চুড়ে সব মহিমার।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "সপ্তম অধ্যায়ঃ মে’রাজের বর্ণনা");
        this.map_var.put("arabic", "وجَـلَّ مِـقـدَارُ ما وُلِّيـتَ مِن رُتـَـبٍ\nوعَـزَّ إِدراكُ مـا أُولِيـتَ مِـن نِـعَـمِ");
        this.map_var.put("meaning", "১১৭। দিলেন তোমায় যেই নিয়ামত\nনেই যে কোনো তুলনা তার\nপেয়েছো তা একাই তুমি\nকাউকে দেয়া হয়নি যে আর।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "সপ্তম অধ্যায়ঃ মে’রাজের বর্ণনা");
        this.map_var.put("arabic", "بُشـرَى لنا مَعشَـرَ الإسـلامِ اِنَّ لـنـا\nمِـنَ العِنَـايَـةِ رُكنَـاً غيـرَ منـهَـدِمِ");
        this.map_var.put("meaning", "১১৮। ভাগ্য দারাজ এ মিল্লাতের\nখোদার প্রিয় রসূল আমীন\nকরলো কায়েম এমন খুঁটি\nধ্বংস যাহার নেই কোনো দিন।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "সপ্তম অধ্যায়ঃ মে’রাজের বর্ণনা");
        this.map_var.put("arabic", "لمَّـا دَعَـى اللـهُ داعيـنـا لطاعَـتِـهِ\nبأكـرمِ الـرُّسْـلِ كُـنَّـا أكـرَمَ الأُمَـمِ");
        this.map_var.put("meaning", "১১৯। খোদার দয়ায় মোদের রসূল\nসব রসূলের সেবা রসূল\nতেমনি মোরা সকল জাতির\nসেরা জাতি নেই তাতে ভুল।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "অষ্টম অধ্যায়ঃ নবী করিম ﷺ এর জিহাদের বর্ণনা");
        this.map_var.put("arabic", "راعَـتْ قلـوبَ العِـدَا أنباءُ بِعـثَـتِـهِ\nكَنَبـأَةٍ أَجْـفَـلَـتْ غُفْـلا مِنَ الغَـنَـمِ");
        this.map_var.put("meaning", "১২০। আবির্ভাবে বিশ্বনবীর\nকাঁপল হিয়া অরাতিদের\nকাঁপে যেমন মেঘের হিয়া\nঘোর নিনাদে সিংহরাজের।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "অষ্টম অধ্যায়ঃ নবী করিম ﷺ এর জিহাদের বর্ণনা");
        this.map_var.put("arabic", "مـا زالَ يلقـاهُـمُ في كُـلِّ مُـعـتَـرَكٍ\nحتى حَكَـوْا بالقَنَـا لَحمَـا على وَضَــمِ");
        this.map_var.put("meaning", "১২১। বীর নবীজীর মোকাবেলায়\nশক্রসেনা যুদ্ধ মাঠে\nচূর্ণ হতো, চুর্ণিত হয়\nগোশত যেমন কসাই-কাঠে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "অষ্টম অধ্যায়ঃ নবী করিম ﷺ এর জিহাদের বর্ণনা");
        this.map_var.put("arabic", "وَدُّوا الفِـرَارَ فكـادُوا يَغـبِـطُـونَ بـه\nأشـلاءَ شالَـتْ مَعَ العُقبَـانِ والـرَّخَـمِ");
        this.map_var.put("meaning", "১২২। প্রতি লড়াই শক্রকুলের\nঘোর পরাজয় আনতো বয়ে\nভাবতো যদি পালান যেতো\nচিল-শকুনের সংগী হয়ে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "অষ্টম অধ্যায়ঃ নবী করিম ﷺ এর জিহাদের বর্ণনা");
        this.map_var.put("arabic", "تَمضِـي الليـالي ولا يَـدرُونَ عِدَّتَـهَـا\nما لم تَكُـن مِن ليالِـي الأُشهُـرِ الحُـرُمِ");
        this.map_var.put("meaning", "১২৩। শঙ্কিত মন দিশেহারা\nএতোই ছিলো শক্র কাফের\nভুলে যেতো রাতের খবর\nসময় ছাড়া হারাম মাসের।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "অষ্টম অধ্যায়ঃ নবী করিম ﷺ এর জিহাদের বর্ণনা");
        this.map_var.put("arabic", "كأنَّمَـا الدِّيـنُ ضَيْـفٌ حَـلَّ سـاحَتَهُـم\nبـكُـلِّ قَـرْمٍ إلى لَـحـمِ العِــدَا قَـرِمِ");
        this.map_var.put("meaning", "১২৪। সেই বাহাদুর জংগী সেনার\nঅতিথ রূপে ছিলো এ দ্বীন\nবৈরী সেনার রক্ত লোভী\nছিলো যারা যুদ্ধকালীন।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "অষ্টম অধ্যায়ঃ নবী করিম ﷺ এর জিহাদের বর্ণনা");
        this.map_var.put("arabic", "يَجُـرُّ بحـرَ خميـسٍ فَـوقَ سـابِحَـةٍ\nيرمـي بمَـوجٍ مـن الأبطـالِ ملتَـطِـمِ");
        this.map_var.put("meaning", "১২৫ ৷ করতো তারা হামলা ভীষণ\nআরবি তাজী অশ্বে চড়ে\nসাগর বেলায় ঊর্মি যথা\nত্রুদ্ধ রোষে আছড়ে পড়ে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "অষ্টম অধ্যায়ঃ নবী করিম ﷺ এর জিহাদের বর্ণনা");
        this.map_var.put("arabic", "مِن كُـلِّ منـتَـدِبٍ للـه مُحـتَـسِــبٍ\nيَسطُـو بمُستَـأصِـلٍ للكُفـرِ مُصطَـلِـمِ");
        this.map_var.put("meaning", "১২৬। আত্মত্যাগী, পূণ্যকামী\nবীর মুজাহিদ মর্দে মু’মিন\nক্ষীপ্র বেগে আঘাত হেনে\nসব কুফরী করলো বিলীন।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "অষ্টম অধ্যায়ঃ নবী করিম ﷺ এর জিহাদের বর্ণনা");
        this.map_var.put("arabic", "حتى غَـدَتْ مِلَّـةُ الإسـلامِ وَهْيَ بـهـم\nمِن بَعـدِ غُربَتِـهَا مـوصولَـةَ الرَّحِـمِ");
        this.map_var.put("meaning", "১২৭। মিটলো দ্বীনের দৈন্যদশা\nপূর্ণ হলো হিম্মতে মন\nফিরলো সুদিন মিললো বহু\nসংগী সাথী বন্ধু-স্বজন।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "অষ্টম অধ্যায়ঃ নবী করিম ﷺ এর জিহাদের বর্ণনা");
        this.map_var.put("arabic", "مَكـفـولَـةً أبـداً منهـم بِـخَـيـرِ أَبٍ\nوخيـرِ بَعـلٍ فلـم تَـيْـتَـمْ ولم تَـئِـمِ");
        this.map_var.put("meaning", "১২৮। পতির ছায়ে পত্নী যেমন\nরয় নিরাপদ শঙ্কাহারা\nআমান হলো খোদার এ দ্বীন\nতাঁদের ছায়ে তেমনি ধারা।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "অষ্টম অধ্যায়ঃ নবী করিম ﷺ এর জিহাদের বর্ণনা");
        this.map_var.put("arabic", "هُمُ الجبـالُ فَسَـلْ عنهُـم مُصَـادِمَهُـم\nماذا لَقِـي منهـم فـي كُـلِّ مُصـطَـدَمِ");
        this.map_var.put("meaning", "১২৯। শত্রু সনে যুদ্ধকালে\nকেমন ছিলো অটল পাহাড়\nশুধাও রণ ভূমির কাছে\nপাবে অনেক সাক্ষী তাহার।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "অষ্টম অধ্যায়ঃ নবী করিম ﷺ এর জিহাদের বর্ণনা");
        this.map_var.put("arabic", "وَسَـلْ حُنَيْنـاً وَسَـلْ بَـدْرَاً وَسَلْ أُحُـدَا\nفُصـولُ حَتْـفٍ لَهم أدهـى مِنَ الـوَخَـمِ");
        this.map_var.put("meaning", "১৩০। বদর ওহুদ হুনায়েনের\nমাঠের কাছে শুধাও তুমি\nবলবে তা সব কাফির সেনার\nপ্লেগ-ভয়াল বধ্যভূমি।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "অষ্টম অধ্যায়ঃ নবী করিম ﷺ এর জিহাদের বর্ণনা");
        this.map_var.put("arabic", "المُصـدِرِي البِيضِ حُمـرَاً بعد ما وَرَدَتْ\nمِـنَ العِـدَا كُـلَّ مُـسْـوَدٍّ مِن الِّلـمَـمِ");
        this.map_var.put("meaning", "১৩১। হলো তাদের আক্রমণে\nশুভ্র শ্বেত সব তরোয়াল\nকৃষ্ণ-চিকুর তরুণ তাজা\nশত্রু সেনার রক্তে যে লাল।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "অষ্টম অধ্যায়ঃ নবী করিম ﷺ এর জিহাদের বর্ণনা");
        this.map_var.put("arabic", "والكـاتِبيـنَ بِسُمـرِ الخَـطِّ ما تَـرَكَـتْ\nأقلامُـهُـمْ حَـرْفَ جِسـمٍ غيرَ مُنعَجِـمِ");
        this.map_var.put("meaning", "১৩২ ৷ তাদের যতো পীত বরণ\nতীরের ফলা তীক্ষ্ণতর\nব্যূহে পশি বৈরিকুলের\nকরলো তনু জরজর।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "অষ্টম অধ্যায়ঃ নবী করিম ﷺ এর জিহাদের বর্ণনা");
        this.map_var.put("arabic", "شاكِي السـلاحِ لهم سِيمَـى تُمَيِّـزُهُـم\nوالـوَرْدُ يمتـازُ بالسِّيمَـى عَنِ السَّـلَـمِ");
        this.map_var.put("meaning", "১৩৩। কাফির থেকে ভিন্ন তাদের\nকরলো সজুদ চিহ্ন ভালের\nবাবুল কাঁটার মধ্যে যেমন\nভিন্ন শোভা লাল গোলাপের।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "অষ্টম অধ্যায়ঃ নবী করিম ﷺ এর জিহাদের বর্ণনা");
        this.map_var.put("arabic", "تُهـدِي إليـكَ ريـاحُ النَّصـرِ نَشْرَهُـمُ\nفتَحسِـبُ الزَّهـرَ في الأكمـامِ كُلَّ كَمِـي");
        this.map_var.put("meaning", "১৩৪। ছড়িয়ে যতো বিজয় খবর\nবের হলে-ই অভিযানে\nউতাল বায়ে ছড়ায় যথা\nগোলাপ সুবাস সর্বখানে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "অষ্টম অধ্যায়ঃ নবী করিম ﷺ এর জিহাদের বর্ণনা");
        this.map_var.put("arabic", "كأنَّهُـم في ظُهـورِ الخَيْـلِ نَـبْـتُ رُبـاً\nمِن شَــدَّةِ الحَـزْمِ لا مِن شدَّةِ الحُـزُمِ");
        this.map_var.put("meaning", "১৩৫। অশ্ব পিঠে থাকতো লেগে\nঅটল আসন নিটোল কায়ে\nতৃণ যেমন লেপটে থাকে\nশেকড় গেড়ে টিলার গায়ে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "অষ্টম অধ্যায়ঃ নবী করিম ﷺ এর জিহাদের বর্ণনা");
        this.map_var.put("arabic", "طـارَتْ قلـوبُ العِدَا مِن بأسِهِـم فَـرَقـاً\nفمـا تُفَـرِّقُ بـيـن البَـهْـمِ والبُـهَـمِ");
        this.map_var.put("meaning", "১৩৬। ভড়কে গেলো এমনি কাফির\nচড়তে দেখে ছাগল ছানা\nভয় পালাতো-ভাবতো মনে\nআসছে মু’মিন দিচ্ছে হানা।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "অষ্টম অধ্যায়ঃ নবী করিম ﷺ এর জিহাদের বর্ণনা");
        this.map_var.put("arabic", "ومَـن تَكُـن برسـولِ اللـهِ نُصـرَتُـهُ\nإن تَلْـقَـهُ الأُسْـدُ في آجامِـهَا تَـجِـمِ");
        this.map_var.put("meaning", "১৩৭। নবীর মদদ পেলো যারা\nদেখা হলে তাদের সনে\nযায় পালিয়ে সিংহরাজও\nজানের ভয়ে গভীর বনে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "অষ্টম অধ্যায়ঃ নবী করিম ﷺ এর জিহাদের বর্ণনা");
        this.map_var.put("arabic", "ولَن تَـرى مِـن وَلِيٍّ غيـرَ منتَـصِـرٍ\nبِـهِ ولا مِن عَـدُوٍّ غيـرَ مُـنـقَـصِـمِ");
        this.map_var.put("meaning", "১৩৮। এমন সাথী নেই নবীজীর\nকোনো মদদ পায়নি যে তার\nনেই অরি তাঁর এমন কোনো\nহয়নি ক্ষতি বরবাদী যার।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "অষ্টম অধ্যায়ঃ নবী করিম ﷺ এর জিহাদের বর্ণনা");
        this.map_var.put("arabic", "أَحَـلَّ أُمَّـتَـهُ فـي حِـرْزِ مِـلَّـتِــهِ\nكـالليْـثِ حَـلَّ مَـعَ الأشبـالِ فِي أَجَـمِ");
        this.map_var.put("meaning", "১৩৯ ৷ রাখলো দ্বীনের দুর্গ মাঝে\nনিরাপদে শিষ্যগণে\nসিংহ যথা নিরাপদে\nরাখে শাবক গভীর বনে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "অষ্টম অধ্যায়ঃ নবী করিম ﷺ এর জিহাদের বর্ণনা");
        this.map_var.put("arabic", "كَم جَـدَّلَـتْ كَـلِمَـاتُ اللـه مِن جَـدلٍ\nفيه وكـم خَصَـمَ البُـرهـانُ مِن خَصِـمِ");
        this.map_var.put("meaning", "১৪০। হারিয়ে দিলো দ্বন্দ্বে কুরআন\nবৈরীদেরে অসংখ্য বার\nকতোই হলো পরাভূত\nশত্রু খর যুক্তিতে তাঁর।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "অষ্টম অধ্যায়ঃ নবী করিম ﷺ এর জিহাদের বর্ণনা");
        this.map_var.put("arabic", "كفـاكَ بـالعلـمِ في الأُمِّـيِّ مُـعـجَـزَةً\nفي الجـاهـليـةِ والتأديـبَ في اليُـتُـمِ");
        this.map_var.put("meaning", "১৪১। এতীম অনাথ উম্মী আবার\nআঁধার ঢাকা আরব ভূমি\nকী মো’জেযা এরই মাঝে\nভাষা-কলার বাদশা তুমি।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "নবম\u200a অধ্যায়ঃ আল্লাহর\u200a সমীপে মাগফিরাত ও নবী ﷺ’র\u200a সমীপে সুপারিশ ভিক্ষা");
        this.map_var.put("arabic", "خَـدَمْـتُـهُ بمـديـحٍ أستَـقِـيـلِ بِـهِ\nذُنـوبَ عُمْر مَضَى في الشِّعـرِ والخِـدَمِ");
        this.map_var.put("meaning", "১৪২। পেয়ারা নবীর পাক কদমে\nপেশ করিলাম এ নযরান\nএই ওছিলায় গুনাহ খাতা\nমাফ করো মোর হে রাব্বানা।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "নবম\u200a অধ্যায়ঃ আল্লাহর\u200a সমীপে মাগফিরাত ও নবী ﷺ’র\u200a সমীপে সুপারিশ ভিক্ষা");
        this.map_var.put("arabic", "إِذ قَـلَّدَانِـيَ مـا تُخشَـى عـواقِـبُـهُ\nكأنني بِـهِـمَـا هَـدْيٌ مِـنَ النَّـعَـمِ");
        this.map_var.put("meaning", "১৪৩। কুরবানির ওই পশুর মতো\nগলায় রশি জবাই মাঠে\nচলছি, তবু উদাস বেভুল\nরইছি মজে বিশ্ব-হাটে");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "নবম\u200a অধ্যায়ঃ আল্লাহর\u200a সমীপে মাগফিরাত ও নবী ﷺ’র\u200a সমীপে সুপারিশ ভিক্ষা");
        this.map_var.put("arabic", "أَطَعـتُ غَيَّ الصِّبَـا في الحالَتَيْـنِ ومـا\nحَـصَـلـتُ إلاّ علـى الآثـامِ والنَّــدَمِ");
        this.map_var.put("meaning", "১88। মত্ত রলাম কাব্য কলায়\nসমাজ সেবার হট্টগোলে\nপাপের বোঝায় ন্যুব্জ এখন\nঅনুতাপে মরছি জ্বলে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "নবম\u200a অধ্যায়ঃ আল্লাহর\u200a সমীপে মাগফিরাত ও নবী ﷺ’র\u200a সমীপে সুপারিশ ভিক্ষা");
        this.map_var.put("arabic", "فيـا خَسَـارَةَ نَـفْـسٍ في تِجَـارَتِـهَـا\nلَم تَشتَـرِ الدِّيـنَ بالدنـيـا ولم تَـسُـمِ");
        this.map_var.put("meaning", "১৪৫। কতোই ক্ষতি হলো রে-মন\nদুনিয়াদারির মোহে পড়ি\nদুনিয়া বেচে কিনলে না দ্বীন\nকরলেও না দরাদরি।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "নবম\u200a অধ্যায়ঃ আল্লাহর\u200a সমীপে মাগফিরাত ও নবী ﷺ’র\u200a সমীপে সুপারিশ ভিক্ষা");
        this.map_var.put("arabic", "ومَـن يَبِـعْ آجِـلا منـه بـعـاجِـلِـهِ\nبِيـنْ لـه الغَـبْـنُ في بَيْـعٍ وفي سَـلَمِ");
        this.map_var.put("meaning", "১৪৬। ইহকালের লাভের আশায়\nবেচে যে সুখ পরকালের\nভাগ্যে তাহার আছে কেবল\nদহন জ্বালা পরিতাপের।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "নবম\u200a অধ্যায়ঃ আল্লাহর\u200a সমীপে মাগফিরাত ও নবী ﷺ’র\u200a সমীপে সুপারিশ ভিক্ষা");
        this.map_var.put("arabic", "إِنْ آتِ ذَنْبـاً فما عَهـدِي بمُنـتَـقِـضٍ\nمِنَ النَّـبِـيِّ ولا حَبـلِـي بمُـنـصَـرِمِ");
        this.map_var.put("meaning", "১৪৭। পাপ করেছি ঢের যদিও\nতবু আশা এ বুক জুড়ে\nদিবেন নাকো দয়াল নবী\nবাঁধন ছিড়ে তাড়িয়ে দূরে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "নবম\u200a অধ্যায়ঃ আল্লাহর\u200a সমীপে মাগফিরাত ও নবী ﷺ’র\u200a সমীপে সুপারিশ ভিক্ষা");
        this.map_var.put("arabic", "فـاِنَّ لـي ذِمَّـةً منـه بتَسـمِـيَـتِـي\nمُحـمَّـداً وهُـوَ أوفَـى الخلـقِ بالذِّمَـمِ");
        this.map_var.put("meaning", "১৪৮। নামটি আমার নবীর নামে\n’মুহাম্মাদ’ই রাখার ফলে\nশাফায়াতের ভরসা তাঁহার\nরাখছি পুষে বুকের তলে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "নবম\u200a অধ্যায়ঃ আল্লাহর\u200a সমীপে মাগফিরাত ও নবী ﷺ’র\u200a সমীপে সুপারিশ ভিক্ষা");
        this.map_var.put("arabic", "إِنْ لم يكُـن في مَعَـادِي آخِـذاً بِـيَـدِي\nفَـضْـلا وإِلاَّ فَـقُـلْ يـا زَلَّـةَ القَــدَمِ");
        this.map_var.put("meaning", "১৪৯। দয়াল নবীর পাক শাফায়াত\nসেদিন যদি না পাই আহা!\nধ্বংস ছাড়া ভাগ্যে তবে\nথাকবে না আর কোনই রাহা!");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "নবম\u200a অধ্যায়ঃ আল্লাহর\u200a সমীপে মাগফিরাত ও নবী ﷺ’র\u200a সমীপে সুপারিশ ভিক্ষা");
        this.map_var.put("arabic", "حاشـاهُ أنْ يَحْـرِمَ الرَّاجِـي مَكَـارِمَـهُ\nأو يَرجِـعَ الجـارُ منه غيرَ مُحـتَـرَمِ");
        this.map_var.put("meaning", "১৫০। তাঁর সমীপে মদদ মেগে\nহয়নি তো কেউ ব্যর্থ কখন\nহয়নি বিফল শরণ যেচে\nলভেছে তাঁর অভয় শরণ।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "নবম\u200a অধ্যায়ঃ আল্লাহর\u200a সমীপে মাগফিরাত ও নবী ﷺ’র\u200a সমীপে সুপারিশ ভিক্ষা");
        this.map_var.put("arabic", "ومُنـذُ أَلـزَمْـتُ أفكَـارِي مَـدَائِـحَـهُ\nوجَـدْتُـهُ لخَـلاصِـي خيـرَ مُلـتَـزِمِ");
        this.map_var.put("meaning", "১৫১। ভাবছি মনে তাঁর তারিফের\nকাব্য-কুসুম মাল্য গাঁথি\nএই হবে মোর রোজ হাশরে\nবিপদকালের শ্রেষ্ঠ সাথী।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "নবম\u200a অধ্যায়ঃ আল্লাহর\u200a সমীপে মাগফিরাত ও নবী ﷺ’র\u200a সমীপে সুপারিশ ভিক্ষা");
        this.map_var.put("arabic", "ولَن يَفُـوتَ الغِـنَـى منه يَـداً تَـرِبَـتْ\nاِنَّ الحَيَـا يُنْبِـتُ الأزهـارَ فـي الأَكَـمِ");
        this.map_var.put("meaning", "১৫২। দান যেন তাঁর সিন্ধু বারি\nকেউ ফেরে না রিক্ত হাতে\nবাদল যথা ফলায় ফসল\nনিম্ন ভূমে-ফুল টিলাতে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "নবম\u200a অধ্যায়ঃ আল্লাহর\u200a সমীপে মাগফিরাত ও নবী ﷺ’র\u200a সমীপে সুপারিশ ভিক্ষা");
        this.map_var.put("arabic", "ولَـم أُرِدْ زَهـرَةَ الدنيـا التي اقتَطَـفَـتْ\nيَـدَا زُهَـيْـرٍ بمـا أثـنَـى على هَـرِم");
        this.map_var.put("meaning", "১৫৩। সুনাম খ্যাতি পার্থিব লোভ\nএই কাসীদার নেই যে আমার\nছিলো যেমন আরব কবি\nজোহায়েরের কাব্য গাঁথার।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "দশম অধ্যায়ঃ মোনাজাত ও হাজত তলব");
        this.map_var.put("arabic", "يـا أكـرَمَ الخلقِ مـا لي مَن ألـوذُ بـه\nسِــوَاكَ عِندَ حُلـولِ الحـادِثِ العَـمِـمِ");
        this.map_var.put("meaning", "১৫৪। তুমি ছাড়া প্রিয় রসূল\nনেই কেহ আর এ সংসারে\nকঠোর কঠিন বিপদকালে\nশরণ নেবো যাঁহার দ্বারে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "দশম অধ্যায়ঃ মোনাজাত ও হাজত তলব");
        this.map_var.put("arabic", "ولَـن يَضِيقَ رســولَ اللهِ جاهُـكَ بـي\nإِذَا الكريـمُ تَجَـلَّـى باسـمِ مُنتَـقِــمِ");
        this.map_var.put("meaning", "১৫৫। শেষ বিচারে মোর সুপারিশ\nকরলে তুমি – মহামতি\nতোমার মহা উচ্চ শানের\nহবে না তায় কোনোই ক্ষতি।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "দশম অধ্যায়ঃ মোনাজাত ও হাজত তলব");
        this.map_var.put("arabic", "فإنَّ مِـنْ جُـودك الدُّنيَـا وضَـرَّتـهـا\nومِنْ عُلـومِـكَ عِلْـم اللَّـوْحِ والقـلـم");
        this.map_var.put("meaning", "১৫৬। কেননা যে দুই জাহানই\nফসল তোমার মহাদানের\n“লওহ” “কলম” জ্ঞান পেলো তো\nঅংশ থেকে তোমার জ্ঞানের।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "দশম অধ্যায়ঃ মোনাজাত ও হাজত তলব");
        this.map_var.put("arabic", "يا نَفْــسُ لا تَقنَطِـي مِن زَلَّةٍ عَظُمَـتْ\nاِنَّ الكَبَـائِـرَ في الغُـفـرَانِ كـالَّلـمَـمِ");
        this.map_var.put("meaning", "১৫৭। প্রাণ রে! তুই নিরাশ কেনে\nযদিও তোর পাপ বেশুমার\nতার চে' বড় খোদার ক্ষমা\nশেষ সীমানা নেই সে ক্ষমার।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "দশম অধ্যায়ঃ মোনাজাত ও হাজত তলব");
        this.map_var.put("arabic", "لعَـلَّ رَحمَـةَ رَبِّـي حينَ يَقـسِـمُـهَـا\nتَأتِي على حَسَـبِ العِصيَـانِ في القِسَـمِ");
        this.map_var.put("meaning", "১৫৮ ৷ এই তো আশা – হবে বিশাল\nযার যতো-ই বোঝা পাপের\nহিস্যা পাবে সে ততো-ই\nতোমার অসীম রহমাতের।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "দশম অধ্যায়ঃ মোনাজাত ও হাজত তলব");
        this.map_var.put("arabic", "يـا رَبِّ واجعَـلْ رجائِـي غيرَ مُنعَكِـسٍ\nلَدَيْـكَ واجعـلْ حِسَابِـي غيـرَ مُنخَـرِمِ");
        this.map_var.put("meaning", "১৫৯। হাজির তোমার দরবারে রব\nঅনেক আশা আরজু নিয়া\nকোরো না কো নিরাশ আমায়\nদিও না কো ভেঙে হিয়া।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "দশম অধ্যায়ঃ মোনাজাত ও হাজত তলব");
        this.map_var.put("arabic", "والطُـفْ بعَبـدِكَ في الـدَّارَيـنِ اِنَّ لَـهُ\nصَبـرَاً مَتَى تَدعُـهُ الأهــوالُ ينهَـزِمِ");
        this.map_var.put("meaning", "১৬০। দুই জাহানে এ দুর্বলে\nঢালো আশীষ প্রেম করুণার\nনয়তো বিভু হারিয়ে যাবে\nঘোর বিপদে ধৈর্য তাহার।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "দশম অধ্যায়ঃ মোনাজাত ও হাজত তলব");
        this.map_var.put("arabic", "وائـذَنْ لِسُحْـبِ صـلاةٍ منك دائِـمَـةٍ\nعلى النبِـيِّ بِمُنْـهَــلٍّ ومُـنـسَـجِـم");
        this.map_var.put("meaning", "১৬১। দরূদ পাকের মেঘমালাকে\nদাও গো হুকুম হে ‘জুলজালাল'\nনবীর পরে বিপুল ধারে\nবর্ষে যেন অনন্তকাল।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "দশম অধ্যায়ঃ মোনাজাত ও হাজত তলব");
        this.map_var.put("arabic", "والآلِ والصَّحـبِ ثُمَّ التَّـابِعِيـنَ فَـهُـمْ\nأهـلُ التُّقَـى والنَّقَـى والحِلْـمِ والكَـرَمِ");
        this.map_var.put("meaning", "১৬২। আল আসহাব তাবেয়ীনের\nওপর ঝরাও শান্তিধারা\nপরহেজগারী পবিত্রতা\nসর্বগুণে ধন্য যারা।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "দশম অধ্যায়ঃ মোনাজাত ও হাজত তলব");
        this.map_var.put("arabic", "ثُمَّ الرِّضَـا عَن أبـي بَكـرٍ وعَن عُمَـرَ\nوعَن عَـلِـيٍّ وعَن عثـمـانَ ذِي الكَرَمِ");
        this.map_var.put("meaning", "১৬৩। আবু বকর ওমর আলী\nওসমান-এ চার খলিফায়\nঅনন্তকাল সিক্ত করে\nরেখো তোমার আশীষ ধারায়।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "দশম অধ্যায়ঃ মোনাজাত ও হাজত তলব");
        this.map_var.put("arabic", "ما رَنَّحَـتْ عَذَبَـاتِ البَـانِ رَيـحُ صَبَـا\nوأَطـرَبَ العِيـسَ حادِي العِيـسِ بالنَّغَـمِ");
        this.map_var.put("meaning", "১৬৪। প্রভাত সমীর ’বান’ বিটপীর\nদুলিয়ে যাবে শাখ যতোকাল\nযত দিনই হুদী গেয়ে\nউট চালাবে উটের রাখাল\n\nততো দিনই প্রিয়নবী\nআর যতো তাঁর সংগী সাথী\nসবার ওপর ঝরাও তোমার\nআশীষ বারি দিন ও রাতি।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "দশম অধ্যায়ঃ মোনাজাত ও হাজত তলব");
        this.map_var.put("arabic", "فاغفر لنا شدها واغفر لقارئها\nسألتك الخير يا ذا الجود والكرم");
        this.map_var.put("meaning", "১৬৫। দয়াল ওগো! রচক পাঠক\nশ্রোতা যারা এই কাসীদার\nতাদের পরেও ঝরাও তোমার\nআশীষ ধারা প্রেম করুণার।");
        this.map_list.add(this.map_var);
    }

 
    public void _Corner_Radius(View view, String str, double d, double d2, double d3, double d4) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor(str));
        gradientDrawable.setCornerRadii(new float[]{(int) d, (int) d, (int) d2, (int) d2, (int) d3, (int) d3, (int) d4, (int) d4});
        view.setBackground(gradientDrawable);
    }

    private void _ColorsOnly() {
        if (this.data.getString("theme", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("theme6")) {
            this.colorPrimary = "#3F51B5";
            this.colorPrimaryDark = "#1A237E";
            this.ColorText = "#FFFFFF";
        } else if (this.data.getString("theme", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("theme5")) {
            this.colorPrimary = "#607D8B";
            this.colorPrimaryDark = "#37474F";
            this.ColorText = "#FFFFFF";
        } else if (this.data.getString("theme", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("theme4")) {
            this.colorPrimary = "#4CAF50";
            this.colorPrimaryDark = "#1B5E20";
            this.ColorText = "#FFFFFF";
        } else if (this.data.getString("theme", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("theme3")) {
            this.colorPrimary = "#424242";
            this.colorPrimaryDark = "#171717";
            this.ColorText = "#FFFFFF";
        } else if (this.data.getString("theme", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("theme2")) {
            this.colorPrimary = "#FFF3E0";
            this.colorPrimaryDark = "#FFE0B2";
            this.ColorText = "#000000";
        } else {
            this.colorPrimary = "#FFFFFF";
            this.colorPrimaryDark = "#E0E0E0";
            this.ColorText = "#000000";
        }
    }

    private void _Extra() {
        if (getIntent().getStringExtra("Title").equals("চল্লিশ হাদিস")) {
            this.listview_hadith.setVisibility(View.VISIBLE);
            this.listview_munazat.setVisibility(View.GONE);
            this.listview_manzil.setVisibility(View.GONE);
            this.listview_asmaul.setVisibility(View.GONE);
            this.listview_qasida.setVisibility(View.GONE);
            this.listview_parashmani.setVisibility(View.GONE);
            this.linear_for_arabic.setVisibility(View.GONE);
            this.imageview2.setVisibility(View.INVISIBLE);
            this.listview_ebooks.setVisibility(View.GONE);
            this.textview1.setText(getIntent().getStringExtra("Title"));
            _Hadith();
            this.listview_hadith.setAdapter((ListAdapter) new Listview_hadithAdapter(this.map_list));
            ((BaseAdapter) this.listview_hadith.getAdapter()).notifyDataSetChanged();
        }
        if (getIntent().getStringExtra("Title").equals("চল্লিশ মোনাজাত")) {
            this.listview_hadith.setVisibility(View.GONE);
            this.listview_munazat.setVisibility(View.VISIBLE);
            this.listview_manzil.setVisibility(View.GONE);
            this.listview_asmaul.setVisibility(View.GONE);
            this.listview_qasida.setVisibility(View.GONE);
            this.linear_for_arabic.setVisibility(View.GONE);
            this.imageview2.setVisibility(View.INVISIBLE);
            this.listview_ebooks.setVisibility(View.GONE);
            this.textview1.setText(getIntent().getStringExtra("Title"));
            _Munazath();
            this.listview_munazat.setAdapter((ListAdapter) new Listview_munazatAdapter(this.map_list));
            ((BaseAdapter) this.listview_munazat.getAdapter()).notifyDataSetChanged();
        }
        if (getIntent().getStringExtra("Title").equals("তেত্রিশ আয়াত")) {
            this.listview_hadith.setVisibility(View.GONE);
            this.listview_munazat.setVisibility(View.GONE);
            this.listview_manzil.setVisibility(View.VISIBLE);
            this.listview_asmaul.setVisibility(View.GONE);
            this.listview_qasida.setVisibility(View.GONE);
            this.listview_parashmani.setVisibility(View.GONE);
            this.linear_for_arabic.setVisibility(View.GONE);
            this.imageview2.setVisibility(View.VISIBLE);
            this.listview_ebooks.setVisibility(View.GONE);
            this.textview1.setText(getIntent().getStringExtra("Title"));
            _ThirtyThreeAyath();
            this.listview_manzil.setAdapter((ListAdapter) new Listview_manzilAdapter(this.map_list));
            ((BaseAdapter) this.listview_manzil.getAdapter()).notifyDataSetChanged();
        }
        if (getIntent().getStringExtra("Title").equals("মনজিল")) {
            this.listview_hadith.setVisibility(View.GONE);
            this.listview_munazat.setVisibility(View.GONE);
            this.listview_manzil.setVisibility(View.VISIBLE);
            this.listview_asmaul.setVisibility(View.GONE);
            this.listview_qasida.setVisibility(View.GONE);
            this.listview_parashmani.setVisibility(View.GONE);
            this.linear_for_arabic.setVisibility(View.GONE);
            this.imageview2.setVisibility(View.VISIBLE);
            this.listview_ebooks.setVisibility(View.GONE);
            this.textview1.setText(getIntent().getStringExtra("Title"));
            _Manzil();
            this.listview_manzil.setAdapter((ListAdapter) new Listview_manzilAdapter(this.map_list));
            ((BaseAdapter) this.listview_manzil.getAdapter()).notifyDataSetChanged();
        }
        if (getIntent().getStringExtra("Title").equals("আসমা-ই হুসনা")) {
            this.listview_hadith.setVisibility(View.GONE);
            this.listview_munazat.setVisibility(View.GONE);
            this.listview_manzil.setVisibility(View.GONE);
            this.listview_asmaul.setVisibility(View.VISIBLE);
            this.listview_qasida.setVisibility(View.GONE);
            this.listview_parashmani.setVisibility(View.GONE);
            this.linear_for_arabic.setVisibility(View.VISIBLE);
            this.imageview2.setVisibility(View.INVISIBLE);
            this.listview_ebooks.setVisibility(View.GONE);
            this.textview1.setText(getIntent().getStringExtra("Title"));
            _Asmaul_Hosnaa();
            this.listview_asmaul.setAdapter((ListAdapter) new Listview_asmaulAdapter(this.map_list));
            ((BaseAdapter) this.listview_asmaul.getAdapter()).notifyDataSetChanged();
        }
        if (getIntent().getStringExtra("Title").equals("আসমা-ই নবভী")) {
            this.listview_hadith.setVisibility(View.GONE);
            this.listview_munazat.setVisibility(View.GONE);
            this.listview_manzil.setVisibility(View.GONE);
            this.listview_asmaul.setVisibility(View.VISIBLE);
            this.listview_qasida.setVisibility(View.GONE);
            this.listview_parashmani.setVisibility(View.GONE);
            this.linear_for_arabic.setVisibility(View.VISIBLE);
            this.imageview2.setVisibility(View.INVISIBLE);
            this.listview_ebooks.setVisibility(View.GONE);
            this.textview1.setText(getIntent().getStringExtra("Title"));
            _Asmaun_Nababi();
            this.listview_asmaul.setAdapter((ListAdapter) new Listview_asmaulAdapter(this.map_list));
            ((BaseAdapter) this.listview_asmaul.getAdapter()).notifyDataSetChanged();
        }
        if (getIntent().getStringExtra("Title").equals("কাসীদা এ গাউসিয়া")) {
            this.listview_hadith.setVisibility(View.GONE);
            this.listview_munazat.setVisibility(View.GONE);
            this.listview_manzil.setVisibility(View.GONE);
            this.listview_asmaul.setVisibility(View.GONE);
            this.listview_qasida.setVisibility(View.VISIBLE);
            this.listview_parashmani.setVisibility(View.GONE);
            this.linear_for_arabic.setVisibility(View.GONE);
            this.imageview2.setVisibility(View.INVISIBLE);
            this.listview_ebooks.setVisibility(View.GONE);
            this.textview1.setText(getIntent().getStringExtra("Title"));
            _Kasidaye_Gawsiya();
            this.listview_qasida.setAdapter((ListAdapter) new Listview_qasidaAdapter(this.map_list));
            ((BaseAdapter) this.listview_qasida.getAdapter()).notifyDataSetChanged();
        }
        if (getIntent().getStringExtra("Title").equals("কাসীদা এ বুরদাহ")) {
            this.listview_hadith.setVisibility(View.GONE);
            this.listview_munazat.setVisibility(View.GONE);
            this.listview_manzil.setVisibility(View.GONE);
            this.listview_asmaul.setVisibility(View.GONE);
            this.listview_qasida.setVisibility(View.VISIBLE);
            this.listview_parashmani.setVisibility(View.GONE);
            this.linear_for_arabic.setVisibility(View.GONE);
            this.imageview2.setVisibility(View.VISIBLE);
            this.listview_ebooks.setVisibility(View.GONE);
            this.textview1.setText(getIntent().getStringExtra("Title"));
            _Qasidatul_Burdah();
            this.listview_qasida.setAdapter((ListAdapter) new Listview_qasidaAdapter(this.map_list));
            ((BaseAdapter) this.listview_qasida.getAdapter()).notifyDataSetChanged();
        }
        if (getIntent().getStringExtra("Title").equals("কাসীদা এ নু'মান")) {
            this.listview_hadith.setVisibility(View.GONE);
            this.listview_munazat.setVisibility(View.GONE);
            this.listview_manzil.setVisibility(View.GONE);
            this.listview_asmaul.setVisibility(View.GONE);
            this.listview_qasida.setVisibility(View.VISIBLE);
            this.listview_parashmani.setVisibility(View.GONE);
            this.linear_for_arabic.setVisibility(View.GONE);
            this.imageview2.setVisibility(View.INVISIBLE);
            this.listview_ebooks.setVisibility(View.GONE);
            this.textview1.setText(getIntent().getStringExtra("Title"));
            _Qasidatul_Numaan();
            this.listview_qasida.setAdapter((ListAdapter) new Listview_qasidaAdapter(this.map_list));
            ((BaseAdapter) this.listview_qasida.getAdapter()).notifyDataSetChanged();
        }
        if (getIntent().getStringExtra("Title").equals("নূর পরশমনি")) {
            this.listview_hadith.setVisibility(View.GONE);
            this.listview_munazat.setVisibility(View.GONE);
            this.listview_manzil.setVisibility(View.GONE);
            this.listview_asmaul.setVisibility(View.GONE);
            this.listview_qasida.setVisibility(View.GONE);
            this.listview_parashmani.setVisibility(View.VISIBLE);
            this.listview_ebooks.setVisibility(View.GONE);
            this.linear_for_arabic.setVisibility(View.GONE);
            this.imageview2.setVisibility(View.INVISIBLE);
            this.textview1.setText(getIntent().getStringExtra("Title"));
            _Nur_Parashmoni();
            this.listview_parashmani.setAdapter((ListAdapter) new Listview_parashmaniAdapter(this.map_list));
            ((BaseAdapter) this.listview_parashmani.getAdapter()).notifyDataSetChanged();
        }
        if (getIntent().getStringExtra("Title").equals("ইবুক")) {
            this.listview_hadith.setVisibility(View.GONE);
            this.listview_munazat.setVisibility(View.GONE);
            this.listview_manzil.setVisibility(View.GONE);
            this.listview_asmaul.setVisibility(View.GONE);
            this.listview_qasida.setVisibility(View.GONE);
            this.listview_parashmani.setVisibility(View.GONE);
            this.listview_ebooks.setVisibility(View.VISIBLE);
            this.linear_for_arabic.setVisibility(View.GONE);
            this.imageview2.setVisibility(View.INVISIBLE);
            this.textview1.setText(getIntent().getStringExtra("Name"));
            if (getIntent().getStringExtra("Name").equals("তাফসীরুল কুরআন")) {
                _PDF_Tafsir();
                this.listview_ebooks.setAdapter((ListAdapter) new Listview_ebooksAdapter(this.map_list));
                ((BaseAdapter) this.listview_ebooks.getAdapter()).notifyDataSetChanged();
            }
            if (getIntent().getStringExtra("Name").equals("হাদিস শরীফ")) {
                _PDF_Hadith();
                this.listview_ebooks.setAdapter((ListAdapter) new Listview_ebooksAdapter(this.map_list));
                ((BaseAdapter) this.listview_ebooks.getAdapter()).notifyDataSetChanged();
            }
            if (getIntent().getStringExtra("Name").equals("মাসায়েল ও ফিকাহ")) {
                _PDF_Fikha();
                this.listview_ebooks.setAdapter((ListAdapter) new Listview_ebooksAdapter(this.map_list));
                ((BaseAdapter) this.listview_ebooks.getAdapter()).notifyDataSetChanged();
            }
            if (getIntent().getStringExtra("Name").equals("আক্বিদাহ")) {
                _PDF_Akidah();
                this.listview_ebooks.setAdapter((ListAdapter) new Listview_ebooksAdapter(this.map_list));
                ((BaseAdapter) this.listview_ebooks.getAdapter()).notifyDataSetChanged();
            }
            if (getIntent().getStringExtra("Name").equals("নবীজীর মর্যাদা")) {
                _PDF_Nabijir_Marzada();
                this.listview_ebooks.setAdapter((ListAdapter) new Listview_ebooksAdapter(this.map_list));
                ((BaseAdapter) this.listview_ebooks.getAdapter()).notifyDataSetChanged();
            }
            if (getIntent().getStringExtra("Name").equals("মিলাদুন্নবী ﷺ")) {
                _PDF_Miladunnabi();
                this.listview_ebooks.setAdapter((ListAdapter) new Listview_ebooksAdapter(this.map_list));
                ((BaseAdapter) this.listview_ebooks.getAdapter()).notifyDataSetChanged();
            }
            if (getIntent().getStringExtra("Name").equals("শানে আওলিয়া")) {
                _PDF_Shane_Awliya();
                this.listview_ebooks.setAdapter((ListAdapter) new Listview_ebooksAdapter(this.map_list));
                ((BaseAdapter) this.listview_ebooks.getAdapter()).notifyDataSetChanged();
            }
            if (getIntent().getStringExtra("Name").equals("আহমদ ইয়ার খান নঈমী (রাহ.)")) {
                _PDF_Ahmed_Year_Khan();
                this.listview_ebooks.setAdapter((ListAdapter) new Listview_ebooksAdapter(this.map_list));
                ((BaseAdapter) this.listview_ebooks.getAdapter()).notifyDataSetChanged();
            }
            if (getIntent().getStringExtra("Name").equals("আল্লামা জালালুদ্দীন সুয়ূতী (রাহ.)")) {
                _PDF_Jalal_Uddin();
                this.listview_ebooks.setAdapter((ListAdapter) new Listview_ebooksAdapter(this.map_list));
                ((BaseAdapter) this.listview_ebooks.getAdapter()).notifyDataSetChanged();
            }
            if (getIntent().getStringExtra("Name").equals("অন্যান্য")) {
                _PDF_Onnanno();
                this.listview_ebooks.setAdapter((ListAdapter) new Listview_ebooksAdapter(this.map_list));
                ((BaseAdapter) this.listview_ebooks.getAdapter()).notifyDataSetChanged();
            }
        }
    }

    private void _Nur_Parashmoni() {
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "১");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নূর পরশমনি : ১নং দোয়া");
        this.map_var.put("arabic", "الحمد لله رب السموات ورب العالمين- وله الكبرياء في السموت والارض . وهو العزيز الحكيم. الحمد لله رب السموت ورب الأرض ورب العلَمين. وهو العظمة في السموت والأرض. وهو العزير الحكيم. لله الحمد رب  السموت والأرض و رب العلمين . وله النور في السموت والارض وهو العزيز الحكيم.");
        this.map_var.put("syllable", "উচ্চারণ : আলহামদু লিল্লাহি রাব্বিস সামাওয়াতি ওয়া রাব্বিল আলামীন, ওয়া লাহুল কিবরিয়াউ ফিসসামাওয়াতি ওয়াল আরদি ওয়া হুয়াল আযীযুল হাকীম। আলহামদু লিল্লাহি রাব্বিস সামাওয়াতি ওয়া রাব্বিল আরদি ওয়া রাব্বিল আলামিন। ওয়া হুয়াল আযমাতু ফিসসামাওয়াতি ওয়াল আরদি ওয়া হুয়াল আযীযুল হাকীম। লিল্লাহিল হামদু রাব্বিস সামাওয়াতি ওয়াল আরদি ওয়া রাব্বিল আলামীন। ওয়া লাহুননূরু ফিসসামাওয়াতি ওয়াল আরদি ওয়া হুয়াল আযীযুল হাকীম।");
        this.map_var.put("fazilath", "উপকারিতা : হযরত আনাস ইবনে মালেক (রাঃ) হইতে বর্ণিত আছে, একদিন নবী করীম (সাঃ) মদীনা শরীফের মসজিদে বসিয়া বলিয়াছেন, যে ব্যক্তি দুই দোআ নিয়মিত সহীহ উচ্চারণে একবার পাঠ করিবে, দয়াময় আল্লাহ তায়ালা তাহাকে মাতা-পিতার হক আদায় করার সমান নেকি দান করিবেন। অর্থাৎ, কেহ যদি নিজ পিতা-মাতার হক সঠিকভাবে আদায় করে তাহা হইলে সে যে সওয়াব পাইবে, উক্ত দোআ একবার ভক্তি-বিশ্বাস সহকারে পাঠ করিলে আল্লাহ তাআলা সেইরূপ সওয়াব দান করিবেন। মাতাপিতা সম্পর্কে রাসূল (সাঃ) অন্য একটি হাদীসে বলিয়াছেন, মানুষের বেহেশত পিতা-মাতার পায়ের নীচে অবস্থিত। অর্থাৎ, তাহাদের হক আদায় করিয়া তাহাদিগকে সন্তুষ্ট করিতে পারিলে বেহেশত সুনিশ্চিত, সুবহানাল্লাহ।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "২");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নূর পরশমনি : ২নং দোয়া");
        this.map_var.put("arabic", "اللهم يانور تنورت بالنور والنور . في نورك يانور . اللهم بارك عيبنا وارفع عنا بلاءنا يارؤف . لبيك وارحم لبيك وأعظم لبيك واكرم لبيك أن الله يبعث من في القبور. اللهم ارزقنا خير الدين مع القرب والإخلاص والإشتقامة بَلُطْفِكَ وصلى الله على خير خلقه محمد واله واصحابه أجمعين وسلم تسليما كثيرا كثيرا . برحمتك يا ارحم الراحمين .");
        this.map_var.put("syllable", "উচ্চারণ : আল্লাহুম্মা ইয়া নূরু তানাওয়ারতা বিননুরি ওয়াননুরু ফী নুরিকা ইয়া নুরু, আল্লাহুম্মা বারিক আলাইনা ওয়ারফা আন্না বালায়িনা ইয়া রাঊফু, লাব্বাইকা ওয়ারহাম লাব্বায়কা ওয়াযাম লাব্বায়কা ওয়া আকরাম লাব্বাইকা। আন্নাল্লাহা ইয়াবআসু মান ফিলকুবুরি, আল্লাহুম্মারযুকনা খায়রাদ্দীনে মাআল কুরবি ওয়াল এখলাসি ওয়াল এসতিকামাতি বিলুতফিকা ওয়া সাল্লাল্লাহু আলা খাইরি খালকিহী মুহাম্মাদিওঁ ওয়া আলিহী ওয়া আসহাবিহী আজমাঈন! ওয়া সাল্লামা তাসলিমান কাসিরান কাছিরা। বিরাহমাতিকা ইয়া আরহামার রাহিমীন।");
        this.map_var.put("fazilath", "উপকারিতা : একদিন রাসূল (সাঃ) মদীনার মসজিদে বসা ছিলেন। ইতিমধ্যে জিবরাঈল (আঃ) উপস্থিত হইয়া বলিলেন, হে আল্লাহর রাসূল, আল্লাহ তাআলা আপনাকে সালাম জানাইয়াছেন এবং সালামান্তে দুরূদ-তােহফা উপহার পাঠাইয়াছেন। তারপর বলিয়াছেন, এই দােআ আপনার উম্মতের জন্য প্রেরণ করা হইল। যাহা আপনার উম্মতদিগকে ক্ষমা করিবার কারণ বলিয়া নির্ধারিত করা হইয়াছে। যদি আপনার উম্মতদিগের কেহ সারা জীবনে তওবা না করিয়া থাকে আর তওবা করিয়া ভক্তি-বিশ্বাস সহকারে এ দোআ সব সময় পাঠ করে, সে সহস্র শহীদ, সিদ্দীক, আরশ, কুরসী এবং সাত আসমান-জমীন ও বেহেশতের সমান সওয়াব পাইবে। অর্থাৎ, ইহারা আজীবন যে পুণ্য সঞ্চয় করিয়াছে, আল্লাহ তাআলা এই দোয়ার বরকতে পাঠকারীর আমলনামায় অনুরূপ পুণ্য লিখিয়া দিবেন। সুবহানাল্লাহ! আর যদি কেহ এই দোয়া সমস্ত জীবনে একবার পাঠ করে অথবা লেখা দেখে, এমনকি অন্যের মুখে শুনে, তাহাতে সে হযরত নূহ, ইব্রাহীম, ইয়াকুব, মূসা ও ঈসা (আঃ)-এর মত পয়গম্বরদের সওয়াবের অধিকারী হইবে। শুধু ইহাই নহে, প্রধান চারি ফেরেশতা হযরত জিবরাঈল, মিকাঈল, ইসরাফিল এবং আজরাইল (আঃ)-এর সওয়াবের সমান সওয়াব তার আমলনামায় লেখা হবে। উপরন্তু হযরত ইউসুফ (আঃ) ও হযরত মুহাম্মদ মুস্তফা (সাঃ)-এর পরিমাণ সওয়াব তাহাকে এবং তাহার পিতামাতাকে নসীব করা হইবে। সুবহানাল্লাহ! আল্লাহ তাআলা সমস্ত কার্যের উপর ক্ষমতাবান। অতঃপর হযরত জিব্রাঈল (আঃ) পুনরায় বলিলেন, হে মুহাম্মদ (সাঃ)! আপনি জানিয়া রাখুন, যেই ঘরে এই দোআ লিখিয়া রাখা হবে সেই ঘর সহ উহার পার্শ্ববর্তী হাজার ঘর পর্যন্ত এই দোআর উসিলায় আল্লাহর বরকত আসিতে থাকিবে। উক্ত ঘরসমূহ অগ্নি হইতে নিরাপদে থাকবে এবং এই দোআ পাঠকারী জান্নাতুল ফেরদৌস আপনার প্রতিবেশী হিসাবে বসবাস করিবে এবং তাহার জন্য জান্নাতে এমন ঘর তৈয়ার করা হইয়াছে, যাহার নীচে আশি হাজার ঝরনা রহিয়াছে, যাহার প্রত্যেকটির উভয় তীরে অসংখ্য শারাবান তহুরার পরিপূর্ণ পেয়ালা সমূহ সাজানো রহিয়াছে, যাহা তিনি কেয়ামতের দিন আপনার উম্মতকে পান করাইবেন। আবার প্রত্যেক ঝরনার পাশে আশি হাজার করিয়া ফলের গাছ রহিয়াছে, যাহার প্রত্যেকটিতে আশি হাজার করিয়া ডাল-পালা রহিয়াছে, তাহার প্রতি ডালে কি পরিমাণ সুস্বাদু ফল রহিয়াছে তাহা একমাত্র আল্লাহ তাআলাই জানেন। হে মুহাম্মদ (সাঃ)! এই পবিত্র দোআ পাঠকারী যখন মৃত্যুমুখে পতিত হবে তখন আমি [জিব্রাইল আঃ] আরাে সহস্র ফেরেশতাকে সঙ্গে লইয়া কেয়ামত পর্যন্ত তাহার রুহের হেফাজত করিতে থাকিব। হে মুহাম্মদ (সাঃ)! যদি কোন মৃত ব্যক্তির কাফনের উপর এই দোআ লিখিয়া দেওয়া হয় তাহা হইলে এই দোআর বরকতের ঐ মৃতের কাছে মুনকার-নাকিরের সওয়াল জবাব সহজ হইয়া যায়। আর যে ব্যক্তি এই দোআ লিখিয়া নিজের সাথে রাখিবে সে দুনিয়ায় ঈমান-আমান ও সুখ-শান্তিতে বসবাস করিবে । কেয়ামতের দিন তাহার চেহারা পূর্ণিমার চাদের ন্যায় এমন উজ্জ্বল হইবে যে, হাশরের মাঠে লােকেরা আশ্চর্য হইয়া একে অপরকে প্রশ্ন করিতে থাকিবে, এই ব্যক্তি কি পয়গম্বর বা ওলীআল্লাহ? তখন গায়েব হইতে উত্তর আসিতে থাকিবে যে, ইনি মুহাম্মদ মুস্তফা (সাঃ)-এর উম্মত। অতএব, হে মুহাম্মদ (সাঃ)। আপনার একান্ত উচিত এই মহিমাময় পবিত্র দোআ নিকট ও দূরের প্রত্যেক শহর ও পাড়া-গ্রাম এমনকি প্রত্যেক ঘরে ঘরে পৌছাইয়া দেওয়া, যাহাতে আপনার উম্মতের প্রত্যেকটি লােক ইহা দ্বারা দুনিয়া ও আখেরাতে অশেষ লাভবান হইতে পারে। যে উহা জানিয়া অপরকে জানাতে কৃপণতা করিবে তাহার জন্য শাফাআত কবুল করা হবে না। এই দোয়ার ফজিলত আপনার উম্মতগণ রােগ হইতে মুক্তি পাইবে, তাহাদের উপর হইতে বালা ও দুশ্চিন্তা দূর হইবে, অত্যাচারীর অত্যাচার হইতে নিষ্কৃতি পাবে এবং যুদ্ধে জয়লাভ করবে, এমনকি তীর-বন্দুক তাহাদিগকে স্পর্শ করিতে পারিবে না এবং মুশকিল আসান হইয়া যাইবে। যদি কেউ সফরে বাহির হয়, এ দোয়ার ফযীলত নিরাপদে ফিরিয়া আসিবে এবং বাদশাহর নিকট গেলে বাদশাহ তাহার প্রতি অত্যধিক সন্তুষ্ট হবেন। এই দোয়া সর্বদা পড়লে আল্লাহর প্রিয় বান্দাগণ অন্তর্ভুক্ত হইবে। ইহার ফজিলত লিখিয়া শেষ করা যায় না।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৩");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নূর পরশমনি : ৩নং দোয়া");
        this.map_var.put("arabic", "اللهم انصرنا على كل عدو صغير كان أو كبير ذكر أنثى حر وعبد شاهد غایب شريف مسلما كافرا. لاتسلط علينا من لا يخافك. ويرحمنا يا الله يا أحد یا صمد بارب یا غفور یا شكور. برحمتك آغثنی یا من هو الا هو. يا لا اله الآ هو بسم الله مجرها ومرسها أن رب لغفور رحيم. وصلى الله على خير خلقهى محمد واله واصحابه أجمعين برحمتك يا أرحم الرحميم.");
        this.map_var.put("syllable", "উচ্চারণ : আল্লাহুম্মানসুরনা আ'লা কুল্লি আদুয়্যিন সাগীরিন কানা আও কাবীরিন যাকারিন ওয়া উনসা, হুররিন ওয়া আ'বদিন শাহিদিন ওয়া গায়িবিন শারীফিন, মুসলেমান কাফেরান, লা তুসাল্লিত আ'লাইনা মাল-লা ইয়াখাফুকা ওয়া ইয়ারহামনা ইয়া আল্লাহু ইয়া আহাদু ইয়া সামাদু ইয়া রাব্বি, ইয়া গাফুরু ইয়া শাকুরু, বিরাহমাতিকা আগিসনী ইয়া মান হুয়া ইল্লা হুয়া, ইয়া লা ইলাহা ইল্লা হুয়া, বিসমিল্লাহি মাজরেহা ওয়া মুরসাহা ইন্না রাব্বী লাগাফুরুর রাহীম। ওয়া সাল্লাল্লাহু আলা খায়রি খালকিহী মুহাম্মাদিওঁ ওয়া আলিহী ওয়া আসহাবিহী আজমাঈন। বিরাহমাতিকা ইয়া আরহামার রাহিমীন।");
        this.map_var.put("fazilath", "উপকারিতা : এই দোয়াটি দোয়ায়ে গলাবন্ধ নামে পরিচিত। দোয়াটি সর্বদা পড়িলে এবং লিখিয়া গলায় রাখিলে ছােট-বড়, নারী-পুরুষ, উপস্থিত-অনুপস্থিত, মুসলমান, কাফের-মুশরেক, উঁচু-নীচু সকল প্রকার শক্রর শত্রুতা হইতে হেফাযতে থাকিবে। এই দোআ পাঠ করলে ধর্ম যুদ্ধে জয়ী হইবে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৪");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নূর পরশমনি : ৪নং দোয়া");
        this.map_var.put("arabic", "یارجانی یا منائی با دوائی یا شفاىی یا كفائی قفي عنى یا غفور یا غفور ياغفور. اغفرلى خطيئتي يوم يبعثن -\nيا الله يا الله يا الله . يارحمن يارحمن يارحمن يا رحيم يا رحيم يا رحيم يارحيم. يا غفور يا غفور یا غفور - یا کریم یاکریم یاکریم . وصلى الله على خير خلقه ونور عرشه محمد واله وأصحابه أجمعين . برحمتك يا ارحم الراحمين .");
        this.map_var.put("syllable", "উচ্চারণ : ইয়া রাজাঈ ইয়া মানাঈ ইয়া দাওয়াঈ ইয়া শেফাঈ ইয়া কাফাঈ কাফফে আন্নী ইয়া গাফুরু ইয়া গাফুরু ইয়া গাফুরু, ইগফিরলী খাতীআ'তী ইয়াওমা ইয়াবআসুন। ইয়া আল্লাহু ইয়া আল্লাহু ইয়া আল্লাহু ইয়া রাহমানু ইয়া রাহমানু ইয়া রাহমানু ইয়া রাহীমু ইয়া রাহীমু ইয়া রাহীমু, ইয়া গাফুরু ইয়া গাফুরু ইয়া গাফুরু, ইয়া কারীমু ইয়া কারীমু ইয়া কারীমু ওয়া সাল্লাল্লাহু আলা খায়রি খালকিহী ওয়া নুরি আরশিহী মুহাম্মাদিওঁ ওয়া আলিহী ওয়া আসহাবিহী আজমাঈন, বিরাহমাতিকা ইয়া আরহামার রাহিমি।");
        this.map_var.put("fazilath", "উপকারিতা : আল্লাহ্ তাআলা জিব্রাঈল (আঃ)-এর মাধ্যমে নবী (সাঃ)-কে জানাইয়াছেন যে, আপনার উম্মতের মধ্যে যে কেহ এই দোআ ভক্তি-শ্রদ্ধা সহকারে পড়িয়া আল্লাহ পাকের কাছে যাহা চাহিবে আল্লাহ তাআলা এই দোয়ার বরকতে তাহা কবুল করিবেন। এই দোআ পাঠকারী গরিব থাকিলে ধনী হইয়া যাইবে। মূর্খ হইলে শিক্ষিত হইয়া যাইবে। অজ্ঞান থাকিলে জ্ঞানী হইবে, স্বাস্থ্যহীন থাকিলে স্বাস্থ্যবান হইবে । আর যদি কেহ এই দোআ বিশ্বাসের সহিত একশতবার পড়িয়া নিদ্রা যায়, ইনশাআল্লাহ সে হযরত মুহাম্মদ (সাঃ)-কে স্বপ্নে দেখিতে পাইবে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৫");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নূর পরশমনি : ৫নং দোয়া");
        this.map_var.put("arabic", "اللهم يا اله البشر يا عظيم الخطر ويا واسع المغفرة ويا عزيز المن ويا مالك يوم الدِين- بحق إياك نعبد واياك نستعين- برحمتك يا أرحم الراحمين- بسم الله الرحمن الرحيم يا إله العلمين ويا خبر الناصرين ويا غياث المستغثين . برحمتك يا ارحم الراحمين.");
        this.map_var.put("syllable", "উচ্চারণ : আল্লাহুম্মা ইয়া ইলাহাল বাশারি ইয়া আযীমাল খাতারি ওয়া ইয়া ওয়াসিয়াল মাগফিরাতি ওয়া ইয়া আযীয়াল মান্নি ওয়া ইয়া মালেকা ইয়াওমিদ্দীন। বিহাক্কি ইয়্যাকা না'বুদু ওয়া ইয়্যাকা নাস্তাঈন, বিরাহমাতিকা ইয়া আরহামার রহিমীন। বিসমিল্লাহির রাহমানির রাহীম। ইয়া ইলাহাল আলামীন, ওয়া ইয়া খাইরান নাসিরীনা ওয়া ইয়া গিয়াসাল মুসতাগিসীন, বিরাহমাতিকা ইয়া আরহামার রাহিমীন।");
        this.map_var.put("fazilath", "উপকারিতা : একদিন হযরত মুহাম্মদ (সাঃ) মসজিদের ভিতরে বসিয়া আল্লাহর এবাদতে মশগুল ছিলেন। এমন সময় শয়তান আসিয়া সেখানে উপস্থিত হইল। হযরত মুহাম্মদ (সাঃ) বলিলেন, হে পাপী বদখত। তুমি কোথা হইতে আসিয়াছ। ইবলিস বলিল, হে আল্লাহর রাসূল (সাঃ)! আমি তো পাপী, বদবখত নহে। আমার একটি দোআ জানা আছে যাহা পাঠ করিলে কেয়ামতে সুখময় বেহেশতে বাস করিব। ইহা শুনিয়া হযরত মুহাম্মদ (সাঃ) আশ্চর্য হইয়া চিন্তায় পড়িলেন। এমন সময় হযরত জিব্রাইল (আঃ) আসিয়া বলিলেন, হে আল্লাহর রাসূল (সাঃ)! শয়তান সত্য কথাই বলিতেছে। কিন্তু সে মরণের পূর্বে এই দোআ ভুলিয়া যাইবে এবং দোযখে বসবাস করিবে। কেহ এই দোয়া মনোযোগ সহকারে পাঠ করিলে নিশ্চয়ই সে বেহেশতবাসী হইবে। হে মুসলমান ভাইগণ! ইবলীসের মত শয়তান এই দোআ পাঠ করিয়া বেহেশতে যাওয়ার আশা রাখে। আমরা হযরত মুহাম্মদ (সাঃ)-এর উম্মত হইয়া সেই দোআর বরকতে বেহেশত লাভের সক্ষমতায় কি সন্দেহ পোষণ করতে পারি!");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৬");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নূর পরশমনি : ৬নং দোয়া");
        this.map_var.put("arabic", "الحمد لله على كل نعمته. الحمد لله على كل الائه-\nالحمد لله قبل كل حال- وصلى الله على خير خلقه محمد و اله واصحابة اجمعين- برحمتك يا ارحم الراحمين ۔");
        this.map_var.put("syllable", "উচ্চারণ : আলহামদু লিল্লাহি আলা কুল্লি নি'মাতিহী, আলহামদু লিল্লাহি আলা কুল্লি আ-লা-ইহী, আলহামদু লিল্লাহি কাবলা কুল্লি হালিন, ওয়া সাল্লাল্লাহু আলা খায়রি খালকিহী মুহাম্মাদিওঁ ওয়া আলিহী ওয়া আসহাবিহী আজমাঈন। বিরাহমাতিকা ইয়া আরহামার রাহিমীন।");
        this.map_var.put("fazilath", "উপকারিতা : এই দোয়ার ফজিলত সম্বন্ধে সাহাবীদের মধ্যে এখতেলাফ রহিয়াছে। আমীরুল মােমেনীন হযরত ওমর (রাঃ) বলেন, ব্যক্তি পরম ভক্তি-বিশ্বাসের সহিত এই দোআ পড়িবে, তাহার ছয় শত বৎসরের আদায় করা নামায ইহার বরকতে আল্লাহ তাআলার দরবারে কবুল হইয়া যাইবে। হযরত ওসমান (রাঃ) বলেন, সাত শত বৎসরের হযরত আলী (রাঃ) বলেন, এই দোআ পাঠকারীর একহাজার বৎসরের নামায কাযা হইয়া থাকিলে তাহাও এই দোয়ার বরকতে আল্লাহর দরবারে কবুল হইয়া যাইবে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৭");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নূর পরশমনি : ৭নং দোয়া");
        this.map_var.put("arabic", "الحمد لله الذى في السماء عرشه- الحمد لله الذى في الارض قدرته. الحمد لله الذى فى الجنة رويتة- الحمد لله الذى فى القبور قضاؤه- الحمد لله الذى فى البر سلطانه. الحمد لله الذى لاملجأء ولا منجاء من الله له الا اليه- لاحول ولا قوة الا بالله العلى العظيم- وصلى الله على خير خلقه محمد وآله وأصحابه أجمعين- برحمتك يا ارحم الراحمين . اللهم اجرني في مصيبتي واخلفنى خيرا منها.");
        this.map_var.put("syllable", "উচ্চারণ : আলহামদু লিল্লাহিল্লাযী ফিসসামায়ি আরশুহু আলহামদু লিল্লাহিল্লাযী ফিলআরদি কুদরাতুহু, আলহামদু লিল্লাহিল্লাযী ফিলজান্নাতি রুইয়াতুহু, আলহামদু লিল্লাহিল্লাযী ফিল কুবুরি কাযাউহু, আলহামদু লিল্লাহিল্লাযী ফিলবাররি সুলতানুহু, আলহামদু লিল্লাহিল্লাযী লা মালজায়া ওয়ালা মান জাআ মিনাল্লাহি ইল্লা ইলাইহি, লা হাওলা ওয়ালা কুওয়াতা ইল্লা বিল্লাহিল আলিয়্যিল আযীম, ওয়া সাল্লাল্লাহু আলা খায়রি খালকিহী মুহাম্মাদিওঁ ওয়া আলিহী ওয়া আসহাবিহী আজমাঈন, বিরাহমাতিকা ইয়া আরহামার রাহিমীন, আল্লাহুম্মা আজিরনী ফী মুসীবাতী ওয়াখলুফনী খাইরাম মিনহা।");
        this.map_var.put("fazilath", "উপকারিতা : নবী করীম (সাঃ) বলিয়াছেন, যদি এই দোআ কোন ব্যক্তি কবরস্থানে একবার পাঠ করে, তাহা হইলে ইহার ফযীলতে আল্লাহ পাক উক্ত কবরস্থানের মুরদাগণের বিশ বৎসর পর্যন্ত কবর আযাব মাফ করিয়া দেন। সুবহানাল্লাহু! মুসলমান ভাইগণ! সন্দেহ না করিয়া আপন দাদা-দাদী, নানা-নানী, শ্বশুর-শাশুড়ী, পিতা-মাতা, পুত্র-কন্যা, স্ত্রী এবং আত্মীয়-স্বজন যাহারা মরিয়া গিয়াছে তাহাদিগকে এই দোআ পাঠ করিয়া কঠিন কবর আযাব হইতে মুক্তি দিন। যদি কেহ পাক-সাফ অবস্থায় শুক্রবার দিবাগত রাত্রে পনরবার এই দোআটি পাঠ করে তবে সে হযরত মুহাম্মদ (সাঃ)-কে স্বপ্নে দেখিতে পাইবে। এইভাবে যদি কেহ বিশবার পাঠ করিয়া ঘুমায় তাহা হইলে আল্লাহ তাআলার নুর স্বপ্নে দেখিতে পাইবে এবং মৃত্যুর পর তাহার কবর নূরের আলােকে আলােকিত হইয়া যাইবে। ইহাতে সন্দেহ না করিয়া ভক্তি-বিশ্বাস সহকারে পাঠ করিয়া পরীক্ষা করিয়া দেখুন।");
        this.map_list.add(this.map_var);
    }

    private void _Munazath() {
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "১নং মোনাজাত");
        this.map_var.put("Arabic", "رَبَّنَا تَقَبَّلۡ مِنَّا ؕ اِنَّکَ اَنۡتَ السَّمِیۡعُ الۡعَلِیۡمُ ﴿۱۲۷﴾");
        this.map_var.put("Onubad", "‘হে আমাদের রব! আমাদের পক্ষ থেকে গ্রহণ করো। নিশ্চয় তুমিই শ্রোতা, জ্ঞাতা।");
        this.map_var.put("Ayath", "সূরা বাকারা: ১২৭");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "২নং মোনাজাত");
        this.map_var.put("Arabic", "رَبَّنَا وَ اجۡعَلۡنَا مُسۡلِمَیۡنِ لَکَ وَ مِنۡ ذُرِّیَّتِنَاۤ اُمَّۃً مُّسۡلِمَۃً لَّکَ ۪ وَ اَرِنَا مَنَاسِکَنَا وَ تُبۡ عَلَیۡنَا ۚ اِنَّکَ اَنۡتَ التَّوَّابُ الرَّحِیۡمُ ﴿۱۲۸﴾");
        this.map_var.put("Onubad", "'হে\u200a\u200a রব আমাদের! এবং আমাদেরকে\u200a তোমারই\u200a সামনে \u200a\u200a\u200a\u200a\u200aগর্দান \u200a\u200a\u200a\u200a\u200aঅবতনকারী \u200a\u200a\u200a\u200a\u200aকরো \u200a\u200a\u200a\u200a\u200aএবং \u200a\u200a\u200a\u200a\u200aআমাদের \u200aবংশধরদের\u200a \u200a\u200a\u200aমধ্য\u200a \u200a\u200a\u200aথেকে\u200a \u200a\u200a\u200aএকটা \u200a\u200a\u200aউম্মতকে\u200a \u200a\u200a\u200aতোমারই\u200a অনুগত করো। আর\u200a আমাদেরকে\u200a\u200a আমাদের ইবাদতের\u200a নিয়ম-কানুন \u200a\u200a\u200a\u200aবলে \u200a\u200a\u200a\u200aদাও \u200a\u200a\u200a\u200aএবং \u200a\u200a\u200a\u200aআমাদের \u200a\u200a\u200a\u200aপ্রতি \u200a\u200a\u200a\u200aস্বীয় \u200aঅনুগ্রহ\u200a\u200a সহকারে দৃষ্টিপাত\u200a করো।\u200a নিশ্চয় তুমিই\u200a অত্যন্ত তাওবা কবূলকারী, দয়ালু।");
        this.map_var.put("Ayath", "সূরা বাকারা: ১২৮");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "৩নং মোনাজাত");
        this.map_var.put("Arabic", "رَبَّنَاۤ اٰتِنَا فِی الدُّنۡیَا حَسَنَۃً وَّ فِی الۡاٰخِرَۃِ حَسَنَۃً وَّ قِنَا عَذَابَ النَّارِ ﴿۲۰۱﴾");
        this.map_var.put("Onubad", "‘হে আমাদের রব! আমাদেরকে দুনিয়ায় কল্যাণ দাও এবং আমাদেরকে\u200a আখিরাতে কল্যাণ দাও \u200aআর আমাদেরকে \u200a\u200aদোযখের আযাব থেকে রক্ষা করো।’");
        this.map_var.put("Ayath", "সূরা বাকারা: ২০১");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "৪নং মোনাজাত");
        this.map_var.put("Arabic", "رَبَّنَاۤ اَفۡرِغۡ عَلَیۡنَا صَبۡرًا وَّ ثَبِّتۡ اَقۡدَامَنَا وَ انۡصُرۡنَا عَلَی الۡقَوۡمِ الۡکٰفِرِیۡنَ ﴿۲۵۰﴾ؕ");
        this.map_var.put("Onubad", "‘হে আমাদের \u200aরব!\u200a \u200aআমাদের\u200a \u200aউপর\u200a \u200aধৈর্য\u200a \u200aঢেলে \u200aদাও \u200aএবং\u200a আমাদের\u200a \u200aপাগুলো \u200aঅবিচলিত\u200a \u200aরাখো \u200aআর \u200aকাফিরদের\u200a বিরুদ্ধে আমাদেরকে সাহায্য করো।’");
        this.map_var.put("Ayath", "সূরা বাকারা: ২৫০");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "৫নং মোনাজাত");
        this.map_var.put("Arabic", "رَبَّنَا لَا تُؤَاخِذۡنَاۤ اِنۡ نَّسِیۡنَاۤ اَوۡ اَخۡطَاۡنَا");
        this.map_var.put("Onubad", "হে আমাদের রব! আমাদেরকে পাকড়াও করো না যদি আমরা বিস্মৃত হই\u200a কিংবা \u200aভুল \u200aকরি।");
        this.map_var.put("Ayath", "সূরা বাকারা: ২৮৬");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "৬নং মোনাজাত");
        this.map_var.put("Arabic", "رَبَّنَا وَ لَا تَحۡمِلۡ عَلَیۡنَاۤ اِصۡرًا کَمَا حَمَلۡتَہٗ عَلَی الَّذِیۡنَ مِنۡ قَبۡلِنَا");
        this.map_var.put("Onubad", "'হে \u200aআমাদের\u200a \u200aরব! এবং উপর \u200aভারী বোঝা\u200a \u200a\u200a\u200aরেখোনা, যেমন তুমি আমাদের পূর্ববর্তীদের উপর রেখেছিলে।");
        this.map_var.put("Ayath", "সূরা বাকারা: ২৮৬");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "৭নং মোনাজাত");
        this.map_var.put("Arabic", "رَبَّنَا وَ لَا تُحَمِّلۡنَا مَا لَا طَاقَۃ َ  لَنَا بِہٖ ۚ وَ اعۡفُ عَنَّا ٝ وَ اغۡفِرۡ لَنَا ٝ وَ ارۡحَمۡنَا ٝ اَنۡتَ مَوۡلٰىنَا فَانۡصُرۡنَا عَلَ ی  الۡقَوۡمِ الۡکٰفِرِیۡنَ ﴿۲۸۶﴾");
        this.map_var.put("Onubad", "'হে\u200a \u200a\u200aআমাদের \u200a\u200aরব! \u200a\u200aএবং \u200a\u200aআমাদের\u200a উপর \u200aঐ \u200aবোঝা \u200aঅর্পণ \u200aকরো \u200aনা, \u200aযা \u200aবহন \u200aকরার \u200aশক্তি \u200aআমাদের \u200a\u200a\u200aনেই; \u200a\u200a\u200aআর \u200a\u200a\u200aআমাদের \u200a\u200a\u200aপাপ \u200a\u200a\u200aমোচন \u200a\u200a\u200aকরো, \u200aআমাদেরকে\u200a \u200a\u200aক্ষমা \u200a\u200aকরো \u200a\u200aএবং\u200a\u200a \u200a\u200aআমাদের\u200a \u200a\u200aউপর \u200a\u200aদয়া\u200a করো। \u200a\u200a\u200a\u200aতুমি \u200a\u200a\u200a\u200aআমাদের \u200a\u200a\u200a\u200aমুনিব। \u200a\u200a\u200a\u200aসুতরাং\u200a \u200a\u200a\u200a\u200aকাফিরদের\u200a বিরুদ্ধে আমাদেরকে সাহায্য করো।");
        this.map_var.put("Ayath", "সূরা বাকারা: ২৮৬");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "৮নং মোনাজাত");
        this.map_var.put("Arabic", "رَبَّنَا لَا تُزِغۡ قُلُوۡبَنَا بَعۡدَ اِذۡ ہَدَیۡتَنَا وَ ہَبۡ لَنَا مِنۡ لَّدُنۡکَ رَحۡمَۃً ۚ اِنَّکَ اَنۡتَ الۡوَہَّابُ ﴿۸﴾");
        this.map_var.put("Onubad", "'হে \u200aআমাদের \u200aরব! \u200aআমাদের \u200aঅন্তর \u200aবক্র\u200a \u200aকরো \u200aনা এরপর\u200a\u200a যে, তুমি আমাদেরকে\u200a হিদায়ত\u200a\u200a\u200aপ্রদান করেছো এবং \u200a\u200aআমাদেরকে \u200a\u200aতোমার\u200a \u200a\u200aনিকট \u200a\u200aথেকে \u200a\u200aরহমত\u200a \u200a\u200aদান করো। নিশ্চয় তুমি হও মহান দাতা।");
        this.map_var.put("Ayath", "সূরা আল ইমরান: ৮");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "৯নং মোনাজাত");
        this.map_var.put("Arabic", "رَبَّنَاۤ اِنَّکَ جَامِعُ النَّاسِ لِیَوۡمٍ لَّا رَیۡبَ فِیۡہِ ؕ اِنَّ اللّٰہَ لَا یُخۡلِفُ الۡمِیۡعَادَ ﴿۹﴾");
        this.map_var.put("Onubad", "হে রব\u200a\u200a আমাদের! নিঃসন্দেহে তুমি সমস্ত\u200a মানুষকে একত্রে\u200a সমাবেশকারী\u200a সেদিনের\u200a জন্য,\u200a যার মধ্যে কোন সন্দেহ নেই। নিঃসন্দেহে, আল্লাহ্\u200cর প্রতিশ্রুতি পরিবর্তিত হয় না।");
        this.map_var.put("Ayath", "সূরা আল ইমরান: ৯");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "১০নং মোনাজাত");
        this.map_var.put("Arabic", "رَبَّنَاۤ اِنَّنَاۤ اٰمَنَّا فَاغۡفِرۡ لَنَا ذُنُوۡبَنَا وَ قِنَا عَذَابَ النَّارِ ﴿ۚ۱۶﴾");
        this.map_var.put("Onubad", "‘হে রব আমাদের! আমরা ঈমান এনেছি, সুতরাং আমাদের গুনাহ ক্ষমা করো এবং  আ  মা দেরকে দোযখের শাস্তি থেকে রক্ষা করো।’");
        this.map_var.put("Ayath", "সূরা আল ইমরান: ১৬");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "১১নং মোনাজাত");
        this.map_var.put("Arabic", "رَبَّنَاۤ اٰمَنَّا بِمَاۤ اَنۡزَلۡتَ وَ اتَّبَعۡنَا الرَّسُوۡلَ فَاکۡتُبۡنَا مَعَ الشّٰہِدِیۡنَ ﴿۵۳﴾");
        this.map_var.put("Onubad", "'হে\u200a\u200a \u200aআমাদের \u200aরব! \u200aআমরা\u200a \u200aসেটার \u200aউপর\u200a \u200aঈমান\u200a\u200a এনেছি, \u200a\u200a\u200aযা \u200a\u200a\u200aতুমি\u200a \u200a\u200a\u200aঅবতারণ\u200a \u200a\u200a\u200aকরেছো \u200a\u200a\u200aএবং\u200a \u200a\u200a\u200aরসূলের\u200a\u200a অনুসারী \u200a\u200aহয়েছি।\u200a \u200a\u200aসুতরাং \u200a\u200aআমাদেরকে\u200a \u200a\u200aসত্যের \u200a\u200aপক্ষে সাক্ষ্য প্রদানকারীদের মধ্যে লিপিবদ্ধ করো।’");
        this.map_var.put("Ayath", "সূরা আল ইমরান: ৫৩");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "১২নং মোনাজাত");
        this.map_var.put("Arabic", "وَ مَا کَانَ قَوۡلَہُمۡ اِلَّاۤ اَنۡ قَالُوۡا رَبَّنَا اغۡفِرۡ لَنَا ذُنُوۡبَنَا وَ اِسۡرَافَنَا فِیۡۤ اَمۡرِنَا وَ ثَبِّتۡ اَقۡدَامَنَا وَ انۡصُرۡنَا عَلَی الۡقَوۡمِ الۡکٰفِرِیۡنَ ﴿۱۴۷﴾");
        this.map_var.put("Onubad", "‘হে\u200a \u200aআমাদের \u200aরব! \u200aক্ষমা\u200a\u200a \u200aকরো \u200aআমাদের\u200a \u200aগুনাহ্\u200c \u200aএবং\u200a\u200a যেসব \u200a\u200a\u200a\u200aসীমালংঘন \u200a\u200a\u200a\u200aআমরা \u200a\u200a\u200a\u200aআমাদের \u200a\u200a\u200a\u200aকাজের \u200a\u200a\u200a\u200aমধ্যে \u200aকরেছি \u200a\u200a\u200a\u200a\u200aআর\u200a \u200a\u200a\u200a\u200a\u200aআমাদের \u200a\u200a\u200a\u200a\u200aপথ \u200a\u200a\u200a\u200a\u200aঅবিচল \u200a\u200a\u200a\u200a\u200aকরো\u200a \u200a\u200a\u200a\u200a\u200aএবং আমাদেরকে \u200a\u200a\u200aএ \u200a\u200a\u200aকাফির \u200a\u200a\u200aসম্প্রদায়ের \u200a\u200a\u200aবিরুদ্ধে \u200a\u200a\u200aসাহায্য \u200aকরো।’");
        this.map_var.put("Ayath", "সূরা আল ইমরান: ১৪৭");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "১৩নং মোনাজাত");
        this.map_var.put("Arabic", "رَبَّنَا مَا خَلَقۡتَ ہٰذَا بَاطِلًا ۚ سُبۡحٰنَکَ فَقِنَا عَذَابَ النَّارِ ﴿۱۹۱﴾");
        this.map_var.put("Onubad", "হে আমাদের রব! তুমি \u200a\u200aএটা \u200a\u200aনিরর্থক \u200a\u200aসৃষ্টি \u200a\u200aকরোনি; \u200a\u200aপবিত্রতা \u200a\u200aতোমারই, \u200aসুতরাং আমাদেরকে দোযখের শাস্তি থেকে রক্ষা করো।");
        this.map_var.put("Ayath", "সূরা আল ইমরান: ১৯১");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "১৪নং মোনাজাত");
        this.map_var.put("Arabic", "رَبَّنَاۤ اِنَّکَ مَنۡ تُدۡخِلِ النَّارَ فَقَدۡ اَخۡزَیۡتَہٗ ؕ وَ مَا لِلظّٰلِمِیۡنَ مِنۡ اَنۡصَارٍ ﴿۱۹۲﴾");
        this.map_var.put("Onubad", "হে \u200aআমাদের \u200aরব! \u200aনিশ্চয় \u200aতুমি\u200a\u200a\u200a \u200aযাকে\u200a\u200a \u200aদোযখে নিয়ে যাবে,\u200a অবশ্যই তাকে তুমি\u200a\u200a লাঞ্ছনা দিয়েছো\u200a\u200a এবং অত্যাচারীদের কোন সাহায্যকারী নেই।");
        this.map_var.put("Ayath", "সূরা আল ইমরান: ১৯২");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "১৫নং মোনাজাত");
        this.map_var.put("Arabic", "رَبَّنَاۤ اِنَّن َا   س َمِعۡنَا مُنَادِیًا یُّنَادِیۡ لِلۡاِیۡمَانِ اَنۡ اٰمِنُوۡا بِرَبِّکُمۡ فَاٰمَنَّا ٭ۖ ");
        this.map_var.put("Onubad", "হে আমাদের\u200a রব! আমরা এক আহ্\u200cবানকারীকে (এরূপ \u200a\u200aআহ্\u200cবান \u200a\u200aকরতে)\u200a \u200a\u200aশুনেছি,\u200a\u200aযিনি \u200a\u200aঈমান আনার জন্য \u200a\u200a\u200a\u200aআহ্\u200cবান \u200a\u200a\u200a\u200aকরেন, ‘আপন\u200a\u200a\u200aরবের \u200aউপর ঈমান\u200a আনো।’ \u200aসুতরাং \u200aআমরা \u200aঈমান\u200a\u200a \u200aএনেছি।");
        this.map_var.put("Ayath", "সূরা আল ইমরান: ১৯৩");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "১৬নং মোনাজাত");
        this.map_var.put("Arabic", "رَبَّنَا فَاغۡفِرۡ لَنَا ذُنُوۡبَنَا وَ کَفِّرۡ عَنَّا سَیِّاٰتِنَا وَ تَوَفَّنَا مَعَ الۡاَبۡرَارِ ﴿۱۹۳﴾ۚ");
        this.map_var.put("Onubad", "হে\u200a\u200a \u200aআমাদের\u200a রব!\u200a \u200a\u200aসুতরাং \u200a\u200aআমাদের \u200a\u200aগুনাহ্\u200c \u200a\u200aক্ষমা\u200a \u200a\u200aকরে \u200a\u200aদাও \u200a\u200aএবং\u200a\u200a\u200a আমাদের\u200a \u200a\u200a\u200aমন্দ\u200a \u200a\u200a\u200aকাজগুলো\u200a \u200a\u200a\u200aনিশ্চিহু \u200a\u200a\u200aকরে \u200a\u200a\u200aদাও!\u200a \u200a\u200a\u200aআর আমাদের মৃত্যু নেক্\u200cকারদের সাথে করো।");
        this.map_var.put("Ayath", "সূরা আল ইমরান: ১৯৩");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "১৭নং মোনাজাত");
        this.map_var.put("Arabic", "رَبَّنَا وَ اٰتِنَا مَا وَعَدۡتَّنَا عَلٰی رُسُلِکَ وَ لَا تُخۡزِنَا یَوۡمَ الۡقِیٰمَۃِ ؕ اِنَّکَ لَا تُخۡلِفُ الۡمِیۡعَادَ ﴿۱۹۴﴾");
        this.map_var.put("Onubad", "হে \u200a\u200a\u200aরব \u200a\u200a\u200aআমাদের! এবং আমাদেরকে \u200a\u200a\u200aসেটা \u200aপ্রদান\u200a\u200a করো,\u200a\u200a যার ওয়াদা তুমি আমাদের সাথে\u200a\u200a\u200a আপন রসূলগণের \u200a\u200a\u200a\u200a\u200a\u200aমাধ্যমে করে ছো ; এবং আমাদেরকে ক্বিয়ামতের দিন অপমানিত করো না। নিঃসন্দেহে, তুমি ওয়াদা ভঙ্গ করো না।");
        this.map_var.put("Ayath", "সূরা আল ইমরান: ১৯৪");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "১৮নং মোনাজাত");
        this.map_var.put("Arabic", "\nرَبَّنَاۤ اٰمَنَّا فَاکۡتُبۡنَا مَعَ الشّٰہِدِیۡنَ ﴿۸۳﴾");
        this.map_var.put("Onubad", "হে \u200aরব \u200aআমাদের!\u200a \u200aআমরা\u200a\u200a \u200aঈমান\u200a \u200aএনেছি। সুতরাং আমাদেরকে সত্যের সাক্ষীগণের মধ্যে লিপিবদ্ধ করে নিন।’");
        this.map_var.put("Ayath", "সূরা - মায়িদা: ৮৩");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "১৯নং মোনাজাত");
        this.map_var.put("Arabic", "رَبَّنَاۤ اَنۡزِلۡ عَلَیۡنَا مَآئِدَۃً مِّنَ السَّمَآءِ تَکُوۡنُ لَنَا عِیۡدًا لِّاَوَّلِنَا وَ اٰخِرِنَا وَ اٰیَۃً مِّنۡکَ ۚ وَ ارۡزُقۡنَا وَ اَنۡتَ خَیۡرُ الرّٰزِقِیۡنَ ﴿۱۱۴﴾");
        this.map_var.put("Onubad", "হে \u200a\u200a\u200a\u200a\u200a\u200aরব! \u200a\u200a\u200a\u200a\u200a\u200aআমাদের \u200a\u200a\u200a\u200a\u200a\u200aউপর\u200a\u200a\u200a\u200aআকাশ \u200a\u200a\u200a\u200a\u200a\u200aথেকে \u200a\u200a\u200a\u200a\u200a\u200aএকটা \u200a‘খাদ্য-ভর্তি খাঞ্চা’\u200a অবতারণ করুন, যা\u200a\u200a\u200a আমাদের জন্য ঈদ \u200a\u200a\u200a\u200a\u200a(আনন্দ-উৎসব)\u200a \u200a\u200a\u200a\u200a\u200aহবে\u200a\u200a \u200a\u200a\u200a\u200a\u200aআমাদের\u200a \u200a\u200a\u200a\u200a\u200aপূর্ববর্তী\u200a \u200a\u200a\u200a\u200a\u200aও পরবর্তীদের\u200a\u200a জন্য এবং আপনার\u200a নিকট\u200a থেকে নিদর্শন;\u200a এবং আমাদেরকে রিয্\u200cক্ব\u200a\u200a দান করুন, আর আপনি\u200a\u200a  তো  \u200a  সর্বশ্রেষ্ঠ জীবিকদাতা।’");
        this.map_var.put("Ayath", "সূরা মায়িদা: ১১৪");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "২০নং মোনাজাত");
        this.map_var.put("Arabic", "رَبَّنَا ظَلَمۡنَاۤ اَنۡفُسَنَا ٜ وَ اِنۡ لَّمۡ تَغۡفِرۡ لَنَا وَ تَرۡحَمۡنَا لَنَکُوۡنَنَّ مِنَ الۡخٰسِرِیۡنَ ﴿۲۳﴾");
        this.map_var.put("Onubad", "‘হে \u200aআমাদের\u200a \u200aরব! আমরা\u200a \u200aনিজেদের\u200a \u200aপ্রতি \u200aঅন্যায় \u200aকরেছি’।\u200a \u200aসুতরাং\u200a \u200aযদি\u200a তুমি \u200aআমাদেরকে \u200aক্ষমা \u200aনা \u200aকরো \u200aএবং \u200aআমাদের \u200aপ্রতি \u200aদয়া \u200a\u200a\u200aনা \u200a\u200a\u200aকরো,\u200a \u200a\u200a\u200aতবে\u200a \u200a\u200a\u200aঅবশ্যই \u200a\u200a\u200aআমরা\u200a\u200a \u200a\u200a\u200aক্ষতিগ্রস্তদের অন্তর্ভুক্ত হবো’।");
        this.map_var.put("Ayath", "সূরা আ'রাফ: ২৩");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "২১নং মোনাজাত");
        this.map_var.put("Arabic", "رَبَّنَا لَا تَجۡعَلۡنَا مَعَ الۡقَوۡمِ الظّٰلِمِیۡنَ ﴿۴۷﴾");
        this.map_var.put("Onubad", "‘হে আমাদের\u200a রব! আমাদেরকে যালিমদের সঙ্গী করো না’।");
        this.map_var.put("Ayath", "সূরা আ'রাফ: ৪৭");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "২২নং মোনাজাত");
        this.map_var.put("Arabic", "رَبَّنَا افۡتَحۡ بَیۡنَنَا وَ بَیۡنَ قَوۡمِنَا بِالۡحَقِّ وَ اَنۡتَ خَیۡرُ الۡفٰتِحِیۡنَ ﴿۸۹﴾");
        this.map_var.put("Onubad", "হে\u200a\u200a \u200aআমাদের রব!\u200a\u200a আমাদের এবং আমাদের\u200a সম্প্রদায়ের\u200a\u200a মধ্যে ন্যায্য ফয়সালা করে দাও এবং তোমার ফয়সালাই সর্বাপেক্ষা উত্তম।");
        this.map_var.put("Ayath", "সূরা আ'রাফ: ৮৯");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "২৩নং মোনাজাত");
        this.map_var.put("Arabic", "رَبَّنَاۤ اَفۡرِغۡ عَلَیۡنَا صَبۡرًا وَّ تَوَفَّنَا مُسۡلِمِیۡنَ ﴿۱۲۶﴾");
        this.map_var.put("Onubad", "হে\u200a আমাদের\u200a রব!\u200a আমাদের উপর ধৈর্য ঢেলে দাও এবং\u200a আমাদেরকে মুসলমানরূপে উঠাও’।");
        this.map_var.put("Ayath", "সূরা আ'রাফ: ১২৬");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "২৪নং মোনাজাত");
        this.map_var.put("Arabic", "رَبَّنَا لَا تَجۡعَلۡنَا فِتۡنَۃً لِّلۡقَوۡمِ الظّٰلِمِیۡنَ ﴿ۙ۸۵﴾\nوَ نَجِّنَا بِرَحۡمَتِکَ مِنَ الۡقَوۡمِ الۡکٰفِرِیۡنَ ﴿۸۶﴾");
        this.map_var.put("Onubad", "হে\u200a আমাদের \u200aরব! আমাদেরকে অত্যাচারী লোকদের জন্য পরীক্ষার পাত্র করো না।\n\nএবং নিজ অনুগ্রহ করে আমাদেরকে কাফিরদের থেকে রক্ষা করো!");
        this.map_var.put("Ayath", "সূরা  ইউনুস: ৮৫ - ৮৬");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "২৫নং মোনাজাত");
        this.map_var.put("Arabic", "\nرَبَّنَاۤ اِنَّکَ تَعۡلَمُ مَا نُخۡفِیۡ وَ مَا نُعۡلِنُ ؕ وَ مَا یَخۡفٰی عَلَی اللّٰہِ مِنۡ شَیۡءٍ فِی الۡاَرۡضِ وَ لَا فِی السَّمَآءِ ﴿۳۸﴾");
        this.map_var.put("Onubad", "হে আমাদের রব! তুমি জানো যা আমরা গোপন করি এবং\u200a যা\u200a প্রকাশ\u200a\u200a করি\u200a\u200a এবং আল্লাহ্\u200cর\u200a\u200a নিকট কিছুই গোপন নেই যমীনে এবং না আসমানে।");
        this.map_var.put("Ayath", "সূরা ইবরাহীম: ৩৮");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "২৬নং মোনাজাত");
        this.map_var.put("Arabic", "رَبَّنَا وَ تَقَبَّلۡ دُعَآءِ ﴿۴۰﴾");
        this.map_var.put("Onubad", "হে\u200a\u200aআমাদের রব! এবং আমার প্রার্থনা কবুল করে নাও।");
        this.map_var.put("Ayath", "সূরা ইবরাহীম: ৪০");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "২৭নং মোনাজাত");
        this.map_var.put("Arabic", "رَبَّنَا اغۡفِرۡ لِیۡ وَ لِوَالِدَیَّ وَ لِلۡمُؤۡمِنِیۡنَ یَوۡمَ یَقُوۡمُ الۡحِسَابُ ﴿۴۱﴾");
        this.map_var.put("Onubad", "হে \u200a\u200a\u200aআমার\u200a\u200a \u200a\u200a\u200aরব! \u200a\u200a\u200aআমাকে \u200a\u200a\u200aক্ষমা \u200a\u200a\u200aকরো \u200a\u200a\u200aএবং আমার \u200a\u200aমাতা-পিতাকে\u200a \u200a\u200aও \u200a\u200aসমস্ত\u200a \u200a\u200aমুসলমানকে,\u200a \u200a\u200aযেদিন হিসাব ক্বায়েম হবে।");
        this.map_var.put("Ayath", "সূরা ইবরাহীম: ৪১");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "২৮নং মোনাজাত");
        this.map_var.put("Arabic", "رَبَّنَاۤ اٰتِنَا مِنۡ لَّدُنۡکَ رَحۡمَۃً وَّ ہَیِّیٴۡ لَنَا مِنۡ اَمۡرِنَا رَشَدًا ﴿۱۰﴾");
        this.map_var.put("Onubad", "‘হে আমাদের রব!\u200a আমাদেরকে তোমার নিকট থেকে\u200a \u200a\u200aঅনুগ্রহ\u200a \u200a\u200aদান\u200a \u200a\u200aকরো\u200a \u200a\u200aএবং\u200a \u200a\u200aআমাদের \u200a\u200aকাজকর্মে\u200a আমাদের জন্য সঠিক পথ প্রাপ্তির ব্যবস্থা করো।");
        this.map_var.put("Ayath", "সূরা কাহফ: ১০");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "২৯নং মোনাজাত");
        this.map_var.put("Arabic", "رَبَّنَاۤ اِنَّنَا نَخَافُ اَنۡ یَّفۡرُطَ عَلَیۡنَاۤ اَوۡ اَنۡ یَّطۡغٰی ﴿۴۵﴾");
        this.map_var.put("Onubad", "‘হে\u200a আমাদের\u200a রব! নিশ্চয়\u200a \u200aআমরা\u200a \u200aআশঙ্কা\u200a\u200a \u200aকরছি \u200aযে, \u200aসে \u200aআমাদের\u200a \u200aউপর সীমালঙ্ঘন\u200a \u200a\u200a\u200aকরবে\u200a \u200a\u200a\u200aঅথবা\u200a \u200a\u200a\u200aঅন্যায় \u200a\u200a\u200aআচরণ\u200a \u200a\u200a\u200aসহকারে অগ্রসর হবে’।");
        this.map_var.put("Ayath", "সূরা ত্বা- হা: ৪৫");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "৩০নং মোনাজাত");
        this.map_var.put("Arabic", "رَبُّنَا الَّذِیۡۤ اَعۡطٰی کُلَّ شَیۡءٍ خَلۡقَہٗ ثُمَّ ہَدٰی ﴿۵۰﴾");
        this.map_var.put("Onubad", "‘আমাদের \u200aরব \u200aতিনিই \u200aযিনি প্রত্যেক\u200aবস্তুকে\u200a সেটার\u200a\u200a\u200aউপযোগী\u200a\u200aআকৃতি\u200a\u200a\u200aপ্রদান \u200a\u200a\u200a\u200aকরেছেন\u200a অতঃপর পথপ্রদর্শন করেছেন’।");
        this.map_var.put("Ayath", "সূরা ত্বা-হা: ৫০");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "৩১নং মোনাজাত");
        this.map_var.put("Arabic", "رَبَّنَاۤ اٰمَنَّا فَاغۡفِرۡ لَنَا وَ ارۡحَمۡنَا وَ اَنۡتَ خَیۡرُ الرّٰحِمِیۡنَ ﴿۱۰۹﴾ۚۖ ");
        this.map_var.put("Onubad", "‘হে \u200a\u200a\u200aআমাদের\u200a \u200a\u200a\u200aরব! \u200a\u200a\u200aআমরা \u200a\u200a\u200aঈমান\u200a \u200a\u200a\u200aএনেছি। সুতরাং আমাদেরকে ক্ষমা\u200a করো\u200a\u200a\u200a এবং আমাদের উপর\u200a দয়া করো। আর তুমি সর্বাপেক্ষা অধিক দয়ালু।");
        this.map_var.put("Ayath", "সূরা মু'মিনুন: ১০৯");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "৩২নং মোনাজাত");
        this.map_var.put("Arabic", "رَبَّنَا اصۡرِفۡ عَنَّا عَذَابَ جَہَنَّمَ ٭ۖ اِنَّ عَذَابَہَا کَانَ غَرَامًا ﴿٭ۖ۶۵﴾");
        this.map_var.put("Onubad", "‘হে আমাদের\u200a \u200a\u200a\u200aরব! \u200a\u200a\u200aআমাদের \u200a\u200a\u200aদিকে \u200a\u200a\u200aথেকে\u200a \u200a\u200a\u200aফিরিয়ে \u200a\u200a\u200aদিন জাহান্নামের \u200aশাস্তিকে; \u200aনিশ্চয় \u200aসেটার\u200a \u200aশাস্তি\u200a \u200aহচ্ছে \u200aগলার শৃঙ্খল’।");
        this.map_var.put("Ayath", "সূরা ফুরকান : ৬৫");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "৩৩নং মোনাজাত");
        this.map_var.put("Arabic", "رَبَّنَا ہَبۡ لَنَا مِنۡ اَزۡوَاجِنَا وَ ذُرِّیّٰتِنَا قُرَّۃَ اَعۡیُنٍ وَّ اجۡعَلۡنَا لِلۡمُتَّقِیۡنَ اِمَامًا ﴿۷۴﴾");
        this.map_var.put("Onubad", "‘হে\u200a \u200a\u200aআমাদের\u200a \u200a\u200aরব! আমাদেরকে\u200a দান \u200a\u200a\u200a\u200a\u200a\u200aকরো- আমাদের\u200a\u200a\u200a\u200aস্ত্রীগণ \u200aএবং আমাদের \u200aসন্তান- সন্ততি থেকে \u200aচক্ষুসমূহের\u200a \u200aশান্তি\u200a\u200a \u200aএবং আমাদেরকে পরহেয্\u200cগারদের আদর্শ করুন!");
        this.map_var.put("Ayath", "সূরা ফুরকান: ৭৪");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "৩৪নং মোনাজাত");
        this.map_var.put("Arabic", "رَبَّنَا لَغَفُوۡرٌ شَکُوۡرُۨ ﴿ۙ۳۴﴾");
        this.map_var.put("Onubad", "আমাদের রব ক্ষমাশীল, মূল্যায়নকারী।");
        this.map_var.put("Ayath", "সূরা-ফতির: ৩৪");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "৩৫নং মোনাজাত");
        this.map_var.put("Arabic", "رَبَّنَا وَسِعۡتَ کُلَّ شَیۡءٍ رَّحۡمَۃً وَّ عِلۡمًا فَاغۡفِرۡ لِلَّذِیۡنَ تَابُوۡا وَ اتَّبَعُوۡا سَبِیۡلَکَ وَ قِہِمۡ عَذَابَ الۡجَحِیۡمِ ﴿۷﴾");
        this.map_var.put("Onubad", "‘হে \u200aআমাদের\u200a \u200a\u200a\u200aরব!\u200a\u200a \u200a\u200a\u200aতোমার \u200a\u200a\u200aদয়া \u200a\u200a\u200aও\u200a \u200a\u200a\u200aজ্ঞান \u200a\u200a\u200aসবকি ছু কেই\u200a\u200a পরিবেষ্টিত\u200a \u200a\u200a\u200aকরে \u200a\u200a\u200aরেখেছে।\u200a\u200aসুতরাং তাদেরকে\u200a\u200aক্ষমা করো, যারা তাওবা করেছে এবং তোমার\u200a পথ অনুসরণ করেছে\u200a\u200aএবং তাদেরকে দোযখের\u200a \u200a\u200aশাস্তি\u200a \u200a\u200aথেকে \u200a\u200aরক্ষা করে নাও।");
        this.map_var.put("Ayath", "সূরা মু'মিন/গাফির: ০৭");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "৩৬নং মোনাজাত");
        this.map_var.put("Arabic", "رَبَّنَا وَ اَدۡخِلۡہُمۡ جَنّٰتِ عَدۡنِۣ الَّتِیۡ وَعَدۡتَّہُمۡ وَ مَنۡ صَلَحَ مِنۡ اٰبَآئِہِمۡ وَ اَزۡوَاجِہِمۡ وَ ذُرِّیّٰتِہِمۡ ؕ اِنَّکَ اَنۡتَ الۡعَزِیۡزُ الۡحَکِیۡمُ ۙ﴿۸﴾\n\nوَ قِہِمُ السَّیِّاٰتِ ؕ وَ مَنۡ تَقِ السَّیِّاٰتِ یَوۡمَئِذٍ فَقَدۡ رَحِمۡتَہٗ ؕ وَ ذٰلِکَ ہُوَ الۡفَوۡزُ الۡعَظِیۡمُ ﴿۹﴾");
        this.map_var.put("Onubad", "হে আমাদের\u200a\u200a\u200aরব! এবং\u200a\u200aতাদেরকে \u200a\u200aবসবাসের বাগানসমূহে \u200a\u200aপ্রবেশ \u200a\u200aকরাও \u200a\u200aযেগুলোর \u200a\u200aপ্রতিশ্রুতি তুমি \u200aতাদেরকে \u200aদিয়েছো \u200aএবং তাদের পিতৃপুরুষগণ, স্ত্রীগণ এবং সন্তানগণের\u200a মধ্যে\u200a যারা \u200a\u200a\u200a\u200a\u200a\u200a\u200a\u200a\u200aসৎকর্মপরায়ণ, তাদেরকেও। নিশ্চয় তুমিই সম্মান ও প্রজ্ঞাময়;\n\nএবং \u200aতাদেরকে \u200aপাপসমূহের \u200aকুফল \u200aথেকে \u200aরক্ষা \u200aকরো।\u200a\u200a \u200aএবং \u200aযাকে\u200a\u200a \u200aতুমি\u200a \u200aওই \u200aদিন \u200aপাপসমূহের \u200aকুফল থেকে রক্ষা করবে, তবে নিঃসন্দেহে তুমি তার প্রতি দয়া করেছো এবং এটাই মহা সাফল্য’।");
        this.map_var.put("Ayath", "সূরা মু'মিন/গাফির: ৮ & ৯");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "৩৭নং মোনাজাত");
        this.map_var.put("Arabic", "رَبَّنَا اغۡفِرۡ لَنَا وَ لِاِخۡوَانِنَا الَّذِیۡنَ سَبَقُوۡنَا بِالۡاِیۡمَانِ وَ لَا تَجۡعَلۡ فِیۡ قُلُوۡبِنَا غِلًّا لِّلَّذِیۡنَ اٰمَنُوۡا رَبَّنَاۤ اِنَّکَ رَءُوۡفٌ رَّحِیۡمٌ ﴿۱۰﴾");
        this.map_var.put("Onubad", "এবং ওই সব লোক, যারা তাদের পরে এসেছে তারা আরয করে, 'হে \u200a\u200aআমাদের \u200a\u200a\u200a\u200a\u200aরব! আমাদের \u200aভাইদেরকেও, যারা আমাদের পূর্বে ঈমান এনেছে\u200a আর আমাদের\u200a অন্তরে ঈমানদারদের\u200a\u200a\u200aদিক থেকে হিংসা-বিদ্বেষ রেখো না! হে আমাদের রব! নিশ্চয় তুমিই অতি দয়ার্দ্র, দয়াময়।");
        this.map_var.put("Ayath", "সূরা হাশর: ১০");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "৩৮নং মোনাজাত");
        this.map_var.put("Arabic", "رَبَّنَا عَلَیۡکَ تَوَکَّلۡنَا وَ اِلَیۡکَ اَنَبۡنَا وَ اِلَیۡکَ الۡمَصِیۡرُ ﴿۴﴾");
        this.map_var.put("Onubad", "'হে আমাদের\u200a রব!\u200a আমরা তোমারই উপর নির্ভর \u200aকরেছি \u200aআর\u200a \u200aতোমারই\u200a \u200aপ্রতি\u200a\u200a \u200aপ্রত্যাবর্তন \u200aকরেছি এবং প্রত্যাবর্তন তো তোমার প্রতিই।");
        this.map_var.put("Ayath", "সূরা মুমতাহানা: ০৪");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "৩৯নং মোনাজাত");
        this.map_var.put("Arabic", "رَبَّنَا لَا تَجۡعَلۡنَا فِتۡنَۃً لِّلَّذِیۡنَ کَفَرُوۡا وَ اغۡفِرۡ لَنَا رَبَّنَا ۚ اِنَّکَ اَنۡتَ الۡعَزِیۡزُ الۡحَکِیۡمُ ﴿۵﴾");
        this.map_var.put("Onubad", "‘হে আমাদের রব! আমাদেরকে\u200a \u200a\u200a\u200a\u200aকাফিরদের পরীক্ষার \u200a\u200aমধ্যে \u200a\u200aনিক্ষেপ \u200a\u200aকরো \u200a\u200aনা! \u200a\u200aএবং \u200a\u200aআমাদেরকে \u200aক্ষমা\u200a করো!\u200a\u200a হে আমাদের রব!\u200a\u200a নিশ্চয়\u200a\u200a তুমিই সম্মান ও\u200a প্রজ্ঞাময়’।");
        this.map_var.put("Ayath", "সূরা মুমতাহানা: ০৫");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "৪০নং মোনাজাত");
        this.map_var.put("Arabic", "رَبَّنَاۤ اَتۡمِمۡ لَنَا نُوۡرَنَا وَ اغۡفِرۡ لَنَا ۚ اِنَّکَ عَلٰی کُلِّ شَیۡءٍ قَدِیۡرٌ ﴿۸﴾");
        this.map_var.put("Onubad", "‘হে \u200aআমাদের \u200aরব!\u200a আমাদের\u200a\u200a \u200a\u200aজন্য \u200a\u200aআমাদের \u200a\u200aনূরকে\u200a\u200a \u200a\u200aপরিপূর্ণ \u200a\u200aকরে \u200a\u200aদাও এবং আমাদেরকে\u200a ক্ষমা করো। নিশ্চয় তোমার\u200a\u200a প্রত্যেক কিছুর উপর তা রয়েছে।");
        this.map_var.put("Ayath", "সূরা তাহরিম: ০৮");
        this.map_list.add(this.map_var);
    }

    private void _Hadith() {
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "১নং হাদিস");
        this.map_var.put("Heading", "প্রতিটি কাজ তার নিয়্যতের উপর নির্ভরশীল");
        this.map_var.put("Arabic", "عَنْ عُمَرَ بْنِ الْخَطَّابِ رضِيَ اللَّهُ عَنْهُ قَالَ: سَمِعْتُ رَسُولَ اللَّهِ ﷺ يَقُولُ: إنَّمَا الْأَعْمَالُ بِالنِّيَّاتِ، وَإِنَّمَا لِكُلِّ امْرِئٍ مَا نَوَى، فَمَنْ كَانَتْ هِجْرَتُهُ إلَى اللَّهِ وَرَسُولِهِ فَهِجْرَتُهُ إلَى اللَّهِ وَرَسُولِهِ، وَمَنْ كَانَتْ هِجْرَتُهُ لِدُنْيَا يُصِيبُهَا أَوْ امْرَأَةٍ يَنْكِحُهَا فَهِجْرَتُهُ إلَى مَا هَاجَرَ إلَيْهِ- (متفق عليه)");
        this.map_var.put("Syllable", "উচ্চারণ : আন উমারাব নিল খাত্তাব রাদ্বিয়াল্লাহু আনহু ক্বালা: সামি’তু রাসূলাল্লাহি সাল্লাল্লাহু আলাইহি ওয়াসাল্লামা ইয়াকুল: ইন্নামাল আ‘মালু বিননিয়্যাতি, ওয়া ইন্নামা লিকুল্লিম রিয়িন মা নাওয়া, ফামান কানাত হিযরাতুহু ইলাল্লাহি ওয়া রাসুলিহি ফা’হিযরাতুহু ইলাল্লাহি ওয়া রাসুলিহি, ওয়ামান কানাত হিজরাতুহু লিদুনইয়া ইউছিবুহা আও ইমরাআতিন ইয়ানকিহুহা ফাহিজরাতুহু ইলা মা হাজারা ইলাইহি (মুত্তাফাকুন আলাইহি)।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত উমর বিন খাত্তাব রাদ্বিয়াল্লাহু আনহু থেকে বর্ণিত, তিনি বলেন, আমি নবী সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম কে বলতে শুনেছি, প্রতিটি কাজ নিয়্যতের উপর নির্ভরশীল। নিশ্চয়ই প্রতিটি ব্যক্তির জন্য এটাই নির্ভর করে যা সে নিয়্যত করেছে এবং যে ব্যক্তি আল্লাহ ও তাঁর রাসূলের দিকে হিজরত করবে তার হিজরত আল্লাহ ও তাঁর রাসুলের দিকে হিজরত হিসেবেই গণ্য হবে। আর যে ব্যক্তি হিজরত করবে দুনিয়া অর্জন করা অথবা কোন মহিলাকে বিবাহ করার উদ্দেশ্যে, তার হিজরত সে হিসেবেই গণ্য হবে, যার উদ্দেশ্যে সে হিজরত করেছে। \nনোটঃ হিজরত শব্দের অর্থ দেশ বা জন্মভূমি ত্যাগ করা।");
        this.map_var.put("References", "১.\tসহিহ বোখারী: অনুচ্ছেদ: কিতাব, ১/৩০ হাদিস নং ৫৪, সহিহ মুসলিম: অনুচ্ছেদ: ইমারাহ ৩/১৫১৫ হা: ১৯০৭, সুনানে তিরমিজি: অনুচ্ছেদ: ফাযায়েল ও জিহাদ ৪/১৭৯ হা: ১৬৪৭");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "২নং হাদিস");
        this.map_var.put("Heading", "ইসলামের ভিত্তি পাঁচটি");
        this.map_var.put("Arabic", "عَنْ \u200f \u200fابْنِ عُمَرَ \u200fرَضِيَ اللَّهُ عَنْهُ \u200f \u200fقَالَ قَالَ رَسُولُ اللَّهِ \u200f \u200fﷺ \u200f \u200fبُنِيَ الْإِسْلَامُ عَلَى خَمْسٍ شَهَادَةِ أَنْ لَا إِلَهَ إِلَّا اللَّهُ وَأَنَّ \u200fمُحَمَّدًا رَسُولُ اللَّهِ وَإِقَامِ الصَّلَاةِ وَإِيتَاءِ الزَّكَاةِ وَالْحَجِّ وَصَوْمِ رَمَضَانَ- (متفق عليه)");
        this.map_var.put("Syllable", "উচ্চারণ : আন ইবনে ওমারা রাদ্বিয়াল্লাহু আনহু ক্বালা, ক্বালা রাসুলুল্লাহি  সাল্লাল্লাহু আলাইহি ওয়াসাল্লামা: বুনিয়াল ইসলামু আলা খামছিন, শাহাদাতি আন লা ইলাহা ইল্লাল্লাহু ওয়া আন্না মুহাম্মাদার রাসূলুল্লাহি ওয়া ইকামিস সালাতি ওয়া ইতায়িজ যাকাতি ওয়াল হাজ্জি ওয়া সাওমি রামাদান (মুত্তাফাকুন আলাইহি)।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত ইবনে ওমর রাদ্বিয়াল্লাহু আনহু থেকে বর্ণিত, নবী সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম এরশাদ করেন, ইসলামের ভিত্তি পাঁচটি- (১) সাক্ষ্য দেওয়া যে, আল্লাহ তা‘আলা ছাড়া কোন ইলাহ নেই এবং মুহাম্মাদ সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম আল্লাহর রাসুল, (২) নামাজ কায়েম করা, (৩) যাকাত প্রদান করা, (৪) হজ্জ আদায় করা, (৫) রমাজানে রোযা পালন করা। ");
        this.map_var.put("References", "২.\tসহিহ বোখারী: অধ্যায়: অজু  ৪/১৬৪১ হা: ৪২৪৩, সহিহ মুসলিম: অধ্যায়: ঈমান ১/৪৫ হা: ১৬");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "৩নং হাদিস");
        this.map_var.put("Heading", "ঈমানদারের তিনটি বৈশিষ্ট্য");
        this.map_var.put("Arabic", "عن أَنسٍ رضي اللَّه عنه عن النبي ﷺ قال : ثَلاثٌ مَنْ كُنَّ فِيهِ وَجَدَ بِهِنَّ حَلاَوَةَ الإِيَمَانِ : أَنْ يَكُونَ اللَّهُ وَرَسُولُهُ أَحَبَّ إِلَيْهِ مِمَّا سِواهُما ، وأَنْ يُحِبَّ المَرْءَ لا يُحِبُّهُ إِلاَّ للَّهِ ، وَأَنْ يَكْرَه أَنْ يَعُودَ في الكُفْرِ بَعْدَ أَنْ أَنْقَذَهُ اللَّهُ مِنْهُ، كَمَا يَكْرَهُ أَنْ يُقْذَفَ في النَّار- (متفق عليه)");
        this.map_var.put("Syllable", "উচ্চারণ : আন আনাসিন রাদ্বিয়াল্লাহু আনহু আনিন নাবিয়্যি সাল্লাল্লাহু আলাইহি ওয়াসাল্লামা ক্বালা: সালাসুন মান কুন্না ফিহি ওয়াজাদা বিহিন্না হালাওয়াতাল ঈমান: আয় ইয়াকুনাল্লাহু ওয়া রাসূলুহু আহাব্বা ইলাইহি মিম্মা সিওয়াহুমা, ওয়া আয় ইউহিব্বুল মারআ লা ইউহিব্বুহু ইল্লা লিল্লাহ, ওয়া আয় ইয়াকরাহা আন ইয়াউদা ফিল কুফরি বা’দা আন আনক্বাযাহুল্লাহু মিনহু, কামা ইয়াকরাহু আয় ইউক্বযাফা ফিন নার (মুত্তাফাকুন আলাইহি)।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত আনাস রাদ্বিয়াল্লাহু আনহু থেকে বর্ণিত, তিনি বলেন, নবীজী সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম এরশাদ করেন, যার মধ্যে তিনটি বৈশিষ্ট্য থাকবে সে ঐ বৈশিষ্ট্যের কারণে ঈমানের স্বাদ লাভ করবে। সেগুলো হলো : (১) যার নিকট আল্লাহ ও তাঁর রাসুল অন্য কিছুর চাইতে সবচেয়ে প্রিয় হবে, (২) যে ব্যক্তি কাউকে শুধুমাত্র আল্লাহর সন্তুষ্টির জন্যেই ভালোবাসবে, (৩) যে ব্যক্তি আল্লাহর অনুগ্রহে কুফর থেকে মুক্তি লাভের পর পুরনায় কুফুরীতে ফিরে যাওয়াকে এভাবে অপছন্দ করবে, যেভাবে অগ্নিকু-ে নিক্ষিপ্ত হওয়াকে অপছন্দ করে।");
        this.map_var.put("References", "৩.\tসহিহ বোখারী: অধ্যায়: ঈমান ১/১৪ হা: ১৬, ১/১৬ হা: ২১, সহিহ মুসলিম: অধ্যায়: ঈমান ১/৬৬ হা: ৪৩, সুনানে তিরমিজি: অধ্যায়: ঈমান, অধ্যায় নং ১০, সুনানে নাসাঈ: ৮/৯৪ হাদিস ৪৯৮৭");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "৪নং হাদিস");
        this.map_var.put("Heading", "নবীজীর ভালোবাসাই ঈমানের মূল");
        this.map_var.put("Arabic", "عَنْ أَنَسٍ رَضِيَ اللّه عَنْهُ عَنِ النَّبِيِّ ﷺ قال: لا يُؤْمِنُ أَحَدُكُمْ حَتَّى أَكونَ أحَبَّ إِلَيْهِ مِنْ وَالِدِهِ وَوَلَدِه وَالنَّاسِ أَجْمَعينَ- (متفق عليه)");
        this.map_var.put("Syllable", "উচ্চারণ : আন আনাসিন রাদ্বিয়াল্লাহু আনহু আনিন নাবিয়্যি সাল্লাল্লাহু আলাইহি ওয়াসাল্লামা ক্বালা: লা ইউমিনু আহাদুকুম হাত্তা আকুনা আহাব্বা ইলাইহি মিও ওয়ালিদিহী ওয়া ওয়ালাদিহি ওয়ান নাসি আজমাঈন (মুত্তাফাকুন আলাইহি)।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত আনাস রাদ্বিয়াল্লাহু আনহু থেকে বর্ণিত, তিনি বলেন, নবীজী সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম এরশাদ করেন, তোমাদের কেউ ঈমানদার হতে পারবে না, যতক্ষণ পর্যন্ত আমি তার নিকট তার পিতা-মাতা, সন্তান-সন্ততি এবং সকল মানুষ হতে সর্বাধিক প্রিয় না হবো।");
        this.map_var.put("References", "৪.\tসহিহ বোখারী: অধ্যায়: সাহাবীদের ফাযায়েল ৩/১৩৪৯ হা: ৩৪৮৫, সহিহ মুসলিম: অধ্যায়: আদব ৪/২০৩২ হা: ২৬৩৯, সুনানে তিরমিজি: অধ্যায়: যুহুদ ৪/৫৯৫ হা: ২৩৮৫");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "৫নং হাদিস");
        this.map_var.put("Heading", "আল্লাহ ও তার রাসুলকে ভালোবাসার প্রতিদান");
        this.map_var.put("Arabic", "عَنْ أَنَسِ بْنِ مَالِكٍ ، قَالَ : جَاءَ أَعْرَابِي قَالَ لرَسُولُ اللَّهِ \u200f ﷺ ، مَتَى السَّاعَةُ ؟ قَالَ : وَمَاذَا أَعْدَدْتَ لَهَا ؟ قَالَ احِبُّ اللَّهَ وَرَسُو له ، قَالَ : فَأَنْتَ مَعَ مَنْ أَحْبَبْتَ- (متفق عليه)");
        this.map_var.put("Syllable", "উচ্চারণ : আন আনাসিবনি মালেক ক্বালা জা’আ আ’রাবিয়্যুন ক্বালা লিরাসু লিল্লাহি সাল্লাল্লাহু আলাইহি ওয়াসাল্লামা: মাতাস সা’আ? ক্বালা: ওয়া মাজা আ’দাত্তা লাহা? ক্বালা উহিব্বুল্লাহা ওয়া রাসুলিহি, ক্বালা: ফা আনতা মা’আ মান আহবাবতা (মুত্তাফাকুন আলাইহি)।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত আনাস রাদ্বিয়াল্লাহু আনহু থেকে বর্ণিত, তিনি বলেন, নবীজী সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম এর নিকট একজন গ্রাম্য আরবীয় লোক আসল এবং জিজ্ঞেস করল কিয়ামত কখন হবে? নবীজী সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম বললেন, তুমি কি অর্জন করেছ? সে বলল, আমি আল্লাহ ও তাঁর রাসুলকে ভালোবাসি। নবীজী এরশাদ করলেন, তুমি যাকে ভালোবাস তার সাথেই তোমার হাশর হবে। ");
        this.map_var.put("References", "৫.\tসহিহ বোখারী: অধ্যায়: ঈমান ১/১৪ হা: ১৬, ১/১৬ হা: ২১,  সহিহ মুসলিম: অধ্যায়: ঈমান ১/৬৬ হা: ৪৩, সুনানে তিরমিজি: অধ্যায়: ঈমান, অধ্যায় নং ১০, সুনানে নাসাঈ: ৮/৯৪ হা: ৪৯৮৭");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "৬নং হাদিস");
        this.map_var.put("Heading", "সর্বোত্তম আমল");
        this.map_var.put("Arabic", "عَنْ أَبِي ذَرٍّ، قَالَ قَالَ رَسُولُ اللَّهِ ﷺ \u200fأَفْضَلُ الأَعْمَالِ الْحُبُّ فِي اللَّهِ وَالْبُغْضُ فِي اللَّهِ-");
        this.map_var.put("Syllable", "উচ্চারণ : আন আবি যার রাদ্বিয়াল্লাহু আনহু ক্বালা, ক্বালা রাসূলুল্লাহি সাল্লাল্লাহু আলাইহি ওয়াসাল্লামা: আফদ্বালুল আমালী আল হুব্বু ফিল্লাহি ওয়াল বুগদু ফিল্লাহি।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত আবু যর রাদ্বিয়াল্লাহু আনহু থেকে বর্ণিত, তিনি বলেন, নবীজী সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম এরশাদ করেন, সর্বোত্তম আমল হচ্ছে, আল্লাহর সন্তুষ্টির জন্য কাউকে ভালোবাসা এবং আল্লাহর সন্তুষ্টির জন্যই কাউকে অপছন্দ করা।");
        this.map_var.put("References", "৬.\tসুনানে আবি দাউদ: অধ্যায়: সুন্নাহ ৪/১৯৮ হা: ৪৫৯৯, \nমুসনাদে আহমদ বিন হাম্বল: ৫/১৪৬ হা: ২১৩৪১, মুসতাদে বাযযার: ৯/৪৬১ হা: ৪০৭৬");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "৭নং হাদিস");
        this.map_var.put("Heading", "দুনিয়া মুমিন ও কাফেরের জন্য কেমন?");
        this.map_var.put("Arabic", "عَنْ أَبِي هُرَيْرَةَ قَالَ :قَالَ رَسُولُ اللَّهِ ﷺ الدُّنْيَا سِجْنُ الْمُؤْمِنِ وَجَنَّةُ الْكَافِرِ-");
        this.map_var.put("Syllable", "উচ্চারণ : আন আবি হুরাইরাতা রাদ্বিয়াল্লাহু আনহু ক্বালা ক্বালা রাসূলুল্লাহি সাল্লাল্লাহু আলাইহি ওয়াসাল্লামা: আদ্ দুনিয়া সিজনুল মু’মিনি ওয়া জান্নাতুল কাফিরি।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত আবু হুরায়রাহ রাদ্বিয়াল্লাহু আনহু থেকে বর্ণিত, তিনি বলেন, নবীজী সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম এরশাদ করেন, দুনিয়া ঈমানদারের জন্য কারাগার আর কাফেরের জন্য জান্নাত।");
        this.map_var.put("References", "৭.\tসহিহ মুসলিম: অধ্যায়: যুহুদ ৪/২২৭২ হা: ২৯৫৬, সুনানে তিরমিজি: অধ্যায়: যুহুদ ৪/৫৬২ হা:২৩২৪");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "৮নং হাদিস");
        this.map_var.put("Heading", "সর্বোত্তম ব্যক্তি");
        this.map_var.put("Arabic", "عَنْ أَبِي هُرَيْرَةَ رَضِيَ اللَّهُ عَنْهُ ، قَالَ : قِيلَ : يَا رَسُولَ اللَّهِ مَنْ أَكْرَمُ النَّاسِ ؟ قَالَ : أَتْقَاهُم-");
        this.map_var.put("Syllable", "উচ্চারণ : আন আবি হুরাইরাতা রাদ্বিয়াল্লাহু আনহু ক্বালা, ক্বীলা: ইয়া রাসূলাল্লাহি মান আকরামুন নাস? ক্বালা: আতক্বাহুম।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত আবু হুরায়রাহ রাদ্বিয়াল্লাহু আনহু থেকে বর্ণিত, তিনি বলেন, নবীজী সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম কে জিজ্ঞেস করা হলো, সর্বোত্তম ব্যক্তি কে? নবীজী এরশাদ করেন, যে মুত্তাকি (আল্লাহকে অধিক ভয়কারী)।");
        this.map_var.put("References", "৮.\tসহিহ বোখারী: অধ্যায়: আম্বিয়া, ৩/১২২৪ হা: ৩১৭৫ অধ্যায়: মানাকিব ৩/১২৮৭ হা: ৩৩০১, সহিহ বোখারী: অনুচ্ছেদ: ফাযায়েল ৪/১৮৪৬ হা: ২৩৭৮, মুসান্নাফে ইবনে আবি শাইবা: ৬/৩৪৭ হা: ৩১৯১৯, মুসনাদে আহমদ বিন হাম্বল: ২/৪৩১ হা: ৯৫৬৪");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "৯নং হাদিস");
        this.map_var.put("Heading", "ইহসানের পরিচয়");
        this.map_var.put("Arabic", "عَنْ أَنَسِ بْنِ مَالِكٍ ، قَالَ قَالَ رَسُولُ اللَّهِ ﷺ الْإِحْسَانُ أَنْ تَعْبُدَ اللَّهَ كَأَنَّكَ تَرَاهُ فَإِنْ لَمْ تَكُنْ تَرَاهُ فَإِنَّهُ يَرَاكَ-");
        this.map_var.put("Syllable", "উচ্চারণ : আন আনাসিবনি মালেক ক্বালা ক্বালা রাসূলুল্লাহি সাল্লাল্লাহু আলাইহি ওয়াসাল্লামা: আল ইহসানু আন তা’বুদাল্লাহা কাআন্নাকা তারাহু ফাইল লাম তাকুন তারাহু ফাইন্নাহু ইয়ারাকা।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত আনাস ইবনে মালিক রাদ্বিয়াল্লাহু আনহু থেকে বর্ণিত, তিনি বলেন, নবীজী সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম এরশাদ করেন, ইহসান হচ্ছে তুমি এমনভাবে আল্লাহর ইবাদাত করবে যেন তুমি আল্লাহকে দেখছো। আর যদিও তুমি তাঁকে দেখতে নাও পাও, তাহলে মনে করবে, আল্লাহ অবশ্যই তোমাকে দেখছেন।");
        this.map_var.put("References", "৯.\tমুসনাদে ইবনে রাবিহ: ১/৪২ হা: ৫৬, ইবনে রজব হাম্বলি কৃত জামিউল উলুম ওয়াল হিকাম: ১/৩৬");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "১০নং হাদিস");
        this.map_var.put("Heading", "নবীজীর রাত্রীকালীন কঠোর ইবাদত");
        this.map_var.put("Arabic", "عَنْ عَائِشَةَ رَضِيَ اللَّهُ عَنْهَا: أَنَّ نَبِيَّ اللَّهِ ﷺ كَانَ يَقُومُ مِنَ اللَّيْلِ حَتَّى تَتَفَطَّرَ قَدَمَاهُ، فَقَالَتْ عَائِشَةُ: لِمَ تَصْنَعُ هَذَا يَا رَسُولَ اللَّهِ، وَقَدْ غَفَرَ اللَّهُ لَكَ مَا تَقَدَّمَ مِنْ ذَنْبِكَ وَمَا تَأَخَّرَ؟ قَالَ: أَفَلاَ أُحِبُّ أَنْ أَكُونَ عَبْدًا شَكُورًا- (متفق عليه)");
        this.map_var.put("Syllable", "উচ্চারণ : আন আয়িশাতা রাদ্বিয়াল্লাহু আনহা, আন্না নাবিয়্যাল্লাহি সাল্লাল্লাহু আলাইহি ওয়াসাল্লামা কানা ইয়াকুমু মিনাল লাইলি হাত্তা তাতাফাত্তারা ক্বাদামাহু ফাক্বালাত: আয়িশাতু লিমা তাসনাউ হাযা ইয়া রাসূলাল্লাহি, ওয়া ক্বাদ গাফারাল্লাহু লাকা মা তাক্বাদ্দামা মিন যাম্বিকা ওয়ামা তায়াক্ষারা? ক্বালা: আফালা উহিব্বু আন আকুনা আবদান শাকুরান। (মুত্তাফাকুন আলাইহি)।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত আয়েশা সিদ্দীকা রাদ্বিয়াল্লাহু আনহা থেকে বর্ণিত, তিনি বলেন, নবীজী সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম রাতে ইবাদতের জন্য এমনভাবে দ-ায়মান থাকতেন যে, নবীজীর পা মোবারক ফুলে যেত। হযরত আয়েশা সিদ্দীকা রাদ্বিয়াল্লাহু আনহা আরজ করলেন, হে আল্লাহর রাসুল! কেন আপনি এমনটা করছেন? অথচ আপনি নিস্পাপ। নবীজী এরশাদ করলেন, আমি কি এটা পছন্দ করবো না যে, আমি শুকরগুজার বান্দাহ হই।");
        this.map_var.put("References", "১০.\tসহিহ বোখারী: অধ্যায়: তাফসির ৪/১৮৩০ হা: ১৮৩০ হা: ৪৫৫৭, সহিহ মুসলিম: অধ্যায়: কিয়ামত, জান্নাত ও জাহান্নামের বৈশিষ্ট ৪/২১৭২, সুনানে তিরমিজি: অধ্যায়: সালাত ২/২৬৮ হা: ৪১২");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "১১নং হাদিস");
        this.map_var.put("Heading", "হাদিস প্রচারের হুকুম ও মিথ্যা প্রচারের কুফল");
        this.map_var.put("Arabic", "عن عبد الله بن عمرو بن العاص رضي الله عنهما : أنَّ النبيَّ صلى الله عليه وسلم قَالَ : بَلِّغُوا عَنِّي وَلَوْ آيَةً ، وَحَدِّثُوا عَنْ بَنِي إسْرَائِيلَ وَلاَ حَرَجَ، وَمَنْ كَذَبَ عَلَيَّ مُتَعَمِّداً فَلْيَتَبَوَّأْ مَقْعَدَهُ مِنَ النَّارِ- (رواه البخاري)");
        this.map_var.put("Syllable", "উচ্চারণ : আন আবদিল্লাহিবনি আমর ইবনিল আস রাদ্বিয়াল্লাহু আনহুমা ক্বালা, আন্না ন াবিয়্যাহ সাল্লাল্লাহু আলাইহি ওয়াসাল্লামা ক্বালা: বাল্লিগু আন্নি ওয়ালাও আয়াহ, ওয়া হাদ্দিসু আন বানি ইসরাঈল ওয়া লা হারাযা, মান কাযাবা আলাইয়্যা মুতাআম্মিদান ফাল ইয়াতাবাও ওয়া মাক্ব’আদাহু মিনান নার (রাওয়াহুল বুখারী)।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত আব্দুল্লাহ ইবনে আমর রাদ্বিয়াল্লাহু আনহু থেকে বর্ণিত তিনি বলেন, রাসুলুল্লাহ সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম বলেছেন, তোমরা আমার পক্ষ থেকে একটি আয়াত (বাক্য) হলেও মানুষের নিকট পৌছে দাও। আর তোমরা বনি ঈসরাঈল থেকে হাদিস বর্ণনা কর, এতে কোন অসুবিধা নেই। তবে, যে ব্যক্তি ইচ্ছাকৃতভাবে আমার উপর মিথ্যারোপ করল (মিথ্যা হাদিস বর্ণনা করল), সে যেন জাহান্নামে নিজের ঠিকানা করে নিল। ");
        this.map_var.put("References", "১১.\tসহিহ বোখারী: অনুচ্ছেদ: আম্বিয়াদের হাদিস হা: ৩২৭৪, সুনানে তিরমিজি: অনচ্ছেদ: ইলম হা: ২৬৬৯, মুসনাদে আহমদ বিন হাম্বল: ২/১৫৮, সুনানে দারেমী: হা: ৫৪২");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "১২নং হাদিস");
        this.map_var.put("Heading", "নবীজী হচ্ছেন বন্টণকারী");
        this.map_var.put("Arabic", "عَنْ مُعَاوِيَةَ رضي الله عنه يَقُولُ سَمِعْتُ النَّبِيَّ ﷺ يَقُولُ: مَنْ يُرِدِ اللَّهُ بِهِ خَيْرًا يُفَقِّهْهُ فِي الدِّينِ، وَإِنَّمَا أَنَا قَاسِمٌ وَاللَّهُ يُعْطِي- (متفق عليه)");
        this.map_var.put("Syllable", "উচ্চারণ : আন মুয়াবিয়াতা রাদ্বিয়াল্লাহু আনহু ইয়াকুলু সামিতুন নাবিয়্যা সাল্লাল্লাহু আলাইহি ওয়াসাল্লামা ইয়াকুলু: মাইয়্যুরিদিল্লাহু বিহি খাইরান ইয়ুফাক্কিহু ফিদ্দীনি, ওয়া ইন্নামা আনা ক্বাসিমুন ওয়াল্লাহু ইয়ুতি (মুত্তাফাকুন আলাইহি)।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত মুয়াবিয়া রাদ্বিয়াল্লাহু আনহু থেকে বর্ণিত, তিনি বলেন, আমি রাসুলুল্লাহ সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম কে বলতে শুনেছি, রাসুলুল্লাহ সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম বলেছেন, আল্লাহ যার মঙ্গল চান তাকে দ্বীনের সঠিক জ্ঞান দান করেন। আর নিশ্চই আমিই হচ্ছি বন্টণকারী আর আল্লাহ হচ্ছেন দাতা। ");
        this.map_var.put("References", "১২.\tসহিহ বোখারী অধ্যায়: ইলম ১/৩৯ হা: ৭১, ৩/১১৩৪ হা: ২৯৪৮ অধ্যায়: কিতাব ও সুন্নাহকে শক্তভআবে আকড়ে ধরা ৬/২৬৬৭ হা: ২৮৮২, সহিহ মুসলিম: অধ্যায়: যাকাত ২/৭১৮ হা: ১০৩৭, সুনানে তিরমিজি: অধ্যায়: ইলম ৫/২৭ হা: ২৬৪৫, ইবনে মাজাহ: ১/৮০ হা: ২২০-২২১, নাসাঈ কৃত সুনানে কুবরা: ৩/৪২৫ হা: ৫৮২৩, মুয়াত্তা ইমাম মালেক: ২/৯০০ হা: ১৫৯৯, মুসনাদে আহমদ বিন হাম্বল: ২/২৩৪ হা: ৭৯৩");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "১৩নং হাদিস");
        this.map_var.put("Heading", "পবিত্রতা, তাসবিহ, সালাত, ধৈর্য এবং কুরআনের ফজিলত");
        this.map_var.put("Arabic", "عَنْ أَبِي مَالِكٍ الْأَشْعَرِيِّ قَالَ: قَالَ رَسُولُ اللَّهِ ﷺ الطَّهُورُ شَطْرُ الْإِيمَانِ، وَالْحَمْدُ لِلَّهِ تَمْلَأُ الْمِيزَانَ،وَسُبْحَانَ اللَّهِ وَالْحَمْدُ لِلَّهِ تَمْلَآنِ -أَوْ: تَمْلَأُ- مَا بَيْنَ السَّمَاءِ وَالْأَرْضِ، وَالصَّلَاةُ نُورٌ، وَالصَّدَقَةُ بُرْهَان ٌ،وَالصَّبْرُ ضِيَاءٌ، وَالْقُرْآنُ حُجَّةٌ لَك أَوْ عَلَيْك، كُلُّ النَّاسِ يَغْدُو، فَبَائِعٌ نَفْسَهُ فَمُعْتِقُهَا أَوْ مُوبِقُهَا- (رَوَاهُ مُسْلِمٌ)");
        this.map_var.put("Syllable", "উচ্চারণ : আন আবি মালিকিল আশআরি ক্বালা: ক্বালা রাসূলুল্লাহি সাল্লাল্লাহু আলাইহি ওয়াসাল্লামা আত্ব তুহুরু শাতরুল ঈমান, ওয়াল হামদু লিল্লাহি তামলাউল মিযান, ওয়াসুবহানাল্লাহি ওয়াল হামদু লিল্লাহি তামলানি আও তামলাউ-মা বাইনাস সামায়ী ওয়াল আরদ্বি, ওয়াস সালাতু নূরুন, ওয়াস সাদাক্বাতু বুরহানুন, ওয়াস সাবরু দ্বিয়াউন, ওয়াল কুরআনু হুজ্জাতুল লাকা আও আলাইকা, কুল্লুন নাসি ইয়াগদু, ফাবাই-উ নাফসাহু, ফামু’তিকুহা আও মুবিকুহা (রাওয়াহু মুসলিম)।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত আবু মালিক আল আশআরী রাদ্বিয়াল্লাহু আনহু থেকে বর্ণিত, তিনি বলেন, রাসূলুল্লাহ সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম বলেছেন, পবিত্রতা হল ঈমানের অংশ। ‘আলহামদু লিল্লাহ’ মিযানের পরিমাপকে পরিপূর্ণ করে দিবে এবং ‘সুবহানাল্লাহ ওয়াল হামদুলিল্লাহ’ আসমান ও জমিনের মধ্যবর্তী স্থানকে পরিপূর্ণ করে দিবে। ‘সালাত’ হচ্ছে একটি উজ্জ্বল জ্যোতি। ‘সদাকাহ’ হচ্ছে দলীল। ‘ধৈর্য’ হচ্ছে জ্যোতির্ময়। আর ‘আল কুরআন’ হবে তোমার পক্ষে অথবা বিপক্ষে প্রমাণ স্বরূপ। বস্তুত: সকল মানুষই প্রত্যেক ভোরে নিজেকে আমলের বিনিময় বিক্রি করে। তার আমল দ্বারা সে নিজেকে (আল্লাহর আযাব থেকে) মুক্ত করে অথবা সে নিজেই তার নিজের ধ্বংস সাধন করে।");
        this.map_var.put("References", "১৩.\tসহিহ মুসলিম: অধ্যায়: তাহারাত, অনুচ্ছেদ: অজুর ফযিলত হা: ২২৩, সুনানে নাসাঈ: হা: ৩৯৪০, বায়হাকী সুনানে কুবরা: ৭/৭৮, মুস্তাগরেক হাকেম: ২/১৬০, মুসনাদে আহমদ বিন হাম্বল: ৩/১৯৯ হা: ১৩০৮৮");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "১৪নং হাদিস");
        this.map_var.put("Heading", "মৃত্যুর পরও যে সাওয়াবের ধারা জারি থাকে");
        this.map_var.put("Arabic", "عَنْ أَبِي هُرَيْرَةَ رَضِيَ اللَّهُ تَعَالَى عَنْهُ قَالَ , قَالَ رَسُولَ اللَّهِﷺ: إِذَا مَاتَ الإِنْسَانُ انْقَطَعَ عَنهُ عَمَلُهُ إِلا مِنْ ثَلاثٍ : صَدَقَةٍ جَارِيَةٍ ، أَوْ عِلْمٍ يُنْتَفَعُ بِهِ ، أَوْ وَلَدٍ صَالِحٍ يَدْعُو لَهُ- (رَوَاهُ مُسْلِمٌ)");
        this.map_var.put("Syllable", "উচ্চারণ : আন আবি হুরাইরাতা রাদ্বিয়াল্লাহু আনহু ক্বালা ক্বালা রাসূলুল্লাহি সাল্লাল্লাহু আলাইহি ওয়াসাল্লামা: ইযা মা-তাল ইনসানু ইনক্বাতা’আ আনহু আমালুহু ইল্লা মিন ছালাছিন: সাদাক্বাতিন জারিয়াতিন, আও ইলমিন ইউনতাফা’উ বিহি, আও ওয়ালাদিন সালিহিন ইয়াদ’উ লাহু (রাওয়াহু মুসলিম)।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত আবু হুরায়রা রাদ্বিয়াল্লাহু আনহু থেকে বর্ণিত তিনি বলেন, রাসুলুল্লাহ সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম বলেছেন যে, যখন মানুষ মারা যায় তখন তার আমলের (সাওয়াবের) ধারা বন্ধ হয়ে যায়, তিনটি আমল ব্যতীত (এ তিনটি আমলের সাওয়াব বন্ধ হয় না)। (১) সদকায়ে জারিয়াহ, (২) এমন ইলম যা দ্বারা উপকার লাভ করা যায়, (৩) এমন সু-সন্তান যে তার জন্য দোয়া করবে। ");
        this.map_var.put("References", "১৪.\tসহিহ মুসলিম: অধ্যায়: অছিয়ত হা: ১৬৩১, সুনানে তিরমিজি: অধ্যায়: আহকাম ১৩৭৬, সুনানে নাসাঈ: অধ্যায়: অছিয়ত হা: ৩৬৫১, সুনানে আবু দাউদ: ২৮৮০, মুসনাদে আহমদ বিন হাম্বল: ২/৩৭২");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "১৫নং হাদিস");
        this.map_var.put("Heading", "দোয়া হচ্ছে ইবাদতের মূল");
        this.map_var.put("Arabic", "عن أَنسٍ رضي اللَّه عَنْهُ قَالَ قَالَ رَسُولُ اللَّهِ ﷺ: الدُّعَاءُ مُخُ\u200f الْعِبَادَةِ-");
        this.map_var.put("Syllable", "উচ্চারণ : আন আনাসিন রাদ্বিয়াল্লাহু আনহু ক্বালা, ক্বালা রাসূলুল্লাহি সাল্লাল্লাহু আলাইহি ওয়াসাল্লামা: আদ দু’আউ মুখখুল ইবাদাহ।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত আনাস বিন মালেক রাদ্বিয়াল্লাহু আনহু থেকে বর্ণিত, তিনি বলেন, রাসুলুল্লাহ সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম এরশাদ করেছেন, দোয়া হচ্ছে ইবাদাতের মগজ (মূল)। ");
        this.map_var.put("References", "১৫.\tতিরমিযী: ৫/৪৫৬ হা: ৩৩৭১, দায়লামী: ২/২২৪ হা: ৩০৮৭, হাকেম তিরমিযী, নও্যাদিরুল উসূল: ২/১১৩, ইবনে রজব, জামিউল উলুম ওয়াল হিকাম: ১/১৯১ মুনযরী, আস-সুনান, কিতাবুদ দাওয়াত: ৪/৪৪৮, হা: ২১৩৯");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "১৬নং হাদিস");
        this.map_var.put("Heading", "দোয়া কবুলের সময়");
        this.map_var.put("Arabic", "عن أبي أمامة رضي الله عنه قال: قيل يَا رَسُولَ اللهِ ﷺ أَيُّ الدُّعَاءِ أَسْمَعُ؟ قَالَ: جَوْفَ اللَّيْلِ الآخِرِ،وَدُبُرَ الصَّلَوَاتِ الْمَكْتُوبَاتِ- (رواه الترمذي و النسائي)");
        this.map_var.put("Syllable", "উচ্চারণ : আন আবি উমামাতা রাদ্বিয়াল্লাহু আনহু ক্বালা ক্বীলা ইয়া রাসূলাল্লাহি সাল্লাল্লাহু আলাইহি ওয়াসাল্লামা: আইয়্যুদ দু’আয়ি আসমা’উ? ক্বালা যাওফাল লাইলিল আখিরি, ওয়াদুবুরাস সালাওয়াতিল মাকতুবাত (রাওয়াহুত তিরমিজি ওয়ান নাসাঈ)।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত আবু উমামা রাদ্বিয়াল্লাহু আনহু থেকে বর্ণিত, তিনি বলেন, একদিন রাসুলুল্লাহ সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম এর দরবারে আরজ করা হল, হে আল্লাহ্র রাসূল সাল্লাল্লাহু আলাইহি ওয়া সাল্লাম, কোন সময়ের দোয়া সবচেয়ে বেশি কবুল হয়ে থাকে? নবীজী সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম এরশাদ করলেন, রাতের শেষাংশে এবং ফরজ নামাজের পরে।");
        this.map_var.put("References", "১৬.\tতিরমিযী: ৫/৫২৬ হা: ৩৪৯৯, নাসায়ী, আস সুনানুল কুবরা: ৬/৩২ হা: ৯৯৩৬, আব্দুর রাযযাক, আল মুসান্নাফ: ২/৪২৪ হা: ৩৯৪৪, নাসায়ী, আমালাল ইয়াওমি ওয়াল লাইলা: ১/১৮৬, হা: ১০৮, তাবরানী, আল ম’জামুল আওস্ত: ৩/৩৭০ হা: ৩৪২৮, মুসনাদে শামী: ১/৪৫৪ হা: ৮০৩");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "১৭নং হাদিস");
        this.map_var.put("Heading", "জানাজার নামাজের পর দোয়া");
        this.map_var.put("Arabic", "عَنْ أَبِي هُرَيْرَةَ ، قَالَ : سَمِعْتُ رَسُولَ اللَّهِ ﷺيَقُولُ : إِذَا صَلَّيْتُمْ عَلَى الْمَيِّتِ فَأَخْلِصُوا لَهُ الدُّعَاءَ- (رواه أبو داود)");
        this.map_var.put("Syllable", "উচ্চারণ : আন আবি হুরাইরাতা রাদ্বিয়াল্লাহু আনহু ক্বালা সামি’তু রাসুলাল্লাহি সাল্লাল্লাহু আলাইহি ওয়াসাল্লামা ইয়াকুলু: ইযা সাল্লাইতুম আলাল মাইইয়্যিতি ফাআখলিছু লাহুদ দুয়া (রাওয়াহু আবু দাঊদ)।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত আবু হুরায়রা রাদ্বিয়াল্লাহু আনহু থেকে বর্ণিত, তিনি বলেন, আমি রাসুলুল্লাহ সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম কে বলতে শুনেছি, যখন তোমরা মৃত ব্যক্তির জানাজার নামাজ পড়ে নিবে, (সাথে সাথে) তার জন্য বিশেষভাবে দোয়া করবে। ");
        this.map_var.put("References", "১৭.\tসুনানে ইবনে মাজাহ: ১৪৯৭, আবু দাঊদ: ৩১৯৯");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "১৮নং হাদিস");
        this.map_var.put("Heading", "কবর যিয়ারতের ফজিলত");
        this.map_var.put("Arabic", "عَنْ بريرة رَضِيَ اللَّهُ تَعَالَى عَنْهُ قَالَ: قَالَ رَسُولُ اللَّهِ ﷺ: كُنْتُ نَهَيْتُكُمْ عَنْ زِيَارَةِ الْقُبُورِ، فَزُورُوهَا- (رواه مسلم والترميذي و زاد فَإِنَّها وَتُذَكِّرُكم الآخِرَةَ،)");
        this.map_var.put("Syllable", "উচ্চারণ : আন বুরায়রাতা রাদ্বিয়াল্লাহু তা‘আলা আনহু ক্বালা ক্বালা রাসুলুল্লাহি সাল্লাল্লাহু আলাইহি ওয়াসাল্লামা: কুনতু নাহাইতুকুম আন জিয়ারাতিল কুবুরি, ফাযুরুহা (রাওয়াহু মুসলিম, ওয়াত তিরমিজি ওয়া যাদা, ফা ইন্নাহা তুযাক্কিরুকুমুল আখিরাতা)।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত বুরায়রাহ রাদ্বিয়াল্লাহু আনহু থেকে বর্ণিত, তিনি বলেন, রাসুলুল্লাহ সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম ইরশাদ করেন, আমি তোমাদেরকে কবর যিয়ারত করতে নিষেধ করেছিলাম, কিন্তু এখন তোমরা কবর যিয়ারত কর (সহিহ মুসলিম, সুনানে তিরমিজিতে এ বাক্যটা যুক্ত হয়েছে : কেননা এটি তোমাদের পরকালকে স্মরণ করে দিবে)। ");
        this.map_var.put("References", "১৮.\tসহিহ মুসলিম: ১৭৮, ১৮৮, সুনানে ইবনে মাজাহ: ১৫৭১ সুনানে তিরমিজি: অধ্যায়: জানাজা ৩,৪/৩৭০ হা: ১০৫৪, সুনানে আবু দাউদ: অধ্যায়: জানাজা, অনুচ্ছেদ: কবর যিয়ারত ৩/২১৮ হা: ৩২৩৫, সুনানে কুবরা নাসাঈ: ৪/৮৯ হা: ২০৩২");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "১৯নং হাদিস");
        this.map_var.put("Heading", "প্রিয় নবীজীর রওজা যিয়ারতের ফজিলত");
        this.map_var.put("Arabic", "عَنِ ابْنِ عُمَرَ ، قَالَ: قَالَ رَسُولُ اللَّهِ ﷺ : مَنْ زَارَقَبْرِي وَجَبَتْ لَهُ شَفَاعَتِي- (رواه الدار قطني و البيهقي)");
        this.map_var.put("Syllable", "উচ্চারণ : আন ইবনে উমারা রাদ্বিয়াল্লাহু আনহু, ক্বালা ক্বালা রাসূলুল্লাহি সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম: মান যারা ক্বাবরি, ওয়াজাবাত লাহু শাফায়াতি (রাওয়াহু দা‘রে কুতনি ওয়াল বায়হাকী)।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত ইবনে ওমর রাদ্বিয়াল্লাহু আনহু থেকে বর্ণিত, তিনি বলেন, রাসুলুল্লাহ সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম বলেছেন, যে ব্যক্তি আমার রওজা যিয়ারত করল, তার জন্য সুপারিশ করা আমার উপর ওয়াজিব হয়ে গেল।");
        this.map_var.put("References", "১৯.\tসুনানে দারে কুত্বনী: ২/২৭৮ হা: ১৯৪, বায়হাকী: কৃত শুয়াইবুল ইমান ৩/৪৯০ হা: ৪১৫৯, ইমাম হায়সামী কৃত মুজামুয যাওয়ায়েদ: ৪/২");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "২০নং হাদিস");
        this.map_var.put("Heading", "মক্কা বা মদিনা শরীফে ইন্তেকালের ফজিলত");
        this.map_var.put("Arabic", "عَنْ حَاطِبٍ ، قَالَ : قَالَ النَّبِيُّ صَلَّى اللَّهُ عَلَيْهِ وَسَلَّمَ : مَنْ زَارَنِي بَعْدَ مَوْتِي ، فَكَأَنَّمَا زَارَنِي فِي حَيَاتِي ، وَمَنْ مَاتَ فِي أَحَدِ الْحَرَمَيْنِ بُعِثَ يَوْمَ الْقِيَامَةِ مِنَ الْآمِنِينَ- (رواه الدار قطني و البيهقي)");
        this.map_var.put("Syllable", "উচ্চারণ : আন হাতিবিন, ক্বালা ক্বালা ন্নাবিয়্যু সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম: মান যারানি বা’দা মাওতি ফাকাআন্নামা যারানি ফি হায়াতি ওয়া মান মাতা ফি আহাদিল হারামাইনি বু’য়িছা ইয়াওমাল কিয়ামাতি মিনাল আমিনিন (রাওয়াহু দ্বারে-কুতনী ওয়াল বায়হাকী)।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত হাতেব রাদ্বিয়াল্লাহু আনহু থেকে বর্ণিত, তিনি বলেন, রাসুলুল্লাহ সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম বলেছেন, যেই ব্যক্তি আমি দুনিয়া পর্দা করার পরে আমার রওজা যিয়ারত করে সে যেন আমার হায়াত অবস্থায়ই আমার যিয়ারত (সাক্ষাত) করল। যে ব্যক্তি হারামাঈন শারিফাঈন (মক্কা ও মদিনা) এর যে কোন একটিতে ইন্তেকাল করল, কিয়ামত দিবসে নিরাপত্তা প্রাপ্ত বান্দাদের সাথে সে উত্থিত হবে।");
        this.map_var.put("References", "২০.\tসুনানে দারে কুত্বনী: ২/২৭৮ হা: ৯১৩, বায়হাকী: কৃত শুয়াইবুল ইমান ৩/৪৮৮ হা: ৪১৫১, যাহাবী কৃত মিযানুল ই'তিদাল: ৭/৬৩, ইবনে হাজার আস্বকালানী কৃত লিসানিক মিজান: ৬/১৮০, ইমাম মুনযারী কৃত আত তারগিব ওয়াত তারহিব: ২/১৪৭ হাঃ ১৮৬৫, সূয়ূতী কৃত দুররুল মানসুর: ১/৫৬৯");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "২১নং হাদিস");
        this.map_var.put("Heading", "নামাজে আস্তে আমিন বলা");
        this.map_var.put("Arabic", "عَنْ وَائِلٍ بن حُجَرْ قَالَ سَمِعْتُ أَنَّ النَّبِيَّ ﷺ َقرَأَ \u200f:\u200f غَيْرِ الْمَغْضُوبِ عَلَيْهِمْ وَلاَ الضَّالِّينَ \u200fفَقَالَ \u200f\"آمِينَ\u200f\"\u200f \u200f.\u200f وَخَفَضَ بِهَا صَوْتَهُ- (رواه الترمذي و أحمد و الحاكم)");
        this.map_var.put("Syllable", "উচ্চারণ : আন ওয়ায়লিবনি হুজর ক্বলা সামিতু আন্নান্নাবিয়্যা সাল্লাল্লাহু আলাইহি ওয়া সাল্লামা ক্বারাআ: গাইরিল মাগদ্বু বি আলাইহিম ওয়া লাদ্ দোয়াল্লীন ফাক্বালা “আমীন”। ওয়া খাফাদ্বা বিহা ছাওতাহু (রাওয়ায়হুত তিরমিজি ওয়া আহমাদ, ওয়াল হাকিম)।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত ওয়ায়িল ইবনে হুজর রাদ্বিয়াল্লাহু আনহু থেকে বর্ণিত, তিনি বলেন, আমি শুনেছি, নবীজী সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম নামাজে ‘গাইরিল মাগদ্বু বি আলাইহিম ওয়া লাদ্ দোয়াল্লীন’ পড়তেন অতঃপর বললেন, “আমিন”। নবীজী সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম আমিন বলার সময় স্বরকে নিচু করলেন (আস্তে পড়লেন)। ");
        this.map_var.put("References", "২১.\tসুনানে তিরমিজি: ২৪৭, মুসনাদে আহমদ বিন হাম্বল: ৪/৩১৬, মুন্তাদরাক হাকেম: ২৯১২");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "২২নং হাদিস");
        this.map_var.put("Heading", "ইমামের পিছনে কিরাত না পড়া");
        this.map_var.put("Arabic", "عَنْ أَبِي هُرَيْرَةَ قَالَ : قَالَ رَسُولُ اللَّهِ ﷺ: إنَّمَا جُعِلَ الْإِمَامُ لِيُؤْتَمَّ بِهِ فَإِذَا كَبَّرَ فَكَبِّرُوا وَإِذَا قَرَأَ فَأَنْصِتُوا- )رواه أَبُو دَاوُد و ابن ماجه و أحمد(");
        this.map_var.put("Syllable", "উচ্চারণ : আন আবি হুরায়রাতা ক্বালা: ক্বালা রাসুলুল্লাহি সাল্লাল্লাহু আলাইহি ওয়া সাল্লামা: ইন্নামা জু’ইলাল ইমামু লি ইউতাম্মা বিহি ফা-ইজা কাব্বারা ফাকাব্বিরু ও ইযা ক্বারাআ ফাআনছিতু (রাওয়াহু আবু দাউদ ওয়া ইবনে মাজাহ ওয়া আহমাদ)।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত আবু হুরায়রা রাদ্বিয়াল্লাহু আনহু থেকে বর্ণিত, তিনি বলেন, নবীজী সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম এরশাদ করেছেন, যাকেই ইমাম বানানো হয়, তাকেই (নামাজে) পরিপূর্ণ অনুসরণ করতে হয়। যখন সে তাকবির বলে তখন তোমরাও তাকবির বল। যখন সে কিরাত পড়বে, তখন তোমরা চুপ থাক।");
        this.map_var.put("References", "২২.\tইবনে মাজাহ: ৮৪৬, আবু দাউদ: ৬০৪, মুসনাদে আহমদ বিন হাম্বল: ২/৩৭৬");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "২৩নং হাদিস");
        this.map_var.put("Heading", "নামাজে শুধুমাত্র একবার হাত উত্তোলন করা");
        this.map_var.put("Arabic", "عَنْ عَلْقَمَةَ، قَالَ: قَالَ عَبْدُ اللَّهِ بْنُ مَسْعُودٍ: أَلَا أُصَلِّي بِكُمْ صَلَاةَ رَسُولِ اللَّهِ ﷺ؟قَالَ فَصَلَّى، فَلَمْ يَرْفَعْ يَدَيْهِ إِلَّا فِي اول مَرَّةٍ – )رواه الترمذي و أَبُو دَاوُد و النسائي)");
        this.map_var.put("Syllable", "উচ্চারণ : আন আলক্বামাতা ক্বালা, ক্বালা আবদুল্লাহিবনু মাসঊদ, আলা উছাল্লি বিকুম সালাতা রাসুলিল্লাহি সাল্লাল্লাহু আলাইহি ওয়াসাল্লামা? ক্বালা: ফাছাল্লা, ফালাম ইয়ারফা ইয়াদাইহি ইল্লা ফী আউয়ালি মাররাতিন (রাওয়াহুত তিরমিজি ওয়া আবু দাউদ ওয়ান নাসায়ী)।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত আলকামা রাদ্বিয়াল্লাহু আনহু থেকে বর্ণিত, প্রখ্যাত সাহাবী হযরত আব্দুল্লাহ ইবনে মাসউদ রাদ্বিয়াল্লাহু আনহু বলেন, আমি কি তোমাদেরকে নবীজী সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম এর নামাজ আদায়ের পদ্ধতি শিক্ষা দিব না? বর্ণনাকারী বলেন, অতঃপর তিনি নামাজ পড়লেন এবং একবার ব্যতীত তিনি তার হাত উত্তোলন করলেন না (শুধু একবার হাত উত্তোলন করেন)। ");
        this.map_var.put("References", "২৩.\tআবু দাউদ: ৭৪৮, তিরমিজি: ২৫৭, নাসাঈ: ১০২৬");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "২৪নং হাদিস");
        this.map_var.put("Heading", "নামাজে নাভির নিচে হাত বাধা ");
        this.map_var.put("Arabic", "عَنْ عَلْقَمَةَ بْنِ وَائِلِ بْنِ حُجْرٍ، عَنْ أَبِيهِ قَالَ: رَأَيْتُ النَّبِيَّ ﷺ َوضَعَ يَمِينَهُ عَلَى شِمَالِهِ فِي الصَّلَاةِ تَحْتَ السُّرَّةِ-");
        this.map_var.put("Syllable", "উচ্চারণ : আন আলক্বামাতাবনে ওয়ায়লিবনি হুজরিন, আন আবীহি ক্বালা, রা-আইতু নাবিয়্যিা সাল্লাল্লাহু আলাইহি ওয়া সাল্লামা ওয়াদ্বা’আ ইয়ামীনাহু আলা শিমালিহি ফিছ সালাতি তাহতাস ছুররাতি।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত ওয়ায়িল ইবনে হুজর রাদ্বিয়াল্লাহু আনহু তার পিতা থেকে বর্ণনা করেন, তার পিতা বলেন, আমি নবীজী সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম কে নামাজে ডানহাত বামহাতের উপর নাভির নিচে রাখতে দেখেছি। ");
        this.map_var.put("References", "২৪.\tমুসান্নেফে ইবনে আবি শাইবা: ৩/৩২০ হা: ৩৯৫৯");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "২৫নং হাদিস");
        this.map_var.put("Heading", "তারাবির নামাজ বিশ রাকাত");
        this.map_var.put("Arabic", "عن ابن عباس رضي الله عنهما أَنَّ رَسُولَ اللَّهِ ﷺ كَانَ يُصَلِّي فِي رَمَضَانَ عِشْرِينَ رَكْعَةً وَالْوِتْرَ – (رواه ابن أبي شيبة و عبد بن حميد و الطبراني والبيهقي)");
        this.map_var.put("Syllable", "উচ্চারণ : আন ইবনে আব্বাস রাদ্বিয়াল্লাহু আনহুমা আন্না রাসুলাল্লাহি সাল্লাল্লাহু আলাইহি ওয়া সাল্লামা কানা ইউসাল্লি ফী রামাদ্বানা ইশরীনা রাক’আতান ওয়ালবিতরা (রাওয়াহু ইবনে আবি শায়বা ওয়া আব্দ বিন হুমাইদ ওয়া ত্বাবারানী ওয়াল বায়হাক্বী)।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত ইবনে আব্বাস রাদ্বিয়াল্লাহু আনহুমা থেকে বর্ণিত নবীজী সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম পবিত্র রমজান মাসে বিশ রাকাত নামাজ (তারাবিহ) আদায় করতেন। অতঃপর বিতির পড়তেন। ");
        this.map_var.put("References", "২৫.\tমাসান্নেফে ইবনে আবি শাইবা: ৭৬৯২, মাসনাদে ইবনে হুমায়েদ: ৬৫৩, তারবানীর মু'জামুল কাবির: ১২১০ ও মু'জামে আউসাত: ৭৯৮, বাযহাকীর সুনানে কুবরাহ: ২/৪৯৬ হা: ৪৩৯১");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "২৬নং হাদিস");
        this.map_var.put("Heading", "শবে বরাতের ফযিলত");
        this.map_var.put("Arabic", "عَنْ مُعَاذِ بْنِ جَبَلٍ، عَنِ النَّبِيِّ ﷺ قَالَ: يَطْلُعُ اللَّهُ تَعَالَى إِلَى خَلْقِهِ لَيْلَةَ النِّصْفِ مِنْ شَعْبَانَ فَيَغْفِرُ لِجَمِيعِ خَلْقِهِ إِلا لِمُشْرِكٍ أَوْ مُشَاحِنٍ – (رواه ابن حبان)");
        this.map_var.put("Syllable", "উচ্চারণ : আন মু’আজিবনি জাবাল আনিন্নাবিয়্যি সাল্লাল্লাহু আলাইহি ওয়া সাল্লামা ক্বালা: ইয়াতলু উল্লাহু তা’আলা ইলা খালক্বিহি লাইলাতান নিসফি মিন শা’বানা ফা-ইয়াগফিরু লিজামি’ই খালক্বিহি ইল্লা লি-মুশরিকিন আও মুশাহিনিন (রাওয়াহু ইবনু হিব্বান)।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত মুয়াজ ইবনে জাবাল রাদ্বিয়াল্লাহু আনহু থেকে বর্ণিত, নবীজী সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম এরশাদ করেছেন, শাবানের মধ্যতম রজনীতে (১৫ই শাবান) আল্লাহ পাক বান্দাহদের উপর রহমতের দৃষ্টি দান করেন এবং মুশরিক ও ঝগড়া বিবাদে লিপ্ত ব্যক্তি ব্যতীত সকলকে ক্ষমা করে দেন।");
        this.map_var.put("References", "২৬.\tসহিহ ইবনে হিব্বান: ১২/৪৮১ হা:৫৬৬৫");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "২৭নং হাদিস");
        this.map_var.put("Heading", "নবীজীর পিতা-মাতা মু’মিন ছিলেন");
        this.map_var.put("Arabic", "عَنِ ابْنِ عَبَّاسٍ ، رَضِيَ اللَّهُ عَنْهُمَا ، قَالَ : قَالَ رَسُولُ اللَّهِ ﷺ مَا وَلَدَنِي مِنْ سِفَاحٍ أَهْلُ الْجَاهِلِيَّةِ شَيْءٌ ، مَا وَلَدَنِي إِلا نِكَاحٌ كَنِكَاحِ الإِسْلامِ - (رواه الطبرني و البيهقي و ابن عساكر(");
        this.map_var.put("Syllable", "উচ্চারণ : আন ইবনে আব্বাস রাদ্বিয়াল্লাহু আনহুমা ক্বালা, ক্বালা রাসুলুল্লাহি সাল্লাল্লাহু আলাইহি ওয়াসাল্লামা: মা ওলাদানী মিন সিফাহী আহলিল জাহিলিয়্যাতি শাই-উন, মা ওয়ালাদানী ইল্লা নিকাহুন কা-নিহাহিল ইসলামি (রাওয়াহুত ত্বাবরানী ওয়াল বায়হাক্বী ওয়া ইবনু আসাকির)।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত ইবনে আব্বাস রাদ্বিয়াল্লাহু আনহুমা থেকে বর্ণিত তিনি বলেন, নবীজী সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম এরশাদ করেছেন, আমার সম্মানিত পিতা-মাতার মধ্যে জাহেলী যুগের বিন্দু পরিমাণ খারাপ কিছু ছিল না। এবং আমার জন্ম ইসলাম সম্মত বিবাহ বন্ধনের মাধ্যমে হয়েছে। ");
        this.map_var.put("References", "২৭.\tতাবরানী মুজামুল কাবির: ১০/৩২৯ হা: ১০৮১২, বাযহাকী সুনানে কুবরা: ৭/১৯০ হা: ১৩৮৫৪, ইবনে আসাকির তারিখে দামেস্ক: ৩/৪০০");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "২৮নং হাদিস");
        this.map_var.put("Heading", "নবীজী সোমবার রোযা রাখতেন");
        this.map_var.put("Arabic", "عن أبى قتادة حينما سُئِلَ النبي ﷺ عَنْ صَوْمِ يَوْمِ الِاثْنَيْنِ قَالَ ذَاكَ يَوْمٌ وُلِدْتُ فِيهِ وَيَوْمٌ بُعِثْتُ أَوْ أُنْزِلَ عَلَيَّ فِيهِ- (رواه مسلم)");
        this.map_var.put("Syllable", "উচ্চারণ : আন আবি ক্বাতাদাতা হিনামা সু-ইলান্নাবিয়্যি সাল্লাল্লাহু আলাইহি ওয়াসাল্লামা আন সাওমি ইয়াওমিল ইসনাইনি ক্বালা যা’কা ইয়াওমু উলিদতু ফীহি ওয়া ইয়াওমুন বু’ইছতু আও উনযিলা আলাইয়্যা ফীহি (রাওয়াহু মুসলিম)।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত আবু কাতাদাহ রাদ্বিয়াল্লাহু আনহু থেকে বর্ণিত, একদা নবীজী সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম কে প্রতি সোমবারে রোযা রাখা সম্পর্কে জিজ্ঞেস করা হল, নবীজী সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম ইরশাদ করলেন, এই দিনে আমি জন্ম গ্রহণ করেছি এবং এই দিনে আমাকে নবী হিসেবে প্রেরণ করা হয়েছে অথবা আমার উপর কুরআন অবতীর্ণ করা হয়েছে। ");
        this.map_var.put("References", "২৮.\tসহিহ মুসলিম: কিতাব: সিয়াম ২/৮১৯ হা: ১১৬২, নাসাঈ কৃত সুনানে কুবরা: ২/১৪৬ হা: ২৭৭৭, মুসনাদে আহমদ বিন হাম্বল: ৫/২৯৭ হা: ২২৫৯৪");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "২৯নং হাদিস");
        this.map_var.put("Heading", "সাহাবাগণ নবীজীর সম্মানে ক্বিয়াম করতেন");
        this.map_var.put("Arabic", "عَنْ أَبِي هُرَيْرَةَ رَضِيَ اللَّهُ عَنْهُ كَانَ رَسُولُ اللَّهِ ﷺ يَجْلِسُ مَعَنَا فِي الْمَجْلِسِ يُحَدِّثُنَا فَإِذَا قَامَ قُمْنَا قِيَامًا حَتَّى نَرَاهُ قَدْ دَخَلَ بُيُوتَ أَزْوَاجِهِ- (رواه أَبُو دَاوُد)");
        this.map_var.put("Syllable", "উচ্চারণ : আন আবি হুরায়রাতা রাদ্বিয়াল্লহু আনহু কানা রাসুলুল্লাহি সাল্লাল্লাহু আলাইহি ওয়াসাল্লামা ইয়াজলিছু মা’আনা ফীল মাজলিছি ইউহাদ্দিছুনা ফা-ইজা ক্বামা কুমনা ক্বিয়ামান হাত্তা নারাহু ক্বাদ দাখালা বুয়ুতা আয-ওয়াজিহি (রাওয়াহু আবু দাউদ)।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত আবু হুরায়রা রাদ্বিয়াল্লাহু আনহু থেকে বর্ণিত, তিনি বলেন, নবীজী সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম আমাদের সাথে মসজিদে নববীতে বসে দ্বীনি বিষয়ে আলোচনা করতেন। যখন তিনি দাঁড়াতেন, আমরাও দাঁড়িয়ে যেতাম। ততক্ষণ পর্যন্ত আমরা দাড়িয়ে থাকতাম যতক্ষণ পর্যন্ত না আমরা দেখতাম তিনি তার কোন এক বিবির ঘরে প্রবেশ করছেন।");
        this.map_var.put("References", "২৯.\tআবু দাউদ ও বায়হাকী ফি শুয়াবুল ঈমান, ৬ষ্ঠ খন্ড, মিশকাত শরীফ, কিতাবুল আদব, বাবুল কিয়াম, হা: ৪৭০১");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "৩০নং হাদিস");
        this.map_var.put("Heading", "দরূদ ও সালাম পাঠের ফযিলত");
        this.map_var.put("Arabic", "عَنِ ابْنِ مَسْعُودٍ رضي الله عنه - قَالَ: قَالَ رَسُولُ اَللَّهِ ﷺ إِنَّ أَوْلَى اَلنَّاسِ بِي يَوْمَ اَلْقِيَامَةِ, أَكْثَرُهُمْ عَلَيَّ صَلَاةً- (رواه الترمذي و ابن حبان)");
        this.map_var.put("Syllable", "উচ্চারণ : আন ইবনে মাস’ঊদ রাদ্বিয়াল্লাহু আনহু ক্বালা, ক্বালা রাসুলুল্লাহি সাল্লাল্লাহু আলাইহি ওয়া সাল্লামা ইন্না আওলা ন্নাছি বি ইয়াওমাল ক্বিয়ামাতি, আকছারুহুম আলাইয়্যা সালাতান (রাওয়াহুত তিরমিজি ওয়া ইবনু হিব্বান)।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত আব্দুল্লাহ ইবনে মাসউদ রাদ্বিয়াল্লাহু আনহু হতে বর্ণিত, তিনি বলেন, নবীজী সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম এরশাদ করেছেন, কিয়ামতের ময়দানে সে ব্যক্তি আমার সবচেয়ে বেশি নিকটবর্তী থাকবে যে ব্যক্তি (দুনিয়াতে) আমার উপর সবচেয়ে বেশি দুরূদ ও সালাম পেশ করেছে। ");
        this.map_var.put("References", "৩০.\tতিরমিজি: ২/৩৫৪ হা: ৪৮৪, সহিহ ইবনে হিব্বান: ৩/১৯২ হা: ৯১১, বায়হাকীর সুনানে কুবরা: ৩/২৪৯ হা: ৫৭৯১");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "৩১নং হাদিস");
        this.map_var.put("Heading", "সৃষ্টিকুলে নবীজীর মত কেউ নেই");
        this.map_var.put("Arabic", "عَنْ أَبِي هُرَيْرَةَ ، قَالَ : نَهَى رَسُولُ اللهِ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ عَنِ الوِصَالِ ، قَالُوا : فِإِنَّكَ تُوَاصِلُ ، قَالَ : أيُّكُمْ مِثْلِي ؟ ، إِنِّي أَبِيتُ يُطْعِمُنِي رَبِّي وَيَسْقِينِ- (متفق عليه)");
        this.map_var.put("Syllable", "উচ্চারণ : আন আবি হুরায়রাতা, ক্বালা: নাহা রাসুলুল্লাহি সাল্লাল্লাহু আলাইহি ওয়া সাল্লামা আনিল বিসালে, ক্বালু: ফা-ইন্নাকা তুওয়াসিলু, ক্বালা: আইয়ুকুম মিছলী? ইন্নি আবিতু ইউত্ব-‘ইমুনী রাব্বী ওয়া ইয়াসক্বীনি (মুত্তাফাকুন আলাইহি)।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত আবু হুরায়রা রাদ্বিয়াল্লাহু আনহু থেকে বর্ণিত তিনি বলেন, নবী করীম সাল্লাল্লাহু আলাইহি ওয়া সাল্লাম সওমে বেসাল রাখতে নিষেধ করেছেন। তখন কিছু সাহাবী নবীজী সাল্লাল্লাহু আলাইহি ওয়া সাল্লাম এর নিকট আরজ করলেন, হে আল্লাহর রাসুল! আপনি নিজেতো সওমে বেসাল পালন করেন। নবীজী এরশাদ করলেন, তোমাদের মধ্যে কে আছ আমার মত? আমি তো এমন ভাবে রাত্রিযাপন করি যেন আমার রব আমাকে খাওয়ান এবং পান করান। \n\nনোট : ‘সওমে বেসাল ’ এমন রোজা যার কোন সেহরি ও ইফতার নেই।");
        this.map_var.put("References", "৩১.\tসহিহ বোখারী: অধ্যায়: রোজা ২/৬৯৩ হা: ১৮৬১, সহিহ মুসলিম: ২/৭৭৪ হা: ১১০২, সুনানে আবু দাউদ: ২/৩০২ হা: ২৩৬০, সুনানে কুবরা নাসাঈ: ২/২৪১ হা: ২৩৬৩, মুয়াত্তা ইমাম মালেক: ১/৩০০ হা: ৬৬৭, মুসনাদে আহমদ বিন হাম্বল ২/১০২ হা: ৫৭৯৫, সহিহ ইবনে হিব্বান: ৮/৩৪১ হা: ৩৫৭৫");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "৩২নং হাদিস");
        this.map_var.put("Heading", "নবীজী কখন নবুয়্যত লাভ করেছেন?");
        this.map_var.put("Arabic", "عَنْ أَبِي هُرَيْرَةَ، قَالَ: قَالُوا يَا رَسُولَ اللَّهِ مَتَى وَجَبَتْ لَكَ النُّبُوَّةُ؟ قَالَ وَآدَمُ بَيْنَ الرُّوحِ وَالجَسَدِ-");
        this.map_var.put("Syllable", "উচ্চারণ : আন আবি হুরায়রাতা ক্বালা, ক্বালু ইয়া রাসুলাল্লাহ! মাতা ওয়াজাবাত লাকান্নুবুয়াতু? ক্বালা ওয়া আদামু বাইনার রূহী ওয়াল জাসাদি।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত আবু হুরায়রা রাদ্বিয়াল্লাহু আনহু থেকে বর্ণিত, তিনি বলেন, সাহাবায়ে কেরামগন আরজ করলেন, হে আল্লাহর রাসুল! আপনার উপর কখন নবুয়্যতের দায়িত্বারোপ করা হয়েছে? নবীজী এরশাদ করলেন, যখন আদম নবী শরীর ও রূহের মধ্যবর্তী স্তরে ছিলেন। (অর্থাৎ যখন আদম নবী এর রূহ ও শরীরের মধ্যে কোন সম্পর্ক স্থাপিত হয়নি, আমি তখনও নবী ছিলাম)। ");
        this.map_var.put("References", "৩২.\tসুনানে তিরমিজি: ৫/৫৮৫ হা: ৩২০৯, মুসনাদে আহমদ বিন হাম্বল: হা: ২৩৬২০, মুস্তাদরাকে হাকেম: হা: ৪২০৯-৪২১০, মুসান্নেফে ইবনে শাইবা: ৩৬৯/৭ হা: ৩৬৫৫৩");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "৩৩নং হাদিস");
        this.map_var.put("Heading", "নবীজীর পাঁচটি নাম");
        this.map_var.put("Arabic", "عَنْ مُحمّدِ بنِ جُبَيْرِ بنِ مُطْعِمٍ عن أَبِيهِ قال قال رَسُولُ الله صلى الله عليه وسلم: إِنّ لِي خمسة أَسْمَاءَ: أَنَا مُحمّدُ، وَأَنا أَحْمَدُ، وَأَنَا الْمَاحِي الّذِي يَمْحُو الله بِي الْكُفْرَ، وَأَنَا الْحَاشِرُ الّذِي يُحْشَرُالنّاسُ عَلَى قَدَمَيّ، وَأَنَا الْعَاقِبُ-");
        this.map_var.put("Syllable", "উচ্চারণ : আন মুহাম্মাদিবনি জুবায়েরিবনি মুত্বইম আন আবীহি ক্বালা, ক্বালা রাসুলুল্লাহি সাল্লাল্লাহু আলাইহি ওয়া সাল্লামা: ইন্না লী খামছাতা আছমাআ আনা মুহাম্মাদু, ওয়া আনা আহমাদু, ওয়া আনাল মাহী আল্লাযী ইয়ামহুল্লাহু বিল কুফরা, ওয়া আনাল হাশিরু আল্লাযী ইউহশারুন নাছু আলা কাদামি, ওয়া আনাল আক্বিব।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত মুহাম্মাদ বিন যুবাইর বিন মুতঈম রাদ্বিয়াল্লাহু আনহু থেকে বর্ণিত, তিনি তার বাবা থেকে বর্ণনা করেন, নবীজী সাল্লাল্লাহু আলাইহি ওয়া সাল্লামা এরশাদ করেন, আমার পাঁচটি নাম আছে- (১) আমি ‘মুহাম্মাদ’ (প্রশংসিত), (২) আমি ‘আহমদ’ (অধিক প্রশংসাকারী), (৩) আমি ‘মাহী’ (মোচনকারী) কেননা আল্লাহ তা‘আলা আমার দ্বারা কুফরকে মিটিয়ে দিবেন, (৪) আমি ‘হাশের’ (সমবেতকারী), সকল লোককে আমার কদমে সমবেত করা হবে কিয়ামতের ময়দানে, (৫) এবং আমি ‘আক্বিব’ সর্বশেষ আগমনকারী (শেষ নবী)। ");
        this.map_var.put("References", "৩৩.\tসহিহ বোখারী: ৩/১২৯৯ হা: ৩৩৩৯, ৪/১৮৫৮ হা: ৪৬১৪, সহিহ মুসলিম: অধ্যায়: ফাযায়েল ৪/৮২৭ হা: ২৩৫৪, সুনানে তিরমিজি: ৫/১৩৫, হা: ২৮৪, সুনানে নাসাঈ: ৬/৪৮৯ হা: ১১৫৯০, মুয়াত্তা ইমাম মালেক: ২/১০০৪, মসনাদে আহমদ বিন হাম্বল: ৪/৮০, ৮৪, সহিহ ইবনে হিব্বান: ১৪/২১৯ হা: ৬৩১৩");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "৩৪নং হাদিস");
        this.map_var.put("Heading", "নবীজীর উছিলায় দোয়া");
        this.map_var.put("Arabic", "عَنْ عُثْمَانَ بْنِ حُنَيْفٍ أَنَّ رَجُلًا ضَرِيرَ الْبَصَرِ أَتَى النَّبِيَّ صَلَّى اللَّهُ عَلَيْهِ وَسَلَّمَ فَقَالَ : ادْعُ اللَّهَ أَنْ يُعَافِيَنِي قَال انْ شِئْتَ دَعَوْتُ وَإِنْ شِئْتَ صَبَرْتَ فَهُوَ خَيْرٌ لَكَ قَالَ فَادْعُهْ قَالَ فَأَمَرَهُ أَنْ يَتَوَضَّأَ فَيُحْسِنَ وُضُوءَهُ وَيَدْعُوَ بِهَذَا الدُّعَاءِ اللَّهُمَّ إِنِّي أَسْأَلُكَ وَأَتَوَجَّهُ إِلَيْكَ بِنَبِيِّكَ مُحَمَّدٍ نَبِيِّ الرَّحْمَةِ يَا مُحّمَّدَ! إِنِّي تَوَجَّهْتُ بِكَ إِلَى رَبِّي فِي حَاجَتِي هَذِهِ لِتُقْضَى لِيَاللَّهُمَّ فَشَفِّعْهُ فِيَّ-");
        this.map_var.put("Syllable", "উচ্চারণ : আন উছমানাবনি হুনাইফিন আন্না রাজুলান, দ্বারিরাল বাছারি আতান্নাবীয়্যা সাল্লাল্লাহু আলাইহি ওয়া ছাল্লামা ফাক্বালা: উদ’উল্লাহা আয় ইউ’আফিয়ানী ক্বালা ইন শি’তা দা’আওতু ওয়া ইন শি’তা ছাবারতা ফাহুয়া খায়রুল্লাকা। ক্বালা ফাদ’উহু ক্বালা ফাআমারাহু আয় ইয়াতাওয়াদ্দা ফাইউহছিনা ওদ্বুয়াহু ওয়া ইয়াদউয়া বিহাজাদ্দো’আয়ে “আল্লাহুম্মা ইন্নি আছআলুকা ওয়া আতাওয়াজ্জাহু ইলাইকা বিনাবিয়্যিকা মুহাম্মাদিন নাবিয়্যির রাহমাতি, ইয়া মুহাম্মাদু ইন্নি তাওয়াজ্জাহতু বিকা ইলা রাব্বী ফী হা-জাতী হাজিহি লিতুক্বদ্বা, লিয়া আল্লাহুম্মা ফাশাফফি’হু ফিয়্যা”।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত ওসমান ইবনে হুনাইফ রাদ্বিয়াল্লাহু আনহু থেকে বর্ণিত, তিনি বলেন, এক অন্ধ ব্যক্তি প্রিয়নবী সাল্লাল্লাহু আলাইহি ওয়া সাল্লামার দরবারে হাজির হয়ে আরজ করল, আমার চোঁখে জ্যোতি ফিরে পাবার জন্য দোয়া করুন। নবীজী সাল্লাল্লাহু আলাইহি ওয়া সাল্লাম বললেন, তুমি যদি চাও আমি তোমার জন্য দোয়া করবো, আর যদি অপেক্ষা করতে চাও, তবে সেটা তোমার জন্য মঙ্গলজনক হবে। সে আরজ করল আক্বা এখনই দোয়া করুন। নবীজী সাল্লাল্লাহু আলাইহি ওয়া সাল্লাম তাকে ভালোভাবে অজু করার এবং দু’রাকাত নামাজ পড়ার হুকুম করলেন। এবং বললেন- এই ভাবে দোয়া কর, “হে আল্লাহ! আমি আপনার দিকে মনোনিবেশ করছি এবং আপনার নিকট প্রার্থনা করছি আপনার নবী, রহমতের নবী মুহাম্মদ সাল্লাল্লাহু আলাইহি ওয়া সাল্লাম এর উছিলায়। হে মুহাম্মাদ! আপনার উছিলায় আমি আমার প্রভুর কাছে হাজত (সমস্যা) পেশ করছি, আমার আবেদন যেন মঞ্জুর করা হয়। হে আল্লাহ! আমার হক্বের উপর আমার আক্বা ও মাওলা সাল্লাল্লাহু আলাইহি ওয়া সাল্লাম এর সুপারিশ কবুল করুন। ");
        this.map_var.put("References", "৩৪.\tসুনানে তিরমিজি: ৫/৫৬৯ হা: ৩৫৭৮, সুনানে নাসাঈ: ৬/১৬৮ হা: ১০৪৯৪-১০৪৯৫, সুনানে ইবনে মাজাহ: ১/৪৪১ হা: ১৩৮৫, সহিহ ইবনে খুযাইমা: ২/২২৫ হা: ১২১৯, মুসনাদে আহমদ বিন হাম্বল: ৪/১৩৮ হা: ১৭২৪০-১৭২৪২, মুস্তাদরাকে হাকেম: ১/৪৫৮/৭০০/৭০৭ হা: ১১৮০, ১৯০৯, ১৯২৯");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "৩৫নং হাদিস");
        this.map_var.put("Heading", "নবীজী মাক্বামে মাহমুদে অধিষ্ঠিত হবেন");
        this.map_var.put("Arabic", "عَنْ آدَمَ بْنِ عَلِيٍّ، قَالَ: سَمِعْتُ ابْنَ عُمَرَ رَضِيَ اللَّهُ عَنْهُمَا، يَقُولُ: إِنَّ النَّاسَ يَصِيرُونَ يَوْمَ القِيَامَةِ جُثًا، كُلُّ أُمَّةٍ تَتْبَعُ نَبِيَّهَا يَقُولُونَ: يَا فُلاَنُ اشْفَعْ، يَا فُلاَنُ اشْفَعْ، حَتَّى تَنْتَهِيَ الشَّفَاعَةُ إِلَى النَّبِيِّ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ، فَذَلِكَ يَوْمَ يَبْعَثُهُ اللَّهُ المَقَامَ المَحْمُودَ-");
        this.map_var.put("Syllable", "উচ্চারণ : আন আদামাবনি আলী ক্বালা, ছামি’তু ইবনা উমারা রাদ্বিয়াল্লাহু আনহুমা ইয়াকুলু: ইন্নান্নাছা ইয়াছিরুনা ইয়াওমাল ক্বিয়ামাতি জুছান, কুল্লু উম্মাতিন তাতবা’উ নাবিয়্যাহা ইয়াকুলুনা: ইয়া ফুলান, ইশফা হাত্তা তানতাহীয়া-শ শাফা’আতু ইলা-ন্নাবিয়্যি সাল্লাল্লাহু আলাইহি ওয়া ছাল্লামা, ফা-জালিকা ইয়াওমা ইয়াব’আছুহুল্লাহুল মাক্বামাল মাহমুদা।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত আদম বিন আলী রাদ্বিয়াল্লাহু আনহুমা থেকে বর্ণিত, তিনি বলেন, আমি আব্দুল্লাহ বিন ওমর রাদ্বিয়াল্লাহু আনহুমা কে বলতে শুনেছি, কেয়ামতের দিন মানুষেরা দলে দলে বিভক্ত হয়ে পড়বে। প্রত্যেক উম্মত তাদের নিজ নিজ নবীর পেছনে থাকবে এবং আরজ করবে, (হে অমুক! আমাকে শাফায়াত করুন) এমনিভাবে শাফায়াতের কথা নবীজীর কাছে এসে সমাপ্ত হবে। তাই ঐদিনে আল্লাহ পাক নবীজিকে মাক্বামে মাহমুদে অধিষ্ঠিত করবেন। ");
        this.map_var.put("References", "৩৫.\tসহিহ বোখারী: অধ্যায়: কোরআনের তাফসির ৪/১৭৪৭ হা: ৪৪৪১, সুনানে কুবরা নাসাঈ: ৬/৩৮১ হা: ২৯৫");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "৩৬নং হাদিস");
        this.map_var.put("Heading", "নবীজী গায়েবের খবর প্রদানকারী");
        this.map_var.put("Arabic", "عَنِ عُمَرَ رَضِيَ اللَّهُ عَنْهُ يَقُولُ قَامَ فِينَا النَّبِيُّ صَلَّى اللَّهُ عَلَيْهِ وَسَلَّمَ مَقَامًا فَأَخْبَرَنَا عَنْ بَدْءِ الْخَلْقِ حَتَّى دَخَلَ أَهْلُ الْجَنَّةِ مَنَازِلَهُمْ وَأَهْلُ النَّارِ مَنَازِلَهُمْ حَفِظَ ذَلِكَ مَنْ حَفِظَهُ وَنَسِيَهُ مَنْ نَسِيَهُ-");
        this.map_var.put("Syllable", "উচ্চারণ : আন উমারা রাদ্বিয়াল্লাহু আনহু ইয়াকুলু ক্বামা ফীনা-ন্নাবিয়ি্যু সাল্লাল্লাহু আলাইহি ওয়াসাল্লামা মাক্বামান ফা-আখবারানা আন বাদ-ইল খালক্বি হাত্তা দাখালা আহলুল জান্নাতি মানাযি লাহুম ওয়া আহলু ন্নারি মানাযি লাহুম হাফিযা জালিকা মান হাফিযাহু ওয়া নাছিয়াহু মান নাছিয়াহু।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত ওমর রাদ্বিয়াল্লাহু আনহু থেকে বর্ণিত, তিনি বলেন, একদা নবীজী আমাদের দ-ায়মান ছিলেন। নবীজী সৃষ্টির শুরু থেকে জান্নাতিদের জান্নাতে প্রবেশ করা এবং দোযখীদের দোযখে প্রবেশ করা পর্যন্ত সব কিছু বলে দিলেন। যে সেটা মুখস্ত করতে পেরেছে সে করেছে, যে ভুলে যাওয়ার সে ভুলে গেছে। ");
        this.map_var.put("References", "৩৬.\tসহিহ বোখারী: অধ্যায়: সৃষ্টির শুরু ৩/১১৬৬ হা: ৩০২০");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "৩৭নং হাদিস");
        this.map_var.put("Heading", "সাহাবায়ে কেরামের সমালোচনা করা কুফরী");
        this.map_var.put("Arabic", "عَنِ ابْنِ عَبَّاسٍ ، رَضِيَ اللَّهُ عَنْهُمَا ، قَالَ : قَالَ رَسُولُ اللَّهِ صَلَّى اللَّهُ عَلَيْهِ وَسَلَّمَ مَنْ سَبَّ اَصْحَابِي فَعَلَيْهِ لَعْنَةُاللهِ و المَلائِكَةِ وَالنَّاسِ أَجْمَعينَ-");
        this.map_var.put("Syllable", "উচ্চারণ : আন ইবনে আব্বাস রাদ্বিয়াল্লাহু আনহুমা ক্বালা, ক্বালা রাসুলুল্লাহি সাল্লাল্লাহু আলাইহি ওয়াসাল্লামা মান ছাব্বা আছহাবি ফা-আলাইহি লা’নাতুল্লাহি ওয়াল মালা-ইকাতি ওয়ান্নাছি আজমাঈন।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত ইবনে আব্বাস রাদ্বিয়াল্লাহু আনহু থেকে বর্ণিত, তিনি বলেন, নবীজী এরশাদ করেন, যে ব্যক্তি আমার সাহাবীদের নিয়ে সমালোচনা করে তার উপর আল্লাহর, ফেরেস্তাদের এবং সকল মানব জাতির অভিসম্পাত। ");
        this.map_var.put("References", "৩৭.\tতাবরানী কৃত মুজামুল কাবির: ১২/১৪২ হা: ১২৭০৯, মুজামুল আউছাতে আবু সাঈদ খুদরী (রা) সুত্রে, ৫/৯৪ হা: ৪৭৭১, মুসান্নাফে ইবনে আবি শাইবা: ৬/৪০৫ হা: ৩২৪১৯");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "৩৮নং হাদিস");
        this.map_var.put("Heading", "আহলে বাইত উম্মতের নাজাতের উছিলা");
        this.map_var.put("Arabic", "عَنْ أَبِي سَعِيدٍ الْخُدْرِيِّ ، قَالَ : سَمِعْتُ رَسُولَ اللَّهِ صَلَّى اللَّهُ عَلَيْهِ وَآلِهِ وَسَلَّمَ : إِنَّمَا مَثَلُ أَهْلِ بَيْتِي فِيكُمْ كَمَثَلِ سَفِينَةِ نُوحٍ ، مَنْ رَكِبَهَا نَجَا وَمَنْ تَخَلَّفَ عَنْهَا غَرِقَ-");
        this.map_var.put("Syllable", "উচ্চারণ : আন আবী সা’ইদিনিল খুদরী ক্বালা, ছামি’তু রাসুলাল্লাহি সাল্লাল্লাহু আলাইহি ওয়া ছাল্লামা, ইন্নামা মাছালু আহলি বাইতী ফীকুম কামাছালি ছাফিনাতি নূহিন, মান রাকিবাহা নাজা ওয়ামান তাখাল্লাফা আনহা গারিকা।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত আবু সাঈদ খুদরী রাদ্বিয়াল্লাহু আনহু থেকে বর্ণিত, তিনি বলেন, আমি নবীজীকে বলতে শুনেছি, তোমাদের মধ্যে আমার আহলে বাইতের দৃষ্টান্ত হযরত নূহ আলাইহিস সালাম এর কিস্তির মত। এতে যে আরোহণ করেছে সে মুক্তি পেয়েছে, আর যে এটা থেকে মুখ ফিরিয়ে নিয়েছে, সে ধ্বংস হয়েছে। ");
        this.map_var.put("References", "৩৮.\tতাবরানী কৃত মুজামুল কাবির: ১২/৩৪ হা: ২৩৭৭, ২৬৩৭, ২৬৩৮, ২৬৩২, মুজামুল আউছাত: ৪/১০ হা: ৩৪৭৮, মুজামুল ছাগির: ১/২৪০ হা: ৩৯১, মুসতাগরেকে হাকেম: ৩/১৬৩ হা: ৪৭২০");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "৩৯নং হাদিস");
        this.map_var.put("Heading", "উম্মতে মুহাম্মদী কখনও শিরক করবে না");
        this.map_var.put("Arabic", "عَنْ عُقْبَةَ بْنِ عَامِرٍ : قَالَ قَال رَسُولَ اللَّهِ صَلَّى اللَّهُ عَلَيْهِ وَسَلَّمَ : إِنِّي فَرَطُ لَكُمْ ، وَأَنَا شَهِيدٌ عَلَيْكُمْ ، وَإِنِّي وَاللَّهِ لَأَنْظُرُ إِلَى حَوْضِي الْآنَ ، وَإِنِّي أُعْطِيتُ مَفَاتِيحَ خَزَائِنِ الْأَرْضِ أَوْ مَفَاتِيحَ الْأَرْضِ ، وَإِنِّي وَاللَّهِ مَا أَخَافُ عَلَيْكُمْ أَنْ تُشْرِكُوا بَعْدِي ، وَلَكِنِّي أَخَافُ عَلَيْكُمْ أَنْ تَنَافَسُوا فِيهَا-");
        this.map_var.put("Syllable", "উচ্চারণ : আন উকবাতাবনি আ‘মের ক্বালা, ক্বালা রাসূলুল্লাহি সাল্লাল্লাহু আলাইহি ওয়াসাল্লামা ইন্নি ফারাতুল লাকুম ওয়া আনা শাহিদুন আলাইকুম, ওয়া ইন্নি ওয়াল্লাহি লা আন যুরু ইলা হাওদ্বি আল আন, ওয়া ইন্নি আতিতু মাফাতিহা খাজাইনিল আরদ আও মাফাতিহাল আরদ্বি, ওয়া ইন্নি ওয়াল্লাহি মা আখাফু আলাইকুম আন তুশরিকু বা‘দি ওয়া লাকিন্নি অখাফু আলাইকুম আন তানাফাসু ফিহা।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত উক্ববা বিন আমের রাদ্বিয়াল্লাহু আনহু থেকে বর্ণিত, তিনি বলেন, নবীজী এরশাদ করেন, আমি তোমাদের অগ্রবর্তী ও তোমাদের উপর সাক্ষ্যদাতা। খোদার কসম! অবশ্যই এই মুহুর্তে আমি আমার হাউজ (কাউছার) দেখতে পাচ্ছি এবং অবশ্যই আমাকে জমিনের খাজানাসমূহের চাবি অথবা জমিনের চাবি দেওয়া হয়েছে। খোদার কসম! আমি এ নিয়ে ভীত নই যে, তোমরা আমার পরে শিরিকে লিপ্ত হবে বরং আমি এ নিয়ে ভীত যে, তোমরা দুনিয়া নিয়ে ব্যস্ত হয়ে যাবে। ");
        this.map_var.put("References", "৩৯.\tসহিহ বুখারী: অনুচ্ছেদ: মানাকিব, অধ্যায়: ইসলামে নবুয়্যতের আলামত ৩/১৩১ হা: ৩৪০১, সহিহ মুসলিম: অনুচ্ছেদ: ফাযায়েল, অধ্যায়: নবী এর হাউজের প্রমান ও বৈশিষ্ট্য ৪/১৭৯৫ হা: ২২৯৬");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("Serial", "৪০নং হাদিস");
        this.map_var.put("Heading", "শেষ জামানায় দাজ্জাল ও মিথ্যাবাদীদের আবির্ভাব হবে");
        this.map_var.put("Arabic", "عَنْ أَبِي هُرَيْرَةَ، قَالَ قَالَ رَسُولُ اللَّهِ صَلَّى اللَّهُ عَلَيْهِ وَسَلَّمَ يَكُونُ فِي آخِرِ الزَّمَانِ دَجَّالُونَ كَذَّابُونَ يَأْتُونَكُمْ مِنْ الْأَحَادِيثِ بِمَا لَمْ تَسْمَعُوا أَنْتُمْ وَلَا آبَاؤُكُمْ فَإِيَّاكُمْ وَإِيَّاهُمْ لَا يُضِلُّونَكُمْ وَلَا يَفْتِنُونَكُمْ-");
        this.map_var.put("Syllable", "উচ্চারণ : আন আবী হুরায়রাতা ক্বালা, ক্বালা রাসুলুল্লাহি সাল্লাল্লাহু আলাইহি ওয়া সাল্লামা ইয়াকুনু ফী আখিরিয যামানি দাজ্জালুনা কাজ্জাবুনা ইয়া’তুনাকুম মিনাল আহাদীছি বিমা লাম তাছমা’উ আনতুম ওয়ালা আবাউকুম ফা-ইয়্যাকুম ওয়া ইয়্যাহুম লা ইউদ্বিল্লুনাকুম ওয়ালা ইয়াফতিনুনাকুম।");
        this.map_var.put("Onubad", "অনুবাদ : হযরত আবু হুরায়রা রাদ্বিয়াল্লাহু আনহু থেকে বর্ণিত, তিনি বলেন, নবীজী সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম এরশাদ করেন, শেষ যামানায় এমন কিছু দাজ্জাল ও মিথ্যাবাদী আত্মপ্রকাশ করবে যারা তোমাদের নিকট এমন সব (মিথ্যা) হাদিস বলবে যা না তোমরা কোনদিন শুনেছো, না তোমাদের বাপ দাদারা শুনেছে। সুতরাং তোমরা তাদের নিকট থেকে দূরে থাক এবং তাদেরকেও তোমাদের কাছ থেকে দূরে রাখ। এতে করে তারা তোমাদের পথভ্রষ্ট করতে পারবে না এবং তোমাদেরকে ফিতনায় পতিত করতে পারবে না। ");
        this.map_var.put("References", "৪০.\tসহিহ মুসলিম: ১/২৪, হা: ৮, আল্লামা তাহাবী, মুশকিলুল আসার: ৬/৪৪৮, হা: ২৮৮৪, শাইখ ওলীউদ্দীন, মিশকাতুল মসাবীহ: ১/৩৩ হা: ১৫৪, আল মানাবী, ফয়জুল ক্বাদীর ফি শরহে জামে ‘উস্সাগীর: ৬/২৫৮, হা: ৮৯৩০");
        this.map_list.add(this.map_var);
    }

    private void _Manzil() {
        this.map_var = new HashMap<>();
        this.map_var.put("title", "১. সূরা ফাতেহা, ৭ আয়াত");
        this.map_var.put("arabic", "بِسۡمِ اللهِ الرَّحۡمٰنِ الرَّحِيۡمِ\n اَلۡحَمۡدُ لِلّٰهِ رَبِّ الۡعٰلَمِيۡنَۙ\u200f ﴿۱﴾ الرَّحۡمٰنِ الرَّحِيۡمِۙ\u200f ﴿۲﴾ مٰلِكِ يَوۡمِ الدِّيۡنِؕ\u200f ﴿۳﴾ اِيَّاكَ نَعۡبُدُ وَاِيَّاكَ نَسۡتَعِيۡنُؕ\u200f ﴿۴﴾ اِهۡدِنَا الصِّرَاطَ الۡمُسۡتَقِيۡمَۙ\u200f ﴿۵﴾ صِرَاطَ الَّذِيۡنَ اَنۡعَمۡتَ عَلَيۡهِمۡ ۙ\u200f ﴿۶﴾ غَيۡرِ الۡمَغۡضُوۡبِ عَلَيۡهِمۡ وَلَا الضَّآلِّيۡنَ\ue022\u200f ﴿۷﴾");
        this.map_var.put("onubad", "(১) সকল প্রশংসা আল্লাহর জন্য, যিনি সমগ্র বিশ্বের প্রতিপালক, (২) সীমাহীন মেহেরবান, পরম দয়ালু, (৩) কর্মফল দিবসের মালিক। (৪) আমরা আপনারই এবাদত করি এবং আপনারই কাছে সাহায্য প্রার্থনা করি। (৫) আমাদের সরল পথ বাতলিয়ে দিন। (৬) তাদের পথ, যাদের প্রতি আপনি অনুগ্রহ করেছেন, (৭) যাদের উপর আপনার ক্রোধ পতিত হয়নি এবং যারা পথভ্রষ্টও হয়নি।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("title", "২. সূরা বাকারার শুরুর ৫ আয়াত");
        this.map_var.put("arabic", "بِسۡمِ اللهِ الرَّحۡمٰنِ الرَّحِيۡمِ\n الٓمّٓۚ\u200f ﴿۱﴾ ذٰ لِكَ الۡڪِتٰبُ لَا رَيۡبَۛۚۖ فِيۡهِۛۚ هُدًى لِّلۡمُتَّقِيۡنَۙ\u200f ﴿۲﴾ الَّذِيۡنَ يُؤۡمِنُوۡنَ بِالۡغَيۡبِ وَ يُقِيۡمُوۡنَ الصَّلٰوةَ وَمِمَّا رَزَقۡنٰهُمۡ يُنۡفِقُوۡنَۙ\u200f ﴿۳﴾ وَالَّذِيۡنَ يُؤۡمِنُوۡنَ بِمَۤا اُنۡزِلَ اِلَيۡكَ وَمَاۤ اُنۡزِلَ مِنۡ قَبۡلِكَۚ وَبِالۡاٰخِرَةِ هُمۡ يُوۡقِنُوۡنَؕ\u200f ﴿۴﴾ اُولٰٓٮِٕكَ عَلٰى هُدًى مِّنۡ رَّبِّهِمۡ\u200c\ue01c وَاُولٰٓٮِٕكَ هُمُ الۡمُفۡلِحُوۡنَ\u200f ﴿۵﴾");
        this.map_var.put("onubad", "(১) আলিফ লাম মীম। (২) এ সেই কিতাব যাতে কোনই সন্দেহ নেই। পথ প্রদর্শনকারী পরহেযগারদের জন্য, (৩) যারা অদেখা বিষয়ের উপর বিশ্বাস স্থাপন করে এবং নামায প্রতিষ্ঠা করে। আর আমি তাদেরকে যে রুযী দান করেছি তা থেকে ব্যয় করে (৪) এবং যারা বিশ্বাস স্থাপন করেছে সেসব বিষয়ের উপর যা কিছু তোমার প্রতি অবতীর্ণ হয়েছে এবং সেসব বিষয়ের উপর যা তোমার পূর্ববর্তীদের প্রতি অবতীর্ণ হয়েছে। আর আখেরাতকে যারা নিশ্চিত বলে বিশ্বাস করে। (৫) তারাই নিজেদের পালনকর্তার পক্ষ থেকে সুপথ প্রাপ্ত, আর তারাই যথার্থ সফলকাম।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("title", "৩. সূরা বাকারার ১৬৩ নং আয়াত");
        this.map_var.put("arabic", "وَاِلٰهُكُمۡ اِلٰهٌ وَّاحِدٌ\u2002 ۚ لَآ اِلٰهَ اِلَّا هُوَ الرَّحۡمٰنُ الرَّحِيۡمُ\ue022\u200f ﴿۱۶۳﴾");
        this.map_var.put("onubad", "(১৬৩) আর তোমাদের উপাস্যই একমাত্র উপাস্য। তিনি ছাড়া মহা করুণাময় দয়ালু কেউ নেই।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("title", "৪. সূরা বাকারা আয়াত নং ২৫৫, ২৫৬ ও ২৫৭, অর্থাৎ আয়াতুল কুরসী ও তার পরবর্তী ২ আয়াত");
        this.map_var.put("arabic", "اللّٰهُ لَاۤ اِلٰهَ اِلَّا هُوَ الۡحَـىُّ الۡقَيُّوۡمُ\ue021ۚ \u2002لَا تَاۡخُذُهٗ سِنَةٌ وَّلَا نَوۡمٌ\u200cؕ لَهٗ مَا فِى السَّمٰوٰتِ وَمَا فِى الۡاَرۡضِ\u200cؕ مَنۡ ذَا الَّذِىۡ يَشۡفَعُ عِنۡدَهٗۤ اِلَّا بِاِذۡنِهٖ\u200cؕ يَعۡلَمُ مَا بَيۡنَ اَيۡدِيۡهِمۡ وَمَا خَلۡفَهُمۡ\u200cۚ وَلَا يُحِيۡطُوۡنَ بِشَىۡءٍ مِّنۡ عِلۡمِهٖۤ اِلَّا بِمَا شَآءَ ۚ وَسِعَ كُرۡسِيُّهُ السَّمٰوٰتِ وَالۡاَرۡضَ\u200c\u200cۚ وَلَا يَـــُٔوۡدُهٗ حِفۡظُهُمَا \u200cۚ وَ هُوَ الۡعَلِىُّ الۡعَظِيۡمُ\u200f ﴿۲۵۵﴾ لَاۤ اِكۡرَاهَ فِى الدِّيۡنِ\u200cۙ\u2002\ue01e قَد تَّبَيَّنَ الرُّشۡدُ مِنَ الۡغَىِّ\u200cۚ فَمَنۡ يَّكۡفُرۡ بِالطَّاغُوۡتِ وَيُؤۡمِنۡۢ بِاللّٰهِ فَقَدِ اسۡتَمۡسَكَ بِالۡعُرۡوَةِ الۡوُثۡقٰى\ue01c لَا انْفِصَامَ لَهَا\u200c\u200c ؕ وَاللّٰهُ سَمِيۡعٌ عَلِيۡمٌ\u200f ﴿۲۵۶﴾ اَللّٰهُ وَلِىُّ الَّذِيۡنَ اٰمَنُوۡا يُخۡرِجُهُمۡ مِّنَ الظُّلُمٰتِ اِلَى النُّوۡرِ\u200c\ue021ؕ \u2002وَالَّذِيۡنَ كَفَرُوۡۤا اَوۡلِيٰٓـــُٔهُمُ الطَّاغُوۡتُۙ يُخۡرِجُوۡنَهُمۡ مِّنَ النُّوۡرِ اِلَى الظُّلُمٰتِ\u200cؕ اُولٰٓٮِٕكَ اَصۡحٰبُ النَّارِ\u200c\u200cۚ هُمۡ فِيۡهَا خٰلِدُوۡنَ\ue022\u200f ﴿۲۵۷﴾");
        this.map_var.put("onubad", "(২৫৫) আল্লাহ ছাড়া অন্য কোন উপাস্য নেই, তিনি জীবিত, সবকিছুর ধারক। তাঁকে তন্দ্রাও স্পর্শ করতে পারে না এবং নিদ্রাও নয়। আসমান ও যমীনে যা কিছু রয়েছে, সবই তাঁর। কে আছ এমন, যে সুপারিশ করবে তাঁর কাছে তাঁর অনুমতি ছাড়া? দৃষ্টির সামনে কিংবা পিছনে যা কিছু রয়েছে সে সবই তিনি জানেন। তাঁর জ্ঞানসীমা থেকে তারা কোন কিছুকেই পরিবেষ্টিত করতে পারে না, কিন্তু যতটুকু তিনি ইচ্ছা করেন। তাঁর সিংহাসন সমস্ত আসমান ও যমীনকে পরিবেষ্টিত করে আছে। আর সেগুলোকে ধারণ করা তাঁর পক্ষে কঠিন নয়। তিনিই সর্বোচ্চ এবং সর্বাপেক্ষা মহান। (২৫৬) দ্বীনের ব্যাপারে কোন জবরদস্তি বা বাধ্য-বাধকতা নেই। নিঃসন্দেহে হেদায়াত গোমরাহী থেকে পৃথক হয়ে গেছে। এখন যারা গোমরাহকারী ‘তাগুত’দেরকে মানবে না এবং আল্লাহতে বিশ্বাস স্থাপন করবে, সে ধারণ করে নিয়েছে সুদৃঢ় হাতল যা ভাংবার নয়। আর আল্লাহ সবই শুনেন এবং জানেন। (২৫৭) যারা ঈমান এনেছে, আল্লাহ তাদের অভিভাবক। তাদেরকে তিনি বের করে আনেন অন্ধকার থেকে আলোর দিকে। আর যারা কুফরী করে তাদের অভিভাবক হচ্ছে তাগুত। তারা তাদেরকে আলো থেকে বের করে অন্ধকারের দিকে নিয়ে যায়। এরাই হলো দোযখের অধিবাসী, চিরকাল তারা সেখানেই থাকবে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("title", "৫. সূরা বাকারার শেষ ৩ আয়াত, আয়াত নং ২৮৪, ২৮৫ ও ২৮৬");
        this.map_var.put("arabic", "لِلّٰهِ مَا فِى السَّمٰوٰتِ وَمَا فِى الۡاَرۡضِ\u200cؕ وَاِنۡ تُبۡدُوۡا مَا فِىۡۤ اَنۡفُسِكُمۡ اَوۡ تُخۡفُوۡهُ يُحَاسِبۡكُمۡ بِهِ اللّٰهُ\u200cؕ فَيَـغۡفِرُ لِمَنۡ يَّشَآءُ وَيُعَذِّبُ مَنۡ يَّشَآءُ\u200c ؕ وَاللّٰهُ عَلٰى كُلِّ شَىۡءٍ قَدِيۡرٌ\u200f ﴿۲۸۴﴾ اٰمَنَ الرَّسُوۡلُ بِمَاۤ اُنۡزِلَ اِلَيۡهِ مِنۡ رَّبِّهٖ وَ الۡمُؤۡمِنُوۡنَ\u200cؕ كُلٌّ اٰمَنَ بِاللّٰهِ وَمَلٰٓٮِٕكَتِهٖ وَكُتُبِهٖ وَرُسُلِهٖ\ue01e لَا نُفَرِّقُ بَيۡنَ اَحَدٍ مِّنۡ رُّسُلِهٖ\u200c\ue01e وَقَالُوۡا سَمِعۡنَا وَاَطَعۡنَا\u200c غُفۡرَانَكَ رَبَّنَا وَاِلَيۡكَ الۡمَصِيۡرُ\u200f ﴿۲۸۵﴾ لَا يُكَلِّفُ اللّٰهُ نَفۡسًا اِلَّا وُسۡعَهَا\u2002\u200cؕ لَهَا مَا كَسَبَتۡ وَعَلَيۡهَا مَا اكۡتَسَبَتۡ\u200cؕ رَبَّنَا لَا تُؤَاخِذۡنَاۤ اِنۡ نَّسِيۡنَاۤ اَوۡ اَخۡطَاۡنَا\u2002\u200cۚ رَبَّنَا وَلَا تَحۡمِلۡ عَلَيۡنَاۤ اِصۡرًا كَمَا حَمَلۡتَهٗ عَلَى الَّذِيۡنَ مِنۡ قَبۡلِنَا\u2002\u200c\u200cۚرَبَّنَا وَلَا تُحَمِّلۡنَا مَا لَا طَاقَةَ لَنَا بِهٖ\u200c ۚ وَاعۡفُ عَنَّا\ue01f وَاغۡفِرۡ لَنَا\ue01f وَارۡحَمۡنَا\ue01f اَنۡتَ مَوۡلٰٮنَا فَانۡصُرۡنَا عَلَى الۡقَوۡمِ الۡكٰفِرِيۡنَ\ue022\u200f ﴿۲۸۶﴾");
        this.map_var.put("onubad", "(২৮৪) যা কিছু আকাশসমূহে রয়েছে এবং যা কিছু যমীনে আছে, সব আল্লাহরই। যদি তোমরা মনের কথা প্রকাশ কর কিংবা গোপন কর, আল্লাহ তোমাদের কাছ থেকে তার হিসাব নেবেন। অতঃপর যাকে ইচ্ছা তিনি ক্ষমা করবেন এবং যাকে ইচ্ছা তিনি শাস্তি দেবেন। আল্লাহ সর্ববিষয়ে শক্তিমান। (২৮৫) রসূল বিশ্বাস রাখেন ঐ সমস্ত বিষয় সম্পর্কে যা তাঁর পালনকর্তার পক্ষ থেকে তাঁর কাছে অবতীর্ণ হয়েছে এবং মুসলমানরাও সবাই বিশ্বাস রাখে আল্লাহর প্রতি, তাঁর ফেরেশতাদের প্রতি, তাঁর গ্রন্থসমুহের প্রতি এবং তাঁর পয়গম্বরগণের প্রতি। তারা বলে আমরা তাঁর পয়গম্বরদের মধ্যে কোন তারতম্য করিনা। তারা বলে, আমরা শুনেছি এবং কবুল করেছি। আমরা তোমার ক্ষমা চাই, হে আমাদের পালনকর্তা। তোমারই দিকে প্রত্যাবর্তন করতে হবে। (২৮৬) আল্লাহ কাউকে তার সাধ্যাতীত কোন কাজের ভার দেন না, সে তাই পায় যা সে উপার্জন করে এবং তাই তার উপর বর্তায় যা সে করে। হে আমাদের পালনকর্তা, যদি আমরা ভুলে যাই কিংবা ভুল করি, তবে আমাদেরকে অপরাধী করো না। হে আমাদের পালনকর্তা! এবং আমাদের উপর এমন দায়িত্ব অর্পণ করো না, যেমন আমাদের পূর্ববর্তীদের উপর অর্পণ করেছ, হে আমাদের প্রভূ! এবং আমাদের দ্বারা ঐ বোঝা বহন করিও না, যা বহন করার শক্তি আমাদের নাই। আমাদের পাপ মোচন কর। আমাদেরকে ক্ষমা কর এবং আমাদের প্রতি দয়া কর। তুমিই আমাদের প্রভু। সুতরাং কাফের সম্প্রদায়ের বিরুদ্ধে আমাদের কে সাহায্যে কর।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("title", "৬. সূরা আলে ইমরান এর ১৮ নং আয়াত");
        this.map_var.put("arabic", "شَهِدَ اللّٰهُ اَنَّهٗ لَاۤ اِلٰهَ اِلَّا هُوَۙ وَالۡمَلٰٓٮِٕكَةُ وَاُولُوا الۡعِلۡمِ قَآٮِٕمًا ۢ بِالۡقِسۡطِ\u200cؕ لَاۤ اِلٰهَ اِلَّا هُوَ الۡعَزِيۡزُ الۡحَكِيۡمُؕ\u200f ﴿۱۸﴾");
        this.map_var.put("onubad", "(১৮) আল্লাহ সাক্ষ্য দিয়েছেন যে, তাঁকে ছাড়া আর কোন উপাস্য নেই। ফেরেশতাগণ এবং ন্যায়নিষ্ঠ জ্ঞানীগণও সাক্ষ্য দিয়েছেন যে, তিনি ছাড়া আর কোন ইলাহ নেই। তিনি পরাক্রমশালী প্রজ্ঞাময়।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("title", "৭. সূরা আলে ইমরান এর ২৬ ও ২৭ নং আয়াত");
        this.map_var.put("arabic", "قُلِ اللّٰهُمَّ مٰلِكَ الۡمُلۡكِ تُؤۡتِى الۡمُلۡكَ مَنۡ تَشَآءُ وَتَنۡزِعُ الۡمُلۡكَ مِمَّنۡ تَشَآءُ\ue01a وَتُعِزُّ مَنۡ تَشَآءُ وَتُذِلُّ مَنۡ تَشَآءُ\u200c\u2002ؕ بِيَدِكَ الۡخَيۡرُ\u200cؕ اِنَّكَ عَلٰى كُلِّ شَىۡءٍ قَدِيۡرٌ\u200f ﴿۲۶﴾ تُوۡلِجُ الَّيۡلَ فِى النَّهَارِ وَتُوۡلِجُ النَّهَارَ فِى الَّيۡلِ\u200c\ue01a وَتُخۡرِجُ الۡحَـىَّ مِنَ الۡمَيِّتِ وَتُخۡرِجُ الۡمَيِّتَ مِنَ الۡحَـىِّ\u200c\ue01a وَتَرۡزُقُ مَنۡ تَشَآءُ بِغَيۡرِ حِسَابٍ\u200f ﴿۲۷﴾");
        this.map_var.put("onubad", "(২৬) বলুন ইয়া আল্লাহ! তুমিই সার্বভৌম শক্তির অধিকারী। তুমি যাকে ইচ্ছা রাজ্য দান কর এবং যার কাছ থেকে ইচ্ছা রাজ্য ছিনিয়ে নাও এবং যাকে ইচ্ছা সম্মান দান কর আর যাকে ইচ্ছা অপমানে পতিত কর। তোমারই হাতে রয়েছে যাবতীয় কল্যাণ। নিশ্চয়ই তুমি সর্ব বিষয়ে ক্ষমতাশীল। (২৭) তুমি রাতকে দিনের ভেতরে প্রবেশ করাও এবং দিনকে রাতের ভেতরে প্রবেশ করিয়ে দাও। আর তুমিই জীবিতকে মৃতের ভেতর থেকে বের করে আন এবং মৃতকে জীবিতের ভেতর থেকে বের কর। আর তুমিই যাকে ইচ্ছা বেহিসাব রিযিক দান কর।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("title", "৮. সূরা আরাফ এর ৫৪, ৫৫ ও ৫৬ নং আয়াত");
        this.map_var.put("arabic", "اِنَّ رَبَّكُمُ اللّٰهُ الَّذِىۡ خَلَقَ السَّمٰوٰتِ وَ الۡاَرۡضَ فِىۡ سِتَّةِ اَيَّامٍ ثُمَّ اسۡتَوٰى عَلَى الۡعَرۡشِ\ue01e يُغۡشِى الَّيۡلَ النَّهَارَ يَطۡلُبُهٗ حَثِيۡثًا ۙ وَّالشَّمۡسَ وَالۡقَمَرَ وَالنُّجُوۡمَ مُسَخَّرٰتٍۢ بِاَمۡرِهٖ ؕ اَلَا لَـهُ الۡخَـلۡقُ وَالۡاَمۡرُ\u200c ؕ تَبٰرَكَ اللّٰهُ رَبُّ الۡعٰلَمِيۡنَ\u200f ﴿۵۴﴾ اُدۡعُوۡا رَبَّكُمۡ تَضَرُّعًا وَّخُفۡيَةً\u200c ؕ اِنَّهٗ لَا يُحِبُّ الۡمُعۡتَدِيۡنَ\u200c ۚ\u200f ﴿۵۵﴾ وَلَا تُفۡسِدُوۡا فِى الۡاَرۡضِ بَعۡدَ اِصۡلَاحِهَا وَادۡعُوۡهُ خَوۡفًا وَّطَمَعًا\u200c ؕ اِنَّ رَحۡمَتَ اللّٰهِ قَرِيۡبٌ مِّنَ الۡمُحۡسِنِيۡنَ\u200f ﴿۵۶﴾");
        this.map_var.put("onubad", "(৫৪) নিশ্চয় তোমাদের প্রতিপালক আল্লাহ। তিনি নভোমন্ডল ও ভূমন্ডলকে ছয় দিনে সৃষ্টি করেছেন। অতঃপর আরশের উপর অধিষ্টিত হয়েছেন। তিনি পরিয়ে দেন রাতের উপর দিনকে এমতাবস্থায় যে, দিন দৌড়ে রাতের পিছনে আসে। তিনি সৃষ্টি করেছেন সূর্য, চন্দ্র ও নক্ষত্র দৌড় স্বীয় আদেশের অনুগামী। শুনে রেখ, তাঁরই কাজ সৃষ্টি করা এবং আদেশ দান করা। আল্লাহ, বরকতময় যিনি বিশ্বজগতের প্রতিপালক। (৫৫) তোমরা স্বীয় প্রতিপালককে ডাক, কাকুতি-মিনতি করে এবং সংগোপনে। তিনি সীমা অতিক্রমকারীদেরকে পছন্দ করেন না। (৫৬) পৃথিবীকে কুসংস্কারমুক্ত ও ঠিক করার পর তাতে অনর্থ সৃষ্টি করো না। তাঁকে আহবান কর ভয় ও আশা সহকারে। নিশ্চয় আল্লাহর করুণা সৎকর্মশীলদের নিকটবর্তী।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("title", "৯. সূরা বনী ইসরাঈল এর শেষ ২ আয়াত, ১১০ ও ১১১ নং আয়াত");
        this.map_var.put("arabic", "قُلِ ادۡعُوا اللّٰهَ اَوِ ادۡعُوا الرَّحۡمٰنَ\u200c ؕ اَ يًّا مَّا تَدۡعُوۡا فَلَهُ الۡاَسۡمَآءُ الۡحُسۡنٰى \u200cۚ وَلَا تَجۡهَرۡ بِصَلَاتِكَ وَلَا تُخَافِتۡ بِهَا وَابۡتَغِ بَيۡنَ ذٰ لِكَ سَبِيۡلًا\u200f ﴿۱۱۰﴾ وَقُلِ الۡحَمۡدُ لِلّٰهِ الَّذِىۡ لَمۡ يَتَّخِذۡ وَلَدًا وَّلَمۡ يَكُنۡ لَّهٗ شَرِيۡكٌ فِى الۡمُلۡكِ وَلَمۡ يَكُنۡ لَّهٗ وَلِىٌّ مِّنَ الذُّلِّ\u200c وَكَبِّرۡهُ تَكۡبِيۡرًا\ue022\u200f ﴿۱۱۱﴾");
        this.map_var.put("onubad", "(১১০) বলুনঃ আল্লাহ বলে আহবান কর কিংবা রহমান বলে, যে নামেই আহবান কর না কেন, সব সুন্দর নাম তাঁরই। আপনি নিজের নামায আদায়কালে স্বর উচ্চগ্রাসে নিয়ে গিয়ে পড়বেন না এবং নিঃশব্দেও পড়বেন না। এতদুভয়ের মধ্যমপন্থা অবলম্বন করুন। (১১১) বলুনঃ সমস্ত প্রশংসা আল্লাহর যিনি না কোন সন্তান রাখেন, না তাঁর সার্বভৌমত্বে কোন শরীক আছে এবং যিনি দুর্দশাগ্রস্ত হন না, যে কারণে তাঁর কোন সাহয্যকারীর প্রয়োজন হতে পারে। সুতরাং আপনি স-সম্ভ্রমে তাঁর মাহাত্ন বর্ণনা করতে থাকুন।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("title", "১০. সূরা মুমিনুন এর শেষ ৪ আয়াত, ১১৫, ১১৬, ১১৭ ও ১১৮ নং আয়াত");
        this.map_var.put("arabic", "اَفَحَسِبۡتُمۡ اَنَّمَا خَلَقۡنٰكُمۡ عَبَثًا وَّاَنَّكُمۡ اِلَيۡنَا لَا تُرۡجَعُوۡنَ\u200f ﴿۱۱۵﴾ فَتَعٰلَى اللّٰهُ الۡمَلِكُ الۡحَـقُّ\u200c ۚ لَاۤ اِلٰهَ اِلَّا هُوَ\u200cۚ رَبُّ الۡعَرۡشِ الۡـكَرِيۡمِ\u200f ﴿۱۱۶﴾ وَمَنۡ يَّدۡعُ مَعَ اللّٰهِ اِلٰهًا اٰخَرَۙ لَا بُرۡهَانَ لَهٗ بِهٖۙ فَاِنَّمَا حِسَابُهٗ عِنۡدَ رَبِّهٖؕ اِنَّهٗ لَا يُفۡلِحُ الۡـكٰفِرُوۡنَ\u200f ﴿۱۱۷﴾ وَقُلْ رَّبِّ اغۡفِرۡ وَارۡحَمۡ وَاَنۡتَ خَيۡرُ الرّٰحِمِيۡنَ\ue022\u200f ﴿۱۱۸﴾");
        this.map_var.put("onubad", "(১১৫) তোমরা কি ধারণা কর যে, আমি তোমাদেরকে অনর্থক সৃষ্টি করেছি এবং তোমরা আমার কাছে ফিরে আসবে না? (১১৬) অতএব শীর্ষ মহিমায় আল্লাহ, তিনি সত্যিকার মালিক, তিনি ব্যতীত কোন মাবুদ নেই। তিনি সম্মানিত আরশের মালিক। (১১৭) যে কেউ আল্লাহর সাথে অন্য উপাস্যকে ডাকে, তার কাছে যার সনদ নেই, তার হিসাব তার পালণকর্তার কাছে আছে। নিশ্চয় কাফেররা সফলকাম হবে না। (১১৮) বলূনঃ হে আমার পালনকর্তা, ক্ষমা করুন ও রহম করুন। রহমকারীদের মধ্যে আপনি শ্রেষ্ট রহমকারী।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("title", "১১. সূরা সাফফাত এর শুরু থেকে ১১ আয়াত");
        this.map_var.put("arabic", "بِسۡمِ اللهِ الرَّحۡمٰنِ الرَّحِيۡمِ\n وَالصّٰٓفّٰتِ صَفًّا ۙ\u200f ﴿۱﴾ فَالزّٰجِرٰتِ زَجۡرًا ۙ\u200f ﴿۲﴾ فَالتّٰلِيٰتِ ذِكۡرًا ۙ\u200f ﴿۳﴾ اِنَّ اِلٰهَكُمۡ لَوَاحِدٌ\u2002ؕ\u200f ﴿۴﴾ رَبُّ السَّمٰوٰتِ وَالۡاَرۡضِ وَمَا بَيۡنَهُمَا وَرَبُّ الۡمَشَارِقِ ؕ\u200f ﴿۵﴾ اِنَّا زَيَّنَّا السَّمَآءَ الدُّنۡيَا بِزِيۡنَةِ اۨلۡكَوَاكِبِۙ\u200f ﴿۶﴾ وَحِفۡظًا مِّنۡ كُلِّ شَيۡطٰنٍ مَّارِدٍ\u200cۚ\u200f ﴿۷﴾ لَّا يَسَّمَّعُوۡنَ اِلَى الۡمَلَاِ الۡاَعۡلٰى وَيُقۡذَفُوۡنَ مِنۡ كُلِّ جَانِبٍۖ \ue01c\u200f ﴿۸﴾ دُحُوۡرًا\ue021\u2002 وَّلَهُمۡ عَذَابٌ وَّاصِبٌ\u2002 ۙ\u200f ﴿۹﴾ اِلَّا مَنۡ خَطِفَ الۡخَطۡفَةَ فَاَتۡبَعَهٗ شِهَابٌ ثَاقِبٌ\u200f ﴿۱۰﴾ فَاسۡتَفۡتِهِمۡ اَهُمۡ اَشَدُّ خَلۡقًا اَمۡ مَّنۡ خَلَقۡنَاؕ اِنَّا خَلَقۡنٰهُمۡ مِّنۡ طِيۡنٍ لَّازِبٍ\u200f ﴿۱۱﴾");
        this.map_var.put("onubad", "(১) শপথ তাদের যারা সারিবদ্ধ হয়ে দাঁড়ানো, (২) অতঃপর ধমকিয়ে ভীতি প্রদর্শনকারীদের, (৩) অতঃপর মুখস্থ আবৃত্তিকারীদের- (৪) নিশ্চয় তোমাদের মাবুদ এক। (৫) তিনি আসমান সমূহ, যমীনও এতদুভয়ের মধ্যবর্তী সবকিছুর পালনকর্তা এবং পালনকর্তা উদয়াচলসমূহের। (৬) নিশ্চয় আমি নিকটবর্তী আকাশকে তারকারাজির দ্বারা সুশোভিত করেছি। (৭) এবং তাকে সংরক্ষিত করেছি প্রত্যেক অবাধ্য শয়তান থেকে। (৮) ওরা উর্ধ্ব জগতের কোন কিছু শ্রবণ করতে পারে না এবং চার দিক থেকে তাদের প্রতি উল্কা নিক্ষেপ করা হয়। (৯) ওদেরকে বিতাড়নের উদ্দেশে। ওদের জন্যে রয়েছে বিরামহীন শাস্তি। (১০) তবে কেউ ছোঁ মেরে কিছু শুনে ফেললে জ্বলন্ত উল্কাপিন্ড তার পশ্চাদ্ধাবন করে। (১১) আপনি তাদেরকে জিজ্ঞেস করুন, তাদেরকে সৃষ্টি করা কঠিনতর, না আমি অন্য যা সৃষ্টি করেছি? আমিই তাদেরকে সৃষ্টি করেছি এঁটেল মাটি থেকে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("title", "১২. সূরা আর-রহমান এর ৩৩ থেকে ৪০ পর্যন্ত, মোট ৮ আয়াত");
        this.map_var.put("arabic", "يٰمَعۡشَرَ الۡجِنِّ وَالۡاِنۡسِ اِنِ اسۡتَطَعۡتُمۡ اَنۡ تَنۡفُذُوۡا مِنۡ اَقۡطَارِ السَّمٰوٰتِ وَالۡاَرۡضِ فَانْفُذُوۡا\u200cؕ لَا تَنۡفُذُوۡنَ اِلَّا بِسُلۡطٰنٍ\u200cۚ\u200f ﴿۳۳﴾ فَبِاَىِّ اٰلَاۤءِ رَبِّكُمَا تُكَذِّبٰنِ\u200f ﴿۳۴﴾ يُرۡسَلُ عَلَيۡكُمَا شُوَاظٌ مِّنۡ نَّارٍ\ue021\u2002ۙ وَّنُحَاسٌ فَلَا تَنۡتَصِرٰنِ\u200cۚ\u200f ﴿۳۵﴾ فَبِاَىِّ اٰلَاۤءِ رَبِّكُمَا تُكَذِّبٰنِ\u200f ﴿۳۶﴾ فَاِذَا انْشَقَّتِ السَّمَآءُ فَكَانَتۡ وَرۡدَةً كَالدِّهَانِ\u200cۚ\u200f ﴿۳۷﴾ فَبِاَىِّ اٰلَاۤءِ رَبِّكُمَا تُكَذِّبٰنِ\u200f ﴿۳۸﴾ فَيَوۡمَٮِٕذٍ لَّا يُسۡـٴَـلُ عَنۡ ذَنۡۢبِهٖۤ اِنۡسٌ وَّلَا جَآنٌّ\u200cۚ\u200f ﴿۳۹﴾ فَبِاَىِّ اٰلَاۤءِ رَبِّكُمَا تُكَذِّبٰنِ\u200f ﴿۴۰﴾");
        this.map_var.put("onubad", "(৩৩) হে জিন ও মানবকূল, নভোমন্ডল ও ভূমন্ডলের প্রান্ত অতিক্রম করা যদি তোমাদের সাধ্যে কুলায়, তবে অতিক্রম কর। কিন্তু ছাড়পত্র ব্যতীত তোমরা তা অতিক্রম করতে পারবে না। (৩৪) অতএব, তোমরা উভয়ে তোমাদের পালনকর্তার কোন কোন অবদানকে অস্বীকার করবে? (৩৫) ছাড়া হবে তোমাদের প্রতি অগ্নিস্ফুলিঙ্গ ও ধুম্রকুঞ্জ তখন তোমরা সেসব প্রতিহত করতে পারবে না। (৩৬) অতএব, তোমরা উভয়ে তোমাদের পালনকর্তার কোন কোন অবদানকে অস্বীকার করবে? (৩৭) যেদিন আকাশ বিদীর্ণ হবে তখন সেটি রক্তবর্ণে রঞ্জিত চামড়ার মত হয়ে যাবে। (৩৮) অতএব, তোমরা উভয়ে তোমাদের পালনকর্তার কোন কোন অবদানকে অস্বীকার করবে? (৩৯) সেদিন মানুষ না তার অপরাধ সম্পর্কে জিজ্ঞাসিত হবে, না জিন। (৪০) অতএব, তোমরা উভয়ে তোমাদের পালনকর্তার কোন কোন অবদানকে অস্বীকার করবে?");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("title", "১৩. সূরা হাশর এর শেষ ৪ আয়াত। ২১, ২২, ২৩ ও ২৪ নং আয়াত");
        this.map_var.put("arabic", "لَوۡ اَنۡزَلۡنَا هٰذَا الۡقُرۡاٰنَ عَلٰى جَبَلٍ لَّرَاَيۡتَهٗ خَاشِعًا مُّتَصَدِّعًا مِّنۡ خَشۡيَةِ اللّٰهِ\u200cؕ وَتِلۡكَ الۡاَمۡثَالُ نَضۡرِبُهَا لِلنَّاسِ لَعَلَّهُمۡ يَتَفَكَّرُوۡنَ\u200f ﴿۲۱﴾ هُوَ اللّٰهُ الَّذِىۡ لَاۤ اِلٰهَ اِلَّا هُوَ\u200c ۚ عٰلِمُ الۡغَيۡبِ وَالشَّهَادَةِ\u200c ۚ هُوَ الرَّحۡمٰنُ الرَّحِيۡمُ\u200f ﴿۲۲﴾ هُوَ اللّٰهُ الَّذِىۡ لَاۤ اِلٰهَ اِلَّا هُوَ\u200cۚ اَلۡمَلِكُ الۡقُدُّوۡسُ السَّلٰمُ الۡمُؤۡمِنُ الۡمُهَيۡمِنُ الۡعَزِيۡزُ الۡجَـبَّارُ الۡمُتَكَبِّرُ\u200cؕ سُبۡحٰنَ اللّٰهِ عَمَّا يُشۡرِكُوۡنَ\u200f ﴿۲۳﴾ هُوَ اللّٰهُ الۡخَـالِـقُ الۡبَارِئُ الۡمُصَوِّرُ\u200c لَـهُ الۡاَسۡمَآءُ الۡحُسۡنٰى\u200cؕ يُسَبِّحُ لَهٗ مَا فِى السَّمٰوٰتِ وَالۡاَرۡضِ\u200cۚ وَهُوَ الۡعَزِيۡزُ الۡحَكِيۡمُ\ue022\u200f ﴿۲۴﴾");
        this.map_var.put("onubad", "(২১) যদি আমি এই কোরআন পাহাড়ের উপর অবতীর্ণ করতাম, তবে তুমি দেখতে যে, পাহাড় বিনীত হয়ে আল্লাহ তা’আলার ভয়ে বিদীর্ণ হয়ে গেছে। আমি এসব দৃষ্টান্ত মানুষের জন্যে বর্ণনা করি, যাতে তারা চিন্তা-ভাবনা করে। (২২) তিনিই আল্লাহ তা’আলা, তিনি ব্যতীত কোন উপাস্য নেই; তিনি দৃশ্য ও অদৃশ্যকে জানেন তিনি পরম দয়ালু, অসীম দাতা। (২৩) তিনিই আল্লাহ তিনি ব্যতিত কোন উপাস্য নেই। তিনিই একমাত্র মালিক, পবিত্র, শান্তি ও নিরাপত্তাদাতা, আশ্রয়দাতা, পরাক্রান্ত, প্রতাপান্বিত, মাহাত্ন?486;ীল। তারা যাকে অংশীদার করে আল্লাহ তা’ আলা তা থেকে পবিত্র। (২৪) তিনিই আল্লাহ তা’আলা, স্রষ্টা, উদ্ভাবক, রূপদাতা, উত্তম নাম সমূহ তাঁরই। নভোমন্ডলে ও ভূমন্ডলে যা কিছু আছে, সবই তাঁর পবিত্রতা ঘোষণা করে। তিনি পরাক্রান্ত প্রজ্ঞাময়।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("title", "১৪. সূরা জ্বিন এর শুরুর ৪ আয়াত");
        this.map_var.put("arabic", "بِسۡمِ اللهِ الرَّحۡمٰنِ الرَّحِيۡمِ\n قُلۡ اُوۡحِىَ اِلَىَّ اَنَّهُ اسۡتَمَعَ نَفَرٌ مِّنَ الۡجِنِّ فَقَالُوۡۤا اِنَّا سَمِعۡنَا قُرۡاٰنًاعَجَبًا ۙ\u200f ﴿۱﴾ يَّهۡدِىۡۤ اِلَى الرُّشۡدِ فَاٰمَنَّا بِهٖ\u200c ؕ وَلَنۡ نُّشۡرِكَ بِرَبِّنَاۤ اَحَدًا ۙ\u200f ﴿۲﴾ وَّاَنَّهٗ تَعٰلٰى جَدُّ رَبِّنَا مَا اتَّخَذَ صَاحِبَةً وَّلَا وَلَدًا ۙ\u200f ﴿۳﴾ وَّ اَنَّهٗ كَانَ يَقُوۡلُ سَفِيۡهُنَا عَلَى اللّٰهِ شَطَطًا ۙ\u200f ﴿۴﴾");
        this.map_var.put("onubad", "(১) বলুনঃ আমার প্রতি ওহী নাযিল করা হয়েছে যে, জিনদের একটি দল কোরআন শ্রবণ করেছে, অতঃপর তারা বলেছেঃ আমরা বিস্ময়কর কোরআন শ্রবণ করেছি; (২) যা সৎপথ প্রদর্শন করে। ফলে আমরা তাতে বিশ্বাস স্থাপন করেছি। আমরা কখনও আমাদের পালনকর্তার সাথে কাউকে শরীক করব না। (৩) এবং আরও বিশ্বাস করি যে, আমাদের পালনকর্তার মহান মর্যাদা সবার উর্ধ্বে। তিনি কোন পত্নী গ্রহণ করেননি এবং তাঁর কোন সন্তান নেই। (৪) আমাদের মধ্যে নির্বোধেরা আল্লাহ তা’আলা সম্পর্কে বাড়াবাড়ির কথাবার্তা বলত।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("title", "১৫. সূরা কাফিরুন, মোট ৬ আয়াত");
        this.map_var.put("arabic", "بِسۡمِ اللهِ الرَّحۡمٰنِ الرَّحِيۡمِ\n قُلۡ يٰۤاَيُّهَا الۡكٰفِرُوۡنَۙ\u200f ﴿۱﴾ لَاۤ اَعۡبُدُ مَا تَعۡبُدُوۡنَۙ\u200f ﴿۲﴾ وَلَاۤ اَنۡـتُمۡ عٰبِدُوۡنَ مَاۤ اَعۡبُدُ\u200c ۚ\u200f ﴿۳﴾ وَلَاۤ اَنَا عَابِدٌ مَّا عَبَدۡتُّمۡۙ\u200f ﴿۴﴾ وَ لَاۤ اَنۡـتُمۡ عٰبِدُوۡنَ مَاۤ اَعۡبُدُ ؕ\u200f ﴿۵﴾ لَـكُمۡ دِيۡنُكُمۡ وَلِىَ دِيۡنِ\ue022\u200f ﴿۶﴾");
        this.map_var.put("onubad", "(১) বলুন, হে কাফেরকূল, (২) আমি এবাদত করিনা, তোমরা যার এবাদত কর। (৩) এবং তোমরাও এবাদতকারী নও, যার এবাদত আমি করি (৪) এবং আমি এবাদতকারী নই, যার এবাদত তোমরা কর। (৫) তোমরা এবাদতকারী নও, যার এবাদত আমি করি। (৬) তোমাদের কর্ম ও কর্মফল তোমাদের জন্যে এবং আমার কর্ম ও কর্মফল আমার জন্যে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("title", "১৬. সূরা ইখলাস, মোট ৪ আয়াত");
        this.map_var.put("arabic", "بِسۡمِ اللهِ الرَّحۡمٰنِ الرَّحِيۡمِ\n قُلۡ هُوَ اللّٰهُ اَحَدٌ\u200c ۚ\u200f ﴿۱﴾ اَللّٰهُ الصَّمَدُ\u200c ۚ\u200f ﴿۲﴾ لَمۡ يَلِدۡ\ue021 \u2002 ۙ وَلَمۡ يُوۡلَدۡ ۙ\u200f ﴿۳﴾ وَلَمۡ يَكُنۡ لَّهٗ كُفُوًا اَحَدٌ \ue022\u200f ﴿۴﴾");
        this.map_var.put("onubad", "(১) বলুন, তিনি আল্লাহ, এক, (২) আল্লাহ অমুখাপেক্ষী, (৩) তিনি কাউকে জন্ম দেননি এবং কেউ তাকে জন্ম দেয়নি (৪) এবং তার সমতুল্য কেউ নেই।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("title", "১৭. সূরা ফালাক্ব, মোট ৫ আয়াত");
        this.map_var.put("arabic", "بِسۡمِ اللهِ الرَّحۡمٰنِ الرَّحِيۡمِ\n قُلۡ اَعُوۡذُ بِرَبِّ الۡفَلَقِۙ\u200f ﴿۱﴾ مِنۡ شَرِّ مَا خَلَقَۙ\u200f ﴿۲﴾ وَمِنۡ شَرِّ غَاسِقٍ اِذَا وَقَبَۙ\u200f ﴿۳﴾ وَمِنۡ شَرِّ النَّفّٰثٰتِ فِى الۡعُقَدِۙ\u200f ﴿۴﴾ وَمِنۡ شَرِّ حَاسِدٍ اِذَا حَسَدَ\ue022\u200f ﴿۵﴾");
        this.map_var.put("onubad", "(১) বলুন, আমি আশ্রয় গ্রহণ করছি প্রভাতের পালনকর্তার, (২) তিনি যা সৃষ্টি করেছেন, তার অনিষ্ট থেকে, (৩) অন্ধকার রাত্রির অনিষ্ট থেকে, যখন তা সমাগত হয়, (৪) গ্রন্থিতে ফুঁৎকার দিয়ে জাদুকারিনীদের অনিষ্ট থেকে (৫) এবং হিংসুকের অনিষ্ট থেকে যখন সে হিংসা করে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("title", "১৮. সূরা নাস, মোট ৬ আয়াত");
        this.map_var.put("arabic", "بِسۡمِ اللهِ الرَّحۡمٰنِ الرَّحِيۡمِ\n قُلۡ اَعُوۡذُ بِرَبِّ النَّاسِۙ\u200f ﴿۱﴾ مَلِكِ النَّاسِۙ\u200f ﴿۲﴾ اِلٰهِ النَّاسِۙ\u200f ﴿۳﴾ مِنۡ شَرِّ الۡوَسۡوَاسِ\ue021 \u2002ۙ الۡخَـنَّاسِ\ue01b ۙ\u200f ﴿۴﴾ الَّذِىۡ يُوَسۡوِسُ فِىۡ صُدُوۡرِ النَّاسِۙ\u200f ﴿۵﴾ مِنَ الۡجِنَّةِ وَالنَّاسِ\ue022\u200f ﴿۶﴾");
        this.map_var.put("onubad", "(১) বলুন, আমি আশ্রয় গ্রহণ করিতেছি মানুষের পালনকর্তার, (২) মানুষের অধিপতির, (৩) মানুষের মা’বুদের (৪) তার অনিষ্ট থেকে, যে কুমন্ত্রণা দেয় ও আত্নগোপন করে, (৫) যে কুমন্ত্রণা দেয় মানুষের অন্তরে (৬) জ্বিনের মধ্য থেকে অথবা মানুষের মধ্য থেকে।");
        this.map_list.add(this.map_var);
    }

    private void _Asmaul_Hosnaa() {
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "১");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল্লাহ (الله)\nঅর্থ: আল্লাহ\nফজিলত: প্রত্যহ ১০০০ বার এই নামের যিকির করলে ঈমান দৃঢ় ও মযবুত হয়।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "২");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আর রাহমান (الرَّحْمَنُ)\nঅর্থ: পরম দয়ালু\nফজিলত: প্রত্যেক নামাযের পর ১০০ বার পড়লে, ইনশাআল্লাহ্\u200c তার অন্তর থেকে সব ধরনের কঠোরতা ও অলসতা দূর হয়ে যাবে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৩");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আর-রহী'ম (الرَّحِيمُ)\nঅর্থ: অতিশয়-মেহেরবান\nফজিলত: প্রত্যেক নামাযের পর ১০০ বার করে পাঠ করলে, ইনশা আল্লাহ্\u200c পৃথিবীর সকল বিপদ আপদ থেকে নিরাপদ থাকবে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৪");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-মালিক (الْمَلِكُ)\nঅর্থ: সর্বকর্তৃত্বময়\nফজিলত: ফযরের নামাজের পর অধিকহারে পাঠ করবে, আল্লাহ্\u200c তায়ালা তাকে ধনবান করে দিবেন।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৫");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-কুদ্দুস (الْقُدُّوسُ)\nঅর্থ: নিষ্কলুষ, অতি পবিত্র\nফজিলত: প্রত্যহ শেষ রাতে (উয়া কুদ্দূসু) নামুটি ১০০০ বার পড়লে রোগ ব্যধি থেকে মুক্ত থাকা যায়। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৬");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আস-সালাম (السَّلاَمُ) \nঅর্থ: নিরাপত্তা-দানকারী, শান্তি-দানকারী\nফজিলত: এই নামটি ১১৫ বার কোন রুগির উপর পরে ফু দিবে, তাহলে আল্লাহ তায়ালা তাকে সুস্থতা ও আরোগ্য দান করবেন। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৭");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-মু'মিন (الْمُؤْمِنُ)\nঅর্থ: নিরাপত্তা ও ঈমান দানকারী\nফজিলত: যে ব্যক্তি কোন ভয়-ভীতির সময় ৬৩০ বার এ নামটি পাঠ করবে, ইনশাআল্লাহ্\u200c সে সব ধরনের ভয়-ভীতি ও অনিষ্ঠ থেকে নিরাপদ থাকবে। যে ব্যক্তি এ নামটি পাঠ করবে বা লিখে নিজের সাথে রাখবে, আল্লাহ্\u200c তায়ালা তাকে শয়তানের অনিষ্ঠ থেকে রক্ষা করবেন। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৮");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-মুহাইমিন (الْمُهَيْمِنُ)\nঅর্থ: পরিপূর্ন রক্ষণাবেক্ষণকারী\nফজিলত: যে ব্য ক্ তি গোসল করে ১১৫ বার এ নামটি পরবে, গোপন বিষয়াদি উপর অবগত হবে। সর্বদা পরলে সব বিপদ থেকে মুক্তি পাবে। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৯");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-আ'জীজ (الْعَزِيزُ)\nঅর্থ: পরাক্রমশালী, অপরাজেয়\nফজিলত: ৪০ দিন পর্যন্ত যে ব্যক্তি এ নামটি ৪০ বার পাঠ করবে, আল্লাহ তাকে সম্মানী ও অমুখাপেক্ষী বানিয়ে দিবেন। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "১০");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-জাব্বার (الْجَبَّارُ)\nঅর্থ: দুর্নিবার\nফজিলত: যে ব্যক্তি প্রতি দিন সকাল-বিকাল ২২৬ বার পড়লে যাবতীয় জুলুম থেকে মুক্তিপাবে। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "১১");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-মুতাকাব্বিইর (الْمُتَكَبِّرُ)\nঅর্থ: নিরঙ্কুশ শ্রেষ্ঠত্বের অধিকারী\nফজিলত: এই নাম সর্বদা পড়লে মান সম্মান বৃদ্ধি পায় ও উন্নতি লাভ হয়।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "১২");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-খালিক্ব (الْخَالِقُ)\nঅর্থ: সৃষ্টিকর্তা\nফজিলত: যে ব্যক্তি সাত দিন পর্যন্ত ধারাবাহিক ১০০ বার এ নামটি পাঠ করবে, ইনশাআল্লাহ্\u200c সকল বিপ দআ পদ থেকে নিরাপদ থাকবে। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "১৩");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-বারী (الْبَارِئُ)\nঅর্থ: সঠিকভাবে সৃষ্টিকারী\nফজিলত: বন্ধ্যা নারী যদি সাতদিন রোযা রাখে এবং পানি দ্বারা ইফতার করার পর (ইয়া বারী-উল মুছউইর) ২১ বার পাঠ করবে, তাহলে ইনশাআল্লাহ্\u200c তার পুত্র সন্তান লাভ হবে। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "১৪");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-মুছউইর (الْمُصَوِّرُ)\nঅর্থ: আকৃতি-দানকারী\nফজিলত: বন্ধ্যা নারী যদি সাতদিন রোযা রাখে এবং পানি দ্বারা ইফতার করার পর (ইয়া বারী-উল মুছউইর) ২১ বার পাঠ করবে, তাহলে ইনশাআল্লাহ্\u200c তার পুত্র সন্তান লাভ হবে। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "১৫");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-গফ্ফার (الْغَفَّارُ)\nঅর্থ: পরম ক্ষমাশীল\nফজিলত: জুম্মার নামাযের পর ১০০ বার পড়লে গুনাহ মাফ হয় ও অভাব দূর হয়। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "১৬");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-ক্বাহার (الْقَهَّارُ)\nঅর্থ: কঠোর\nফজিলত: ক্রমাগত আল্লাহ্\u200cর এই নাম পাঠ করলে, পার্থিব ভালবাসা থেকে আপনি মুক্তি পাবেন এবং পরিবর্তে আল্লাহ্\u200cর ভালবাসা আপানার হৃদয়ে সহজাত হয়ে যাবে। ইনশাআল্লাহ্\u200c ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "১৭");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-ওযা হ্হাব (الْوَهَّابُ)\nঅর্থ: সবকিছু দানকারী\nফজিলত: চাশতের নামাযের পর সেজদায় গিয়ে ১০০ বার পড়লে অর্থ ও প্রভাব বৃদ্ধি পায়। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "১৮");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আর-রজ্জাক্ব (الرَّزَّاقُ)\nঅর্থ: রিযকদাতা\nফজিলত: ফজরের নামাযের পূবে এই নামের যিকির করলে রিযিক বৃদ্ধি পায়। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "১৯");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল ফাত্তাহ (الْفَتَّاحُ)\nঅর্থ: বিজয়দানকারী\nফজিলত: ফযরের নামাজের পর দুই হাত বুকের উপর রেখে ৭০ বার এই নাম পাঠ করলে, ইনশাআল্লাহ্\u200c তার অন্তর ঈমানের জ্যোতি দ্বারা আলোকিত হবে। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "২০");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-আ'লীম (اَلْعَلِيْمُ)\nঅর্থ: সর্বজ্ঞ\nফজিলত: এ নাম সর্বদা পড়লে জ্ঞান বৃদ্ধি পায় গুনাহ মাফ হয় ও মনের কপাট খুলে যায়। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "২১");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-ক্ববিদ্ব' (الْقَابِضُ)\nঅর্থ: সংকীর্ণকারী\nফজিলত: যে ব্যক্তি ৪০ দিন এই নামটি ৪ টুকরা রুটির উপর লিখে খাবে, তিনি ক্ষুদা, পিপাসা ও ব্যথা বেদনা থেকে রক্ষা পাবে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "২২");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-বাসিত (الباسط)\nঅর্থ: প্রশস্তকারী\nফজিলত: প্রতিদিন নামাজের পর মুনাজাত করে ১০ বার আল্লাহ্\u200cর এই নাম পাঠ করেন, আল্লাহ্\u200c তায়ালা তাকে ধনী বনিয়ে দিবেন এবং কখন কার মুখাপেক্ষী হবে না। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "২৩");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-খফিদ্বু (الْخَافِضُ)\nঅর্থ: অবনতকারী\nফজিলত: প্রত্যহ ৫০০ বার এ নামের \u200dপাঠ করলে আল্লাহ্\u200c তায়ালা তার প্রয়োজন পূর্ণ করবেন ও সকল সমস্যা দূর করে দিবেন। \n");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "২৪");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আর-রফীই' (الرَّافِعُ)\nঅর্থ: উন্নতকারী\nফজিলত: ১০০ বার পড়লে, আল্লাহ্\u200c আপানকে স্বয়ংসম্পূর্ণতা এবং সমগ্র  সৃষ্টির স্বাধীনতা প্রদান করা হবে। ইনশাআল্লাহ্\u200c");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "২৫");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-মুই'জ্ব (الْمُعِزُّ)\nঅর্থ: সম্মান-দানকারী\nফজিলত: প্রতি সোমবার ও শুক্রুবার মাগরিব নামাজ পরে এই নাম্ ৪০ বার পড়লে মর্যাদা বৃদ্ধি পায় ও সকলের নিকট সম্মানের পাত্র হয়।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "২৬");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-মুদ্বি'ল্লু (المُذِلُّ)\nঅর্থ: (অবিশ্বাসীদের) বেইজ্জতকারী\nফজিলত: নামাযের পর সেজদায় গিয়ে ৭৫ বার পড়ে দোয়া করলে শত্রুতা হতে মুক্তি পাওয়া যায় । ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "২৭");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আস্-সামিই' (السَّمِيعُ)\nঅর্থ: সর্বশ্রোতা\nফজিলত: শুক্রুবার চাশতের পর ৫০০/১০০/৫০ বার পড়ে দোয়া করলে দোয়া কবুল হয়। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "২৮");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-বাছীর (الْبَصِيرُ)\nঅর্থ: সর্ববিষয়-দর্শনকারী\nফজিলত: জুম্মার নামাযের পর ১০০ বার পড়লে দৃষ্টিতে আলো ও অন্তরে জ্যোতি সৃষ্টি হবে। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "২৯");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-হা'কাম (الْحَكَمُ)\nঅর্থ: অটল বিচারক\nফজিলত: যে ব্যক্তি অধিক হারে পাঠ করবে, আল্লাহ্\u200c তালা তার জন্য জ্ঞান-বিজ্ঞানের দ্বার খুলে দিবেন। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৩০");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-আ'দল (الْعَدْلُ)\nঅর্থ: পরিপূর্ণ-ন্যায়বিচারক\nফজিলত: শুক্রবার রাতে বিশ টুকরা রুটির উপর লিখে খেলে আল্লাহ্\u200c তায়ালা সৃষ্টজীবকে তার অনুগত করে দিবেন। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৩১");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-লাতীফ (اللَّطِيفُ)\nঅর্থ: সকল-গোপন-বিষয়ে-অবগত\nফজিলত: যে ব্যক্তি ১৩৩ বার পাঠ করবে, ইনশাআল্লাহ্\u200c তার খাদ্যে বরকত হবে এবং তার সব কাজ সুন্দরভাবে পূর্ণ হবে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৩২");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-খ'বীর (الْخَبِيرُ)\nঅর্থ: সকল ব্যাপারে জ্ঞাত\nফজিলত: ৭ দিন পর্যন্ত এ নাম পড়তে থাকলে গোপন তথ্য অবগত হওয়া যায়।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৩৩");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-হা'লীম (الْحَلِيمُ)\nঅর্থ: অত্যন্ত ধৈর্যশীল\nফজিলত: যে ব্যক্তি এই নামটি কাগজে লিখে, পানিতে এটি ডুবিয়ে রেখে এবং সে পানি শস্য ক্ষেত্রে অথবা কোন জিনিসের উপর ছিটিয়ে দিবে, আল্লাহ্\u200c তায়ালা তার ফসল নষ্ট করবেনা, বরং সংরক্ষন করবেন। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৩৪");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-আ'জীম (الْعَظِيمُ)\nঅর্থ: সর্বোচ্চ-মর্যাদাশীল\nফজিলত: নিয়মিত এ নামের যিকির করলে তার মর্যাদা, সম্মান ও শ্রেষ্ঠত্ব লাভ হবে। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৩৫");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-গফুর (الْغَفُورُ)\nঅর্থ: পরম ক্ষমাশীল\nফজিলত: অধিকহারে এই নাম পাঠ করলে, সব রোগবালাই, দুঃখ ও দুর্দশা অপসারণ করা হয়, আল্লাহ্\u200cর দোয়া তার সম্পদ এবং সন্তানাদির উপর পরবে। ইনশাআল্লাহ্\u200c ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৩৬");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আশ্-শাকুর (الشَّكُورُ)\nঅর্থ: গুনগ্রাহী\nফজিলত: কোন ব্যক্তি যদি, আর্থিক, মানসিক, শারীরিক ও আধ্যাত্মিক সমস্যার সম্মুখিন হন, ৪১ বার আল্লাহ্\u200c এর এই নাম পাঠ করলে, আল্লাহ্\u200c শীঘ্রই উদ্ধার প্রদান করবেন। ইনশাআল্লাহ্\u200c ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৩৭");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-আ'লিইউ (الْعَلِيُّ)\nঅর্থ: উচ্চ-মর্যাদাশীল\nফজিলত: এ নাম সর্বদা পাঠ করলে ও লিখে সঙ্গে রাখলে ইনশাআল্লাহ্\u200c মর্যাদার উচ্চতা, সচ্ছলতা ও উদ্দেশ্যে সফলতা লাভ করবে। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৩৮");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-কাবিইর (الْكَبِيرُ)\nঅর্থ: সুমহান\nফজিলত: কোন ব্যক্তি কে যদি তার পদ থেকে বরখাস্ত করা হয়, তাহলে ৭ দিন রোযা রেখে এবং প্রতি দিন এই নাম ১০০০ বার পাঠ করলে, আল্লাহ্\u200c তার পদ কে সম্মান এবং মর্যাদা দিয়ে পুনরায় ফিরিয়ে দিবেন। ইনশাআল্লাহ্\u200c ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৩৯");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-হা'ফীজ (الْحَفِيظُ)\nঅর্থ: সংরক্ষণকারী\nফজিলত: যে ব্যক্তি অধিক হারে পাঠ করবে এবং লিখে নিজের কাছে রেখে দিবে, ইনশাআল্লাহ্\u200c সে সব ধরনের ভয়-ভীতি ও অনিষ্ঠ থেকে নিরাপদে থাকবে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৪০");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-মুক্বীত (المُقيِت)\nঅর্থ: সকলের জীবনোপকরণ-দানকারী\nফজিলত: ৭ বার পড়ে পানিতে ফু দিয়ে সে পানি শিশুকে খাওয়ালে তার কান্না বন্ধ হয়।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৪১");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-হাসীব (الْحسِيبُ)\nঅর্থ: হিসাব-গ্রহণকারী\nফজিলত: কোন ব্যক্তি যদি কোন মানুষ বা কোন জিনিস কে ভয় পান, তাহলে বৃহস্পতিবার থেকে শুরু আট দিনের জন্য রাতে ও সকালে ৭০ বার এবং ৭০ বার (হাসবিয়াল্লাহুল-সাসিবু) পাঠ করলে, আল্লাহ্\u200c তার ভয় ও মন্দ জিনিসের বিরুদ্ধে সুরুক্ষা প্রদান করবে। ইনশাআল্লাহ্\u200c ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৪২");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-জালীল (الْجَلِيلُ)\nঅর্থ: পরম মর্যাদার অধিকারী\nফজিলত: এই নামটি মেশক ও জাফরান দিয়ে লিখে নিজের কাছে রাখবে বা ধুয়ে খেলে, তার সম্মান, মহিমা এবং মর্যাদা দিবে। ইনশাআল্লাহ্\u200c ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৪৩");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-কারীম (الْكَرِيمُ)\nঅর্থ: সুমহান দাতা\nফজিলত: ঘুমানোর পূবে এ নামের যিকির করলে আলেম ও সৎ লোকের মর্যাদা লাভ হয়।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৪৪");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আর-রক্বীব (الرَّقِيبُ)\nঅর্থ: তত্ত্বাবধায়ক\nফজিলত: এই নাম ৭ বার প্রতিদিন পাঠ করলে এবং নিজের ও তার পরিবারের উপর ফুঁ দিলে, আল্লাহ্\u200c ধ্বংস ও বিপর্যয় থেকে আপনাকে এবং আপনার সম্পদ রক্ষা করবেন। ইনশাআল্লাহ্\u200c");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৪৫");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-মুজীব (الْمُجِيبُ)\nঅর্থ: জবাব-দানকারী, কবুলকারী\nফজিলত: সর্বদা এই নাম পাঠ করলে আল্লাহ্\u200c তায়ালা তার দোয়া কবুল করেন আর নামটি লিখে নিজের কাছে রাখলে সে বিপদ থেকে মুক্তি পাবে। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৪৬");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-ওয়াসি' (الْوَاسِعُ)\nঅর্থ: সর্ব-ব্যাপী, সর্বত্র-বিরাজমান\nফজিলত: অধিক পরিমাণে এ নামের যিকির করলে আল্লাহ্\u200c তায়ালা তাকে প্রকাশ্য ও ভিতরগত অমুখাপেক্ষিতা ও বরকত দান করবে। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৪৭");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-হাকীম (الْحَكِيمُ)\nঅর্থ: পরম-প্রজ্ঞাময়\nফজিলত: ক্রমাগত এই নাম পাঠ করলে, আল্লাহ্\u200c তায়ালা তার জন্য জ্ঞান বিজ্ঞানের দ্বার খুলে দিবেন। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৪৮");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-ওয়াদুদ (الْوَدُودُ)\nঅর্থ: (বান্দাদের প্রতি) সদয়\nফজিলত: ১০০ বার পড়ে খাদ্যে ফু দিয়ে স্বামী স্ত্রী থেলে তাদের মধ্যে ভালবাসা সৃষ্টি হয়। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৪৯");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-মাজীদ (الْمَجِيدُ)\nঅর্থ: সকল-মর্যাদার-অধিকারী\nফজিলত: প্রত্যহ সকালে ও সন্ধ্যায় ১০০ বার পড়ে শরীরে ফু দিলে সমাজে মর্যাদা বৃদ্ধি পায়।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৫০");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-বাই'ছ' (الْبَاعِثُ)\nঅর্থ: পুনুরুজ্জীবিতকারী\nফজিলত: নিদ্রার পূর্বে বুকের উপর হাত রেখে ১০০০ বার পড়লে জ্ঞান ও হেকমত বৃদ্ধি পায়। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৫১");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আশ্-শাহীদ (الشَّهِيدُ)\nঅর্থ: সর্বজ্ঞ-স্বাক্ষী\nফজিলত: এ নামের যিকির বেশী বেশী পড়লে অন্তরের খারাপ বাসনা দূর হয়। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৫২");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-হা'ক্ব (الْحَقُّ)\nঅর্থ: পরম সত্য\nফজিলত: যদি, পরিবারের কোন সদস্য নিখোঁজ বা পলাতক বা জিনিসপত্র চুরি হয়ে থাকলে, চারকোণ বিশিষ্ট কাগজের চতুষ্কোণে নামটি লিখে সেহরীর সময় হাতের তালুর উপর রেখে আকাশের দিকে উঠিয়ে দোয়া করবে, ইনশাআল্লাহ্\u200c যে কোন ব্যক্তি অথবা জিনিস পাওয়া যাবে এবং ক্ষতি থেকে নিরাপদ থাকবে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৫৩");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-ওয়াকিল (الْوَكِيلُ)\nঅর্থ: পরম নির্ভরযোগ্য কর্ম-সম্পাদনকারী\nফজিলত: যে ব্যক্তি বিপদ আপদের সময় ভয়ে অধিক হারে এই নামটি পাঠ করবে, ইনশাআল্লাহ্\u200c বিপদ আপদ থেকে নিরাপদ থাকবে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৫৪");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-ক্বউইউ (الْقَوِيُّ)\nঅর্থ: পরম-শক্তির-অধিকারী\nফজিলত: জুম্মার পর এ নামের যিকির করলে যুলুম থেকে বাচা যায়। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৫৫");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-মাতীন (الْمَتِينُ)\nঅর্থ: সুদৃঢ়\nফজিলত: যে কোন ভদ্রমহিলা এর বুকের দুধের না থাকলে এক টুকরো কাগজের উপর আল্লাহ্\u200c এর এই নাম লিখে পানিতে ডুবিয়ে রেখে তারপর এটি পান করলে তার বুকের মধ্যে দুধ আসবে ইনশাআল্লাহ্\u200c");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৫৬");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-ওয়ালিইউ (الْوَلِيُّ)\nঅর্থ: অভিভাবক ও সাহায্যকারী\nফজিলত: যে ব্যক্তি অধিক হারে এই নামটি পড়বে সে সৃষ্ট জীবের গোপন তথ্য সম্পর্কে জানবে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৫৭");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-হা'মীদ (الْحَمِيدُ)\nঅর্থ: সকল প্রশংসার অধিকারী\nফজিলত: যে ব্যক্তি ৪৫ দিন পর্যন্ত ধারাবাহিক ৯৩ বার নির্জনতায় নামটি পাঠ করবে, ইনশাআল্লাহ্\u200c সকল অসৎ স্বভাব দূর হয়ে যাবে এবং তার থেকে উত্তম কার্যাবলী প্রকাশ পাবে। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৫৮");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-মুহছী (الْمُحْصِي)\nঅর্থ: সকল সৃষ্টির ব্যপারে অবগত\nফজিলত: যে ব্যক্তি রুটির ২০ টি টুকরোর উপর প্রতিদিন ২০ বার এই নামটি পড়ে ফু দিবে এবং খাবে তাহলে ইনশাআল্লাহ্\u200c সৃষ্টি জগত তার অনুগত হয়ে যাবে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৫৯");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-মুব্দি' (الْمُبْدِئُ)\nঅর্থ: প্রথমবার-সৃষ্টিকর্তা\nফজিলত: যে ব্যক্তি সেহরীর সময় গর্ভবতি নারীর পেটের উপর হাত রেখে ৯৯ বার এই নামটি পাঠ করবে, ইনশাআল্লাহ্\u200c না তার গর্ভপাত হবে, না সময়ের আগে বাচ্চা ভূমিষ্ঠ হবে। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৬০");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-মুঈ'দ (الْمُعِيدُ)\nঅর্থ: পুনরায়-সৃষ্টিকর্তা\nফজিলত: কোন ব্যক্তি হারিয়ে গেলে যখন গৃহের সকল ব্যক্তি ঘুমিয়ে পড়বে তখন হারানো ব্যক্তিকে ফেরত আনার জন্য গৃহের ৪ কোণে ৭০ বার নামটি পড়বে, ইনশাআল্লাহ্\u200c হারানো ব্যক্তি ৭ দিনের মধ্যে ফেরত আসবে অথবা তার কোন খবর পাওয়া যাবে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৬১");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-মুহ'য়ী (الْمُحْيِي)\nঅর্থ: জীবন-দানকারী\nফজিলত: যে ব্যক্তি অসুস্থ হবে সে অধিক হারে পাঠ করবে অথবা কোন রোগীর উপর ফু দিবে তাহলে ইনশাআল্লাহ্\u200c সুস্থ হয়ে যাবে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৬২");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-মুমীত (اَلْمُمِيتُ)\nঅর্থ: মৃত্যু-দানকারী\nফজিলত: যে ব্যক্তি আত্মার নিয়ন্ত্রনে না থাকে সে শয়ন কালে বক্ষদেশে হাত রেখে এই নামটি পড়তে পড়তে ঘুমিয়ে পড়বে। আল্লাহ্\u200c চান তো তার নফস বাধ্য ও অনুগত হয়ে যাবে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৬৩");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-হাইয়্যু (الْحَيُّ)\nঅর্থ: চিরঞ্জীব\nফজিলত: যে ব্যক্তি প্রতিদিন ৩০০০ বার এই নামটি পাঠ করবে ইনশাআল্লাহ্\u200c সে কখনও অসুস্থ হবেনা।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৬৪");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-ক্বাইয়্যুম (الْقَيُّومُ)\nঅর্থ: সমস্তকিছুর ধারক ও সংরক্ষণকারী\nফজিলত: যে ব্যক্তি এই নামটি শেষ রাতে অধিকবার পড়বে, ইনশাআল্লাহ্\u200c মানুষের হৃদয়ে তার মর্যাদা বৃদ্ধি পাবে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৬৫");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-ওয়াজিদ (الْوَاجِدُ)\nঅর্থ: অফুরন্ত ভান্ডারের অধিকারী\nফজিলত: খাওয়ার সময় পড়লে ওই খাদ্য কলবের শক্তি ও নূর সৃষ্টির সহায়ক হবে। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৬৬");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-মাজিদ (الْمَاجِدُ)\nঅর্থ: শ্রেষ্ঠত্বের অধিকারী\nফজিলত: যে ব্যক্তি নির্জনতায় এই নামটি অধিক পাঠ করলে, ইনশাআল্লাহ্\u200c তার অন্তরের ভিতর আল্লাহ্\u200c এর জ্যোতি প্রকাশ হতে শুরু করবে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৬৭");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-ওয়াহি'দ (اَلاَحَدُ)\nঅর্থ: এক ও অদ্বিতীয়\nফজিলত: প্রত্যহ ১০০০ বার পাঠ করলে মন থেকে ভয় ভীতি দূর হয়ে যাবে।। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৬৮");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আছ্-ছমাদ (الصَّمَدُ)\nঅর্থ: অমুখাপেক্ষী\nফজিলত: যে ব্যক্তি ভোর রাতে অথবা কিছু রাত থাকতে সেজদায় মাথা রেখে ১১৫ অথবা ১২৫ বার এই নামটি পড়বে, তার বাহ্যিক ও ভিতরগত ভাবে সত্যবাদিতা লাভ হবে এবং কোন অত্যাচারি দ্বারা পিষ্ট হবেনা।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৬৯");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-ক্বদির (الْقَادِرُ)\nঅর্থ: সর্বশক্তিমান\nফজিলত: যে ব্যক্তি ওজু করার সময় অঙ্গ প্রত্যঙ্গ ধৌত করার সময় প্রতিটি জোড়ার উপর এই নামটি পড়বে, সে কখন জালিমের থাবায় আবদ্ধ হবেনা। কোন শত্রু তার উপর বিজয় লাভ করতে পারবেনা।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৭০");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-মুক্ব্তাদির (الْمُقْتَدِرُ)\nঅর্থ: নিরঙ্কুশ-সিদ্বান্তের-অধিকারী\nফজিলত: যদি কেউ এই নামটি সর্বদা পড়ে তবে তার উদাসীনতা স্মরনের দ্বারা পরিবর্তিত হবে। যে ব্যক্তি নিদ্রা থেকে উঠার পর ২০ বার এই নামটি পড়বে, তবে তার সব কাজ ঠিক এবং সমাধান হয়ে যাবে। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৭১");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-মুক্বদ্দিম (الْمُقَدِّمُ)\nঅর্থ: অগ্রসারক\nফজিলত: যে ব্যক্তি যুদ্ধের সময় অধিক হারে পরবে অথবা লিখে নিজের কাছে রাখবে, আল্লাহ্\u200c তায়ালা তাকে সামনে অগ্রসর হওয়ার ক্ষমতা দান করবেন এবং শত্রুদের থেকে নিরাপদ রাখবেন। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৭২");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-মুয়াক্খির (الْمُؤَخِّرُ)\nঅর্থ: অবকাশ দানকারী\nফজিলত: প্রতিদিন ১০০ বার আল্লাহ্\u200c এর নাম পাঠ করলে, তিনি দুর্মূল্য এবং আল্লাহর প্রিয় হয়ে যাবেন । ইনশাআল্লাহ্।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৭৩");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-আউয়াল (الأوَّلُ)\nঅর্থ: সর্বপ্রথম \nফজিলত: কোন ব্যক্তি পুত্র সন্তান এর ইচ্ছা পোষণ করলে, ৪০ দিনের জন্য ৪০ বার নামটি পাঠ করলে ইনশাআল্লাহ্\u200c তার উদ্দেশ্য পুরন হবে। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৭৪");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-আখির (الآخِرُ)\nঅর্থ: অনন্ত, সর্বশেষ\nফজিলত: যে ব্যক্তি প্রতিদিন ১০০০ বার পরবে, তার অন্তর থেকে আল্লাহ্\u200c ছাড়া অন্য কিছুর ভালবাসা দূর হয়ে যাবে। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৭৫");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আজ-জ'হির (الظَّاهِرُ)\nঅর্থ: সম্পূর্নরূপে-প্রকাশিত\nফজিলত: প্রত্যহ ইশরাক এর পর ৫০০ বার পড়লে চোখের দৃষ্টি শক্তি ও অন্তরে নূর লাভ হয় । ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৭৬");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-বাত্বিন (الْبَاطِنُ)\nঅর্থ: দৃষ্টি হতে অদৃশ্য\nফজিলত: প্রত্যহ ৩৩ বার পড়লে গোপন রহস্য জানা যাবে। তার অন্তরে আল্লাহ্\u200cর ভালবাসা সৃষ্টি হবে। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৭৭");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-ওয়ালি (الْوَالِي)\nঅর্থ: সমস্ত-কিছুর-অনিভাব্ক\nফজিলত: এ নামের নিয়মিত যিকির করলে আল্লাহ বিপদ আপদ থেকে রক্ষা করে । ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৭৮");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-মুতাআ'লি (الْمُتَعَالِي)\nঅর্থ: সৃষ্টির গুনাবলীর উর্দ্ধে\nফজিলত: যে ব্যক্তি অধিক বার পরবে, ইনশাআল্লাহ্\u200c তার সমস্যা দূর হবে। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৭৯");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-বার্ (الْبَرُّ)\nঅর্থ: পরম-উপকারী, অণুগ্রহশীল\nফজিলত: কোন ব্যক্তি ৭ বার আল্লাহ্\u200cর এই নাম পাঠ করে সন্তান জন্মের পর তার সন্তানের উপর ফুঁ দিলে, আল্লাহ্\u200c বিপর্যয় থেকে তার সন্তান কে সুরক্ষা করবে। ইনশাআল্লাহ্\u200c");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৮০");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আত্-তাওয়াব (التَّوَابُ)\nঅর্থ: তাওবার তাওফিক দানকারী এবং কবুলকারী\nফজিলত: চাশতের নামাযের পর সেজদায় গিয়ে এ নামটি ৩০০ বার পড়বে, ইনশাআল্লাহ্\u200c তার সত্য তওবা লাভ হবে। যে ব্যাক্তি এ নামটি বার বার পাঠ করবে, তার সকল কর্ম সহজ হবে। যদি কোন অত্যাচারীর উপর ফুঁ দেয়া হয় তবে ইনশাআল্লাহ্\u200c তা থেকে মুক্তি লাভ হবে। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৮১");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-মুনতাক্বিম (الْمُنْتَقِمُ)\nঅর্থ: প্রতিশোধ-গ্রহণকারী\nফজিলত: যে ব্যক্তি ন্যায়ের উপর থাকে এবং শত্রু থেকে প্রতিশোধ নেয়ার ক্ষমতা না থাকে, সে তিন জুম্মা পর্যন্ত অধিকহারে (ইয়া মুনতাক্বিমু) পড়বে, আল্লাহ তায়ালা স্বয়ং তার থেকে প্রতিশোধ নিয়ে নিবেন। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৮২");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-আ'ফঊ (العَفُوُّ)\nঅর্থ: পরম-উদার\nফজিলত: যার প্রচুর গুনাহ আছে, সে লোকটি প্রতিনিয়ত এ নামটি পড়লে আল্লাহ তায়ালা তার গুনাহ ক্ষমা করে দিবেন। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৮৩");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আর-রউফ (الرَّؤُوفُ)\nঅর্থ: পরম-স্নেহশীল\nফজিলত: যে ব্যক্তি দশবার দুরুদ শরীফ এবং দশবার এ নামটি পড়বে, তবে ইনশালাআল্লাহ তার ক্রোধ দূর হয়ে যাবে। অন্য রাগান্বিত ব্যাক্তির উপর ফুঁ দিলে তবে তার রাগ দূর হবে। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৮৪");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: মালিকুল-মুলক (مَالِكُ الْمُلْكِ)\nঅর্থ: সমগ্র জগতের বাদশাহ্\nফজিলত: যে ব্যক্তি (ইয়া মালিকাল মুলক) সর্বদা পাঠ করবে, আল্লাহ তায়ালা তাকে লোকদের থেকে অমুখাপেক্ষী করে দিবেন। সে কার মুখাপেক্ষী থাকবে না। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৮৫");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: যুল-জালালি-ওয়াল-ইকরাম (ذُوالْجَلاَلِ وَالإكْرَامِ)\nঅর্থ: মহিমান্বিত ও দয়াবান সত্তা\nফজিলত: যে ব্যক্তি অধিকহারে পড়বে, আল্লাহ তায়ালা তাকে শ্রেষ্ঠত্ব ও সম্মান এবং সৃষ্টজগত থেকে অমুখাপেক্ষীতা দান করবেন। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৮৬");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-মুক্ব্সিত (الْمُقْسِطُ)\nঅর্থ: হকদারের হক-আদায়কারী\nফজিলত: যে ব্যাক্তি এ নামটি প্রতিদিন ১০০ বার পড়বে, শয়তানের আনিদিষ্টতা ও কুমন্ত্রণা থেকে নিরাপদ থাকবে। যদি ৭ বার পড়ে তবে সে উদ্দেশ্য অর্জন হবে। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৮৭");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-জামিই' (الْجَامِعُ)\nঅর্থ: একত্রকারী, সমবেতকারী\nফজিলত: যার আত্মীয়-স্বজন ও বন্ধু বান্ধব বিক্ষিপ্ত হয়ে থাকে, সে চাশতের সময় গোসল করে আকাশের দিকে তাকিয়ে আল্লাহ্\u200cর এই নাম ১০০ বার পাঠ করলে তার পরিবারের হারানো সদস্য শিগ্রই খুঁজে পাবেন। ইনশাআল্লাহ্\u200c");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৮৮");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-গণিই' (الْغَنِيُّ)\nঅর্থ: অমুখাপেক্ষী ধনী\nফজিলত: যে ব্যাক্তি প্রতিদিন ৭০ বার এই নামটি পড়বে, আল্লাহ তাআলা তার অর্থ-সম্পদ বরকত দান করবেন। ইনশাল্লাল্লাহ সে কারো মুখাপেক্ষী হবে না। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৮৯");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-মুগণিই' (الْمُغْنِي)\nঅর্থ: পরম-অভাবমোচনকারী\nফজিলত: যে ব্যাক্তি শুরু ও শেষে ১১ বার দুরুদ শরীফ পড়ে এগার শত এগার বার ওযীফার ন্যায় এ নামটি পড়বে, তবে আল্লাহ তায়ালা তাকে বাহিরগত ও ভিতরগত ধনী করে দিবেন।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৯০");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-মানিই' (اَلْمَانِعُ)\nঅর্থ: অকল্যানরোধক\nফজিলত: যদি স্ত্রির সাথে ঝগড়া-বিবাদ অথবা তিক্ততা সৃষ্টি হয়ে থাকে, তবে বিছানায় শোয়ার সময় ২০ বার এ নামটি পড়বে, ইনশাল্লাহ ঝগড়া-বিবাদ ও তিক্ততা দূর হয়ে যাবে এবং পরস্পর ভালবাসা সৃষ্টি হয়ে যাবে। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৯১");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আয্-যর (الضَّارَّ)\nঅর্থ: ক্ষতিসাধনকারী\nফজিলত: সকাল সন্ধা এ নামের \u200dযিকির করলে সকল ভাল কাজে সফলতা আসবে ইনশাআল্লাহ। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৯২");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আন্-নাফিই' (النَّافِعُ)\nঅর্থ: কল্যাণকারী\nফজিলত: যে ব্যক্তি কোন পরিচিত স্থানে পোঁছাবে এবং শুক্রবার রাতে যে ব্যক্তি নৌকা অথবা অন্য কোন যানবাহনে আরোহণের পর অধিকহারে পড়তে থাকবে, ইনশাআল্লাহ্\u200c ইচ্ছানুযায়ী কাজ হবে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৯৩");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আন্-নূর (النُّورُ)\nঅর্থ: পরম-আলো\nফজিলত: যে ব্যক্তি জুমার রাতে সাত বার সুরা নুর এবং এক হাজার বার এ নামটি পড়বে, তবে ইনশাআল্লাহ্\u200c তার অন্তর আল্লাহর জ্যোতি দারা আলকিত হয়ে যাবে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৯৪");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-হাদী (الْهَادِي)\nঅর্থ: পথ-প্রদর্শক\nফজিলত: যে ব্যক্তি হাত উঠিয়ে আকাশ পানে মূখ করে এ নামটি অধিক হারে পড়বে, অবশেষে মুখমন্ডলে হাত মুছে নিবে, ইনশাআল্লাহ্\u200c তার পূর্ণ হেদায়েত লাভ হবে, আর মারেফাত পন্থীদের মধ্যে অন্তভুক্ত হয়ে যাবে। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৯৫");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-বাদীই' (الْبَدِيعُ)\nঅর্থ: অতুলনীয়\nফজিলত: যে ব্যক্তি কোন দুশ্চিন্তা বিপদাপদ অথবা কোন সমস্যা সম্মুখে আসে, সে ১০০০ বার এ নামটি পড়বে ইনশাআল্লাহ্\u200c সমস্যার সমাধান লাভ হবে। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৯৬");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-বাক্বী (اَلْبَاقِي)\nঅর্থ: চিরস্থায়ী, অবিনশ্বর\nফজিলত: জুম্মার রাতে যে ব্যক্তি এ নামটি ১০০ বার পড়বে, আল্লাহ তায়ালা তাকে সব ধরনের অনিষ্ট ও ক্ষতি থেকে নিরাপরাদ রাখবেন। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৯৭");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আল-ওয়ারিস' (الْوَارِثُ)\nঅর্থ: উত্তরাধিকারী\nফজিলত: যে ব্যক্তি প্রত্যহ সূর্যোদয়ের পূর্বক্ষণে ১০১ বার পড়বে, ইনশাআল্লাহ্\u200c সে যাবতীয় দুঃখ- বেদনা, চিন্তা- ভাবনা, কঠোরতা ও বিপদ থেকে মুক্তি থাকবে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৯৮");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আর-রাশীদ (الرَّشِيدُ)\nঅর্থ: সঠিক পথ-প্রদর্শক\nফজিলত: যে ব্যক্তি নিজের কোন কাজ বা উদ্দেশ্য সমাধানের কোন তদবির বুঝে না আসে, মাগরিব ও এশার মাঝে সে (আর-রাশীদু) নামটি ১০০০ বার পড়বে, তবে ইনশাআল্লাহ্\u200c স্বপ্নে তদ্বির দেখা যাবে, অথবা অন্তরে ঢেলে দেয়া হবে। ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৯৯");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নাম: আস-সবুর (الصَّبُورُ)\nঅর্থ: অত্যধিক ধৈর্যধারণকারী\nফজিলত: যে ব্যক্তি সূর্যোদয়ের পূর্বে এ নামটি একশত বার পড়বে, ইনশাআল্লাহ্\u200c সেদিন সে সকল বিপদাপদ থেকে নিরাপদ থাকবে ও বরকত লাভ হয়। শত্রু ও হিংসুকদের মুখ বন্ধ থাকবে। ");
        this.map_list.add(this.map_var);
    }

    private void _Asmaun_Nababi() {
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "১");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "مُحَمَّدٌ \n(মুহাম্মাদুন)\nঅর্থ: অতি প্রশংসিত");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "২");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "اَحْمَدٌ \n(আহমাদুন)\nঅর্থ: অতি প্রশংসিত");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৩");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "حَامِدٌ \n(হা-মিদুন)\nঅর্থ: প্রশংসাকারী");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৪");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "مَحْمُوْدٌ \n(মাহমুদুন)\nঅর্থ: প্রশংসনীয়");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৫");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "قَاسِمٌ \n(ক্বা-সিমুন)\nঅর্থ: বণ্টনকারী");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৬");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "عَاقِبٌ \n(আ-ক্বিবুন)\nঅর্থ: পশ্চাদগামী");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৭");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "فَاتِحٌ \n(ফা-তিহুন)\nঅর্থ:  বিজয়ী");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৮");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "خَاتِمٌ \n(খা-তিমুন)\nঅর্থ: সমাপনকারী");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৯");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "حَاشِرٌ\n(হা-শিরুন)\nঅর্থ: একত্রকারী");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "১০");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "مَاحٍ\n(মা-হিন)\nঅর্থ: নিশ্চিহ্নকারী");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "১১");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "دَاعٍ\n(দা-ইন)\nঅর্থ: আহ্বায়ক");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "১২");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "سِرَاجٌ\n(সিরা-জুন)\nঅর্থ: প্রদীপ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "১৩");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "رَاشِيْدٌ\n(রা-শীদুন)\nঅর্থ: ন্যায়পরায়ণ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "১৪");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "مُنِيْرٌ\n(মুনীরুন)\nঅর্থ: প্রদীপ্ত");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "১৫");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "بَشِيْرٌ\n(বা-শীরুন)\nঅর্থ: সুসংবাদ দাতা");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "১৬");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "نَذِيْرٌ\n(নাযীরুন)\nঅর্থ: ভয় প্রদর্শনকারী");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "১৭");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "هَادٍ\n(হা-দিন)\nঅর্থ: পথ প্রদর্শক");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "১৮");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "مَهْدِ\n(মাহদিন)\nঅর্থ: হেদায়ত প্রাপ্ত");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "১৯");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "رَسُوْلٌ\n(রাসুলূন)\nঅর্থ: প্রেরিত");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "২০");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "نَبِىٌّ\n(নাবিয়্যূন)\nঅর্থ: নবী");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "২১");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "طٰهٰ\n(ত্বো-হা)\nঅর্থ: এগুলো হুরেফে মুকাত্ত্বায়াত বা বিচ্ছিন্ন হরফ যার অর্থ আল্লাহ্ ও তাঁর রাসূল ভাল জানেন।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "২২");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "يٰسۤ\n(ইয়া-সীন)\nঅর্থ:  এগুলো হুরেফে মুকাত্ত্বায়াত বা বিচ্ছিন্ন হরফ যার অর্থ আল্লাহ্ ও তাঁর রাসূল ভাল জানেন।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "২৩");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "مُزَّمِّلٌ\n(মুজ্জাম্মিলুন)\nঅর্থ: বস্ত্রাবৃত");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "২৪");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "مُدَّثِرٌ\n(মুদ্দাচ্ছিরুন)\nঅর্থ: মুদাচ্ছিরুন");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "২৫");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "خَلِيْلٌ\n(খলিলুন)\nঅর্থ: অন্তরঙ্গ বন্ধু");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "২৬");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "كَلِيْمٌ\n(কালীমুন)\nঅর্থ: কথোপকথনকারী");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "২৭");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "حَبِيْبٌ\n(হাবীবুন)\nঅর্থ: অদ্বিতীয় বন্ধু");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "২৮");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "مُصْطَفٰى\n(মুসত্বোয়াফা)\nঅর্থ: মনোনীত");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "২৯");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "مُرْتَضٰى\n(মুরত্বাদ্বোয়া)\nঅর্থ: সন্তুষ্টি প্রাপ্ত");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৩০");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "مُجْتَبٰى\n(মুজতাবা-)\nঅর্থ: নির্বাচিত");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৩১");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "مُخْتَارٌ\n(মুখতা-রুন)\nঅর্থ: ইখতিয়ার প্রাপ্ত");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৩২");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "نَاصِرٌ\n(না-সিরুন)\nঅর্থ: সাহায্যকারী");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৩৩");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "مَنْصُوْرٌ\n(মানছুরুন)\nঅর্থ: সাহায্য প্রাপ্ত");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৩৪");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "قَائِمٌ\n(ক্বা-ইমুন)\nঅর্থ: প্রতিষ্ঠিত");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৩৫");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "حَافِظٌ\n(হা-ফিজুন)\nঅর্থ: রক্ষণশীল");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৩৬");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "شَهِيْدٌ\n(শাহীদুন)\nঅর্থ: প্রত্যক্ষকারী");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৩৭");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "عَادِلٌ\n(আ’দিলুন)\nঅর্থ: ন্যায় বিচারক");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৩৮");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "حَكِيْمٌ\n(হাকীমুন)\nঅর্থ: বৈজ্ঞানিক");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৩৯");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "نُوْرٌ\n(নূরুন)\nঅর্থ: আলো");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৪০");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "حُجَّةٌ\n(হুজ্জাতুন)\nঅর্থ: দলীল");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৪১");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "بُرْهَانٌ\n(বুরহা-নুন)\nঅর্থ: সনদ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৪২");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "اَبْطَحِىٌّ\n(আব ত্বোয়াহিয়্যুন)\nঅর্থ: মরুবাসী");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৪৩");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "مُؤْمِنٌ\n(মু’মিনুন)\nঅর্থ: বিশ্বাসী");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৪৪");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "مُطِيْعٌ\n(মুত্বীউন)\nঅর্থ: অনুগত");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৪৫");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "مُذَكِّرٌ\n(মুজাক্কিরুন)\nঅর্থ: নসিহতকারী");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৪৬");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "وَاعِظٌ\n(ওয়া’ইজুন)\nঅর্থ: উপদেশ দাতা");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৪৭");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "اَمِيْنٌ\n(আমীনুন)\nঅর্থ: বিশ্বস্ত");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৪৮");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "صَادِقٌ\n(ছোয়া-দিকুন)\nঅর্থ: সত্যবাদী");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৪৯");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "شَفِيْعٌ\n(শাফী’উন)\nঅর্থ: সুফারিশকারী");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৫০");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "نَاطِقٌ\n(না-ত্বিকুন)\nঅর্থ: প্রবক্তা");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৫১");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "صَاحِبٌ\n(ছোয়াহিবুন)\nঅর্থ: সাথী");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৫২");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "مَكِّىٌّ\n(মাক্কিয়্যুন)\nঅর্থ: মক্কাবাসী");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৫৩");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "مَدَنِىٌّ\n(মাতানিয়্যুন)\nঅর্থ: মদিনাবাসী");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৫৪");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "عَرَبِىٌّ\n(আ’রাবিয়্যুন)\nঅর্থ: আরববাসী");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৫৫");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "هَاشِمِىٌّ\n(হা-শিমিয়্যুন)\nঅর্থ: হাশেম বংশীয়");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৫৬");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "تِهَامِىٌّ\n(তিহা-মিয়্যুন)\nঅর্থ: তিহামাবাসী");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৫৭");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "حِجَازِىٌّ\n(হিজ্বা-যিয়্যুন)\nঅর্থ: হেজাযবাসী");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৫৮");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "نَزَارِىٌّ\n(নাযা-রিয়্যুন)\nঅর্থ: নযর বংশীয়");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৫৯");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "قُرَيْشِىٌّ\n(ক্বুরাইশিয়্যুন)\nঅর্থ: কুরাইশ বংশীয়");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৬০");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "مُضَرِىٌ\n(মুদ্বোয়ারিয়্যুন)\nঅর্থ: মুজার বংশীয়");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৬১");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "اُمِّىٌّ\n(উম্মিয়্যুন)\nঅর্থ: সৃষ্টির মূল");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৬২");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "عَزِيْرٌ\n(আযীযুন)\nঅর্থ: সম্মানিত");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৬৩");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "حَرِيْصٌ\n(হারীছুন)\nঅর্থ: আগ্রহশীল");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৬৪");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "رَئُوْفٌ\n(রাউফুন)\nঅর্থ: সদয়");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৬৫");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "رَحِيْمٌ\n(রাহীমুন)\nঅর্থ: দয়ালু");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৬৬");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "يَتِيْمٌ\n(ইয়াতীমুন)\nঅর্থ: এতিম");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৬৭");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "غَنِىٌّ\n(গানিয়্যুন)\nঅর্থ: ধনবান");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৬৮");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "جَوَادٌ\n(জাওয়াদুন)\nঅর্থ: দানবীর");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৬৯");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "فَتَّاحٌ\n(ফাত্তা-হুন)\nঅর্থ: উন্মোচনকারী");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৭০");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "عَالِمٌ\n(আ’লিমুন)\nঅর্থ: জ্ঞানবান");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৭১");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "طَيِّبٌ\n(ত্বোয়্যিবুন)\nঅর্থ: উত্তম");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৭২");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "طَاهِرٌ\n(ত্বোয়াহিরুন)\nঅর্থ: পবিত্র");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৭৩");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "مُطَهَّرٌ\n(মুতাহহারুন)\nঅর্থ: পবিত্রকৃত");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৭৪");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "خَطِيْبٌ\n(খাতীবুন)\nঅর্থ: সুবক্তা");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৭৫");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "مُصَدِّقٌ\n(মুছাদ্দিক্বুন)\nঅর্থ: সত্যায়নকারী");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৭৬");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "فَصِيْحٌ\n(ফাসি-হুন)\nঅর্থ: বাকপটু");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৭৭");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "سَيّدٌ\n(সায়্যিদুন)\nঅর্থ: সরদার");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৭৮");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "مُنْتَقَى\n(মুনতাকান)\nঅর্থ: মনোনীত");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৭৯");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "اِمَامٌ\n(ইমামুন)\nঅর্থ: সর্বাধিনায়ক");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৮০");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "بَارٌّ\n(বা-ররুন)\nঅর্থ: পূণ্যবান");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৮১");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "شَافٍ\n(শা-ফীন)\nঅর্থ: আরোগ্যকারী");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৮২");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "مَتَوَسِّطٌ\n(মুতাওয়াসসিতন)\nঅর্থ: মধ্যবর্তী");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৮৩");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "سَابِقٌ\n(সা-বিকুন)\nঅর্থ: পূর্ববর্তী");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৮৪");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "مُتَصَدِّقٌ\n(মুতাছোয়াদ্দিকুন)\nঅর্থ: দানকারী");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৮৫");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "مُهْتَدِىٌ\n(মুহতাদিয়্যুন)\nঅর্থ: হেদায়ত প্রাপ্ত");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৮৬");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "حَقٌّ\n(হাক্বক্বুন)\nঅর্থ: সত্য");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৮৭");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "مُبِيْنٌ\n(মুবীনুন)\nঅর্থ: উজ্জ্বল");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৮৮");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "اَوَّلٌ\n(আওয়্যালুন)\nঅর্থ: সর্বপ্রথম");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৮৯");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "اٰخِرٌ\n(আখিরুন)\nঅর্থ: সর্বশেষ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৯০");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "ظَاهِرٌ\n(জোয়াহিরুন)\nঅর্থ: প্রকাশ্য");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৯১");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "بَاطِنٌ\n(বা-ত্বিনুন)\nঅর্থ: অপ্রকাশ্য");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৯২");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "رَحْمَةٌ\n(রাহমাতুন)\nঅর্থ: রহমত");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৯৩");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "مُحَلِّلٌ\n(মুহাল্লিলুন)\nঅর্থ: হালালকারী");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৯৪");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "مُحَرِّمٌ\n(মুহাররিমুন)\nঅর্থ: হারামকারী");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৯৫");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "اٰمِرٌ\n(আ’মিরুন)\nঅর্থ: আদেশ দাতা");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৯৬");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "نَاهٍ\n(নি-হিন)\nঅর্থ: নিষেধকারী");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৯৭");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "شَكُوْرٌ\n(শাকুরুন)\nঅর্থ: কৃতজ্ঞ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৯৮");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "قَرِيْبٌ\n(ক্বারীবুন)\nঅর্থ: নিকটতম");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "৯৯");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "اَوْلٰى\n(আওলা)\nঅর্থ: সর্বোত্তম");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "১০০");
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "مُبَلِّغٌ\n(মুবাল্লিগুন)\nঅর্থ: ধর্মপ্রচারকারী");
        this.map_list.add(this.map_var);
    }

    private void _Qasidatul_Numaan() {
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ১");
        this.map_var.put("arabic", "ﻳﺎﺳﻴﺪ ﺍﻟﺴﺎﺩﺍﺕ ﺝﺀﺗﻚ ﻗﺼﺪﺍ\nﺍﺭﺟﻮ ﺭﺿﺎﻙ ﻭﺍﺣﺘﻤﻲ ﺑﺤﻤﺎﻙ");
        this.map_var.put("syllable", "হে মনিব! এসেছি তব দ্বারে লয়ে বড় আশা,\nলভিব তব তুষ্টি তব আশ্রয়ে বাঁধিব বাসা");
        this.map_var.put("meaning", "অর্থ: হে মহান সাইয়্যিদ (সরদার)! আপনার মহান সন্তুষ্টি ও আশ্রয় লাভের উদ্দেশ্যে আমি আপনার নিকটে এসেছি।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ২");
        this.map_var.put("arabic", "ﻭﺍﻟﻠﻪ ﺧﻴﺮﺍ ﺍﺧﻼﺀﻕ ﺍﻥ ﻟﻲ\nﻗﻠﺒﺎ ﻣﺸﻮﻗﺎ ﻻ ﻳﺮﻭﻡ ﺳﻮﺍﻙ");
        this.map_var.put("syllable", "হে সৃষ্টির সেরাজন! শপথ মহান আল্লাহর!\n তৃষিত হৃদয়ের কামণা, শুধু তুমি! নহে কেহ আর");
        this.map_var.put("meaning", "অর্থ: হে সৃষ্টির সর্বোত্তম ! আল্লাহর শপথ করে বলছি, আমার এই আগ্রহী হৃদয় শুধু আপনাকেই চায়, আর কাউকে নয়।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ৩");
        this.map_var.put("arabic", "ﻭﺑﺤﻖ ﺟﺎﻫﻚ ﺍﻧﺒﻲ ﺑﻚ ﻣﻐﺮﻡ\nﻭﺍﺍﻟﻠﻪ ﻳﻌﻠﻢ ﺍﻧﻨﻲ ﺍﻫﻮﺍﻙ");
        this.map_var.put("syllable", "শপথ! মহান আল্লাহর মহত্ত্বের,\nআমি শুধু তব অনুরাগী!\nআল্লাহ পাকই ভাল জানেন!\nআমি তব প্রেম-শরাব পানেতে ব্যাকুল হে সাক্বী!");
        this.map_var.put("meaning", "অর্থ: আপনার মহিমার শপথ! আমি শুধু আপনারই অনুরাগী। আল্লাহ পাক জানেন, আমি কেবল আপনাকেই চাই।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ৪");
        this.map_var.put("arabic", "ﺍﻧﺖ ﺍﻟﺬﻱ ﻟﻮﻻﻙ ﻣﺎ ﺧﻠﻖ ﺍﻣﺮﺀ\nﻛﻼﻭ ﻻ ﺧﻠﻖ ﺍﻟﻮﺭﻱ ﻟﻮﻻﻙ");
        this.map_var.put("syllable", "যদি না হতো তব সৃজন,\nহতোনা সৃষ্টির এত আয়োজন!\nহতো না কভূ কায়েনাতের প্রকাশ,\nযদি না  হতো তব রচন!");
        this.map_var.put("meaning", "অর্থ : আপনি না হলে, না কোন মানুষ সৃষ্টি করা হত, না নিখিল বিশ্বের কোন কিছু সৃষ্টি হত।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ৫");
        this.map_var.put("arabic", "ﺍﻧﺖ ﺍﻟﺬﻱ ﻣﻦ ﻧﻮﺭﻙ ﺍﻟﺒﺪﺭ ﺍﻛﺘﺴﻲ\nﻭﺍﻟﺸﻤﺲ ﻣﺸﺮﻗﺔ ﺑﻨﻮﺭ ﺑﻬﺎﻙ");
        this.map_var.put("syllable", "তব পূত-জ্যোতির মোতিবস্ত্র পরে চন্দ্র বিলায় আলো!\nতব পূত-আলোক প্রভায় প্রদীপ্ত রবির উদয় হলো!");
        this.map_var.put("meaning", "অর্থ : আপনার নূর মুবারকের পোশাক পরে চন্দ্র আলোকিত হয়েছে। আপনারই নূর মুবারকের আভায় সূর্য জ্যোতির্ময় হয়েছে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ৬");
        this.map_var.put("arabic", "انت الذي لما رفعت الي السماء\nبك قد سمت وتزينت لسراك");
        this.map_var.put("syllable", "আপনি এমন রাজন! যার অভ্যর্থনায় আকাশ সুউচ্চ!\nযার ভ্রমণকল্পে ঊর্ধ্বজগত সুশোভিত পুষ্পগুচ্ছ!");
        this.map_var.put("meaning", "অর্থ: আপনাকে উর্ধাকাশে ভ্রমন করানোর ফলেই আসমান সুউচ্চ এবং সুশোভিত হয়েছে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ৭");
        this.map_var.put("arabic", "انت الذي ناداك ربك مرحبا\nولقد دعاك لقربه وحباك");
        this.map_var.put("syllable", "তব মহান প্রভু আপনাকে (মীরাজ শরীফে) জানিয়েছেন সাদর সম্ভাষণ!\nএকান্তে ডেকে, অতি কাছেতে টেনে, দিয়েছেন সর্বোচ্চ আসন!");
        this.map_var.put("meaning", "অর্থ: আপনাকে আপনার মহান রব (মি'রাজের) সাদর সম্ভাষণ জানিয়েছেন। তিনি আপনাকে একান্ত নিজের কাছে ডেকে নিয়ে নৈকট্য দান করেছেন।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ৮");
        this.map_var.put("arabic", "انت الذي فينا سالت شفاعة\nلباك ربك لم تكن لسواك");
        this.map_var.put("syllable", "তব আকুতি মহান রবের প্রতি যাচিলে 'শাফাআত' আবদার,\nকবুল করিয়া প্রভূ,\nমান দানিলেন না ছিল কারো না হবে কাহার!");
        this.map_var.put("meaning", "অর্থ: আপনি যখন আমাদের জন্য শাফায়াত চাইলেন, আপনার রব সেটা মঞ্জুর করলেন। এ মর্যাদা (সর্বপ্রথম) আপনি ছাড়া আর কেউ অর্জন করতে পারে নি।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ৯");
        this.map_var.put("arabic", "انت الذي لما توسل ادم\nمن زلة بك فاز وهو اباك");
        this.map_var.put("syllable", "তব উছিলায় নাজাত পায় বাবা আদম (আঃ)\nআসিলে পুত্রমত- মূলেতে পিতা, পুত্র আদম (আঃ)");
        this.map_var.put("meaning", "অর্থ: আপনার সুমহান উসীলায় হযরত আদম আলাইহিস সালাম দোয়া কবুল হল, অথচ তিনি আপনার আদি পিতা।\n\n[আদম (আঃ) হলেন সমগ্র মানবের আদি পিতা, আর রাসূলুল্লাহ (ﷺ) হল সকলে রূহানী ইমানী পিতা]");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ১০");
        this.map_var.put("arabic", "وبك الخليل دعا فصارت نره\nبردا وقد خمدت بنور سناك");
        this.map_var.put("syllable", "তব সুমহান উছিলায় যবে হাত তুলেন খলীল (আঃ)\nহুকুমে জলীল অগ্নিকুন্ড কুসুম-কানন সাবলীল!");
        this.map_var.put("meaning", "অর্থ: আপনারই সুমহান উসীলা দিয়ে হযরত ইব্রাহীম আলাইহিস সালাম দোয়া করলেন, ততক্ষনাৎ সে আগুন ঠান্ড হয়ে গেল।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ১১");
        this.map_var.put("arabic", "ﻭﺩﻋﺎﻙ ﺍﻳﻮﺏ ﻟﻀﺮ ﻣﺴﻪ\nﻓﺎﺯﻳﻞ ﻋﻨﻪ ﺍﻟﻀﺮ ﺣﻴﻦ ﺩﻋﺎﻙ");
        this.map_var.put("syllable", "যবে ডাকিলেন রোগে কাতুর আইয়ুব(আঃ) মনে প্রাণে সহসাই হল হাজত পুরা,\nফিরেন সুস্বাস্থ্য বদনে!");
        this.map_var.put("meaning", "অর্থ: হযরত আইয়ুব আলাইহিস সালাম তাঁর বিশেষ প্রয়োজনের সময় (রোগে আক্রান্ত অবস্থায়) আপনাকে ডাকলেন। তৎক্ষণাৎ উনার সে প্রয়োজন পুরা হয়ে গেল (তিনি সুস্থ হয়ে গেলেন)।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ১২");
        this.map_var.put("arabic", "ﻭﺑﻚ ﺍﻟﻤﺴﻴﺢ ﺍﺗﻲ ﺑﺸﻴﺮﺍ ﻧﺤﺒﺮﺍ\nﺑﺼﻔﺎﺕ ﺣﺴﻨﻚ ﻣﺎﺩﺣﺎ ﺑﻌﻼﻙ");
        this.map_var.put("syllable", "তব শুভাগমনের বাসন্তী বার্তা এনেছিলেন মরিয়ম তনয়!\nতব জৌলুস, তব জুলুস কীর্তি বর্ণনার করেছেন সমন্বয়!");
        this.map_var.put("meaning", "অর্থ: হযরত ঈসা আলাইহিস সালাম আপনার সুমহান আগমনের সুসংবাদ নিয়ে এসেছিলেন। তিনি আপনার সৌন্দর্য এবং সুউচ্চ মর্যাদার প্রসংসা করেছেন।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ১৩");
        this.map_var.put("arabic", "ﻭﻛﺬﺍﻙ ﻣﻮﺳﻲ ﻟﻢ ﻳﺰﻝ ﻣﺘﻮﺳﻼ\nﺑﻚ ﻓﻲ ﺍﺍﻗﻴﺎﻣﺔ ﻳﺤﺘﻤﻲ ﺑﺤﻤﺎﻙ");
        this.map_var.put("syllable", "তব উছিলাই ছিল ছিলাহ (হাতিয়ার) কলীমের দুনিয়াভরে।\nরোজ হাশরেও উতরে যাবে কলীমুল্লাহ তব উছীলা ভরে।");
        this.map_var.put("meaning", "অর্থ: হযরত মুসা আলাইহিস সালাম এই দুনিয়াতে আপনারই উসীলা নিয়েছেন। আবার হাশরের দিনও আপনার আশ্রয় চাইবেন।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ১৪");
        this.map_var.put("arabic", "ﻭﺍﻻﻧﺒﻴﺎﺀ ﻭﻛﻞ ﺧﻠﻖ ﻓﻲ ﺍﻟﻮﺭﻱ\nﻭﺍﻟﺮﺳﻮﻝ ﻭ ﻻﻣﻼﻙ ﺗﺤﺖ ﻟﻮﺍﻙ");
        this.map_var.put("syllable", "তব ঝান্ডাতলে আশ্রয় মাগিবে!নবীবর সকল!\nরাজা-বাদশা, সৃষ্টির সবে, এ ধরা মহীতল!");
        this.map_var.put("meaning", "অর্থ: সকল নবী-রসূল আলাইহিমুস সালাম, রাজা বাদশা এবং সমস্ত সৃষ্টি জগৎ আপনারই ঝান্ডাতলে আশ্রয় চাইবে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ১৫");
        this.map_var.put("arabic", "لك معجزات اعجزت كل الوري\nوفضاءل جلت فليس تحاك");
        this.map_var.put("syllable", "তব  মূগ্ধ-মুজিজা(মিরাকলস) আছে অগণিত!\nতব সুমহান গূণাধার! যার বর্ণন অসমাপীত");
        this.map_var.put("meaning", "অর্থ: আপনার অগণিত অসংখ্য বিস্ময়কর মুজিজা রয়েছে। আরো আছে অগনিত সুমহান গুনাবলি, যা বর্ননা করে শেষ করা যাবে না।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ১৬");
        this.map_var.put("arabic", "نطق الذراع بسمه لك معلنا\nوالضب قد لباك حين اتاك");
        this.map_var.put("syllable", "বিষধর প্রাণীকূল নত মস্তকে করেছে আর্জি!\nতব নবুয়ত প্রমাণে গুইসাপ গেল সাক্ষী সাজি।");
        this.map_var.put("meaning", "অর্থ: বিষধর প্রানী নত মস্তকে আপনার সাথে কথা বলেছে। গুইসাপও আপনার ডাকে সাড়া দিয়ে হাজির হয়েছে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ১৭");
        this.map_var.put("arabic", "والذءب جاءك و الغزالة قد اتت\nبك تستجير و تحتمي بحماك");
        this.map_var.put("syllable", "তব দ্বারে আশ্রয়, নিরাপত্তা যাচিছে বনের হরিণী,\nবনের নেকড়েও তব দ্বারে চিরই ঋণী!");
        this.map_var.put("meaning", "অর্থ: জঙ্গলের নেকড়ে বাঘ এবং হরিনী আপনার নিকট আশ্রয় এবং নিরাপত্তা লাভের জন্য এসেছে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ১৮");
        this.map_var.put("arabic", "وكذ الو حوش اتت اليك وسلمت\nوشكا البعير اليك حين راك");
        this.map_var.put("syllable", "বন্যপশুরা সালাম-সিজদায় লুটিছে বারে-বারে!\nউটের দূঃখ আপনি বিনা বলিছে কাহারে!");
        this.map_var.put("meaning", "অর্থ: বন্যপশুরা আপনার কাছে এসে সালাম দিয়েছে। আর উট আপনাকে দেখে নিজের কষ্টের কথা ব্যক্ত করেছে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ১৯");
        this.map_var.put("arabic", "ودعوت اشجارا اتتك مطيعة\nوسعت اليك مجيبة لنداك");
        this.map_var.put("syllable", "তব ডাকের সাড়ায় অনড় সে বৃক্ষটি\nঅনুগত দাস হাযির যেন! শেকড় উপড়ি!");
        this.map_var.put("meaning", "অর্থ: আপনি গাছকে ডাক দিয়েছেন, আপনার ডাকে সাড়া দিয়ে গাছ অনুগত হয়ে আপনার পানে ছুটে এসেছে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ২০");
        this.map_var.put("arabic", "والماء فاض براحتيك وسبحت\nصم الحصي بالفضل في يمناك");
        this.map_var.put("syllable", "তব পূত-হস্তে প্রবাহিত পঞ্চ-নদের বান!\nতব ডান হস্তে জড়-পাথর ফিরে পেল জান!");
        this.map_var.put("meaning", "অর্থ: আপনার পুতঃপবিত্র হাত মুবারক থেকে পানির স্রোতধারা প্রবাহিত হয়েছে, আর আপনার ডান হাতের ইশারায় নির্বাক পাথরও তাসবীহ পাঠ করেছে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ২১");
        this.map_var.put("arabic", "وعليك ظللت الغمامة في الوري\nوالجذع حن الي كريم لقاك");
        this.map_var.put("syllable", "তব নুরানী মস্তক পরে ছিল বিরাজীত মেঘমালার ছায়া।\nঢুকরে কেদেছিলো খেজুর কাষ্ঠ তব বিরহে জ্বলেছিল হিয়া!");
        this.map_var.put("meaning", "অর্থ: মেঘ আপনার মাথা মুবারকের উপর ছায়া দিয়েছে। আপনার সাক্ষাৎ লাভের আশায় শুষ্ক খেজুর গাছের কান্ড ঢুকরে কেঁদেছিলো।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ২২");
        this.map_var.put("arabic", "وكذاك لا اثرلمشيك في الثري\nوالصخر قد غاصت به قدمك");
        this.map_var.put("syllable", "কাঁদামাটি লাগায়নিকো কাঁদা তব পাক কদমে!\nকঠিন পাথর গলে মোম হায়, তব কদম চুমে");
        this.map_var.put("meaning", "অর্থ: নরম মাটিতে আপনার বরকত মন্ডিত পদচিহৃ পরে নাই, আবার কঠিন পাথরে আপনার কদম মুবারকের ছাপ অঙ্কিত হয়ে গেছে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ২৩");
        this.map_var.put("arabic", "وشفيت ذالعاهات من امراضه\nوملات كل الارض من جدواك");
        this.map_var.put("syllable", "তব দয়ায় হে মুনীব! রোগীর মরণ-ব্যাধিও সারে,\nতব অনুগ্রহ-অনুকম্পায় গিয়াছে জগত ভরে!");
        this.map_var.put("meaning", "অর্থ: আপনি রোগীকে রোগ ব্যাধি হতে আরোগ্য দান করেছেন, এবং সমগ্র পৃথিবী তথা ক্বায়িনাতকে আপনার অনুগ্রহ দ্বারা পরিপূর্ণ করেছেন।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ২৪");
        this.map_var.put("arabic", "ورددت عين قتادة بعد العمي\nوابن الحصين شفيته بشفااك");
        this.map_var.put("syllable", "অন্ধ ক্বাতাদা(রাঃ) তব দয়ায় পেয়েছেন চোখের দৃষ্টি,\nঅসুস্হ ইবনে হাসীনে (রাঃ) সুস্হ করিতে ঝরেছে দয়াবৃষ্টি!");
        this.map_var.put("meaning", "অর্থ: অন্ধ হয়ে যাওয়া হযরত ক্বাতাদা রদ্বিয়াল্লাহু আনহু উনার চোখের দৃষ্টি ফিরিয়ে দিয়েছেন, আর অসুস্থ হযরত ইবনে হাসীন রদ্বিয়াল্লাহু আনহু উনাকে সুস্থ করে দিয়েছেন।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ২৫");
        this.map_var.put("arabic", "وكذا خبيبا وابن عفرا بعدما\nجر حا شفيتهما بلمس يداك");
        this.map_var.put("syllable", "খুবাইব এবং ইবনে আফরা(রাঃ) তাঁদের উভয়জন,\nসুস্হ হল পরশ পেয়ে তব দু হস্ত আলিঙ্গণ!");
        this.map_var.put("meaning", "অর্থ: হযরত খুবাইব এবং হযরত ইবনে আফরা রাদ্বিয়াল্লাহু আনহুমা উনারা আপনার দুই হাত মুবারকের স্পর্শে সুস্থ হয়ে গিয়েছেন।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ২৬");
        this.map_var.put("arabic", "وعلي من رمد اذ داويته\nفي خيبر فشفي بطيب لماكا");
        this.map_var.put("syllable", "খায়বর গিরিতে তব পূত-ঠোঁট সুগন্ধির ছড়িয়েছিল বাহার!\nসে সুঘ্রাণে চক্ষু সমেত তখনি পূর্ণ সুস্হ হায়দার (রাঃ)");
        this.map_var.put("meaning", "অর্থ: খায়বারে আপনার ঠোঁট মুবারকের সুগন্ধি দ্বারা হযরত আলী রাদ্বিয়াল্লাহু আনহু'র চোখ মুবারকের অসুস্থতা সারিয়ে দিয়েছেন।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ২৭");
        this.map_var.put("arabic", "وسالت ربك في ابن جابر بعد ما\nان مات فاحياه و قد ارضاك");
        this.map_var.put("syllable", "তব দুআ'য় আল্লাহ তোমায় করেছিলেন তুষ্ট!\nহযরত জাবির (রাঃ)'র শহীদ দু পুত্রের বদলে অদৃষ্ট!");
        this.map_var.put("meaning", "অর্থ: আপনার দোয়ায় হযরত জাবির রাদ্বিয়াল্লাহু আনহু'র শহীদ হয়ে যাওয়া দুই সন্তানকে আল্লাহ পাক জীবিত করে আপনাকে সন্তুষ্ট করেছিলেন।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ২৮");
        this.map_var.put("arabic", "شاة مست لام معبد التي\nنشفت فدرت من شفا رقياك");
        this.map_var.put("syllable", "তব পাক হাতের ছোয়ায় উম্মে মা'বাদের (রাঃ) দূগ্ধহীন বকরী,\nতব মুজেযা তব পাক-হস্ত বরকতে হল দূগ্ধবতী!");
        this.map_var.put("meaning", "অর্থ: হযরত উম্মে মা'বাদ রাদ্বিয়াল্লাহু আনহা'র বকরীর দুধ শুকিয়ে গেলে আপনারই হাত মুবারকের স্পর্শে আবারো দুগ্ধবতী হয়েছিল।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ২৯");
        this.map_var.put("arabic", "ودعوت عام القحط ربك معلنا\nفانهل قطر السحب حين دعاك");
        this.map_var.put("syllable", "অনাবৃষ্টি আর দূর্ভীক্ষের সে কঠিন ক্ষণে,\nতব দোয়! সাথে-সাথে মুষলধারে বৃষ্টি আনে!");
        this.map_var.put("meaning", "অর্থ: অনাবৃষ্টি এবং দুর্ভিক্ষের বছর আপনি দোয়া করেছিলেন, সাথে সাথে মুশুলধারে বৃষ্টি শুরু হয়েছিল।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ৩০");
        this.map_var.put("arabic", "ودعوت كل الخلق فانقادوا الي\nدعواك طوعا سامعين نداك");
        this.map_var.put("syllable", "সমগ্র জগতকে করিলে তব সত্য-আহ্বান,\nস্বেচ্ছায় আসিল জনস্রোত সমুদ্র বহমান!");
        this.map_var.put("meaning", "অর্থ: সমগ্র সৃষ্টি জগৎকে আপনি সত্যের দাওয়াত দিলেন, সবাই স্বেচ্ছায় আপনার দাওয়াত মুবারকে সাড়া দিয়েছিল।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ৩১");
        this.map_var.put("arabic", "وخفضت دين الكفر يا علم الهدي\nورفعت دينك فاستقام هداك");
        this.map_var.put("syllable", "হে জগত সুপথের দিশারী! করেছেন তব দ্বীনন উন্নত কুফর বিতাড়ী,\nফলে আপনার পথ হল সুদৃঢ় মজবুত দূরিলে আঁধারী!");
        this.map_var.put("meaning", "অর্থ: হে সমগ্র ক্বায়িনাতের হেদায়েত ! আপনি কুফরের দ্বীনকে অবনত করে নিজের পবিত্র দ্বীনকে স্বমুন্নত করেছেন। তাই আপনার পথ সুদৃঢ় হয়েছে ।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ৩২");
        this.map_var.put("arabic", "اعداك عادوا افي القليب بجهلهم\nصر عي وقدحرموا الرضي بجفاك");
        this.map_var.put("syllable", "তব সহিত কৃতঘ্নের দল অজ্ঞতার ভারে ডুবিল অন্ধকূপে,\nতব সনে শত্রুতা ফিরিয়া আসিল খোদায়ী গযবরূপে।");
        this.map_var.put("meaning", "অর্থ: আপনার প্রতি শত্রুতা পোষণ কারীরা মূর্খতা নিয়ে অন্ধ কুপেই পরে রয়েছে। আপনার সাথে শত্রুতার কারনে তারা আল্লাহর সন্তুষ্টি থেকে চিরবঞ্চিত হয়েছে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ৩৩");
        this.map_var.put("arabic", "في يوم بدر قد اتتك ملاءك\nمن عند ربك قاتلت اعداك");
        this.map_var.put("syllable", "বদরের প্রান্তরে সংখ্যালঘু মুসলিমের প্রথম জিহাদ,\nআল্লাহর আদেশে ফেরেশতা-সৈনিক তব শত্রু হননে আহ্লাদ!");
        this.map_var.put("meaning", "অর্থ: বদরের জিহাদে আল্লাহ পাকের পক্ষ থেকে ফিরিশতাগণ এসে আপনার শত্রুদের বিরুদ্ধে জিহাদ করেছেন।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ৩৪");
        this.map_var.put("arabic", "والفتح جاءك يوم فتحك مكة\nوالنصر في الاحزاب قد وافاك");
        this.map_var.put("syllable", "মক্কা বিজয় ছিল 'ফতহে মুবীন' তব চূড়ান্ত বিজয়গাঁথা রচেছিল সেদিন!\nআহযাব কিবা খন্দক খোদার দয়া তব লাগি সদা ছিল অমলিন!");
        this.map_var.put("meaning", "অর্থ: পবিত্র মক্কা বিজয়ের দিন আপনার চুড়ান্ত বিজয় প্রকাশ হয়েছিল। আহযাব বা খন্দকের জিহাদে আল্লাহ পাকের সাহায্য আপনার সাথেই ছিল।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ৩৫");
        this.map_var.put("arabic", "هود و يونس من بهاك تجملا\nوجمال يوسفا من ضياء سناك");
        this.map_var.put("syllable", "হযরত হুদ এবং ইউনুছ(আঃ) তব রূপচ্ছটার ভূষণে ভূষিত!\nইউসুফ (আঃ)'র অতূল সৌন্দর্য তব নুরের ঝলক হতে উৎসারীত!");
        this.map_var.put("meaning", "অর্থ: হযরত হুদ আলাইহিস সালাম হুদ আলাইহিস সালাম এবং হযরত ইউনূছ আলাইহিস সালাম আপনার সৌন্দর্যচ্ছটায় ভূষিত ছিলেন। হযরত ইউসূফ আলাইহিস সালাম এর সৌন্দর্য আপনারই আলোকোজ্জ্বল নূরের ঝলক থেকে উৎসারিত।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ৩৬");
        this.map_var.put("arabic", "فقد فقت ياطه جميع الانبياء\nطرا فسحان الذي اسراك");
        this.map_var.put("syllable", "হে ত্ব-হা (ﷺ)!\nতব মক্বাম সকল আম্বিয়ার চির ঊর্ধ্বে,\nসব প্রশংসা মহান খোদার যিনি রাত্রি কিয়দাংশে সফর করান তোমায়, সর্বোর্ধ্বে!");
        this.map_var.put("meaning", "অর্থ: ইয়া ত্বোয়াহা (ﷺ)! আপনার আসন সকল নবী-রসূল আলাইহিমুস সালাম গণের মধ্যে সর্বাপেক্ষা উচ্চশিখরে অধিষ্ঠিত।\n\nসকল প্রসংসা সেই আল্লাহর যিনি রাতের কিছু সময় আপনাকে নিজের অত্যন্ত নিকটবর্তী সফর করিয়েছিলেন।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ৩৭");
        this.map_var.put("arabic", "والله يا يسين مثلك لم يكن\nفي العالمين و حق من انباك");
        this.map_var.put("syllable", "হে ইয়াছীন (ﷺ) মহান আল্লাহর শপথ!\nসমগ্র সৃষ্টিকূলে অতূল তুমি নেই দ্বীমত!");
        this.map_var.put("meaning", "অর্থ: ইয়া ইয়াসীন (ﷺ) ! আল্লাহর কসম , সমগ্র সৃষ্টিকুলে আপনার মত কেউ নাই (আপনি বেমিশাল)।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ৩৮");
        this.map_var.put("arabic", "عن وصفك الشعراء يامدثر\nعجزوا وكلوا من صفات علاك");
        this.map_var.put("syllable", "হে মুদ্দাচ্ছির (ﷺ) তব শান বয়ানে থেমে যায় কবির কলম,\nতব সুমর্যাদার বর্ণন দিবে নেই তাদদের সে ইলম-হিলম!");
        this.map_var.put("meaning", "অর্থ: ইয়া মুদ্দাসির (ﷺ) ! আপনার সুমহান শান মুবারক কবিগণ বর্ননা করতে অক্ষম। আপনার মর্যাদা তুলে ধরতে তার অপারগ।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ৩৯");
        this.map_var.put("arabic", "انجيل عيسي قد اتي بك مخبرا\nولنا الكتاب اتي بمدح حلاك");
        this.map_var.put("syllable", "পবিত্র ইন্জিলে ঈসা (আঃ) দিয়েছেন সুসংবাদ,\nপাক-ক্বুরআনের আদ্যোপান্ত তব স্তুতিতে আবাদ!");
        this.map_var.put("meaning", "অর্থ: হযরত ঈসা আলাইহিস সালাম পবিত্র ইঞ্জিল শরীফে আপনার সুসংবাদ দিয়েছেন। কুরআন শরীফেও আপনার প্রশংসা বিদ্যমান।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ৪০");
        this.map_var.put("arabic", "ماذا يقول الماد حون وما حسي\nان تجمع الكتاب من معناك");
        this.map_var.put("syllable", "তব নান্দী-গুজারীর দল আর কিইবা! নান্দী করবে!\nস্তুতির লিখকের কলম কালি আর কতইবা! চলবে!");
        this.map_var.put("meaning", "অর্থ: প্রশংসাকারীগন আপনার কি প্রসংসা করবে? লেখকগণই বা আপনার ছানা সিফত কতটুকু লিখতে পারবে ?");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ৪১");
        this.map_var.put("arabic", "والله لو ان البحار مدادهم\nوالشعب اقلام جعلن لذاك");
        this.map_var.put("syllable", "খোদার শপথ! সমুদ্র-সকল যদি বনে কালি,\nকলম যদি হয় বৃক্ষ-সকল আর তার ডালি।");
        this.map_var.put("meaning", "অর্থ: আল্লাহর কসম! সকল সমুদ্রকে যদি কালিতে পরিনত করা হয়,\nআর সকল গাছগুলোর ডাল-পালাকে যদি কলম বানানো হয়।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ৪২");
        this.map_var.put("arabic", "لم يقدر الثقلان يجمع قدره\nابدا وما استطاعوا له ادراك");
        this.map_var.put("syllable", "তদুপরি, মানব-দানব তব শান লিখিতে হবে হয়রান,\nতাদের পক্ষে অসম্ভব! বুঝা দায়! তদীয় প্রকৃত সম্মান!");
        this.map_var.put("meaning", "অর্থ: তরপরও জ্বিন-ইনসান আপনার শান লিখে শেষ করতে পারবে না। আপনার হাক্বীকী মর্যাদার সঠিক উপলব্ধি করা তাদের কারো পক্ষে সম্ভব নয়।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ৪৩");
        this.map_var.put("arabic", "بك لي قليب مغرم ياسيدي\nوحشاشة محشوة بهواك");
        this.map_var.put("syllable", "হে মালিক! এ হৃদয় তব প্রেমাসক্ত,\nএ প্রাণ তব অনুরাগের পূর্ণ-ভক্ত!");
        this.map_var.put("meaning", "অর্থ: হে আমার সাইয়্যিদ ! আমার হৃদয় আপনারই ইশকে আসক্ত। আমার প্রাণ শুধু আপনারই ভালোবাসায় পরিপূর্ণ ।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ৪৪");
        this.map_var.put("arabic", "فاذا سكت ففيك صمتي كله\nواذا نطقت فماد حا علياك");
        this.map_var.put("syllable", "এ নীরবতা তব কল্পনার বাসস্হান,\nএ সরব জবানতো তব স্তুতি বয়ান।");
        this.map_var.put("meaning", "অর্থ: আমি যখন চুপ থাকি তখন আপনারই চিন্তা করি। আবার যখন কথা বলি তখন আপনারই প্রসংসা করি।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ৪৫");
        this.map_var.put("arabic", "واذا سمعت فعنك قولا طيبا\nواذا نظرت فما اري الاك");
        this.map_var.put("syllable", "এ কর্ণ শ্রবণ করেনা তব স্বর্গ-বাণী বিনা,\nএ আঁখি বন্ধ রাখি, দেখিনা কিছু তুমি হীনা!");
        this.map_var.put("meaning", "অর্থ: যখন কিছু শুনি, তখন আপনারই কোন উত্তম বানী শুনি। যখন কিছু দেখি, তখন শুধু আপনাকেই দেখি ।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ৪৬");
        this.map_var.put("arabic", "ﻳﺎ ﻣﺎ ﻟﻜﻲ ﻛﻦ ﺷﺎﻓﻌﻲ ﻓﻲ ﻓﺎﻗﺘﻲ\nﺍﻧﻲ ﻓﻘﻴﺮ ﻓﻲ ﺍﻟﻮﺭﻱ ﻟﻐﻨﺎﻙ");
        this.map_var.put("syllable", "হে আমার মুনীব! প্রয়োজনকালে তব সুপারিশ মিলে যেন ভালে,\nজগতমাঝে তব ভিক্ষার ভিখিরী আমি সর্বকালে!");
        this.map_var.put("meaning", "অর্থ: হে আমার মালিক ! আমার প্রয়োজন কালে আপনি আমার জন্য সুপারিশ করুন।\nপৃথিবীতে আমি শুধু আপনারই ঐশ্বর্যের মুখাপেক্ষী।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ৪৭");
        this.map_var.put("arabic", "ﻳﺎﺍﻛﺮﻡ ﺍﻟﺜﻘﻠﻴﻦ ﻳﺎ ﻛﻨﺰ ﺍﻟﻮﺭﻱ\nﺟﺪ ﻟﻲ ﺑﺠﻮﺩﻙ ﻭ ﺍﺭﺿﻨﻲ ﺑﺮ ﺿﺎﻙ");
        this.map_var.put("syllable", "হে জ্বীন-ইনসানে সর্বোচ্চ সম্মানীত! হে সৃষ্টির ধনভান্ডার,\nতব দানে ধন্য,তব তুষ্টিত পুষ্ট করুন বারংবার!");
        this.map_var.put("meaning", "অর্থ: হে জ্বীন-ইনসানের সবচাইতে সম্মানিত। হে সমগ্র মখলুকাতের ধনভান্ডার! আমাকে আপনার দানে ধন্য করুন। আপনার সন্তুষ্টি দিয়ে খুশি করুন।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ৪৮");
        this.map_var.put("arabic", "ﺍﻧﺎ ﻃﺎﻣﻊ ﺑﺎﻟﺠﻮﺩ ﻣﻨﻚ ﻭ ﺍﻡ ﻳﻜﻦ\nﻻﺑﻲ ﺣﻨﻴﻔﺔ ﻓﻲ ﺍﻻﻧﺎﻡ ﺳﻮﺍﻙ");
        this.map_var.put("syllable", "তব করুণার চির প্রত্যাশী অধম আমি!\nতুমি বিনা জগতে আবু হানিফার(রহঃ) কে আছে স্বামী!");
        this.map_var.put("meaning", "অর্থ: আমি আপনার করুনার প্রত্যাশী। আপনি ছাড়া সারা জাহানে এই আবু হানীফার  কেউ নেই।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ৪৯");
        this.map_var.put("arabic", "ﻓﻌﺴﺎﻙ ﺗﺸﻔﻊ ﻓﻴﻪ ﻋﻨﺪ ﺣﺴﺎﺑﻪ\nﻓﻠﻘﺪ ﻏﺪﺍ ﻣﺘﻤﺴﻚ ﺑﻌﺮﺍﻙ");
        this.map_var.put("syllable", "একটিই আশা!হিসাব দিবসে চাই! তব সুপারিশ ভরসা!\nকারণ! তব রশ্মি আঁকড়ে ধরে, আমি করছি ভরসা");
        this.map_var.put("meaning", "অর্থ: একটাই আশা, হিসাবের দিনে আপনি আমার জন্য সুপারিশ করবেন। কারণ আমিতো আপনারই রশ্মি আঁকড়ে ধরে আছি।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ৫০");
        this.map_var.put("arabic", "ﻓﻼﻧﺖ ﺍﻛﺮﻡ ﺷﺎﻓﻊ ﻭ ﻣﺸﻔﻊ\nﻭﻣﻦ ﺍﻟﺘﺠﻲ ﺑﺤﻤﺎﻙ ﻧﺎﻝ ﺭﺿﺎﻙ");
        this.map_var.put("syllable", "সর্বশ্রেষ্ঠ সুপারীশকারী সেতো একমাত্র তুমি!\nযে পেয়েছে আশ্রয়, সে হবে ধন্য স্বর্গ চুমি");
        this.map_var.put("meaning", "অর্থ: সবচাইতে মহান সুপারিশকারী সেতো একমাত্র আপনি। যে আপনার আশ্রয় গ্রহণ করেছে সে আপনার সন্তুষ্টি লাভ করেছে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ৫১");
        this.map_var.put("arabic", "ﻓﺎﺟﻌﻞ ﻗﺮﺍﻙ ﺳﻔﺎﻋﺔ ﻟﻲ ﻓﻲ ﻏﺪ\nﻓﻌﺴﻲ ﺍﺭﻱ ﻓﻲ ﺍﻟﺤﺸﺮ ﺗﺤﺖ ﻟﻮﺍﻙ");
        this.map_var.put("syllable", "তব মেহমানদারীর রীতি মোর লাগি করুন কাল সুপারীশ প্রীতি যেন,\nহাশর মাঠে তব ঝান্ডা-তটে শামিল হই আদরে অতি");
        this.map_var.put("meaning", "অর্থ: আপনার মেহমানদারীকে আমার জন্য কাল সুপারিশে পরিনত করুন। যাতে হাশরের ময়দানে আমি আপনারই ঝন্ডাতলে শামিল হতে পারি।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ৫২");
        this.map_var.put("arabic", "ﺻﻠﻲ ﻋﻠﻴﻚ ﺍﻟﻠﻪ ﻳﺎﻋﻠﻢ ﺍﻟﻬﺪﻱ\nﻣﺎ ﺣﻦ ﻣﺸﺘﺎﻕ ﺍﻟﻲ ﻣﺸﻮﺍﻙ");
        this.map_var.put("syllable", "হে জগত দিশার প্রতীক! তব পরে খোদার দরুদ অগণন!\nসে আশেকের পরেও,যতক্ষণ তব আশ্রয়-ক্বদম করে আলিঙ্গণ!");
        this.map_var.put("meaning", "অর্থ: হে সমগ্র জগতের হিদায়েতের প্রতিক ! আপনার প্রতি আল্লাহ পাকের বেশুমার সালাত, যতক্ষন কোন আশেক আপনার আশ্রয়ের প্রত্যাশী থাকে।");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("serial", "প্যারা : ৫৩");
        this.map_var.put("arabic", "ﻭﻋﻠﻲ ﺻﺤﺎﺑﺘﻚ ﺍﻟﻜﺮﺍﻡ ﺟﻤﻴﻌﻬﻢ\nﻭﺍﻟﺘﺎ ﺑﻌﻴﻦ ﻭ ﻛﻞ ﻣﻦ ﻭﺍ ﻻﻙ");
        this.map_var.put("syllable", "তব সাহাবাকূল,তাঁদের পদাঙ্কানুসারী,তব যত আশেক!\nদরুদ-সালামে প্রতিক্ষণে নিত্য হোক অভিষেক!");
        this.map_var.put("meaning", "অর্থ: আপনার সম্মানিত ছাহাবী রদ্বিয়াল্লাহু আনহু, অনুসারী ও যারা আপনাকে মুহব্বত করেছেন সকলের প্রতি বেশুমার ছলাত।");
        this.map_list.add(this.map_var);
    }

    private void _PDF_Tafsir() {
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "কানযুল ঈমান - ১ম পারা");
        this.map_var.put("content", "1AgVD6NdlTrIZRnIqOAf0mQiHelrhxtVd");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "কানযুল ঈমান - ২য় পারা");
        this.map_var.put("content", "1jR0ALDmRXcaOCgrclypP2HZRV4cm3Z9U");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "কানযুল ঈমান - ৩য় পারা");
        this.map_var.put("content", "1uZhbDCVVRIx8ptV2dHJ3gRIEQpqyozwA");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "কানযুল ঈমান - ৪র্থ পারা");
        this.map_var.put("content", "1X6A5BXTbDJl2Y0_ltBOhXEOJrm8Jkjcx");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "কানযুল ঈমান - ৫ম পারা");
        this.map_var.put("content", "1_AdfzxO0HRewYzUwc8VxUtbuOTJ-Y-Fr");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "কানযুল ঈমান - ৬ষ্ঠ পারা");
        this.map_var.put("content", "1Fv7oxN2ClMlpLZyNac2W9fTX10Advw4B");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "কানযুল ঈমান - ৭ম পারা");
        this.map_var.put("content", "1OixHxoiRtjgF22ZfT93vO6Ld7_wRl6n6");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "কানযুল ঈমান - ৮ম পারা");
        this.map_var.put("content", "1oiaqKFdbtTUDmDqMtVUSY0OqVuJtjKtG");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "কানযুল ঈমান - ৯ম পারা");
        this.map_var.put("content", "1Hi8dgk3PkkXxTSxaARAWpRpbTTebplDJ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "কানযুল ঈমান - ১০ম পারা");
        this.map_var.put("content", "1fyiDGQnOvGSPK5WZJZFYbGPvd1qx2lsZ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "কানযুল ঈমান - ১১তম পারা");
        this.map_var.put("content", "1W9S32ADARemLaNJQFjKSf9IIXlnY3kJ8");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "কানযুল ঈমান - ১২তম পারা");
        this.map_var.put("content", "17pDWu8avVFrx5CuL7F8Odybkf18iSdj7");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "কানযুল ঈমান - ১৩তম পারা");
        this.map_var.put("content", "1fHPehVmN9KF-LSklvtW4139Yaerp9_2w");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "কানযুল ঈমান - ১৪তম পারা");
        this.map_var.put("content", "1IMUU0YIiKW2_IFM5KrH7-5yno2jkDgJe");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "কানযুল ঈমান - ১৫তম পারা");
        this.map_var.put("content", "1n8zq87glNcRLK3CRnBUh7EyryEPDIJh0");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "কানযুল ঈমান - ১৬তম পারা");
        this.map_var.put("content", "1opmYdnfoHLbiIRdvOc57aU4fNyzdC2en");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "কানযুল ঈমান - ১৭তম পারা");
        this.map_var.put("content", "12Tg3unOmisJ1ck9N39D7kgnIAiLOO2YH");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "কানযুল ঈমান - ১৮তম পারা");
        this.map_var.put("content", "1zjfqq24Mf0VcEFRqpKmFypMFz9sPkMta");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "কানযুল ঈমান - ১৯তম পারা");
        this.map_var.put("content", "1u0uUnCvmMJNQJZqUwkhz5PkCoUFFDQ7m");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "কানযুল ঈমান - ২০তম পারা");
        this.map_var.put("content", "1oAtZ1VoraVYYRAaaaMPku3gahJOmxkOP");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "কানযুল ঈমান - ২১তম পারা");
        this.map_var.put("content", "14g6pcZmb6p7N87IXpKeIO5N4YREhDwwX");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "কানযুল ঈমান - ২২তম পারা");
        this.map_var.put("content", "1871KYDK1sEOo0stFcQAm3sGHMCnMB_T1");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "কানযুল ঈমান - ২৩তম পারা");
        this.map_var.put("content", "1JrsRJohbdz606dmA65B_GCuRlMBVIwCP");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "কানযুল ঈমান - ২৪তম পারা");
        this.map_var.put("content", "16g5ZUMeMADegyhC2Y2zLwoP3HYBM4i_z");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "কানযুল ঈমান - ২৫তম পারা");
        this.map_var.put("content", "1oyMq4qIASrQLFd9KcsZon52_OQZnjfE_");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "কানযুল ঈমান - ২৬তম পারা");
        this.map_var.put("content", "1hzj98B-FsWE2gCoXYs6YKddJe8-TXR8u");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "কানযুল ঈমান - ২৭তম পারা");
        this.map_var.put("content", "1aQPyt5kp_MFbDlyHKLLpsfHBZhP6RUbO");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "কানযুল ঈমান - ২৮তম পারা");
        this.map_var.put("content", "1zT8GG9IsMHJmqiDO1CxsC6zGEVU0A43P");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "কানযুল ঈমান - ২৯তম পারা");
        this.map_var.put("content", "1xvsQt5zmdaZ2DxzlyD0Efb2lO-sM87tT");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "কানযুল ঈমান - ৩০তম পারা");
        this.map_var.put("content", "1hnYn_KH-TjGqtVQCEl1SR2q6RKnih1uC");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "১ম খন্ড - তাফসিরে মা'আরেফুল কোরআন");
        this.map_var.put("content", "1yEdtBxSS0vt3MTeQSOtjt71_9_Y8APva");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "২য় খন্ড - তাফসিরে মা'আরেফুল কোরআন");
        this.map_var.put("content", "1sHI_gNYTXuiXuz4Kx_kRMPXkzuEuMVlV");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৩য় খন্ড - তাফসিরে মা'আরেফুল কোরআন");
        this.map_var.put("content", "1UUwpRgqN5xFxBmOS7XijPQ_4PXL1hFdN");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৪র্থ খন্ড - তাফসিরে মা'আরেফুল কোরআন");
        this.map_var.put("content", "1aFIW5hLYbsiom480LfrMMMqgYOTGaeMR");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৫ম খন্ড - তাফসিরে মা'আরেফুল কোরআন");
        this.map_var.put("content", "1ep6mC5R0tNVCIa5IT5fsDbynCFTfqZ_t");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৬ষ্ঠ খন্ড - তাফসিরে মা'আরেফুল কোরআন");
        this.map_var.put("content", "1Qm3AibEuqtFEA7Ev15qpzdi7_4w-EhBH");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৭ম খন্ড - তাফসিরে মা'আরেফুল কোরআন");
        this.map_var.put("content", "1w43kwd6McBqiDUQEW-P07qwfbDf355y3");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৮ম খন্ড - তাফসিরে মা'আরেফুল কোরআন");
        this.map_var.put("content", "1GIeqhGNBiHdtxRMfCDi0S1lQd_1kBZDI");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "১ম খন্ড - তাফসীরে ইবন আব্বাস");
        this.map_var.put("content", "16TfhT0DbQyGnoFCjaE97TCLwknN4BM-S");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "২য় খন্ড - তাফসীরে ইবন আব্বাস");
        this.map_var.put("content", "1m9yTVqbSde_3NA7VZhZEgcYdQWLCuOX8");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৩য় খন্ড - তাফসীরে ইবন আব্বাস");
        this.map_var.put("content", "1-ZOHm7ZCmgponsYwkweNb17NW1UIAE-V");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "১ম খন্ড - তাফসীরে ইবন কাছীর");
        this.map_var.put("content", "1IF_JQlPViR9cjka_ieOkPLc3B-PT1Hr4");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "২য় খন্ড - তাফসীরে ইবন কাছীর");
        this.map_var.put("content", "1Q7Pw7uMjInr2IKo5Qed8t5hrme-LszTs");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৩য় খন্ড - তাফসীরে ইবন কাছীর");
        this.map_var.put("content", "17ZtccTJ75vDGphl1rEm2B0vt3UZH30SQ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৪র্থ খন্ড - তাফসীরে ইবন কাছীর");
        this.map_var.put("content", "1BSszZ86cncZdqRpd7ECoVRVVJesUbxV2");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৫ম খন্ড - তাফসীরে ইবন কাছীর");
        this.map_var.put("content", "1eaDZMfPgwIepZ51HFza2cyHTDKYrp78K");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৬ষ্ঠ খন্ড - তাফসীরে ইবন কাছীর");
        this.map_var.put("content", "15twmVnDsUUz3ZTUZlsUWrz36ji66UICv");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৭ম খন্ড - তাফসীরে ইবন কাছীর");
        this.map_var.put("content", "1N_ztBiG3FMmIT6Bel_djo6J5P7Byfqb7");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৮ম খন্ড - তাফসীরে ইবন কাছীর");
        this.map_var.put("content", "1QdFoWCvTxInLJuDE3N988CcvZjn_nsi1");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৯ম খন্ড - তাফসীরে ইবন কাছীর");
        this.map_var.put("content", "1F_4dn6D-39PljBgAi618HOlADpNvG8fp");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "১০ম খন্ড - তাফসীরে ইবন কাছীর");
        this.map_var.put("content", "13u3y7nNOWh3LbpEeabAN18R_fM6IfzCy");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "১১তম খন্ড - তাফসীরে ইবন কাছীর");
        this.map_var.put("content", "1bcKpFO4EnCVmh9fXCYRm_7aBe-t21_X0");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "১ম খন্ড - তাফসীরে মাযহারী");
        this.map_var.put("content", "1xIM--duov-XbUyeDwxbp6mCeE9PIqgNF");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "২য় খন্ড - তাফসীরে মাযহারী");
        this.map_var.put("content", "1BwTVh_UoTQrGTqVZWfaw5F99GOfJPiuz");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৩য় খন্ড - তাফসীরে মাযহারী");
        this.map_var.put("content", "1DsbDczhlpIWiS25MPYn34in0M96h098R");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৪র্থ খন্ড - তাফসীরে মাযহারী");
        this.map_var.put("content", "1ifGaknYB_ayiIyMKiXhMFzAYRPUZRhjs");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৫ম খন্ড - তাফসীরে মাযহারী");
        this.map_var.put("content", "1Ws24lGX4KPeFoQBXaxE7jhRbaasOLez0");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৬ষ্ঠ খন্ড - তাফসীরে মাযহারী");
        this.map_var.put("content", "1KX9rbpvvVS4R_AoGa1Sa-hQyeSm1K31O");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৭ম খন্ড - তাফসীরে মাযহারী");
        this.map_var.put("content", "1Go9B83ki58zSlvLMMzqK3Vodi342RMit");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৮ম খন্ড - তাফসীরে মাযহারী");
        this.map_var.put("content", "1s7AwWtYY-X0jmfxF32ad6FIP445LyaCG");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৯ম খন্ড - তাফসীরে মাযহারী");
        this.map_var.put("content", "1iDpD2wqlP2K2waIMpfV6-CBFICbzhLXI");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "১০ম খন্ড - তাফসীরে মাযহারী");
        this.map_var.put("content", "1hkE06QxJMlpUgncLtNurYFceYts8c97r");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "১১তম খন্ড - তাফসীরে মাযহারী");
        this.map_var.put("content", "16a3JyYiQgHEoLDzNQ3WzobPYxtNihNIJ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "১২তম খন্ড - তাফসীরে মাযহারী");
        this.map_var.put("content", "11hM0fY1F1gHtIDAf_jTTjv50pJ9wWOAF");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "১ম খন্ড - তাফসীরে জালালাইন");
        this.map_var.put("content", "19WPPptkQ8h45fWhVDg-ytZNgociXQPDX");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "২য় খন্ড - তাফসীরে জালালাইন");
        this.map_var.put("content", "1HMRJOAu5_oKGNa_AwbDBsOCjeZ4bXYiv");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৩য় খন্ড - তাফসীরে জালালাইন");
        this.map_var.put("content", "1NUUn5TZj51vPIR4PEkRGoKp_DWm-ptrA");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৪র্থ খন্ড - তাফসীরে জালালাইন");
        this.map_var.put("content", "1P7c15GuopEltzMb0CoV9kszoIrGO_y76");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৫ম খন্ড - তাফসীরে জালালাইন");
        this.map_var.put("content", "1a7HUtDa5IGYpjP9zWO9uDnPBrdlDEAXo");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৬ষ্ঠ খন্ড - তাফসীরে জালালাইন");
        this.map_var.put("content", "1cIRRj9UEsUrCISIrPcGfknS6sXaFJ49l");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৭ম খন্ড - তাফসীরে জালালাইন");
        this.map_var.put("content", "1l1ZNmOjf_Egfp0ZywYobL8ZDnk7c6vbP");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "১ম খন্ড - তাফসীরে তাবারী শরীফ");
        this.map_var.put("content", "1Ds6YM3WGo0rqf5I-qNiHFd-zUCYowugg");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "২য় খন্ড - তাফসীরে তাবারী শরীফ");
        this.map_var.put("content", "1uv0dyFG6oi6fxs1ln93iz2xtX5KZHBw4");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৩য় খন্ড - তাফসীরে তাবারী শরীফ");
        this.map_var.put("content", "1MYuVPzLvLmObJXpRCyoBfxcYBL6_gv8X");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৪র্থ খন্ড - তাফসীরে তাবারী শরীফ");
        this.map_var.put("content", "1NAUazYwh310Y-co8NKvYlpLPHYom9umu");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৫ম খন্ড - তাফসীরে তাবারী শরীফ");
        this.map_var.put("content", "1eiT17y41KRCDdQPbcHW1UmWKnpavikTO");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৬ষ্ঠ খন্ড - তাফসীরে তাবারী শরীফ");
        this.map_var.put("content", "1_qk1Zy3L3lDgIi5djbd2_M7vSRTOo60Y");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৭ম খন্ড - তাফসীরে তাবারী শরীফ");
        this.map_var.put("content", "1gZ_HrMeNiOAcxJBAp3ZZau_rt5jvwxrg");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৮ম খন্ড - তাফসীরে তাবারী শরীফ");
        this.map_var.put("content", "13YbvN8o95vWUnL8AS5C7XHKs1DpT8aTx");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৯ম খন্ড - তাফসীরে তাবারী শরীফ");
        this.map_var.put("content", "1_V7ZkUvklu8YOrQ7i7EI1LEQaZBK3ho2");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "আল কুরআনের ১৬০ মুজিজা ও রহস্য");
        this.map_var.put("content", "1-aQepqH9EigI3PhD8-tZsyS1DTRZGWS-");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "শব্দে শব্দে আল কুরআনের অভিধান");
        this.map_var.put("content", "1qtaL2v4BbWFa6lKPkRApkLPITMwkw4ML");
        this.map_list.add(this.map_var);
    }

    private void _PDF_Hadith() {
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "১ম খন্ড - সহীহ বুখারী শরীফ");
        this.map_var.put("content", "1MSSn9rXBBYF6ZDXiaHUldF1OTb3dKGwK");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "২য় খন্ড - সহীহ বুখারী শরীফ");
        this.map_var.put("content", "1c9HS9N7vkPlq917rlUsg6dMPRvqU52f0");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৩য় খন্ড - সহীহ বুখারী শরীফ");
        this.map_var.put("content", "1QygpbiGFHmDURIgcKgwDuviXgBXY3yQR");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৪র্থ খন্ড - সহীহ বুখারী শরীফ");
        this.map_var.put("content", "1EPE1iH8lrQquEuy-43EUZAmguGHnGQE0");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৫ম খন্ড - সহীহ বুখারী শরীফ");
        this.map_var.put("content", "18q7AgCRqGatcsfDPlQKmCGHQDD7DJ3g4");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৬ষ্ঠ খন্ড - সহীহ বুখারী শরীফ");
        this.map_var.put("content", "1dHo5-JBm53uXHm4kGQDs4JYVYSN4eSkc");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৭ম খন্ড - সহীহ বুখারী শরীফ");
        this.map_var.put("content", "1wmqeEcRV_z_uvKIfKMV9szCqqtgQq-Ae");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৮ম খন্ড - সহীহ বুখারী শরীফ");
        this.map_var.put("content", "1qhJtV1MmJOeKyma3G94wgxyOz4SzvmJ6");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৯ম খন্ড - সহীহ বুখারী শরীফ");
        this.map_var.put("content", "1PsAYBKxQQk50ks-FRO3rhZfSJneLQyWX");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "১০ম খন্ড - সহীহ বুখারী শরীফ");
        this.map_var.put("content", "1sT1BH4VSTchnDeY6GFuPllgA7GWF1JEK");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "১ম খন্ড - মুয়াত্তা ইমাম মালিক (র.)");
        this.map_var.put("content", "1xxRnyXkI8rYdenb24ntR5KyaMZVzFKyp");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "২য় খন্ড - মুয়াত্তা ইমাম মালিক (র.)");
        this.map_var.put("content", "1KTh_Ki1-jsZ2FrBk00OIzqv98LdM47T4");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "১ম খন্ড - সুনান আবূ দাউদ শরীফ");
        this.map_var.put("content", "1SgVGUhvZZgznJSe_u7VGWeSOcL7VJ5tq");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "২য় খন্ড - সুনান আবূ দাউদ শরীফ");
        this.map_var.put("content", "1mwvEPOQBJ4dNE8V7Eng-UEx-mQcDXIsO");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৩য় খন্ড - সুনান আবূ দাউদ শরীফ");
        this.map_var.put("content", "1jBUTajegls_BOanZCB_FPaDoJEJz4DmK");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৪র্থ খন্ড - সুনান আবূ দাউদ শরীফ");
        this.map_var.put("content", "1LsIHUmhwa7fpBVg-szsTCW9FyZOcXRZg");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৫ম খন্ড - সুনান আবূ দাউদ শরীফ");
        this.map_var.put("content", "1294SjTykgSy5McqgaovwpRjhraIB9CJY");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "১ম খন্ড - মুসনাদে আহমেদ");
        this.map_var.put("content", "1zskYYc3rUfBpD1H6a4qHmxEtpOKpYqC4");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "২য় খন্ড - মুসনাদে আহমেদ");
        this.map_var.put("content", "1DBnrKoY-wScnIsbqy5Pzklfhgn6xsisr");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "১ম খন্ড - সুনানু নাসাঈ শরীফ");
        this.map_var.put("content", "1-ERTG6olRyXI0xR5gJxKQP0QM8BKUJVi");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "২য় খন্ড - সুনানু নাসাঈ শরীফ");
        this.map_var.put("content", "1UT2E0cC6xuNeY_cwXgC4OLOZSPTnAAhZ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৩য় খন্ড - সুনানু নাসাঈ শরীফ");
        this.map_var.put("content", "1JF6R7U2IvBEKMzosWjeoHXTR2V_kNZaY");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৪র্থ খন্ড - সুনানু নাসাঈ শরীফ");
        this.map_var.put("content", "1bYYQMyK38WsAk6M3JXa5lWMErLRX3QbW");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "১ম খন্ড - সহীহ মুসলিম শরীফ");
        this.map_var.put("content", "1qVRggmEcVi3xC6yCwd9D8-4p0g2raTPA");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "২য় খন্ড - সহীহ মুসলিম শরীফ");
        this.map_var.put("content", "1V78q34XFzJsTuHFcI5k0eCsud8qXKMAG");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৩য় খন্ড - সহীহ মুসলিম শরীফ");
        this.map_var.put("content", "1M5reUzRJlvGcQM5BDX8nPD3R7rscqZu9");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৪র্থ খন্ড - সহীহ মুসলিম শরীফ");
        this.map_var.put("content", "1AhQUCk75Qb2Nen02Hyu1pKdh6aqt6rI5");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৫ম খন্ড - সহীহ মুসলিম শরীফ");
        this.map_var.put("content", "1nlaobeOfk2viMID_Edvcqzuz4JHUeokT");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৬ষ্ঠ খন্ড - সহীহ মুসলিম শরীফ");
        this.map_var.put("content", "1PK7XmL0CnjlNmCs2iBzpFbn1-EokFM1J");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "১ম খন্ড - সুনানু আত তিরমিজী");
        this.map_var.put("content", "1o9NUxS9UYZ2GE3zIN0VzimERqwBVdjf4");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "২য় খন্ড - সুনানু আত তিরমিজী");
        this.map_var.put("content", "1bT1-OFiYrWTcCGO6csMiGQ31Mg3xnQER");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৩য় খন্ড - সুনানু আত তিরমিজী");
        this.map_var.put("content", "1i6cCOlIyLzxrwErATCpztuQYttxTl_kQ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৪র্থ খন্ড - সুনানু আত তিরমিজী");
        this.map_var.put("content", "1XJSwNKSzeNlPZuZ5gcBRsKVO6ukdjhBO");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৫ম খন্ড - সুনানু আত তিরমিজী");
        this.map_var.put("content", "1__IOoHvRsS6oX6BydrNLHVMsfIaD4xCk");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "১ম খন্ড - সুনাসু ইবনে মাজাহ");
        this.map_var.put("content", "12JRESC7uka0Au-zlvdSQFbniJ1I7mn49");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "২য় খন্ড - সুনাসু ইবনে মাজাহ");
        this.map_var.put("content", "1d0Q9gV39h8g4tGPmSahJteB_WWBaKRZA");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৩য় খন্ড - সুনাসু ইবনে মাজাহ");
        this.map_var.put("content", "1u2FeISWbhHme5GKcIsI3ZSh6ukK0nnlU");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "আল আদাবুল মুফরাদ");
        this.map_var.put("content", "1IglSif89gwE2OayyKZtLp3l_yJCzA2wX");
        this.map_list.add(this.map_var);
    }

    private void _PDF_Fikha() {
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "১ম খন্ড - আল হিদায়া");
        this.map_var.put("content", "19celd5Som6UA4e36AIMsUZXHnvCZB3IF");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "২য় খন্ড - আল হিদায়া");
        this.map_var.put("content", "1PfdpOvxGyTPtQ87y5R0R5N0Zu0tMP8P5");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৩য় খন্ড - আল হিদায়া");
        this.map_var.put("content", "1IwR77bi0c6uHjibYF0wpE541UsDocvuc");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৪র্থ খন্ড - আল হিদায়া");
        this.map_var.put("content", "1g4UijdC64ofBwk2qE1FWCuzYLzWYWGOc");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "১ম খন্ড - ফতোয়ায়ে আলমগীরী");
        this.map_var.put("content", "1Tro3EnDRzJxGrPlVJyN-3E-YA_AaUQoD");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "২য় খন্ড - ফতোয়ায়ে আলমগীরী");
        this.map_var.put("content", "13v8TkYwP-LBhyrVYUf-NI4uB54hoM2s1");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৩য় খন্ড - ফতোয়ায়ে আলমগীরী");
        this.map_var.put("content", "14kw7iVnOtxFlOKQWBNqdVtQwvVf7U1dm");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৪র্থ খন্ড - ফতোয়ায়ে আলমগীরী");
        this.map_var.put("content", "1l6dHx7CODlON2JVq85VOK2osv8etwzr6");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৫ম খন্ড - ফতোয়ায়ে আলমগীরী");
        this.map_var.put("content", "1DGoRkc-_RkRFDk6D1w_MjKk8tLP7P2NY");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "৬ষ্ঠ খন্ড - ফতোয়ায়ে আলমগীরী");
        this.map_var.put("content", "1XTL0qkpFVj1I1_W-BBXFKIdKUvCmMMZl");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "ফাতাওয়া ই আফ্রিকা");
        this.map_var.put("content", "10uQD4n7Td4wK7Xv5zBAe-wEdoZ4f_fI6/view");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "হযরত আব্দুল্লাহ ইবনে মাসঊদ ও তার ফিকাহ");
        this.map_var.put("content", "1GPjbeLF0kyj1OUjVzAkT6y_2hlj1Y8Gk/view");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "উলামার মতানৈক্য ও আমাদের কর্তব্য");
        this.map_var.put("content", "1cqJxIZp32k0UwgjdBZwiOTqat_-hFEzu/view");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "তাকলিদের গুরুত্ব ও প্রয়োজনীয়তা");
        this.map_var.put("content", "13M6nUkR9DMpIcZxfRJzDHCR-5x0P09zS/view");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "আদিল্লাতুল হানাফিয়্যাহ");
        this.map_var.put("content", "1GNKhMwfu2AbKWc08XTWTrIqOzSIhjQ9E/view");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "ইকামতে কখন দাঁড়াবেন");
        this.map_var.put("content", "1ltfztfLaatOqrFOzNI2pNgYl1Ph5vzID/view");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "ইমামগনের মতবিরোধ কি ও কেন?");
        this.map_var.put("content", "1jFERl_oKM-1C9AOZVXE7v2GY1c78dBFk");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "কানুনে শরীয়ত");
        this.map_var.put("content", "1Qs6ZVJQsDfTVCm2ZKRLcu45T7axiZ2an");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "আমা'আতের সময় ইমাম ও মুসল্লীগণ কখন দাঁড়াবেন");
        this.map_var.put("content", "1PidrR4bnA2bO_omFiWSD-8kuw7Zbc10e");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "আজানের পূর্বে ও পরে সালাত-সালাম প্রদানে শরীয়তের ফয়সালা");
        this.map_var.put("content", "1kdnLke2XDRTw8gViDZIo72-z9G7Fvftj");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "আল বিদ'আত (ইমাম ও মুহাদ্দিসগণের দৃষ্টিতে)");
        this.map_var.put("content", "1AtLHQH6qt3giWpEy34JIraWUAsVP27qf");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "ইকামতের পূর্বে দাঁড়ানো মাকরূহ");
        this.map_var.put("content", "1H3VcN6DXY29D3sO6t1G4OhBxvZCMWI8_");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "কোরআন ও হাদীসের আলোকে বিদায়াত কি?");
        this.map_var.put("content", "1QZD1u4JuHYiZYKtx3CX06tG2XL_mVWTM");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "খাসী দ্বারা কুরবানী করার শরয়ী বিশ্লেষণ");
        this.map_var.put("content", "1a5nVIvs8ak1rEcKSlE2JwJ65WYRaPwpf");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "হাদিসের আলোকে নামাজে আমিন বলার বিধান");
        this.map_var.put("content", "1qJ07MbAMFrboK45GnA_zm-vsC1xEOLkC");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "বিতর্কিত মাসায়েলের সমাধান-কুরআন ও বুখারী থেকে (১ম খন্ড)");
        this.map_var.put("content", "1jZlxCgTjbCrfkZL2vSX-EDdo1oS1yQrD");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "বাহারে শরীয়ত (১ - ৫ খন্ড)");
        this.map_var.put("content", "1LNf1RaID1ocvGRb1QRDNRbxtOkQEme2Q");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "ইমামের অনুসরণে কেরাতের হুকুম");
        this.map_var.put("content", "11Ri4XAtGAENnLxeOT5UbIuAj8XXtMqdA");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নামাজে সূরা ফাতিহার শেষে আমিন বলা জোরে না আস্তে");
        this.map_var.put("content", "1PP-toCH04Nq0xXcrBihcj-nYdTIpKwgy");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "বিদআতের বিরুদ্ধে ১০০টি ফতোয়া");
        this.map_var.put("content", "1h7Uw54LZsl4hLasT1hYSOYzptYqLQj0J");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "হাদিসের আলোকে ২০ রাকাত তারাবিহ নামাজ");
        this.map_var.put("content", "1QGqVLtOU99-VgBii8-uabpoIPWR_Ek1q");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "হাদিসের আলোকে হানাফীদের ঈদের নামাজ");
        this.map_var.put("content", "1FdvUN_rqTbVtL5QpIYr3g5PO74xQ4iPX");
        this.map_list.add(this.map_var);
    }

    private void _PDF_Akidah() {
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "আল ফিকহুল আকবর");
        this.map_var.put("content", "1CN6SK3ePuOmpjg-pd1Htqb-UMGP5N2Mi");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "কালো গোলাম");
        this.map_var.put("content", "1YxvnNJRGsIwTWZVTaQVWc0Ywg0kae0IE");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "কালেমার হাক্বিক্বত");
        this.map_var.put("content", "1RLak2HNeKl5a97ZxqIAuYTDaCcK9CsjJ");
        this.map_list.add(this.map_var);
    }

    private void _PDF_Nabijir_Marzada() {
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "হায়াতুন্নবী");
        this.map_var.put("content", "1O6MSPUDSgJWjFswuO8AgQWCT7OiXnxIF");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "খাসায়েলে মুস্তফা");
        this.map_var.put("content", "1lB4EK22M-DRZSmUxKCz2fqV3vlOLg6TR");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নবীজীর পরকালীন জীবন");
        this.map_var.put("content", "1nE47lK-9mz9Ww5Vay-MiBO7jFeqENYJV");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "সৃষ্টির পরশমণি");
        this.map_var.put("content", "1f10fQekIId1Tf4jJKIDa4pydDNa-OPvC");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "অদ্বিতীয় রাসূল (ﷺ) এর অদ্বিতীয় জানাযা");
        this.map_var.put("content", "1NrhTweFsEbTmoI_x5lEtPTjmdn_WZgiW");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "জানে ঈমান");
        this.map_var.put("content", "1-N19yAnyp6esRD54TfQWpjpkdAjmLGr_");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "তওহীদ ও শির্ক");
        this.map_var.put("content", "1ChuHH7mLpnpQC2MgPJdInvSkukWURJl6");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নবীয়ে রহমত");
        this.map_var.put("content", "1KNusniSnnugcMbQ-9niFt0v4dxq0RZxV");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "মুমিনের কবর জীবন");
        this.map_var.put("content", "11MYOnTX2LS2e1SgxI6HruXkYyp7ysFEt");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "হায়াতুল আম্বিয়া (আঃ)");
        this.map_var.put("content", "1ytUKbsCPKyW8tiWrnhbKEsmHEkgzyXex");
        this.map_list.add(this.map_var);
    }

    private void _PDF_Shane_Awliya() {
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "তাজকেরাতুল আউলিয়া");
        this.map_var.put("content", "1vgEU_kOT-at4vj0RGGv9_sBqPUCXLd4A");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "হাজরাতুল কুদ্দুস - প্রথম অংশ");
        this.map_var.put("content", "1aaMom3zP4y1hrcCTmckROANmBRwrNYAZ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "হাজরাতুল কুদ্দুস - দ্বিতীয় অংশ");
        this.map_var.put("content", "1PtIa44pGvXVtycU0vOf4_fA-t1D9RW8W");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "শানে আউলিয়া");
        this.map_var.put("content", "1n1pIvBwc5laoU34yT4LJFazg7_TEgrB0");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "আউলিয়া-ই কেরামের চরিত্র");
        this.map_var.put("content", "1634jqLPewkOwcYTrNkcxwidwUcyqBUx3");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "আল বাহজাতুল আসরার - প্রথম অংশ");
        this.map_var.put("content", "1GowkbkM7Lp06ZLlcaBtTWY1GRhFfCwhW");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "আল বাহজাতুল আসরার - দ্বিতীয় অংশ");
        this.map_var.put("content", "1wEr2-um-St1FxW8ZfJWmaPHmon2zpWTV");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "জ্ঞানীদের দৃষ্টিতে আলা হযরত আশরাফী মিয়া (রা.)");
        this.map_var.put("content", "1GmK0ZsyQD2ZqleEuf17qj9AzTWqhqzu2");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "ইমাম শেরে বাংলা রহঃ এর জিবনী");
        this.map_var.put("content", "1euPD_fntxrK5wSO59GSQcNn9sXA4kdcP");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "ঐতিহাসিক গাদীর- এ- খোমের ঘটনা");
        this.map_var.put("content", "1CAiyeYNSRwAlyRB8JdjRJliUXJtDu1ch");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "গাউছুল আজম মাইজভান্ডারীর জীবনী ও কারামত");
        this.map_var.put("content", "10unnqAqVmeLzaCMpJYaeyXm9c2hZG9xj");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "গাউসুল আজম ও গাউসিয়াত");
        this.map_var.put("content", "12vSMWcbQXDvYNLB_cJ9OxDLNu0iwJBgc");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "দিওয়ানে আজিজ");
        this.map_var.put("content", "1w7L3jM6e1MRAa86tdVRdybybAmYbcq2m");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "বুস্তানুল মুহাদ্দিসীন");
        this.map_var.put("content", "1RPYZREoxAHdwZQy2ZMxV72ksp70T4_EP");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "মাখদুমপাক আশরাফ জাহাঙ্গীর সিমনানী (রা.)");
        this.map_var.put("content", "1H5ifLmVqzjzXnQuUuRee5oJupth-6B3L");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "শানে গাউছুল আজম");
        this.map_var.put("content", "1Xxpm8kuF_MS1hVV2eaWisctxCZda65bd");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "সৈয়দা ফাতেমা বতুল বিনতে রাসূল (ﷺ)");
        this.map_var.put("content", "1QfwY0LvATXuE9h77wbEnATMBeun3r3Xv");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "সৈয়্যদ মুহাম্মদ তৈয়্যব শাহ্ রহঃ এর জিবনী");
        this.map_var.put("content", "1NAGNe06XeOa7Hv1E5edzJYInvoZsUM65");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "হযরত আব্দুল কাদির জীলানী (রহঃ)'র জীবন ও কারামত");
        this.map_var.put("content", "143K8Gis9CA0apArYTFBubbrWDgBDntAB");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "হযরত বায়েজীদ বোস্তামী রাহঃ ও তার দরগাহ শরীফ");
        this.map_var.put("content", "1PBDJyshxm4R4V3z_vgnD5jAnvPjmHTZF");
        this.map_list.add(this.map_var);
    }

    private void _PDF_Ahmed_Year_Khan() {
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "জা-আল হক্ব - ১ম খন্ড");
        this.map_var.put("content", "1hI8KmtwoiwpIeUDlU6KNyDNs38jSXl0A");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "জা-আল হক্ব - ২য় খন্ড");
        this.map_var.put("content", "1gcH5GPJmuHUwvaAnqXyCTHNXrWsrTbDv");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "জা-আল হক্ব - ৩য় খন্ড");
        this.map_var.put("content", "1zMYsWU8rbrd6MGT_-4XTY45SHFRoewlk");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "মিরআতুল মানাজীহ শরহে মিশকাতুল মাসাবিহ - ১ম খন্ড");
        this.map_var.put("content", "1oU5XMPDciwvpn6wSwaSSkphvt2WKmXm-");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "মিরআতুল মানাজীহ শরহে মিশকাতুল মাসাবিহ - ২য় খন্ড");
        this.map_var.put("content", "1zwymDX_IIX4p2HHjPe2Nm0rmXCI1aLTZ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "মিরআতুল মানাজীহ শরহে মিশকাতুল মাসাবিহ - ৩য় খন্ড");
        this.map_var.put("content", "1sf4OIciOjzt5lUwmuZBX7Q2KGm63HKa4");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "মিরআতুল মানাজীহ শরহে মিশকাতুল মাসাবিহ - ৪র্থ খন্ড");
        this.map_var.put("content", "1f3t6dSs6v-iDC_q5gqg4SPRjJRKeuO81");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "আউলিয়া কিরামের ওয়াসীলায় খোদার রহমত");
        this.map_var.put("content", "1E0NxbddufeiFyAw6HHEyaqIyM2LM_cEr");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "দরসুল কুরআন");
        this.map_var.put("content", "1QiBm22ZW1L-CP61oYO_rdcxVDlMYUPoM");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "সালতানাতে মোস্তফা");
        this.map_var.put("content", "1gwJOgAWPkI23309xhaSGEp7MtG6u86gy");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "মাওয়ায়িয ই নঈমীয়্যাহ");
        this.map_var.put("content", "1tiBw55PzzNhHPXZkA4jfg65oz3QB310k");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "ইলমুল কুরআন হাকীমুল উম্মত");
        this.map_var.put("content", "1l07Pob9n3y0fnSJTc5fzmikMiQG6ABWE");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "ইসলামী জিন্দেগী");
        this.map_var.put("content", "1nyjPYYZYiKJr4UQG9N_tf_BCHn2i8zMO");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "ইসলামের চারটি মৌলিক পরিভাষা");
        this.map_var.put("content", "1iksPl6w6G8VBCCvWh0CbJ3Y9l5gtq0LL");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নবী বংশের পবিত্রতা");
        this.map_var.put("content", "15fI36Wpaw8cFnHnK2JxYrP9pqC1V4Q6E");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "বিশ্বনবী নূরের রবি");
        this.map_var.put("content", "12nb1qN-XPTsZfAx9dL5rA3mUvwU_Tiup");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "আহলে কুরআনের ভ্রান্ত মতবাদ খন্ডনে অনন্য ইসলাম");
        this.map_var.put("content", "1m4mO0DN3PbkLF0tNkOKFmWH32qCxclsh");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "আল কোরআনের আলোকে শানে হাবিবুর রহমান");
        this.map_var.put("content", "1bnS6Ixzfltb5IUtIZe4RtF5fWDUgCJ5B");
        this.map_list.add(this.map_var);
    }

    private void _PDF_Jalal_Uddin() {
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "জ্বীন জাতির বিষ্ময়কর ইতিহাস - প্রথম খন্ড");
        this.map_var.put("content", "1TBKLO_PtECwRNNKeTOK4K_t-VkEZND6x");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "জ্বীন জাতির বিষ্ময়কর ইতিহাস - দ্বিতীয় খন্ড");
        this.map_var.put("content", "18nyYBw_SCtSq2-zOyLxqvdOl5Q-jMlSA");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "জ্বীন জাতির বিষ্ময়কর ইতিহাস - তৃতীয় খন্ড");
        this.map_var.put("content", "1JAdXH3FR3zmhth9JOzBbjjt_QYYvXo_O");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "মরণের পর কি হবে?");
        this.map_var.put("content", "19PeB5bBnni2b-kucN3pVsZhWHri8I548");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "তারীখুল খুলাফা");
        this.map_var.put("content", "1BJCmUEfGzH4pYdL6PtTg3BuKstwRidfE");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "আরশের ছায়ায় থাকবে যাদের কায়া");
        this.map_var.put("content", "1ts9ZNzUoJLIWeHr6QU8x8Mkw6fOGFvZ9");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "দোয়া কিভাবে কবুল হয়");
        this.map_var.put("content", "1V_hs6RyRd1tYgqbmfz4pPS__0cEiJYf6");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "হাদিসের আলোকে রুজী বৃদ্ধির আমল");
        this.map_var.put("content", "1ZlxH53Ng1LsAc2RQwiLOsmyHPqzWZlDV");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "হুসনুল মাকসিদ ফি আমালিল মাওলিদ");
        this.map_var.put("content", "1X9YD-C2sgtldPUhf3T44dHmHBDOp43KP");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "জাগ্রত অবস্থায় জিয়ারতে মোস্তফা (সাঃ)");
        this.map_var.put("content", "1hNFp7eXQRQ1iFSrnp8LhHUx0KJ3bWxwJ");
        this.map_list.add(this.map_var);
    }

    private void _PDF_Miladunnabi() {
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "আন নি'মাতুল কুবরা আলাল আ'লাম ফি মাওলিদে সাইয়্যিদে উলদে আদম");
        this.map_var.put("content", "1a0_Q-W6bq3PTSXSOaMQhzJF5VaYMUVoK");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "কোরআন হাদীসের আলোকে ঈদে মিলাদুন্নবী ও জুলুস");
        this.map_var.put("content", "1l_Np0utRFGPH3SkcEog3mqlewD-3JgYu");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "ঈদে মিলাদুন্নবীই হচ্ছে সর্বশ্রেষ্ঠ ঈদ");
        this.map_var.put("content", "12o83WD8FhhEEHvkfBIgxH4rFBIix3o9w");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "ফয়সালা");
        this.map_var.put("content", "1iN_d5772Q5IoHGws3Aymlk3Qe_i38ffx");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "হাকিকতে মিলাদ");
        this.map_var.put("content", "1s8cBA5SR265HnC0VfPxX6aLzdIYigOj1");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "আল হিজবুল আজম");
        this.map_var.put("content", "1gf6i2YZNTqHKbeW8HCeaHA2-aA1msojD");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "মাওলিদু রাসূলীল্লাহ সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম");
        this.map_var.put("content", "1fyY8kF-HPclGb8hn8SVO8mfvXO4cCfp6");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "ইসলামী শরীয়তের দৃষ্টিতে ঈদে মিলাদুন্নবী");
        this.map_var.put("content", "1lLbziQyOMsw2GXg4gug6NebdkpgJeyIC");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "দারুল ফাতওয়া অস্ট্রেলিয়া - মিলাদুন্নবী (দ.)");
        this.map_var.put("content", "1lLbziQyOMsw2GXg4gug6NebdkpgJeyIC");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "মিলাদের হুকুম");
        this.map_var.put("content", "1cTfR2Z8G07Q6bRDmntgWTRbGndMB02iP");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "মিলাদুন্নবী (দ.)");
        this.map_var.put("content", "1iDRXcOT4nZKL4-u2GL2RdtWZ4WWN4Fl4");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "শরীয়তের আলোকে জশনে মিলাদুন্নবী");
        this.map_var.put("content", "1t36-c9gHe74UeUO1n4sv6f101BFPUdfY");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "আল মাওলিদুর রাভী");
        this.map_var.put("content", "1tr20mTrpUOtmOXPG3W1V6__KmusEIykM");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "কোরআন ও সহীহ হাদিসের আলোকে মিলাদুন্নবী (দ.)");
        this.map_var.put("content", "1BNkOxAGsmEMH3nlwQY8lGt5rTQoRrtvX");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "কুরআন, সুন্নাহ ও ইজমার আলোকে ঈদে মিলাদুন্নবী");
        this.map_var.put("content", "1xTjOq_M8WwT6V1UeQcLojXKnT3L7eMii");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "মীলাদুন্নবী সম্পর্কিত দুবাই ফতোওয়া");
        this.map_var.put("content", "1r6rEr_58J9eHdQQq9mdJRwQn5vX4Levz");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "ঈদে মিলাদুন্নবী নিয়ে উত্থাপিত প্রশ্নোত্তর");
        this.map_var.put("content", "1UKW48LQRY-fSRKxtt9vuS6Vd9n2lvTYa");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "ঈদে মিলাদুন্নবী নিয়ে উত্থাপিত প্রশ্নোত্তর");
        this.map_var.put("content", "1UKW48LQRY-fSRKxtt9vuS6Vd9n2lvTYa");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "ফতোওয়ায়ে আহলে সুন্নাহ");
        this.map_var.put("content", "1f7b63DhFT0oes37gttZFXa8sacPd7GIk");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "মীলাদুন্নবী (দুরুদ) - সাইদ কাযেমী (রহঃ)");
        this.map_var.put("content", "1rn4fitCpMiexPm-dEC6RZakLuM6Xmru7");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "সকল যুগের সেরা ঈদে মীলাদুন্নবী");
        this.map_var.put("content", "1xdMNjx9YABGidp-Mg94xt7wfdJcxQO5U");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "মৌলুদে খাইরুল বারিয়া");
        this.map_var.put("content", "14qGXRMRxW2tQHWCe2n_3vdZaxBJhW0o7");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "শরীয়তের দৃষ্টিতে ঈদে মীলাদুন্নবী(ﷺ)");
        this.map_var.put("content", "1IoYg4Fg1sIE4Goqjg0ejBozb728bTd4p");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "হাকিকতে মিলাদে মোস্তফা (সাঃ)");
        this.map_var.put("content", "1vWWvnslQnqEZH4QxWJx0nRbUt3qfBcL1");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "হাকিকতে মুহাম্মদী ও মিলাদে আহমদী");
        this.map_var.put("content", "1jLqtIMy3CHk8o5NWim6zzwg_CJYot_5P");
        this.map_list.add(this.map_var);
    }

    private void _PDF_Onnanno() {
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "ইমাম মাহদীর আবির্ভাব, ইছা (আ.) এর অবতরণ ও আলামতে কিয়ামত ");
        this.map_var.put("content", "1Ri_Gqz6yHa-JniJe6g_ePgvaUx-r2gDY");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "ইতিহাসের কাঠগড়ায় হযরত মু'আবিয়া (রা.)");
        this.map_var.put("content", "1j2maH_kTPspp0qsJuHIW2CbCNFJj2sIn");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "মরণের পর কি হবে?");
        this.map_var.put("content", "19PeB5bBnni2b-kucN3pVsZhWHri8I548");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নবী করিম (সা.) এর ওসীয়ত");
        this.map_var.put("content", "1btDCTEqyOI_2VYjimvXytXwoKwxsC_Ge");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "জাগ্রত অবস্থায় জিয়ারতে মোস্তফা (সাঃ)");
        this.map_var.put("content", "1hNFp7eXQRQ1iFSrnp8LhHUx0KJ3bWxwJ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "সাহাবাগণের জীবনের আলোকময় কাহিনী - কিসরার মূকুট");
        this.map_var.put("content", "1lMoQ9k_O8-xcXmPQN1UBaR5a4YtnLARK");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "তাকলিদের গুরুত্ব ও প্রয়োজনীয়তা");
        this.map_var.put("content", "13M6nUkR9DMpIcZxfRJzDHCR-5x0P09zS");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "বিচারনীতিতে রাসুলুল্লাহ (দ.) এর বিশেষত্ব");
        this.map_var.put("content", "1rRT98xWRZdWyc10W0eCxS24GPuEm78XP");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "মাযহাব বিরুধীদের খন্ডনে হানাফীদের জরুরি মাসায়েল");
        this.map_var.put("content", "137r5YpFZPwVmAlDqk-ssHOeTLJeL3-IR");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "ইসলামের বাস্তব কাহিনী - ১ম খন্ড");
        this.map_var.put("content", "14cKmRg07uFQGD_WnoiiSOr24M0DNS9Ry");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "ইসলামের বাস্তব কাহিনী - ২য় খন্ড");
        this.map_var.put("content", "1yyFHxyUprzaLZognB-qK6wksPBTWwr05");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "ইসলামের বাস্তব কাহিনী - ৩য় খন্ড");
        this.map_var.put("content", "1hE48m6ZveUSN0cV-CaaE3jEWlBlJ8jl4");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "ইসলামের বাস্তব কাহিনী - ৪র্থ খন্ড");
        this.map_var.put("content", "1hgKup9A0NOzsFXmRrgdh-vMZ7D7RywWJ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "ইসলামের বাস্তব কাহিনী - ৫ম খন্ড");
        this.map_var.put("content", "1YgmUxVGOwlnqjIwtoW-Ut3t_TxmyrhdG");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "ইসলামের বাস্তব কাহিনী - ৬ষ্ঠ খন্ড");
        this.map_var.put("content", "1GP5fQX-tqr84h9FhgJllTsbW87efZ7p1");
        this.map_list.add(this.map_var);
    }

   
    public class Listview_hadithAdapter extends BaseAdapter {
        ArrayList<HashMap<String, Object>> _data;

        public Listview_hadithAdapter(ArrayList<HashMap<String, Object>> arrayList) {
            this._data = arrayList;
        }

        @Override  
        public int getCount() {
            return this._data.size();
        }

        @Override  
        public HashMap<String, Object> getItem(int i) {
            return this._data.get(i);
        }

        @Override  
        public long getItemId(int i) {
            return i;
        }

        @Override  
        public View getView(final int i, View view, ViewGroup viewGroup) {
            LayoutInflater layoutInflater = (LayoutInflater) HadithMunazatActivity.this.getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            if (view == null) {
                view = layoutInflater.inflate(R.layout.hadith, (ViewGroup) null);
            }
            LinearLayout linearLayout =  view.findViewById(R.id.linear_main);
            LinearLayout linearLayout2 =  view.findViewById(R.id.linear1);
            LinearLayout linearLayout3 =  view.findViewById(R.id.linear2);
            LinearLayout linearLayout4 =  view.findViewById(R.id.linear7);
            LinearLayout linearLayout5 =  view.findViewById(R.id.linear6);
            LinearLayout linearLayout6 =  view.findViewById(R.id.linear3);
            LinearLayout linearLayout7 =  view.findViewById(R.id.linear4);
            LinearLayout linearLayout8 =  view.findViewById(R.id.linear5);
            TextView textView = (TextView) view.findViewById(R.id.textview_serial);
            ImageView imageView = (ImageView) view.findViewById(R.id.imageview_reference);
            ImageView imageView2 = (ImageView) view.findViewById(R.id.imageview_copy);
            ImageView imageView3 = (ImageView) view.findViewById(R.id.imageview_share);
            TextView textView2 = (TextView) view.findViewById(R.id.textview_heading);
            TextView textView3 = (TextView) view.findViewById(R.id.textview_arabic);
            TextView textView4 = (TextView) view.findViewById(R.id.textview_syllable);
            TextView textView5 = (TextView) view.findViewById(R.id.textview_onubad);
            textView.setText(this._data.get(i).get("Serial").toString());
            textView2.setText(this._data.get(i).get("Heading").toString());
            textView3.setText(this._data.get(i).get("Arabic").toString());
            textView4.setText(this._data.get(i).get("Syllable").toString());
            textView5.setText(this._data.get(i).get("Onubad").toString());
            HadithMunazatActivity.this._click(imageView);
            HadithMunazatActivity.this._click(imageView2);
            HadithMunazatActivity.this._click(imageView3);

            imageView.setOnClickListener(view2 -> {
                HadithMunazatActivity.this.setTheme(16974391);
                HadithMunazatActivity.this._setDialogFont(HadithMunazatActivity.this.ref, "রেফারেন্স", Listview_hadithAdapter.this._data.get(i).get("References").toString(), "solaimanlipi.ttf");
                HadithMunazatActivity.this.ref.setPositiveButton("Right", new DialogInterface.OnClickListener() { // from class: com.yeasinrabbi.girl_name.HadithMunazatActivity.Listview_hadithAdapter.1.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i2) {
                    }
                });
                HadithMunazatActivity.this.ref.create().show();
            });

            imageView2.setOnClickListener(view2 -> {
                HadithMunazatActivity.this.aa = Objects.requireNonNull(Listview_hadithAdapter.this._data.get(i).get("Serial")).toString();
                HadithMunazatActivity.this.bb = Objects.requireNonNull(Listview_hadithAdapter.this._data.get(i).get("Heading")).toString();
                HadithMunazatActivity.this.cc = Objects.requireNonNull(Listview_hadithAdapter.this._data.get(i).get("Arabic")).toString();
                HadithMunazatActivity.this.dd = Listview_hadithAdapter.this._data.get(i).get("Syllable").toString();
                HadithMunazatActivity.this.ee = Listview_hadithAdapter.this._data.get(i).get("Onubad").toString();
                HadithMunazatActivity.this.ff = Listview_hadithAdapter.this._data.get(i).get("References").toString();
                HadithMunazatActivity.this.code = HadithMunazatActivity.this.aa.concat("\n".concat(HadithMunazatActivity.this.bb.concat("\n".concat(HadithMunazatActivity.this.cc.concat("\n".concat(HadithMunazatActivity.this.dd.concat("\n".concat(HadithMunazatActivity.this.ee.concat("\n".concat(HadithMunazatActivity.this.ff.concat("\n\n".concat("Download full App : https://play.google.com/store/apps/details?id=com.yeasinrabbi.girl_name"))))))))))));
                HadithMunazatActivity hadithMunazatActivity = HadithMunazatActivity.this;
                HadithMunazatActivity.this.getApplicationContext();
                ((ClipboardManager) hadithMunazatActivity.getSystemService(Context.CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", HadithMunazatActivity.this.code));
                HadithMunazatActivity.this._createSnackBar("Copied");
            });
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.yeasinrabbi.girl_name.HadithMunazatActivity.Listview_hadithAdapter.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    HadithMunazatActivity.this.aa = Listview_hadithAdapter.this._data.get(i).get("Serial").toString();
                    HadithMunazatActivity.this.bb = Listview_hadithAdapter.this._data.get(i).get("Heading").toString();
                    HadithMunazatActivity.this.cc = Listview_hadithAdapter.this._data.get(i).get("Arabic").toString();
                    HadithMunazatActivity.this.dd = Listview_hadithAdapter.this._data.get(i).get("Syllable").toString();
                    HadithMunazatActivity.this.ee = Listview_hadithAdapter.this._data.get(i).get("Onubad").toString();
                    HadithMunazatActivity.this.ff = Listview_hadithAdapter.this._data.get(i).get("References").toString();
                    HadithMunazatActivity.this.code = HadithMunazatActivity.this.aa.concat("\n".concat(HadithMunazatActivity.this.bb.concat("\n".concat(HadithMunazatActivity.this.cc.concat("\n".concat(HadithMunazatActivity.this.dd.concat("\n".concat(HadithMunazatActivity.this.ee.concat("\n".concat(HadithMunazatActivity.this.ff.concat("\n\n".concat("Download full App : https://play.google.com/store/apps/details?id=com.yeasinrabbi.girl_name"))))))))))));
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", HadithMunazatActivity.this.code);
                    intent.putExtra("android.intent.extra.SUBJECT", "Share Content from Wazifa");
                    HadithMunazatActivity.this.startActivity(Intent.createChooser(intent, "Share text using"));
                }
            });

            if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("1")) {
                if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(ExifInterface.GPS_MEASUREMENT_2D)) {
                    if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(ExifInterface.GPS_MEASUREMENT_3D)) {
                        if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("4")) {
                            if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("5")) {
                                if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("6")) {
                                    if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("7")) {
                                        if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("8")) {
                                            if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("9")) {
                                                if (HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("10")) {
                                                    HadithMunazatActivity.this._textSize(textView3, 30.0d);
                                                }
                                            } else {
                                                HadithMunazatActivity.this._textSize(textView3, 28.0d);
                                            }
                                        } else {
                                            HadithMunazatActivity.this._textSize(textView3, 26.0d);
                                        }
                                    } else {
                                        HadithMunazatActivity.this._textSize(textView3, 24.0d);
                                    }
                                } else {
                                    HadithMunazatActivity.this._textSize(textView3, 22.0d);
                                }
                            } else {
                                HadithMunazatActivity.this._textSize(textView3, 20.0d);
                            }
                        } else {
                            HadithMunazatActivity.this._textSize(textView3, 18.0d);
                        }
                    } else {
                        HadithMunazatActivity.this._textSize(textView3, 16.0d);
                    }
                } else {
                    HadithMunazatActivity.this._textSize(textView3, 14.0d);
                }
            } else {
                HadithMunazatActivity.this._textSize(textView3, 12.0d);
            }
            if (!HadithMunazatActivity.this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("1")) {
                if (!HadithMunazatActivity.this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(ExifInterface.GPS_MEASUREMENT_2D)) {
                    if (!HadithMunazatActivity.this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(ExifInterface.GPS_MEASUREMENT_3D)) {
                        if (!HadithMunazatActivity.this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("4")) {
                            if (!HadithMunazatActivity.this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("5")) {
                                if (!HadithMunazatActivity.this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("6")) {
                                    if (!HadithMunazatActivity.this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("7")) {
                                        if (!HadithMunazatActivity.this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("8")) {
                                            if (!HadithMunazatActivity.this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("9")) {
                                                if (HadithMunazatActivity.this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("10")) {
                                                    HadithMunazatActivity.this._textSize(textView4, 30.0d);
                                                }
                                            } else {
                                                HadithMunazatActivity.this._textSize(textView4, 28.0d);
                                            }
                                        } else {
                                            HadithMunazatActivity.this._textSize(textView4, 26.0d);
                                        }
                                    } else {
                                        HadithMunazatActivity.this._textSize(textView4, 24.0d);
                                    }
                                } else {
                                    HadithMunazatActivity.this._textSize(textView4, 22.0d);
                                }
                            } else {
                                HadithMunazatActivity.this._textSize(textView4, 20.0d);
                            }
                        } else {
                            HadithMunazatActivity.this._textSize(textView4, 18.0d);
                        }
                    } else {
                        HadithMunazatActivity.this._textSize(textView4, 16.0d);
                    }
                } else {
                    HadithMunazatActivity.this._textSize(textView4, 14.0d);
                }
            } else {
                HadithMunazatActivity.this._textSize(textView4, 12.0d);
            }
            if (!HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("1")) {
                if (!HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(ExifInterface.GPS_MEASUREMENT_2D)) {
                    if (!HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(ExifInterface.GPS_MEASUREMENT_3D)) {
                        if (!HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("4")) {
                            if (!HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("5")) {
                                if (!HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("6")) {
                                    if (!HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("7")) {
                                        if (!HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("8")) {
                                            if (!HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("9")) {
                                                if (HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("10")) {
                                                    HadithMunazatActivity.this._textSize(textView5, 30.0d);
                                                }
                                            } else {
                                                HadithMunazatActivity.this._textSize(textView5, 28.0d);
                                            }
                                        } else {
                                            HadithMunazatActivity.this._textSize(textView5, 26.0d);
                                        }
                                    } else {
                                        HadithMunazatActivity.this._textSize(textView5, 24.0d);
                                    }
                                } else {
                                    HadithMunazatActivity.this._textSize(textView5, 22.0d);
                                }
                            } else {
                                HadithMunazatActivity.this._textSize(textView5, 20.0d);
                            }
                        } else {
                            HadithMunazatActivity.this._textSize(textView5, 18.0d);
                        }
                    } else {
                        HadithMunazatActivity.this._textSize(textView5, 16.0d);
                    }
                } else {
                    HadithMunazatActivity.this._textSize(textView5, 14.0d);
                }
            } else {
                HadithMunazatActivity.this._textSize(textView5, 12.0d);
            }
            return view;
        }
    }

   
    public class Listview_munazatAdapter extends BaseAdapter {
        ArrayList<HashMap<String, Object>> _data;

        public Listview_munazatAdapter(ArrayList<HashMap<String, Object>> arrayList) {
            this._data = arrayList;
        }

        @Override  
        public int getCount() {
            return this._data.size();
        }

        @Override  
        public HashMap<String, Object> getItem(int i) {
            return this._data.get(i);
        }

        @Override  
        public long getItemId(int i) {
            return i;
        }

        @Override  
        public View getView(final int i, View view, ViewGroup viewGroup) {
            LayoutInflater layoutInflater = (LayoutInflater) HadithMunazatActivity.this.getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            if (view == null) {
                view = layoutInflater.inflate(R.layout.monazath, (ViewGroup) null);
            }
            LinearLayout linearLayout =  view.findViewById(R.id.linear_main);
            LinearLayout linearLayout2 =  view.findViewById(R.id.linear1);
            LinearLayout linearLayout3 =  view.findViewById(R.id.linear2);
            LinearLayout linearLayout4 =  view.findViewById(R.id.linear3);
            LinearLayout linearLayout5 =  view.findViewById(R.id.linear4);
            LinearLayout linearLayout6 =  view.findViewById(R.id.linear5);
            LinearLayout linearLayout7 =  view.findViewById(R.id.linear6);
            TextView textView = (TextView) view.findViewById(R.id.textview_serial);
            ImageView imageView = (ImageView) view.findViewById(R.id.imageview_copy);
            ImageView imageView2 = (ImageView) view.findViewById(R.id.imageview_share);
            TextView textView2 = (TextView) view.findViewById(R.id.textview_arabic);
            TextView textView3 = (TextView) view.findViewById(R.id.textview_onubad);
            TextView textView4 = (TextView) view.findViewById(R.id.textview_ayath);
            textView.setText(this._data.get(i).get("Serial").toString());
            textView2.setText(this._data.get(i).get("Arabic").toString());
            textView3.setText(this._data.get(i).get("Onubad").toString());
            textView4.setText(this._data.get(i).get("Ayath").toString());
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.yeasinrabbi.girl_name.HadithMunazatActivity.Listview_munazatAdapter.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    HadithMunazatActivity.this.aa = Listview_munazatAdapter.this._data.get(i).get("Serial").toString();
                    HadithMunazatActivity.this.bb = Listview_munazatAdapter.this._data.get(i).get("Arabic").toString();
                    HadithMunazatActivity.this.cc = Listview_munazatAdapter.this._data.get(i).get("Onubad").toString();
                    HadithMunazatActivity.this.dd = Listview_munazatAdapter.this._data.get(i).get("Ayath").toString();
                    HadithMunazatActivity.this.code = Listview_munazatAdapter.this._data.get(i).get("Serial").toString().concat("\n".concat(Listview_munazatAdapter.this._data.get(i).get("Arabic").toString().concat("\n".concat(Listview_munazatAdapter.this._data.get(i).get("Onubad").toString().concat("\n".concat(Listview_munazatAdapter.this._data.get(i).get("Ayath").toString().concat("\n\n".concat("Download full App : https://play.google.com/store/apps/details?id=com.yeasinrabbi.girl_name"))))))));
                    HadithMunazatActivity hadithMunazatActivity = HadithMunazatActivity.this;
                    HadithMunazatActivity.this.getApplicationContext();
                    ((ClipboardManager) hadithMunazatActivity.getSystemService(Context.CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", HadithMunazatActivity.this.code));
                    HadithMunazatActivity.this._createSnackBar("Copied");
                }
            });
            HadithMunazatActivity.this._click(imageView);
            HadithMunazatActivity.this._click(imageView2);
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.yeasinrabbi.girl_name.HadithMunazatActivity.Listview_munazatAdapter.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    HadithMunazatActivity.this.aa = Objects.requireNonNull(Listview_munazatAdapter.this._data.get(i).get("Serial")).toString();
                    HadithMunazatActivity.this.bb = Objects.requireNonNull(Listview_munazatAdapter.this._data.get(i).get("Arabic")).toString();
                    HadithMunazatActivity.this.cc = Objects.requireNonNull(Listview_munazatAdapter.this._data.get(i).get("Onubad")).toString();
                    HadithMunazatActivity.this.dd = Objects.requireNonNull(Listview_munazatAdapter.this._data.get(i).get("Ayath")).toString();
                    HadithMunazatActivity.this.code = Objects.requireNonNull(Listview_munazatAdapter.this._data.get(i).get("Serial")).toString().concat("\n".concat(Listview_munazatAdapter.this._data.get(i).get("Arabic").toString().concat("\n".concat(Listview_munazatAdapter.this._data.get(i).get("Onubad").toString().concat("\n".concat(Listview_munazatAdapter.this._data.get(i).get("Ayath").toString().concat("\n\n".concat("Download full App : https://play.google.com/store/apps/details?id=com.yeasinrabbi.girl_name"))))))));
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", HadithMunazatActivity.this.code);
                    intent.putExtra("android.intent.extra.SUBJECT", "Share Content from Wazifa");
                    HadithMunazatActivity.this.startActivity(Intent.createChooser(intent, "Share text using"));
                }
            });

            if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("1")) {
                if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(ExifInterface.GPS_MEASUREMENT_2D)) {
                    if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(ExifInterface.GPS_MEASUREMENT_3D)) {
                        if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("4")) {
                            if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("5")) {
                                if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("6")) {
                                    if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("7")) {
                                        if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("8")) {
                                            if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("9")) {
                                                if (HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("10")) {
                                                    HadithMunazatActivity.this._textSize(textView2, 30.0d);
                                                }
                                            } else {
                                                HadithMunazatActivity.this._textSize(textView2, 28.0d);
                                            }
                                        } else {
                                            HadithMunazatActivity.this._textSize(textView2, 26.0d);
                                        }
                                    } else {
                                        HadithMunazatActivity.this._textSize(textView2, 24.0d);
                                    }
                                } else {
                                    HadithMunazatActivity.this._textSize(textView2, 22.0d);
                                }
                            } else {
                                HadithMunazatActivity.this._textSize(textView2, 20.0d);
                            }
                        } else {
                            HadithMunazatActivity.this._textSize(textView2, 18.0d);
                        }
                    } else {
                        HadithMunazatActivity.this._textSize(textView2, 16.0d);
                    }
                } else {
                    HadithMunazatActivity.this._textSize(textView2, 14.0d);
                }
            } else {
                HadithMunazatActivity.this._textSize(textView2, 12.0d);
            }
            if (!HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("1")) {
                if (!HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(ExifInterface.GPS_MEASUREMENT_2D)) {
                    if (!HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(ExifInterface.GPS_MEASUREMENT_3D)) {
                        if (!HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("4")) {
                            if (!HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("5")) {
                                if (!HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("6")) {
                                    if (!HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("7")) {
                                        if (!HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("8")) {
                                            if (!HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("9")) {
                                                if (HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("10")) {
                                                    HadithMunazatActivity.this._textSize(textView3, 30.0d);
                                                }
                                            } else {
                                                HadithMunazatActivity.this._textSize(textView3, 28.0d);
                                            }
                                        } else {
                                            HadithMunazatActivity.this._textSize(textView3, 26.0d);
                                        }
                                    } else {
                                        HadithMunazatActivity.this._textSize(textView3, 24.0d);
                                    }
                                } else {
                                    HadithMunazatActivity.this._textSize(textView3, 22.0d);
                                }
                            } else {
                                HadithMunazatActivity.this._textSize(textView3, 20.0d);
                            }
                        } else {
                            HadithMunazatActivity.this._textSize(textView3, 18.0d);
                        }
                    } else {
                        HadithMunazatActivity.this._textSize(textView3, 16.0d);
                    }
                } else {
                    HadithMunazatActivity.this._textSize(textView3, 14.0d);
                }
            } else {
                HadithMunazatActivity.this._textSize(textView3, 12.0d);
            }
            return view;
        }
    }

   
    public class Listview_manzilAdapter extends BaseAdapter {
        ArrayList<HashMap<String, Object>> _data;

        public Listview_manzilAdapter(ArrayList<HashMap<String, Object>> arrayList) {
            this._data = arrayList;
        }

        @Override  
        public int getCount() {
            return this._data.size();
        }

        @Override  
        public HashMap<String, Object> getItem(int i) {
            return this._data.get(i);
        }

        @Override  
        public long getItemId(int i) {
            return i;
        }

        @Override  
        public View getView(final int i, View view, ViewGroup viewGroup) {
            LayoutInflater layoutInflater = (LayoutInflater) HadithMunazatActivity.this.getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            if (view == null) {
                view = layoutInflater.inflate(R.layout.manzil, (ViewGroup) null);
            }
            LinearLayout linearLayout =  view.findViewById(R.id.linear_main);
            LinearLayout linearLayout2 =  view.findViewById(R.id.linear1);
            LinearLayout linearLayout3 =  view.findViewById(R.id.linear2);
            LinearLayout linearLayout4 =  view.findViewById(R.id.linear_bar_1);
            LinearLayout linearLayout5 =  view.findViewById(R.id.linear4);
            LinearLayout linearLayout6 =  view.findViewById(R.id.linear5);
            LinearLayout linearLayout7 =  view.findViewById(R.id.linear7);
            LinearLayout linearLayout8 =  view.findViewById(R.id.linear8);
            TextView textView = (TextView) view.findViewById(R.id.textview_title);
            ImageView imageView = (ImageView) view.findViewById(R.id.imageview_copy);
            ImageView imageView2 = (ImageView) view.findViewById(R.id.imageview_share);
            TextView textView2 = (TextView) view.findViewById(R.id.textview_arabic);
            LinearLayout linearLayout9 =  view.findViewById(R.id.linear_bar_2);
            TextView textView3 = (TextView) view.findViewById(R.id.textview_bangla);
            textView.setText(this._data.get(i).get("title").toString());
            textView2.setText(this._data.get(i).get("arabic").toString());
            textView3.setText(this._data.get(i).get("onubad").toString());
            HadithMunazatActivity.this._click(imageView);
            HadithMunazatActivity.this._click(imageView2);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.yeasinrabbi.girl_name.HadithMunazatActivity.Listview_manzilAdapter.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    HadithMunazatActivity.this.aa = Listview_manzilAdapter.this._data.get(i).get("title").toString();
                    HadithMunazatActivity.this.bb = Listview_manzilAdapter.this._data.get(i).get("arabic").toString();
                    HadithMunazatActivity.this.cc = Listview_manzilAdapter.this._data.get(i).get("onubad").toString();
                    HadithMunazatActivity.this.code = HadithMunazatActivity.this.aa.concat("\n".concat(HadithMunazatActivity.this.bb.concat("\n".concat(HadithMunazatActivity.this.cc.concat("\n\n".concat("Download full App : https://play.google.com/store/apps/details?id=com.yeasinrabbi.girl_name"))))));
                    HadithMunazatActivity hadithMunazatActivity = HadithMunazatActivity.this;
                    HadithMunazatActivity.this.getApplicationContext();
                    ((ClipboardManager) hadithMunazatActivity.getSystemService(Context.CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", HadithMunazatActivity.this.code));
                    HadithMunazatActivity.this._createSnackBar("Copied");
                }
            });
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.yeasinrabbi.girl_name.HadithMunazatActivity.Listview_manzilAdapter.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    HadithMunazatActivity.this.aa = Listview_manzilAdapter.this._data.get(i).get("title").toString();
                    HadithMunazatActivity.this.bb = Listview_manzilAdapter.this._data.get(i).get("arabic").toString();
                    HadithMunazatActivity.this.cc = Listview_manzilAdapter.this._data.get(i).get("onubad").toString();
                    HadithMunazatActivity.this.code = HadithMunazatActivity.this.aa.concat("\n".concat(HadithMunazatActivity.this.bb.concat("\n".concat(HadithMunazatActivity.this.cc.concat("\n\n".concat("Download full App : https://play.google.com/store/apps/details?id=com.yeasinrabbi.girl_name"))))));
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", HadithMunazatActivity.this.code);
                    intent.putExtra("android.intent.extra.SUBJECT", "Share Content from Wazifa");
                    HadithMunazatActivity.this.startActivity(Intent.createChooser(intent, "Share text using"));
                }
            });

            if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("1")) {
                if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(ExifInterface.GPS_MEASUREMENT_2D)) {
                    if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(ExifInterface.GPS_MEASUREMENT_3D)) {
                        if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("4")) {
                            if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("5")) {
                                if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("6")) {
                                    if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("7")) {
                                        if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("8")) {
                                            if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("9")) {
                                                if (HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("10")) {
                                                    HadithMunazatActivity.this._textSize(textView2, 30.0d);
                                                }
                                            } else {
                                                HadithMunazatActivity.this._textSize(textView2, 28.0d);
                                            }
                                        } else {
                                            HadithMunazatActivity.this._textSize(textView2, 26.0d);
                                        }
                                    } else {
                                        HadithMunazatActivity.this._textSize(textView2, 24.0d);
                                    }
                                } else {
                                    HadithMunazatActivity.this._textSize(textView2, 22.0d);
                                }
                            } else {
                                HadithMunazatActivity.this._textSize(textView2, 20.0d);
                            }
                        } else {
                            HadithMunazatActivity.this._textSize(textView2, 18.0d);
                        }
                    } else {
                        HadithMunazatActivity.this._textSize(textView2, 16.0d);
                    }
                } else {
                    HadithMunazatActivity.this._textSize(textView2, 14.0d);
                }
            } else {
                HadithMunazatActivity.this._textSize(textView2, 12.0d);
            }
            if (!HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("1")) {
                if (!HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(ExifInterface.GPS_MEASUREMENT_2D)) {
                    if (!HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(ExifInterface.GPS_MEASUREMENT_3D)) {
                        if (!HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("4")) {
                            if (!HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("5")) {
                                if (!HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("6")) {
                                    if (!HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("7")) {
                                        if (!HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("8")) {
                                            if (!HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("9")) {
                                                if (HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("10")) {
                                                    HadithMunazatActivity.this._textSize(textView3, 30.0d);
                                                }
                                            } else {
                                                HadithMunazatActivity.this._textSize(textView3, 28.0d);
                                            }
                                        } else {
                                            HadithMunazatActivity.this._textSize(textView3, 26.0d);
                                        }
                                    } else {
                                        HadithMunazatActivity.this._textSize(textView3, 24.0d);
                                    }
                                } else {
                                    HadithMunazatActivity.this._textSize(textView3, 22.0d);
                                }
                            } else {
                                HadithMunazatActivity.this._textSize(textView3, 20.0d);
                            }
                        } else {
                            HadithMunazatActivity.this._textSize(textView3, 18.0d);
                        }
                    } else {
                        HadithMunazatActivity.this._textSize(textView3, 16.0d);
                    }
                } else {
                    HadithMunazatActivity.this._textSize(textView3, 14.0d);
                }
            } else {
                HadithMunazatActivity.this._textSize(textView3, 12.0d);
            }
            return view;
        }
    }

   
    public class Listview_asmaulAdapter extends BaseAdapter {
        ArrayList<HashMap<String, Object>> _data;

        public Listview_asmaulAdapter(ArrayList<HashMap<String, Object>> arrayList) {
            this._data = arrayList;
        }

        @Override  
        public int getCount() {
            return this._data.size();
        }

        @Override  
        public HashMap<String, Object> getItem(int i) {
            return this._data.get(i);
        }

        @Override  
        public long getItemId(int i) {
            return i;
        }

        @Override  
        public View getView(int i, View view, ViewGroup viewGroup) {
            LayoutInflater layoutInflater = (LayoutInflater) HadithMunazatActivity.this.getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            if (view == null) {
                view = layoutInflater.inflate(R.layout.asmaul_custom, (ViewGroup) null);
            }
            LinearLayout linearLayout =  view.findViewById(R.id.linear_main);
            LinearLayout linearLayout2 =  view.findViewById(R.id.linear1);
            LinearLayout linearLayout3 =  view.findViewById(R.id.linear2);
            LinearLayout linearLayout4 =  view.findViewById(R.id.linear3);
            LinearLayout linearLayout5 =  view.findViewById(R.id.linear4);
            LinearLayout linearLayout6 =  view.findViewById(R.id.linear5);
            TextView textView = (TextView) view.findViewById(R.id.textview1);
            TextView textView2 = (TextView) view.findViewById(R.id.textview2);
            textView.setText(this._data.get(i).get("serial").toString());
            textView2.setText(this._data.get(i).get(AppMeasurementSdk.ConditionalUserProperty.NAME).toString());
            if (HadithMunazatActivity.this.data.getString("theme", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("theme6")) {
                linearLayout.setBackgroundColor(Color.parseColor(HadithMunazatActivity.this.colorPrimaryDark));
                textView.setTextColor(Color.parseColor(HadithMunazatActivity.this.ColorText));
                textView2.setTextColor(Color.parseColor(HadithMunazatActivity.this.ColorText));
                HadithMunazatActivity.this._CardStyle(linearLayout5, 0.0d, 180.0d, HadithMunazatActivity.this.colorPrimaryDark, false);
                HadithMunazatActivity.this._CardStyle(linearLayout6, 0.0d, 8.0d, HadithMunazatActivity.this.colorPrimaryDark, false);
                HadithMunazatActivity.this._CardStyle(linearLayout2, 0.0d, 10.0d, HadithMunazatActivity.this.colorPrimary, false);
            } else if (HadithMunazatActivity.this.data.getString("theme", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("theme5")) {
                linearLayout.setBackgroundColor(Color.parseColor(HadithMunazatActivity.this.colorPrimaryDark));
                textView.setTextColor(Color.parseColor(HadithMunazatActivity.this.ColorText));
                textView2.setTextColor(Color.parseColor(HadithMunazatActivity.this.ColorText));
                HadithMunazatActivity.this._CardStyle(linearLayout5, 0.0d, 180.0d, HadithMunazatActivity.this.colorPrimaryDark, false);
                HadithMunazatActivity.this._CardStyle(linearLayout6, 0.0d, 8.0d, HadithMunazatActivity.this.colorPrimaryDark, false);
                HadithMunazatActivity.this._CardStyle(linearLayout2, 0.0d, 10.0d, HadithMunazatActivity.this.colorPrimary, false);
            } else if (HadithMunazatActivity.this.data.getString("theme", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("theme4")) {
                linearLayout.setBackgroundColor(Color.parseColor(HadithMunazatActivity.this.colorPrimaryDark));
                textView.setTextColor(Color.parseColor(HadithMunazatActivity.this.ColorText));
                textView2.setTextColor(Color.parseColor(HadithMunazatActivity.this.ColorText));
                HadithMunazatActivity.this._CardStyle(linearLayout5, 0.0d, 180.0d, HadithMunazatActivity.this.colorPrimaryDark, false);
                HadithMunazatActivity.this._CardStyle(linearLayout6, 0.0d, 8.0d, HadithMunazatActivity.this.colorPrimaryDark, false);
                HadithMunazatActivity.this._CardStyle(linearLayout2, 0.0d, 10.0d, HadithMunazatActivity.this.colorPrimary, false);
            } else if (HadithMunazatActivity.this.data.getString("theme", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("theme3")) {
                linearLayout.setBackgroundColor(Color.parseColor(HadithMunazatActivity.this.colorPrimaryDark));
                textView.setTextColor(Color.parseColor(HadithMunazatActivity.this.ColorText));
                textView2.setTextColor(Color.parseColor(HadithMunazatActivity.this.ColorText));
                HadithMunazatActivity.this._CardStyle(linearLayout5, 0.0d, 180.0d, HadithMunazatActivity.this.colorPrimaryDark, false);
                HadithMunazatActivity.this._CardStyle(linearLayout6, 0.0d, 8.0d, HadithMunazatActivity.this.colorPrimaryDark, false);
                HadithMunazatActivity.this._CardStyle(linearLayout2, 0.0d, 10.0d, HadithMunazatActivity.this.colorPrimary, false);
            } else if (HadithMunazatActivity.this.data.getString("theme", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("theme2")) {
                linearLayout.setBackgroundColor(Color.parseColor(HadithMunazatActivity.this.colorPrimaryDark));
                textView.setTextColor(Color.parseColor("#FFFFFF"));
                textView2.setTextColor(Color.parseColor(HadithMunazatActivity.this.ColorText));
                HadithMunazatActivity.this._CardStyle(linearLayout5, 0.0d, 180.0d, "#009688", false);
                HadithMunazatActivity.this._CardStyle(linearLayout6, 0.0d, 8.0d, "#009688", false);
                HadithMunazatActivity.this._CardStyle(linearLayout2, 0.0d, 10.0d, HadithMunazatActivity.this.colorPrimary, false);
            } else {
                linearLayout.setBackgroundColor(Color.parseColor(HadithMunazatActivity.this.colorPrimaryDark));
                textView.setTextColor(Color.parseColor("#FFFFFF"));
                textView2.setTextColor(Color.parseColor(HadithMunazatActivity.this.ColorText));
                HadithMunazatActivity.this._CardStyle(linearLayout5, 0.0d, 180.0d, "#009688", false);
                HadithMunazatActivity.this._CardStyle(linearLayout6, 0.0d, 8.0d, "#009688", false);
                HadithMunazatActivity.this._CardStyle(linearLayout2, 0.0d, 10.0d, HadithMunazatActivity.this.colorPrimary, false);
            }
            return view;
        }
    }

   
    public class Listview_qasidaAdapter extends BaseAdapter {
        ArrayList<HashMap<String, Object>> _data;

        public Listview_qasidaAdapter(ArrayList<HashMap<String, Object>> arrayList) {
            this._data = arrayList;
        }

        @Override  
        public int getCount() {
            return this._data.size();
        }

        @Override  
        public HashMap<String, Object> getItem(int i) {
            return this._data.get(i);
        }

        @Override  
        public long getItemId(int i) {
            return i;
        }

        @Override  
        public View getView(final int i, View view, ViewGroup viewGroup) {
            LayoutInflater layoutInflater = (LayoutInflater) HadithMunazatActivity.this.getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            if (view == null) {
                view = layoutInflater.inflate(R.layout.qasida_custom, (ViewGroup) null);
            }
            LinearLayout linearLayout =  view.findViewById(R.id.linear_main);
            LinearLayout linearLayout2 =  view.findViewById(R.id.linear1);
            LinearLayout linearLayout3 =  view.findViewById(R.id.linear2);
            LinearLayout linearLayout4 =  view.findViewById(R.id.linear_bar);
            LinearLayout linearLayout5 =  view.findViewById(R.id.linear_arabic);
            LinearLayout linearLayout6 =  view.findViewById(R.id.linear_bar_1);
            LinearLayout linearLayout7 =  view.findViewById(R.id.linear_onubad);
            LinearLayout linearLayout8 =  view.findViewById(R.id.linear5);
            LinearLayout linearLayout9 =  view.findViewById(R.id.linear6);
            LinearLayout linearLayout10 =  view.findViewById(R.id.linear7);
            TextView textView = (TextView) view.findViewById(R.id.textview_title);
            ImageView imageView = (ImageView) view.findViewById(R.id.imageview_copy);
            ImageView imageView2 = (ImageView) view.findViewById(R.id.imageview_share);
            TextView textView2 = (TextView) view.findViewById(R.id.textview_arabic);
            LinearLayout linearLayout11 =  view.findViewById(R.id.linear_syllable);
            TextView textView3 = (TextView) view.findViewById(R.id.textview_syllable);
            TextView textView4 = (TextView) view.findViewById(R.id.textview_onubad);
            textView.setText(((HashMap) HadithMunazatActivity.this.map_list.get(i)).get("serial").toString());
            textView2.setText(((HashMap) HadithMunazatActivity.this.map_list.get(i)).get("arabic").toString());
            textView4.setText(((HashMap) HadithMunazatActivity.this.map_list.get(i)).get("meaning").toString());
            if (((HashMap) HadithMunazatActivity.this.map_list.get(i)).get("arabic").toString().equals("السلام اے نور چشم انبیاء\nالسلام اے بادشاہ اولیاء")) {
                linearLayout7.setVisibility(View.GONE);
            } else {
                linearLayout7.setVisibility(View.VISIBLE);
            }
            if (((HashMap) HadithMunazatActivity.this.map_list.get(i)).containsKey("syllable")) {
                textView3.setText(((HashMap) HadithMunazatActivity.this.map_list.get(i)).get("syllable").toString());
                linearLayout6.setVisibility(View.VISIBLE);
            } else {
                linearLayout6.setVisibility(View.GONE);
            }
            HadithMunazatActivity.this._click(imageView);
            HadithMunazatActivity.this._click(imageView2);
            if (((HashMap) HadithMunazatActivity.this.map_list.get(i)).containsKey("syllable")) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.yeasinrabbi.girl_name.HadithMunazatActivity.Listview_qasidaAdapter.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        HadithMunazatActivity.this.aa = Listview_qasidaAdapter.this._data.get(i).get("serial").toString();
                        HadithMunazatActivity.this.bb = Listview_qasidaAdapter.this._data.get(i).get("arabic").toString();
                        HadithMunazatActivity.this.cc = Listview_qasidaAdapter.this._data.get(i).get("syllable").toString();
                        HadithMunazatActivity.this.dd = Listview_qasidaAdapter.this._data.get(i).get("meaning").toString();
                        HadithMunazatActivity.this.code = HadithMunazatActivity.this.aa.concat("\n\n".concat(HadithMunazatActivity.this.bb.concat("\n\n".concat(HadithMunazatActivity.this.cc.concat("\n\n".concat(HadithMunazatActivity.this.dd.concat("\n\n".concat("Download full App : https://play.google.com/store/apps/details?id=com.senani.wazifa"))))))));
                        HadithMunazatActivity hadithMunazatActivity = HadithMunazatActivity.this;
                        HadithMunazatActivity.this.getApplicationContext();
                        ((ClipboardManager) hadithMunazatActivity.getSystemService(Context.CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", HadithMunazatActivity.this.code));
                        HadithMunazatActivity.this._createSnackBar("Copied");
                    }
                });
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.yeasinrabbi.girl_name.HadithMunazatActivity.Listview_qasidaAdapter.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        HadithMunazatActivity.this.aa = Listview_qasidaAdapter.this._data.get(i).get("serial").toString();
                        HadithMunazatActivity.this.bb = Listview_qasidaAdapter.this._data.get(i).get("arabic").toString();
                        HadithMunazatActivity.this.cc = Listview_qasidaAdapter.this._data.get(i).get("syllable").toString();
                        HadithMunazatActivity.this.dd = Listview_qasidaAdapter.this._data.get(i).get("meaning").toString();
                        HadithMunazatActivity.this.code = HadithMunazatActivity.this.aa.concat("\n\n".concat(HadithMunazatActivity.this.bb.concat("\n\n".concat(HadithMunazatActivity.this.cc.concat("\n\n".concat(HadithMunazatActivity.this.dd.concat("\n\n".concat("Download full App : https://play.google.com/store/apps/details?id=com.senani.wazifa"))))))));
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", HadithMunazatActivity.this.code);
                        intent.putExtra("android.intent.extra.SUBJECT", "Share Content from Wazifa");
                        HadithMunazatActivity.this.startActivity(Intent.createChooser(intent, "Share text using"));
                    }
                });
            } else {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.yeasinrabbi.girl_name.HadithMunazatActivity.Listview_qasidaAdapter.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        HadithMunazatActivity.this.aa = Listview_qasidaAdapter.this._data.get(i).get("serial").toString();
                        HadithMunazatActivity.this.bb = Listview_qasidaAdapter.this._data.get(i).get("arabic").toString();
                        HadithMunazatActivity.this.dd = Listview_qasidaAdapter.this._data.get(i).get("meaning").toString();
                        HadithMunazatActivity.this.code = HadithMunazatActivity.this.aa.concat("\n\n".concat(HadithMunazatActivity.this.bb.concat("\n\n".concat(HadithMunazatActivity.this.dd.concat("\n\n".concat("Download full App : https://bit.ly/daily_wazifa"))))));
                        HadithMunazatActivity hadithMunazatActivity = HadithMunazatActivity.this;
                        HadithMunazatActivity.this.getApplicationContext();
                        ((ClipboardManager) hadithMunazatActivity.getSystemService(Context.CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", HadithMunazatActivity.this.code));
                        HadithMunazatActivity.this._createSnackBar("Copied");
                    }
                });
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.yeasinrabbi.girl_name.HadithMunazatActivity.Listview_qasidaAdapter.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        HadithMunazatActivity.this.aa = Listview_qasidaAdapter.this._data.get(i).get("serial").toString();
                        HadithMunazatActivity.this.bb = Listview_qasidaAdapter.this._data.get(i).get("arabic").toString();
                        HadithMunazatActivity.this.dd = Listview_qasidaAdapter.this._data.get(i).get("meaning").toString();
                        HadithMunazatActivity.this.code = HadithMunazatActivity.this.aa.concat("\n\n".concat(HadithMunazatActivity.this.bb.concat("\n\n".concat(HadithMunazatActivity.this.dd.concat("\n\n".concat("Download full App : https://bit.ly/daily_wazifa"))))));
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", HadithMunazatActivity.this.code);
                        intent.putExtra("android.intent.extra.SUBJECT", "Share Content from Wazifa");
                        HadithMunazatActivity.this.startActivity(Intent.createChooser(intent, "Share text using"));
                    }
                });
            }

            if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("1")) {
                if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(ExifInterface.GPS_MEASUREMENT_2D)) {
                    if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(ExifInterface.GPS_MEASUREMENT_3D)) {
                        if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("4")) {
                            if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("5")) {
                                if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("6")) {
                                    if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("7")) {
                                        if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("8")) {
                                            if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("9")) {
                                                if (HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("10")) {
                                                    HadithMunazatActivity.this._textSize(textView2, 30.0d);
                                                }
                                            } else {
                                                HadithMunazatActivity.this._textSize(textView2, 28.0d);
                                            }
                                        } else {
                                            HadithMunazatActivity.this._textSize(textView2, 26.0d);
                                        }
                                    } else {
                                        HadithMunazatActivity.this._textSize(textView2, 24.0d);
                                    }
                                } else {
                                    HadithMunazatActivity.this._textSize(textView2, 22.0d);
                                }
                            } else {
                                HadithMunazatActivity.this._textSize(textView2, 20.0d);
                            }
                        } else {
                            HadithMunazatActivity.this._textSize(textView2, 18.0d);
                        }
                    } else {
                        HadithMunazatActivity.this._textSize(textView2, 16.0d);
                    }
                } else {
                    HadithMunazatActivity.this._textSize(textView2, 14.0d);
                }
            } else {
                HadithMunazatActivity.this._textSize(textView2, 12.0d);
            }
            if (!HadithMunazatActivity.this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("1")) {
                if (!HadithMunazatActivity.this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(ExifInterface.GPS_MEASUREMENT_2D)) {
                    if (!HadithMunazatActivity.this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(ExifInterface.GPS_MEASUREMENT_3D)) {
                        if (!HadithMunazatActivity.this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("4")) {
                            if (!HadithMunazatActivity.this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("5")) {
                                if (!HadithMunazatActivity.this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("6")) {
                                    if (!HadithMunazatActivity.this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("7")) {
                                        if (!HadithMunazatActivity.this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("8")) {
                                            if (!HadithMunazatActivity.this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("9")) {
                                                if (HadithMunazatActivity.this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("10")) {
                                                    HadithMunazatActivity.this._textSize(textView3, 30.0d);
                                                }
                                            } else {
                                                HadithMunazatActivity.this._textSize(textView3, 28.0d);
                                            }
                                        } else {
                                            HadithMunazatActivity.this._textSize(textView3, 26.0d);
                                        }
                                    } else {
                                        HadithMunazatActivity.this._textSize(textView3, 24.0d);
                                    }
                                } else {
                                    HadithMunazatActivity.this._textSize(textView3, 22.0d);
                                }
                            } else {
                                HadithMunazatActivity.this._textSize(textView3, 20.0d);
                            }
                        } else {
                            HadithMunazatActivity.this._textSize(textView3, 18.0d);
                        }
                    } else {
                        HadithMunazatActivity.this._textSize(textView3, 16.0d);
                    }
                } else {
                    HadithMunazatActivity.this._textSize(textView3, 14.0d);
                }
            } else {
                HadithMunazatActivity.this._textSize(textView3, 12.0d);
            }
            if (!HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("1")) {
                if (!HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(ExifInterface.GPS_MEASUREMENT_2D)) {
                    if (!HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(ExifInterface.GPS_MEASUREMENT_3D)) {
                        if (!HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("4")) {
                            if (!HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("5")) {
                                if (!HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("6")) {
                                    if (!HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("7")) {
                                        if (!HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("8")) {
                                            if (!HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("9")) {
                                                if (HadithMunazatActivity.this.f.getString("font_onubad", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("10")) {
                                                    HadithMunazatActivity.this._textSize(textView4, 30.0d);
                                                }
                                            } else {
                                                HadithMunazatActivity.this._textSize(textView4, 28.0d);
                                            }
                                        } else {
                                            HadithMunazatActivity.this._textSize(textView4, 26.0d);
                                        }
                                    } else {
                                        HadithMunazatActivity.this._textSize(textView4, 24.0d);
                                    }
                                } else {
                                    HadithMunazatActivity.this._textSize(textView4, 22.0d);
                                }
                            } else {
                                HadithMunazatActivity.this._textSize(textView4, 20.0d);
                            }
                        } else {
                            HadithMunazatActivity.this._textSize(textView4, 18.0d);
                        }
                    } else {
                        HadithMunazatActivity.this._textSize(textView4, 16.0d);
                    }
                } else {
                    HadithMunazatActivity.this._textSize(textView4, 14.0d);
                }
            } else {
                HadithMunazatActivity.this._textSize(textView4, 12.0d);
            }
            return view;
        }
    }

   
    public class Listview_parashmaniAdapter extends BaseAdapter {
        ArrayList<HashMap<String, Object>> _data;

        public Listview_parashmaniAdapter(ArrayList<HashMap<String, Object>> arrayList) {
            this._data = arrayList;
        }

        @Override  
        public int getCount() {
            return this._data.size();
        }

        @Override  
        public HashMap<String, Object> getItem(int i) {
            return this._data.get(i);
        }

        @Override  
        public long getItemId(int i) {
            return i;
        }

        @Override  
        public View getView(final int i, View view, ViewGroup viewGroup) {
            LayoutInflater layoutInflater = (LayoutInflater) HadithMunazatActivity.this.getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            if (view == null) {
                view = layoutInflater.inflate(R.layout.parashmani_custom, (ViewGroup) null);
            }
            LinearLayout linearLayout =  view.findViewById(R.id.linear_main);
            LinearLayout linearLayout2 =  view.findViewById(R.id.linear1);
            LinearLayout linearLayout3 =  view.findViewById(R.id.linear7);
            LinearLayout linearLayout4 =  view.findViewById(R.id.linear_bar);
            LinearLayout linearLayout5 =  view.findViewById(R.id.linear3);
            LinearLayout linearLayout6 =  view.findViewById(R.id.linear2);
            ImageView imageView = (ImageView) view.findViewById(R.id.imageview_share);
            TextView textView = (TextView) view.findViewById(R.id.textview_title);
            ImageView imageView2 = (ImageView) view.findViewById(R.id.imageview_copy);
            TextView textView2 = (TextView) view.findViewById(R.id.textview_arabic);
            TextView textView3 = (TextView) view.findViewById(R.id.textview_syllable);
            LinearLayout linearLayout7 =  view.findViewById(R.id.linear_fazilath);
            TextView textView4 = (TextView) view.findViewById(R.id.textview1);
            textView.setText(this._data.get(i).get(AppMeasurementSdk.ConditionalUserProperty.NAME).toString());
            textView2.setText(this._data.get(i).get("arabic").toString());
            textView3.setText(this._data.get(i).get("syllable").toString());
            imageView.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            HadithMunazatActivity.this._click(linearLayout7);
            linearLayout7.setOnClickListener(new View.OnClickListener() { // from class: com.yeasinrabbi.girl_name.HadithMunazatActivity.Listview_parashmaniAdapter.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    HadithMunazatActivity.this._setDialogFont(HadithMunazatActivity.this.fazilath, Listview_parashmaniAdapter.this._data.get(i).get(AppMeasurementSdk.ConditionalUserProperty.NAME).toString(), Listview_parashmaniAdapter.this._data.get(i).get("fazilath").toString(), "solaimanlipi.ttf");
                    HadithMunazatActivity.this.fazilath.setPositiveButton("Right", new DialogInterface.OnClickListener() { // from class: com.yeasinrabbi.girl_name.HadithMunazatActivity.Listview_parashmaniAdapter.1.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i2) {
                        }
                    });
                    HadithMunazatActivity.this.fazilath.create().show();
                }
            });
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.yeasinrabbi.girl_name.HadithMunazatActivity.Listview_parashmaniAdapter.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    HadithMunazatActivity.this.aa = Listview_parashmaniAdapter.this._data.get(i).get(AppMeasurementSdk.ConditionalUserProperty.NAME).toString();
                    HadithMunazatActivity.this.bb = Listview_parashmaniAdapter.this._data.get(i).get("arabic").toString();
                    HadithMunazatActivity.this.cc = Listview_parashmaniAdapter.this._data.get(i).get("syllable").toString();
                    HadithMunazatActivity.this.code = HadithMunazatActivity.this.aa.concat("\n".concat(HadithMunazatActivity.this.bb.concat("\n".concat(HadithMunazatActivity.this.cc.concat("\n\n".concat("Download full App : https://play.google.com/store/apps/details?id=com.senani.wazifa"))))));
                    HadithMunazatActivity hadithMunazatActivity = HadithMunazatActivity.this;
                    HadithMunazatActivity.this.getApplicationContext();
                    ((ClipboardManager) hadithMunazatActivity.getSystemService(Context.CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", HadithMunazatActivity.this.code));
                    HadithMunazatActivity.this._createSnackBar("Copied");
                }
            });
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.yeasinrabbi.girl_name.HadithMunazatActivity.Listview_parashmaniAdapter.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    HadithMunazatActivity.this.aa = Listview_parashmaniAdapter.this._data.get(i).get(AppMeasurementSdk.ConditionalUserProperty.NAME).toString();
                    HadithMunazatActivity.this.bb = Listview_parashmaniAdapter.this._data.get(i).get("arabic").toString();
                    HadithMunazatActivity.this.cc = Listview_parashmaniAdapter.this._data.get(i).get("syllable").toString();
                    HadithMunazatActivity.this.code = HadithMunazatActivity.this.aa.concat("\n".concat(HadithMunazatActivity.this.bb.concat("\n".concat(HadithMunazatActivity.this.cc.concat("\n\n".concat("Download full App : https://play.google.com/store/apps/details?id=com.senani.wazifa"))))));
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", HadithMunazatActivity.this.code);
                    intent.putExtra("android.intent.extra.SUBJECT", "Share Content from Wazifa");
                    HadithMunazatActivity.this.startActivity(Intent.createChooser(intent, "Share text using"));
                }
            });

            if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("1")) {
                if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(ExifInterface.GPS_MEASUREMENT_2D)) {
                    if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(ExifInterface.GPS_MEASUREMENT_3D)) {
                        if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("4")) {
                            if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("5")) {
                                if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("6")) {
                                    if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("7")) {
                                        if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("8")) {
                                            if (!HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("9")) {
                                                if (HadithMunazatActivity.this.f.getString("font_arabic", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("10")) {
                                                    HadithMunazatActivity.this._textSize(textView2, 30.0d);
                                                }
                                            } else {
                                                HadithMunazatActivity.this._textSize(textView2, 28.0d);
                                            }
                                        } else {
                                            HadithMunazatActivity.this._textSize(textView2, 26.0d);
                                        }
                                    } else {
                                        HadithMunazatActivity.this._textSize(textView2, 24.0d);
                                    }
                                } else {
                                    HadithMunazatActivity.this._textSize(textView2, 22.0d);
                                }
                            } else {
                                HadithMunazatActivity.this._textSize(textView2, 20.0d);
                            }
                        } else {
                            HadithMunazatActivity.this._textSize(textView2, 18.0d);
                        }
                    } else {
                        HadithMunazatActivity.this._textSize(textView2, 16.0d);
                    }
                } else {
                    HadithMunazatActivity.this._textSize(textView2, 14.0d);
                }
            } else {
                HadithMunazatActivity.this._textSize(textView2, 12.0d);
            }
            HadithMunazatActivity.this._click(imageView);
            HadithMunazatActivity.this._click(imageView2);
            if (!HadithMunazatActivity.this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("1")) {
                if (!HadithMunazatActivity.this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(ExifInterface.GPS_MEASUREMENT_2D)) {
                    if (!HadithMunazatActivity.this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(ExifInterface.GPS_MEASUREMENT_3D)) {
                        if (!HadithMunazatActivity.this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("4")) {
                            if (!HadithMunazatActivity.this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("5")) {
                                if (!HadithMunazatActivity.this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("6")) {
                                    if (!HadithMunazatActivity.this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("7")) {
                                        if (!HadithMunazatActivity.this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("8")) {
                                            if (!HadithMunazatActivity.this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("9")) {
                                                if (HadithMunazatActivity.this.f.getString("font_syllable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("10")) {
                                                    HadithMunazatActivity.this._textSize(textView3, 30.0d);
                                                }
                                            } else {
                                                HadithMunazatActivity.this._textSize(textView3, 28.0d);
                                            }
                                        } else {
                                            HadithMunazatActivity.this._textSize(textView3, 26.0d);
                                        }
                                    } else {
                                        HadithMunazatActivity.this._textSize(textView3, 24.0d);
                                    }
                                } else {
                                    HadithMunazatActivity.this._textSize(textView3, 22.0d);
                                }
                            } else {
                                HadithMunazatActivity.this._textSize(textView3, 20.0d);
                            }
                        } else {
                            HadithMunazatActivity.this._textSize(textView3, 18.0d);
                        }
                    } else {
                        HadithMunazatActivity.this._textSize(textView3, 16.0d);
                    }
                } else {
                    HadithMunazatActivity.this._textSize(textView3, 14.0d);
                }
            } else {
                HadithMunazatActivity.this._textSize(textView3, 12.0d);
            }
            return view;
        }
    }

   
    public class Listview_ebooksAdapter extends BaseAdapter {
        ArrayList<HashMap<String, Object>> _data;

        public Listview_ebooksAdapter(ArrayList<HashMap<String, Object>> arrayList) {
            this._data = arrayList;
        }

        @Override  
        public int getCount() {
            return this._data.size();
        }

        @Override  
        public HashMap<String, Object> getItem(int i) {
            return this._data.get(i);
        }

        @Override  
        public long getItemId(int i) {
            return i;
        }

        @Override  
        public View getView(int i, View view, ViewGroup viewGroup) {
            LayoutInflater layoutInflater = (LayoutInflater) HadithMunazatActivity.this.getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            if (view == null) {
                view = layoutInflater.inflate(R.layout.book_custom, (ViewGroup) null);
            }
            LinearLayout linearLayout =  view.findViewById(R.id.linear1);
            LinearLayout linearLayout2 =  view.findViewById(R.id.linear_shape);
            LinearLayout linearLayout3 =  view.findViewById(R.id.linear4);
            ImageView imageView = (ImageView) view.findViewById(R.id.imageview2);
            ImageView imageView2 = (ImageView) view.findViewById(R.id.imageview1);
            LinearLayout linearLayout4 =  view.findViewById(R.id.linear5);
            LinearLayout linearLayout5 =  view.findViewById(R.id.linear6);
            TextView textView = (TextView) view.findViewById(R.id.tv_book_name);
            ImageView imageView3 = (ImageView) view.findViewById(R.id.imageview_writer);
            TextView textView2 = (TextView) view.findViewById(R.id.tv_writer_name);
            textView.setText(((HashMap) HadithMunazatActivity.this.map_list.get(i)).get(AppMeasurementSdk.ConditionalUserProperty.NAME).toString());
            textView2.setText(HadithMunazatActivity.this.getIntent().getStringExtra("Name"));
            HadithMunazatActivity hadithMunazatActivity = HadithMunazatActivity.this;
            hadithMunazatActivity._CardStyle( view.findViewById(R.id.linear2), 0.0d, 20.0d, HadithMunazatActivity.this.colorPrimary, false);
            HadithMunazatActivity.this._CardStyle(linearLayout, 0.0d, 0.0d, HadithMunazatActivity.this.colorPrimaryDark, false);
            textView.setTextColor(Color.parseColor(HadithMunazatActivity.this.ColorText));
            textView2.setTextColor(Color.parseColor(HadithMunazatActivity.this.ColorText));
            @SuppressLint("ResourceType") Animation loadAnimation = AnimationUtils.loadAnimation(HadithMunazatActivity.this.getApplicationContext(), 17432578);
            loadAnimation.setDuration(200L);
            linearLayout.startAnimation(loadAnimation);
            imageView2.setVisibility(View.GONE);
            imageView.setVisibility(View.VISIBLE);

            return view;
        }
    }


}
