package com.nagy.roomwebapp.service;


import com.nagy.roomwebapp.Models.Room;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.LongStream;

@Service
public class RoomService {


    private static final List<Room> rooms = new ArrayList<>();

    static {

        LongStream.range(0, 10).forEachOrdered(n -> {

            rooms.add(new Room(n, "Room " + n, "R " + n, "Empty"));
        });
    }

    public List<Room> getRooms() {return rooms;}
}
