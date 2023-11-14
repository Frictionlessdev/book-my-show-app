package com.sb.learning.bookmyshow.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder(toBuilder = true)
public class EventDTO {
    private String id;
    private String name;
    private Rating rating;
    private String cover;
    private int day;
    private int month;
    private int year;
    private long startTime;
    private long endTime;
    private TheaterDTO theater;
    private List<ActorDTO> cast;
}
