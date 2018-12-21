package com.example.shavira.projectfirebase;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class FirstScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstscreen);
        //intent halaman utama ke kamera
        Button btn = (Button) findViewById(R.id.btnKamera);
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent i = new Intent(FirstScreen.this, CameraApi.class);
                startActivity(i);
            }
        });
    }
    //intent halaman utama ke fragment ootd
    public void Pindah(View view) {
        Intent intent = new Intent(FirstScreen.this, MainActivity.class);
        startActivity(intent);
    }
    //action button logout
    public void logout() {
        //signout
        FirebaseAuth.getInstance().signOut();

        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
    }
}
