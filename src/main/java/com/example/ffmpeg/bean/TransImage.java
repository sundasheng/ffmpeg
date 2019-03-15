package com.example.ffmpeg.bean;

import lombok.Getter;
import lombok.Setter;

/**
 * @author sunjing
 * @create 2019-03-15 10:44
 **/
@Setter
@Getter
public class TransImage {
    private int width;
    private int height;
    private WaterMarkInfo waterMarkInfo;
    private String format;
    private String targetPath;
}
