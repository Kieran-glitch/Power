package com.example.powertrackpro;

import android.os.Parcel;
import android.os.Parcelable;

public class Item implements Parcelable {
    private String name;
    private double watts;
    private double hours;

    public Item(String name, double watts, double hours) {
        this.name = name;
        this.watts = watts;
        this.hours = hours;
    }

    protected Item(Parcel in) {
        name = in.readString();
        watts = in.readDouble();
        hours = in.readDouble();
    }

    public static final Creator<Item> CREATOR = new Creator<Item>() {
        @Override
        public Item createFromParcel(Parcel in) {
            return new Item(in);
        }

        @Override
        public Item[] newArray(int size) {
            return new Item[size];
        }
    };

    public String getName() {
        return name;
    }

    public double getWatts() {
        return watts;
    }

    public double getHours() {
        return hours;
    }

    // Parcelable implementation
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeDouble(watts);
        dest.writeDouble(hours);
    }
}
