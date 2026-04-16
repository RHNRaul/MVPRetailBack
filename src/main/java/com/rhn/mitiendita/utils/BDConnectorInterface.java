package com.rhn.mitiendita.utils;

import java.util.List;

import com.rhn.mitiendita.entities.Usuario;

public interface BDConnectorInterface {
    public void insertar(Usuario usuario);
    public List<Usuario> consultar();
}
