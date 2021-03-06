package com.arslan.homefin_server.service.implementations;

import com.arslan.homefin_server.service.interfaces.GenericService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;


public class GenericServiceImpl<T, ID extends Serializable> implements GenericService<T, ID> {

    protected JpaRepository<T, ID> genericRepo;
    protected final Class classInfo;

    protected GenericServiceImpl(Class<T> classInfo, JpaRepository<T, ID> repo) {
        this.classInfo = classInfo;
        this.genericRepo = repo;
    }

    @Override
    public long count() {
        return genericRepo.count();
    }

    @Override
    public List<T> findAll() {
        return genericRepo.findAll();
    }

    @Override
    public Page<T> findAll(Pageable var) {
        return genericRepo.findAll(var);
    }

    @Override
    public T findOne(ID id) {
        return genericRepo.getOne(id);
    }

    @Override
    public T save(T t) {
        return genericRepo.save(t);
    }

    @Override
    public void deleteByID(ID id) {
        genericRepo.deleteById(id);
    }

    @Override
    public void delete(T t) {
        genericRepo.delete(t);
    }

    @Override
    public boolean exists(ID var1) {
        return genericRepo.existsById(var1);
    }
}
