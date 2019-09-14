package com.zdravstvuyderevo.hackathon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 2019-09-14 : 08:06
 *
 * @author Nikita Savinov
 */

@Controller
public class IndexPage {

    @GetMapping({"", "/"})
    public String index() {
        return "IndexPage";
    }

}
