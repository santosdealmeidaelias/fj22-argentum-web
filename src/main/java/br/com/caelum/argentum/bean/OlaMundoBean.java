package br.com.caelum.argentum.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class OlaMundoBean {
	private String mensagem = "Quem � voc�?";
	private String nome;
	
	public String getMensagem() {
		System.out.println("getMensagem()");
		return mensagem;
	}
	
	public String getNome() {
		System.out.println("getNome()");
		return nome;
	}
	
	public void setNome(String nome) {
		System.out.println("setNome("+nome+")");
		this.nome = nome;
	}
	
	public void nomeFoiDigitado(){
		System.out.println("Chamou o bot�o");
	}
}
