package utp.edu.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateMiembroDTO {
    private String codigoUsuario;
    private Long idGrupo;
    private String rolGrupo;
}
