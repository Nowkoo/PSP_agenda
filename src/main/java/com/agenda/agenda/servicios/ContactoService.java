package com.agenda.agenda.servicios;

import com.agenda.agenda.entidades.Contacto;

import java.util.List;

public interface ContactoService {
    List<Contacto> obtenerTodos();
    Contacto obtenerPorId(Long id);
    Contacto guardar(Contacto contacto);
    void eliminar(Long id);
    Contacto actualizar(Long id, Contacto contacto);
}
