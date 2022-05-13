package com.dlithe.tourism.controller;


import com.dlithe.tourism.dto.BaseResponse;
import com.dlithe.tourism.dto.TravellerDetailsRequest;
import com.dlithe.tourism.service.TourismService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired TourismService tourismService;

    @PostMapping("register-traveller")
    public ResponseEntity<BaseResponse> registerNewTraveller(@RequestBody TravellerDetailsRequest travellerDetailsRequest) {
        if (travellerDetailsRequest == null) {
            BaseResponse baseResponse = new BaseResponse();
            baseResponse.setMessage("Credential can not be null");
            baseResponse.setHttpStatus(HttpStatus.BAD_REQUEST);
            baseResponse.setHttpStatusCode(HttpStatus.BAD_REQUEST.value());
            return new ResponseEntity<BaseResponse>(baseResponse, HttpStatus.BAD_GATEWAY);
        }
        return tourismService.registerNewTraveller(travellerDetailsRequest);
    }
}
