package cn.zhangly.springmvc.model;

import java.io.Serializable;

/**
 * Created by zhangly on 2017/5/19.
 */
public class Person implements Serializable {

    private Long id;
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
