package com.xbd.patientbatchloader.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xbd.patientbatchloader.dto.PatientEntity;


@Repository
public interface PatientRepository extends JpaRepository<PatientEntity, Long> {

}
