package com.it_group_o.owntimetable.sem_list.subject_list_IT;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.it_group_o.owntimetable.R;

public class sub_4_1_IT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub41_it);

        ListView sub_list;
        String sub_list_arr[]= {"1","2","3","4","5","6","7","8"};

        sub_list = findViewById(R.id.sub_4_1_IT_list);
        ArrayAdapter<String> arr;
        arr
                = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                sub_list_arr);
        sub_list.setAdapter(arr);
    }
}