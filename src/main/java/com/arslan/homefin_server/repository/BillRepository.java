package com.arslan.homefin_server.repository;

import com.arslan.homefin_server.entity.Bill;
import com.arslan.homefin_server.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, Long> {

}
