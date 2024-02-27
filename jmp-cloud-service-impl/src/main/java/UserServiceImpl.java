import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
  private final UserRepository userRepository;

  public UserServiceImpl(UserRepository userRepository) {
    super();
    this.userRepository = userRepository;
  }

  @Override
  public List<User> getAllUsers() {
    return userRepository.findAll();
  }
}
