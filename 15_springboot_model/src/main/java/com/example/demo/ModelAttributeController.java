package com.example.demo;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@RestController
public class ModelAttributeController {
    @RequestMapping("test/{date}")
    public void test(@PathVariable Date date, HttpServletResponse response) throws IOException {
        response.getWriter().write(date);
    }

}
