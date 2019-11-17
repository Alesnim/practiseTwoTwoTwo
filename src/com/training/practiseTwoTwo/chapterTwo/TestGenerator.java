package com.training.practiseTwoTwo.chapterTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestGenerator {


    @Test
    public void testCat(){
        try {
            Cats cats1 = new Cats(22, "qwe");
            Cats cats2 = new Cats(22);
            Cats cats = new Cats();
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testCatsOldCreate(){
        Cats cats = new Cats(-4);
        assertFalse(cats.getOld() == -4);
        cats.setOld(-4);
        assertFalse(cats.getOld() == -4);

    }

    @Test
    public void testCatsNameCreate(){
        Cats cats = new Cats(22, "Мурзик");
        cats.setName("");
        assertNotEquals("", cats.getName());
    }



}

