package com.prueba1.service;

import com.prueba1.entity.Evento;
import java.util.List;

/**
 *
 * @author Karina Madrigal
 */
public interface IEventoService {
    
    public List<Evento> getAllEvento(); //Devuelve la lista de eventos
    public Evento getEventoById(long id); //Devuelve un evento dado un id
    public void saveEvento(Evento evento); //Guarda un evento en la tabla
    public void delete(long id); //Elimina un evento de la tabla dado un id
    
    
}
