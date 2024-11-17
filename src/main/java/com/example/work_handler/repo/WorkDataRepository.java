package com.example.work_handler.repo;

import com.example.work_handler.model.WorkData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkDataRepository extends JpaRepository<WorkData, Long> {
}
