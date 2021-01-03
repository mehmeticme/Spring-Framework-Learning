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
public class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_details_id")
    private AccountDetails accountDetails;
    private String email;
    private String password;
    private String username;


    @Autowired
    public UserAccount(Long userAccountId, String email, String password, String username) {
        this.id = userAccountId;
        this.email = email;
        this.password = password;
        this.username = username;
    }
}
