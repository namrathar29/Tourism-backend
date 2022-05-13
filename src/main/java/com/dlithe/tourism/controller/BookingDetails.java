package com.dlithe.tourism.controller;

import com.dlithe.tourism.dto.BaseResponse;
import com.dlithe.tourism.service.GetBookingDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingDetails {

    @Autowired GetBookingDetailsService getBookingDetailsService;

    @GetMapping("fetch-booking-details/{pnrNo}")
    public ResponseEntity<BaseResponse> findBookingDetails(@PathVariable int pnrNo){

        if(pnrNo==0 || String.valueOf(pnrNo)==null){
            BaseResponse baseResponse = new BaseResponse();
            baseResponse.setMessage("PNR no cannot be zero null");
            baseResponse.setHttpStatus(HttpStatus.BAD_REQUEST);
            baseResponse.setHttpStatusCode(HttpStatus.BAD_REQUEST.value());

            return new ResponseEntity<>(baseResponse, HttpStatus.BAD_REQUEST);
        }
        return getBookingDetailsService.findBookingDetails(pnrNo);
    }
}
