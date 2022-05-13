package com.dlithe.tourism.repository;

import com.dlithe.tourism.entity.TvlrDtl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TourismDAO extends JpaRepository<TvlrDtl, Integer> {
}
