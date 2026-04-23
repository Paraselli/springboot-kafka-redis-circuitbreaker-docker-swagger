package com.example.demo.repository;

import com.example.demo.entity.User;   // or model.User if you kept model
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository   // ✅ Optional but recommended
public interface UserRepository extends JpaRepository<User, Long> {
}
