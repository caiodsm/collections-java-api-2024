package br.src.main.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {
    //atributo

    private List<Livro> livroList;

    public CatalogoLivro() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if(l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livroPorIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livroPorIntervaloAnos.add(l);
                }
            }
        }

        return livroPorIntervaloAnos;
    }

    public Livro pesquisaPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            } 
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivro catalogoLivro = new CatalogoLivro();
        catalogoLivro.adicionarLivro("Livro 1", "autor 1", 2020);
        catalogoLivro.adicionarLivro("Livro 1", "autor 2", 2021);
        catalogoLivro.adicionarLivro("Livro 2", "autor 2", 2022);
        catalogoLivro.adicionarLivro("Livro 3", "autor 3", 2023);
        catalogoLivro.adicionarLivro("Livro 4", "autor 4", 1994);

        System.out.println(catalogoLivro.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivro.pesquisarPorIntervaloAnos(2020, 2022));
        System.out.println(catalogoLivro.pesquisaPorTitulo("Livro 1"));
        
    }
}
