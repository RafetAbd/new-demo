package com.pluralsight.newprojectdemo.repositories;

import com.pluralsight.newprojectdemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {



}
