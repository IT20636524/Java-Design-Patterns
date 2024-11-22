package com.android;

public class ListenMusic {
    private AndroidHeadset headset;

    public ListenMusic(AndroidHeadset headset) {
        this.headset = headset;
    }

    public void listenSong(String str) {
        headset.giveSound(str);
    }
}
