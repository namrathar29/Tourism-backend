package com.dlithe.tourism.serviceimpl;

import com.dlithe.tourism.dto.BaseResponse;
import com.dlithe.tourism.dto.TravellerDetailsRequest;
import com.dlithe.tourism.entity.TvlrDtl;
import com.dlithe.tourism.repository.TourismDAO;
import com.dlithe.tourism.service.TourismService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Random;


@Service
public class TourismServiceImpl implements TourismService {



    @Autowired
    TourismDAO tourismDAO;

    @Override
    public ResponseEntity<BaseResponse> registerNewTraveller(TravellerDetailsRequest travellerDetailsRequest) {

        TvlrDtl tvlrDtl = new TvlrDtl();
        int pnrNo = generatedPNR();
        BaseResponse baseResponse = new BaseResponse();

        tvlrDtl.setTravellerName(travellerDetailsRequest.getTravellerName());
        tvlrDtl.setTravellerEmail(travellerDetailsRequest.getTravellerEmail());
        tvlrDtl.setTravellerAge(travellerDetailsRequest.getTravellerAge());
        tvlrDtl.setTravellerMobileNo(travellerDetailsRequest.getTravellerMobileNo());
        tvlrDtl.setTravellerAdults(travellerDetailsRequest.getTravellerAdults());
        tvlrDtl.setTravellerChildren(travellerDetailsRequest.getTravellerChildren());
        tvlrDtl.setPackageId(travellerDetailsRequest.getPackageId());
        tvlrDtl.setPnrNo(pnrNo);

        tourismDAO.save(tvlrDtl);

        baseResponse.setMessage("Your Booking Confirmed and your Booking Id: " + pnrNo);
        baseResponse.setHttpStatus(HttpStatus.OK);
        baseResponse.setHttpStatusCode(HttpStatus.OK.value());

        return new ResponseEntity<BaseResponse>(baseResponse, HttpStatus.OK);

    }
    private int generatedPNR() {
        Random random = new Random();
        return (random.nextInt(999999));
    }
}
