package com.onlinelearningplatform.Online.Learning.Platform.Controller;


import com.onlinelearningplatform.Online.Learning.Platform.Entity.Progress;
import com.onlinelearningplatform.Online.Learning.Platform.Entity.ProgressDto;
import com.onlinelearningplatform.Online.Learning.Platform.Services.IServiceProgress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/progress")
public class ProgressController {
    @Autowired
    private IServiceProgress progressService;

    @PostMapping("/track")
    public ResponseEntity<Void> trackProgress(@Valid @RequestBody ProgressDto progressDto){
        progressService.trackProgress(progressDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public List<Progress> getAllProgressByUserId(@RequestParam Long userId){
        return progressService.getAllProgressByUserId(userId);
    }

    @GetMapping("/update-score")
    public ResponseEntity<Progress> getProgressByUserIdAndCourseId(@RequestParam Long userId, @RequestParam Long courseId){
        return progressService.getProgressByUserIdAndCourseId(userId, courseId)
                .map(progress -> new ResponseEntity<>(progress, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/update-score")
    public ResponseEntity<Void> updateQuizScore(@RequestParam Long userId,@RequestParam Long courseId, @RequestParam Long score){
        progressService.updateQuizScore(userId, courseId, score);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
