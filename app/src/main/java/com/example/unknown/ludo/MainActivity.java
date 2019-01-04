package com.example.unknown.ludo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout blue_dice_color, yellow_dice_color, green_dice_color, red_dice_color;
    TextView dice_value_blue, dice_value_yellow, dice_value_red, dice_value_green;
    TextView init_blue_coin_1, init_blue_coin_2, init_blue_coin_3, init_blue_coin_4;
    TextView init_yellow_coin_1, init_yellow_coin_2, init_yellow_coin_3, init_yellow_coin_4;
    TextView init_green_coin_1, init_green_coin_2, init_green_coin_3, init_green_coin_4;
    TextView init_red_coin_1, init_red_coin_2, init_red_coin_3, init_red_coin_4;
    TextView t1, t2, t3, t4, t5, t6, t7, t8, t9, t10;
    TextView t11, t12, t13, t14, t15, t16, t17, t18, t19, t20;
    TextView t21, t22, t23, t24, t25, t26, t27, t28, t29, t30;
    TextView t31, t32, t33, t34, t35, t36, t37, t38, t39, t40;
    TextView t41, t42, t43, t44, t45, t46, t47, t48;
    TextView tb1, tb2, tb3, tb4, tb5, ty1, ty2, ty3, ty4, ty5, tr1, tr2, tr3, tr4, tr5, tg1, tg2, tg3, tg4, tg5;
    int playerTurn = 1, diceValue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blue_dice_color = findViewById(R.id.dice_blue_color);
        yellow_dice_color = findViewById(R.id.dice_yellow_color);
        green_dice_color = findViewById(R.id.dice_green_color);
        red_dice_color = findViewById(R.id.dice_red_color);

        dice_value_blue = findViewById(R.id.dice_value_blue);
        dice_value_yellow = findViewById(R.id.dice_value_yellow);
        dice_value_red = findViewById(R.id.dice_value_red);
        dice_value_green = findViewById(R.id.dice_value_green);

        dice_value_blue.setText("0");
        dice_value_yellow.setText("");
        dice_value_red.setText("");
        dice_value_green.setText("");

        blue_dice_color.setBackgroundColor(getResources().getColor(R.color.blue));
        yellow_dice_color.setBackgroundColor(getResources().getColor(R.color.yellow));
        green_dice_color.setBackgroundColor(getResources().getColor(R.color.green));
        red_dice_color.setBackgroundColor(getResources().getColor(R.color.red));

        init_blue_coin_1 = findViewById(R.id.init_coin_blue_1);
        init_blue_coin_2 = findViewById(R.id.init_coin_blue_2);
        init_blue_coin_3 = findViewById(R.id.init_coin_blue_3);
        init_blue_coin_4 = findViewById(R.id.init_coin_blue_4);
        init_yellow_coin_1 = findViewById(R.id.init_coin_yellow_1);
        init_yellow_coin_2 = findViewById(R.id.init_coin_yellow_2);
        init_yellow_coin_3 = findViewById(R.id.init_coin_yellow_3);
        init_yellow_coin_4 = findViewById(R.id.init_coin_yellow_4);
        init_green_coin_1 = findViewById(R.id.init_coin_green_1);
        init_green_coin_2 = findViewById(R.id.init_coin_green_2);
        init_green_coin_3 = findViewById(R.id.init_coin_green_3);
        init_green_coin_4 = findViewById(R.id.init_coin_green_4);
        init_red_coin_1 = findViewById(R.id.init_coin_red_1);
        init_red_coin_2 = findViewById(R.id.init_coin_red_2);
        init_red_coin_3 = findViewById(R.id.init_coin_red_3);
        init_red_coin_4 = findViewById(R.id.init_coin_red_4);

        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);
        t5 = findViewById(R.id.t5);
        t6 = findViewById(R.id.t6);
        t7 = findViewById(R.id.t7);
        t8 = findViewById(R.id.t8);
        t9 = findViewById(R.id.t9);
        t10 = findViewById(R.id.t10);
        t11 = findViewById(R.id.t11);
        t12 = findViewById(R.id.t12);
        t13 = findViewById(R.id.t13);
        t14 = findViewById(R.id.t14);
        t15 = findViewById(R.id.t15);
        t16 = findViewById(R.id.t16);
        t17 = findViewById(R.id.t17);
        t18 = findViewById(R.id.t18);
        t19 = findViewById(R.id.t19);
        t20 = findViewById(R.id.t20);
        t21 = findViewById(R.id.t21);
        t22 = findViewById(R.id.t22);
        t23 = findViewById(R.id.t23);
        t24 = findViewById(R.id.t24);
        t25 = findViewById(R.id.t25);
        t26 = findViewById(R.id.t26);
        t27 = findViewById(R.id.t27);
        t28 = findViewById(R.id.t28);
        t29 = findViewById(R.id.t29);
        t30 = findViewById(R.id.t30);
        t31 = findViewById(R.id.t31);
        t32 = findViewById(R.id.t32);
        t33 = findViewById(R.id.t33);
        t34 = findViewById(R.id.t34);
        t35 = findViewById(R.id.t35);
        t36 = findViewById(R.id.t36);
        t37 = findViewById(R.id.t37);
        t38 = findViewById(R.id.t38);
        t39 = findViewById(R.id.t39);
        t40 = findViewById(R.id.t40);
        t41 = findViewById(R.id.t41);
        t42 = findViewById(R.id.t42);
        t43 = findViewById(R.id.t43);
        t44 = findViewById(R.id.t44);
        t45 = findViewById(R.id.t45);
        t46 = findViewById(R.id.t46);
        t47 = findViewById(R.id.t47);
        t48 = findViewById(R.id.t48);
        tb1 = findViewById(R.id.tb1);
        tb2 = findViewById(R.id.tb2);
        tb3 = findViewById(R.id.tb3);
        tb4 = findViewById(R.id.tb4);
        tb5 = findViewById(R.id.tb5);
        ty1 = findViewById(R.id.ty1);
        ty2 = findViewById(R.id.ty2);
        ty3 = findViewById(R.id.ty3);
        ty4 = findViewById(R.id.ty4);
        ty5 = findViewById(R.id.ty5);
        tg1 = findViewById(R.id.tg1);
        tg2 = findViewById(R.id.tg2);
        tg3 = findViewById(R.id.tg3);
        tg4 = findViewById(R.id.tg4);
        tg5 = findViewById(R.id.tg5);
        tr1 = findViewById(R.id.tr1);
        tr2 = findViewById(R.id.tr2);
        tr3 = findViewById(R.id.tr3);
        tr4 = findViewById(R.id.tr4);
        tr5 = findViewById(R.id.tr5);

        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        t7.setText("");
        t8.setText("");
        t9.setText("");
        t10.setText("");
        t11.setText("");
        t12.setText("");
        t13.setText("");
        t14.setText("");
        t15.setText("");
        t16.setText("");
        t17.setText("");
        t18.setText("");
        t19.setText("");
        t20.setText("");
        t21.setText("");
        t22.setText("");
        t23.setText("");
        t24.setText("");
        t25.setText("");
        t26.setText("");
        t27.setText("");
        t28.setText("");
        t29.setText("");
        t30.setText("");
        t31.setText("");
        t32.setText("");
        t33.setText("");
        t34.setText("");
        t35.setText("");
        t36.setText("");
        t37.setText("");
        t38.setText("");
        t39.setText("");
        t40.setText("");
        t41.setText("");
        t42.setText("");
        t43.setText("");
        t44.setText("");
        t45.setText("");
        t46.setText("");
        t47.setText("");
        t48.setText("");
        tb1.setText("");
        tb2.setText("");
        tb3.setText("");
        tb4.setText("");
        tb5.setText("");
        ty1.setText("");
        ty2.setText("");
        ty3.setText("");
        ty4.setText("");
        ty5.setText("");
        tg1.setText("");
        tg2.setText("");
        tg3.setText("");
        tg4.setText("");
        tg5.setText("");
        tr1.setText("");
        tr2.setText("");
        tr3.setText("");
        tr4.setText("");
        tr5.setText("");

        init_blue_coin_1.setText("+");
        init_blue_coin_2.setText("+");
        init_blue_coin_3.setText("+");
        init_blue_coin_4.setText("+");
        init_yellow_coin_1.setText("=");
        init_yellow_coin_2.setText("=");
        init_yellow_coin_3.setText("=");
        init_yellow_coin_4.setText("=");
        init_green_coin_1.setText("*");
        init_green_coin_2.setText("*");
        init_green_coin_3.setText("*");
        init_green_coin_4.setText("*");
        init_red_coin_1.setText("/");
        init_red_coin_2.setText("/");
        init_red_coin_3.setText("/");
        init_red_coin_4.setText("/");

        dice_value_blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (playerTurn == 1) {
                    diceRoll();
                    makeMove();
                }
            }
        });

        dice_value_yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (playerTurn == 2) {
                    diceRoll();
                    makeMove();
                }
            }
        });
        dice_value_red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (playerTurn == 3) {
                    diceRoll();
                    makeMove();
                }
            }
        });
        dice_value_green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (playerTurn == 4) {
                    diceRoll();
                    makeMove();
                }
            }
        });
    }

    public void diceRoll() {
        diceValue = (int) (Math.random() * 6) + 1;
        Log.v("Dice value: ", "" + diceValue);
        if (playerTurn == 1) {
            dice_value_blue.setText("" + diceValue);
            if (diceValue == 6) {
                makeMove();
                playerTurn = 1;
            } else {
                dice_value_blue.setText("" + diceValue);
                makeMove();
                dice_value_blue.setText("");
                dice_value_yellow.setText("0");
                playerTurn = 2;
            }
        } else if (playerTurn == 2) {
            dice_value_yellow.setText("" + diceValue);
            if (diceValue == 6) {
                makeMove();
                playerTurn = 1;
            } else {
                dice_value_yellow.setText("" + diceValue);
                makeMove();
                dice_value_yellow.setText("");
                dice_value_yellow.setText("0");
                playerTurn = 3;
                dice_value_red.setText("");
            }
        } else if (playerTurn == 3) {
            dice_value_red.setText("" + diceValue);
            if (diceValue == 6) {
                makeMove();
                playerTurn = 1;
            } else {
                dice_value_red.setText("" + diceValue);
                makeMove();
                dice_value_red.setText("");
                dice_value_yellow.setText("0");
                playerTurn = 4;
                dice_value_green.setText("");
            }
        } else if (playerTurn == 4) {
            dice_value_green.setText("" + diceValue);
            if (diceValue == 6) {
                makeMove();
                playerTurn = 1;
            } else {
                dice_value_green.setText("" + diceValue);
                makeMove();
                dice_value_green.setText("");
                dice_value_yellow.setText("0");
                playerTurn = 1;
                dice_value_blue.setText("");
            }
        }
    }

    public void makeMove() {
        String s;
        if (diceValue == 6) {
            if (init_blue_coin_1.getText() == "+" && init_blue_coin_2.getText() == "+" && init_blue_coin_3.getText() == "+" && init_blue_coin_4.getText() == "+") {
                init_blue_coin_1.setText("");
                t1.setText("+");
            } else {
                s = (String) t1.getText();
                if (s == "+") {
                    t1.setText("");
                    switch (diceValue) {
                        case 1:
                            t2.setText("+");
                            break;
                        case 2:
                            t3.setText("+");
                            break;
                        case 3:
                            t4.setText("+");
                            break;
                        case 4:
                            t5.setText("+");
                            break;
                        case 5:
                            t6.setText("+");
                            break;
                        case 6:
                            t7.setText("+");
                            break;
                    }
                } else {
                    s = (String) t2.getText();
                    if (s == "+") {
                        t2.setText("");
                        switch (diceValue) {
                            case 1:
                                t3.setText("+");
                                break;
                            case 2:
                                t4.setText("+");
                                break;
                            case 3:
                                t5.setText("+");
                                break;
                            case 4:
                                t6.setText("+");
                                break;
                            case 5:
                                t7.setText("+");
                                break;
                            case 6:
                                t8.setText("+");
                                break;
                        }
                    }
                }
            }
        } else {
            playerTurn++;
            if (playerTurn == 5) {
                playerTurn = 1;
            }
        }
    }
}
