package br.com.dio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
	private String nome;
	private String descricao;
	private final LocalDate dateInicial = LocalDate.now();
	private final LocalDate dateFinal = dateInicial.plusDays(45);
	private Set<Dev> devsInscritos = new HashSet<>();
	private Set<Conteudo> Conteudos = new LinkedHashSet<>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Set<Dev> getDevsInscritos() {
		return devsInscritos;
	}
	public void setDevsInscritos(Set<Dev> devsInscritos) {
		this.devsInscritos = devsInscritos;
	}
	public Set<Conteudo> getConteudos() {
		return Conteudos;
	}
	public void setConteudos(Set<Conteudo> conteudos) {
		Conteudos = conteudos;
	}
	public LocalDate getDateInicial() {
		return dateInicial;
	}
	public LocalDate getDateFinal() {
		return dateFinal;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Conteudos == null) ? 0 : Conteudos.hashCode());
		result = prime * result + ((dateFinal == null) ? 0 : dateFinal.hashCode());
		result = prime * result + ((dateInicial == null) ? 0 : dateInicial.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((devsInscritos == null) ? 0 : devsInscritos.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		if (Conteudos == null) {
			if (other.Conteudos != null)
				return false;
		} else if (!Conteudos.equals(other.Conteudos))
			return false;
		if (dateFinal == null) {
			if (other.dateFinal != null)
				return false;
		} else if (!dateFinal.equals(other.dateFinal))
			return false;
		if (dateInicial == null) {
			if (other.dateInicial != null)
				return false;
		} else if (!dateInicial.equals(other.dateInicial))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (devsInscritos == null) {
			if (other.devsInscritos != null)
				return false;
		} else if (!devsInscritos.equals(other.devsInscritos))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
	
	
}
