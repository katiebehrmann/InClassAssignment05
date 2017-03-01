package com.example.android.inclassassignment05_katieb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ShowFootprint extends AppCompatActivity {

    private TextView displayFootprint;
    private TextView howYouDid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_footprint);

        displayFootprint = (TextView) findViewById(R.id.display_footprint);
        howYouDid = (TextView) findViewById(R.id.how_ya_did);

        Intent intent = getIntent();
        CarbonFootprint c = (CarbonFootprint) intent.getSerializableExtra(Keys.CARBON);
        String message = intent.getStringExtra(Keys.STRING);
        displayFootprint.setText(c.toString());
        howYouDid.setText(message);
    }
}
