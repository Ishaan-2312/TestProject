package com.IshaanBansal.TestProject;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface Repository extends MongoRepository<Student,Long> {
}
