package br.com.rpires;

import br.com.rpires.dao.ContratoDao;
import br.com.rpires.dao.IContratoDao;
import br.com.rpires.dao.mocks.ContratoDaoMock;
import br.com.rpires.service.ContratoService;
import br.com.rpires.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void buscarPorIdTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        // Supondo que o ID 1 existe no banco de dados
        Object contrato = service.buscarPorId(1);
        Assert.assertNotNull(contrato);
        // Adicione mais verificações conforme necessário
    }

    @Test
    public void buscarTodosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        List<Object> contratos = service.buscarTodos();
        Assert.assertNotNull(contratos);
        // Adicione mais verificações conforme necessário
    }

    @Test
    public void excluirTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        // Supondo que o ID 1 existe no banco de dados
        service.excluir(1);
        // Adicione verificações conforme necessário
    }

    @Test
    public void atualizarTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        // Supondo que você tenha um objeto de contrato válido para atualizar
        Object contrato = criarContratoParaAtualizar();
        service.atualizar(contrato);
        // Adicione verificações conforme necessário
    }

    private Object criarContratoParaAtualizar() {
        // Implemente a criação de um objeto de contrato válido para teste de atualização
        return null;
    }
}