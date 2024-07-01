package utp.edu.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "tarea")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tarea", nullable = false)
    private Long id;
    private String descripcion;

    @Column(name = "f_vencimiento")
    private Date fecha_venc;

    @ManyToOne
    @JoinColumn(name="id_grupo")
    private Grupo grupo;

    @ManyToOne
    @JoinColumn(name="id_persona")
    private Persona persona;


}
