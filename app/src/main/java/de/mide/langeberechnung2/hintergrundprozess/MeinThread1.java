package de.mide.langeberechnung2.hintergrundprozess;

import android.util.Log;

import java.util.Random;

import de.mide.langeberechnung2.helferlein.Zufallsgenerator;


public class MeinThread1 extends Thread {

    private static final String TAG4LOGGING = "MeinThread-1";

    /**
     * Der Inhalt dieser Methode wird in einem Hintergrund-Thread ausgeführt. Diese
     * Methode darf nicht direkt aufgerufen werden.
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
    }

}
