package pe.edu.cibertec.t1feigngrupo2.restclient.placeholder.iclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.t1feigngrupo2.restclient.placeholder.dto.GithubEventDto;

import java.util.List;

@FeignClient(name = "githubEventClient", url = "https://api.github.com")
public interface GithubEventClient {


    @GetMapping("/events")
    List<GithubEventDto> getEvents();
}
