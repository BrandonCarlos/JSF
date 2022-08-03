package br.com.caelum.livraria.bean;

import javax.faces.bean.ManagedBean;

//Abaixo estamos indicando que a classe vai ser gerenciada pelo JSF
@ManagedBean
public class LivroBean {

	private Livro livro = new Livro();

	//Componentes usaram este GET para POPULAR O LIVRO
	public Livro getLivro() {
		return livro;
	}
	
	public void gravar() {
		System.out.println("Gravando livro" + this.livro.getTitulo());
	}

}
