package com.example.android.inclassassignment05_katieb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class PersonInfo extends AppCompatActivity {

    private EditText personalName;
    private EditText personalCity;
    private CheckBox personalPlastic;
    private CheckBox personalVeg;
    private CheckBox personalTransport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_info);

        personalName = (EditText) findViewById(R.id.name);
        personalCity = (EditText) findViewById(R.id.zip_code);
        personalPlastic = (CheckBox) findViewById(R.id.plastic);
        personalVeg = (CheckBox) findViewById(R.id.veg_stuff);
        personalTransport = (CheckBox) findViewById(R.id.transport);


    }

    public void calculateIt(View view) {
        String name = personalName.getText().toString();
        int zipCode = Integer.parseInt(personalCity.getText().toString());
        boolean plastic = personalPlastic.isChecked();
        boolean veg = personalVeg.isChecked();
        boolean transport = personalTransport.isChecked();
        String carbonMessage;

        if (plastic && !veg & !transport || veg && !plastic && !transport || transport
                && !plastic && !veg) {
            carbonMessage = "Your carbon footprint is not bad today! Try more tomorrow.";
        } else if (plastic && veg && transport) {
            carbonMessage = "You are a climate hero! Way to go.";
        } else if (!plastic && !veg && !transport) {
            carbonMessage = "C'mon dude...";
        } else {
            carbonMessage = "Nice job. You're on your way";
        }

        Intent intent = new Intent(this, ShowFootprint.class);

        CarbonFootprint c = new CarbonFootprint(name, zipCode, plastic, veg, transport);

        intent.putExtra(Keys.CARBON, c);
        intent.putExtra(Keys.STRING, carbonMessage);

        startActivity(intent);
    }
}
