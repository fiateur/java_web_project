package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="HabilitationRole")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HabilitationRole {

    @ManyToOne
    @JoinColumn(name="idhabilitation")
    private Habilitation habilitation ;

    @ManyToOne
    @JoinColumn(name="idrole")
    private Role role ;

    private boolean activeted ;
}