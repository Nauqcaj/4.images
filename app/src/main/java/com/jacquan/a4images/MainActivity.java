package com.jacquan.a4images;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {

        ImageView mangaImage = (ImageView) findViewById(R.id.manga);
        mangaImage.setImageResource(R.drawable.big_three);

        Toast.makeText(getApplicationContext(), "Done", Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
