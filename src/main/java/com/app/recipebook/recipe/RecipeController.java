package com.app.recipebook.recipe;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {

    @RequestMapping("/hello")
    public String sayHello(){

        return "sup";
    }

}
