import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class SubscriptionRequestDto {
    @Id
    private Long id;

    @Column
    private Long userId;

}
