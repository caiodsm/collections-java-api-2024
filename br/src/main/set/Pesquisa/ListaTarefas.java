package br.src.main.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> listaTarefaSet;
    
    public ListaTarefas() {
        this.listaTarefaSet = new HashSet<>();
    }
    
    public void adicionarTarefa(String descricao) {
        listaTarefaSet.add(new Tarefa(descricao));
    } 

    
    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if(!listaTarefaSet.isEmpty()){
            for(Tarefa t: listaTarefaSet) {
                if(t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            listaTarefaSet.remove(tarefaParaRemover);
        } 
    } 

    public void exibirTarefas() {
        if(!listaTarefaSet.isEmpty()){
            System.out.println(listaTarefaSet);
        }
    }

    public int contarTarefas() {
        if(!listaTarefaSet.isEmpty()){
            return listaTarefaSet.size();
        }
        return 0;
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas =  new HashSet<>();
        if (!listaTarefaSet.isEmpty()) {
            for(Tarefa t : listaTarefaSet) {
                if(t.isTarefaConcluida()) {
                    tarefasConcluidas.add(t);
                }
            }
        } else {
            tarefasConcluidas = null;
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefaspendente =  new HashSet<>();
        if (!listaTarefaSet.isEmpty()) {
            for(Tarefa t : listaTarefaSet) {
                if(!t.isTarefaConcluida()) {
                    tarefaspendente.add(t);
                }
            }
        } else {
            tarefaspendente = null;
        }
        return tarefaspendente;
    }

    public Tarefa marcarTarefaConcluida(String descricao)  {
        Tarefa marcarConcluida = null;
        if(!listaTarefaSet.isEmpty()) {
            for(Tarefa t : listaTarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setTarefaConcluida(true);
                    marcarConcluida = t;
                    break;
                }
            }
        }
        return marcarConcluida;
    }
    public Tarefa marcarTarefaPendente(String descricao)  {
        Tarefa marcarPendente = null;
        if(!listaTarefaSet.isEmpty()) {
            for(Tarefa t : listaTarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setTarefaConcluida(false);
                    marcarPendente = t;
                    break;
                }
            }
        }
        return marcarPendente;
    }

    public void limparListaTarefas() {
        if(!listaTarefaSet.isEmpty()){
            listaTarefaSet.removeAll(listaTarefaSet);
        }
    }
    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefas listaTarefas = new ListaTarefas();
    
        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");
    
        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();
    
        // Removendo uma tarefa
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();
    
        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());
    
        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());
    
        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");
    
        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());
    
        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();
    
        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
      }
}
