package fernandowirtz.primitiva;

import java.util.Random;

public class Primitiva {
	private int[] numeros;
	
	public Primitiva(){
		this.numeros=new int[6];
		generarNumeros();
	}
	
	private void generarNumeros(){
		Random rng=new Random();
		int numGenerado;
		for(int i=0;i<numeros.length;i++){
			do{
				numGenerado=rng.nextInt(49)+1;
			}while(repetido(numGenerado));
			numeros[i]=numGenerado;
		}
	}
	
	private boolean repetido(int numero){
		for(int i=0;i<numeros.length;i++){
			if(numeros[i]==numero) return true;
		}
		return false;
	}
	
	public String getStringNumeros(){
		StringBuilder stringNumeros=new StringBuilder();
		for(int i=0;i<numeros.length;i++){
			stringNumeros.append(numeros[i]);
			if(i!=numeros.length-1) stringNumeros.append(" ");
		}
		return stringNumeros.toString();
	}
	
	public int[] getNumeros(){return numeros;}
}
