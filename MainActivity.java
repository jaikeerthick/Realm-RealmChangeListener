package com.example.application;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import io.realm.Realm;
import io.realm.RealmChangeListener;

public class MainActivity extends AppCompatActivity {

    Realm realm;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Realm.init(this);
        realm = Realm.getDefaultInstance();

        RealmChangeListener realmChangeListener = new RealmChangeListener() {
            @Override
            public void onChange(Object o) {
                // code to execute in onChange
            }
        };
    }
}
