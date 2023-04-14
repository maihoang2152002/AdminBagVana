package com.example.adminbagvana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class StatisticsActivity extends AppCompatActivity {

    ImageView back;
    TextView total, now, yesterday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);

        loadFragment(new StatisticsFragment("0"));

        back = findViewById(R.id.imageView);
        total = findViewById(R.id.total);
        now = findViewById(R.id.now);
        yesterday = findViewById(R.id.yesterday);

        total.setOnClickListener(v -> {
            loadFragment(new StatisticsFragment("0"));
        });
        now.setOnClickListener(v -> {
            loadFragment(new StatisticsFragment("1"));
        });
        yesterday.setOnClickListener(v -> {
            loadFragment(new StatisticsFragment("-1"));
        });

    }

    boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }

}
