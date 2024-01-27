package br.com.rpires.dao;

import java.util.List;

public interface IContratoDao {
    String salvar();

    // Novos métodos
    Object buscarPorId(int id);
    List<Object> buscarTodos();
    void excluir(int id);
    void atualizar(Object contrato);
}