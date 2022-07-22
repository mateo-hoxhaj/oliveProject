package com.olive.project.repository;

import com.olive.project.model.Olive;
import com.olive.project.model.Working;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkingRepository extends JpaRepository<Working, Long> {
}
