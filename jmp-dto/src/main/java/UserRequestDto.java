
import java.time.LocalDate;
import lombok.Data;

@Data
public class UserRequestDto {
    private Long id;

    private String name;

    private String surname;

    private LocalDate birthday;

}
