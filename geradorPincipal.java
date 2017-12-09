package geradordenumeros;

import java.util.Date;
import java.util.Scanner;

import javax.naming.ConfigurationException;
import geradordenumeros.geradorCongruencial;

public class geradorPincipal {

	public static void main(String[] args) {
		System.out.println("Informe a quantidade de numeros a serem gerados: "); 
		Scanner sc = new Scanner(System.in); //
		int x = sc.nextInt(); //valor de quantidade de intera��o a ser realizada
		
		int a = 243; //multiplicador do valor anterior da equa��o
		int x0 = 133; // incremento inicial
		int mod = 902; //modulo limitador de sa�da da fun��o 
		int xn = 0; //incremento 
		
			//System.out.println("x0 = " +x0);
			
			for (int i=0;i<x;i++) {
				int c = (int)(new Date().getTime()/1000)+1; // fun��o recursiva utilizada para n�o repetir os n�meros iguais depois de um certo tempo
				
				xn = geradorCongruencial.Congruencial(a,c,mod,x0); //chamada da fun��o que faz o calculo congruencial
				
				System.out.println("X"+(i+1)+ "="+xn ); //impress�o dos valores obtidos a cada loop
				x0=xn;
			}
	}
}
