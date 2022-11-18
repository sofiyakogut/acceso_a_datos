package DAM2_MP06_UF1_PRA3_1_KogutSofiya;

public class cGestorInternNumeric {

	private int[] aElements; 
	private int aMidaMaxima = 0;
	private int aMida = 0;
	 	
	public cGestorInternNumeric(int _aMidaMaxima) {
		this.aMidaMaxima = _aMidaMaxima;
		this.aElements = new int[this.aMidaMaxima];
			for (int i = 0; i < this.aElements.length; i++) {
				this.aElements[i] = -1;
			}
	}

	public int getaMidaMaxima() {
		return aMidaMaxima;
	}

	public void setaMidaMaxima(int aMidaMaxima) {
		this.aMidaMaxima = aMidaMaxima;
	}

	public int getaMida() {
		return aMida;
	}

	public void setaMida(int aMida) {
		this.aMida = aMida;
	}
	
	public void fInserirElement(int elemento, int posicion) {
		for (int i = this.aElements.length; i >= posicion; i--) {
			if(this.aElements[posicion] == -1) {
				this.aElements[posicion] = elemento;
			}
		}	
	}
	
	public void fEliminarElement(int posicion) {
		for (int i = this.aElements.length; i >= posicion; i--) {
			if(this.aElements[posicion] != -1) {
				this.aElements[posicion] = -1;
			} 
		}	
	}
	
	public void fConsultarElement(int posicion) {
		for (int i = this.aElements.length; i >= posicion; i++) {
			System.out.println(this.aElements[posicion]);
		}	
	}

	public int fConsultarMidaMaxima() {
		int maxima = 0;
		for (int i = 0; i < this.aElements.length; i++) {
			maxima = i;
		}
		
		return maxima;
	}
	
	public int fConsultarMida() {
		
		int contador = 0;
		for (int i = 0; i < this.aElements.length; i++) {
			if(this.aElements[i] != -1) {
				contador++;
			}
		}
		return contador;
	}
	

}

