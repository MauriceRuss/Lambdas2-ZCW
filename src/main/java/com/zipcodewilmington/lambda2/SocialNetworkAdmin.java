package com.zipcodewilmington.lambda2;

import java.util.ArrayList;
import java.util.List;

public class SocialNetworkAdmin implements CheckPerson {
    List<Person> roster = new ArrayList<>();

    public SocialNetworkAdmin() {
        this.roster = new ArrayList<>();
    }

    @Override
    public boolean test(Person p) {
        return false;
    }

    public void addToSocNet(Person p){
       roster.add(p);
    }


}
