package com.yviet.app.clinic.entity.clinic;

import com.yviet.app.clinic.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "tbl_clinic")
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Clinic extends BaseEntity {
    @Column(nullable = false)
    String name_vi;

    @Column(nullable = false)
    String name_en;

    @Column(nullable = false)
    String status;
}
