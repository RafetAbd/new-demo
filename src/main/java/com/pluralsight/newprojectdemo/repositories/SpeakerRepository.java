package com.pluralsight.newprojectdemo.repositories;

import com.pluralsight.newprojectdemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {



}
