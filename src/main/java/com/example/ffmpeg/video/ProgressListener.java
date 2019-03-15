package com.example.ffmpeg.video;

import ws.schild.jave.EncoderProgressListener;
import ws.schild.jave.MultimediaInfo;


/**
 * @author sunjing
 * @create 2018-11-19 14:35
 **/
public class ProgressListener implements EncoderProgressListener {

    @Override
    public void sourceInfo(MultimediaInfo multimediaInfo) {
        System.out.println(multimediaInfo);
    }

    @Override
    public void progress(int i) {
        System.out.println(i);
    }

    @Override
    public void message(String s) {
        System.out.println(s);
    }
}
