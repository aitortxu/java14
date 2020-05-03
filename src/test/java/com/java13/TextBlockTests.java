package com.java13;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class TextBlockTests {

    @Test
    void ShouldHandleFormattedMethod() {
        String output = """
			    Name: %s
			    Phone: %d
			    Salary: $%.2f
			    """.formatted("Pankaj", 123456789, 2000.5555);

        assertThat(output, containsString("Name: Pankaj"));
        assertThat(output, containsString("Phone: 123456789"));
        assertThat(output, containsString("Salary: $2000,56"));
    }
}
