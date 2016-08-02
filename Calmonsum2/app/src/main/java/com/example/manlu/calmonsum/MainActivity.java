package com.example.manlu.calmonsum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;
    ImageView imageView;
    ProgressBar progressBar;
    HorizontalScrollView horizontalScrollView;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.yearTextView);
        button = (Button) findViewById(R.id.addButton);
        button = (Button) findViewById(R.id.setupButton);
        imageView = (ImageView) findViewById(R.id.rabbitImageView);
        textView = (TextView) findViewById(R.id.rabbitTextView);
        textView = (TextView) findViewById(R.id.budgetTextView);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        horizontalScrollView = (HorizontalScrollView) findViewById(R.id.horizontalScrollView);
        listView = (ListView) findViewById(R.id.addListView);
        listView = (ListView) findViewById(R.id.spendListView);

        Log.d("Debug", "MainActivity OnCreate");
    }

    protected void onStart(){
        super.onStart();
        Log.d("Debug", "MainActivity onStart");
    }

    protected void onResume(){
        super.onResume();
        Log.d("Debug", "MainActivity onResume");

    }

    protected void onPause(){
        super.onPause();
        Log.d("Debug","MainActivity onPause");
    }

    protected void onStop(){
        super.onStop();
        Log.d("Debug","MainActivity onStop");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.d("Debug","MainActivity onDestroy");
    }

    protected void onRestart(){
        super.onRestart();
        Log.d("Debug","MainActivity onRestart");
    }
}
