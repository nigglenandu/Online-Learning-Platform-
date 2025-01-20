package com.onlinelearningplatform.Online.Learning.Platform.Entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class QuizDto {

    @NotNull(message = "Question is required")
    private String question;

    @NotNull(message = "Options are required")
    private List<String> options;

    @NotNull(message = "Correct answer is required")
    private String correctAnswer;
}
