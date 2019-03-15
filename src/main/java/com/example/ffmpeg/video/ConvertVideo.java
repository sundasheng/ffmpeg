package com.example.ffmpeg.video;



import ws.schild.jave.*;

import java.io.File;
import java.io.IOException;

/**
 * @author sunjing
 * @create 2018-11-19 10:20
 **/
public class ConvertVideo {

    public static void convert() throws EncoderException {
        File source = new File("D:/f.mp4");
        File target = new File("D:/x.mp4");
//        target.setLastModified(System.currentTimeMillis());
//        AudioAttributes audio = new AudioAttributes();
//        audio.setCodec("libfaac");
//        audio.setBitRate(new Integer(98000));
//        audio.setChannels(new Integer(1));
//        audio.setSamplingRate(new Integer(44100));
        VideoAttributes video = new VideoAttributes();
        video.setCodec("mpeg4");
        video.setBitRate(new Integer(14824000));
        video.setFrameRate(new Integer(30));
//        video.setSize(new VideoSize(1280, 720));

        EncodingAttributes attrs = new EncodingAttributes();
        attrs.setFormat("mp4");
//        attrs.setAudioAttributes(audio);
        attrs.setVideoAttributes(video);

        Encoder encoder = new Encoder();

        ProgressListener listener = new ProgressListener();
//        long start =System.currentTimeMillis();
        MultimediaObject multimediaObject = new MultimediaObject(source);
        encoder.encode(multimediaObject, target, attrs,listener);
//        long end =System.currentTimeMillis();
//        System.out.println("转换完成，耗时"+(end-start)/1000+"S");


    }

//    public static void getInfo() throws EncoderException {
//        File source = new File("D:/test/IMG_1544.mov");
//        Encoder encoder = new Encoder();
////        MultimediaInfo info = encoder
//        System.out.println(info);
//    }

    public static void keyFrame() throws EncoderException {
        ScreenExtractor screenExtractor = new ScreenExtractor();
        File source = new File("D:/f.mp4");
        File target = new File("D:/key.jpg");
        MultimediaObject multimediaObject = new MultimediaObject(source);
        screenExtractor.render(multimediaObject,320,180,1,target,1);
    }

    public static void main(String[] args) throws EncoderException, IOException {
//        convert();
//        getInfo();
        keyFrame();
    }

}
