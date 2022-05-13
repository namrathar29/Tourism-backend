package com.dlithe.tourism.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "tours_and_packages")
public class ToursAndPackages {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "package_id")
    private String packageId;

    @Column(name = "package_name")
    private String packageName;

    @Column(name = "package_cost")
    private String packageCost;

    @Column(name = "days")
    private String days;

    @Column(name = "day_one")
    private String dayOne;

    @Column(name = "day_two")
    private String dayTwo;

    @Column(name = "day_three")
    private String dayThree;

    @Column(name = "day_four")
    private String dayFour;

    @Column(name = "day_five")
    private String dayFive;

    @Column(name = "context")
    private String context;
}
