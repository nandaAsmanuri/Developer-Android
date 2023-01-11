package id.ac.poliban.e020320066.checkboxhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    CheckBox check1, check2, check3, check4, check5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        check1 = findViewById(R.id.checkbox1_chocolate);
        check2 = findViewById(R.id.checkbox2_sprinkles);
        check3 = findViewById(R.id.checkbox3_nuts);
        check4 = findViewById(R.id.checkbox4_cherries);
        check5 = findViewById(R.id.checkbox5_crumbles);

    }

    public void showToast(View view) {
        StringBuilder result = new StringBuilder();
        result.append("Toppings : ");
        if (check1.isChecked()) {
            result.append("\b Chocolate Syrup");
        }

        if (check2.isChecked()) {
            result.append("\b Springkles");
        }

        if (check3.isChecked()) {
            result.append("\b Crushed nuts");
        }

        if (check4.isChecked()) {
            result.append("\b Cherries");
        }

        if (check5.isChecked()) {
            result.append("\b Oreo cookies crumbles");
        }
        Toast.makeText(this,result.toString(), Toast.LENGTH_SHORT).show();
    }
}