package com.zipcodewilmington.lambda2;

import java.util.ArrayList;
import java.util.List;

public class SocialNetworkAdmin implements CheckPerson {
    List<Person> roster = new ArrayList<>();

    public SocialNetworkAdmin() {
        this.roster = new ArrayList<>();
    }
    //check for adult content
    @Override
    public boolean test(Person p) {
        return p.getAge()>21;
    }




}
