package com.it_group_o.owntimetable.sem_list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.it_group_o.owntimetable.R;
import com.it_group_o.owntimetable.sem_list.subject_list_IS.*;

public class sem_list_2_IS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem_list2_is);
        ListView ly_sem;
        String sem_list_1 [] = {"Semester 1", "Semester 2" };


        ly_sem = findViewById(R.id.sem_list_is_2);
        ArrayAdapter<String> arr;
        arr
                = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                sem_list_1);
        ly_sem.setAdapter(arr);

        ly_sem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Open a new activity when an item is clicked
                // Start the appropriate activity based on which item is clicked

                if (position == 0) {
                    Intent intent = new Intent(sem_list_2_IS.this, sub_2_1_IS.class);
                    startActivity(intent);
                } else if (position == 1) {
                    Intent intent = new Intent(sem_list_2_IS.this, sub_2_2_IS.class);
                    startActivity(intent);
                }
            }

        });


    }
}