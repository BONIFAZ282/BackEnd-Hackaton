package utp.edu.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "trabajo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Trabajo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_trabajo", nullable = false)
    private Long id;
    @Column(name = "nom_trabajo")
    private String nombre;
    private String descripcion;
    @Column(name = "f_entrega")
    private Date fecha_entrega;

    @ManyToOne
    @JoinColumn(name="id_grupo")
    private Grupo grupo;

}
