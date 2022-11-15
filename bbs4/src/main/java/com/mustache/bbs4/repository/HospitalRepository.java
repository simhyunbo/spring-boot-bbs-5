package com.mustache.bbs4.repository;

import com.mustache.bbs4.domain.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HospitalRepository extends JpaRepository<Hospital, Integer> {
    /*
   경기도 수원시 피부과 쿼리문
   SELECT * FROM nation_wide_hospitals
       WHERE road_name_address LIKE '경기도 수원시%'
           AND hospital_name LIKE '%피부%';
    */
    List<Hospital> findByRoadNameAddressContainingAndHospitalNameContaining(String address, String name);

    /*
    비즈니스 타입이 보건소, 보건지소, 보건진료소인 경우
    SELECT * FROM nation_wide_hospitals
        WHERE business_type_name IN ('보건소', '보건지소', '보건진료소')
     */
    List<Hospital> findByBusinessTypeNameIn(List<String> businessTypes);

    // 병상 수가 10개 이상 20개 미만인 병원을 모두 찾기
    List<Hospital> findByTotalNumberOfBedsBetweenOrderByTotalNumberOfBedsDesc(Integer start, Integer end);


}
