package com.example.fragment_tutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import java.util.concurrent.Callable;

public class MainActivity extends AppCompatActivity {

    Button Chats,Status ,Call;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Chats=findViewById(R.id.chats);
        Status=findViewById(R.id.Status);
        Call=findViewById(R.id.Calls);
        frameLayout=findViewById(R.id.framelayout);

        loadfragment(new ChatsFragment());

        Chats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadfragment(new ChatsFragment());

            }
        });


        Status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadfragment(new StatusFragment());

            }
        });

        Call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadfragment(new CallsFragment());

            }
        });

    }

    public void loadfragment(Fragment fragment){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.add(R.id.framelayout,fragment);
        ft.commit();
    }
}