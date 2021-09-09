package crt;

import java.util.ArrayList;

import vo.Produtos;
import vo.dao.ProdutosDAO;

public class ProdutosProcess {

		public static ArrayList<Produtos> produtos;
		public static ProdutosDAO ld = new ProdutosDAO();
		
		public static void testes() {
			produtos = new ArrayList<>();
			produtos.add(new Produto("1","Renato","carvão","30.00"));
			produtos.add(new Produto("2","Thiago","Cal","25.90"));
			produtos.add(new produtos("3","Valeria","lampadas","15.60"));
		}
		
		public static void abrir() {
			produtos = ld.ler();
		}
		
		public static void salvar() {
			ld.escrever(produtos);
		}
		
	}


