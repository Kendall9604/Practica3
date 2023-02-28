
package com.practica1.service;

import com.practica1.dao.estadoDao;
import com.practica1.domain.Estado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Silvinha
 */
@Service //Importar Siempre arriba
public class EstadoServiceImpl implements EstadoService {

    @Autowired
    estadoDao estadoDao;

    @Override
    public List<Estado> getEstados() {
        return (List<Estado>) estadoDao.findAll();
    }

    @Override
    public Estado getEstado(Estado estado) {
        return estadoDao.findById(estado.getIdEstado()).orElse(null);
    }

    @Override
    public void save(Estado estado) {
        estadoDao.save(estado);
    }

    @Override
    public void delete(Estado estado) {
        estadoDao.deleteById(estado.getIdEstado());
    }

}
