package ru.maxima.spring;

public class RetroRadio implements Radio {
    private String name;

    public RetroRadio(){
        System.out.println("This is RetroRadio! ٩(๏๏)۶");
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
