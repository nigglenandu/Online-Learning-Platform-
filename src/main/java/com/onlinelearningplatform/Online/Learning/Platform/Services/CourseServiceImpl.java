package com.onlinelearningplatform.Online.Learning.Platform.Services;

import com.onlinelearningplatform.Online.Learning.Platform.Entity.Course;
import com.onlinelearningplatform.Online.Learning.Platform.Dto.CourseDto;
import com.onlinelearningplatform.Online.Learning.Platform.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements ICourseService{
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public void createCourse(CourseDto courseDto, Long instructorId) {
        Course course = new Course();
        course.setTitle(courseDto.getTitle());
        course.setDescription(courseDto.getDescription());
        course.setInstructorId(instructorId);
        course.setCreatedAt(LocalDateTime.now());
        courseRepository.save(course);
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Optional<Course> getCourseById(Long courseId) {
        return courseRepository.findById(courseId);
    }

    @Override
    public void updateCourse(Long courseId, CourseDto courseDto) {
        Optional<Course> courseOpt = courseRepository.findById(courseId);
        if(courseOpt.isPresent()){
            Course course = courseOpt.get();
            course.setTitle(courseDto.getTitle());
            course.setDescription(courseDto.getDescription());
            courseRepository.save(course);
        }
    }

    @Override
    public void deleteCourse(Long courseId) {
        courseRepository.deleteById(courseId);

    }
}
