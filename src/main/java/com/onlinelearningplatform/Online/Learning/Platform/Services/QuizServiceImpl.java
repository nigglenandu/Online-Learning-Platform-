package com.onlinelearningplatform.Online.Learning.Platform.Services;

import com.onlinelearningplatform.Online.Learning.Platform.Entity.Progress;
import com.onlinelearningplatform.Online.Learning.Platform.Entity.Quiz;
import com.onlinelearningplatform.Online.Learning.Platform.Entity.QuizDto;
import com.onlinelearningplatform.Online.Learning.Platform.Entity.QuizSubmissionDto;
import com.onlinelearningplatform.Online.Learning.Platform.Repository.ProgressRepository;
import com.onlinelearningplatform.Online.Learning.Platform.Repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuizServiceImpl implements IQuizService{

    @Autowired
    private QuizRepository quizRepository;

    @Autowired
    private ProgressRepository progressRepository;

    @Override
    public void addQuiz(QuizDto quizDto, Long courseId) {
        Quiz quiz = new Quiz();
        quiz.setCourseId(courseId);
        quiz.setQuestion(quizDto.getQuestion());
        quiz.setOptions(quizDto.getOptions());
        quiz.setCorrectAnswer(quizDto.getCorrectAnswer());
        quizRepository.save(quiz);
    }

    @Override
    public Optional<List<Quiz>> getQuizzesByCourseId(Long courseId) {
        return quizRepository.findByCourseId(courseId);
    }

    @Override
    public Optional<Quiz> getByQuizId(Long quizId) {
        return quizRepository.findQuizById(quizId);
    }

    @Override
    public void submitQuestionAnswers(Long quizId, QuizSubmissionDto submissionDto) {
        Optional<Quiz> quizOpt = getByQuizId(quizId);
        if(quizOpt.isPresent()){
            Quiz quiz = quizOpt.get();
            boolean isCorrect = quiz.getCorrectAnswer().equals(submissionDto.getSelectedAnswers());
            Optional<Progress> progressOpt = progressRepository.findByUserIdAndCourseId(submissionDto.getUserId(), quiz.getCourseId());
            if(progressOpt.isPresent()){
                Progress progress = progressOpt.get();
                if(isCorrect){
                    progress.setQuizScores(progress.getQuizScores() + 1);
                    progressRepository.save(progress);
                }
            }

        }
    }
}
