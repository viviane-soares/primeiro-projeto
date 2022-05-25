package br.com.dio.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoList {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon",18, "Preto"));
            add(new Gato("Simba",6, "Tigrado"));
            add(new Gato("Jon",12, "Amarelo"));

        }};
        System.out.println("--\tOrdem de inserção:\t--");
        System.out.println(meusGatos);

        System.out.println("--\tOrdem aleatoria:\t--");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdemNatural (Nome)\t---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem de Idade: ");
        //Collections.sort(meusGatos, new ComparatorIdade);
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

    }
    }
class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private  String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {

        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

    class ComparatorIdade implements Comparator<Gato> {
        @Override
        public int compare(Gato g1, Gato g2) {
            return Integer.compare(g1.getIdade(), g2.getIdade());
        }
    }