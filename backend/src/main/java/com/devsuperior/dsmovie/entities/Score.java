package com.devsuperior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")

public class Score {
	
	@EmbeddedId
	
	private ScorePK id = new ScorePK(); // ref a PrimaryKey que tem os dois atributos (Movie e Score)
	// No banco de dados. a PK só pode ter uma referencia, por isso essa criada esta referenciando a 2.
	// Estou usando o mesmo "espaço da memoria" para armazenar uma única coisa que tem as referencias.
	
	// Essa associação esta referenciando tando a classe "Movie" como a classe "User".
	
	private Double value;
	
	public Score() {}
	
	// Metodos para "setar" as informações do 'ScorePK id'.
	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}
	public void setUser(User user) {
		id.setUser(user);
	}
	/*
	 Como a chave primaria tem DOIS atributos (Movie e User) precisamos associalos com a variável "id"
	 lá em cima do "ScorePk".
	 Resumidamente essas duas funções estão setando parâmentros para MOVIE e USER usando o método "set"
	 Ou seja: Salvando as referências!
	 */


	public ScorePK getId() {
		return id;
	}
	public void setId(ScorePK id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	
	
	
	

}
