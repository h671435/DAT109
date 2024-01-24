package no.hvl.dat109.oblig1;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Lager et stigespill
 */
public class Stigespill {
    private final Terning terning;
    private final Brett brett;
    private final List<Spiller> spillere;

    private Spiller vinner = null;

    /**
     * Laget et stigespill instans
     */
    public Stigespill() {
        spillere = new ArrayList<>();
        brett = new Brett();
        terning = new Terning();
    }

    /**
     * Initialiserer spillet ved å hente informasjon om antall spillere og deres navn.
     */
    public void initSpill() {
        hentSpillere();
    }

    /**
     * Starter spillet og spiller runde
     */
    public void spill() {
        int i = 1;
        while (vinner == null) {
            System.out.println("\nRunde: " + i + "\n--------------------------");
            i++;
            spillRunde();
        }

        JOptionPane.showMessageDialog(null, vinner.getNavn()
                + " er vinneren av ditta spelet!");
        System.out.println(vinner.getNavn() + " er vinneren av ditta spelet!");
    }

    /**
     * Sjekker om en spiller har vunnet ved å sammenligne posisjonen til spillerens brikke
     * med eller overstiger målrutenummeret på brettet (100).
     *
     * @param spiller Spilleren som skal sjekkes for seier.
     * @return {@code true} hvis spilleren har nådd eller overstiger målrutenummeret (100),
     *         ellers {@code false}.
     */
    private boolean sjekkSeier(Spiller spiller) {
        return spiller.getBrikke().hentRutePosisjon() >= 100;
    }

    /**
     * Spiller en runde.
     * Etter hvert trekk sjekkes om en spiller har vunnet, og spillet avsluttes
     * hvis en vinner er funnet.
     */
    private void spillRunde() {
        try {
            System.out.println("Trykk enter for å starte!");
            System.in.read();
        } catch (IOException e) {
        }
        for (Spiller spiller : spillere) {
            System.out.println("Spiller: " + spiller.getNavn());
            System.out.println("Du står i: " + spiller.getBrikke().hentRutePosisjon());
            spiller.spillTrekk(terning);

            if (sjekkSeier(spiller)) {
                vinner = spiller;
                break;
            }
            System.out.println();
        }
    }

    /**
     * Finner hvor mange spillere det skal være og hvilke navn / farge de skal ha.
     * Oppretter deretter spillerobjekt for spillerne
     */
    private void hentSpillere() {
        String input = JOptionPane.showInputDialog("Vennligst skriv inn antall spillere.");
        int antallSpillere = Integer.parseInt(input);

        boolean erGydlig = false;
        while (!erGydlig) {
            if (antallSpillere < 2 || antallSpillere > 5) {
                antallSpillere = Integer.parseInt(JOptionPane.showInputDialog
                        ("Vennligst skriv inn et tall fra 2-4"));
            } else {
                erGydlig = true;
            }
        }
        for (int i = 0; i < antallSpillere; i++) {
            String spillerNavn = JOptionPane.showInputDialog("Hva er navnet på spiller " + (i + 1));
            String farge = JOptionPane.showInputDialog("Hvilke farge er du");
            spillere.add(new Spiller(spillerNavn, farge, brett));
        }
    }
}
