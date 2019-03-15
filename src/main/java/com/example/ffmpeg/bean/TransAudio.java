package com.example.ffmpeg.bean;

import lombok.Getter;
import lombok.Setter;

/**
 * @author sunjing
 * @create 2019-03-15 11:23
 **/
@Getter
@Setter
public class TransAudio {
    private AudioInfo audioInfo;
    private String format;
    private String targetPath;
}
