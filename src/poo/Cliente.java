package poo;

public class Cliente {
	

	private String nome;
	private int idade;
	private double cpf;
	private double rg;
	private String genero;

	public Cliente (String nome,int idade,double rg,double cpf, String genero) {
		this.nome = nome;
		this.idade = idade;
		this.rg = rg;
		this.cpf = cpf;
		this.genero = genero;
		}
		
		public String getNome(){
			return nome;
			
		}

		public void setNome( String nome) {
			this.nome = nome;
		}

		public int getIdadede() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public double getRg() {
			return rg;
		}

		public void setRg(double rg) {
			this.rg = rg;
		}

		public double getCpf() {
			return cpf;
		}

		public void setCpf(double cpf) {
			this.cpf = cpf;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

	

		public void visualizar() {
			System.out.println("\t\t*********************************************************\t\t");
			System.out.println("\t\t**                                                  \t\t");
			System.out.println("\t\t** Nome do cliente:" + nome +      "                \t\t");
			System.out.println("\t\t** Idade do cliente:" +  idade +   "                \t\t");
			System.out.println("\t\t** Rg do cliente:"+   rg  +         "               \t\t");
			System.out.println("\t\t** Cpf do cliente:" +  cpf   +       "              \t\t");
			System.out.println("\t\t** Genero do  cliente :" +genero +    "             \t\t");
			System.out.println("\t\t**                                                   \t\t");
			System.out.println("\t\t*********************************************************\t\t");
			
		}


	    

	
	}


