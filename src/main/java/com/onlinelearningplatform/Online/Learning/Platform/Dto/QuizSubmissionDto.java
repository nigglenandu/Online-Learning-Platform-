package com.onlinelearningplatform.Online.Learning.Platform.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class QuizSubmissionDto {
    private Long userId;
    private List<String> selectedAnswers;
}
