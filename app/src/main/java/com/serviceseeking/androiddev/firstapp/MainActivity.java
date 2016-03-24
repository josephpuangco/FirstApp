package com.serviceseeking.androiddev.firstapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    TextView lbl_text;
    Button btn_parse;
    Developer dev;

    JsonUtil jsonUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lbl_text = (TextView) findViewById(R.id.lbl_text);
        btn_parse = (Button) findViewById(R.id.btn_parse);


        final String strJson = "{ \"Android\" :[{\"dev_n\":\"Peter\",\n" +
                "                                  \"dev_s\":\"100\",\n" +
                "                                  \"dev_ln\":\"Parker\"\n" +
                "                                },\n" +
                "                                { \"dev_n\":\"Bruce\",\n" +
                "                                   \"dev_s\":\"73\",\n" +
                "                                   \"dev_ln\":\"Wayne\"" +
                "                                },\n"+
                "                                { \"dev_s\":\"99\", \n" +
                "                                   \"dev_n\":\"Barry\", \n" +
                "                                   \"dev_ln\":\"Allen\"" +
                "                                } ] }";



        // adding comments here
        Log.i("ooh","yeah");
        Log.i("ooh","yeah");



                btn_parse.setOnClickListener(new OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        String OutputData = "";
                        JSONObject jsonResponse;

                        try {

                            Log.i("JSOOONO", "h " + strJson);
                            jsonResponse = new JSONObject(strJson);


                            JSONArray jsonMainNode = jsonResponse.optJSONArray("Android");

                            int lengthJsonArr = jsonMainNode.length();

                            for (int i = 0; i < lengthJsonArr; i++) {
                                JSONObject jsonChildNode = jsonMainNode.getJSONObject(i);

                                int dev_s = Integer.parseInt(jsonChildNode.optString("dev_s"));
                                String dev_n = jsonChildNode.optString("dev_n");
                                String dev_ln = jsonChildNode.optString("dev_ln");


                                OutputData += "Devs : \n\n     " + dev_s + " | "
                                        + dev_n + " | "
                                        + dev_ln + " \n\n ";

                            }

                            Log.i("output", "= " + OutputData);
                            lbl_text.setText(OutputData);

                        } catch (JSONException e) {

                            e.printStackTrace();
                        }


                    }

                });
    }





}