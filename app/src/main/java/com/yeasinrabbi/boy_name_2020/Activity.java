package com.yeasinrabbi.boy_name_2020;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.yeasinrabbi.boy_name_2020.name.BoyEnglish;
import com.yeasinrabbi.boy_name_2020.name.BoyNameBorno;
import com.yeasinrabbi.boy_name_2020.name.BoyNamePorbo;
import com.yeasinrabbi.boy_name_2020.name.GirlEnglish;
import com.yeasinrabbi.boy_name_2020.name.GirlNameBorno;
import com.yeasinrabbi.boy_name_2020.name.GirlNamePorbo;
import com.yeasinrabbi.boy_name_2020.name.Name_Details;
import com.yeasinrabbi.boy_name_2020.name.NamecontentActivity;
import com.yeasinrabbi.boy_name_2020.name.OtherName;
import com.yeasinrabbi.boy_name_2020.name.PopularName;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;


public class Activity extends AppCompatActivity {




    private ListView listview_books;
    private ListView listview_quran;
    private SharedPreferences shared;

    private TextView main_titel_textivew;

    private TextView main_sub_titel_textview;



    private HashMap<String, Object> map_var = new HashMap<>();


    private HashMap<String, Object> map_var_books = new HashMap<>();
    private final ArrayList<HashMap<String, Object>> map_list = new ArrayList<>();
    private final ArrayList<HashMap<String, Object>> map_books = new ArrayList<>();
    private final Intent i = new Intent();


    private Intent intent;


    @SuppressLint("NonConstantResourceId")
    @Override
     
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.main_page);



       main_titel_textivew =   findViewById(R.id.main_titel_textivew);
       main_sub_titel_textview =   findViewById(R.id.main_sub_titel_textview);


      listview_quran = findViewById(R.id.listview_quran);
      listview_books = findViewById(R.id.listview_books);



       shared = getSharedPreferences("data", 0);


        LinearLayout tab1 = findViewById(R.id.tab1);
        LinearLayout tab2 = findViewById(R.id.tab2);
        LinearLayout tab3 = findViewById(R.id.tab3);
        LinearLayout tab4 = findViewById(R.id.tab4);
        LinearLayout tab5 = findViewById(R.id.tab5);
        LinearLayout tab6 = findViewById(R.id.tab6);

        LinearLayout layout_tab1 = findViewById(R.id.layout_tab1);
        LinearLayout layout_tab2 = findViewById(R.id.layout_tab2);
        LinearLayout layout_tab3 = findViewById(R.id.layout_tab3);
        LinearLayout layout_tab4 = findViewById(R.id.layout_tab4);
        LinearLayout layout_tab5 = findViewById(R.id.layout_tab5);
        LinearLayout layout_tab6 = findViewById(R.id.layout_tab6);


        tab1.setOnClickListener(v -> {

            tab1.setBackgroundResource(R.drawable.tab_background);
            tab2.setBackgroundColor(getColor(R.color.color_primary));
            tab3.setBackgroundColor(getColor(R.color.color_primary));
            tab4.setBackgroundColor(getColor(R.color.color_primary));
            tab5.setBackgroundColor(getColor(R.color.color_primary));
            tab6.setBackgroundColor(getColor(R.color.color_primary));


            layout_tab1.setVisibility(View.VISIBLE);
            layout_tab2.setVisibility(View.GONE);
            layout_tab3.setVisibility(View.GONE);
            layout_tab4.setVisibility(View.GONE);
            layout_tab5.setVisibility(View.GONE);
            layout_tab6.setVisibility(View.GONE);


        });


        tab2.setOnClickListener(v -> {


            tab2.setBackgroundResource(R.drawable.tab_background);
            tab1.setBackgroundColor(getColor(R.color.color_primary));
            tab3.setBackgroundColor(getColor(R.color.color_primary));
            tab4.setBackgroundColor(getColor(R.color.color_primary));
            tab5.setBackgroundColor(getColor(R.color.color_primary));
            tab6.setBackgroundColor(getColor(R.color.color_primary));


            layout_tab1.setVisibility(View.GONE);
            layout_tab2.setVisibility(View.VISIBLE);
            layout_tab3.setVisibility(View.GONE);
            layout_tab4.setVisibility(View.GONE);
            layout_tab5.setVisibility(View.GONE);
           layout_tab6.setVisibility(View.GONE);


        });


        tab3.setOnClickListener(v -> {
            tab3.setBackgroundResource(R.drawable.tab_background);

            tab1.setBackgroundColor(getColor(R.color.color_primary));
            tab2.setBackgroundColor(getColor(R.color.color_primary));
            tab4.setBackgroundColor(getColor(R.color.color_primary));
            tab5.setBackgroundColor(getColor(R.color.color_primary));
           tab6.setBackgroundColor(getColor(R.color.color_primary));


            layout_tab1.setVisibility(View.GONE);
            layout_tab2.setVisibility(View.GONE);
            layout_tab3.setVisibility(View.VISIBLE);
            layout_tab4.setVisibility(View.GONE);
            layout_tab5.setVisibility(View.GONE);
            layout_tab6.setVisibility(View.GONE);


        });


        tab4.setOnClickListener(v -> {
            tab4.setBackgroundResource(R.drawable.tab_background);

            tab1.setBackgroundColor(getColor(R.color.color_primary));
            tab2.setBackgroundColor(getColor(R.color.color_primary));
            tab3.setBackgroundColor(getColor(R.color.color_primary));
            tab5.setBackgroundColor(getColor(R.color.color_primary));
            tab6.setBackgroundColor(getColor(R.color.color_primary));


            layout_tab1.setVisibility(View.GONE);
            layout_tab2.setVisibility(View.GONE);
            layout_tab3.setVisibility(View.GONE);
            layout_tab4.setVisibility(View.VISIBLE);
            layout_tab5.setVisibility(View.GONE);
            layout_tab6.setVisibility(View.GONE);


        });


        tab5.setOnClickListener(v -> {

            tab5.setBackgroundResource(R.drawable.tab_background);

            tab1.setBackgroundColor(getColor(R.color.color_primary));
            tab3.setBackgroundColor(getColor(R.color.color_primary));
            tab4.setBackgroundColor(getColor(R.color.color_primary));
            tab2.setBackgroundColor(getColor(R.color.color_primary));
            tab6.setBackgroundColor(getColor(R.color.color_primary));

            layout_tab1.setVisibility(View.GONE);
            layout_tab2.setVisibility(View.GONE);
            layout_tab3.setVisibility(View.GONE);
            layout_tab4.setVisibility(View.GONE);
            layout_tab5.setVisibility(View.VISIBLE);
            layout_tab6.setVisibility(View.GONE);

            main_titel_textivew.setText("আল কুরআন (আমপারা)");
            main_sub_titel_textview.setText("মোট সূরা : ৩৮ টি");


            _Split_Tab_1();

        });


        tab6.setOnClickListener(v -> {

            tab1.setBackgroundColor(getColor(R.color.color_primary));
            tab2.setBackgroundColor(getColor(R.color.color_primary));
            tab3.setBackgroundColor(getColor(R.color.color_primary));
            tab4.setBackgroundColor(getColor(R.color.color_primary));
            tab5.setBackgroundColor(getColor(R.color.color_primary));
            tab6.setBackgroundResource(R.drawable.tab_background);


            layout_tab1.setVisibility(View.GONE);
            layout_tab2.setVisibility(View.GONE);
            layout_tab3.setVisibility(View.GONE);
            layout_tab4.setVisibility(View.GONE);
            layout_tab5.setVisibility(View.GONE);
            layout_tab6.setVisibility(View.VISIBLE);

            main_titel_textivew.setText("দ্বীনি গ্রন্থশালা");
            main_sub_titel_textview.setText("পড়ুন, জানুন এবং অন্যকে জানান");


            _Split_Books_1();

        });


        LinearLayout main_layout = findViewById(R.id.main_layout);
        LinearLayout layout_settings = findViewById(R.id.layout_settings);
        LinearLayout layout_history = findViewById(R.id.layout_history);
        LinearLayout layout_favorite = findViewById(R.id.layout_favorite);




        LinearLayout linear_tab_1 = findViewById(R.id.linear_tab_1);
        LinearLayout linear_tab_2 = findViewById(R.id.linear_tab_2);
        LinearLayout linear_tab_3 = findViewById(R.id.linear_tab_3);
        LinearLayout linear_tab_4 = findViewById(R.id.linear_tab_4);
        LinearLayout linear_tab_5 = findViewById(R.id.linear_tab_5);
        LinearLayout linear_tab_6 = findViewById(R.id.linear_tab_6);
        LinearLayout linear_tab_7 = findViewById(R.id.linear_tab_7);
        LinearLayout linear_tab_8 = findViewById(R.id.linear_tab_8);
        LinearLayout linear_tab_9 = findViewById(R.id.linear_tab_9);
        LinearLayout linear_tab_10 = findViewById(R.id.linear_tab_10);
        LinearLayout linear_tab_11 = findViewById(R.id.linear_tab_11);
        LinearLayout linear_tab_12 = findViewById(R.id.linear_tab_12);


        linear_tab_1.setOnClickListener(v -> startActivity(new Intent(Activity.this, GirlNamePorbo.class)));
        linear_tab_2.setOnClickListener(v -> startActivity(new Intent(Activity.this, BoyNamePorbo.class)));
        linear_tab_3.setOnClickListener(v -> startActivity(new Intent(Activity.this, GirlNameBorno.class)));
        linear_tab_4.setOnClickListener(v -> startActivity(new Intent(Activity.this, BoyNameBorno.class)));
        linear_tab_5.setOnClickListener(v -> startActivity(new Intent(Activity.this, Name_Details.class)));
        linear_tab_6.setOnClickListener(v -> {
                    Intent intent = new Intent(Activity.this, NamecontentActivity.class);
                    intent.putExtra("name", "allah99name");
                    startActivity(intent);
                }
        );
        linear_tab_7.setOnClickListener(v -> startActivity(new Intent(Activity.this, GirlEnglish.class)));
        linear_tab_8.setOnClickListener(v -> startActivity(new Intent(Activity.this, BoyEnglish.class)));
        linear_tab_9.setOnClickListener(v ->
                {

                    Intent intent = new Intent(Activity.this, NamecontentActivity.class);
                    intent.putExtra("name", "boy418name");
                    startActivity(intent);


                }
        );
        linear_tab_10.setOnClickListener(v -> startActivity(new Intent(Activity.this, OtherName.class)));
        linear_tab_11.setOnClickListener(v -> startActivity(new Intent(Activity.this, PopularName.class)));
        linear_tab_12.setOnClickListener(v -> {
                    Intent intent = new Intent(Activity.this, NamecontentActivity.class);
                    intent.putExtra("name", "digitalname");
                    startActivity(intent);
                }

        );


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);


        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.home:


                    main_layout.setVisibility(View.VISIBLE);
                    layout_settings.setVisibility(View.GONE);
                    layout_history.setVisibility(View.GONE);
                    layout_favorite.setVisibility(View.GONE);


                    return true;


                case R.id.histoy:

                    main_layout.setVisibility(View.GONE);
                    layout_settings.setVisibility(View.GONE);
                    layout_history.setVisibility(View.VISIBLE);
                    layout_favorite.setVisibility(View.GONE);


                    return true;

                case R.id.bookmark:


                    main_layout.setVisibility(View.GONE);
                    layout_settings.setVisibility(View.GONE);
                    layout_history.setVisibility(View.GONE);
                    layout_favorite.setVisibility(View.VISIBLE);


                    return true;
                case R.id.Settings:


                    main_layout.setVisibility(View.GONE);
                    layout_settings.setVisibility(View.VISIBLE);
                    layout_history.setVisibility(View.GONE);
                    layout_favorite.setVisibility(View.GONE);


                    return true;
            }

            return false;
        });


        LinearLayout linear_splits_1 = findViewById(R.id.linear_splits_1);
        LinearLayout linear_splits_2 = findViewById(R.id.linear_splits_2);


        LinearLayout linear_split_books_1 = findViewById(R.id.linear_split_books_1);
        LinearLayout linear_split_books_2 = findViewById(R.id.linear_split_books_2);


        this.listview_quran.setOnItemClickListener((adapterView, view, i, j) -> {
            if (Activity.this.shared.getString("split_tab", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("split_tab_2")) {
                Activity.this.i.putExtra("title", Objects.requireNonNull(((HashMap<?, ?>) Activity.this.map_list.get(i)).get("m")).toString());
                Activity.this.i.setClass(Activity.this.getApplicationContext(), ContentActivity.class);
                Activity.this.startActivity(Activity.this.i);
                return;
            }
            Activity.this.i.putExtra("surah_sequence", Objects.requireNonNull(((HashMap<?, ?>) Activity.this.map_list.get(i)).get("n")).toString());
            Activity.this.i.putExtra("name_bangla", Objects.requireNonNull(((HashMap<?, ?>) Activity.this.map_list.get(i)).get("m")).toString());
            Activity.this.i.putExtra("verses", Objects.requireNonNull(((HashMap<?, ?>) Activity.this.map_list.get(i)).get("o")).toString());
            Activity.this.i.putExtra("name_arabic", Objects.requireNonNull(((HashMap<?, ?>) Activity.this.map_list.get(i)).get("p")).toString());
            Activity.this.i.setClass(Activity.this.getApplicationContext(), QuranViewActivity.class);
            Activity.this.startActivity(Activity.this.i);
        });

        linear_splits_1.setOnClickListener(view -> {
            Activity.this.shared.edit().putString("split_tab", "split_tab_1").apply();
            Activity.this._Split_Tab_1();
        });

        linear_splits_2.setOnClickListener(view -> {
            Activity.this.shared.edit().putString("split_tab", "split_tab_2").apply();
            Activity.this._Split_Tab_2();
        });

        this.listview_books.setOnItemClickListener((adapterView, view, i, j) -> {
            if (!Activity.this.shared.getString("split_books", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals("split_books_2")) {
                Activity.this.i.putExtra("serial", Objects.requireNonNull(((HashMap<?, ?>) Activity.this.map_books.get(i)).get("serial")).toString());
                Activity.this.i.putExtra(AppMeasurementSdk.ConditionalUserProperty.NAME, Objects.requireNonNull(((HashMap<?, ?>) Activity.this.map_books.get(i)).get(AppMeasurementSdk.ConditionalUserProperty.NAME)).toString());
                Activity.this.i.putExtra("writer", Objects.requireNonNull(((HashMap<?, ?>) Activity.this.map_books.get(i)).get("writer")).toString());
                Activity.this.i.setClass(Activity.this.getApplicationContext(), BookViewActivity.class);
                Activity.this.startActivity(Activity.this.i);
                return;
            }
            Activity.this.i.putExtra("Title", "ইবুক");
            Activity.this.i.putExtra("Name", Objects.requireNonNull(((HashMap<?, ?>) Activity.this.map_books.get(i)).get(AppMeasurementSdk.ConditionalUserProperty.NAME)).toString());
            Activity.this.i.setClass(Activity.this.getApplicationContext(), HadithMunazatActivity.class);
            Activity.this.startActivity(Activity.this.i);
        });
        linear_split_books_1.setOnClickListener(view -> {
            Activity.this.shared.edit().putString("split_books", "split_books_1").apply();
            Activity.this._Split_Books_1();
        });

        linear_split_books_2.setOnClickListener(view -> {
            Activity.this.shared.edit().putString("split_books", "split_books_2").apply();
            Activity.this._Split_Books_2();
        });


        LinearLayout linear_dowa_1 = findViewById(R.id.linear_dowa_1);
        LinearLayout linear_dowa_2 = findViewById(R.id.linear_dowa_2);
        LinearLayout linear_dowa_3 = findViewById(R.id.linear_dowa_3);
        LinearLayout linear_dowa_4 = findViewById(R.id.linear_dowa_4);
        LinearLayout linear_dowa_5 = findViewById(R.id.linear_dowa_5);
        LinearLayout linear_dowa_6 = findViewById(R.id.linear_dowa_6);
        LinearLayout linear_dowa_7 = findViewById(R.id.linear_dowa_7);
        LinearLayout linear_dowa_8 = findViewById(R.id.linear_dowa_8);
        LinearLayout linear_dowa_9 = findViewById(R.id.linear_dowa_9);
        LinearLayout linear_dowa_10 = findViewById(R.id.linear_dowa_10);
        LinearLayout linear_dowa_11 = findViewById(R.id.linear_dowa_11);
        LinearLayout linear_dowa_12 = findViewById(R.id.linear_dowa_12);


        LinearLayout linear_dorodh_1 = findViewById(R.id.linear_dorodh_1);
        LinearLayout linear_dorodh_2 = findViewById(R.id.linear_dorodh_2);
        LinearLayout linear_dorodh_3 = findViewById(R.id.linear_dorodh_3);
        LinearLayout linear_dorodh_4 = findViewById(R.id.linear_dorodh_4);
        LinearLayout linear_dorodh_5 = findViewById(R.id.linear_dorodh_5);
        LinearLayout linear_dorodh_6 = findViewById(R.id.linear_dorodh_6);
        LinearLayout linear_dorodh_7 = findViewById(R.id.linear_dorodh_7);
        LinearLayout linear_dorodh_8 = findViewById(R.id.linear_dorodh_8);
        LinearLayout linear_dorodh_9 = findViewById(R.id.linear_dorodh_9);
        LinearLayout linear_dorodh_10 = findViewById(R.id.linear_dorodh_10);
        LinearLayout linear_dorodh_11 = findViewById(R.id.linear_dorodh_11);
        LinearLayout linear_dorodh_12 = findViewById(R.id.linear_dorodh_12);
        LinearLayout linear_dorodh_13 = findViewById(R.id.linear_dorodh_13);
        LinearLayout linear_dorodh_14 = findViewById(R.id.linear_dorodh_14);
        LinearLayout linear_dorodh_15 = findViewById(R.id.linear_dorodh_15);


        TextView textview_dowa_1 = findViewById(R.id.textview_dowa_1);
        TextView textview_dowa_2 = findViewById(R.id.textview_dowa_2);
        TextView textview_dowa_3 = findViewById(R.id.textview_dowa_3);
        TextView textview_dowa_4 = findViewById(R.id.textview_dowa_4);
        TextView textview_dowa_5 = findViewById(R.id.textview_dowa_5);
        TextView textview_dowa_6 = findViewById(R.id.textview_dowa_6);
        TextView textview_dowa_7 = findViewById(R.id.textview_dowa_7);
        TextView textview_dowa_8 = findViewById(R.id.textview_dowa_8);
        TextView textview_dowa_9 = findViewById(R.id.textview_dowa_9);
        TextView textview_dowa_10 = findViewById(R.id.textview_dowa_10);
        TextView textview_dowa_11 = findViewById(R.id.textview_dowa_11);
        TextView textview_dowa_12 = findViewById(R.id.textview_dowa_12);


        TextView textview_dorodh_1 = findViewById(R.id.textview_dorodh_1);
        TextView textview_dorodh_2 = findViewById(R.id.textview_dorodh_2);
        TextView textview_dorodh_3 = findViewById(R.id.textview_dorodh_3);
        TextView textview_dorodh_5 = findViewById(R.id.textview_dorodh_5);
        TextView textview_dorodh_6 = findViewById(R.id.textview_dorodh_6);
        TextView textview_dorodh_7 = findViewById(R.id.textview_dorodh_7);
        TextView textview_dorodh_8 = findViewById(R.id.textview_dorodh_8);
        TextView textview_dorodh_9 = findViewById(R.id.textview_dorodh_9);
        TextView textview_dorodh_10 = findViewById(R.id.textview_dorodh_10);
        TextView textview_dorodh_11 = findViewById(R.id.textview_dorodh_11);
        TextView textview_dorodh_12 = findViewById(R.id.textview_dorodh_12);
        TextView textview_dorodh_13 = findViewById(R.id.textview_dorodh_13);
        TextView textview_dorodh_14 = findViewById(R.id.textview_dorodh_14);
        TextView textview_dorodh_15 = findViewById(R.id.textview_dorodh_15);


        intent = new Intent(Activity.this, ContentListActivity.class);

        linear_dowa_1.setOnClickListener(view -> {



            intent.putExtra("Topic", "দোআ");
            intent.putExtra("Title", textview_dowa_1.getText().toString());
            intent.setClass(getApplicationContext(), ContentListActivity.class);
            startActivity(intent);

        });

        linear_dowa_2.setOnClickListener(view -> {
            intent.putExtra("Topic", "দোআ");
            intent.putExtra("Title", textview_dowa_2.getText().toString());
            intent.setClass(getApplicationContext(), ContentListActivity.class);
            startActivity(intent);
        });

        linear_dowa_3.setOnClickListener(view -> {
            intent.putExtra("Topic", "দোআ");
            intent.putExtra("Title", textview_dowa_3.getText().toString());
            intent.setClass(getApplicationContext(), ContentListActivity.class);
            startActivity(intent);
        });

        linear_dowa_4.setOnClickListener(view -> {
            intent.putExtra("Topic", "দোআ");
            intent.putExtra("Title", textview_dowa_4.getText().toString());
            intent.setClass(getApplicationContext(), ContentListActivity.class);
            startActivity(intent);
        });

        linear_dowa_5.setOnClickListener(view -> {
            intent.putExtra("Topic", "দোআ");
            intent.putExtra("Title", textview_dowa_5.getText().toString());
            intent.setClass(getApplicationContext(), ContentListActivity.class);
            startActivity(intent);
        });

        linear_dowa_6.setOnClickListener(view -> {
            intent.putExtra("Topic", "দোআ");
            intent.putExtra("Title", textview_dowa_6.getText().toString());
            intent.setClass(getApplicationContext(), ContentListActivity.class);
            startActivity(intent);
        });

        linear_dowa_7.setOnClickListener(view -> {
            intent.putExtra("Topic", "দোআ");
            intent.putExtra("Title", textview_dowa_7.getText().toString());
            intent.setClass(getApplicationContext(), ContentListActivity.class);
            startActivity(intent);
        });

        linear_dowa_8.setOnClickListener(view -> {
            intent.putExtra("Topic", "দোআ");
            intent.putExtra("Title", textview_dowa_8.getText().toString());
            intent.setClass(getApplicationContext(), ContentListActivity.class);
            startActivity(intent);
        });

        linear_dowa_9.setOnClickListener(view -> {
            intent.putExtra("Topic", "দোআ");
            intent.putExtra("Title", textview_dowa_9.getText().toString());
            intent.setClass(getApplicationContext(), ContentListActivity.class);
            startActivity(intent);
        });

        linear_dowa_10.setOnClickListener(view -> {
            intent.putExtra("Topic", "দোআ");
            intent.putExtra("Title", textview_dowa_10.getText().toString());
            intent.setClass(getApplicationContext(), ContentListActivity.class);
            startActivity(intent);
        });

        linear_dowa_11.setOnClickListener(view -> {
            intent.putExtra("Topic", "দোআ");
            intent.putExtra("Title", textview_dowa_11.getText().toString());
            intent.setClass(getApplicationContext(), ContentListActivity.class);
            startActivity(intent);
        });

        linear_dowa_12.setOnClickListener(view -> {
            intent.putExtra("Topic", "দোআ");
            intent.putExtra("Title", textview_dowa_12.getText().toString());
            intent.setClass(getApplicationContext(), ContentListActivity.class);
            startActivity(intent);
        });


        linear_dorodh_1.setOnClickListener(view -> {


            Intent dorodh_intent = new Intent();
            dorodh_intent.putExtra("Topic", "দরূদ");
            dorodh_intent.putExtra("Title", textview_dorodh_1.getText().toString());
            dorodh_intent.setClass(Activity.this.getApplicationContext(), ContentListActivity.class);
            startActivity(dorodh_intent);


        });


        linear_dorodh_2.setOnClickListener(view -> {

            Intent dorodh_intent = new Intent();
            dorodh_intent.putExtra("Topic", "দরূদ");
            dorodh_intent.putExtra("title", textview_dorodh_2.getText().toString());
            dorodh_intent.setClass(Activity.this.getApplicationContext(), ContentActivity.class);
            startActivity(dorodh_intent);

        });


        linear_dorodh_3.setOnClickListener(view -> {
            Intent dorodh_intent = new Intent();
            dorodh_intent.putExtra("Topic", "দরূদ");
            dorodh_intent.putExtra("title", textview_dorodh_3.getText().toString());
            dorodh_intent.setClass(Activity.this.getApplicationContext(), ContentActivity.class);
            startActivity(dorodh_intent);
        });

        linear_dorodh_4.setOnClickListener(view -> {
            Intent dorodh_intent = new Intent();
            dorodh_intent.putExtra("Topic", "দরূদ");
            dorodh_intent.putExtra("title", "দরুদ-ই হাজারী");
            dorodh_intent.setClass(Activity.this.getApplicationContext(), ContentActivity.class);
            startActivity(dorodh_intent);
        });


        linear_dorodh_5.setOnClickListener(view -> {
            Intent dorodh_intent = new Intent();
            dorodh_intent.putExtra("Topic", "দরূদ");
            dorodh_intent.putExtra("title", textview_dorodh_5.getText().toString());
            dorodh_intent.setClass(Activity.this.getApplicationContext(), ContentActivity.class);
            startActivity(dorodh_intent);
        });


        linear_dorodh_6.setOnClickListener(view -> {
            Intent dorodh_intent = new Intent();
            dorodh_intent.putExtra("Topic", "দরূদ");
            dorodh_intent.putExtra("title", textview_dorodh_6.getText().toString());
            dorodh_intent.setClass(Activity.this.getApplicationContext(), ContentActivity.class);
            startActivity(dorodh_intent);
        });

        linear_dorodh_7.setOnClickListener(view -> {
            Intent dorodh_intent = new Intent();
            dorodh_intent.putExtra("Topic", "দরূদ");
            dorodh_intent.putExtra("title", textview_dorodh_7.getText().toString());
            dorodh_intent.setClass(Activity.this.getApplicationContext(), ContentActivity.class);
            startActivity(dorodh_intent);
        });

        linear_dorodh_8.setOnClickListener(view -> {
            Intent dorodh_intent = new Intent();
            dorodh_intent.putExtra("Topic", "দরূদ");
            dorodh_intent.putExtra("title", textview_dorodh_8.getText().toString());
            dorodh_intent.setClass(Activity.this.getApplicationContext(), ContentActivity.class);
            startActivity(dorodh_intent);
        });

        linear_dorodh_9.setOnClickListener(view -> {
            Intent dorodh_intent = new Intent();
            dorodh_intent.putExtra("Topic", "দরূদ");
            dorodh_intent.putExtra("title", textview_dorodh_9.getText().toString());
            dorodh_intent.setClass(Activity.this.getApplicationContext(), ContentActivity.class);
            startActivity(dorodh_intent);
        });

        linear_dorodh_10.setOnClickListener(view -> {
            Intent dorodh_intent = new Intent();
            dorodh_intent.putExtra("Topic", "দরূদ");
            dorodh_intent.putExtra("title", textview_dorodh_10.getText().toString());
            dorodh_intent.setClass(Activity.this.getApplicationContext(), ContentActivity.class);
            startActivity(dorodh_intent);
        });

        linear_dorodh_11.setOnClickListener(view -> {
            Intent dorodh_intent = new Intent();
            dorodh_intent.putExtra("Topic", "দরূদ");
            dorodh_intent.putExtra("title", textview_dorodh_11.getText().toString());
            dorodh_intent.setClass(Activity.this.getApplicationContext(), ContentActivity.class);
            startActivity(dorodh_intent);
        });

        linear_dorodh_12.setOnClickListener(view -> {
            Intent dorodh_intent = new Intent();
            dorodh_intent.putExtra("Topic", "দরূদ");
            dorodh_intent.putExtra("title", textview_dorodh_12.getText().toString());
            dorodh_intent.setClass(Activity.this.getApplicationContext(), ContentActivity.class);
            startActivity(dorodh_intent);
        });

        linear_dorodh_13.setOnClickListener(view -> {
            Intent dorodh_intent = new Intent();
            dorodh_intent.putExtra("Topic", "দরূদ");
            dorodh_intent.putExtra("title", textview_dorodh_13.getText().toString());
            dorodh_intent.setClass(Activity.this.getApplicationContext(), ContentActivity.class);
            startActivity(dorodh_intent);
        });

        linear_dorodh_14.setOnClickListener(view -> {
            Intent dorodh_intent = new Intent();
            dorodh_intent.putExtra("Topic", "দরূদ");
            dorodh_intent.putExtra("title", textview_dorodh_14.getText().toString());
            dorodh_intent.setClass(Activity.this.getApplicationContext(), ContentActivity.class);
            startActivity(dorodh_intent);
        });

        linear_dorodh_15.setOnClickListener(view -> {
            Intent dorodh_intent = new Intent();
            dorodh_intent.putExtra("Topic", "দরূদ");
            dorodh_intent.putExtra("title", textview_dorodh_15.getText().toString());
            dorodh_intent.setClass(Activity.this.getApplicationContext(), ContentActivity.class);
            startActivity(dorodh_intent);
        });



        LinearLayout linear_onnanno_1 = findViewById(R.id.linear_onnanno_1);
        LinearLayout linear_onnanno_2 = findViewById(R.id.linear_onnanno_2);
        LinearLayout linear_onnanno_3 = findViewById(R.id.linear_onnanno_3);
        LinearLayout linear_onnanno_4 = findViewById(R.id.linear_onnanno_4);
        LinearLayout linear_onnanno_5 = findViewById(R.id.linear_onnanno_5);
        LinearLayout linear_onnanno_6 = findViewById(R.id.linear_onnanno_6);
        LinearLayout linear_onnanno_7 = findViewById(R.id.linear_onnanno_7);
        LinearLayout linear_onnanno_8 = findViewById(R.id.linear_onnanno_8);
        LinearLayout linear_onnanno_9 = findViewById(R.id.linear_onnanno_9);
        LinearLayout linear_onnanno_10 = findViewById(R.id.linear_onnanno_10);
        LinearLayout linear_onnanno_11 = findViewById(R.id.linear_onnanno_11);
        LinearLayout linear_onnanno_12 = findViewById(R.id.linear_onnanno_12);
        LinearLayout linear_onnanno_14 = findViewById(R.id.linear_onnanno_14);
        LinearLayout linear_onnanno_15 = findViewById(R.id.linear_onnanno_15);
        LinearLayout linear_onnanno_16 = findViewById(R.id.linear_onnanno_16);
        LinearLayout linear_onnanno_17 = findViewById(R.id.linear_onnanno_17);
        LinearLayout linear_onnanno_18 = findViewById(R.id.linear_onnanno_18);
        LinearLayout linear_onnanno_19 = findViewById(R.id.linear_onnanno_19);
        LinearLayout linear_onnanno_20 = findViewById(R.id.linear_onnanno_20);
        LinearLayout linear_onnanno_21 = findViewById(R.id.linear_onnanno_21);


        TextView textview_onnanno_1 = findViewById(R.id.textview_onnanno_1);
        TextView textview_onnanno_2 = findViewById(R.id.textview_onnanno_2);
        TextView textview_onnanno_3 = findViewById(R.id.textview_onnanno_3);
        TextView textview_onnanno_4 = findViewById(R.id.textview_onnanno_4);
        TextView textview_onnanno_5 = findViewById(R.id.textview_onnanno_5);
        TextView textview_onnanno_6 = findViewById(R.id.textview_onnanno_6);
        TextView textview_onnanno_7 = findViewById(R.id.textview_onnanno_7);
        TextView textview_onnanno_8 = findViewById(R.id.textview_onnanno_8);
        TextView textview_onnanno_9 = findViewById(R.id.textview_onnanno_9);
        TextView textview_onnanno_10 = findViewById(R.id.textview_onnanno_10);
        TextView textview_onnanno_11 = findViewById(R.id.textview_onnanno_11);
        TextView textview_onnanno_12 = findViewById(R.id.textview_onnanno_12);
        TextView textview_onnanno_14 = findViewById(R.id.textview_onnanno_14);
        TextView textview_onnanno_15 = findViewById(R.id.textview_onnanno_15);
        TextView textview_onnanno_16 = findViewById(R.id.textview_onnanno_16);
        TextView textview_onnanno_17 = findViewById(R.id.textview_onnanno_17);
        TextView textview_onnanno_18 = findViewById(R.id.textview_onnanno_18);
        TextView textview_onnanno_19 = findViewById(R.id.textview_onnanno_19);
        TextView textview_onnanno_20 = findViewById(R.id.textview_onnanno_20);


        Intent i = new Intent();

        linear_onnanno_1.setOnClickListener(view -> {
            i.putExtra("Topic", "দরূদ");
            i.putExtra("Title", textview_onnanno_1.getText().toString());
            i.setClass(getApplicationContext(), ContentListActivity.class);
            startActivity(i);
        });

        linear_onnanno_2.setOnClickListener(view -> {
            i.putExtra("Topic", "অন্যান্য");
            i.putExtra("Title", textview_onnanno_2.getText().toString());
            i.setClass(getApplicationContext(), HadithMunazatActivity.class);
            startActivity(i);
        });

        linear_onnanno_3.setOnClickListener(view -> {
            i.putExtra("Topic", "অন্যান্য");
            i.putExtra("Title", textview_onnanno_3.getText().toString());
            i.setClass(getApplicationContext(), HadithMunazatActivity.class);
            startActivity(i);
        });

        linear_onnanno_4.setOnClickListener(view -> {
            i.putExtra("Topic", "অন্যান্য");
            i.putExtra("Title", textview_onnanno_4.getText().toString());
            i.setClass(getApplicationContext(), ContentListActivity.class);
            startActivity(i);
        });

        linear_onnanno_5.setOnClickListener(view -> {
            i.putExtra("Topic", "অন্যান্য");
            i.putExtra("Title", textview_onnanno_5.getText().toString());
            i.setClass(getApplicationContext(), HadithMunazatActivity.class);
            startActivity(i);
        });

        linear_onnanno_6.setOnClickListener(view -> {
            i.putExtra("Topic", "অন্যান্য");
            i.putExtra("Title", textview_onnanno_6.getText().toString());
            i.setClass(getApplicationContext(), HadithMunazatActivity.class);
            startActivity(i);
        });

        linear_onnanno_7.setOnClickListener(view -> {
            i.putExtra("Topic", "অন্যান্য");
            i.putExtra("title", textview_onnanno_7.getText().toString());
            i.setClass(getApplicationContext(), ContentActivity.class);
            startActivity(i);
        });

        linear_onnanno_8.setOnClickListener(view -> {
            i.putExtra("Topic", "অন্যান্য");
            i.putExtra("title", textview_onnanno_8.getText().toString());
            i.setClass(getApplicationContext(), ContentActivity.class);
            startActivity(i);
        });

        linear_onnanno_9.setOnClickListener(view -> {
            i.putExtra("Topic", "দরূদ");
            i.putExtra("Title", textview_onnanno_9.getText().toString());
            i.setClass(getApplicationContext(), ContentListActivity.class);
            startActivity(i);
        });

        linear_onnanno_10.setOnClickListener(view -> {
            i.putExtra("Topic", "অন্যান্য");
            i.putExtra("Title", textview_onnanno_10.getText().toString());
            i.setClass(getApplicationContext(), HadithMunazatActivity.class);
            startActivity(i);
        });

        linear_onnanno_11.setOnClickListener(view -> {
            i.putExtra("Topic", "অন্যান্য");
            i.putExtra("title", textview_onnanno_11.getText().toString());
            i.setClass(getApplicationContext(), ContentActivity.class);
            startActivity(i);
        });

        linear_onnanno_12.setOnClickListener(view -> {
            i.putExtra("Topic", "অন্যান্য");
            i.putExtra("Title", textview_onnanno_12.getText().toString());
            i.setClass(getApplicationContext(), HadithMunazatActivity.class);
            startActivity(i);
        });
        linear_onnanno_14.setOnClickListener(view -> {
            i.putExtra("Topic", "অন্যান্য");
            i.putExtra("title", textview_onnanno_14.getText().toString());
            i.setClass(getApplicationContext(), ContentActivity.class);
            startActivity(i);
        });

        linear_onnanno_15.setOnClickListener(view -> {
            i.putExtra("Topic", "অন্যান্য");
            i.putExtra("Title", textview_onnanno_15.getText().toString());
            i.setClass(getApplicationContext(), ContentListActivity.class);
            startActivity(i);
        });

        linear_onnanno_16.setOnClickListener(view -> {
            i.putExtra("Topic", "অন্যান্য");
            i.putExtra("title", textview_onnanno_16.getText().toString());
            i.setClass(getApplicationContext(), ContentActivity.class);
            startActivity(i);
        });

        linear_onnanno_17.setOnClickListener(view -> {
            i.putExtra("Topic", "অন্যান্য");
            i.putExtra("title", textview_onnanno_17.getText().toString());
            i.setClass(getApplicationContext(), ContentActivity.class);
            startActivity(i);
        });

        linear_onnanno_18.setOnClickListener(view -> {
            i.putExtra("Topic", "অন্যান্য");
            i.putExtra("title", textview_onnanno_18.getText().toString());
            i.setClass(getApplicationContext(), ContentActivity.class);
            startActivity(i);
        });

        linear_onnanno_19.setOnClickListener(view -> {
            i.putExtra("Topic", "অন্যান্য");
            i.putExtra("title", textview_onnanno_19.getText().toString());
            i.setClass(getApplicationContext(), ContentActivity.class);
            startActivity(i);
        });

        linear_onnanno_20.setOnClickListener(view -> {
            i.putExtra("Topic", "অন্যান্য");
            i.putExtra("title", textview_onnanno_20.getText().toString());
            i.setClass(getApplicationContext(), ContentActivity.class);
            startActivity(i);
        });

        linear_onnanno_21.setOnClickListener(view -> {
            i.putExtra("Topic", "অন্যান্য");
            i.putExtra("Title", "নূর পরশমনি");
            i.setClass(getApplicationContext(), HadithMunazatActivity.class);
            startActivity(i);
        });


        this.shared.edit().putString("tab", "1").apply();
        this.shared.edit().putString("split_tab", "split_tab_1").apply();
        this.shared.edit().putString("split_books", "split_books_1").apply();



        this.map_var = new HashMap<>();
        this.map_var.put("n", "১");
        this.map_var.put("m", "আল-ফাতিহা");
        this.map_var.put("o", "আয়াত - ৭, মাক্কী");
        this.map_var.put("p", "الفاتحة");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৭৮");
        this.map_var.put("m", "আন-নাবা");
        this.map_var.put("o", "আয়াত - ৪০, মাক্কী");
        this.map_var.put("p", "النّبا");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৭৯");
        this.map_var.put("m", "আন-নাযি'আত");
        this.map_var.put("o", "আয়াত - ৪৬, মাক্কী");
        this.map_var.put("p", "النّزعت");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৮০");
        this.map_var.put("m", "আবাসা");
        this.map_var.put("o", "আয়াত - ৪২, মাক্কী");
        this.map_var.put("p", "عبس");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৮১");
        this.map_var.put("m", "আত-তাকভীর");
        this.map_var.put("o", "আয়াত - ২৯, মাক্কী");
        this.map_var.put("p", "التّكوير");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৮২");
        this.map_var.put("m", "আল-ইনফিতার");
        this.map_var.put("o", "আয়াত - ১৯, মাক্কী");
        this.map_var.put("p", "الانفطار");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৮৩");
        this.map_var.put("m", "আল-মুতাফফিফীন");
        this.map_var.put("o", "আয়াত - ৩৬, মাক্কী");
        this.map_var.put("p", "المطفّفين");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৮৪");
        this.map_var.put("m", "আল-ইনশিক্বাক্ব");
        this.map_var.put("o", "আয়াত - ২৫, মাক্কী");
        this.map_var.put("p", "الانشقاق");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৮৫");
        this.map_var.put("m", "আল-বুরুজ");
        this.map_var.put("o", "আয়াত - ২২, মাক্কী");
        this.map_var.put("p", "البروج");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৮৬");
        this.map_var.put("m", "আত-তারিক্ব");
        this.map_var.put("o", "আয়াত - ১৭, মাক্কী");
        this.map_var.put("p", "الطّارق");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৮৭");
        this.map_var.put("m", "আল-আ'লা");
        this.map_var.put("o", "আয়াত - ১৯, মাক্কী");
        this.map_var.put("p", "الأعلى");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৮৮");
        this.map_var.put("m", "আল-গাশিয়াহ");
        this.map_var.put("o", "আয়াত - ২৬, মাক্কী");
        this.map_var.put("p", "الغاشية");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৮৯");
        this.map_var.put("m", "আল-ফাজ্\u200cর");
        this.map_var.put("o", "আয়াত - ৩০, মাক্কী");
        this.map_var.put("p", "الفجر");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৯০");
        this.map_var.put("m", "আল-বালাদ");
        this.map_var.put("o", "আয়াত - ২০, মাক্কী");
        this.map_var.put("p", "البلد");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৯১");
        this.map_var.put("m", "আশ-শামস");
        this.map_var.put("o", "আয়াত - ১৫, মাক্কী");
        this.map_var.put("p", "الشّمس");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৯২");
        this.map_var.put("m", "আল-লাইল");
        this.map_var.put("o", "আয়াত - ২১, মাক্কী");
        this.map_var.put("p", "الليل");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৯৩");
        this.map_var.put("m", "আদ-দুহা");
        this.map_var.put("o", "আয়াত - ১১, মাক্কী");
        this.map_var.put("p", "الضحى");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৯৪");
        this.map_var.put("m", "আল-ইন'শিরাহ");
        this.map_var.put("o", "আয়াত - ৮, মাক্কী");
        this.map_var.put("p", "الشرح");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৯৫");
        this.map_var.put("m", "আত-ত্বীন");
        this.map_var.put("o", "আয়াত - ৮, মাক্কী");
        this.map_var.put("p", "التين");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৯৬");
        this.map_var.put("m", "আল-আলাক্ব");
        this.map_var.put("o", "আয়াত - ১৯, মাক্কী");
        this.map_var.put("p", "العلق");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৯৭");
        this.map_var.put("m", "আল-ক্বাদর");
        this.map_var.put("o", "আয়াত - ৫, মাক্কী");
        this.map_var.put("p", "القدر");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৯৮");
        this.map_var.put("m", "আল-বাইয়্যিনাহ");
        this.map_var.put("o", "আয়াত - ৮, মাদানী");
        this.map_var.put("p", "البينة");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৯৯");
        this.map_var.put("m", "আল-যিলযাল");
        this.map_var.put("o", "আয়াত - ৮, মাক্কী");
        this.map_var.put("p", "الزلزلة");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১০০");
        this.map_var.put("m", "আল-আদিয়াত");
        this.map_var.put("o", "আয়াত - ১১, মাক্কী");
        this.map_var.put("p", "العاديات");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১০১");
        this.map_var.put("m", "আল-ক্বারি'আহ");
        this.map_var.put("o", "আয়াত - ১১, মাক্কী");
        this.map_var.put("p", "القارعة");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১০২");
        this.map_var.put("m", "আত-তাকাসুর");
        this.map_var.put("o", "আয়াত - ৮, মাক্কী");
        this.map_var.put("p", "التكاثر");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১০৩");
        this.map_var.put("m", "আল-আসর");
        this.map_var.put("o", "আয়াত - ৩, মাক্কী");
        this.map_var.put("p", "العصر");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১০৪");
        this.map_var.put("m", "আল-হুমাযাহ");
        this.map_var.put("o", "আয়াত - ৯, মাক্কী");
        this.map_var.put("p", "الهمزة");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১০৫");
        this.map_var.put("m", "আল-ফীল");
        this.map_var.put("o", "আয়াত - ৫, মাক্কী");
        this.map_var.put("p", "الفيل");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১০৬");
        this.map_var.put("m", "কুরাইশ");
        this.map_var.put("o", "আয়াত - ৪, মাক্কী");
        this.map_var.put("p", "قريش");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১০৭");
        this.map_var.put("m", "আল-মাউন");
        this.map_var.put("o", "আয়াত - ৭, মাক্কী");
        this.map_var.put("p", "الماعون");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১০৮");
        this.map_var.put("m", "আল-কাউসার");
        this.map_var.put("o", "আয়াত - ৩, মাক্কী");
        this.map_var.put("p", "الكوثر");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১০৯");
        this.map_var.put("m", "আল-কাফিরুন");
        this.map_var.put("o", "আয়াত - ৬, মাক্কী");
        this.map_var.put("p", "الكافرون");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১১০");
        this.map_var.put("m", "আন-নাসর");
        this.map_var.put("o", "আয়াত - ৩, মাদানী");
        this.map_var.put("p", "النصر");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১১১");
        this.map_var.put("m", "লাহাব");
        this.map_var.put("o", "আয়াত - ৫, মাক্কী");
        this.map_var.put("p", "المسد");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১১২");
        this.map_var.put("m", "আল-ইখলাস");
        this.map_var.put("o", "আয়াত - ৪, মাক্কী");
        this.map_var.put("p", "الإخلاص");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১১৩");
        this.map_var.put("m", "আল-ফালাক্ক");
        this.map_var.put("o", "আয়াত - ৫, মাক্কী");
        this.map_var.put("p", "الفلق");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১১৪");
        this.map_var.put("m", "আন-নাস");
        this.map_var.put("o", "আয়াত - ৬, মাক্কী");
        this.map_var.put("p", "الناس");
        this.map_list.add(this.map_var);
        this.listview_quran.setAdapter((ListAdapter) new Listview_quranAdapter(this.map_list));
        ((BaseAdapter) this.listview_quran.getAdapter()).notifyDataSetChanged();
        this.map_var_books = new HashMap<>();
        this.map_var_books.put("serial", "১");
        this.map_var_books.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "মাদারেজুন নবুওয়াত");
        this.map_var_books.put("writer", "শায়েখ আব্দুল হক মোহাদ্দেছে দেহলভী (রঃ)");
        this.map_books.add(this.map_var_books);
        this.map_var_books = new HashMap<>();
        this.map_var_books.put("serial", "২");
        this.map_var_books.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নামাজের আহকাম (হানাফী)");
        this.map_var_books.put("writer", "মোহাম্মদ ইলিয়াস আত্তার কাদেরী রজবী");
        this.map_books.add(this.map_var_books);
        this.map_var_books = new HashMap<>();
        this.map_var_books.put("serial", "৩");
        this.map_var_books.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "জিকরে এলাহী");
        this.map_var_books.put("writer", "মাওলানা শেখ জাবির আহমদ আল'হোসাইনি");
        this.map_books.add(this.map_var_books);
        this.map_var_books = new HashMap<>();
        this.map_var_books.put("serial", "৪");
        this.map_var_books.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "কালেমার হাকীক্বত");
        this.map_var_books.put("writer", "অধ্যক্ষ হাফেজ মৌঃ এম. এ. জলিল");
        this.map_books.add(this.map_var_books);
        this.map_var_books = new HashMap<>();
        this.map_var_books.put("serial", "৫");
        this.map_var_books.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "হায়াত মউত কবর হাশর");
        this.map_var_books.put("writer", "অধ্যক্ষ হাফেজ মৌঃ এম. এ. জলিল");
        this.map_books.add(this.map_var_books);
        this.map_var_books = new HashMap<>();
        this.map_var_books.put("serial", "৬");
        this.map_var_books.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "প্রশ্নোত্তরে আকায়েদ ও মাসায়েল");
        this.map_var_books.put("writer", "অধ্যক্ষ হাফেজ মৌঃ এম. এ. জলিল");
        this.map_books.add(this.map_var_books);
        this.map_var_books = new HashMap<>();
        this.map_var_books.put("serial", "৭");
        this.map_var_books.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নূরনবী ﷺ");
        this.map_var_books.put("writer", "অধ্যক্ষ হাফেজ মৌঃ এম. এ. জলিল");
        this.map_books.add(this.map_var_books);
        this.map_var_books = new HashMap<>();
        this.map_var_books.put("serial", "৮");
        this.map_var_books.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "মাসায়েলে কুরবানী");
        this.map_var_books.put("writer", "মুফতি গোলাম ছামদানী রেজভি");
        this.map_books.add(this.map_var_books);
        this.map_var_books = new HashMap<>();
        this.map_var_books.put("serial", "৯");
        this.map_var_books.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "আমাদের প্রিয় নবী");
        this.map_var_books.put("writer", "আল্লামা আবেদ নিজামী");
        this.map_books.add(this.map_var_books);
        this.listview_books.setAdapter((ListAdapter) new Listview_booksAdapter(this.map_books));
        ((BaseAdapter) this.listview_books.getAdapter()).notifyDataSetChanged();
       main_titel_textivew.setText("দো'আ, দরূদ ও যিকর");
       main_sub_titel_textview.setText("আল্লাহর ইবাদতই মুক্তির পথ");

        this.listview_quran.setVerticalScrollBarEnabled(false);
        this.listview_books.setVerticalScrollBarEnabled(false);


    }


    


    
    public void _Split_Tab_1() {
        this.shared.edit().putString("split_tab", "split_tab_1").apply();

        this.map_list.clear();
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১");
        this.map_var.put("m", "আল-ফাতিহা");
        this.map_var.put("o", "আয়াত - ৭, মাক্কী");
        this.map_var.put("p", "الفاتحة");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৭৮");
        this.map_var.put("m", "আন-নাবা");
        this.map_var.put("o", "আয়াত - ৪০, মাক্কী");
        this.map_var.put("p", "النّبا");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৭৯");
        this.map_var.put("m", "আন-নাযি'আত");
        this.map_var.put("o", "আয়াত - ৪৬, মাক্কী");
        this.map_var.put("p", "النّزعت");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৮০");
        this.map_var.put("m", "আবাসা");
        this.map_var.put("o", "আয়াত - ৪২, মাক্কী");
        this.map_var.put("p", "عبس");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৮১");
        this.map_var.put("m", "আত-তাকভীর");
        this.map_var.put("o", "আয়াত - ২৯, মাক্কী");
        this.map_var.put("p", "التّكوير");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৮২");
        this.map_var.put("m", "আল-ইনফিতার");
        this.map_var.put("o", "আয়াত - ১৯, মাক্কী");
        this.map_var.put("p", "الانفطار");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৮৩");
        this.map_var.put("m", "আল-মুতাফফিফীন");
        this.map_var.put("o", "আয়াত - ৩৬, মাক্কী");
        this.map_var.put("p", "المطفّفين");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৮৪");
        this.map_var.put("m", "আল-ইনশিক্বাক্ব");
        this.map_var.put("o", "আয়াত - ২৫, মাক্কী");
        this.map_var.put("p", "الانشقاق");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৮৫");
        this.map_var.put("m", "আল-বুরুজ");
        this.map_var.put("o", "আয়াত - ২২, মাক্কী");
        this.map_var.put("p", "البروج");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৮৬");
        this.map_var.put("m", "আত-তারিক্ব");
        this.map_var.put("o", "আয়াত - ১৭, মাক্কী");
        this.map_var.put("p", "الطّارق");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৮৭");
        this.map_var.put("m", "আল-আ'লা");
        this.map_var.put("o", "আয়াত - ১৯, মাক্কী");
        this.map_var.put("p", "الأعلى");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৮৮");
        this.map_var.put("m", "আল-গাশিয়াহ");
        this.map_var.put("o", "আয়াত - ২৬, মাক্কী");
        this.map_var.put("p", "الغاشية");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৮৯");
        this.map_var.put("m", "আল-ফাজ্\u200cর");
        this.map_var.put("o", "আয়াত - ৩০, মাক্কী");
        this.map_var.put("p", "الفجر");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৯০");
        this.map_var.put("m", "আল-বালাদ");
        this.map_var.put("o", "আয়াত - ২০, মাক্কী");
        this.map_var.put("p", "البلد");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৯১");
        this.map_var.put("m", "আশ-শামস");
        this.map_var.put("o", "আয়াত - ১৫, মাক্কী");
        this.map_var.put("p", "الشّمس");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৯২");
        this.map_var.put("m", "আল-লাইল");
        this.map_var.put("o", "আয়াত - ২১, মাক্কী");
        this.map_var.put("p", "الليل");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৯৩");
        this.map_var.put("m", "আদ-দুহা");
        this.map_var.put("o", "আয়াত - ১১, মাক্কী");
        this.map_var.put("p", "الضحى");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৯৪");
        this.map_var.put("m", "আল-ইন'শিরাহ");
        this.map_var.put("o", "আয়াত - ৮, মাক্কী");
        this.map_var.put("p", "الشرح");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৯৫");
        this.map_var.put("m", "আত-ত্বীন");
        this.map_var.put("o", "আয়াত - ৮, মাক্কী");
        this.map_var.put("p", "التين");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৯৬");
        this.map_var.put("m", "আল-আলাক্ব");
        this.map_var.put("o", "আয়াত - ১৯, মাক্কী");
        this.map_var.put("p", "العلق");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৯৭");
        this.map_var.put("m", "আল-ক্বাদর");
        this.map_var.put("o", "আয়াত - ৫, মাক্কী");
        this.map_var.put("p", "القدر");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৯৮");
        this.map_var.put("m", "আল-বাইয়্যিনাহ");
        this.map_var.put("o", "আয়াত - ৮, মাদানী");
        this.map_var.put("p", "البينة");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৯৯");
        this.map_var.put("m", "আল-যিলযাল");
        this.map_var.put("o", "আয়াত - ৮, মাক্কী");
        this.map_var.put("p", "الزلزلة");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১০০");
        this.map_var.put("m", "আল-আদিয়াত");
        this.map_var.put("o", "আয়াত - ১১, মাক্কী");
        this.map_var.put("p", "العاديات");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১০১");
        this.map_var.put("m", "আল-ক্বারি'আহ");
        this.map_var.put("o", "আয়াত - ১১, মাক্কী");
        this.map_var.put("p", "القارعة");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১০২");
        this.map_var.put("m", "আত-তাকাসুর");
        this.map_var.put("o", "আয়াত - ৮, মাক্কী");
        this.map_var.put("p", "التكاثر");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১০৩");
        this.map_var.put("m", "আল-আসর");
        this.map_var.put("o", "আয়াত - ৩, মাক্কী");
        this.map_var.put("p", "العصر");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১০৪");
        this.map_var.put("m", "আল-হুমাযাহ");
        this.map_var.put("o", "আয়াত - ৯, মাক্কী");
        this.map_var.put("p", "الهمزة");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১০৫");
        this.map_var.put("m", "আল-ফীল");
        this.map_var.put("o", "আয়াত - ৫, মাক্কী");
        this.map_var.put("p", "الفيل");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১০৬");
        this.map_var.put("m", "কুরাইশ");
        this.map_var.put("o", "আয়াত - ৪, মাক্কী");
        this.map_var.put("p", "قريش");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১০৭");
        this.map_var.put("m", "আল-মাউন");
        this.map_var.put("o", "আয়াত - ৭, মাক্কী");
        this.map_var.put("p", "الماعون");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১০৮");
        this.map_var.put("m", "আল-কাউসার");
        this.map_var.put("o", "আয়াত - ৩, মাক্কী");
        this.map_var.put("p", "الكوثر");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১০৯");
        this.map_var.put("m", "আল-কাফিরুন");
        this.map_var.put("o", "আয়াত - ৬, মাক্কী");
        this.map_var.put("p", "الكافرون");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১১০");
        this.map_var.put("m", "আন-নাসর");
        this.map_var.put("o", "আয়াত - ৩, মাদানী");
        this.map_var.put("p", "النصر");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১১১");
        this.map_var.put("m", "লাহাব");
        this.map_var.put("o", "আয়াত - ৫, মাক্কী");
        this.map_var.put("p", "المسد");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১১২");
        this.map_var.put("m", "আল-ইখলাস");
        this.map_var.put("o", "আয়াত - ৪, মাক্কী");
        this.map_var.put("p", "الإخلاص");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১১৩");
        this.map_var.put("m", "আল-ফালাক্ক");
        this.map_var.put("o", "আয়াত - ৫, মাক্কী");
        this.map_var.put("p", "الفلق");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১১৪");
        this.map_var.put("m", "আন-নাস");
        this.map_var.put("o", "আয়াত - ৬, মাক্কী");
        this.map_var.put("p", "الناس");
        this.map_list.add(this.map_var);
        this.listview_quran.setAdapter((ListAdapter) new Listview_quranAdapter(this.map_list));
        ((BaseAdapter) this.listview_quran.getAdapter()).notifyDataSetChanged();
    }

    
    public void _Split_Tab_2() {
        this.shared.edit().putString("split_tab", "split_tab_2").apply();
        this.map_list.clear();
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১");
        this.map_var.put("m", "আল-ফাতিহা");
        this.map_var.put("o", "আয়াত - ৭, মাক্কী");
        this.map_var.put("p", "الفاتحة");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "২");
        this.map_var.put("m", "আল-বাকারাহ");
        this.map_var.put("o", "আয়াত - ২৮৬, মাদানী");
        this.map_var.put("p", "البقرة");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৩");
        this.map_var.put("m", "আলে-ইমরান");
        this.map_var.put("o", "আয়াত - ২০০, মাদানী");
        this.map_var.put("p", "آل عمران");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৪");
        this.map_var.put("m", "আন-নিসা");
        this.map_var.put("o", "আয়াত - ১৭৬, মাদানী");
        this.map_var.put("p", "النّساء");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৫");
        this.map_var.put("m", "আল-মায়িদাহ");
        this.map_var.put("o", "আয়াত - ১২০, মাদানী");
        this.map_var.put("p", "المآئدة");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৬");
        this.map_var.put("m", "আল-আন'আম");
        this.map_var.put("o", "আয়াত - ১৬৫, মাক্কী");
        this.map_var.put("p", "الانعام");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৭");
        this.map_var.put("m", "আল-আ'রাফ");
        this.map_var.put("o", "আয়াত - ২০৬, মাক্কী");
        this.map_var.put("p", "الأعراف");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৮");
        this.map_var.put("m", "আল-আনফাল");
        this.map_var.put("o", "আয়াত - ৭৫, মাদানী");
        this.map_var.put("p", "الأنفال");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৯");
        this.map_var.put("m", "আত-তাওবাহ");
        this.map_var.put("o", "আয়াত - ১২৯, মাদানী");
        this.map_var.put("p", "التوبة");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১০");
        this.map_var.put("m", "ইউনুস");
        this.map_var.put("o", "আয়াত - ১০৯, মাক্কী");
        this.map_var.put("p", "يونس");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১১");
        this.map_var.put("m", "হুদ");
        this.map_var.put("o", "আয়াত - ১২৩, মাক্কী");
        this.map_var.put("p", "هود");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১২");
        this.map_var.put("m", "ইউসুফ");
        this.map_var.put("o", "আয়াত - ১১১, মাক্কী");
        this.map_var.put("p", "يوسف");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১৩");
        this.map_var.put("m", "আর-রাদ");
        this.map_var.put("o", "আয়াত - ৪৩, মাক্কী");
        this.map_var.put("p", "الرّعد");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১৪");
        this.map_var.put("m", "ইবরাহীম");
        this.map_var.put("o", "আয়াত - ৫২, মাক্কী");
        this.map_var.put("p", "إبراهيم");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১৫");
        this.map_var.put("m", "আল-হিজর");
        this.map_var.put("o", "আয়াত - ৯৯, মাক্কী");
        this.map_var.put("p", "الحجر");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১৬");
        this.map_var.put("m", "আন্\u200c-নাহল");
        this.map_var.put("o", "আয়াত - ১২৮, মাক্কী");
        this.map_var.put("p", "النّحل");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১৭");
        this.map_var.put("m", "বানী ইসরাঈল");
        this.map_var.put("o", "আয়াত - ১১১, মাক্কী");
        this.map_var.put("p", "الإسرا");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১৮");
        this.map_var.put("m", "আল-কাহফ");
        this.map_var.put("o", "আয়াত - ১১০, মাক্কী");
        this.map_var.put("p", "الكهف");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১৯");
        this.map_var.put("m", "মারইয়াম");
        this.map_var.put("o", "আয়াত - ৯৮, মাক্কী");
        this.map_var.put("p", "مريم");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "২০");
        this.map_var.put("m", "ত্ব-হা");
        this.map_var.put("o", "আয়াত - ১৩৫, মাক্কী");
        this.map_var.put("p", "طه");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "২১");
        this.map_var.put("m", "আল-আম্বিয়া");
        this.map_var.put("o", "আয়াত - ১১২, মাক্কী");
        this.map_var.put("p", "الأنبياء");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "২২");
        this.map_var.put("m", "আল-হাজ্জ");
        this.map_var.put("o", "আয়াত - ৭৮, মাদানী");
        this.map_var.put("p", "الحجّ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "২৩");
        this.map_var.put("m", "আল-মু’মিনুন");
        this.map_var.put("o", "আয়াত - ১১৮, মাক্কী");
        this.map_var.put("p", "المؤمنون");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "২৪");
        this.map_var.put("m", "আন্\u200c-নূর");
        this.map_var.put("o", "আয়াত - ৬৪, মাদানী");
        this.map_var.put("p", "النّور");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "২৫");
        this.map_var.put("m", "আল-ফুরক্বান");
        this.map_var.put("o", "আয়াত - ৭৭, মাক্কী");
        this.map_var.put("p", "الفرقان");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "২৬");
        this.map_var.put("m", "আশ-শু'আরা");
        this.map_var.put("o", "আয়াত - ২২৭, মাক্কী");
        this.map_var.put("p", "الشّعراء");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "২৭");
        this.map_var.put("m", "আন্\u200c-নামাল");
        this.map_var.put("o", "আয়াত - ৯৩, মাক্কী");
        this.map_var.put("p", "النّمل");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "২৮");
        this.map_var.put("m", "আল-কাসাস");
        this.map_var.put("o", "আয়াত - ৮৮, মাক্কী");
        this.map_var.put("p", "القصص");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "২৯");
        this.map_var.put("m", "আল-'আনকাবূত");
        this.map_var.put("o", "আয়াত - ৬৯, মাক্কী");
        this.map_var.put("p", "العنكبوت");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৩০");
        this.map_var.put("m", "আর-রুম");
        this.map_var.put("o", "আয়াত - ৬০, মাক্কী");
        this.map_var.put("p", "الرّوم");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৩১");
        this.map_var.put("m", "লুকমান");
        this.map_var.put("o", "আয়াত - ৩৪, মাক্কী");
        this.map_var.put("p", "لقمان");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৩২");
        this.map_var.put("m", "আস-সাজদাহ");
        this.map_var.put("o", "আয়াত - ৩০, মাক্কী");
        this.map_var.put("p", "السّجدة");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৩৩");
        this.map_var.put("m", "আল-আহযাব");
        this.map_var.put("o", "আয়াত - ৭৩, মাদানী");
        this.map_var.put("p", "الْأحزاب");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৩৪");
        this.map_var.put("m", "সাবা");
        this.map_var.put("o", "আয়াত - ৫৪, মাক্কী");
        this.map_var.put("p", "سبا");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৩৫");
        this.map_var.put("m", "ফাত্বির");
        this.map_var.put("o", "আয়াত - ৪৫, মাক্কী");
        this.map_var.put("p", "فاطر");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৩৬");
        this.map_var.put("m", "ইয়া-সীন");
        this.map_var.put("o", "আয়াত - ৮৩, মাক্কী");
        this.map_var.put("p", "يس");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৩৭");
        this.map_var.put("m", "আস-সাফফাত");
        this.map_var.put("o", "আয়াত - ১৮২, মাক্কী");
        this.map_var.put("p", "الصّافات");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৩৮");
        this.map_var.put("m", "সোয়াদ");
        this.map_var.put("o", "আয়াত - ৮৮, মাক্কী");
        this.map_var.put("p", "ص");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৩৯");
        this.map_var.put("m", "আয-যুমার");
        this.map_var.put("o", "আয়াত - ৭৫, মাক্কী");
        this.map_var.put("p", "الزّمر");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৪০");
        this.map_var.put("m", "আল-মু'মিন বা গাফির");
        this.map_var.put("o", "আয়াত - ৮৫, মাক্কী");
        this.map_var.put("p", "غافر");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৪১");
        this.map_var.put("m", "ফুসসিলাত");
        this.map_var.put("o", "আয়াত - ৫৪, মাক্কী");
        this.map_var.put("p", "فصّلت");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৪২");
        this.map_var.put("m", "আশ-শুরা");
        this.map_var.put("o", "আয়াত - ৫৩, মাক্কী");
        this.map_var.put("p", "الشّورى");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৪৩");
        this.map_var.put("m", "আয-যুখরুফ");
        this.map_var.put("o", "আয়াত - ৮৯, মাক্কী");
        this.map_var.put("p", "الزّخرف");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৪৪");
        this.map_var.put("m", "আদ-দুখান");
        this.map_var.put("o", "আয়াত - ৫৯, মাক্কী");
        this.map_var.put("p", "الدّخان");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৪৫");
        this.map_var.put("m", "আল-জাসিয়া");
        this.map_var.put("o", "আয়াত - ৩৭, মাক্কী");
        this.map_var.put("p", "الجاثية");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৪৬");
        this.map_var.put("m", "আল-আহকাফ");
        this.map_var.put("o", "আয়াত - ৩৫, মাক্কী");
        this.map_var.put("p", "الأحقاف");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৪৭");
        this.map_var.put("m", "মুহাম্মাদ");
        this.map_var.put("o", "আয়াত - ৩৮, মাদানী");
        this.map_var.put("p", "محمّد");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৪৮");
        this.map_var.put("m", "আল-ফাতহ");
        this.map_var.put("o", "আয়াত - ২৯, মাদানী");
        this.map_var.put("p", "الفتح");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৪৯");
        this.map_var.put("m", "আল-হুজুরাত");
        this.map_var.put("o", "আয়াত - ১৮, মাদানী");
        this.map_var.put("p", "الحجرات");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৫০");
        this.map_var.put("m", "ক্বা-ফ");
        this.map_var.put("o", "আয়াত - ৪৫, মাক্কী");
        this.map_var.put("p", "ق");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৫১");
        this.map_var.put("m", "আয-যারিয়াত");
        this.map_var.put("o", "আয়াত - ৬০, মাক্কী");
        this.map_var.put("p", "الذّاريات");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৫২");
        this.map_var.put("m", "আত-তূর");
        this.map_var.put("o", "আয়াত - ৪৯, মাক্কী");
        this.map_var.put("p", "الطّور");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৫৩");
        this.map_var.put("m", "আন-নাজম");
        this.map_var.put("o", "আয়াত - ৬২, মাক্কী");
        this.map_var.put("p", "النّجْم");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৫৪");
        this.map_var.put("m", "আল-কামার");
        this.map_var.put("o", "আয়াত - ৫৫, মাক্কী");
        this.map_var.put("p", "القمر");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৫৫");
        this.map_var.put("m", "আর-রহমান");
        this.map_var.put("o", "আয়াত - ৭৮, মাদানী");
        this.map_var.put("p", "الرّحْمن");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৫৬");
        this.map_var.put("m", "আল-ওয়াকিয়া");
        this.map_var.put("o", "আয়াত - ৯৬, মাক্কী");
        this.map_var.put("p", "الواقعة");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৫৭");
        this.map_var.put("m", "আল-হাদীদ");
        this.map_var.put("o", "আয়াত - ২৯, মাদানী");
        this.map_var.put("p", "الحديد");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৫৮");
        this.map_var.put("m", "আল-মুজাদালাহ");
        this.map_var.put("o", "আয়াত - ২২, মাদানী");
        this.map_var.put("p", "المجادلة");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৫৯");
        this.map_var.put("m", "আল-হাশর");
        this.map_var.put("o", "আয়াত - ২৪, মাদানী");
        this.map_var.put("p", "الحشْر");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৬০");
        this.map_var.put("m", "আল-মুমতাহিনাহ");
        this.map_var.put("o", "আয়াত - ১৩, মাদানী");
        this.map_var.put("p", "الممتحنة");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৬১");
        this.map_var.put("m", "আস-সফ");
        this.map_var.put("o", "আয়াত - ১৪, মাদানী");
        this.map_var.put("p", "الصّفّ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৬২");
        this.map_var.put("m", "আল-জুমু'আহ");
        this.map_var.put("o", "আয়াত - ১১, মাদানী");
        this.map_var.put("p", "الجمعة");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৬৩");
        this.map_var.put("m", "আল-মুনাফিকুন");
        this.map_var.put("o", "আয়াত - ১১, মাদানী");
        this.map_var.put("p", "المنافقون");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৬৪");
        this.map_var.put("m", "আত-তাগাবুন");
        this.map_var.put("o", "আয়াত - ১৮, মাদানী");
        this.map_var.put("p", "التّغابن");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৬৫");
        this.map_var.put("m", "আত-তালাক্ব");
        this.map_var.put("o", "আয়াত - ১২, মাদানী");
        this.map_var.put("p", "الطّلاق");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৬৬");
        this.map_var.put("m", "আত-তাহরিম");
        this.map_var.put("o", "আয়াত - ১২, মাদানী");
        this.map_var.put("p", "التّحريم");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৬৭");
        this.map_var.put("m", "আল-মুলক");
        this.map_var.put("o", "আয়াত - ৩০, মাক্কী");
        this.map_var.put("p", "الملك");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৬৮");
        this.map_var.put("m", "আল-ক্বালাম");
        this.map_var.put("o", "আয়াত - ৫২, মাক্কী");
        this.map_var.put("p", "القلم");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৬৯");
        this.map_var.put("m", "আল-হাক্বাহ");
        this.map_var.put("o", "আয়াত - ৫২, মাক্কী");
        this.map_var.put("p", "الحآقّة");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৭০");
        this.map_var.put("m", "আল-মাআরিজ");
        this.map_var.put("o", "আয়াত - ৪৪, মাক্কী");
        this.map_var.put("p", "المعارج");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৭১");
        this.map_var.put("m", "নুহ");
        this.map_var.put("o", "আয়াত - ২৮, মাক্কী");
        this.map_var.put("p", "نوح");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৭২");
        this.map_var.put("m", "আল-জীন");
        this.map_var.put("o", "আয়াত - ২৮, মাক্কী");
        this.map_var.put("p", "الجنّ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৭৩");
        this.map_var.put("m", "আল-মুযযাম্মিল");
        this.map_var.put("o", "আয়াত - ২০, মাক্কী");
        this.map_var.put("p", "المزّمّل");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৭৪");
        this.map_var.put("m", "আল-মুদ্দাস্\u200cসির");
        this.map_var.put("o", "আয়াত - ৫৬, মাক্কী");
        this.map_var.put("p", "المدّشّر");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৭৫");
        this.map_var.put("m", "আল-ক্বিয়ামাহ");
        this.map_var.put("o", "আয়াত - ৪০, মাক্কী");
        this.map_var.put("p", "القيامة");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৭৬");
        this.map_var.put("m", "আল-ইনসান");
        this.map_var.put("o", "আয়াত - ৩১, মাদানী");
        this.map_var.put("p", "الدَّهْرِ");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৭৭");
        this.map_var.put("m", "আল-মুরসালাত");
        this.map_var.put("o", "আয়াত - ৫০, মাক্কী");
        this.map_var.put("p", "المرسلت");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৭৮");
        this.map_var.put("m", "আন-নাবা");
        this.map_var.put("o", "আয়াত - ৪০, মাক্কী");
        this.map_var.put("p", "النّبا");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৭৯");
        this.map_var.put("m", "আন-নাযি'আত");
        this.map_var.put("o", "আয়াত - ৪৬, মাক্কী");
        this.map_var.put("p", "النّزعت");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৮০");
        this.map_var.put("m", "আবাসা");
        this.map_var.put("o", "আয়াত - ৪২, মাক্কী");
        this.map_var.put("p", "عبس");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৮১");
        this.map_var.put("m", "আত-তাকভীর");
        this.map_var.put("o", "আয়াত - ২৯, মাক্কী");
        this.map_var.put("p", "التّكوير");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৮২");
        this.map_var.put("m", "আল-ইনফিতার");
        this.map_var.put("o", "আয়াত - ১৯, মাক্কী");
        this.map_var.put("p", "الانفطار");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৮৩");
        this.map_var.put("m", "আল-মুতাফফিফীন");
        this.map_var.put("o", "আয়াত - ৩৬, মাক্কী");
        this.map_var.put("p", "المطفّفين");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৮৪");
        this.map_var.put("m", "আল-ইনশিক্বাক্ব");
        this.map_var.put("o", "আয়াত - ২৫, মাক্কী");
        this.map_var.put("p", "الانشقاق");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৮৫");
        this.map_var.put("m", "আল-বুরুজ");
        this.map_var.put("o", "আয়াত - ২২, মাক্কী");
        this.map_var.put("p", "البروج");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৮৬");
        this.map_var.put("m", "আত-তারিক্ব");
        this.map_var.put("o", "আয়াত - ১৭, মাক্কী");
        this.map_var.put("p", "الطّارق");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৮৭");
        this.map_var.put("m", "আল-আ'লা");
        this.map_var.put("o", "আয়াত - ১৯, মাক্কী");
        this.map_var.put("p", "الأعلى");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৮৮");
        this.map_var.put("m", "আল-গাশিয়াহ");
        this.map_var.put("o", "আয়াত - ২৬, মাক্কী");
        this.map_var.put("p", "الغاشية");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৮৯");
        this.map_var.put("m", "আল-ফাজ্\u200cর");
        this.map_var.put("o", "আয়াত - ৩০, মাক্কী");
        this.map_var.put("p", "الفجر");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৯০");
        this.map_var.put("m", "আল-বালাদ");
        this.map_var.put("o", "আয়াত - ২০, মাক্কী");
        this.map_var.put("p", "البلد");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৯১");
        this.map_var.put("m", "আশ-শামস");
        this.map_var.put("o", "আয়াত - ১৫, মাক্কী");
        this.map_var.put("p", "الشّمس");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৯২");
        this.map_var.put("m", "আল-লাইল");
        this.map_var.put("o", "আয়াত - ২১, মাক্কী");
        this.map_var.put("p", "الليل");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৯৩");
        this.map_var.put("m", "আদ-দুহা");
        this.map_var.put("o", "আয়াত - ১১, মাক্কী");
        this.map_var.put("p", "الضحى");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৯৪");
        this.map_var.put("m", "আল-ইন'শিরাহ");
        this.map_var.put("o", "আয়াত - ৮, মাক্কী");
        this.map_var.put("p", "الشرح");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৯৫");
        this.map_var.put("m", "আত-ত্বীন");
        this.map_var.put("o", "আয়াত - ৮, মাক্কী");
        this.map_var.put("p", "التين");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৯৬");
        this.map_var.put("m", "আল-আলাক্ব");
        this.map_var.put("o", "আয়াত - ১৯, মাক্কী");
        this.map_var.put("p", "العلق");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৯৭");
        this.map_var.put("m", "আল-ক্বাদর");
        this.map_var.put("o", "আয়াত - ৫, মাক্কী");
        this.map_var.put("p", "القدر");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৯৮");
        this.map_var.put("m", "আল-বাইয়্যিনাহ");
        this.map_var.put("o", "আয়াত - ৮, মাদানী");
        this.map_var.put("p", "البينة");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "৯৯");
        this.map_var.put("m", "আল-যিলযাল");
        this.map_var.put("o", "আয়াত - ৮, মাক্কী");
        this.map_var.put("p", "الزلزلة");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১০০");
        this.map_var.put("m", "আল-আদিয়াত");
        this.map_var.put("o", "আয়াত - ১১, মাক্কী");
        this.map_var.put("p", "العاديات");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১০১");
        this.map_var.put("m", "আল-ক্বারি'আহ");
        this.map_var.put("o", "আয়াত - ১১, মাক্কী");
        this.map_var.put("p", "القارعة");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১০২");
        this.map_var.put("m", "আত-তাকাসুর");
        this.map_var.put("o", "আয়াত - ৮, মাক্কী");
        this.map_var.put("p", "التكاثر");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১০৩");
        this.map_var.put("m", "আল-আসর");
        this.map_var.put("o", "আয়াত - ৩, মাক্কী");
        this.map_var.put("p", "العصر");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১০৪");
        this.map_var.put("m", "আল-হুমাযাহ");
        this.map_var.put("o", "আয়াত - ৯, মাক্কী");
        this.map_var.put("p", "الهمزة");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১০৫");
        this.map_var.put("m", "আল-ফীল");
        this.map_var.put("o", "আয়াত - ৫, মাক্কী");
        this.map_var.put("p", "الفيل");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১০৬");
        this.map_var.put("m", "কুরাইশ");
        this.map_var.put("o", "আয়াত - ৪, মাক্কী");
        this.map_var.put("p", "قريش");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১০৭");
        this.map_var.put("m", "আল-মাউন");
        this.map_var.put("o", "আয়াত - ৭, মাক্কী");
        this.map_var.put("p", "الماعون");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১০৮");
        this.map_var.put("m", "আল-কাউসার");
        this.map_var.put("o", "আয়াত - ৩, মাক্কী");
        this.map_var.put("p", "الكوثر");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১০৯");
        this.map_var.put("m", "আল-কাফিরুন");
        this.map_var.put("o", "আয়াত - ৬, মাক্কী");
        this.map_var.put("p", "الكافرون");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১১০");
        this.map_var.put("m", "আন-নাসর");
        this.map_var.put("o", "আয়াত - ৩, মাদানী");
        this.map_var.put("p", "النصر");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১১১");
        this.map_var.put("m", "লাহাব");
        this.map_var.put("o", "আয়াত - ৫, মাক্কী");
        this.map_var.put("p", "المسد");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১১২");
        this.map_var.put("m", "আল-ইখলাস");
        this.map_var.put("o", "আয়াত - ৪, মাক্কী");
        this.map_var.put("p", "الإخلاص");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১১৩");
        this.map_var.put("m", "আল-ফালাক্ক");
        this.map_var.put("o", "আয়াত - ৫, মাক্কী");
        this.map_var.put("p", "الفلق");
        this.map_list.add(this.map_var);
        this.map_var = new HashMap<>();
        this.map_var.put("n", "১১৪");
        this.map_var.put("m", "আন-নাস");
        this.map_var.put("o", "আয়াত - ৬, মাক্কী");
        this.map_var.put("p", "الناس");
        this.map_list.add(this.map_var);
        this.listview_quran.setAdapter(new Listview_quranAdapter(this.map_list));
        ((BaseAdapter) this.listview_quran.getAdapter()).notifyDataSetChanged();
    }

    
    public void _Split_Books_1() {
        this.shared.edit().putString("split_books", "split_books_1").apply();

        this.map_books.clear();
        this.map_var_books = new HashMap<>();
        this.map_var_books.put("serial", "১");
        this.map_var_books.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "মাদারেজুন নবুওয়াত");
        this.map_var_books.put("writer", "শায়েখ আব্দুল হক মোহাদ্দেছে দেহলভী (রঃ)");
        this.map_books.add(this.map_var_books);
        this.map_var_books = new HashMap<>();
        this.map_var_books.put("serial", "২");
        this.map_var_books.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নামাজের আহকাম (হানাফী)");
        this.map_var_books.put("writer", "মোহাম্মদ ইলিয়াস আত্তার কাদেরী রজবী");
        this.map_books.add(this.map_var_books);
        this.map_var_books = new HashMap<>();
        this.map_var_books.put("serial", "৩");
        this.map_var_books.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "জিকরে এলাহী");
        this.map_var_books.put("writer", "মাওলানা শেখ জাবির আহমদ আল'হোসাইনি");
        this.map_books.add(this.map_var_books);
        this.map_var_books = new HashMap<>();
        this.map_var_books.put("serial", "৪");
        this.map_var_books.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "কালেমার হাকীক্বত");
        this.map_var_books.put("writer", "অধ্যক্ষ হাফেজ মৌঃ এম. এ. জলিল");
        this.map_books.add(this.map_var_books);
        this.map_var_books = new HashMap<>();
        this.map_var_books.put("serial", "৫");
        this.map_var_books.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "হায়াত মউত কবর হাশর");
        this.map_var_books.put("writer", "অধ্যক্ষ হাফেজ মৌঃ এম. এ. জলিল");
        this.map_books.add(this.map_var_books);
        this.map_var_books = new HashMap<>();
        this.map_var_books.put("serial", "৬");
        this.map_var_books.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "প্রশ্নোত্তরে আকায়েদ ও মাসায়েল");
        this.map_var_books.put("writer", "অধ্যক্ষ হাফেজ মৌঃ এম. এ. জলিল");
        this.map_books.add(this.map_var_books);
        this.map_var_books = new HashMap<>();
        this.map_var_books.put("serial", "৭");
        this.map_var_books.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নূরনবী ﷺ");
        this.map_var_books.put("writer", "অধ্যক্ষ হাফেজ মৌঃ এম. এ. জলিল");
        this.map_books.add(this.map_var_books);
        this.map_var_books = new HashMap<>();
        this.map_var_books.put("serial", "৮");
        this.map_var_books.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "মাসায়েলে কুরবানী");
        this.map_var_books.put("writer", "মুফতি গোলাম ছামদানী রেজভি");
        this.map_books.add(this.map_var_books);
        this.map_var_books = new HashMap<>();
        this.map_var_books.put("serial", "৯");
        this.map_var_books.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "আমাদের প্রিয় নবী");
        this.map_var_books.put("writer", "আল্লামা আবেদ নিজামী");
        this.map_books.add(this.map_var_books);
        this.listview_books.setAdapter((ListAdapter) new Listview_booksAdapter(this.map_books));
        ((BaseAdapter) this.listview_books.getAdapter()).notifyDataSetChanged();
    }

    
    public void _Split_Books_2() {
        this.shared.edit().putString("split_books", "split_books_2").apply();

        this.map_books.clear();
        this.map_var_books = new HashMap<>();
        this.map_var_books.put("serial", "১");
        this.map_var_books.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "তাফসীরুল কুরআন");
        this.map_var_books.put("writer", "মোট গ্রন্থ ১০ টি");
        this.map_books.add(this.map_var_books);
        this.map_var_books = new HashMap<>();
        this.map_var_books.put("serial", "২");
        this.map_var_books.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "হাদিস শরীফ");
        this.map_var_books.put("writer", "মোট গ্রন্থ ৯ টি");
        this.map_books.add(this.map_var_books);
        this.map_var_books = new HashMap<>();
        this.map_var_books.put("serial", "৩");
        this.map_var_books.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "মাসায়েল ও ফিকাহ");
        this.map_var_books.put("writer", "মোট গ্রন্থ ২৪ টি");
        this.map_books.add(this.map_var_books);
        this.map_var_books = new HashMap<>();
        this.map_var_books.put("serial", "৪");
        this.map_var_books.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "আক্বিদাহ");
        this.map_var_books.put("writer", "মোট গ্রন্থ ৩ টি");
        this.map_books.add(this.map_var_books);
        this.map_var_books = new HashMap<>();
        this.map_var_books.put("serial", "৫");
        this.map_var_books.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "নবীজীর মর্যাদা");
        this.map_var_books.put("writer", "মোট গ্রন্থ ১০ টি");
        this.map_books.add(this.map_var_books);
        this.map_var_books = new HashMap<>();
        this.map_var_books.put("serial", "৬");
        this.map_var_books.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "মিলাদুন্নবী ﷺ");
        this.map_var_books.put("writer", "মোট গ্রন্থ ২৫ টি");
        this.map_books.add(this.map_var_books);
        this.map_var_books = new HashMap<>();
        this.map_var_books.put("serial", "৭");
        this.map_var_books.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "শানে আওলিয়া");
        this.map_var_books.put("writer", "মোট গ্রন্থ ২০ টি");
        this.map_books.add(this.map_var_books);
        this.map_var_books = new HashMap<>();
        this.map_var_books.put("serial", "৮");
        this.map_var_books.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "আহমদ ইয়ার খান নঈমী (রাহ.)");
        this.map_var_books.put("writer", "মোট গ্রন্থ ১৮ টি");
        this.map_books.add(this.map_var_books);
        this.map_var_books = new HashMap<>();
        this.map_var_books.put("serial", "৯");
        this.map_var_books.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "আল্লামা জালালুদ্দীন সুয়ূতী (রাহ.)");
        this.map_var_books.put("writer", "মোট গ্রন্থ ১০ টি");
        this.map_books.add(this.map_var_books);
        this.map_var_books = new HashMap<>();
        this.map_var_books.put("serial", "১০");
        this.map_var_books.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "অন্যান্য");
        this.map_var_books.put("writer", "মোট গ্রন্থ ১৫ টি");
        this.map_books.add(this.map_var_books);
        this.listview_books.setAdapter((ListAdapter) new Listview_booksAdapter(this.map_books));
        ((BaseAdapter) this.listview_books.getAdapter()).notifyDataSetChanged();
    }

    

   
    public class Listview_quranAdapter extends BaseAdapter {
        ArrayList<HashMap<String, Object>> _data;

        public Listview_quranAdapter(ArrayList<HashMap<String, Object>> arrayList) {
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

        @SuppressLint("InflateParams")
        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            LayoutInflater layoutInflater = (LayoutInflater) Activity.this.getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            if (view == null) {
                view = layoutInflater.inflate(R.layout.surah_name, null);
            }
            TextView textView = view.findViewById(R.id.textview_serial);
            TextView main_sub_titel_textview = view.findViewById(R.id.textview_origin);
            TextView textView3 = view.findViewById(R.id.textview_bangla);
            TextView textView4 = view.findViewById(R.id.textview_arabic);
            textView.setText(Objects.requireNonNull(((HashMap<?, ?>) Activity.this.map_list.get(i)).get("n")).toString());
            textView3.setText(Objects.requireNonNull(((HashMap<?, ?>) Activity.this.map_list.get(i)).get("m")).toString());
            main_sub_titel_textview.setText(Objects.requireNonNull(((HashMap<?, ?>) Activity.this.map_list.get(i)).get("o")).toString());
            textView4.setText(Objects.requireNonNull(((HashMap<?, ?>) Activity.this.map_list.get(i)).get("p")).toString());


            return view;
        }
    }


    public class Listview_booksAdapter extends BaseAdapter {
        ArrayList<HashMap<String, Object>> _data;

        public Listview_booksAdapter(ArrayList<HashMap<String, Object>> arrayList) {
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

        @SuppressLint("InflateParams")
        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            LayoutInflater layoutInflater = (LayoutInflater) Activity.this.getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            if (view == null) {
                view = layoutInflater.inflate(R.layout.book_custom, null);
            }
            ImageView imageView = view.findViewById(R.id.imageview2);
            ImageView imageView2 = view.findViewById(R.id.imageview1);
            TextView textView = view.findViewById(R.id.tv_book_name);
            TextView main_sub_titel_textview = view.findViewById(R.id.tv_writer_name);
            textView.setText(Objects.requireNonNull(((HashMap<?, ?>) Activity.this.map_books.get(i)).get(AppMeasurementSdk.ConditionalUserProperty.NAME)).toString());
            main_sub_titel_textview.setText(Objects.requireNonNull(((HashMap<?, ?>) Activity.this.map_books.get(i)).get("writer")).toString());
            imageView.setVisibility(View.GONE);
            imageView2.setVisibility(View.VISIBLE);


            return view;
        }
    }

}
