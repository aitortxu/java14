package com.java12;

import com.java12.model.Employee;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.*;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;

class StringTests {

    @Test
    void ShouldIntentString() throws IOException {
        String str = "How are you?";

        assertThat(str.indent(3), is("   How are you?\n"));
    }

    @Test
    void ShouldTransform() throws IOException {
        String str = "Hi,Hello,Howdy";
        List strList = str.transform(s1 -> {return Arrays.asList(s1.split(","));});

        assertThat(strList.size(), is(3));
        assertThat(strList.get(1), is("Hello"));
    }

    @Test
    void ShouldDescribeConstable() throws IOException {
        String str = "Hello";
        Optional os = str.describeConstable();

        assertThat(os.get(), is(str));
    }

    @Test
    void ShouldResolveConstantDesc() throws IOException {
        String str = "Hello";

        assertThat(str.resolveConstantDesc(MethodHandles.lookup()), is(str));
    }
}
