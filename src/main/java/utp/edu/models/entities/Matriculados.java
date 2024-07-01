package utp.edu.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "matriculados")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Matriculados {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_matriculados", nullable = false)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "id_persona")
    private Persona persona;
    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Curso curso;
}
