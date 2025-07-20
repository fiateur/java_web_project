package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="Habilitation")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Habilitation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id ;

    @Column(nullable = false)
    private String code ;

    @Column(nullable = false)
    private String libelle ;
}
