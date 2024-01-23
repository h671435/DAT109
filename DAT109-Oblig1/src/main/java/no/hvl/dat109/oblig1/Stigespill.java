package no.hvl.dat109.oblig1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Stigespill {
    private final Terning terning;
    private final Brett brett;
    private final List<Spiller> spillere;

    private Spiller vinner = null;

    public Stigespill() {
        spillere = new ArrayList<>();
        brett = new Brett();
        terning = new Terning();
    }

    public void initSpill() {
        hentSpillere();
    }

    public void spill() {
        int i = 1;
        while (vinner == null) {
            System.out.println("Runde: " + i +"\n--------------------------");
            i++;
            spillRunde();
        }

        JOptionPane.showMessageDialog(null, vinner.getNavn()
                + " er vinneren av ditta spelet!");
        System.out.println(vinner.getNavn() + " er vinneren av ditta spelet!");
    }

    private boolean sjekkSeier(Spiller spiller) {
        return spiller.getBrikke().getPosisjon().getRutePosisjon() >= 100;
    }

    private void spillRunde() {
        for (Spiller spiller : spillere) {
            System.out.println("Spiller: " + spiller.getNavn());
            System.out.println("Du står i: " + spiller.getBrikke().getPosisjon().getRutePosisjon());
            int nyPos = spiller.spillTrekk(terning);
            Rute r = brett.finnRute(nyPos);
            System.out.println("Ny posisjon: " + r.getRutePosisjon() + "\n");

            spiller.flyttBrikke(r);
            if (sjekkSeier(spiller)) {
                vinner = spiller;
                break;
            }
        }
    }

    private void hentSpillere() {
        String input = JOptionPane.showInputDialog("Vennligst skriv inn antall spillere.");
        int antallSpillere = Integer.parseInt(input);

        boolean erGydlig = false;
        while (!erGydlig) {
            if (antallSpillere < 2 || antallSpillere > 4) {
                antallSpillere = Integer.parseInt(JOptionPane.showInputDialog
                        ("Vennligst skriv inn et tall fra 2-4"));
            } else {
                erGydlig = true;
            }
        }
        for (int i = 0; i < antallSpillere; i++) {
            String spillerNavn = JOptionPane.showInputDialog("Hva er navnet på spiller " + (i + 1));
            String spillerBrikke = JOptionPane.showInputDialog("Hvilke farge er du");
            Brikke brikke = new Brikke(spillerBrikke, brett.getStartposisjon());
            spillere.add(new Spiller(spillerNavn, brikke));
        }
    }
}