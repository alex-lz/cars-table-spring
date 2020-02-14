package com.mvc.controllers;

// import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc.model.*;

@Controller
public class CarRegistrationController {
	
    @RequestMapping(method = RequestMethod.POST, value="/register/car")
  
    @ResponseBody
    public CarRegistrationReply registerCar(@RequestBody Car car) {
        System.out.println("In register Car");
        CarRegistrationReply carregreply = new CarRegistrationReply();           
        CarRegistration.getInstance().add(car);
        //We are setting the below value just to reply a message back to the caller
        carregreply.setBrand(car.getBrand());
        carregreply.setName(car.getName());
        carregreply.setModel(car.getModel());
        carregreply.setYear(car.getYear());
        carregreply.setPrice(car.getPrice());
        carregreply.setRegistrationNumber(car.getRegistrationNumber());
        carregreply.setRegistrationStatus("Successful");
        return carregreply;
  }
    
}
