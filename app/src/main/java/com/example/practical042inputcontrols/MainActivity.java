package com.example.practical042inputcontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {
        StringBuffer toppings = new
                StringBuffer().append(getString(R.string.toppings_label));
        if(chocolate){
            toppings.append(getString(R.string.chocolate_syrup_text));
        }
        if(sprinkles){
            toppings.append(getString(R.string.sprinkles_text));
        }
        if(nuts){
            toppings.append(getString(R.string.crushed_nuts_text));
        }
        if(cherries){
            toppings.append(getString(R.string.cherries_text));
        }
        if(orio){
            toppings.append(getString(R.string.orio_cookies_crumbles_text));
        }
        String toast_message = toppings.toString();
        Toast toast=Toast.makeText(this,toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }


public boolean chocolate,sprinkles,nuts,cherries,orio;
    public void onSubmit(View view) {
        chocolate = ((CheckBox)findViewById( R.id.chocolate_syrup)).isChecked();
        sprinkles = ((CheckBox)findViewById(R.id.sprinkles)).isChecked();
        nuts = ((CheckBox)findViewById(R.id.crushed_nuts)).isChecked();
        cherries = ((CheckBox)findViewById(R.id.cherries)).isChecked();
        orio = ((CheckBox)findViewById(R.id.orio_cookies_crumbles)).isChecked();
        }
    }


