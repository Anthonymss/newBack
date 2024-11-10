package com.seguridad_ciudadana.controller;

import com.seguridad_ciudadana.dto.ContactoEmergenciaDto;
import com.seguridad_ciudadana.service.ContactoEmergenciaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contactos-emergencia")
@RequiredArgsConstructor
@CrossOrigin("*")
public class ContactoEmergenciaController {

    private final ContactoEmergenciaService contactoEmergenciaService;

    @PostMapping("/{id}")
    public ResponseEntity<String> agregarContacto(
            @PathVariable Long id,
            @RequestBody ContactoEmergenciaDto contactoEmergenciaDto) {
        String mensaje = contactoEmergenciaService.agregarContact(contactoEmergenciaDto, id);
        return ResponseEntity.ok(mensaje);
    }

    @GetMapping("/{id_user}")
    public ResponseEntity<List<ContactoEmergenciaDto>> listarContactos(@PathVariable Long id_user) {
        List<ContactoEmergenciaDto> contactos = contactoEmergenciaService.listarContacts(id_user);
        return ResponseEntity.ok(contactos);
    }
}
