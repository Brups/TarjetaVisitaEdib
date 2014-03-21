package com.edib.tarjetavisita.Model;

import android.app.Activity;
import android.widget.ImageView;

import com.edib.tarjetavisita.R;

/**
 * Created by studio on 13/03/14.
 */
public class DataManager {

    private Activity context;

    public DataManager(Activity activity) {
        context = activity;
    }

    public TarjetaVisitaAndroid cargarDatosEjemplo() {
        TarjetaVisitaAndroid tarjeta = new TarjetaVisitaAndroid();

        tarjeta.setNombre(context.getResources().getString(R.string.tarjeta_nombre));
        tarjeta.setTitulacion(context.getResources().getString(R.string.tarjeta_titulacion));

        ImageView foto = new ImageView(context.getApplicationContext());
        foto.setImageResource(R.drawable.edib);
        foto.setTag(R.drawable.edib);
        tarjeta.setFoto(foto);

        return tarjeta;
    }
}
