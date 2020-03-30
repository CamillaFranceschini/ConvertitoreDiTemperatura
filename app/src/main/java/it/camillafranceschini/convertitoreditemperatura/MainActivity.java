package it.camillafranceschini.convertitoreditemperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText tempCelsius;
    TextView tempFahr;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_relative);

        tempCelsius = (EditText) findViewById(R.id.etTemp_Celsius);
        tempFahr = (TextView) findViewById(R.id.tvTempF);
    }

    public void convertiTemperatura(View view) {

        Log.d("convertiTemperatura", "Click sul button Converti");

        // 1) Leggere la temperatura in celsius (è variabile di tipo stringa)

        String temperaturaCelsius = tempCelsius.getText().toString();

        Log.d("convertiTemperatura", "Temperatura celsius = "+temperaturaCelsius);

        // 2) Convertire la temperatura in gradi Celsius da String a Double (numeri con la virgola)

        double tempC = Double.parseDouble(temperaturaCelsius);

        double tempF = tempC * 1.8 + 32;

        // 3) Scrivere il valore di tempF all'interno della textView tempFahr

        tempFahr.setText(Double.toString(tempF));

    }
}
