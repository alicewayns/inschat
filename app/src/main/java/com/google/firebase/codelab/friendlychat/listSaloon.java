package com.google.firebase.codelab.friendlychat;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nesab on 20/04/2017.
 */

public class listSaloon extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView mListView = (ListView) findViewById(R.id.listViewSaloon);

        List<Saloon> messages = genererSaloons();

        SaloonAdapter adapter = new SaloonAdapter(listSaloon.this, messages);
        mListView.setAdapter(adapter);

        registerClickCallback();
    }

    private List<Saloon> genererSaloons(){
        List<Saloon> tweets = new ArrayList<Saloon>();
        tweets.add(new Saloon(Color.BLACK, "Florent", "Mon premier tweet !"));
        tweets.add(new Saloon(Color.BLUE, "Kevin", "C'est ici que ça se passe !"));
        tweets.add(new Saloon(Color.GREEN, "Logan", "Que c'est beau..."));
        tweets.add(new Saloon(Color.RED, "Mathieu", "Il est quelle heure ??"));
        tweets.add(new Saloon(Color.GRAY, "Willy", "On y est presque"));
        return tweets;
    }


    private void registerClickCallback() {

        ListView mListView = (ListView) findViewById(R.id.listViewSaloon);

    }
}