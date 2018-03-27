package com.example.demo;


import net.sf.json.JSONObject;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModelAttributeController {
    @ModelAttribute("/loginname")
    public String userModelfirst(@RequestParam("loginname") String loginname) {
        System.out.println("userModelfirst->" + loginname);
        return loginname;
    }

    //通过@ResquestParam赋值给变量，再通过model.addAttribute（）方法实现model属性名称和属性值。
    @ModelAttribute
    public String userModelSecond(@RequestParam("loginname") String loginname, Model model) {
        System.out.println("before->" + JSONObject.fromObject(model));
        System.out.println("userModelSecond->" + loginname);
        model.addAttribute("loginname", loginname);
        System.out.println("after->" + JSONObject.fromObject(model));
        return loginname;
    }

//    @RequestMapping和@ModelAttribute注释同一个方法时，此方法返回的不是一个视图名称，而是model的值,视图名称是"/loginthird",Model的属性名称value已经在注解中指定，所以，
//    可以理解为username（key）= admin（value）
    @RequestMapping(value = "/loginthird")
    @ModelAttribute(value = "username")
    public String loginthrid(@RequestParam("loginname") String loginname) {
        System.out.println("loginthrid->");
        return "admin";
    }

    @RequestMapping(value = "/loginfirst")
    public String loginfirst() {
        System.out.println("loginfirst->");
        return "loginfirst";
    }
}
