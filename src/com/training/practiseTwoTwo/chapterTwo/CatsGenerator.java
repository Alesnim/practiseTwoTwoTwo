package com.training.practiseTwoTwo.chapterTwo;

public class CatsGenerator {

    public CatsGenerator(){}


    // добавить реализацию случайного цвета шерсти
    public void randomColor(Cats cat){
        String[] color = {"Рыжий", "Черный", "Белый", "Серый", "Разноцветный"};
        cat.colorFur = color[(int)(Math.random()*color.length)];

    }



    void randomOld(Cats cats){

    }


    // может помочь метод String.valueOf(char[])
    // char randomLetter = (char) ('a' + Math.random() * ('z'-'a' + 1)); - сгенерирует случайную букву
    void randomName(Cats cats){

    }


    public Cats createCat(){
        Cats cats = new Cats();
        randomColor(cats);
        randomName(cats);
        randomOld(cats);
        return cats;
    }
}
