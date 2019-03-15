package com.example.ffmpeg.bean;

import lombok.Getter;
import lombok.Setter;

/**
 * @author sunjing
 * @create 2019-03-15 11:15
 **/
@Getter
@Setter
public class KeyFrameInfo {
    private int width;
    private int height;
    private int seconds;
    /**
     * 图像质量1~31，31最差
     */
    private int quality;
}
