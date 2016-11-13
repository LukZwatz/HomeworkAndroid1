package at.fh.swengb.homeworkandroid1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextPeso;
    EditText editTextDollar;
    TextView resultview1;
    TextView resultview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextPeso = (EditText) findViewById(R.id.editText);
        resultview1 = (TextView) findViewById(R.id.textView6);

        editTextDollar = (EditText) findViewById(R.id.editText2);
        resultview2 = (TextView) findViewById(R.id.textView10);


    }

    public void calcPesoDollar (View view){
        String pesoString = editTextPeso.getText().toString();


        double peso = 0;

        try {
            peso = Double.parseDouble(pesoString);
            double result = peso/20;
            resultview1.setText(String.format("%.2f USD",result));
        } catch (NumberFormatException e){
            resultview1.setText("Something Went Wrong!");
            e.printStackTrace();
        }

    }

    public void calcDollarPeso (View view){
        String dollarString = editTextDollar.getText().toString();

        double dollar = 0;

        try {
            dollar = Double.parseDouble(dollarString);
            double result = dollar*21.05;
            resultview2.setText(String.format("%.2f MXN", result));
        } catch (NumberFormatException e){
            resultview2.setText("Something Went Wrong!");
            e.printStackTrace();
        }
    }

    public void showAbout(View view){
        Intent intent = new Intent(this,displayAbout.class);
        String message1 = resultview1.getText().toString();
        String message2 = resultview2.getText().toString();
        intent.putExtra("myMessage",message1);
        intent.putExtra("myMessage2",message2);

        startActivity(intent);

    }
}
