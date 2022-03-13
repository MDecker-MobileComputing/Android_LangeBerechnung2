package de.mide.langeberechnung2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import de.mide.langeberechnung2.hintergrundprozess.MeinAsyncTask1;
import de.mide.langeberechnung2.hintergrundprozess.MeinThread1;

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

        MeinThread1 mt = new MeinThread1();
        mt.start();
    }

    /**
     * Event-Handler für Button "Ausführen in AsyncTask-Unterklasse".
     */
    public void inAsyncTaskUnterklasseAusfuehren(View view) {

        MeinAsyncTask1 mat = new MeinAsyncTask1();
        mat.execute();
    }

}