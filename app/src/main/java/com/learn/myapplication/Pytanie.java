package com.learn.myapplication;

import java.util.ArrayList;

public class Pytanie {
    private String tresc;
    private ArrayList<String> odpowiedzi;
    private int odpPoprawna;
    private int idObrazka;
    private String podpowiedz;

    public Pytanie(String tresc, String odp_a, String odp_b,String odp_c,int odpPoprawna, int idObrazka, String podpowiedz)
    {
        this.tresc = tresc;
        this.odpowiedzi = new ArrayList<>();
        this.odpowiedzi.add(odp_a);
        this.odpowiedzi.add(odp_b);
        this.odpowiedzi.add(odp_c);
        this.odpPoprawna = odpPoprawna;
        this.idObrazka = idObrazka;
        this.podpowiedz = podpowiedz;
    }

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    public ArrayList<String> getOdpowiedzi() {
        return odpowiedzi;
    }

    public void setOdpowiedzi(ArrayList<String> odpowiedzi) {
        this.odpowiedzi = odpowiedzi;
    }

    public int getOdpPoprawna() {
        return odpPoprawna;
    }

    public void setOdpPoprawna(int odpPoprawna) {
        this.odpPoprawna = odpPoprawna;
    }

    public int getIdObrazka() {
        return idObrazka;
    }

    public void setIdObrazka(int idObrazka) {
        this.idObrazka = idObrazka;
    }

    public String getPodpowiedz() {
        return podpowiedz;
    }

    public void setPodpowiedz(String podpowiedz) {
        this.podpowiedz = podpowiedz;
    }

}
