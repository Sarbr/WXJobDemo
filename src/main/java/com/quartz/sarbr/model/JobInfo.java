package com.quartz.sarbr.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Setter
@Getter
public class JobInfo implements Serializable {
    private String key;

    private String value;

    private String desc;
}
