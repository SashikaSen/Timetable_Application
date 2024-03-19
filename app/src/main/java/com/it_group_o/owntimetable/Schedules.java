package com.it_group_o.owntimetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.it_group_o.owntimetable.*;

import com.it_group_o.owntimetable.sch_webview.sch_webview_IS38;
import com.it_group_o.owntimetable.sch_webview.sch_webview_IT38;
import com.it_group_o.owntimetable.sem_list.subject_list_IS.sub_list_webviewdrive_IS.sub_1_1_IS.sub_1_1_1;
import com.it_group_o.owntimetable.sem_list.subject_list_IS.sub_list_webviewdrive_IS.sub_1_1_IS.sub_1_1_2;
import com.it_group_o.owntimetable.sem_list.subject_list_IT.sub_1_1_IT;

public class Schedules extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedules);

        ListView sch_list;
        String sch_list_arr[]= {" 38 IT", "38 IS"};

        sch_list = findViewById(R.id.sch_list);
        ArrayAdapter<String> arr;
        arr
                = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                sch_list_arr);
        sch_list.setAdapter(arr);

        sch_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Open a new activity when an item is clicked
                //Start the appropriate activity based on which item is clicked

                if (position == 0) {
                    Intent intent = new Intent(Schedules.this, sch_webview_IT38.class);
                    startActivity(intent);
                } else if (position == 1) {
                    Intent intent = new Intent(Schedules.this, sch_webview_IS38.class);
                    startActivity(intent);
                }
            }

            });

    }
}