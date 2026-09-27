package pe.edu.cibertec.t1feigngrupo2.restclient.placeholder.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FakeUserDto {

    private Integer id;
    private String email;
    private String username;

}
