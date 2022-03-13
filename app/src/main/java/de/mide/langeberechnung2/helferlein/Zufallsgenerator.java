package de.mide.langeberechnung2.helferlein;


import java.util.Random;

public class Zufallsgenerator {

    /** Eigentlicher Zufallsgenerator. */
    private static Random _random = new Random();

    /**
     * Erzeugt zufällige Laufzeit in Sekunden.
     *
     * @return Wert im Bereich von 1..10, als Sekunden zu interpretieren.
     */
    public static int getZufallsDauer() {

        return 1 + _random.nextInt(9);
    }

}
