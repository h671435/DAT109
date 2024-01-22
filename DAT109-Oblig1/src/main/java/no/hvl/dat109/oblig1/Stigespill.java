package no.hvl.dat109.oblig1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Stigespill {
    private final Terning terning;
    private final Brett brett;
    private final List<Spiller> spillere;

    public Stigespill() {
        spillere = new ArrayList<>();
        brett = new Brett();
        terning = new Terning();
    }

    public void initSpill() {
        hentSpillere();
    }

    public void spill() {
        while (true) {
            spillRunde();
        }
    }

    private void spillRunde() {
        for (Spiller spiller : spillere) {
            spiller.spillTrekk(terning);
        }
    }

    private void hentSpillere() {
        String input = JOptionPane.showInputDialog("Vennligst skriv inn antall spillere.");
        int antallSpillere = Integer.parseInt(input);

        boolean erGydlig = false;
        while(!erGydlig) {
            if (antallSpillere < 2 || antallSpillere > 4) {
                antallSpillere = Integer.parseInt(JOptionPane.showInputDialog
                        ("Vennligst skriv inn et tall fra 2-4"));
            } else {
                erGydlig = true;
            }
        }
        for (int i = 0; i < antallSpillere; i++) {
            String spillerNavn = JOptionPane.showInputDialog("Hva er navnet på spiller " + (i+1));
            String spillerBrikke = JOptionPane.showInputDialog("Hvilke farge er du");
            Brikke brikke = new Brikke(spillerBrikke, brett.getStartposisjon());
            spillere.set(i, new Spiller(spillerNavn, brikke));
        }

    }
}