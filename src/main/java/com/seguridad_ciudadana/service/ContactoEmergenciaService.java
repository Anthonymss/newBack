package com.seguridad_ciudadana.service;

import com.seguridad_ciudadana.dto.ContactoEmergenciaDto;
import com.seguridad_ciudadana.entity.ContactoEmergencia;
import com.seguridad_ciudadana.entity.Usuario;
import com.seguridad_ciudadana.repository.ContactoEmergenciaRepository;
import com.seguridad_ciudadana.repository.UserRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContactoEmergenciaService {
    private final ContactoEmergenciaRepository contactoEmergenciaRepository;
     private final UserRepository userRepository;

     public String agregarContact(ContactoEmergenciaDto contactoEmergenciaDto, Long id){
         try{
             contactoEmergenciaRepository.save(ContactoEmergencia.builder()
                     .usuario(userRepository.getReferenceById(id))
                     .nombre(contactoEmergenciaDto.getNombre())
                     .telefono(contactoEmergenciaDto.getTelefono())
                     .build());
             return "Contacto agregado exitosamente";
         }catch (Exception e){
             return "Error al agregar el contacto";
         }
     }
     public List<ContactoEmergenciaDto> listarContacts(Long id_user)
         {
             List<ContactoEmergencia> contactos = userRepository.getReferenceById(id_user).getContactosEmergencia();
             return contactos.stream()
                    .map(contacto -> ContactoEmergenciaDto.builder()
                            .id(contacto.getId())
                            .nombre(contacto.getNombre())
                            .telefono(contacto.getTelefono())
                            .build())
                    .toList();
         }
     }

