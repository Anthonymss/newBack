package com.seguridad_ciudadana.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Builder
public class AlertaDto implements ConFechaHor{
    private Long id;
    private String ubicacionURL;
    private String descripcion;
    private LocalDateTime fechaHora;
    @Override
    public LocalDateTime getFechaHora() {
        return fechaHora;
    }
}
