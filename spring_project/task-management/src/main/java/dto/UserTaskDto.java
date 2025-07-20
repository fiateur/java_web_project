package dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.Task;
import model.User;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserTaskDto {

    private long id;
    private UserDto userDto;
    private TaskDto taskDto;
    private Date datecreation;
}
