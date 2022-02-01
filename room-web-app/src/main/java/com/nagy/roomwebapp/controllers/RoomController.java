package com.nagy.roomwebapp.controllers;


import com.nagy.roomwebapp.Models.Room;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.font.NumericShaper;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

@Controller
@RequestMapping("/rooms")
public class RoomController {

    private static final List<Room> rooms = new ArrayList<>();

    static {

        LongStream.range(0, 10).forEachOrdered(n -> {

            rooms.add(new Room(n,"Room "+n , "R " + n ,"Empty"));
        });
    }


    @GetMapping
    public  String getAllRooms(Model model){

        model.addAttribute("rooms" ,rooms);
        return "rooms";
    }
}
