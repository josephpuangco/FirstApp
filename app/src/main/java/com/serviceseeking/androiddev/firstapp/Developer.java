package com.serviceseeking.androiddev.firstapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by androiddev on 3/15/16.
 */
public class Developer {
    public String dev_fname = "";
    public String dev_lname ="";
    public List<Score> dev_score;

    public List<Score> getDev_score() {
        return dev_score;
    }

    public void setDev_score(List<Score> dev_score) {
        this.dev_score = dev_score;
    }

    public String getDev_fname() {
        return dev_fname;
    }

    public void setDev_fname(String dev_fname) {
        this.dev_fname = dev_fname;
    }

    public String getDev_lname() {
        return dev_lname;
    }

    public void setDev_lname(String dev_lname) {
        this.dev_lname = dev_lname;
    }




    public Developer(String dev_fname, String dev_lname) {
        this.dev_fname = dev_fname;
        this.dev_lname = dev_lname;
    }
}
