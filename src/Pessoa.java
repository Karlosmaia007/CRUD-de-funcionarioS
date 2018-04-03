import java.util.Date;

public class Pessoa {
	public String nome = "";
	private Date dataNascimento;

	public Pessoa(String nome, Date dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public void setNome(String nomePess) {
		nome = nomePess;
	}

	public String getNome() {
		return nome;
	}
	
	public void  setData(Date dataNascimento){
		dataNascimento = dataNascimento;
	}
	
	public Date getData(){
		return dataNascimento;
	}

}
