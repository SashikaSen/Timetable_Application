package com.it_group_o.owntimetable.sem_list.subject_list_IS;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.it_group_o.owntimetable.R;

public class sub_3_1_IS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub31_is);

        ListView sub_list;
        String sub_list_arr[]= {"Accounting Priciples and Costing-IS3022","Principles of Economics-IS3042","Strategic Management-IS3053 ","Computer Ethics and IT Law-IT3082","Knowledge Management-IS3062","Advanced Web Technologies-IT3063","Enterprise Resource Planning Systems-IT3072","Operational Research-CM3013"};
        sub_list = findViewById(R.id.sub_3_1_IS_list);
        ArrayAdapter<String> arr;
        arr
                = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                sub_list_arr);
        sub_list.setAdapter(arr);
    }
}