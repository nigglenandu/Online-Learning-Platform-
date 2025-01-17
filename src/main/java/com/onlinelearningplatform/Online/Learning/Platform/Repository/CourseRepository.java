package com.onlinelearningplatform.Online.Learning.Platform.Repository;

import com.onlinelearningplatform.Online.Learning.Platform.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{
}
