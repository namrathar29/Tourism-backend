package com.dlithe.tourism.service;

import com.dlithe.tourism.dto.BaseResponse;
import org.springframework.http.ResponseEntity;


public interface GetBookingDetailsService {

    ResponseEntity<BaseResponse> findBookingDetails(int pnrNo);
}
