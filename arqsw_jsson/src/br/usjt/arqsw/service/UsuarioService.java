package br.usjt.arqsw.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.arqsw.dao.UsuarioDAO;
import br.usjt.arqsw.entity.Usuario;
/**
 * 
 *  @author Giovanna Selihevic 81613657 SIN3AN-MCA1
 */

@Service
public class UsuarioService {
private UsuarioDAO dao;
	
	@Autowired
	public UsuarioService(UsuarioDAO dao) {
		this.dao = dao;
	}
	
	public Usuario logarUsuario(Usuario usuario) throws IOException{
		return dao.logarUsuario(usuario);
	}
}
