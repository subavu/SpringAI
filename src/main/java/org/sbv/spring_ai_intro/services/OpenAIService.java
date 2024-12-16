package org.sbv.spring_ai_intro.services;

/**
 * This interface defines services for interacting with an AI chat model.
 */
public interface OpenAIService {

    /**
     * Retrieves an answer from the AI model based on the provided question.
     *
     * @param question The question to be answered by the AI model.
     */
    String getAnswer(String question);
}
