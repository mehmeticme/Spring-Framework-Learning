package com.practice.entity;

import com.practice.enums.Role;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Setter
@Getter


public class AccountDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String country;
    private String city;
    private String state;
    private int age;
    private Long postalCode;
    @Enumerated(EnumType.STRING)
    private Role role;
    @JoinColumn(name = "user_account_id")
    @OneToOne(mappedBy = "accountDetails",cascade = CascadeType.ALL)
    private UserAccount userAccount;

    @Autowired
    public AccountDetails(Long accountDetailsId, String name, String address, String country, String city, String state, int age, Long postalCode, Role role) {
        this.id = accountDetailsId;
        this.name = name;
        this.address = address;
        this.country = country;
        this.city = city;
        this.state = state;
        this.age = age;
        this.postalCode = postalCode;
        this.role = role;
    }
}
