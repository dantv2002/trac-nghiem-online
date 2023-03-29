package tracnghiemonline.tracnghiembetvd.services.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import tracnghiemonline.tracnghiembetvd.dtos.user.UserDto;
import tracnghiemonline.tracnghiembetvd.entities.User;
import tracnghiemonline.tracnghiembetvd.exceptions.NotFoundException;
import tracnghiemonline.tracnghiembetvd.repositories.UserRepository;

import java.security.Principal;
import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public Page<User> filter(String search, int page, int size, String sort, String column) {
        return null;
    }

    @Override
    public List<User> getAllUsers(String search) {
        return null;
    }

    @Override
    public User getUser(String id) {
        return null;
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.getUser(email)
                .orElseThrow(()-> new NotFoundException(String.format("User with email %s does not exist",email)));
    }

    @Override
    public User create(UserDto dto, Principal principal) {
        return null;
    }

    @Override
    public User update(String id, UserDto dto, Principal principal) {
        return null;
    }

    @Override
    public User changeStatus(String id, Principal principal) {
        return null;
    }
}
