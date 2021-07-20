package com.coremei.conference.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coremei.conference.models.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {

}
