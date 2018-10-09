package com.arslan.homefin_server.service.interfaces;

import com.arslan.homefin_server.entity.Bill;

import java.util.List;

public interface BillService extends GenericService<Bill, Long>{
    List<Bill> findAllByUserId(long id);
    Bill findOneByUserId(long userId, long id);
    void deleteOneByUserId(long userId, long id);
}
