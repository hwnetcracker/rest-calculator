package com.netcracker.calculator;


import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/rest/calc")
public class CalculationRestService {
    @GetMapping(value = "/add/{a}/{b}",produces = "application/json")
    public String addJSON(@PathVariable Integer a, @PathVariable Integer b){
        return "{result:"+(a+b)+"}";
    }
    @GetMapping(value = "/add/{a}/{b}",produces = "text/html")
    public String addHTML(@PathVariable Integer a, @PathVariable Integer b){
        return "<H1>"+(a+b)+"</H1>";
    }
    @GetMapping(value = "/add/{a}/{b}",produces = "text/plain")
    public String addTEXT(@PathVariable Integer a, @PathVariable Integer b){
        return "<H1>"+(a+b)+"</H1>";
    }

    @GetMapping(value = "/sub/{a}/{b}",produces = "application/json")
    public String subJSON(@PathVariable Integer a, @PathVariable Integer b){
        return "{result:"+(a-b)+"}";
    }
    @GetMapping(value = "/sub/{a}/{b}",produces = "text/html")
    public String subHTML(@PathVariable Integer a, @PathVariable Integer b){
        return "<H1>"+(a-b)+"</H1>";
    }
    @GetMapping(value = "/sub/{a}/{b}",produces = "text/plain")
    public String subTEXT(@PathVariable Integer a, @PathVariable Integer b){
        return "<H1>"+(a-b)+"</H1>";
    }

    @GetMapping(value = "/mul/{a}/{b}",produces = "application/json")
    public String mulJSON(@PathVariable Integer a, @PathVariable Integer b){
        return "{result:"+(a*b)+"}";
    }
    @GetMapping(value = "/mul/{a}/{b}",produces = "text/html")
    public String mulHTML(@PathVariable Integer a, @PathVariable Integer b){
        return "<H1>"+(a*b)+"</H1>";
    }
    @GetMapping(value = "/mul/{a}/{b}",produces = "text/plain")
    public String mulTEXT(@PathVariable Integer a, @PathVariable Integer b){
        return "<H1>"+(a*b)+"</H1>";
    }

    @GetMapping(value = "/div/{a}/{b}",produces = "application/json")
    public String divJSON(@PathVariable Integer a, @PathVariable Integer b){
        return "{result:"+(a/b)+"}";
    }
    @GetMapping(value = "/div/{a}/{b}",produces = "text/html")
    public String divHTML(@PathVariable Integer a, @PathVariable Integer b){
        return "<H1>"+(a/b)+"</H1>";
    }
    @GetMapping(value = "/div/{a}/{b}",produces = "text/plain")
    public String divTEXT(@PathVariable Integer a, @PathVariable Integer b){
        return "<H1>"+(a/b)+"</H1>";
    }

}
