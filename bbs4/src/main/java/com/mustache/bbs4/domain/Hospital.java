package com.mustache.bbs4.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nation_wide_hospitals")
public class Hospital {
    @Id
    private Integer id; // Long --> bigint

}
