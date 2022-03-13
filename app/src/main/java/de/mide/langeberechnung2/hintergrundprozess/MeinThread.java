package de.mide.langeberechnung2.hintergrundprozess;

import android.util.Log;

import java.util.Random;


public class MeinThread extends Thread {

    private static final String TAG4LOGGING = "MeinThread";

    /**
     * Der Inhalt dieser Methode wird in einem Hintergrund-Thread ausgeführt. Diese
     * Methode darf nicht direkt aufgerufen werden.
     */
    @Override
    public void run() {

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
    }

}
