package com.lab2.controller;

import com.lab2.entity.Address;
import com.lab2.entity.ResponseWrapper;
import com.lab2.entity.Student;
import com.lab2.entity.Teacher;
import com.lab2.repository.AddressRepository;
import com.lab2.repository.ParentRepository;
import com.lab2.repository.StudentRepository;
import com.lab2.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ApiController {

    TeacherRepository teacherRepository;
    StudentRepository studentRepository;
    ParentRepository parentRepository;
    AddressRepository addressRepository;


    @Autowired
    public ApiController(TeacherRepository teacherRepository, StudentRepository studentRepository, ParentRepository parentRepository, AddressRepository addressRepository) {
        this.teacherRepository = teacherRepository;
        this.studentRepository = studentRepository;
        this.parentRepository = parentRepository;
        this.addressRepository = addressRepository;
    }

    @GetMapping("/teachers")
    public List<Teacher> readAllTeachers(){
        return teacherRepository.findAll();
    }

    @GetMapping("/students")
    public ResponseEntity<ResponseWrapper> readAllStudents(){

        return ResponseEntity.ok(new ResponseWrapper("Students successfully retrieved",studentRepository.findAll()));
    }


    @GetMapping("/parents")
    public ResponseEntity<ResponseWrapper> readAllParents(){
        ResponseWrapper responseWrapper = new ResponseWrapper(true,"Parents are successfully retrieved", HttpStatus.ACCEPTED.value(),parentRepository.findAll());

        return  ResponseEntity.status(HttpStatus.ACCEPTED).body(responseWrapper);
    }



    @PutMapping("/address/{id}")
    public Address updateAddress(@PathVariable("id") Long id, @RequestBody Address address) throws Exception {

        Optional<Address> foundAddress = addressRepository.findById(id);

        if(!foundAddress.isPresent()){
            throw new Exception("Address does not exists!");
        }

        address.setCurrentTemperature(new Address().consumeTemp(address.getCity()));
        address.setId(foundAddress.get().getId());

        return addressRepository.save(address);
    }


}
