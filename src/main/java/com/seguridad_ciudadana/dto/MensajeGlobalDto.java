package com.seguridad_ciudadana.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MensajeGlobalDto implements ConFechaHor{
    private Long id;
    private String remitenteNombre;
    private String contenido;
    private LocalDateTime fechaHora;

    @Override
    public LocalDateTime getFechaHora() {
        return fechaHora;
    }
}