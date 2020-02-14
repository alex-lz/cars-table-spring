package com.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc.model.Car;
import com.mvc.model.CarRegistration;

@Controller
public class CarUpdateController {
	
    @RequestMapping(method = RequestMethod.PUT, value="/update/car")

    @ResponseBody
        public String updateCarRecord(@RequestBody Car carn) {
        System.out.println("In updateCarRecord");   
        return CarRegistration.getInstance().upDateCar(carn);
    }
}