package utp.edu.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.DayOfWeek;
import java.time.LocalTime;

@Entity
@Table(name = "horario_disponible")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Horario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_horario_disponible", nullable = false)
    private Long id;
    private DayOfWeek dia;
    private LocalTime hora_inicio;
    private LocalTime hora_fin;

}
