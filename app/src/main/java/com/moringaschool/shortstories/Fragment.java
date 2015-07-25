package com.moringaschool.shortstories;

import android.app.ListFragment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;


public class Fragment extends ListFragment {

        public static String[] ShortStories = {"ReDefinition", "OneResolution", "Silence", "Love", "Pray", "Remember", "Defending", "ShadyGlasses"};
        public static int[] images = {};
   public Fragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.activity_fragment, container,false);
        setListAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, ShortStories ));
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
