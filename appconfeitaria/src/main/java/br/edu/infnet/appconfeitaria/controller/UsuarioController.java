package br.edu.infnet.appconfeitaria.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appconfeitaria.model.domain.Usuario;
import br.edu.infnet.appconfeitaria.model.repository.UsuarioRepository;


@Controller
public class UsuarioController {
    
    @GetMapping(value = "/usuario")
    public String telaCadastro() {
        return "usuario/cadastro";
    }

    @GetMapping(value = "/usuario/lista")
    public String telaLista() {
        List<Usuario> lista = UsuarioRepository.obterLista();

        System.out.println("Usuários registrados: " + lista.size());

        for(Usuario user : lista) {
            System.out.printf("%s - %s\n", user.getNome(), user.getEmail());
        }

        return "usuario/lista";
    }

    @PostMapping(value = "/usuario/incluir")
    public String incluir(Usuario usuario) {
        System.out.println("Inclussão realizada!" + usuario);
        
        UsuarioRepository.incluir(usuario);

        return "redirect:/usuario/lista";
    }
}
