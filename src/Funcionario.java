import java.util.Date;

public class Funcionario extends Pessoa{
	public int matricula ; 
	
	
	public Funcionario(String nome , Date dataNascimento , int matricula){
		super(nome ,dataNascimento );
		this.matricula = matricula ; 
		
	}
	
	public void setMatricula(int matricula){
		matricula = matricula ;
	}
	
	public int getMatricula(){
		return matricula;
	}

}
