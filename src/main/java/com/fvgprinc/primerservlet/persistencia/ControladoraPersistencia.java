package com.fvgprinc.primerservlet.persistencia;

import com.fvgprinc.primerservlet.logica.Usuario;
import java.util.List;

/**
 *
 * @author garfi
 */
public class ControladoraPersistencia {
    UsuarioJpaController usuJpa = new UsuarioJpaController();
    
    // Operacion CREATE
    public void crearUsuario(Usuario usu) {
        usuJpa.create(usu);
    }
    
    // Operacion READ
    public List<Usuario> traerUsuarios() {
        return usuJpa.findUsuarioEntities();
    }
}
