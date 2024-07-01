package utp.edu.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "habilidad")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Habilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_habilidad", nullable = false)
    private Long id;

    @Column(name = "nom_habilidad")
    private String nombre;
}
