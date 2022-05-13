package com.dlithe.tourism.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "tvlr_dtl")
public class TvlrDtl {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name="tvlr_id")
    private int id;

    @Column (name="tvlr_name")
    private String travellerName;

    @Column (name="tvlr_email")
    private String travellerEmail;

    @Column (name="tvlr_mobile_no")
    private String travellerMobileNo;

    @Column (name="tvlr_age")
    private int travellerAge;

    @Column (name="tvlr_adult")
    private int travellerAdults;

    @Column (name="tvlr_child")
    private int travellerChildren;

    @Column (name="package_id")
    private String packageId;

    @Column (name="pnr_no")
    private int pnrNo;


}
