package css.cis3334.pizzaorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //declaring variables here
    RadioButton rbSmall;
    RadioButton rbMedium;
    RadioButton rbLarge;
    CheckBox chkbxCheese;
    CheckBox chkbxDelivery;
    TextView tvTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initializing variables
        rbSmall = (RadioButton) findViewById(R.id.radioButtonSmall);
        rbMedium = (RadioButton) findViewById(R.id.radioButtonMedium);
        rbLarge = (RadioButton) findViewById(R.id.radioButtonLarge);
        chkbxCheese = (CheckBox) findViewById(R.id.checkBoxCheese);
        chkbxDelivery = (CheckBox) findViewById(R.id.checkBoxDelivery);
        tvTotal = (TextView) findViewById(R.id.textViewTotal);
    }


    public void onClickCalcButton(View view) {
        Double size;
        Double cheese;
        Double delivery;

        if (rbSmall.isChecked()) {
            size = 7.00;
            if (chkbxCheese.isChecked()) {
                cheese = 1.75;
            } else {
                cheese = 0.00;
            }

            if (chkbxDelivery.isChecked()) {
                delivery = 2.50;
            } else {
                delivery = 0.00;

            }
            Double total = size + cheese + delivery;
            String text = String.format("Total is $%.2f", total);
            tvTotal.setText(text);
        } else if (rbMedium.isChecked()) {
            size = 9.00;
            if (chkbxCheese.isChecked()) {
                cheese = 1.75;
            } else {
                cheese = 0.00;
            }

            if (chkbxDelivery.isChecked()) {
                delivery = 2.50;
            } else {
                delivery = 0.00;

            }
            Double total = size + cheese + delivery;
            String text = String.format("Total is $%.2f", total);
            tvTotal.setText(text);
        } else if (rbLarge.isChecked()) {
            size = 13.00;
            if (chkbxCheese.isChecked()) {
                cheese = 1.75;
            } else {
                cheese = 0.00;
            }

            if (chkbxDelivery.isChecked()) {
                delivery = 2.50;
            } else {
                delivery = 0.00;

            }
            Double total = size + cheese + delivery;
            String text = String.format("Total is $%.2f", total);
            tvTotal.setText(text);
        }
    }
}



