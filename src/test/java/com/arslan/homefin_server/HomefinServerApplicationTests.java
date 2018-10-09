package com.arslan.homefin_server;

import com.arslan.homefin_server.entity.Person;
import com.arslan.homefin_server.repository.EventRepository;
import com.arslan.homefin_server.repository.PersonRepository;
import com.arslan.homefin_server.service.implementations.CategoryServiceImpl;
import com.arslan.homefin_server.service.implementations.EventServiceImpl;
import com.arslan.homefin_server.service.implementations.PersonServiceImpl;
import com.arslan.homefin_server.service.interfaces.CategoryService;
import com.arslan.homefin_server.service.interfaces.EventService;
import com.arslan.homefin_server.service.interfaces.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
@Import({PersonServiceImpl.class, EventServiceImpl.class, CategoryServiceImpl.class})
public class HomefinServerApplicationTests {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private PersonService personService;

    @Autowired
    private EventService eventService;

    @Autowired
    private CategoryService categoryService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void findAllCategoriesByUserId(){
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(categoryService.findAllByUserId(2l));
        System.out.println(categoryService.findAllByUserId(1l));
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//        System.out.println(categoryService.findOneByUserId(2l, 5l));
        categoryService.deleteOneByUserId(2l,4l);
        categoryService.deleteOneByUserId(2l,5l);
        categoryService.deleteOneByUserId(2l,6l);
        categoryService.deleteOneByUserId(2l,1l);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(categoryService.findAllByUserId(2l));
        System.out.println(categoryService.findAllByUserId(1l));
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//        System.out.println(categoryService.findOne(1l));
//        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}
