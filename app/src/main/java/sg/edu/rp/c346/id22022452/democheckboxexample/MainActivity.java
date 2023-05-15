package sg.edu.rp.c346.id22022452.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cbEnabled;
    Button btnCheck;
    TextView tvShow;

    private double calcPay(double price, double discount)
    {
        double pay = price * (1 - discount/100);
        return pay;
    }


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbEnabled = findViewById(R.id.Discount);
        btnCheck = findViewById(R.id.Check);
        tvShow = findViewById(R.id.tvShow);



        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MyActivity", "Inside onClick()");

                if (cbEnabled.isChecked())
                {
                    double pay = calcPay(100, 20);
                    tvShow.setText("The discount is given");
                    Toast click = Toast.makeText(btnCheck.getContext(), "Button Click", Toast.LENGTH_LONG);
                    click.show();
                }
                else
                {
                    double pay = calcPay(100, 0);
                    tvShow.setText("The discount is not given");
                    Toast click = Toast.makeText(btnCheck.getContext(), "Button Click", Toast.LENGTH_LONG);
                    click.show();
                }

            }
        });






    }
}