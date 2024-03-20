package com.example.practicespringboot;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHandler {
    private List<StreamingService> streamingServiceList = new ArrayList<>();
    private List<Customer> customerList = new ArrayList<>();

    public DataHandler() {
        System.out.println("Datahandler starting to create streamingservices");
        streamingServiceList.add(new StreamingService(1, "Netflix", "Good", 300));
        streamingServiceList.add(new StreamingService(2, "HBO", "ExtraGood", 450));
        streamingServiceList.add(new StreamingService(2, "Pluto", "Bad", 0));

        System.out.println("Datahandler starting to create customers");
        customerList.add(new Customer(1, "Hanna", "Liv", "Hanna@mail.com", streamingServiceList.get(0)));
        customerList.add(new Customer(2, "Stu", "Knas", "Stu@mail.com", streamingServiceList.get(1)));
        customerList.add(new Customer(2, "Stive", "Sand", "Sand@mail.com", streamingServiceList.get(1)));
        customerList.add(new Customer(2, "Yelly", "Sand", "yelly@mail.com", streamingServiceList.get(2)));
        customerList.add(new Customer(2, "Nils", "Nilsson", "nils@mail.com", streamingServiceList.get(2)));
        System.out.println("Datahandler created");
    }

    public List<StreamingService> getStreamingServiceList() {
        return streamingServiceList;
    }

    public void setStreamingServiceList(List<StreamingService> streamingServiceList) {
        this.streamingServiceList = streamingServiceList;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
}
