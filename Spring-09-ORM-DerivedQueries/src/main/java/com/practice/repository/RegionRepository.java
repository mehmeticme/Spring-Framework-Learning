package com.practice.repository;

import com.practice.entity.Regions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Regions,Long> {

    // Display all regions in Canada
    List<Regions> findByCountry(String country);

    // Display all regions in Canada without duplicates

    List<Regions> findDistinctByCountry(String country);

    // Display all regions with Country name includes 'United'

    List<Regions> findByCountryContaining(String includes);


    //Display all regions with country name includes 'United' in Order

    List<Regions> findByCountryContainingOrderByCountry(String contains);


    // Display top 2 regions in Canada
    List<Regions> findTop2ByCountry(String country);


}
