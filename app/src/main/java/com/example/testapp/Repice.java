package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;


public class Repice implements Parcelable {

    public Integer idRecipe;
    public String fullRecipe;
    public String nameRecipe;
    public String image;
    public String calory;
    public String timeGot;

    public Integer getIdRecipe() {
        return idRecipe;
    }

    public void setIdRecipe(Integer idRecipe) {
        this.idRecipe = idRecipe;
    }

    public String getFullRecipe() {
        return fullRecipe;
    }

    public void setFullRecipe(String fullRecipe) {
        this.fullRecipe = fullRecipe;
    }

    public String getNameRecipe() {
        return nameRecipe;
    }

    public void setNameRecipe(String nameRecipe) {
        this.nameRecipe = nameRecipe;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCalory() {
        return calory;
    }

    public void setCalory(String calory) {
        this.calory = calory;
    }

    public String getTimeGot() {
        return timeGot;
    }

    public void setTimeGot(String timeGot) {
        this.timeGot = timeGot;
    }



    public Repice(Integer idRecipe, String fullRecipe, String nameRecipe, String image, String calory, String timeGot) {
        this.idRecipe = idRecipe;
        this.fullRecipe = fullRecipe;
        this.nameRecipe = nameRecipe;
        this.image = image;
        this.calory = calory;
        this.timeGot = timeGot;
    }

    protected Repice(Parcel in) {
        idRecipe = in.readInt();
        fullRecipe = in.readString();
        nameRecipe = in.readString();
        image = in.readString();
        calory = in.readString();
        timeGot = in.readString();
    }

    public static final Creator<Repice> CREATOR = new Creator<Repice>() {
        @Override
        public Repice createFromParcel(Parcel in) {
            return new Repice(in);
        }

        @Override
        public Repice[] newArray(int size) {
            return new Repice[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        if (idRecipe == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(idRecipe);
        }
        parcel.writeString(fullRecipe);
        parcel.writeString(nameRecipe);
        parcel.writeString(image);
        parcel.writeString(calory);
        parcel.writeString(timeGot);
    }
}