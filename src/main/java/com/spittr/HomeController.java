package com.spittr;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomeController
{
    Logger log = Logger.getLogger(HomeController.class);

    @RequestMapping(method = RequestMethod.GET)
    public String home(ModelMap model)
    {
        log.debug("Example");
        return "home";
    }
}
