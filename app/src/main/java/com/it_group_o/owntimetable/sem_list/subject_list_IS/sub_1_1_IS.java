package com.it_group_o.owntimetable.sem_list.subject_list_IS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.it_group_o.owntimetable.R;
import com.it_group_o.owntimetable.sem_list.sem_list_1_IS;
import com.it_group_o.owntimetable.sem_list.subject_list_IS.sub_list_webviewdrive_IS.sub_1_1_IS.*;

public class sub_1_1_IS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub11_is);

        ListView sub_list;
        String sub_list_arr[]= {"career Development Plan - IT1072 ","English Study Skills (ICT) - DL1172 "
                ,"Fundamentals of Computer Programming - IT1033 "
                ,"Fundamentals of Computer Systems - IT1043 ","Fundamentals of Visual Computing - IT1062 "
                ,"Information Technology Concepts - IT1022 ","Leadership Training - LS1052 ","Mathematics for IT-I - CM1023 "
                ,"Principles of Management - MF1112 "};

        sub_list = findViewById(R.id.sub_1_1_IS_list);
        ArrayAdapter<String> arr;
        arr
                = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                sub_list_arr);
        sub_list.setAdapter(arr);

        sub_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 //Open a new activity when an item is clicked
                 //Start the appropriate activity based on which item is clicked

                if (position == 0) {
                    Intent intent = new Intent(sub_1_1_IS.this,sub_1_1_1.class);
                    startActivity(intent);
                } else if (position == 1) {
                    Intent intent = new Intent(sub_1_1_IS.this, sub_1_1_2.class);
                    startActivity(intent);
                }
                else if (position == 2) {
                    Intent intent = new Intent(sub_1_1_IS.this, sub_1_1_3.class);
                    startActivity(intent);

                }
                else if (position == 3) {
                    Intent intent = new Intent(sub_1_1_IS.this, sub_1_1_4.class);
                    startActivity(intent);
                }
                else if (position == 4) {
                    Intent intent = new Intent(sub_1_1_IS.this, sub_1_1_5.class);
                    startActivity(intent);
                }
                else if (position == 5) {
                    Intent intent = new Intent(sub_1_1_IS.this, sub_1_1_6.class);
                    startActivity(intent);
                }
                else if (position == 6) {
                    Intent intent = new Intent(sub_1_1_IS.this, sub_1_1_7.class);
                    startActivity(intent);
                }
                else if (position == 7) {
                    Intent intent = new Intent(sub_1_1_IS.this, sub_1_1_8.class);
                    startActivity(intent);
                }
                else if (position == 8) {
                    Intent intent = new Intent(sub_1_1_IS.this, sub_1_1_9.class);
                    startActivity(intent);
                }
            }

        });
}
}
