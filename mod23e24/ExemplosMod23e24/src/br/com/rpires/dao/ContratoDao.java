package br.com.rpires.dao;

import java.util.ArrayList;
import java.util.List;

public class ContratoDao implements IContratoDao {

    // Implementação do método salvar

    @Override
    public Object buscarPorId(int id) {
        // Implemente a lógica de busca por ID no banco de dados
        return null;
    }

    @Override
    public List<Object> buscarTodos() {
        // Implemente a lógica de buscar todos os contratos no banco de dados
        return new ArrayList<>();
    }

    @Override
    public void excluir(int id) {
        // Implemente a lógica de exclusão no banco de dados
    }

    @Override
    public void atualizar(Object contrato) {
        // Implemente a lógica de atualização no banco de dados
    }
}