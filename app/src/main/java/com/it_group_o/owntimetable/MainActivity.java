package com.it_group_o.owntimetable;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView MainList;

    String SubjectList[] = {"Subjects", "Schedules", "LMS Portal", "About"};
    int img[] = {R.drawable.books, R.drawable.todo_list, R.drawable.lms, R.drawable.about,};

    String des[]={"This is Subjects section","This is Schedules and timetables",
            "This is academy details","Settings for user","User details","About us"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainList = findViewById(R.id.MainList);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), SubjectList, img);
        MainList.setAdapter(customAdapter);
    }

    public class CustomAdapter extends BaseAdapter {
        Context context;
        String SubjectList[];
        int img[];


        LayoutInflater inflter;

        public CustomAdapter(Context applicationContext, String[] countryList, int[] flags) {
            this.context = applicationContext;
            this.SubjectList = countryList;
            this.img = flags;

            inflter = LayoutInflater.from(applicationContext);
        }

        @Override
        public int getCount() {
            return SubjectList.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            try{
            view = inflter.inflate(R.layout.activity_listview, null);
            TextView country = view.findViewById(R.id.title);
            ImageView icon = view.findViewById(R.id.icon);

            country.setText(SubjectList[i]);
            icon.setImageResource(img[i]);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Open the corresponding activity based on the clicked item
                    if (SubjectList[i].equals("Subjects")) {
                        Intent intent = new Intent(context, Subjects.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent);
                    } else if (SubjectList[i].equals("Schedules")) {
                        Intent intent = new Intent(context, Schedules.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent);
                    }  else if (SubjectList[i].equals("LMS Portal")) {
                        Intent intent = new Intent(context, LMS_Portal.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent);
                    } else if (SubjectList[i].equals("About")) {
                        Intent intent = new Intent(context, About.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent);
                    }
                }
            });
            } catch (Exception e) {
                e.printStackTrace();
            }
            return view;
        }
    }
    public void onBackPressed() {
        finish();
    }
}
