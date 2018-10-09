package com.arslan.homefin_server.service.implementations;

import com.arslan.homefin_server.entity.Bill;
import com.arslan.homefin_server.repository.BillRepository;
import com.arslan.homefin_server.service.interfaces.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillServiceImpl extends GenericServiceImpl<Bill, Long> implements BillService {

    private BillRepository repository;

    @Autowired
    public BillServiceImpl(BillRepository repository) {
        super(Bill.class, repository);
        this.repository = repository;
    }

    @Override
    public List<Bill> findAllByUserId(long id) {
        return repository.findAllByUserId(id);
    }

    @Override
    public Bill findOneByUserId(long userId, long id) {
        return repository.findByUserIdAndId(userId, id);
    }

    @Override
    public void deleteOneByUserId(long userId, long id) {
        repository.deleteByUserIdAndAndId( userId, id);
    }
}
