package ru.maxima.spring;

public class RockRadio implements Radio {
    private String name;

    public RockRadio(){
        System.out.println("This is RockRadio! \\oo/");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSong(){
        return "Papa Roach - Scars";
    }
}
