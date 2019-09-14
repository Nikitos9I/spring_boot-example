package com.zdravstvuyderevo.hackathon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 2019-09-14 : 13:31
 *
 * @author Nikita Savinov
 */

@Controller
@RequestMapping("/card")
public class CardBusinessController {

    @PostMapping("/add")
    public void addNewCardBusiness(@RequestParam(value = "title") String title,
                                   @RequestParam(value = "template", required = false) String template) {
        if (template != null) {

        } else {

        }
    }

}
