package de.mide.langeberechnung2.hintergrundprozess;

import android.os.AsyncTask;
import android.util.Log;

import java.util.Random;

public class MeinAsyncTask extends AsyncTask<Void,Void,Void> {

    private static final String TAG4LOGGING = "MeinAsyncTask";

    @Override
    protected Void doInBackground(Void... voids) {

        Random random = new Random();
        int dauerInSekunden = random.nextInt(20);

        Log.i(TAG4LOGGING, "Berechnung gestartet, soll " + dauerInSekunden + " Sekunden dauern.");

        try {

            Thread.sleep(dauerInSekunden * 1000);
        }
        catch (InterruptedException ex) {

            Log.w(TAG4LOGGING, "sleep wurde unterbrochen: " + ex);
        }

        Log.i(TAG4LOGGING, "Berechnung beendet.");

        return null;
    }

}
