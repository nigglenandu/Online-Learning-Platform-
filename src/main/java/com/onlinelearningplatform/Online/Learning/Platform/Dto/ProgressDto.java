package com.onlinelearningplatform.Online.Learning.Platform.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProgressDto {
    @NotNull(message = "User Id is required")
     private Long userId;

    @NotNull(message = "Course Id is required")
     private Long courseId;

    @NotNull(message = "Lessons completed is required")
     private int lessonCompleted;

    @NotNull(message = "Quiz scores is required")
     private Long quizScores;
}
