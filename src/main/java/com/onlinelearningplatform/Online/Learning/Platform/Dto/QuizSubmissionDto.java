package com.onlinelearningplatform.Online.Learning.Platform.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

public class QuizSubmissionDto {
    private Long userId;
    private List<String> selectedAnswers;

    public List<String> getSelectedAnswers() {
        return selectedAnswers;
    }

    public void setSelectedAnswers(List<String> selectedAnswers) {
        this.selectedAnswers = selectedAnswers;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
