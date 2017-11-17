package com.wouter.samy.zombiesatgroupt;

import android.content.Context;
import android.media.MediaPlayer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by samy on 17/11/2017.
 */

public class SoundManager {

//    static Map<String,MediaPlayer> mps = new ArrayList<>();
    public static Map mps = new HashMap();


    public static MediaPlayer findMediaPlayer(String key){
       return (MediaPlayer) mps.get(key);
    }
    public static void addSong(Context context, int song,String name){
        MediaPlayer mp = MediaPlayer.create(context,song);
        mps.put(name,mp);
    }

    public static void stopSong(String name){
     //   MediaPlayer mp = (MediaPlayer) mps.get(name);
     //   mp.stop();
    }

    public static void playSong(String name){
      //  MediaPlayer mp = (MediaPlayer) mps.get(name);
       // mp.start();
    }
}
