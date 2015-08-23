package br.com.caelum.argentum.modelo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SerieTemporalTest {

	@Test(expected=IllegalArgumentException.class)
	public void naoDeveReceberListaNulaDeCandles() {
		new SerieTemporal(null);
	}

}
