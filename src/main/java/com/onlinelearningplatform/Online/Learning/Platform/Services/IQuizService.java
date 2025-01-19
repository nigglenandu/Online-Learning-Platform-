package com.onlinelearningplatform.Online.Learning.Platform.Services;

import com.onlinelearningplatform.Online.Learning.Platform.Entity.Quiz;
import com.onlinelearningplatform.Online.Learning.Platform.Entity.QuizDto;
import com.onlinelearningplatform.Online.Learning.Platform.Entity.QuizSubmissionDto;

import java.util.List;
import java.util.Optional;

public interface IQuizService {
    void addQuiz(QuizDto quizDto, Long courseId);
    Optional<List<Quiz>> getQuizzesByCourseId(Long courseId);
    Optional<Quiz> getByQuizId(Long quizId);
    void submitQuestionAnswers(Long quizId, QuizSubmissionDto submissiontionDto);
}
