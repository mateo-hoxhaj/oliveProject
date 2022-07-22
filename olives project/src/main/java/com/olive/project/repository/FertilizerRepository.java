package com.olive.project.repository;

import com.olive.project.model.Fertilizing;
import com.olive.project.model.Olive;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FertilizerRepository extends JpaRepository<Fertilizing, Long> {
}
