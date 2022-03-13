package de.mide.langeberechnung2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import de.mide.langeberechnung2.hintergrundprozess.MeinAsyncTask;
import de.mide.langeberechnung2.hintergrundprozess.MeinThread;

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
     * Event-Handler für Button "Ausführen in Thread-Unterklasse".
     */
    public void inThreadUnterklasseAusfuehren(View view) {

        MeinThread mt = new MeinThread();
        mt.start();
    }

    /**
     * Event-Handler für Button "Ausführen in AsyncTask-Unterklasse".
     */
    public void inAsyncTaskUnterklasseAusfuehren(View view) {

        MeinAsyncTask mat = new MeinAsyncTask();
        mat.execute();
    }

}