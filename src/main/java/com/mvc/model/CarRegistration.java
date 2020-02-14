package com.mvc.model;

import java.util.ArrayList;
import java.util.List;

public class CarRegistration {
	
    private List<Car> carRecords;
    private static CarRegistration carregd = null;
    private CarRegistration() {
        carRecords = new ArrayList<Car>();
    }
    
    public static CarRegistration getInstance() {
        if(carregd == null) {
            carregd = new CarRegistration();
            return carregd;
        } else {
            return carregd;
        }
    }
    
    public void add(Car car) {
        carRecords.add(car);
    }
    
    public String upDateCar(Car car) {
        for(int i=0; i<carRecords.size(); i++) {
            Car carn = carRecords.get(i);
            if(carn.getRegistrationNumber().equals(car.getRegistrationNumber())) {
                carRecords.set(i, car);//update the new record
                return "Update successful";
            }
        }
        return "Update un-successful";
    }
    
    public String deleteCar(String registrationNumber) {
        for(int i=0; i<carRecords.size(); i++) {
            Car carn = carRecords.get(i);
            if(carn.getRegistrationNumber().equals(registrationNumber)){
                carRecords.remove(i);//update the new record
                return "Delete successful";
            }
        }
        return "Delete un-successful";
    }
    
    public List<Car> getCarRecords() {
        return carRecords;
    }
    
}
