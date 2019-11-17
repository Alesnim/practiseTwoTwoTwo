package com.training.practiseTwoTwo.chapterTwo;


public class Main {

    public static void main(String[] args) {
	  CatsGenerator generator = new CatsGenerator();
	  for (int i=10; i<10; i++){
          System.out.println(generator.createCat());
      }
    }
}
