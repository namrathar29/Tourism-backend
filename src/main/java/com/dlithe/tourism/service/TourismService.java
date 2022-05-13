package com.dlithe.tourism.service;

import com.dlithe.tourism.dto.BaseResponse;
import com.dlithe.tourism.dto.TravellerDetailsRequest;
import org.springframework.http.ResponseEntity;

public interface TourismService {

    ResponseEntity<BaseResponse> registerNewTraveller(TravellerDetailsRequest travellerDetailsRequest);

}
