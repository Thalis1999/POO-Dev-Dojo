import java.util.ArrayList;
import java.util.List;

public static class Tarefa {
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "src.maratonajava.javacore.collections.Tarefa{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}

public static class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }
}

static void main() {
    ListaTarefa listaTarefa = new ListaTarefa();
    System.out.println(listaTarefa.obterNumeroTotalTarefas());

    listaTarefa.adicionarTarefa("tarefa 1");
    listaTarefa.adicionarTarefa("tarefa 2");
    listaTarefa.adicionarTarefa("tarefa 3");
    System.out.println(listaTarefa.obterNumeroTotalTarefas());

    listaTarefa.removerTarefa("src.maratonajava.javacore.collections.Tarefa 2");
    System.out.println(listaTarefa.obterNumeroTotalTarefas());

    listaTarefa.obterDescricoesTarefas();
}
