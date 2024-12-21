package com.agenda.agenda.repositorios;

import com.agenda.agenda.entidades.Contacto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ContactoRepositoryImpl implements ContactoRepository {
    private final Map<Long, Contacto> contactos = new HashMap<>();
    private Long idSecuencia = 1L;
    public ContactoRepositoryImpl() {

// Inicializa el mapa con un contacto predeterminado
        Contacto contactoInicial = new Contacto("Aitor", "123456789");
        contactoInicial.setId(idSecuencia++);
        contactos.put(contactoInicial.getId(), contactoInicial);
    }
    @Override
    public List<Contacto> obtenerTodos() {
        return new ArrayList<>(contactos.values());
    }
    @Override
    public Contacto obtenerPorId(Long id) {
        return contactos.get(id);
    }
    @Override
    public Contacto guardar(Contacto contacto) {
        if (contacto.getId() == null) {
            contacto.setId(idSecuencia++);
        }
        contactos.put(contacto.getId(), contacto);
        return contacto;
    }
    @Override
    public void eliminar(Long id) {
        contactos.remove(id);
    }
}
