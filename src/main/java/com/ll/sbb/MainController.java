package com.ll.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/tooltool")
    @ResponseBody
    public String tolltoll(){
        return "tooltool";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/main";
    }
}
