package com.arslan.homefin_server.service.interfaces;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public interface GenericService<T,ID extends Serializable>  {
    long count();
    List<T> findAll();
    Page<T> findAll(Pageable var);
    T findOne(ID id);
    T save(T t);
    void deleteByID(ID id);
    void delete(T t);
    boolean exists(ID var1);
}
