package DAM2_MP06_UF1_PRA3_1_KogutSofiya;

public class cCuaNumerica {
	
	cGestorInternNumeric aElements;
	int aMidaMaxima;
	int aMida;
	int front;
	
	
	public cCuaNumerica(int _aMidaMaxima) {
		this.aMidaMaxima = _aMidaMaxima;
		this.aElements = new cGestorInternNumeric(aMidaMaxima);
		this.aMida = 0;
		this.front = 0;
	}
	
	public void fInserirElement(int elemento){    
		if(this.aMida < this.aMidaMaxima) {
			this.aElements.fInserirElement(elemento, aMida);
			aMida++;
		}
	}
	
	public void fEliminarElement(){  	   
		if(this.aMida == 0) {
			this.aElements.fEliminarElement(front);
			front++;
		}
	}
	
	public void fConsultarElement(){  	   
		if(this.aMida == 0) {
			this.aElements.fConsultarElement(front);;
		}
	}
	
	public int fConsultarMidaMaxima() {
		return this.aElements.fConsultarMidaMaxima();
	}
	
	
	public int fConsultarMida() {
		return this.aElements.fConsultarMida();
	}
	
	
}
