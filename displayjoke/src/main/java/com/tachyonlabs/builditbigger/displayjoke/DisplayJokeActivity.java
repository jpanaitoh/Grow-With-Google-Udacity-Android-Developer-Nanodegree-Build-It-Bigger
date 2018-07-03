package com.tachyonlabs.builditbigger.displayjoke;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);
        TextView tvJoke = findViewById(R.id.tv_joke);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null && bundle.containsKey("joke")) {
            tvJoke.setText(bundle.getString("joke"));
        }
    }
}
