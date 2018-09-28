package com.supreme.code.myspotsdialogue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.supreme.code.myspotsdialogue.Lib.SpotsDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void showProgress(View view)
    {
        new SpotsDialog.Builder().setContext(this).setMessage("Please wait while singning").build().show();
    }
}
