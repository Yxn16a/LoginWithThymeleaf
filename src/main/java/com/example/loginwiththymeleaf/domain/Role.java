package com.example.loginwiththymeleaf.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="Role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String roleName;
    @ManyToMany(mappedBy = "roles")
    private Collection<User> users;
    public Role(String name) {
        this.roleName = name;
    }
}
