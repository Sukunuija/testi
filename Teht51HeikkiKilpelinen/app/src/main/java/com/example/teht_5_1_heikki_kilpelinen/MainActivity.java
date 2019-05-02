package com.example.teht_5_1_heikki_kilpelinen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Metodit";

    CycleCounter counter = new CycleCounter()();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate metodi kutsuttiin");
        setContentView(R.layout.activity_main);

        counter.creationsCount++;

        TextView creations = findViewById(R.id.creationsOut);
        TextView starts = findViewById(R.id.startsOut);
        TextView resumes = findViewById(R.id.resumesOut);

        creations.setText(counter.creationsCount);
        starts.setText(counter.startsCount);
        resumes.setText(counter.resumesCount);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() metodi kutsuttiin");
        counter.startsCount++;

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() metodi kutsuttiin");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() metodi kutsuttiin");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() metodi kutsuttiin");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() metodi kutsuttiin");
    }

}
