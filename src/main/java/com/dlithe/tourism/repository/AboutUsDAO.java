package com.dlithe.tourism.repository;

import com.dlithe.tourism.entity.AboutUs;
import com.dlithe.tourism.entity.TvlrDtl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AboutUsDAO extends JpaRepository<AboutUs, String> {
    @Query(value = "select * from about_us where company_contact_no = 7000050000 AND 123456882", nativeQuery = true)
    AboutUs aboutUsDetails();
}
