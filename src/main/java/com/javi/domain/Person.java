package com.javi.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
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
    public String name;
    @NotEmpty
    public String surname;
    @NotEmpty
    @Email
    public String email;
    public String phone;
}
