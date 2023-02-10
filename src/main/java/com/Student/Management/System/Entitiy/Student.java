package com.Student.Management.System.Entitiy;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="students")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;
    @Column(nullable = false,length = 25)

    private String firstname;
    @Column(nullable = false,length = 25)
    private String lastname;
    @Column(nullable = false,length = 50, unique = true)
    private String email;

}
