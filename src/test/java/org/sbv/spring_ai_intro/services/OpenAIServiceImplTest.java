package org.sbv.spring_ai_intro.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for OpenAIServiceImpl. This class uses Spring's testing support to load the application context and perform integration testing.
 */
@SpringBootTest
class OpenAIServiceImplTest {

    // Autowire the OpenAIService to use in test cases
    @Autowired
    private OpenAIService openAIService;

    /**
     * Test method for OpenAIService.getAnswer(). It verifies that the service returns a valid response
     * when asked to generate a Java program using Stream APIs to print numbers from 1 to 100.
     */
    @Test
    void getAnswer() {
        // Call the getAnswer method and store the result in a variable
        String answer = openAIService.getAnswer("Write a java program to print numbers from 1 to 100 using Stream APIs");

        // Output the response to standard console for debugging purposes
        System.out.println("Get the answer");
        System.out.println(answer);

        // Assertions could be added here to automatically verify the result
        assertNotNull(answer, "The answer should not be null");
        assertFalse(answer.isEmpty(), "The answer should not be empty");
        // Additional assertions can be implemented to verify the correctness of the answer more rigorously
    }
}
