package br.com.bpkedu.library_spring_webmvc.service;

import br.com.bpkedu.library_spring_webmvc.domain.Usuario;
import br.com.bpkedu.library_spring_webmvc.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> listarTodos(){
       return usuarioRepository.findAll();
    }

    public Usuario buscar(Long id){return usuarioRepository.findById(id).orElse(null);}

    public void deletar(Long id){usuarioRepository.deleteById(id);}
    public void adicionar(Usuario usuario){usuarioRepository.save(usuario);}
}
