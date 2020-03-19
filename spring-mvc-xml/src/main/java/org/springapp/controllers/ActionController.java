package org.springapp.controllers;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ActionController extends MultiActionController {

    public ModelAndView studentForm(HttpServletRequest request, HttpServletResponse response)
    {
        return new ModelAndView("form");
    }

    public ModelAndView student(HttpServletRequest request,HttpServletResponse response)
    {
        return new ModelAndView("student");
    }

}
