package com.onlinelearningplatform.Online.Learning.Platform.Repository;

import com.onlinelearningplatform.Online.Learning.Platform.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
