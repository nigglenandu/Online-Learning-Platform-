package com.onlinelearningplatform.Online.Learning.Platform.Services;

import com.onlinelearningplatform.Online.Learning.Platform.Entity.Video;
import com.onlinelearningplatform.Online.Learning.Platform.Dto.VideoDto;

import java.util.List;
import java.util.Optional;

public interface IServiceVideo {
    void addVideo(VideoDto videoDto, Long courseId);
    Optional<Video> getVideoById(Long videoId);
    List<Video> getVideosByCourseId(Long courseId);
    void deleteVideoById(Long videoId);
}
