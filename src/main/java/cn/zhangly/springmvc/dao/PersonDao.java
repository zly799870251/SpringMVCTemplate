package cn.zhangly.springmvc.dao;

import cn.zhangly.springmvc.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangly on 2017/5/19.
 */
@Repository
public class PersonDao {

    public List<Person> findAllPerson() {
        List<Person> people = new ArrayList<Person>();

        Person p1 = new Person();
        p1.setId(1L);
        p1.setName("Zhang San");
        people.add(p1);

        Person p2 = new Person();
        p2.setId(2L);
        p2.setName("Li Si");
        people.add(p2);

        return people;
    }

}
