package com.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;

import com.mvc.model.CarRegistration;

@Controller
public class CarDeleteController {
	
    @RequestMapping(method = RequestMethod.DELETE, value="/delete/car/{regdNum}")
    @ResponseBody
    public String deleteCarRecord(@PathVariable("regdNum") String regdNum) {
        System.out.println("In delete Car Record");   
        return CarRegistration.getInstance().deleteCar(regdNum);
    }
}
