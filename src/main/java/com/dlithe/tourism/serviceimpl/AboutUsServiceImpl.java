package com.dlithe.tourism.serviceimpl;

import com.dlithe.tourism.dto.AboutUsRequest;
import com.dlithe.tourism.entity.AboutUs;
import com.dlithe.tourism.repository.AboutUsDAO;
import com.dlithe.tourism.service.AboutUsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AboutUsServiceImpl implements AboutUsService {

    @Autowired
    AboutUsDAO aboutUsDAO;

    @Override
    public AboutUsRequest getAboutDetails() {

        AboutUs aboutUsData = aboutUsDAO.aboutUsDetails();


        AboutUsRequest aboutUsRequest = new AboutUsRequest();
        aboutUsRequest.setCompanyName(aboutUsData.getCompanyName());
        aboutUsRequest.setCompanyEmail(aboutUsData.getCompanyEmail());
        aboutUsRequest.setMobileNo(aboutUsData.getMobileNo());
        aboutUsRequest.setCompanyLocation(aboutUsData.getCompanyLocation());
        aboutUsRequest.setCompanyDescription(aboutUsData.getCompanyDescription());
        return aboutUsRequest;
    }
}
