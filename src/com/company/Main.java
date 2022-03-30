package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        SarasasImpl irasas1 = new SarasasImpl("Jonas B.", "Varžtas", 20452, 0.20, 0, "");
        SarasasImpl irasas2 = new SarasasImpl("Vilius K.", "Kondensatorius", 1250, 1.50, 0, "");
        SarasasImpl irasas3 = new SarasasImpl("Vilma P.", "Varža", 1350, 1.20, 0, "");
        SarasasImpl irasas4 = new SarasasImpl("Irena O.", "Varža", 856, 1.20, 0, "");
        SarasasImpl irasas5 = new SarasasImpl("Audrius L.", "Ritė", 625, 110, 0, "");
        SarasasImpl irasas6 = new SarasasImpl("Zenonas K.", "Rezistorius", 1420, 0.80, 0, "");
        SarasasImpl irasas7 = new SarasasImpl("Danutė O.", "Tranzistorius", 980, 2.40, 0, "");
        SarasasImpl irasas8 = new SarasasImpl("Regina P.", "Tranzistorius", 1030, 2.05, 0, "");
        SarasasImpl irasas9 = new SarasasImpl("Aidas T.", "Diodas", 850, 1.20, 0, "");
        SarasasImpl irasas10 = new SarasasImpl("Rokas M.", "Ritė", 850, 102, 0, "");

        ArrayList<SarasasImpl> dienosAtaskaita = new ArrayList<>();

        dienosAtaskaita.add(irasas1);
        dienosAtaskaita.add(irasas2);
        dienosAtaskaita.add(irasas3);
        dienosAtaskaita.add(irasas4);
        dienosAtaskaita.add(irasas5);
        dienosAtaskaita.add(irasas6);
        dienosAtaskaita.add(irasas7);
        dienosAtaskaita.add(irasas8);
        dienosAtaskaita.add(irasas9);
        dienosAtaskaita.add(irasas10);

        //Spausdinimas su iteratoriumi;
        System.out.println("\nSpausdinama bendra pagamintų dėtalių suvestinė:\n");
        spausdintiSuIteratorium(dienosAtaskaita);

        //Spausdinimas surikiavus(Pirmiausia pagal pagamintų dėt. kiekį, anta - pagal pavadinimą);
        System.out.println("\nSpausdinimas sąrašą surikiavus pagal pagamintų dėtalių kiekį/dėtalės pavadinimą:\n");
        Collections.sort(dienosAtaskaita);
        spausdintiSuIteratorium(dienosAtaskaita);

        //Spausdinimas su dienos normos įvertinimu;
        System.out.println("\nSpausdinamas sąrašas su komentarais ar įvykdytos dienos normos:\n");
        dienosNormosVykdymas(dienosAtaskaita);
        spausdintiSuIteratorium(dienosAtaskaita);

        //Spausdinimas pašalinus įrašus, kuriuose dėtalės kaina viršija 100EUR;
        System.out.println("\nSpausdinimas pašalinus įrašus, kuriuose dėtalės kaina viršija 100EUR:\n");
        salinimasSuIteratorium(dienosAtaskaita);
        spausdintiSuIteratorium(dienosAtaskaita);

    }

    static void spausdintiSuIteratorium(ArrayList<SarasasImpl> sarasas) {
        Iterator<SarasasImpl> iteratorius1 = sarasas.iterator();
        while (iteratorius1.hasNext()) {
            System.out.println(iteratorius1.next());
        }
    }

    static void spausdintiPaprastai(ArrayList<SarasasImpl> sarasas) {
        for (SarasasImpl darb : sarasas) {
            System.out.println(darb);
        }
    }

    static void dienosNormosVykdymas(ArrayList<SarasasImpl> sarasas) {
        Iterator<SarasasImpl> iteratorius2 = sarasas.iterator();
        while (iteratorius2.hasNext()) {
            SarasasImpl darbininkas = iteratorius2.next();
            if (darbininkas.getPagamintasKiekis() >= 1000) {
                darbininkas.setNorma("NORMA ĮVYKDYTA");
            } else if (darbininkas.getPagamintasKiekis() < 1000) {
                darbininkas.setNorma("NORMA NEĮVYKDYTA");
            }
        }
    }

    static void salinimasSuIteratorium(ArrayList<SarasasImpl> sarasas) {
        Iterator<SarasasImpl> iteratorius3 = sarasas.iterator();
        while(iteratorius3.hasNext()) {
            SarasasImpl darbininkas = iteratorius3.next();
            if (darbininkas.getDetalesKaina() > 100) {
                iteratorius3.remove();
            }
        }
    }

    static void salinimasPaprastai (ArrayList<SarasasImpl> sarasas) {
        for (int i = 0; i < sarasas.size(); i++) {
            SarasasImpl darbininkas = sarasas.get(i);
            if (darbininkas.getDetalesKaina() > 100) {
                sarasas.remove(i);
            }
        }
    }
}