package com.onlinelearningplatform.Online.Learning.Platform.Dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.List;

public class QuizDto {

    @NotNull(message = "Question is required")
    private String question;

    @NotNull(message = "Options are required")
    private List<String> options;

    @NotNull(message = "Correct answer is required")
    private List<String> correctAnswer;

    public @NotNull(message = "Correct answer is required") List<String> getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(@NotNull(message = "Correct answer is required") List<String> correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public @NotNull(message = "Question is required") String getQuestion() {
        return question;
    }

    public void setQuestion(@NotNull(message = "Question is required") String question) {
        this.question = question;
    }

    public @NotNull(message = "Options are required") List<String> getOptions() {
        return options;
    }

    public void setOptions(@NotNull(message = "Options are required") List<String> options) {
        this.options = options;
    }
}
