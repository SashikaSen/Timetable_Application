package com.it_group_o.owntimetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.it_group_o.owntimetable.sem_list.sem_list_1_IS;

import com.it_group_o.owntimetable.sem_list.sem_list_2_IS;

import com.it_group_o.owntimetable.sem_list.sem_list_3_IS;

import com.it_group_o.owntimetable.sem_list.sem_list_4_IS;


public class year_IS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year_is);

        ListView ly;
        String IT_years[]
                = { "Year 1","Year 2","Year 3","Year 4" };

        ly = findViewById(R.id.year_list_is);
        ArrayAdapter<String> arr;
        arr
                = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                IT_years);
        ly.setAdapter(arr);

        ly.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Open a new activity when an item is clicked
                // Start the appropriate activity based on which item is clicked

                if (position == 0) {
                    Intent intent = new Intent(year_IS.this, sem_list_1_IS.class);
                    startActivity(intent);
                }
                else if(position==1){
                    Intent intent = new Intent(year_IS.this, sem_list_2_IS.class);
                    startActivity(intent);
                } else if (position==2) {
                    Intent intent = new Intent(year_IS.this, sem_list_3_IS.class);
                    startActivity(intent);

                } else if (position==3) {
                    Intent intent = new Intent(year_IS.this, sem_list_4_IS.class);
                    startActivity(intent);
                }


            }
});
    }
}