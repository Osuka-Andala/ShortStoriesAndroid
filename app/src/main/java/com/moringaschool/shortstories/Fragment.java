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
        public static String[] previews ={"You may have noticed that I have not written anything in a long time.\n" +
                "I will not make any excuses but I will give you an actual reason... ", "Last year i remember making a resolution to post something at least every week. Well, that did not pan out so well, did it?...", "Despite what many think, being a girl in your twenties is really hard. These are your glory years when...", "I want love...I want to wake up at 3 am in the morning just to make sure I am alive because I cant wait to see your face....", "There's nothing that hurts more than when the person you love says they are miserable and it is because of you...", "Life is a Bitch, that's for sure. But when dealing with a bitch, there are ways around it. She is either your friend or your enemy. As your friend, she will love you with...", "The best part about being able to express yourself through words, i could say 'being a writer' but I would be lying if I told I know what being a writer is all about, is the part where every article you come up...", "Looking at the sun through shady glasses\n" +
                "But I see nothing in its mass of gasses\n" +
                "Light so bright blinding the masses\n" +
                "They don't realize they no longer in darkness..."};


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
