package cn.zhangly.springmvc.controller;

import cn.zhangly.springmvc.dao.PersonDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhangly on 2017/5/19.
 */
@Controller
@RequestMapping("/person")
public class PersonController {

        @Resource
        private PersonDao personDao;

        @RequestMapping(value = "/findPerson", method = RequestMethod.GET)
        public String findPerson(HttpServletRequest request) {
            System.out.println("do findPerson!");
            request.setAttribute("people", personDao.findAllPerson());
            return "person";
        }

}
