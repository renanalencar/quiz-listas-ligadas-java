# Quiz sobre Listas Ligadas (Encadeadas) em Java
## Lista de Disciplinas
- O coordenador do curso de Ciência da Computação deseja fazer uma lista encadeada das disciplinas que a graduação possui. Para isso, ele precisa criar um objeto "Disciplina" e criar um arquivo de testes para testar a sua lista ligada.

### Exercício 1 - Criando o objeto Disciplina
- Um TAD (Tipo Abastrato de Dados) deve ser criado para representa o objeto Disciplina. Uma classe java chamada "Disciplina.java" é criada. Modifique a classe (presente no pacote "objetos") e implemente os seguintes métodos e propriedades:

1. nome : String
2. objetivo : String
3. chTeoria : Int (Carga horária teórica)
4. chPratica : Int (Carga horária prática)
5. toString()
5. equals(Disciplina disciplina)

### Exercício 2 - Criando uma classe de testes "TesteListaDisciplinas.java"
- Modifique a classe **TesteListaDisciplinas.java** para que instancie objetos do tipo **Disciplina** e um objeto do tipo **ListaLigada**
- Faça testes com todos os métodos da classe ListaLigada:

```
public void adiciona(Object elemento);
public void adiciona(int posicao, Object elemento);
public Object pega(int posicao);
public void remove(int posicao);
public int tamanho();
public boolean contem(Object elemento);
public void adicionaNoComeco(Object elemento);
public void removeDoComeco();
public void removeDoFim();
```

### Exercício 3
- Modifique a classe **ListaLigada.java** e implemente os métodos **copia** e **concatena**, de acordo com as assinaturas abaixo:

```
public void copia(ListaLigada l);
public void concatena(ListaLigada l);
```
- Estes métodos devem ser chamados da seguinte forma na main do teste:

```
lista.copia(l);
lista.concatena(l);
```

### Exercício 3
- Modifique a classe **TesteListaDisciplinas.java** para que possa testar os novos métodos criados no exercício anterior (**copia** e **concatena**).