package edu.web;

import edu.domain.Hotel;
import edu.persistence.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HotelController {
    private HotelRepository hotelRepository;

    @Autowired
    public HotelController(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @GetMapping("/hello")
    public String getHello(){
        return "hello world";
    }

    @GetMapping("/numbers")
    public Map<Integer,String> getNumbers(){
        Map<Integer,String> map = new HashMap<>();
        for (int i = 0; i < 10; i++){
            map.put(i,"String value");
        }
        return map;
    }

    @GetMapping("/hotels")
    public List<Hotel> getHotels(){
        List<Hotel> hotelList = this.hotelRepository.findAll();
        return hotelList;
    }
}
