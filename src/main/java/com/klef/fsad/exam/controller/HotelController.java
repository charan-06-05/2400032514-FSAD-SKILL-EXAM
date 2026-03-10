package com.klef.fsad.exam.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.fsad.exam.model.Hotel;
import com.klef.fsad.exam.service.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private HotelService service;

    // POST - Add Hotel
    @PostMapping("/add")
    public Hotel addHotel(@RequestBody Hotel h) {
        return service.addHotel(h);
    }

    // PUT - Update Hotel
    @PutMapping("/update")
    public Hotel updateHotel(@RequestBody Hotel h) {
        return service.updateHotel(h);
    }
}