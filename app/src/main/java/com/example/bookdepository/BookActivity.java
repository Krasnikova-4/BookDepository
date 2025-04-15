package com.example.bookdepository;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

public class BookActivity extends FragmentActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_book);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.fragmentContainer), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            FragmentManager fm = getSupportFragmentManager();
            Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);
            if (fragment == null) {
                fragment = new BookFragment();
                fm.beginTransaction()
                        .add(R.id.fragmentContainer, fragment)
                        .commit();
            }
            return insets;
        });
    }
}