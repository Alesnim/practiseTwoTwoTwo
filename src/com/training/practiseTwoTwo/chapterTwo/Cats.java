package com.training.practiseTwoTwo.chapterTwo;



// создать геттеры и сеттеры для класса
public class Cats {
    private int old;
    private String name;
    private String colorEye;
    private String colorFur;

    public Cats(){}

    public Cats(int old){
        this.old = checkOld(old);
    }

    public Cats(int old, String name){
        this.old = checkOld(old);
        this.name = checkName(name);

    }
    // реализовать метод
    private int checkOld(int old){

    }
    
    // реализовать метод
    private String checkName(String name){

    }

    // реализовать строковое представление объекта
    @Override
    public String toString() {
        return "";
    }


}
