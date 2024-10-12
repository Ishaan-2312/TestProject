package com.IshaanBansal.TestProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private Repository repository;

    public void addStudent(Student student) {

         repository.save(student);
    }

    public List<Student> getAll() {
        return repository.findAll();
    }
}
