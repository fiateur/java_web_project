package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Table(name="Task")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id ;

    @Column(name = "name" , nullable = false)
    private String name ;

    @Column(name = "description" , nullable = false)
    private String description ;

    @Column(name = "datecreation" , nullable = false)
    private Date datecreation ;

    @Column(name = "state" , nullable = false)
    @ManyToOne
    @JoinColumn(name="idstate")
    private State state ;

}
