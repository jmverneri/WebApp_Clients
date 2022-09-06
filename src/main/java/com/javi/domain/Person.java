package com.javi.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data   ///It creates getter, setter, constructor, etc
@Entity
@Table(name = "person")
public class Person implements Serializable {
    private static final long serialVersionUID= 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPerson;
    @NotEmpty
    private String name;
    @NotEmpty
    private String surname;
    @NotEmpty
    @Email
    private String email;
    private String phone;

    @NotNull
    private Double balance;
}
