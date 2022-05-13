package com.dlithe.tourism.dto;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class AboutUsRequest {

    private String companyName;
    private String companyEmail;
    private String mobileNo;
    private String companyLocation;
    private String companyDescription;

}
