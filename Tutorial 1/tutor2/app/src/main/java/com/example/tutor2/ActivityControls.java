package com.example.tutor2;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class ActivityControls extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_textview);
    }
}
