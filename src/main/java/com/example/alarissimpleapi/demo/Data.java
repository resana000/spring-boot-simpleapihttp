package com.example.alarissimpleapi.demo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Time;
import java.util.Date;

@lombok.Data
public class Data {

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;

    @JsonFormat(pattern = "hh:mm")
    private Date time;

    private String rows;
}
