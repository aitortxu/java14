package com.java14;

import com.java14.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class RecordTests {

    @Test
    void ShouldBeAbleToUseRecords() {
        Person person = new Person("Donald", 14);
        assertThat(person.name(), is("Donald"));
        assertThat(person.age(), is(14));
    }

    @Test
    void ShouldChangeProperties() {
        Person person = new Person("Donald", 14);

        person.modifyName("Steve");
        assertThat(person.name(), is("Steve"));
    }

    @Test
    void ShouldCheckPropertiesInConstructor() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Person("Donald", -32);
        });
    }
}
