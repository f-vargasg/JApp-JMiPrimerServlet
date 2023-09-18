package com.fvgprinc.primerservlet.persistencia;

import com.fvgprinc.primerservlet.logica.Usuario;
import com.fvgprinc.primerservlet.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public void borrarUsuario(int id_eliminar) {
        try {
            usuJpa.destroy(id_eliminar);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario traerUsuario(int id_editar) {
        return usuJpa.findUsuario(id_editar);
    }

    public void editarUsuario(Usuario usu) {
        try {
            usuJpa.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
