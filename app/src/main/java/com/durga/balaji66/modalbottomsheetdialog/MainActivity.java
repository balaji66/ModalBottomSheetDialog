package com.durga.balaji66.modalbottomsheetdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ModelBottomSheetDialog dialog = new ModelBottomSheetDialog();
        dialog.show(getSupportFragmentManager(),"dialog");


    }
}
