package utp.edu.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "miembro_grupo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MiembroGrupo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_miembro_grupo", nullable = false)
    private Long id;
    @Column(name = "rol_grupo")
    private String rol;
    private boolean es_lider;

    @ManyToOne
    @JoinColumn(name = "id_grupo")
    private Grupo grupo;

    @ManyToOne
    @JoinColumn(name = "id_persona")
    private Persona persona;

}
