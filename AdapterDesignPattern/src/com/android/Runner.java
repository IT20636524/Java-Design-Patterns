package com.android;

public class Runner {
    public static void main(String[] args) {
        //create a object using Adapter class
        AndroidHeadset ahs = new HeadsetAdapter();
        ListenMusic lm = new ListenMusic(ahs);

        lm.listenSong("Hello");
    }
}
