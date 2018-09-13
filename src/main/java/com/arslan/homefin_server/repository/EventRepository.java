package com.arslan.homefin_server.repository;

import com.arslan.homefin_server.entity.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<EventEntity, Long> {
    EventEntity findById(long id);
}
