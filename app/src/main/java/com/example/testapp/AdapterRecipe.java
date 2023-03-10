package com.example.testapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterRecipe extends BaseAdapter {

    /*private Context mContext;
    List<Repice> repiceList;

    public AdapterRecipe(Context mContext, List<Repice> repiceList) {
        this.mContext = mContext;
        this.repiceList = repiceList;
    }


    @Override
    public int getCount() {
        return repiceList.size();
    }

    @Override
    public Object getItem(int i) {
        return repiceList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return repiceList.get(i).getIdRecipe();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = View.inflate(mContext, R.layout.activity_repice,null);

        TextView fullRec = v.findViewById(R.id.txtFull);
        TextView nameRec = v.findViewById(R.id.txtName);
        ImageView imageView = v.findViewById(R.id.imageView2);
        TextView caloryText = v.findViewById(R.id.txtCalory);
        TextView timeText = v.findViewById(R.id.txtTime);
        Repice repice = repiceList.get(i); //Запомнили

        DecodeImage decodeImage = new DecodeImage(mContext);
        imageView.setImageBitmap(decodeImage.getUserImage(repice.getImage()));

        caloryText.setText(repice.getCalory());


        return v;
    }
     */

    private Context mContext;
    List<Repice> repiceList;

    public AdapterRecipe(Context mContext, List<Repice> repiceList) {
        this.mContext = mContext;
        this.repiceList = repiceList;
    }


    @Override
    public int getCount() {
        return repiceList.size();
    }

    @Override
    public Object getItem(int i) {
        return repiceList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return repiceList.get(i).getIdRecipe();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = View.inflate(mContext, R.layout.activity_repice,null);
        TextView fullRec = v.findViewById(R.id.txtFull);
        TextView nameRec = v.findViewById(R.id.txtName);
        ImageView imageView = v.findViewById(R.id.imageView2);
        TextView caloryText = v.findViewById(R.id.txtCalory);
        TextView timeText = v.findViewById(R.id.txtTime);
        Repice recipe = repiceList.get(i); //запомнить

        DecodeImage decodeImage = new DecodeImage(mContext);
        imageView.setImageBitmap(decodeImage.getUserImage(recipe.getImage()));
        caloryText.setText(recipe.getCalory());
        timeText.setText(recipe.getTimeGot());

        fullRec.setText(recipe.getFullRecipe());
        nameRec.setText(recipe.getNameRecipe());


        return null;
    }
}
