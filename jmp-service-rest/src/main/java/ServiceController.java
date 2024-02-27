import org.springframework.stereotype.Controller;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ServiceController {

    public SubscriptionResponseDto createSubscription(SubscriptionRequestDto subscriptionRequestDto) {
        return new SubscriptionResponseDto();
    }

    public SubscriptionResponseDto updateSubscription(SubscriptionRequestDto subscriptionRequestDto) {
        return new SubscriptionResponseDto();
    }

    public boolean deleteSubscription(Long id) {
        return true;
    }

    public SubscriptionResponseDto getSubscription(Long id) {
        return new SubscriptionResponseDto();
    }

    public List<SubscriptionResponseDto> getAllSubscription() {
        return new ArrayList<>();
    }
}
