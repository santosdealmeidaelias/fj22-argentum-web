package br.com.caelum.argentum.indicadores;

public class IndicadorFactory {
	
	private final String nomeMedia;
	private final String nomeIndicadorBase;

	public IndicadorFactory(String nomeMedia, String nomeIndicadorBase) {
		this.nomeMedia = nomeMedia;
		this.nomeIndicadorBase = nomeIndicadorBase;
	}
	
	public Indicador defineIndicador() {
		try {
			String pacote = "br.com.caelum.argentum.indicadores.";
			Class<?> classeIndicadorBase;
			classeIndicadorBase = Class.forName(pacote+nomeIndicadorBase);
			Indicador indicador = (Indicador)classeIndicadorBase.newInstance();
			return indicador;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	
}
