package com.securityform.bootstrap;

import com.securityform.entity.User;
import com.securityform.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DataGenerator implements CommandLineRunner {


    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public DataGenerator(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) throws Exception {

        this.userRepository.deleteAll();

        User employee = new User("mehmet",passwordEncoder.encode("password"),"Mehmet","Icme","USER","");
        User admin = new User("admin",passwordEncoder.encode("admin"),"Admin","Admin","ADMIN","ACCESS_TEST1,ACCESS_TEST2");
        User manager = new User("manager",passwordEncoder.encode("manager123"),"Mike","Smith","MANAGER","ACCESS_TEST1");

        List<User> users = Arrays.asList(employee,admin,manager);

        userRepository.saveAll(users);

    }

}
