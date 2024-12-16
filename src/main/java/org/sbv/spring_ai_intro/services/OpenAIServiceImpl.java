package org.sbv.spring_ai_intro.services;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.stereotype.Service;

/**
 * This service class provides an implementation for interacting with an AI chat model.
 * It defines methods to process a question and retrieve an answer using the OpenAI API.
 */
@Service
public class OpenAIServiceImpl implements OpenAIService {

    // ChatModel instance for making AI calls. It is injected via the constructor.
    private final ChatModel chatModel;

    /**
     * Constructs an OpenAIServiceImpl with a specific ChatModel.
     *
     * @param chatModel The ChatModel to use for AI operations.
     */
    public OpenAIServiceImpl(ChatModel chatModel) {
        this.chatModel = chatModel;
    }

    /**
     * Retrieves an answer from the AI model based on the provided question.
     *
     * @param question The question to be answered by the AI model.
     * @return The AI-generated answer as a String.
     */
    @Override
    public String getAnswer(String question) {
        // Create a PromptTemplate with the provided question.
        PromptTemplate promptTemplate = new PromptTemplate(question);

        // Generate a Prompt from the template.
        Prompt prompt = promptTemplate.create();

        // Call the ChatModel with the generated Prompt to get a ChatResponse.
        ChatResponse response = chatModel.call(prompt);

        // Extract and return the content of the AI response.
        return response.getResult().getOutput().getContent();
    }
}
