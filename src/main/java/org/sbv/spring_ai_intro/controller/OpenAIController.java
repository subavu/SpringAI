package org.sbv.spring_ai_intro.controller;

import org.sbv.spring_ai_intro.services.OpenAIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller to handle API requests for generating answers from the AI model.
 */
@RestController
@RequestMapping("/api")
public class OpenAIController {

    // Auto-wiring the OpenAIService to use its getAnswer method
    private final OpenAIService openAIService;

    @Autowired
    public OpenAIController(OpenAIService openAIService) {
        this.openAIService = openAIService;
    }

    /**
     * Endpoint to get an answer from the AI model based on the provided question.
     *
     * @param question The question to be answered by the AI service.
     * @return A ResponseEntity containing the AI-generated answer.
     */
    @GetMapping("/get-answer")
    public ResponseEntity<String> getAnswer(@RequestParam String question) {
        try {
            // Using the service to get the answer to the question
            String answer = openAIService.getAnswer(question);
            return ResponseEntity.ok(answer); // Return the answer encapsulated in an HTTP 200 response
        } catch (Exception e) {
            // Handling possible errors and sending a Bad Request response
            return ResponseEntity.badRequest().body("Error processing the request: " + e.getMessage());
        }
    }
}
