package com.cydeo.cydeoApp.bootstrap;

import com.cydeo.cydeoApp.entity.Region;
import com.cydeo.cydeoApp.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataGenerator implements CommandLineRunner {

    private final RegionRepository regionRepository;

    public DataGenerator(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        List<Region> canada = regionRepository.findByCountry("Canada");
        System.out.println(canada);

        List<Region> canadaDistinct = regionRepository.findDistinctByCountry("Canada");
        System.out.println(canadaDistinct);

        List<Region> united = regionRepository.findRegionByCountryContainingIgnoreCase("united");
        System.out.println(united);

    }
}
