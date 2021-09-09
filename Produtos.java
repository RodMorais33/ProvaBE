package vo;

import java.util.Objects;

public class Produtos {
	
		private int id;
		private String nome;
		private String descricao;
		private float valor;
		private int quantidade;
		
		//CONTRUTORES
		public Produtos(String id) {
			this.id = Integer.valueOf(id);
		}
		
		public Produtos() {

		}

		public Produtos(String[] vetor) {
			this.id = Integer.valueOf(vetor[0]);
			this.nome = vetor[1];
			this.valor = vetor[2];
			this.quantidade = Float.valueOf(vetor[3]);
		}
		
		public Produtos(int id, String nome, String descricao, float valor, int quantidade) {
			this.id = id;
			this.nome = nome;
			this.descricao = descricao;
			this.valor = valor;
			this.quantidade = quantidade;
		}
		//GET AND SET
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

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

		public float getValor() {
			return valor;
		}

		public void setValor(float valor) {
			this.valor = valor;
		}

		public int getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}
		//HASH && EQUALS
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id;
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
			Produtos other = (Produtos) obj;
			if (id != other.id)
				return false;
			return true;
		}
		//toSTRING
		@Override
		public String toString() {
			return "\t" + id + "\t" + nome + "\t" + descricao + "\t" + valor + "\t" + quantidade + "\n";
		}
		
		public String toCSV() {
			return id + ";" + nome + ";" + descricao + ";" + valor + ";" + quantidade + "\n";
		}
			
		public String toHTML() {
			return "<td>" + id + "</td><td>" + nome + "</td><td>" + descricao + "</td><td>" + "</td><td>" + valor + "</td><td>" + quantidade + "</td>";
		}
			
	}

