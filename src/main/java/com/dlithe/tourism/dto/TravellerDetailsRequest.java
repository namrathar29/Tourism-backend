package com.dlithe.tourism.dto;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class TravellerDetailsRequest {

    private int pnrNo;
    private String travellerName;
    private String travellerEmail;
    private String travellerMobileNo;
    private int travellerAge;
    private int travellerAdults;
    private int travellerChildren;
    private String packageId;


}
