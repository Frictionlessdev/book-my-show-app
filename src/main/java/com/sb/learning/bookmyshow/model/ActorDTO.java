package com.sb.learning.bookmyshow.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class ActorDTO {
    private String name;
    private String picture;
    private String about;
}
