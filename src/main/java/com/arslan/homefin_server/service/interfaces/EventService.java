package com.arslan.homefin_server.service.interfaces;

import com.arslan.homefin_server.entity.EventEntity;

import java.util.List;

public interface EventService extends GenericService<EventEntity, Long>{
    List<EventEntity> findAllByUserId(long id);
    EventEntity findOneByUserId(long userId, long id);
    void deleteOneByUserId(long userId, long id);
}
