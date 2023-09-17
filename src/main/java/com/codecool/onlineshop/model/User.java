package com.codecool.onlineshop.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "User")
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    private String password;
    private String address;
    private String phoneNumber;
    private String paymentInfo;

    @Override
    public String toString() {
        return "Id: " + id + "\n" +
                "User: " + username + "\n" +
                "Email: " + email + "\n" +
                "Password: " + password + "\n" +
                "Address: " + address + "\n" +
                "Phone number: " + phoneNumber + "\n" +
                "Payment info: " + paymentInfo;
    }
}
