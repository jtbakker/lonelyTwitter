package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by mushm on 2018-02-14.
 */

public class TweetList {
    private ArrayList<Tweet> TL = new ArrayList<Tweet>();

    public boolean hasTweet(Tweet tweet) {
        return TL.contains(tweet);
    }

    public void addTweet (Tweet tweet) throws IllegalArgumentException {
        if (hasTweet(tweet)) {
            throw new IllegalArgumentException();
        }
        TL.add(tweet);
    }

    public Tweet getTweet(int index) {
        return TL.get(index);
    }

    public void delete(Tweet tweet) {
        TL.remove(tweet);
    }

    public int getCount() {
        return TL.size();
    }

    public ArrayList<Tweet> getTweets() {
        Collections.sort(TL, new Comparator<Tweet>() {
            public int compare(Tweet t1, Tweet t2) {
                return t1.getDate().compareTo(t2.getDate());
            }
        });
        return TL;
    }

}
