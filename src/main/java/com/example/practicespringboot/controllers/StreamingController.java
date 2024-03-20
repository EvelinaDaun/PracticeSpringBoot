package com.example.practicespringboot.controllers;

import com.example.practicespringboot.DataHandler;
import com.example.practicespringboot.StreamingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StreamingController {
    @Autowired
    private DataHandler dataHandler;

    public StreamingController() {
    }

    // localhost:8080 /streams /strems/id

    @RequestMapping(value = "/streams", method = RequestMethod.GET)
    @ResponseBody
    public List<StreamingService> getStreams(){
        return dataHandler.getStreamingServiceList();
    }

    @RequestMapping(value = "/streams/{id}", method = RequestMethod.GET)
    @ResponseBody
    public StreamingService getStreamById(@PathVariable ("id") int id){
        for(StreamingService s : dataHandler.getStreamingServiceList()){
            if(s.getId() == id){
                return s;
            }
        }
        return null;
    }
}
