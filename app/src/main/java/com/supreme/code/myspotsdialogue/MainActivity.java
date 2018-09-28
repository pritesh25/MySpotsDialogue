package com.supreme.code.myspotsdialogue;

import android.app.AlertDialog;
import android.content.Context;
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
        //new SpotsDialog.Builder().setContext(this).setMessage("Please wait while singning").build().show();

        AlertDialog dialog = new SpotsDialog(this, "Please wait...", R.style.SpotsDialogDefault,false, null);
        dialog.show();


    }
}
