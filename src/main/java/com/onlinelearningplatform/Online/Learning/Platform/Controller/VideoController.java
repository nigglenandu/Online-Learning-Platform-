package com.onlinelearningplatform.Online.Learning.Platform.Controller;

import com.onlinelearningplatform.Online.Learning.Platform.Dto.VideoDto;
import com.onlinelearningplatform.Online.Learning.Platform.Entity.Video;
import com.onlinelearningplatform.Online.Learning.Platform.Services.IServiceVideo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/courses/{courseId}/videos")
public class VideoController {
    private final IServiceVideo serviceVideo;

    public VideoController(IServiceVideo serviceVideo) {
        this.serviceVideo = serviceVideo;
    }

    @PostMapping
    public ResponseEntity<Void> addVideo(@Valid @RequestBody VideoDto videoDto, @PathVariable Long courseId) {
        serviceVideo.addVideo(videoDto, courseId);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{videoId}")
    public ResponseEntity<Video> getVideoById(@PathVariable Long videoId) {
        return serviceVideo.getVideoById(videoId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Video>> getVideoAByID(@PathVariable Long courseId) {
        List<Video> videos = serviceVideo.getVideosByCourseId(courseId);
        return videos.isEmpty() ? ResponseEntity.notFound().build() : ResponseEntity.ok(videos);
    }

    @DeleteMapping("/{videoId}")
    public ResponseEntity<Void> deleteVideo(@PathVariable Long videoId) {
        serviceVideo.deleteVideoById(videoId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}