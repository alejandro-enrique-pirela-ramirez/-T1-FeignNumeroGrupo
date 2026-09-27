package pe.edu.cibertec.t1feigngrupo2.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.t1feigngrupo2.restclient.placeholder.model.AlbumsPlaceHolder;
import pe.edu.cibertec.t1feigngrupo2.service.AlbumService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/albums")
public class AlbumController {

    private final AlbumService albumService;

    @GetMapping
    public List<AlbumsPlaceHolder> obtenerAlbums() {
        return albumService.obtenerAlbumsFiltrados();
    }

}
