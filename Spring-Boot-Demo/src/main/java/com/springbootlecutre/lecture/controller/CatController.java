package com.springbootlecutre.lecture.controller;

import com.springbootlecutre.lecture.models.CatModel;
import com.springbootlecutre.lecture.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/cat")
public class CatController {

    @Autowired
    private CatService catService;


    //@RequestMapping(path = "", method = RequestMethod.GET)
    @GetMapping("/cat")
    public String getCatHomePage() {
        return "cat.html";
    }

//    @PostMapping("")
//    public String buyCat(@RequestParam String name, @RequestParam int age) {
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//
//        return "redirect:/dog";
//    }

    @PostMapping("")
    public String buyCat(@ModelAttribute CatModel cat) {
        System.out.println("Name: " + cat.getName());
        System.out.println("Age: " + cat.getAge());
        this.catService.buy(cat);
        return "redirect:/dog";
    }

    @GetMapping("/cat/edit/{catId}")
    @ResponseBody
    public String getEdit(@PathVariable long catId) {
        return String.valueOf(catId);
    }

    @GetMapping("/mycat")
    public ModelAndView getCat(ModelAndView modelAndView, Model model) {
        String cat = "cat";
        model.addAttribute("cat", cat);
        modelAndView.addObject("cat", cat);
        modelAndView.setViewName("cat.html");
        return modelAndView;
    }
}
