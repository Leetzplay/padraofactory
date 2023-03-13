package padroescriacao.factorymethod;

public class ServicoProjetoPesquisa implements IServico {

    public String executar() {
        return "Aluno aprovado no processo de pesquisa";
    }

    public String cancelar() {
        return "Aluno reprovado no processo de pesquisa";
    }
}
