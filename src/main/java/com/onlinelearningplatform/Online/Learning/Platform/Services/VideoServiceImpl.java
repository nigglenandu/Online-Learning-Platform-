package com.onlinelearningplatform.Online.Learning.Platform.Services;

import com.onlinelearningplatform.Online.Learning.Platform.Dto.VideoDto;
import com.onlinelearningplatform.Online.Learning.Platform.Entity.Video;
import com.onlinelearningplatform.Online.Learning.Platform.Repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VideoServiceImpl implements IServiceVideo{

    @Autowired
    private VideoRepository videoRepository;

    @Override
    public void addVideo(VideoDto videoDto, Long courseId) {
        Video video = new Video();
        video.setTitle(videoDto.getTitle());
        video.setCourseId(courseId);
        video.setVideoUrl(videoDto.getVideoUrl());
        video.setCreatedAt(videoDto.getCreatedAt());
        videoRepository.save(video);
    }

    @Override
    public Optional<Video> getVideoById(Long videoId) {
        return videoRepository.findById(videoId);
    }

    @Override
    public List<Video> getVideosByCourseId(Long courseId) {
        return videoRepository.findByCourseId(courseId);
    }

    @Override
    public void deleteVideoById(Long videoId) {
        videoRepository.deleteById(videoId);
    }
}
