package com.example.fragmentcommunication_final;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.SurfaceControl;

public class MainActivity extends AppCompatActivity implements Communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* FirstfragmentTestmode fragment = new FirstfragmentTestmode();
        FragmentManager manager =getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        transaction.add(R.id.layout_container,fragment,"dynamic method");
        transaction.commit();*/


    }

    @Override
    public void respond(String data) {


        FragmentManager manager= getSupportFragmentManager();
        SecondfragmentTestmode secondf = (SecondfragmentTestmode) manager.findFragmentById(R.id.fragmentB);

        secondf.changetext(data);
    }
}
