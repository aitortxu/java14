package com.java14;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

class TextBlockTests {

    @Test
    void ShouldHandleTextBlocks() {
       String textBlock = """
               line one
               line two 
               ...
               last line
               """;
       assertThat(textBlock, containsString("last line"));
    }

}
