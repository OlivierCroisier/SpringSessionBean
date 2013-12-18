package net.thecodersbreakfast.sessionbean.presentation;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    @Autowired
    private SessionBean sessionBean;

    @RequestMapping(value="/")
    public String myController() {
        sessionBean.setMessage("Time : " + now());
        return "myView";
    }

    private String now() {
        return new SimpleDateFormat("HH:mm:ss").format(new Date());
    }
}
