package com.onlinelearningplatform.Online.Learning.Platform.Repository;

import com.onlinelearningplatform.Online.Learning.Platform.Entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoRepository extends JpaRepository<Video, Long> {
    List<Video> findByCourseId(Long courseId);
}
