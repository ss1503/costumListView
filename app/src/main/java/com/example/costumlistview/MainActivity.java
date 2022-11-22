package com.example.costumlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    //all objects
    Spinner coutriesSpn;
    TextView result;

    //spinner info
    String[] coutnriesArr = {"Choose country", "Israel", "Spain", "Russia", "South korea", "Sweden", "Norway", "USA"};
    String[] countriesCapitalArr= {"", "Jerusalem", "Madrid", "Moscow", "Seoul", "Stockholm", "Oslo", "Washingtom D.C"};
    int[] imgId = {0, R.drawable.israel, R.drawable.spain, R.drawable.russia, R.drawable.southkoera, R.drawable.sweden, R.drawable.norway, R.drawable.usa};



    //Varibles
    String[][] countiresInfo = {
            {"Israel", "Jerusalem", "9.364 mil"},
            {"Spain", "Madrid", "47.33 mil"},
            {"Russia", "Moscow", "143.4 mil"},
            {"South korea", "Seoul", "51.74 mil"},
            {"Sweden", "Stockholm", "10.42 mil"},
            {"Norway", "Oslo", "5.408 mil"},
            {"USA", "Washington D.C", "331.9 mil"}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coutriesSpn = (Spinner) findViewById(R.id.countriesSpn);
        result = (TextView) findViewById(R.id.countriesTxt);

        customAdapter custom = new customAdapter(getApplicationContext(), coutnriesArr, countriesCapitalArr, imgId);
        coutriesSpn.setAdapter(custom);

        coutriesSpn.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
    {
        if(i != 0)
        {
            result.setText("Country name: " + countiresInfo[i - 1][0] +  "\n\nCountry capital: " + countiresInfo[i - 1][1] +  "\n\npeoples capcity: " + countiresInfo[i - 1][2]);

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}