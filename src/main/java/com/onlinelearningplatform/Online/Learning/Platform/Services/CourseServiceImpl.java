package com.onlinelearningplatform.Online.Learning.Platform.Services;

import com.onlinelearningplatform.Online.Learning.Platform.Entity.Course;
import com.onlinelearningplatform.Online.Learning.Platform.Entity.CourseDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Optional<Course> getCourseById(Long courseId) {
        return null;
    }

    @Override
    public void updateCourse(Long courseId, CourseDto courseDto) {

    }

    @Override
    public void deleteCourse(Long courseId) {

    }
}
