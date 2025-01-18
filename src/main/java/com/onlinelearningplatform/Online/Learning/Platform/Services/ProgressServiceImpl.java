package com.onlinelearningplatform.Online.Learning.Platform.Services;

import com.onlinelearningplatform.Online.Learning.Platform.Entity.Progress;
import com.onlinelearningplatform.Online.Learning.Platform.Entity.ProgressDto;
import com.onlinelearningplatform.Online.Learning.Platform.Repository.ProgressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProgressServiceImpl implements IServiceProgress{
    @Autowired
    private ProgressRepository progressRepo;

    @Override
    public void trackProgress(ProgressDto progressDto) {
        Progress progress = new Progress();
        progress.setUserId(progressDto.getUserId());
        progress.setCourseId(progressDto.getCourseId());
        progress.setLessonsComplete(progressDto.getLessonCompleted());
        progress.setQuizScores(progressDto.getQuizScores());
        progressRepo.save(progress);
    }

    @Override
    public Optional<Progress> getProgressByUserIdAndCourseId(Long userId, Long courseId) {
        return progressRepo.findByUserIdAndCourseId(userId, courseId);
    }

    @Override
    public List<Progress> getAllProgressByUserId(Long userId) {
        return progressRepo.getAllProgressByUserId(userId);
    }

    @Override
    public void updateQuizScore(Long userId, Long courseId, Long score) {
        Optional<Progress> progressOpt = progressRepo.findByUserIdAndCourseId(userId, courseId);
        if(progressOpt.isPresent()){
            Progress progress = progressOpt.get();
            progress.setQuizScores(score);
            progressRepo.save(progress);
        }
    }
}
