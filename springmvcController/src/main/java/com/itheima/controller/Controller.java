package com.itheima.controller;

import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Auther：GaoHang
 * @Date: 2021/3/22 - 03 - 22 - 9:35
 * @Description com.itheima.controller
 * @version: 1.0
 */
public class Controller implements org.springframework.web.servlet.mvc.Controller {
    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","hellointer");
        mv.setViewName("test");

        return mv;
    }
}
