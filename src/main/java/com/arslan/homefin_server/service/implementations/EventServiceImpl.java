package com.arslan.homefin_server.service.implementations;

import com.arslan.homefin_server.entity.EventEntity;
import com.arslan.homefin_server.repository.EventRepository;
import com.arslan.homefin_server.service.interfaces.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class EventServiceImpl extends GenericServiceImpl<EventEntity, Long> implements EventService {

    private EventRepository repository;

    @Autowired
    public EventServiceImpl(EventRepository repository) {
        super(EventEntity.class, repository);
        this.repository = repository;
    }

    @Override
    public List<EventEntity> findAllByUserId(long id) {
        return repository.findAllByUserId(id);
    }

    @Override
    public EventEntity findOneByUserId(long userId, long id) {
        return repository.findByUserIdAndId(userId, id);
    }

    @Override
    public void deleteOneByUserId(long userId, long id) {
        repository.deleteByUserIdAndAndId( userId, id);
    }
}


