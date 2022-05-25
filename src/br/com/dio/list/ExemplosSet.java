package br.com.dio.list;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemplosSet {

    public static void main(String[] args) {
        System.out.println("Crie um conjunto e adicione Notas:");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
            System.out.println("Exiba a soma dos valores: " + soma);
        System.out.println("exiba a media das notas: " + (soma/ notas.size()));
        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);


        System.out.println("Remova notas menores que 7 e exiba na lista");
        Iterator<Double> iterator1 = notas.iterator();
            while (iterator1.hasNext()){
                Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

    }

}
