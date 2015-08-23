package br.com.caelum.argentum.indicadores;

import br.com.caelum.argentum.modelo.SerieTemporal;

public class MediaMovelSimples implements Indicador {
	
	private Indicador indicador;
	
	public MediaMovelSimples(Indicador outroIndicador){
		this.indicador = outroIndicador;
	}
	
	
	@Override
	public double calcula(int posicao, SerieTemporal serie) {
		double soma = 0.0;
		for(int i = posicao; i > posicao-3;i--){
			soma += indicador.calcula(i, serie);
		}
		return soma/3;
	}
	
	@Override
	public String toString() {
		return "MMS";
	}
}
