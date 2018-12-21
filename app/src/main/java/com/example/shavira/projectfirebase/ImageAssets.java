package com.example.shavira.projectfirebase;

import java.util.ArrayList;
import java.util.List;

public class ImageAssets {

    //variable ini adalah variable pengelompokan bodies mengguanakan ArrayList
    //private supaya tidak bisa di akses kelas lain
    private static List<Integer> bodies = new ArrayList<Integer>(){{
        add(R.drawable.body1);
        add(R.drawable.body2);
        add(R.drawable.body3);
//        add(R.drawable.body4);
//        add(R.drawable.body5);

    }};
    //variable ini adalah variable pengelompokan legs mengguanakan ArrayList
    //private supaya tidak bisa di akses kelas lain
    private static List<Integer> legs = new ArrayList<Integer>(){{
        add(R.drawable.legs1);
        add(R.drawable.legs2);
        add(R.drawable.legs3);
//        add(R.drawable.legs4);
//        add(R.drawable.legs5);


    }};

    //methode yang di gunakan untuk memanggil/mengambil variable Bodies
    public static List<Integer> getBodies(){
        return bodies;
    }
    //methode yang di gunakan untuk memanggil/mengambil variable Legs
    public static List<Integer> getLegs(){
        return legs;
    }
}

