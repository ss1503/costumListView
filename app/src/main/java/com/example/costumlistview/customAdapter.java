package com.example.costumlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class customAdapter extends BaseAdapter {
    Context context;
    String[] cityList;
    String[] capitalList;
    int[] symbols;
    LayoutInflater inflter;

    public customAdapter(Context applicationContext, String[] cityList, String[] capitalList, int[] symbols) {
        this.context = applicationContext;
        this.cityList = cityList;
        this.symbols = symbols;
        this.capitalList = capitalList;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return cityList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.custom, null);
        TextView city = (TextView) view.findViewById(R.id.tV1);
        TextView capital = (TextView) view.findViewById(R.id.tV2);
        ImageView symbol = (ImageView) view.findViewById(R.id.iV);
        city.setText(cityList[i]);
        capital.setText(capitalList[i]);
        symbol.setImageResource(symbols[i]);
        return view;
    }
}
