package com.onlinelearningplatform.Online.Learning.Platform.Services;

import com.onlinelearningplatform.Online.Learning.Platform.Entity.Course;

import java.util.List;

public interface ICourseService {
    void createCourse(CourseDto coursedDto, Long instructorId)
    List<Course> getAllCourses();
    Course getCourseById(Long courseId);
    void updateCourse(Long courseId);
    void deleteCourse(Long courseId);
}
