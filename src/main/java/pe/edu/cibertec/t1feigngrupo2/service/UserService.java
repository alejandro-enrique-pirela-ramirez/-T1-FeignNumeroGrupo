package pe.edu.cibertec.t1feigngrupo2.service;

import pe.edu.cibertec.t1feigngrupo2.restclient.placeholder.dto.FakeUserDto;

import java.util.List;

public interface UserService {

    List<FakeUserDto> getAllUsers();

}
