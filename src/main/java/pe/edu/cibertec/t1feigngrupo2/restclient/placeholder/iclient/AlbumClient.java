package pe.edu.cibertec.t1feigngrupo2.restclient.placeholder.iclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.t1feigngrupo2.restclient.placeholder.model.AlbumsPlaceHolder;

import java.util.List;

@FeignClient(name = "albumClient", url = "https://jsonplaceholder.typicode.com")
public interface AlbumClient {

    @GetMapping("/albums")
    List<AlbumsPlaceHolder> obtenerAlbums();

}
