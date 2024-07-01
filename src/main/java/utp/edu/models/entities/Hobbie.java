package utp.edu.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "hobby")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hobbie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_hobby", nullable = false)
    private Long id;
    @Column(name = "nom_hobby")
    private String nombre;
}
