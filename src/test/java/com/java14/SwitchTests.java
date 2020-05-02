package com.java14;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class SwitchTests {

    @ParameterizedTest
    @CsvSource({
            "M,MWF",
            "TH,TTS",
            "WADUS,Looks like a Sunday."})
    void ShouldExecuteSwitch(String day, String expected) {
        String result = switch (day) {
            case "M", "W", "F" -> "MWF";
            case "T", "TH", "S" -> "TTS";
            default -> "Looks like a Sunday.";
        };
        assertThat(result, is(expected));
    }

}
