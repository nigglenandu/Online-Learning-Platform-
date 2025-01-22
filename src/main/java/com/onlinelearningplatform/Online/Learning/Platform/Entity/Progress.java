package com.onlinelearningplatform.Online.Learning.Platform.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class Progress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long userId;
    private Long courseId;
    private int lessonsComplete;
    private Long quizScores;

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getLessonsComplete() {
        return lessonsComplete;
    }

    public void setLessonsComplete(int lessonsComplete) {
        this.lessonsComplete = lessonsComplete;
    }

    public Long getQuizScores() {
        return quizScores;
    }

    public void setQuizScores(Long quizScores) {
        this.quizScores = quizScores;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
