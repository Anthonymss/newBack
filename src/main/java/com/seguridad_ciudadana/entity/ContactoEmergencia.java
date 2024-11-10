package com.seguridad_ciudadana.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class ContactoEmergencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String telefono;
    @ManyToOne
    @JoinColumn(name = "usuario_id")  // Define la columna de clave foránea en ContactoEmergencia
    private Usuario usuario;
    private String tipo;
}
