package utp.edu.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CrearGrupoDTO {

    private Long idCurso;
    private String nombregrupo;
    private String codigoUsuario;

}
