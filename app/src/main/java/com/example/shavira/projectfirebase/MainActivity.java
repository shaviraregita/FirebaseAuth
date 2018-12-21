package com.example.shavira.projectfirebase;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Write a message to the database
        // line dibawah untuk membuat variabel 'database'
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        // membuat variabel myRef
        DatabaseReference myRef = database.getReference("message");

        myRef.setValue("Hello, World!");
        // untuk membuat agar fragment hanya dibuat sekali saja
        if (savedInstanceState == null){
            BodyPartsFragments bodyFragment;
            //mengambil fragment Bodies
            bodyFragment = new BodyPartsFragments();
            bodyFragment.setmImageIds(ImageAssets.getBodies());
            bodyFragment.setmListIndex(0);
            //inisiasi adapter untuk mengaktifkan fragment Head
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().add(R.id.bodies_container, bodyFragment).commit();

            //mengambil fragment Legs
            bodyFragment = new BodyPartsFragments();
            bodyFragment.setmImageIds(ImageAssets.getLegs());
            bodyFragment.setmListIndex(0);
            fragmentManager.beginTransaction().add(R.id.legs_container, bodyFragment).commit();
        }
    }
}
