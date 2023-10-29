package com.cydeo.cydeoApp.repository;

import com.cydeo.cydeoApp.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegionRepository extends JpaRepository<Region, Long> {

    List<Region> findByCountry(String country);

    List<Region> findDistinctByCountry(String country);

    List<Region> findRegionByCountryContainingIgnoreCase(String name);

    List<Region> findByCountryContainingIgnoreCaseOrderByCountry(String name);

    List<Region> findTop2ByCountry(String name);
}
