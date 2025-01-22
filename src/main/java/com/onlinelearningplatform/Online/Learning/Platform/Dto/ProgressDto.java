package com.onlinelearningplatform.Online.Learning.Platform.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

public class ProgressDto {
    @NotNull(message = "User Id is required")
     private Long userId;

    @NotNull(message = "Course Id is required")
     private Long courseId;

    @NotNull(message = "Lessons completed is required")
     private int lessonCompleted;

    @NotNull(message = "Quiz scores is required")
     private Long quizScores;

    public @NotNull(message = "Course Id is required") Long getCourseId() {
        return courseId;
    }

    public void setCourseId(@NotNull(message = "Course Id is required") Long courseId) {
        this.courseId = courseId;
    }

    @NotNull(message = "Lessons completed is required")
    public int getLessonCompleted() {
        return lessonCompleted;
    }

    public void setLessonCompleted(@NotNull(message = "Lessons completed is required") int lessonCompleted) {
        this.lessonCompleted = lessonCompleted;
    }

    public @NotNull(message = "Quiz scores is required") Long getQuizScores() {
        return quizScores;
    }

    public void setQuizScores(@NotNull(message = "Quiz scores is required") Long quizScores) {
        this.quizScores = quizScores;
    }

    public @NotNull(message = "User Id is required") Long getUserId() {
        return userId;
    }

    public void setUserId(@NotNull(message = "User Id is required") Long userId) {
        this.userId = userId;
    }
}
