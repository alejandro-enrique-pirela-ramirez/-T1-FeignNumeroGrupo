package pe.edu.cibertec.t1feigngrupo2.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.t1feigngrupo2.restclient.placeholder.dto.GithubEventDto;
import pe.edu.cibertec.t1feigngrupo2.service.impl.GithubEventService;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class GithubEventController {

    private final GithubEventService githubEventService;

    @GetMapping("/events")
    public List<GithubEventDto> obtenerEventos(){
        return githubEventService.obtenerEventos();
    }
}
