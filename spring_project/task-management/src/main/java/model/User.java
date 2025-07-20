package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="User")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id ;

    @Column(nullable = false)
    private String firstName ;

    @Column(nullable = false)
    private String lastName ;

    @Column(nullable = false)
    private char sexe ;
    private String telephone ;
    private String email ;
    private String password ;
    private String confirmPassword ;
    private boolean isAccountNonLocked ;

    @ManyToOne
    @JoinColumn(name="idrole")
    private Role role ;
}
