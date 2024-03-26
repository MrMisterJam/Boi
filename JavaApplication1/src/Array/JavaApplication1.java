/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alunolab10
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = 18;
        int [] todasIdades = new int[10];
        List todasIdadesList = new ArrayList();
        
        todasIdadesList.add(18);
        todasIdades[0] = idade;
        
        
        String[] todosNomes = new String[10];
        List todosNomesList = new ArrayList();
        
        List<String> pautaNomes = new ArrayList<>();
        
        /*pautaNomes.add("DaniDani");
        pautaNomes.add("DaniBoy");
        pautaNomes.add("DaniLindo");
        */
        for (int i = 0; i < 3; i++) {
    System.out.print("Enter a name: ");
    String nome = scanner.nextLine();
    pautaNomes.add(nome);
}
        int tamanho = pautaNomes.size();
        
        for (int i = 0; i < tamanho; i++) {
            System.out.println(pautaNomes.get(i));
        }
        
        for (String item : pautaNomes) {
            System.out.println(item);
        }
        
        pautaNomes.forEach((item) -> { System.out.println(item);
        });
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
