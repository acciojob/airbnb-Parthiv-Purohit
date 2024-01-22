package com.driver.service;
import com.driver.model.Booking;
import com.driver.model.Facility;
import com.driver.model.Hotel;
import com.driver.model.User;
import com.driver.repositories.hotelrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class hotelservice {

    //@Autowired
    hotelrepository hotelrepository = new hotelrepository() ;

    public String addHotel(Hotel hotel) {
        return hotelrepository.addHotel(hotel);
    }

    public Integer addUser(User user) {
        return hotelrepository.addUser(user);
    }

    public String getHotelWithMostFacilities() {
        return hotelrepository.getHotelWithMostFacilities();
    }

    public int bookRoom(Booking booking) {
        return hotelrepository.bookRoom(booking);
    }

    public int getBookings(Integer aadharCard) {
        return hotelrepository.getBookings(aadharCard);
    }

    public Hotel updateFacilities(List<Facility> newFacilities, String hotelName) {
        return hotelrepository.updateFacilities(newFacilities, hotelName);
    }

}
