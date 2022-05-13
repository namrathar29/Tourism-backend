package com.dlithe.tourism.serviceimpl;

import com.dlithe.tourism.dto.BaseResponse;
import com.dlithe.tourism.dto.GetBookingDetailsRequest;
import com.dlithe.tourism.dto.PackageDetailsRequest;
import com.dlithe.tourism.entity.ToursAndPackages;
import com.dlithe.tourism.entity.TvlrDtl;
import com.dlithe.tourism.repository.PackageDetailsDAO;
import com.dlithe.tourism.service.PackageDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PackageDetailsImpl implements PackageDetailsService {

    @Autowired PackageDetailsDAO packageDetailsDAO;
    @Override
    public ResponseEntity<BaseResponse> findPackageDetails(String packageId) {

        BaseResponse baseResponse = new BaseResponse();
        PackageDetailsRequest packageDetailsRequest = new PackageDetailsRequest();

        Optional<ToursAndPackages> toursAndPackages = packageDetailsDAO.findById(packageId);

        if (!toursAndPackages.isPresent()) {
            baseResponse.setMessage("No package details is present for given package Id");
            baseResponse.setHttpStatus(HttpStatus.NOT_FOUND);
            baseResponse.setHttpStatusCode(HttpStatus.NOT_FOUND.value());
            baseResponse.setResponse(packageDetailsRequest);

            return new ResponseEntity<>(baseResponse, HttpStatus.NOT_FOUND);

        }

        ToursAndPackages  toursAndPackagesData = toursAndPackages.get();

        packageDetailsRequest.setPackageId(toursAndPackagesData.getPackageId());
        packageDetailsRequest.setPackageName(toursAndPackagesData.getPackageName());
        packageDetailsRequest.setPackageCost(toursAndPackagesData.getPackageCost());
        packageDetailsRequest.setDays(toursAndPackagesData.getDays());
        packageDetailsRequest.setDayOne(toursAndPackagesData.getDayOne());
        packageDetailsRequest.setDayTwo(toursAndPackagesData.getDayTwo());
        packageDetailsRequest.setDayThree(toursAndPackagesData.getDayThree());
        packageDetailsRequest.setDayFour(toursAndPackagesData.getDayFour());
        packageDetailsRequest.setDayFive(toursAndPackagesData.getDayFive());
        packageDetailsRequest.setContext(toursAndPackagesData.getContext());

        baseResponse.setMessage("Fetch Package Details successfully");
        baseResponse.setHttpStatus(HttpStatus.OK);
        baseResponse.setHttpStatusCode(HttpStatus.OK.value());
        baseResponse.setResponse(packageDetailsRequest);

        return new ResponseEntity<>(baseResponse, HttpStatus.OK);

    }

}
