package com.example.vanqu.listview_advanced.model;

/**
 * Created by vanqu on 07/18/17.
 */

public class Contact {
    int mcolor;
    String mname;
    String mNumber;

    public Contact(int mcolor, String mname, String mNumber) {
        this.mcolor = mcolor;
        this.mname = mname;
        this.mNumber = mNumber;
    }

    public int getMcolor() {
        return mcolor;
    }

    public void setMcolor(int  mcolor) {
        this.mcolor = mcolor;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getmNumber() {
        return mNumber;
    }

    public void setmNumber(String mNumber) {
        this.mNumber = mNumber;
    }
}
