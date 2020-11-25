package com.example.topmarks3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.topmarks3.R;

import java.text.BreakIterator;

public class CreateCourse extends AppCompatActivity {

    EditText editCourseName;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_course);

       Toolbar toolbar2 = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar2);
        Button Create = (Button) findViewById(R.id.Create);
        editCourseName = (EditText) findViewById(R.id.courseName);
        result = (TextView) findViewById(R.id.CourseNameshow);

        Create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String courseName = editCourseName.getText().toString();
                result.setText(courseName);
                startActivity(new Intent(CreateCourse.this, CourseView.class));
            }
        });
    }

}