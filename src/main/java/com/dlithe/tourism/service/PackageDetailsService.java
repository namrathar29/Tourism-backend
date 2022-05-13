package com.dlithe.tourism.service;

import com.dlithe.tourism.dto.BaseResponse;
import org.springframework.http.ResponseEntity;

public interface PackageDetailsService {

    ResponseEntity<BaseResponse> findPackageDetails(String packageId);
}
