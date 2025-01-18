package com.onlinelearningplatform.Online.Learning.Platform.Repository;

import com.onlinelearningplatform.Online.Learning.Platform.Entity.Progress;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProgressRepository extends JpaRepository<Progress, Long> {
    Optional<Progress> findByUserIdAndCourseId(Long userId, Long courseId);

    List<Progress> getAllProgressByUserId(Long userId);
}
