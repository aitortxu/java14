package com.java14;

import com.java14.model.Person;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class InstanceOfTests {

    @Test
    void ShouldPerformPatternMatching() {
        Person objPerson = new Person("Donald", 14);
        Object obj = objPerson;
        if (obj instanceof Person person) {
            assertThat(person.name(), is("Donald"));
        }
    }
}
