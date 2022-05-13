package com.dlithe.tourism.dto;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class GetBookingDetailsRequest {


    private String travellerName;
    private String travellerMobileNo;
    private int travellerAdults;
    private int travellerChildren;
    //private String packageId;
    private String packageName;
    private int pnrNo;
}
