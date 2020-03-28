package com.zipcodewilmington.lambda2;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class PersonTest {
    private LocalDate birthday;
    private LocalDate now = LocalDate.now();

    @Test
    public void getAge() {
        //when
        Person mo = new Person("mo",LocalDate.of(1975, 10, 01),
                Person.Sex.MALE,"mo@dawg.com");
        //given
        int expected = 44;
        int actual = mo.getAge();
        //then
        Assert.assertEquals(expected, actual);
    }
}