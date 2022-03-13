package de.mide.langeberechnung2.helferlein;


import java.util.Random;

public class Zufallsgenerator {

    /** Eigentlicher Zufallsgenerator. */
    private static Random _random = new Random();

    /**
     * Erzeugt zufällige Laufzeit.
     *
     * @return Wert im Bereich von 0..20, als Sekunden zu interpretieren.
     */
    public static int getZufallsDauer() {

        return _random.nextInt(20);
    }

}
