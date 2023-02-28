
package com.practica1.service;

import com.practica1.domain.Estado;
import java.util.List;

public interface EstadoService {
    
    public List<Estado> getEstados(); 
    
    public Estado getEstado(Estado estado);
    
    public void save(Estado estado); // Sirve para insertar y modificar un registro
    
    public void delete (Estado estado);
 
    
}
