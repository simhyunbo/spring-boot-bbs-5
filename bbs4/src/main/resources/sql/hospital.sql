SELECT * FROM likelion.nation_wide_hospitals WHERE full_address like '%경기도 수원시%' and hospital_name like '%피부과%';

SELECT business_type_name, hospital_name, road_name_address
FROM likelion.nation_wide_hospitals
where business_type_name in ('보건소', '보건지소');