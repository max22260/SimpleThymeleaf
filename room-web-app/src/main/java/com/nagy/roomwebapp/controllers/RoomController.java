package com.nagy.roomwebapp.controllers;


import com.nagy.roomwebapp.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/rooms")
public class RoomController {

   private RoomService roomService ;

   @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public  String getAllRooms(Model model){

        model.addAttribute("rooms" ,roomService.getRooms());
        return "rooms";
    }
}
