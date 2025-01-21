package com.onlinelearningplatform.Online.Learning.Platform.Controller;


import com.onlinelearningplatform.Online.Learning.Platform.Dto.VideoDto;
import com.onlinelearningplatform.Online.Learning.Platform.Entity.Video;
import com.onlinelearningplatform.Online.Learning.Platform.Services.IServiceVideo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/courses/{courseId}/videos")
public class VideoController {
    @Autowired
    private IServiceVideo serviceVideo;


    @PostMapping
    public ResponseEntity<Void> addVideo(@Valid @RequestBody VideoDto videoDto, @PathVariable Long courseId){
      serviceVideo.addVideo(videoDto, courseId);
      return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{videoId}")
    public ResponseEntity<Video> getVideoById(@PathVariable Long videoId){
        return serviceVideo.getVideoById(videoId)
                .map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public ResponseEntity<List<Video>> getVideoAByID(@PathVariable Long courseId){
        List<Video> videos = serviceVideo.getVideosByCourseId(courseId);
        if(videos.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(videos, HttpStatus.OK);
        }
    }

    @DeleteMapping("/{videoId}")
    public ResponseEntity<Void> deleteVideo(@PathVariable Long videoId){
        serviceVideo.deleteVideoById(videoId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
