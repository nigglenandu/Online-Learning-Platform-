package com.onlinelearningplatform.Online.Learning.Platform.Repository;

import com.onlinelearningplatform.Online.Learning.Platform.Entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {
    Optional<List<Quiz>> findByCourseId(Long courseId);

    Optional<Quiz> findQuizById(Long quizId);
}
