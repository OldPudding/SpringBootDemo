package com.lishch.SpringBootWeb;

import java.util.List;
import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lishch.model.Person;

@SpringBootApplication
@Controller
public class App {

	@RequestMapping("/index2")
	public String sayHello(Model model){
		return "index2";
	}

	@RequestMapping("/index1")
	public String sayHello2(Model model){
		return "index1";
	}
	
    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}