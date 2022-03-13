package de.mide.langeberechnung2.hintergrundprozess;

import android.os.AsyncTask;
import android.util.Log;

import java.util.Random;

import de.mide.langeberechnung2.helferlein.Zufallsgenerator;

/**
 * AsyncTask ohne GUI-Interaktion.
 */
public class MeinAsyncTask1 extends AsyncTask<Void,Void,Void> {

    private static final String TAG4LOGGING = "MeinAsyncTask-1";

    @Override
    protected Void doInBackground(Void... voids) {

        int dauerInSekunden = Zufallsgenerator.getZufallsDauer();
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
