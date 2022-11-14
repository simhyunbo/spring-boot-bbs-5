package com.mustache.bbs4.repository;

import com.mustache.bbs4.domain.Hospital;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class HospitalRepositoryTest {

    @Autowired
    HospitalRepository hospitalRepository;

    @Test
    @DisplayName("BusunessTypeName이 보건소 보건지소 보건진료소인 데이터")
    void findByBusinessTypeNameIn(){
        List<String> inClues = new ArrayList<>();
        inClues.add("보건소");
        inClues.add("보건지소");
        inClues.add("보건진료소");
        List<Hospital> hospitals = hospitalRepository.findByBusinessTypeNameIn(inClues);
        for (var hospital :
                hospitals) {
            System.out.println(hospital.getHospitalName());
        }
    }

}