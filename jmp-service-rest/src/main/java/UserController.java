import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/users")
public class UserController {

  @Autowired private ModelMapper modelMapper;

  private UserService userService;

  public UserController(UserService userService) {
    super();
    this.userService = userService;
  }

  public UserResponseDto createUser(UserRequestDto userRequestDto) {
    return new UserResponseDto();
  }

  public UserResponseDto updateUser(UserRequestDto userRequestDto) {
    return new UserResponseDto();
  }

  public boolean deleteUser(Long id) {
    return true;
  }

  public UserResponseDto getUser(Long id) {
    return new UserResponseDto();
  }

  @GetMapping
  public List<UserResponseDto> getAllUsers() {
    return userService.getAllUsers().stream()
        .map(user -> modelMapper.map(user, UserResponseDto.class))
        .collect(Collectors.toList());
  }
}
