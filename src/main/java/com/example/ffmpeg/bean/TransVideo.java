package com.example.ffmpeg.bean;


import lombok.Getter;
import lombok.Setter;

/**
 * @author sunjing
 * @create 2019-03-15 10:12
 **/
@Getter
@Setter
public class TransVideo {
    private VideoInfo videoInfo;
    private AudioInfo audioInfo;
    private String format;
    private String targetPath;
}
