package com.moringaschool.shortstories;

import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class Fragment extends ListFragment {

        public static String[] ShortStories = {"ReDefinition", "OneResolution", "Silence", "Love", "Pray", "Remember", "Defending", "ShadyGlasses"};
        public static int[] images = {R.drawable.redefinition, R.drawable.resolution, R.drawable.silence, R.drawable.trueloveis, R.drawable.pray, R.drawable.remeber, R.drawable.faith, R.drawable.sunglasses};
   public Fragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.activity_fragment, container,false);
        setListAdapter(new Myadapter(getActivity(), R.layout.activity_fragment,ShortStories,images,previews));
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    private class Myadapter extends ArrayAdapter<String>{

        String[] titles, previews;
        int[] images;

        private Myadapter(Context context,int resource, String[] title, int[] images, String[] previews){
            super(context, resource, title);
            this.titles = title;
            this.images = images;
            this.previews = previews;
        }

        @Override
        public View getView(int position, View contentview, ViewGroup parent){
            LayoutInflater inflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = inflater.inflate(R.layout.customize, parent, false);

            ImageView iv = (ImageView) row.findViewById(R.id.oneresolution);
            TextView tv = (TextView) row.findViewById(R.id.titletextview);
            TextView tvv = (TextView) row.findViewById(R.id.previewtextview);
            return row;
        }

    }
}
