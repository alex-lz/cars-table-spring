package com.mvc.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc.model.Car;
import com.mvc.model.CarRegistration;

@Controller
public class CarRetrieveController {
	
  @RequestMapping(method = RequestMethod.GET, value="/car/allcars")
  
  @ResponseBody
  public List<Car> getAllCars() {
      return CarRegistration.getInstance().getCarRecords();
  }
  
}
