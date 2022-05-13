package com.dlithe.tourism.repository;

import com.dlithe.tourism.entity.ToursAndPackages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackageDetailsDAO extends JpaRepository<ToursAndPackages,String> {

}
