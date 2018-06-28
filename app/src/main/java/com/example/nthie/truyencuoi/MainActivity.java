package com.example.nthie.truyencuoi;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.nthie.truyencuoi.icon.IconFragment;
import com.example.nthie.truyencuoi.topic.ToppicFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addStoreFragment();
    }
    private void addStoreFragment(){
        ToppicFragment fragment = new ToppicFragment();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.qwerty,fragment,ToppicFragment.class.getName());
        transaction.commit();
    }
    public void openStore(String name){
        IconFragment iconFragment = new IconFragment();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        Bundle bundle = new Bundle();
        bundle.putString("NAME",name);
        iconFragment.setArguments(bundle);
        transaction.replace(R.id.qwerty,
                iconFragment,IconFragment.class.getName());

        transaction.addToBackStack(null);
        transaction.commit();
    }

}
