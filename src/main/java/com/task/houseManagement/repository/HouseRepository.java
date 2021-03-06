package com.task.houseManagement.repository;

import com.task.houseManagement.entity.House;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HouseRepository extends JpaRepository<House, Long> {

    Optional<House> findByPrice(String price);

}
