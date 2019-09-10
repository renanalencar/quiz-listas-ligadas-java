package br.com.caelum.ed.listasligadas.testes;

import java.util.Date;

import br.com.caelum.ed.listasligadas.ListaLigada;
import br.com.caelum.ed.objetos.Tarefa;
import br.com.caelum.ed.objetos.Tarefa2;

/**
 * TesteListaAfazeres
 */
public class TesteListaAfazeres {

    public static void main(String[] args) {
        ListaLigada afazeres = new ListaLigada();
        Tarefa2 t1 = new Tarefa2();
        t1.setNome("Marcos, estudar para ED2!");
        t1.setDescricao("Estude listas encadeadas!");
        t1.setFeito(false);
        t1.setPrioridade(0);
        t1.setDeadline(new Date(2019, 9, 5));

        afazeres.adiciona(t1);

        System.out.println(afazeres);

        Tarefa2 t2 = new Tarefa2();
        t2.setNome("Alice, peça o Uber!");
        t2.setDescricao("Pedir Uber mais cedo para não se atrasar.");
        t2.setFeito(false);
        t2.setPrioridade(2);
        t2.setDeadline(new Date(2019, 9, 5));

        afazeres.adiciona(t2);

        System.out.println(afazeres);
    }
}