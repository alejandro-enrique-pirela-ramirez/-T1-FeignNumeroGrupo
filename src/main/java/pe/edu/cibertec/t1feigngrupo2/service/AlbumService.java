package pe.edu.cibertec.t1feigngrupo2.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.t1feigngrupo2.restclient.placeholder.iclient.AlbumClient;
import pe.edu.cibertec.t1feigngrupo2.restclient.placeholder.model.AlbumsPlaceHolder;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AlbumService {

    private final AlbumClient albumClient;

    public List<AlbumsPlaceHolder> obtenerAlbumsFiltrados() {
        return albumClient.obtenerAlbums().stream()
                .filter(album -> album.userId() % 2 == 0 && album.id() % 2 != 0)
                .toList();
    }

}
