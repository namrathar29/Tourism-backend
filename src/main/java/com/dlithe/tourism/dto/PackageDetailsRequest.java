package com.dlithe.tourism.dto;


import com.dlithe.tourism.entity.ToursAndPackages;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Optional;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class PackageDetailsRequest {

    private String packageId;
    private String packageName;
    private String packageCost;
    private String days;
    private String dayOne;
    private String dayTwo;
    private String dayThree;
    private String dayFour;
    private String dayFive;
    private String context;
}
