package com.onlinelearningplatform.Online.Learning.Platform.Services;

import com.onlinelearningplatform.Online.Learning.Platform.Entity.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements ICourseService{
    @Override
    public void createCourse(CourseDto coursedDto, Long instructorId) {

    }

    @Override
    public List<Course> getAllCourses() {
        return List.of();
    }

    @Override
    public Course getCourseById(Long courseId) {
        return null;
    }

    @Override
    public void updateCourse(Long courseId) {

    }

    @Override
    public void deleteCourse(Long courseId) {

    }
}
