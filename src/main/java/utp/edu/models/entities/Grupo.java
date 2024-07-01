package utp.edu.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "grupo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Grupo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_grupo", nullable = false)
    private Long id;
    @Column(name = "nom_grupo")
    private String nombre;
    @Column(name = "f_create")
    private Date fecha_creacion;
    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Curso curso;
}
