package com.onlinelearningplatform.Online.Learning.Platform.Services;

import com.onlinelearningplatform.Online.Learning.Platform.Entity.Course;
import com.onlinelearningplatform.Online.Learning.Platform.Entity.CourseDto;

import java.util.List;
import java.util.Optional;

public interface ICourseService {
    void createCourse(CourseDto courseDto, Long instructorId);
    List<Course> getAllCourses();
    Optional<Course> getCourseById(Long courseId);
    void updateCourse(Long courseId, CourseDto courseDto);
    void deleteCourse(Long courseId);
}
