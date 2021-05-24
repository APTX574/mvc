package com.myjava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Controller 创建处理器对象, 对象放在的SpringMVC的容器中
 * 使用位置是在类的上面
 * 和之前将的Service, Component一样都是用来创建对象只是对象的作用不同
 * @author aptx
 */
@Controller
@RequestMapping("/user")
public class Some {
    /**
     * \
     * 用来处理some.do的请求,返回值参数很多,名称自定义
     * RequestMapping请求映射注解,将请求和方法绑定,一个请求处理一个方法
     * 属性:
     * 1.value,是一个String表示请求的uri地址,属性唯一
     *
     * @return model是给用户的数据, view是给用户的视图 jsp等
     */
    @RequestMapping(value = {"/some.do"}, method = RequestMethod.POST)
    public ModelAndView doSome(String name, String age) {
        //创建返回对象

        ModelAndView mv = new ModelAndView();
        //添加数据,在请求的最后框架会讲数据放在request的域中
        mv.addObject("msg", "欢迎使用SpringMVC处理请求");
        mv.addObject("age", age);
        mv.addObject("name", name);
        //显示页面实际就是请求转发
        mv.setViewName("show");
        return mv;
    }
}
