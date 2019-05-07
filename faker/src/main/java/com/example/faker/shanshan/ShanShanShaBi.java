package com.example.faker.shanshan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ShanShanShaBi {

    @GetMapping("/a")
    public String shanshansolo(){
//        return "闪闪和"+name+"solo"+",闪爷"+state;
        System.out.println("sssb");
        return "sssb";
    }
}
