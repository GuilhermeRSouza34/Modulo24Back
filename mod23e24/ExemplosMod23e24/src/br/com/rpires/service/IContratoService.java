package br.com.rpires.service;

import java.util.List;

/**
 * @author rodrigo.pires
 */
public interface IContratoService {
    String salvar();

    List<Object> buscarTodos();

    Object buscarPorId(int i);

    void excluir(int i);

    void atualizar(Object contrato);

    //TODO
    //Fazer métodos de buscar, excluir e atualizar
}
