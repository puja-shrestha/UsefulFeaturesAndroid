package com.example.puza.usefulfeatures.expandableListViewWIthImagesAndTexts;

import java.util.ArrayList;

public class Team {

    //PROPERTIES OF A SINGLE TEAM
    public String Name;
    public String Image;
    public String Btn;
    public ArrayList<String> players=new ArrayList<String>();

    public Team(String name, String btn) {
        Name = name;
        Btn = btn;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return Name;
    }
}
