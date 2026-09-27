package pe.edu.cibertec.t1feigngrupo2.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.t1feigngrupo2.restclient.placeholder.dto.FakeUserDto;
import pe.edu.cibertec.t1feigngrupo2.service.impl.UserServiceImpl;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserServiceImpl userService;

    @GetMapping
    public List<FakeUserDto> getAllUsers()
    {
        return userService.getAllUsers();
    }

}
