package com.practice.repository;

import com.practice.entity.Regions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Regions,Long> {


}
