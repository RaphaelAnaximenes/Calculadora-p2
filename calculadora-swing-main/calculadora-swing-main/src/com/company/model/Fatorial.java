package com.company.model;

public class Fatorial{

	double x = 69; 
	double f = x;
	
	public Fatorial(int x, int y) {
		this.x = x;
		this.f = x;
		
	}
	public void getFatorial(int x, int y) {
	
		while (this.x > 1){ 
		  this.f = this.f *(this.x-1);
		  this.x--;
		  System.out.println(this.f); }
		                    }
}

// Estava tentando algo com fatorial para criar o bot�o nCr de An�lise combinat�ria
// vai ficar para a vers�o 2 :)