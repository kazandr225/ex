package com.example.testapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;

public class DecodeImage {
    Context mContext;
    public DecodeImage(Context mContext) {
        this.mContext = mContext;
    }

    public Bitmap getUserImage(String ecnodeImg)
    {
        if(ecnodeImg!=null&& !ecnodeImg.equals("null"))
        {
            byte[] bytes = android.util.Base64.decode(ecnodeImg, Base64.DEFAULT);
            return BitmapFactory.decodeByteArray(bytes,0, bytes.length);
        }
        else
            return BitmapFactory.decodeResource(DecodeImage.this.mContext.getResources(), R.drawable.ic_launcher_background);
    }
}
