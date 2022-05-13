package com.dlithe.tourism.entity;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "about_us")
public class AboutUs {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "company_contact_no")
    private String mobileNo;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "company_email")
    private String companyEmail;

    @Column(name = "company_location")
    private String companyLocation;

    @Column(name = "company_description")
    private String companyDescription;

}
