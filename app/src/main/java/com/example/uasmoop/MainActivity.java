package com.example.uasmoop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button submit1, submit2, submitB, next1, next2, previous1, previous2;
    ImageView view1, view2;
    Integer a = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit1 = (Button) findViewById(R.id.bp1);
        submit2 = (Button) findViewById(R.id.bp2);
        next1 = (Button) findViewById(R.id.next1);
        next2 = (Button) findViewById(R.id.next2);
        previous1 = (Button) findViewById(R.id.previous1);
        previous2 = (Button) findViewById(R.id.previous2);
        submitB = (Button) findViewById(R.id.bbatle);
        view1 = (ImageView) findViewById(R.id.image1);
        view2 = (ImageView) findViewById(R.id.image2);

        previous1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a == 0) {
                    view1.setImageResource(R.drawable.archer);
                    a = 3;
                } else if (a == 1) {
                    view1.setImageResource(R.drawable.catapult);
                    a--;
                } else if (a == 2) {
                    view1.setImageResource(R.drawable.cavalry);
                    a--;
                } else if (a == 3) {
                    view1.setImageResource(R.drawable.infantry);
                    a--;
                }
            }
        });

        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a == 0) {
                    view1.setImageResource(R.drawable.archer);
                    a++;
                } else if (a == 1) {
                    view1.setImageResource(R.drawable.catapult);
                    a++;
                } else if (a == 2) {
                    view1.setImageResource(R.drawable.cavalry);
                    a++;
                } else if (a == 3) {
                    view1.setImageResource(R.drawable.infantry);
                    a = 0;
                }
            }
        });

        previous2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a == 0) {
                    view2.setImageResource(R.drawable.archer);
                    a = 3;
                } else if (a == 1) {
                    view2.setImageResource(R.drawable.catapult);
                    a--;
                } else if (a == 2) {
                    view2.setImageResource(R.drawable.cavalry);
                    a--;
                } else if (a == 3) {
                    view2.setImageResource(R.drawable.infantry);
                    a--;
                }
            }
        });

        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a == 0) {
                    view2.setImageResource(R.drawable.archer);
                    a++;
                } else if (a == 1) {
                    view2.setImageResource(R.drawable.catapult);
                    a++;
                } else if (a == 2) {
                    view2.setImageResource(R.drawable.cavalry);
                    a++;
                } else if (a == 3) {
                    view2.setImageResource(R.drawable.infantry);
                    a = 0;
                }
            }
        });


        submitB.setOnClickListener(new View.OnClickListener() {
            double temp = 0;
            double hasila = 0, hasilb = 0;

            @Override
            public void onClick(View view) {
                temp = (5 * 0.4) * 100000 + 100000;


                if (hasila > hasilb) {
                    view1.setImageResource(R.drawable.youwin);
                    submitB.setVisibility(View.VISIBLE);
                } else if (hasila < hasilb) {
                    view2.setImageResource(R.drawable.youwin);
                    submitB.setVisibility(View.VISIBLE);
                }
            }
        });
    }


}