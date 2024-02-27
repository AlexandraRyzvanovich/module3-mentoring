import jakarta.persistence.Id;
import lombok.Data;

@Data
public class SubscriptionResponseDto {
    @Id
    private Long id;
    private Long userId;
    private String startDate;

}
