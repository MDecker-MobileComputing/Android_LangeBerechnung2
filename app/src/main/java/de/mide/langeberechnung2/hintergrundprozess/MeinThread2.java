package de.mide.langeberechnung2.hintergrundprozess;

import android.content.Context;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import de.mide.langeberechnung2.helferlein.Zufallsgenerator;

/**
 * Thread mit GUI-Interaktion.
 */
public class MeinThread2 extends Thread {

    private static final String TAG4LOGGING = "MeinThread-2";

    private Button _button = null;

    /**
     * Konstruktor zur Übergabe Button
     *
     * @param button Button der nach Ende der Berechnung wieder eingeschaltet werden soll.
     */
    public MeinThread2(Button button) {

        _button = button;
    }

    /**
     * Diese Methode wird in einem Hintergrund-Thread ausgeführt.
     */
    @Override
    public void run() {

        int dauerInSekunden = Zufallsgenerator.getZufallsDauer();
        Log.i(TAG4LOGGING, "Berechnung gestartet, soll " + dauerInSekunden + " Sekunden dauern.");

        try {

            Thread.sleep(dauerInSekunden * 1000);
        }
        catch (InterruptedException ex) {

            Log.w(TAG4LOGGING, "sleep wurde unterbrochen: " + ex);
        }

        Log.i(TAG4LOGGING, "Berechnung beendet.");


        Runnable ergebnisRunnable = new Runnable() {
            @Override
            public void run() {
                _button.setEnabled(true);
            }
        };

        _button.post(ergebnisRunnable);
    }

}
