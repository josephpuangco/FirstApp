package com.serviceseeking.androiddev.firstapp;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by androiddev on 3/15/16.
 */
public class JsonUtil {



    public static String toJson(Developer dev){
    try {
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("dev_fname", dev.getDev_fname());
        jsonObj.put("dev_lname", dev.getDev_lname());

        JSONArray jsonArray = new JSONArray();

        for(Score scr : dev.getDev_score()){
            JSONObject scrObj = new JSONObject();
            scrObj.put("scoredesc",scr.getScoredesc());
            scrObj.put("scorenum",scr.getNumscore());


            jsonArray.put(scrObj);

        }
            jsonObj.put("Score", jsonArray);

            Log.i("JASON","JASON: "+jsonObj.toString());
        return jsonObj.toString();


    }catch (JSONException ex){
        ex.printStackTrace();
    }
        return null;

    }
}
