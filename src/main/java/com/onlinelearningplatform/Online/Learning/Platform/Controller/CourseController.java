package com.onlinelearningplatform.Online.Learning.Platform.Controller;

import com.onlinelearningplatform.Online.Learning.Platform.Entity.Course;
import com.onlinelearningplatform.Online.Learning.Platform.Dto.CourseDto;
import com.onlinelearningplatform.Online.Learning.Platform.Services.ICourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final ICourseService courseService;

    public CourseController(ICourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public ResponseEntity<List<Course>> getAllCourses() {
        List<Course> courses = courseService.getAllCourses();
        return courses.isEmpty() ? ResponseEntity.notFound().build() : ResponseEntity.ok(courses);
    }

    @PostMapping
    public ResponseEntity<Void> createCourse(@Valid @RequestBody CourseDto courseDto, @RequestParam Long instructId) {
        courseService.createCourse(courseDto, instructId);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Course> getCourseId(@PathVariable Long id) {
        return courseService.getCourseById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateCourse(@PathVariable Long id, @Valid @RequestBody CourseDto courseDto) {
        courseService.updateCourse(id, courseDto);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}