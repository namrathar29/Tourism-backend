package com.dlithe.tourism.serviceimpl;

import com.dlithe.tourism.dto.BaseResponse;
import com.dlithe.tourism.dto.GetBookingDetailsRequest;
import com.dlithe.tourism.dto.PackageDetailsRequest;
import com.dlithe.tourism.entity.ToursAndPackages;
import com.dlithe.tourism.entity.TvlrDtl;
import com.dlithe.tourism.repository.GetBookingDetailsDAO;
import com.dlithe.tourism.repository.PackageDetailsDAO;
import com.dlithe.tourism.service.GetBookingDetailsService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
public class GetBookingDetailsImpl implements GetBookingDetailsService {

    @Autowired
    PackageDetailsDAO packageDetailsDAO;

    @Autowired
    GetBookingDetailsDAO getBookingDetailsDAO;

    @Override
    public ResponseEntity<BaseResponse> findBookingDetails(int pnrNo) {

        BaseResponse baseResponse = new BaseResponse();
        GetBookingDetailsRequest getBookingDetailsRequest = new GetBookingDetailsRequest();

        TvlrDtl tvlrDtlData = getBookingDetailsDAO.findTravellerDetailsByPnrNo(pnrNo);

        if (tvlrDtlData==null) {
            baseResponse.setMessage("Booking for the given PNR is not present");
            baseResponse.setHttpStatus(HttpStatus.NOT_FOUND);
            baseResponse.setHttpStatusCode(HttpStatus.NOT_FOUND.value());
            baseResponse.setResponse(getBookingDetailsRequest);

            return new ResponseEntity<BaseResponse>(baseResponse, HttpStatus.NOT_FOUND);

        }
//        TvlrDtl tvlrDtlData = tvlrDtl.get();

        getBookingDetailsRequest.setTravellerName(tvlrDtlData.getTravellerName());
        getBookingDetailsRequest.setTravellerMobileNo(tvlrDtlData.getTravellerMobileNo());
        getBookingDetailsRequest.setTravellerAdults(tvlrDtlData.getTravellerAdults());
        getBookingDetailsRequest.setTravellerChildren(tvlrDtlData.getTravellerChildren());
        //getBookingDetailsRequest.setPackageId(tvlrDtlData.getPackageId());
        String checkPck = tvlrDtlData.getPackageId();
        Optional<ToursAndPackages> toursAndPackages = packageDetailsDAO.findById(tvlrDtlData.getPackageId());
        ToursAndPackages  toursAndPackagesData = toursAndPackages.get();



        getBookingDetailsRequest.setPackageName(toursAndPackagesData.getPackageName());
        getBookingDetailsRequest.setPnrNo(tvlrDtlData.getPnrNo());


        baseResponse.setMessage("Fetch Booking Details successfully");
        baseResponse.setHttpStatus(HttpStatus.OK);
        baseResponse.setHttpStatusCode(HttpStatus.OK.value());
        baseResponse.setResponse(getBookingDetailsRequest);

        return new ResponseEntity<BaseResponse>(baseResponse, HttpStatus.OK);
    }

}
