package edu.eci.cvds.tdd.registry;

import java.util.HashSet;

public class Registry {

    private final HashSet<Integer> registeredIds = new HashSet<>();

    public RegisterResult registerVoter(Person p) {

        if (!p.isAlive()) {
            return RegisterResult.DEAD;
        }
        if (p.getAge() < 0) {
            return RegisterResult.INVALID_AGE;
        } else if (p.getAge() < 18) {
            return RegisterResult.UNDERAGE;
        }
        if (registeredIds.contains(p.getId())) {
            return RegisterResult.DUPLICATED;
        }
        registeredIds.add(p.getId());
        return RegisterResult.VALID;
    }
}