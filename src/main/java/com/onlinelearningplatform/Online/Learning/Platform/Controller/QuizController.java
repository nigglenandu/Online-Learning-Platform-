package com.onlinelearningplatform.Online.Learning.Platform.Controller;

import com.onlinelearningplatform.Online.Learning.Platform.Dto.QuizDto;
import com.onlinelearningplatform.Online.Learning.Platform.Dto.QuizSubmissionDto;
import com.onlinelearningplatform.Online.Learning.Platform.Entity.Quiz;
import com.onlinelearningplatform.Online.Learning.Platform.Services.IQuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/courses/{courseId}/quizzes")
public class QuizController {

    @Autowired
    private IQuizService quizService;

    @PostMapping
    public ResponseEntity<Void> addQuiz(@Valid @RequestBody QuizDto quizDto, Long courseId){
        quizService.addQuiz(quizDto, courseId);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<List<Quiz>> getQuizzesByCourseId(@PathVariable Long courseId){
        return quizService.getQuizzesByCourseId(courseId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/{quizId}")
    public ResponseEntity<Quiz> getQuizById(@PathVariable Long quizId){
        return quizService.getByQuizId(quizId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/{quizId}/submit")
    public ResponseEntity<Void> submitQuestionAnswer(@PathVariable Long quizId, @Valid @RequestBody QuizSubmissionDto quizSubmissionDto){
        quizService.submitQuestionAnswers(quizId, quizSubmissionDto);
        return ResponseEntity.ok().build();
    }
}
