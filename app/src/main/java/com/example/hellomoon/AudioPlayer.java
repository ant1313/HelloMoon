package com.example.hellomoon;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by Anton on 17.03.2017.
 *
 */

class AudioPlayer {
    private MediaPlayer mPlayer;
    void stop() {
        if (mPlayer != null) {
            mPlayer.release();
            mPlayer = null;
        }
    }
    void play(Context c) {
        stop();

        mPlayer = MediaPlayer.create(c, R.raw.one_small_step);
            mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                stop();
            }
        });

        mPlayer.start();
    }
    void pauseMe() {
        if (mPlayer != null) {
            if (mPlayer.isPlaying()){
                mPlayer.pause();
            }
            else {
                mPlayer.start();
            }
        }
    }
}
