package com.cydeo.cydeoApp.repository;

import com.cydeo.cydeoApp.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region, Long> {

    List<Region> findByCountry(String country);

    List<Region> findDistinctByCountry(String country);

    List<Region> findRegionByCountryContainingIgnoreCase(String name);

    List<Region> findByCountryContainingIgnoreCaseOrderByCountry(String name);

    List<Region> findTop2ByCountry(String name);
}
