package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;


public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {

        Person dead = new Person("Dead", 0, 30, Gender.FEMALE, false);
        Person invalidAge = new Person("Invalid Age", 1, -3, Gender.MALE, true);
        Person underage = new Person("Underage", 2, 15, Gender.UNIDENTIFIED, true);
        Person duplicated = new Person("Duplicated", 3, 30, Gender.FEMALE, true);

        //Dead
        Assert.assertEquals(RegisterResult.DEAD, registry.registerVoter(dead));
        //Invalid age
        Assert.assertEquals(RegisterResult.INVALID_AGE, registry.registerVoter(invalidAge));
        //Underage
        Assert.assertEquals(RegisterResult.UNDERAGE, registry.registerVoter(underage));
        //Valid
        Assert.assertEquals(RegisterResult.VALID, registry.registerVoter(duplicated));
        //Duplicated
        Assert.assertEquals(RegisterResult.DUPLICATED, registry.registerVoter(duplicated));
    }
}