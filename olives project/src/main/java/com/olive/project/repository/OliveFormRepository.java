package com.olive.project.repository;

import com.olive.project.model.Fertilizing;
import com.olive.project.model.OliveForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OliveFormRepository extends JpaRepository<OliveForm, Long> {
}
