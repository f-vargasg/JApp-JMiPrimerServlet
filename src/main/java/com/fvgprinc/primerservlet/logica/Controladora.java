package com.fvgprinc.primerservlet.logica;

import com.fvgprinc.primerservlet.persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author garfi
 */
public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearUsuario (Usuario usu) {
        controlPersis.crearUsuario(usu);
    }
    
    public List<Usuario> traerUsuarios() {
        return controlPersis.traerUsuarios();
    }
}
