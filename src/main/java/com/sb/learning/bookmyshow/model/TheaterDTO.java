package com.sb.learning.bookmyshow.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class TheaterDTO {
    private String name;
    private String crn;
    private String address;
    private LocationDTO location;
    private int auditorium;
}
