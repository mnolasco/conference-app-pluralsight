package com.coremei.conference.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coremei.conference.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
