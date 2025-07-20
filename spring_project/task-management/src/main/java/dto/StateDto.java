package dto;

import lombok.*;

@Data //remplace @getter et @setter
@NoArgsConstructor
@AllArgsConstructor
public class StateDto {

    private long id ;
    private String code ;
    private String description ;
}