package br.edu.up;
import br.edu.up.modelos.*;
public class Programa {
    public static void main(String[] args) {

        Livro livro01 = new Livro("1598FHK", "Core Java 2", 
            new String[]{"Cay S. Horstmann", "Gary Cornell"}, 
            "0130819336", 2005);
        Livro livro02 = new Livro("9865PLO", "Java, Como programar", 
            new String[]{"Harvey Deitel"}, 
            "0130341517", 2015);
    
            System.out.println("Livro 01:");
            System.out.println("Código: " + livro01.getCodigo());
            System.out.println("Título: " + livro01.getTitulo());
            System.out.println("Autores: ");
            for (String autor : livro01.getAutores()) {
                System.out.println("" + autor);
            }
            System.out.println("ISNB: " + livro01.getIsbn());
            System.out.println("Ano: " + livro01.getAno());
            System.out.println();

            System.out.println("Livro 02:");
            System.out.println("Código: " + livro02.getCodigo());
            System.out.println("Título: " + livro02.getTitulo());
            System.out.println("Autores: ");
            for (String autor : livro02.getAutores()) {
            System.out.println("- " + autor);
            }
            System.out.println("ISBN: " + livro02.getIsbn());
            System.out.println("Ano: " + livro02.getAno());
    
    }
    
}