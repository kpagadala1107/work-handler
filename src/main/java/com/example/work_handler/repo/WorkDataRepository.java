package com.example.work_handler.repo;

import com.example.work_handler.model.WorkData;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WorkDataRepository extends MongoRepository<WorkData, String> {
}
