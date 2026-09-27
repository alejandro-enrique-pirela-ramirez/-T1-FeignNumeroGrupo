package pe.edu.cibertec.t1feigngrupo2.service;


import pe.edu.cibertec.t1feigngrupo2.restclient.placeholder.dto.GithubEventDto;

import java.util.List;


public interface IGithubEventService {

    public List<GithubEventDto> obtenerEventos();
}
