package com.tw.academy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

public class HelloWordTest {
    @Test
    public void should_say_hello_world(){
        HelloWorld helloWorld = new HelloWorld();
        String actual = helloWorld.say("World");
        assertThat(actual).isEqualTo("HelloWorld");
    }

    @Test
    public void should_mock(){
        HelloWorld helloWorld = mock(HelloWorld.class);
        given(helloWorld.say("World")).willReturn("HeHe");
        String actual = helloWorld.say("World");
        assertThat(actual).isEqualTo("HeHe");
    }

    @DisplayName("should_value_source_work")
    @ParameterizedTest(name = "should return Hello{0}")
    @ValueSource(strings = {"Earth", "Mysteries", "Starry Sky", "Moon"})
    public void should_value_source_work(String world) {
        HelloWorld helloWorld = new HelloWorld();
        String actual = helloWorld.say(world);
        assertThat(actual).isEqualTo("Hello"+world);
    }
}