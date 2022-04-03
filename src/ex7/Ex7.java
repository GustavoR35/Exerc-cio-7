/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex7;
import java.util.Scanner;
/**
 *
 * @author GustavoRn
 */
public class Ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner input= new Scanner(System.in);
   double valor_Produto,acrecimo,valor_venda;
   System.out.print("Digite o valor de custo do produto: ");
   valor_Produto = input.nextDouble();
   
   System.out.print("Digite o valor do acrecimo: ");
   acrecimo = input.nextDouble();
   
   valor_venda = (valor_Produto*acrecimo)/100+valor_Produto;
   System.out.printf("O valor de venda do produto é: "+valor_venda);
   
    }
    
}