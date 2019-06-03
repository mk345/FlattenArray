package com.mk.test.flattenarray;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textViewResult = findViewById(R.id.textViewResult);

        Object[] objectArray = new Object[]{new Object[]{"one", "two", new Object[]{"three"}}, "four"};

        FlattenClass flattenClass = new FlattenClass();
        Object[] result = flattenClass.flatten(objectArray);

        textViewResult.setText(flattenClass.printObjectArray(result));
    }
}
