package pe.edu.cibertec.t1feigngrupo2.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.t1feigngrupo2.restclient.placeholder.dto.GithubEventDto;
import pe.edu.cibertec.t1feigngrupo2.restclient.placeholder.iclient.GithubEventClient;
import pe.edu.cibertec.t1feigngrupo2.service.IGithubEventService;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GithubEventService implements IGithubEventService {

    private final GithubEventClient githubEventClient;

    @Override
    public List<GithubEventDto> obtenerEventos() {
        List<GithubEventDto> getAllEvents;
        getAllEvents =  githubEventClient.getEvents();

        return getAllEvents.stream().filter(
                a -> a.getType().equals("PushEvent") &&
                        a.getActor().getId() % 2 != 0).toList();
    }


}
