package com.sb.learning.bookmyshow.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class LocationDTO {
    private City city;
    private String location;
}
