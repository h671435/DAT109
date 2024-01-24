package no.hvl.dat109.oblig1;

import java.util.ArrayList;
import java.util.List;

public class Brett {
    private final List<Rute> ruter;
    private final Rute startposisjon;
    private final List<Stige> stiger;

    public Brett() {
        this.startposisjon = new Rute(0);
        ruter = new ArrayList<>(106);
        for (int i = 0; i <= 106; i++) {
            ruter.add(new Rute(i + 1));
        }
        this.stiger = new ArrayList<>();

        // Stiger
        stiger.add(new Stige(finnRute(1), finnRute(40), StigeEnum.OPP));
        stiger.add(new Stige(finnRute(8), finnRute(10), StigeEnum.OPP));
        stiger.add(new Stige(finnRute(36), finnRute(52), StigeEnum.OPP));
        stiger.add(new Stige(finnRute(43), finnRute(62), StigeEnum.OPP));
        stiger.add(new Stige(finnRute(49), finnRute(79), StigeEnum.OPP));
        stiger.add(new Stige(finnRute(65), finnRute(82), StigeEnum.OPP));
        stiger.add(new Stige(finnRute(68), finnRute(85), StigeEnum.OPP));
        stiger.add(new Stige(finnRute(61), finnRute(97), StigeEnum.OPP));


        // Slanger
        stiger.add(new Stige(finnRute(33), finnRute(3), StigeEnum.NED));
        stiger.add(new Stige(finnRute(24), finnRute(5), StigeEnum.NED));
        stiger.add(new Stige(finnRute(74), finnRute(12), StigeEnum.NED));
        stiger.add(new Stige(finnRute(64), finnRute(27), StigeEnum.NED));
        stiger.add(new Stige(finnRute(42), finnRute(30), StigeEnum.NED));
        stiger.add(new Stige(finnRute(56), finnRute(37), StigeEnum.NED));
        stiger.add(new Stige(finnRute(87), finnRute(75), StigeEnum.NED));
        stiger.add(new Stige(finnRute(99), finnRute(60), StigeEnum.NED));
        stiger.add(new Stige(finnRute(98), finnRute(88), StigeEnum.NED));
    }

    public Rute getStartposisjon() {
        return startposisjon;
    }

    public Rute finnRute(int n) {
        return ruter.get(n - 1);
    }

    public Rute harStige(Rute posisjon) {
        List<Stige> list = stiger.stream().filter(x -> x.getStartposisjon() == posisjon).toList();
        if (list.isEmpty()) {
            return null;
        }
        Stige stige = list.getFirst();
        Rute sluttPos = stige.getSluttposisjon();
        if (stige.getRetning() == StigeEnum.OPP) {
            System.out.println("Juksepavepipelort, du traff på en stige og du ble flyttet til "
                    + sluttPos + "\uD83C\uDF89\uD83C\uDF89\uD83C\uDF89\uD83C\uDF89\uD83C\uDF89");
        } else {
            System.out.println("GRRRRRRRATULERRRRRER MED DAGEN, DU SKLEI PÅ EN BANAN OG BEFINNER DEG NÅ PÅ "
                    + sluttPos + "\uD83D\uDCC9\uD83D\uDCC9\uD83D\uDCC9\uD83D\uDCC9\uD83D\uDCC9");
        }

        return sluttPos;
    }
}

