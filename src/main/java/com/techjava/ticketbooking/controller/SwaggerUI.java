package com.techjava.ticketbooking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Swagger UI
 *
 * @author techragesh
 */
@Controller
public class SwaggerUI {

    /**
     * Redirecting swagger ui page
     *
     * @return
     */
    @GetMapping("/")
    public String index() {
        return "redirect:swagger-ui.html";
    }
}
