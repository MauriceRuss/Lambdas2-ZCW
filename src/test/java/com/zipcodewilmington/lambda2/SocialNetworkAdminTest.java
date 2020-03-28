package com.zipcodewilmington.lambda2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SocialNetworkAdminTest {

    Person mo = new Person("mo", LocalDate.of(1975, 10, 01),
            Person.Sex.MALE,"mo@dawg.com");
    Person jack = new Person("jack", LocalDate.of(1977, 4, 12),
            Person.Sex.MALE,"jack@son.com");
    Person damon = new Person("damon", LocalDate.of(1971, 2, 9),
            Person.Sex.MALE,"d@bignig.com");
    Person jamie = new Person("jamie", LocalDate.of(1977, 5, 10),
            Person.Sex.MALE,"jcraz@gringoloco.com");
    Person colleen = new Person("colleen", LocalDate.of(1965, 6, 24),
            Person.Sex.MALE,"colcat@campbells.com");
    List<Person> crew;
    @Before
    public void setUp(){

        crew.add(mo);
        crew.add(jack);
        crew.add(damon);
        crew.add(jamie);
        crew.add(colleen);

    }





}