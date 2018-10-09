package com.arslan.homefin_server.repository;

import com.arslan.homefin_server.entity.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepository extends JpaRepository<EventEntity, Long> {
    List<EventEntity> findAllByUserId(long userId);
    EventEntity findByUserIdAndId(long userId, long id);
    void deleteByUserIdAndAndId(long userId, long id);
}
