package ru.maxima.spring;

public class RadioFactory {
    public Radio createRockRadio() {
        return new RockRadio();
    }
    public Radio createRetroRadio() {
        return new RetroRadio();
    }
    public Radio createNasheRadio() {
        return new NasheRadio();
    }

}
