package com.lefer.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by fang on 17-7-1.
 */
@RestController
public class WebController {
    @RequestMapping(path = {"/","/index"})
    public ModelAndView index(){
        return new ModelAndView("board_list");
    }

    @RequestMapping(path = "/loginPage")
    public ModelAndView loginPage(){
        return new ModelAndView("login");
    }

    @RequestMapping(path = "/topic_editor")
    public ModelAndView topicEdit(){
        return new ModelAndView("topic_editor");
    }
}
