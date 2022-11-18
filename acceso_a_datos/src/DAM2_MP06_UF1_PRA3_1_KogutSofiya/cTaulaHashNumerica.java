package DAM2_MP06_UF1_PRA3_1_KogutSofiya;

public class cTaulaHashNumerica {
	
	cGestorInternNumeric aElements;
	int aMidaMaxima;
	int aMida;
	
	
	public cTaulaHashNumerica(int _aMidaMaxima) {
		this.aMidaMaxima = _aMidaMaxima;
		this.aElements = new cGestorInternNumeric(aMidaMaxima);
		this.aMida = 0;
	}
	
	public void fInserirElement(int elemento){    
		if(this.aMida < this.aMidaMaxima) {
			this.aElements.fInserirElement(elemento, aMida);
			aMida++;
		}
	}
	
	public void fEliminarElement(){  	   


	}
	
	public void fConsultarElement(){  	   


	}
	
	public int fConsultarMidaMaxima() {
		return this.aElements.fConsultarMidaMaxima();
	}
	
	
	public int fConsultarMida() {
		return this.aElements.fConsultarMida();
	}
	
	
	public static int fHash(int valor) {
		
		String valorString = Integer.toString(valor);
		int clave = valor % valorString.length() * valorString.length();
		
		return clave;
	}
	
}


//https://github.com/ishaan007/Data-Structures/blob/master/HashMaps/Map.java