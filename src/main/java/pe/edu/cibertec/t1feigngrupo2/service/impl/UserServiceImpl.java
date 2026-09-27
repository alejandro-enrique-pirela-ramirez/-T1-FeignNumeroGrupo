package pe.edu.cibertec.t1feigngrupo2.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.t1feigngrupo2.restclient.placeholder.dto.FakeUserDto;
import pe.edu.cibertec.t1feigngrupo2.restclient.placeholder.iclient.FakeUserClient;
import pe.edu.cibertec.t1feigngrupo2.service.UserService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final FakeUserClient userClient;

    @Override
    public List<FakeUserDto> getAllUsers() {

        List<FakeUserDto> allUsers = userClient.getUsers();

        return allUsers.stream().filter(
                u -> u.getId() % 2 == 0
                && u.getUsername() != null
                && u.getUsername().length() >6
        ).toList();
    }
}
