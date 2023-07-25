package ru.maxima.spring;

public class NasheRadio implements Radio {
    private String name;

    public NasheRadio(){
        System.out.println("Это НашеРадио! ¯\\_(ツ)_/¯");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSong(){
        return "Lumen - Сид и Нэнси";
    }
}
