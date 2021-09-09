
	package vo.dao;
	
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.ArrayList;

	import vo.Produtos;

	public class ProdutosDAO {

		private BufferedReader br;
		private BufferedWriter bw;
		private String arquivo = "F:\\dbs\\produto.csv";
		private ArrayList<Produtos> produtos; // lista de modelos
		private Produtos produto; // modelo

		public void escrever(ArrayList<Produtos> produto) {
			try {
				bw = new BufferedWriter(new FileWriter(arquivo, false));
				for (Produtos l : produto) {
					bw.write(l.toCSV());
				}
				bw.close();
			} catch (IOException e) {
				System.out.println("Erro ao salvar: " + e);
			}
		}

		public ArrayList<Produtos> ler() {
			produtos = new ArrayList<>();
			try {
				br = new BufferedReader(new FileReader(arquivo));
				String linha = "";
				while ((linha = br.readLine()) != null) {
					produto = new Produtos(linha.split(";"));
					produtos.add(produto);
				}
				br.close();
			} catch (FileNotFoundException e) {
				System.out.println("Arquivo não encontrado: " + e);
			} catch (IOException e) {
				System.out.println("Erro ao abrir: " + e);
			}
			return produtos;
		}

	}

