package utp.edu.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "persona")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona", nullable = false)
    private Long id;
    private String nombres;
    @Column(name = "appaterno")
    private String ap_paterno;
    @Column(name = "apmaterno")
    private String ap_materno;
    private String documento;
    private String codigo;
}
