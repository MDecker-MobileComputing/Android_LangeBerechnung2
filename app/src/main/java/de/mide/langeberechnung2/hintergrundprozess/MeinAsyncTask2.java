package de.mide.langeberechnung2.hintergrundprozess;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.Button;

import de.mide.langeberechnung2.helferlein.Zufallsgenerator;

/**
 * AsyncTask mit GUI-Interaktion.
 */
public class MeinAsyncTask2 extends AsyncTask<Void,Void,Void>  {

    private static final String TAG4LOGGING = "MeinAsyncTask-2";

    private Button _button = null;

    /**
     * Konstruktor, um Button zu übergeben.
     *
     * @param button Button, der wieder aktiviert wird, sobald die Berechnung abgeschaltet ist
     */
    public MeinAsyncTask2(Button button) {

        _button = button;
    }

    @Override
    public Void doInBackground(Void... voids) {

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

    /**
     * Diese Methode wird im Main-Thread ausgeführt, wenn die Methode {@link #doInBackground(Void...)}
     * beendet ist: Der zugehörige Button wird wieder eingeschaltet.
     */
    @Override
    protected void onPostExecute(Void v) {

        _button.setEnabled(true);
    }

}
