package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Table(name="Role")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id ;

    @Column(nullable = false)
    private String code ;

    @Column(nullable = false)
    private String libelle ;

    //Un role peut etre affecte a une liste de user
    @OneToMany
    private List<User> users = new ArrayList();
    //On peut aussi avoir
    //priva//e MAP

}
