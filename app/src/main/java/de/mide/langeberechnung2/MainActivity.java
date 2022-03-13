package de.mide.langeberechnung2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import de.mide.langeberechnung2.hintergrundprozess.MeinAsyncTask1;
import de.mide.langeberechnung2.hintergrundprozess.MeinAsyncTask2;
import de.mide.langeberechnung2.hintergrundprozess.MeinThread1;
import de.mide.langeberechnung2.hintergrundprozess.MeinThread2;

public class MainActivity extends AppCompatActivity {

    /**
     * Lifecycle-Methode, lädt Layout-Datei.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Event-Handler für Button "Ausführen in Thread-Unterklasse ohne GUI-Interaktion".
     */
    public void inThreadUnterklasseOhneGuiAusfuehren(View view) {

        MeinThread1 mt = new MeinThread1();
        mt.start();
    }

    /**
     * Event-Handler für Button "Ausführen in AsyncTask-Unterklasse ohne GUI-Interaktion".
     */
    public void inAsyncTaskUnterklasseOhneGuiAusfuehren(View view) {

        MeinAsyncTask1 mat = new MeinAsyncTask1();
        mat.execute();
    }

    /**
     * Event-Handler für Button "Ausführen in Thread-Unterklasse mit GUI-Interaktion".
     */
    public void inThreadUnterklasseMitGuiAusfuehren(View view) {

        Button button = (Button) view;
        button.setEnabled(false);

        MeinThread2 mt = new MeinThread2(button);
        mt.start();
    }

    /**
     * Event-Handler für Button "Ausführen in AsyncTask-Unterklasse mit GUI-Interaktion".
     */
    public void inAsyncTaskUnterklasseMitGuiAusfuehren(View view) {

        Button button = (Button) view;
        button.setEnabled(false);

        MeinAsyncTask2 mat = new MeinAsyncTask2(button);
        mat.execute();
    }

}