package dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.Role;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private long id ;
    private String firstName ;
    private String lastName ;
    private char sexe ;
    private String telephone ;
    private String email ;
    private String password ;
    private String confirmPassword ;
    private boolean isAccountNonLocked ;
    private RoleDto roleDto ;
}
