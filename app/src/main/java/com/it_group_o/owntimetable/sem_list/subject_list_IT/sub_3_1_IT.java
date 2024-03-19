package com.it_group_o.owntimetable.sem_list.subject_list_IT;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.it_group_o.owntimetable.R;

public class sub_3_1_IT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub31_it);

        ListView sub_list;
        String sub_list_arr[]= {"Advanced Computer Network Systems-I - IT3043 ","Advanced Multimedia Technologies - IT3023 ","Advanced web Technologies - IT3063 ","Computer Ethics and IT Law - IT3082 ","Enterprise Resourse Planning Systems - IT3072 ","Information and Data Security - IT3033 ","Mobile Computing - IT3093 ","Programming Frameworks - IT3052 ",};

        sub_list = findViewById(R.id.sub_3_1_IT_list);
        ArrayAdapter<String> arr;
        arr
                = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                sub_list_arr);
        sub_list.setAdapter(arr);
    }
}