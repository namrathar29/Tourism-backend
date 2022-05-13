package com.dlithe.tourism.controller;


import com.dlithe.tourism.dto.BaseResponse;
import com.dlithe.tourism.service.PackageDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PackageDetailsController {

    @Autowired PackageDetailsService packageDetailsService;

    @GetMapping("fetch-package-details/{packageId}")
    public ResponseEntity<BaseResponse> findPackageDetails(@PathVariable String packageId){

        if(packageId.equals(0) || String.valueOf(packageId)==null){
            BaseResponse baseResponse = new BaseResponse();
            baseResponse.setMessage("PNR no cannot be zero null");
            baseResponse.setHttpStatus(HttpStatus.BAD_REQUEST);
            baseResponse.setHttpStatusCode(HttpStatus.BAD_REQUEST.value());

            return new ResponseEntity<>(baseResponse, HttpStatus.BAD_REQUEST);
        }
        return packageDetailsService.findPackageDetails(packageId);
    }
}
