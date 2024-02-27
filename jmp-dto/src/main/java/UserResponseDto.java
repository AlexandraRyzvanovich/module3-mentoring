import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class UserResponseDto {
    private Long id;
    private String name;
    private String surname;
    private String birthday;


}
