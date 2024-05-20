package br.src.main.list.Pesquisa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class SomaNumeros {
    private List<Integer> numeroList;   

    public SomaNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeroList.add(numero);
     
    }
    
    public int calcularSoma() {
        int valor = 0;
        if (!numeroList.isEmpty()){
            for(Integer i : numeroList) {
                valor += i;
            }
        }
        
        return valor;
    }

    public int encontrarMaiorNumero() {
        if (!numeroList.isEmpty()) {
            int maiorValor = Collections.max(numeroList);
            return maiorValor;
        }  else {
            throw new RuntimeException("A lista está vazia!");
        }      
    }

    public int encontrarMenorNumero() {
        if (!numeroList.isEmpty()) {
            int menorValor = Collections.min(numeroList);
            return menorValor;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros(){
        if (!numeroList.isEmpty()) {
            System.out.println(this.numeroList);
        } else {
            System.out.println("A lista está vazia!");
          }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        
        // Adicionando números à lista
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(-20000000);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(2000000000);
        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();

        // Calculando e exibindo a soma dos números na lista
        // System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        // Encontrando e exibindo o maior número na lista
        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

        // Encontrando e exibindo o menor número na lista
        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
    }
}
