package com.java12;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class FilesMismatchTests {

    @Test
    void ShouldHandleFilesMismatchMethod() throws IOException {
        Path originalFile = Files.createTempFile("file1", ".txt");
        Path equalFile = Files.createTempFile("file2", ".txt");
        Path differentFile = Files.createTempFile("file3", ".txt");
        Files.writeString(originalFile,"JournalDev Test String");
        Files.writeString(equalFile,"JournalDev Test String");
        Files.writeString(differentFile,"JournalDev***** Test String");

        assertThat(Files.mismatch(originalFile, equalFile), is(-1L));
        assertThat(Files.mismatch(originalFile, differentFile), is(10L));
    }
}
