package br.edu.ifpb.padroes.service;

import br.edu.ifpb.padroes.modelo.Postagem;
import br.edu.ifpb.padroes.modelo.PostagemResposta;
import br.edu.ifpb.padroes.modelo.Usuario;

import java.util.Date;
import java.util.List;

public interface PostagemService {
    
    void adicionarPostagem(Postagem postagem);
    void removerPostagem(Postagem postagem);
    void atualizarPostagem(Postagem postagem);
    void adicionarResposta(Postagem postagem, Postagem resposta);
}
