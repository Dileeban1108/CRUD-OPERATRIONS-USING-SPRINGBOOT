package com.urunov.model;

import lombok.*;

import jakarta.persistence.Entity; // Change here
import jakarta.persistence.GeneratedValue; // Change here
import jakarta.persistence.GenerationType; // Change here
import jakarta.persistence.Id; // Change here

/**
 * Created by:
 * User: hamdamboy
 * Project: IntelliJ IDEA
 * Github: @urunov
 */

@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String emailId;
}
