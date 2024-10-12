package com.IshaanBansal.TestProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    private UserService userService;

    private BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12);
    @GetMapping("/greet")
    public String greet(){
        return "Welcome to Security demo";
    }
    @PostMapping("/add")
    public void addStudent(@RequestBody Student student){
        student.setPassword(encoder.encode(student.getPassword()));
        userService.addStudent(student);

    }
    @GetMapping("/getStudent")
    public ResponseEntity<List<Student>> getStudent(){
       List<Student> list= userService.getAll();
       return ResponseEntity.ok(list);
    }
}
