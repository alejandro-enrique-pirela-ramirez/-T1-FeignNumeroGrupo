package pe.edu.cibertec.t1feigngrupo2.restclient.placeholder.iclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.t1feigngrupo2.restclient.placeholder.dto.FakeUserDto;

import java.util.List;

@FeignClient(name = "userClient", url = "https://fakestoreapi.com")
public interface FakeUserClient {

    @GetMapping("/users")
    List<FakeUserDto> getUsers();

}
