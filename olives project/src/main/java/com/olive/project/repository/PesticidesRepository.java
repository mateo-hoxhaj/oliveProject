package com.olive.project.repository;

import com.olive.project.model.Pesticides;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PesticidesRepository extends JpaRepository<Pesticides, Long> {
}
