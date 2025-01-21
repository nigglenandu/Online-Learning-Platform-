package com.onlinelearningplatform.Online.Learning.Platform.Services;

import com.onlinelearningplatform.Online.Learning.Platform.Entity.Progress;
import com.onlinelearningplatform.Online.Learning.Platform.Dto.ProgressDto;

import java.util.List;
import java.util.Optional;

public interface IServiceProgress {
    void trackProgress(ProgressDto progressDto);
    Optional<Progress> getProgressByUserIdAndCourseId(Long userId, Long courseId);
    List<Progress> getAllProgressByUserId(Long userId);
    void updateQuizScore(Long userId, Long courseId, Long score);
}
