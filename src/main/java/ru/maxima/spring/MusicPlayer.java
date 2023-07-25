package ru.maxima.spring;

import java.util.List;

public class MusicPlayer {
    private Radio radio;
    private String nameOfRadioFreq;
    private List<Radio> listOfRadio;
    private double beginFreq;
    private double endFreq;

    public MusicPlayer() {
    }

    public Radio getRadio() {
        return radio;
    }

    public String getNameOfRadioFreq() {
        return nameOfRadioFreq;
    }

    public List<Radio> getListOfRadio() {
        return listOfRadio;
    }

    public double getBeginFreq() {
        return beginFreq;
    }

    public double getEndFreq() {
        return endFreq;
    }

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    public void setNameOfRadioFreq(String nameOfRadioFreq) {
        this.nameOfRadioFreq = nameOfRadioFreq;
    }

    public void setListOfRadio(List<Radio> listOfRadio) {
        this.listOfRadio = listOfRadio;
    }

    public void setBeginFreq(double beginFreq) {
        this.beginFreq = beginFreq;
    }

    public void setEndFreq(double endFreq) {
        this.endFreq = endFreq;
    }

    public void playMusic() {
        listOfRadio.forEach(rad1 -> System.out.println(rad1.getSong()));
    }

}
