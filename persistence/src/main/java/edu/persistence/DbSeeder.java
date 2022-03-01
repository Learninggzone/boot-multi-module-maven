package edu.persistence;

import edu.domain.Hotel;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner {
    private HotelRepository hotelRepository;

    public DbSeeder(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Hotel marriot = new Hotel("Marriot", 5, true);
        Hotel ibis = new Hotel("Ibis", 3, false);
        Hotel goldenPalace = new Hotel("Golden Palace", 4, true);

        List<Hotel> hotelList= new ArrayList<>();
        hotelList.add(marriot);
        hotelList.add(ibis);
        hotelList.add(goldenPalace);

        this.hotelRepository.saveAll(hotelList);


    }
}
