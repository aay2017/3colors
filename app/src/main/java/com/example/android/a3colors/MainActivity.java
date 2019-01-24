package com.example.android.a3colors;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView PoleVvoda;

    private ConstraintLayout mConstr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  int background= ContextCompat.getColor(this, R.color.colorYellow);

    }

    public void onClickBtn(View view) {
        PoleVvoda = findViewById(R.id.textView);
        mConstr = findViewById(R.id.consLayout);
        switch (view.getId()) {
            case R.id.button:
                PoleVvoda.setText("RED");
              mConstr.setBackgroundColor(ContextCompat.getColor(this,R.color.colorRed));break;
            case R.id.button2:
                PoleVvoda.setText("YELLOW");
               mConstr.setBackgroundColor(ContextCompat.getColor(this, R.color.colorYellow));break;
            case R.id.button3:
                PoleVvoda.setText("GREEN");
            mConstr.setBackgroundColor(ContextCompat.getColor(this, R.color.colorGreen));break;
        }





    }
}
