package com.edib.tarjetavisita.Screens;


import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.edib.tarjetavisita.Model.DataManager;
import com.edib.tarjetavisita.Model.TarjetaVisitaAndroid;
import com.edib.tarjetavisita.R;


public class MainActivity extends Activity {

    private TarjetaVisitaAndroid tarjeta;
    private DataManager data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tarjeta_visita_layout);

        this.data = new DataManager(this);
        this.tarjeta = data.cargarDatosEjemplo();

        populateUI();
    }


    private void populateUI() {
        if (tarjeta == null) {
            Toast.makeText(this.getApplicationContext(), "Data not found.", Toast.LENGTH_SHORT).show();
            Log.e("MAIN", "Data not found.");
            return;
        }

        TextView nombreTextView = (TextView) findViewById(R.id.nombreTextView);
        TextView titulacionTextView = (TextView) findViewById(R.id.titulacionTextView);
        ImageView fotoImageView = (ImageView) findViewById(R.id.fotoImageView);

        nombreTextView.setText(tarjeta.getNombre());
        titulacionTextView.setText(tarjeta.getTitulacion());

        Drawable d = tarjeta.getFoto().getDrawable();
        Log.d("MAIN", "id: " + tarjeta.getFoto().getId());
        fotoImageView.setImageDrawable(d);
    }

    public void onClickFoto(View view) {
        Toast.makeText(this.getApplicationContext(), "Muy bien " + tarjeta.getNombre() + " le has dado a la foto", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, ReversoTarjetaActivity.class);
        this.startActivity(intent);
    }

}
