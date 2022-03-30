package com.company;

import java.util.Comparator;

public class SarasasImpl implements Sarasas, Comparable<SarasasImpl> {
    private String darbininkas;
    private String detale;
    private double pagamintasKiekis;
    private double detalesKaina;
    private double suma;
    private String norma;

    public SarasasImpl(String darbininkas, String detale, double pagamintasKiekis, double detalesKaina, double suma, String norma) {
        this.darbininkas = darbininkas;
        this.detale = detale;
        this.pagamintasKiekis = pagamintasKiekis;
        this.detalesKaina = detalesKaina;
        this.suma = (double) pagamintasKiekis * detalesKaina;
        this.norma = norma;
    }

    @Override
    public String getDarbininkas() {
        return darbininkas;
    }

    @Override
    public void setDarbininkas(String darbininkas) {
        this.darbininkas = darbininkas;

    }

    @Override
    public String getDetale() {
        return detale;
    }

    @Override
    public void setDetale(String detale) {
        this.detale = detale;

    }

    @Override
    public double getPagamintasKiekis() {
        return pagamintasKiekis;
    }

    @Override
    public void setPagamintasKiekis(double pagamintasKiekis) {
        this.pagamintasKiekis = pagamintasKiekis;

    }

    @Override
    public double getDetalesKaina() {
        return detalesKaina;
    }

    @Override
    public void setDetalesKaina(double detalesKaina) {
        this.detalesKaina = detalesKaina;

    }

    @Override
    public double getSuma() {
        return suma;
    }

    @Override
    public void setSuma(double suma) {
        this.suma = detalesKaina * pagamintasKiekis;
    }

    public String getNorma() {
        return norma;
    }

    @Override
    public void setNorma(String norma) {
        this.norma = norma;
    }


    @Override
    public String toString() {
        return "SarasasImpl{" +
                "detale='" + detale + '\'' +
                ", pagamintasKiekis=" + pagamintasKiekis +
                ", suma=" + suma +
                ", " + norma +
                '}';
    }

    @Override
    public int compareTo(SarasasImpl o) {
        return Comparator
                .comparing(SarasasImpl::getPagamintasKiekis)
                .reversed()
                .thenComparing(SarasasImpl::getDetale)
                .compare(this, o);
    }
}
