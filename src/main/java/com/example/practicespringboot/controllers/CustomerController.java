package com.example.practicespringboot.controllers;

import com.example.practicespringboot.Customer;
import com.example.practicespringboot.DataHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private DataHandler dataHandler;

    public CustomerController() {
    }

    // localhost:8080 /customers /customer/id

    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    @ResponseBody
    public List<Customer> getCustomers(){
        return dataHandler.getCustomerList();
    }

    @RequestMapping(value = "/customer/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Customer getCustomerById(@PathVariable ("id") int id){
        for(Customer c : dataHandler.getCustomerList()){
            if(c.getId() == id){
                return c;
            }
        }
        return null;
    }
}
