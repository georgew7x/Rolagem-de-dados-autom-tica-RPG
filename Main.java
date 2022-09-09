package teste;

import java.util.Scanner;
import java.util.Random;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;

//Completo:
//-cálculos para rolar dados
//-fazer uma fila de iniciativa
//-fazer os personagens serem organizados randomicamente na fila
//
//Incompleto:
//funcao para selecionar o atributo ao inves de informar o valor do atributo

class Main {
    public static void main( String args[] ) {
      Random rand = new Random();
      Random rand2 = new Random();
      Scanner ler = new Scanner(System.in);
      Queue<Integer> ini = new LinkedList<>();
      
      int dado = 100;
      int n;
      int size = 6;
      String m[]=new String[6];
    
      m[0] = "Raven";
      m[1] = "Sanosuke";
      m[2] = "Apollo";
      m[3] = "Isaak";
      m[4] = "Theo";
      m[5] = "As";      

        ArrayList<Integer> list = new ArrayList<Integer>(size);
        for(int i = 1; i <= size; i++) {
            list.add(i);
        }
        while(list.size() > 0) {
            int index = rand.nextInt(list.size());
            ini.add(list.remove(index));
        }

        //System.out.println(ini);
      
      for (int i=0;i<100;i++) {
      if (i>0) {
    	  System.out.println(" ");}
      
      int objetoRemovido = ini.poll();
      System.out.println("Vez de " + m[objetoRemovido-1]);
      int int_random = rand.nextInt(dado);
      System.out.printf("Informe o nivel de atributo: ");
      n = ler.nextInt();
      
      System.out.println("Resultado do d" + (dado) + " : "+ (int_random+1));
     
      if (int_random == 99) {
    	  System.out.println("Falha critica!");
    	  }
      if (int_random > n) {
    	  System.out.println("Falha");
    	  }
      if (int_random <= n/6) {
    	  if(int_random < 1) {
    		  System.out.println("Acerto extremo!");
    		  }
    	  else {
		      System.out.println("Extremo");
		      }
    	  }
      else if (int_random < n) {
    	  if (int_random <= n/3+n/3) {
    		  if(int_random == 66) {
    			  System.out.println("Normal");
    			  }
    		  else {
    		   System.out.println("Bom");
    		   }
    		  }
    	  else {
    		  if(int_random > 98) {	}
    		  else {
    		     System.out.println("Normal");
    		     }
    		  }
      }
      ini.add(objetoRemovido);
    }
  }
}
// 1 = Acerto extremo
// 1/6 do atributo = Extremo
// de um a dois tercos = Bom
// mais de dois tercos = Normal
// 100 = Falha critica