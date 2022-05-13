package com.dlithe.tourism.repository;

import com.dlithe.tourism.entity.TvlrDtl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface GetBookingDetailsDAO extends JpaRepository<TvlrDtl, Integer> {

    @Query(value = "select * from tvlr_dtl where pnr_no = ?1", nativeQuery = true)
    TvlrDtl findTravellerDetailsByPnrNo(int pnrNo);


}
