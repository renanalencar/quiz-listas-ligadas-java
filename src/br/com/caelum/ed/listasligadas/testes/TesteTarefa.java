package br.com.caelum.ed.listasligadas.testes;

import br.com.caelum.ed.listasligadas.ListaLigada;
import br.com.caelum.ed.objetos.Tarefa;

/**
 * TesteTarefa
 */
public class TesteTarefa {

    public static void main(String[] args) {
        ListaLigada ListaDeAfazeres = new ListaLigada();
        Tarefa tarefa = new Tarefa();
        tarefa.setNome("Lavar a louça");
        tarefa.setDescricao("Lucas Pereira, lave a louça!");
        tarefa.setFeito(false);
        tarefa.setDeadline(3, 9, 2019);
        tarefa.setPrioridade(0);
        ListaDeAfazeres.adiciona(tarefa);
        System.out.println(ListaDeAfazeres);

        Tarefa tarefa2 = new Tarefa();
        tarefa2.setNome("Estudar para o quiz");
        tarefa2.setDescricao("Estudar listas, filas e pilhas");
        tarefa2.setFeito(false);
        tarefa2.setDeadline(10, 9, 2019);
        tarefa2.setPrioridade(1);
        ListaDeAfazeres.adiciona(tarefa2);
        System.out.println(ListaDeAfazeres);
    }
}