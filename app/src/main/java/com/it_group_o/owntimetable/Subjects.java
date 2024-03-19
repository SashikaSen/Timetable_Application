package com.it_group_o.owntimetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Subjects extends AppCompatActivity {

    ListView l;
    String streams[]
            = { "Bsc Information Technology","Bsc Information Systems" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);

        l = findViewById(R.id.stream_list);
        ArrayAdapter<String> arr;
        arr
                = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                streams);
        l.setAdapter(arr);

        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Open a new activity when an item is clicked
                // Start the appropriate activity based on which item is clicked
                if (position == 0) {
                    Intent intent = new Intent(Subjects.this, year_IT.class);
                    startActivity(intent);
                } else if (position == 1) {
                    Intent intent = new Intent(Subjects.this, year_IS.class);
                    startActivity(intent);
                }

            }
        });
    }
}


