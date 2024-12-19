package com.agenda.agenda.repositorios;

import com.agenda.agenda.entidades.Contacto;

import java.util.List;

public interface ContactoRepository {
    List<Contacto> obtenerTodos();
    Contacto obtenerPorId(Long id);
    Contacto guardar(Contacto contacto);
    void eliminar(Long id);
    void actualizar(Long id, Contacto contacto);
}