import java.util.List;

public class NavegadorInternet {
    private List<PaginaWeb> historico;

    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    public List<PaginaWeb> getHistorico() {
        return historico;
    }

    public void setHistorico(List<PaginaWeb> historico) {
        this.historico = historico;
    }
}

