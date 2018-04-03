import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


import com.reader.tratamentogeral.ReaderTransformado;

public class Main {

	public static ArrayList<Funcionario> dadosListFuncionario = new ArrayList<>();

	public static void main(String[] args) throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(false);
		int op = -1;
		boolean axou = true;

		while (op != 0) {

			System.out.println("--------------------");
			System.out.println("       MENU         ");
			System.out.println("--------------------");

			System.out.println("DIGITE [1] PARA CADASTRAR ");
			System.out.println("DIGITE [2] PARA LISTAR FUNCIONARIO");
			System.out.println("DIGITE [3] PARA DELETAR FUNCIONARIO");
			System.out.println("DIGITE [4] PARA EDITAR FUNCIONARIO");
			System.out.println("DIGITE [0] PARA SAIR  ");

			System.out.println("DIGITE OPÇÃO : ");
			op = ReaderTransformado.readInt();

			switch (op) {
			case 1:

				System.out.println("DIGITE NOME");
				String nome = ReaderTransformado.readString();
				System.out.println("DIGITE DATA NASCIMENTO");
				String data = ReaderTransformado.readString();
				System.out.println("DIGITE MATRICULA");	
				
				
					
				
				int matricula = ReaderTransformado.readInt();
				

				
				try{
					
				
				Date dataRecebe = sdf.parse(data);
				
				
				dadosListFuncionario.add(new Funcionario(nome, dataRecebe, matricula));
				}catch(ParseException e){
					System.out.println("VOCÊ DIGITOU UMA DATA EM FORMATO INVALIDO .DIGITE UMA DATA VALIDA ***");
				}catch(NumberFormatException e ){

					System.out.println("VOCÊ DIGITOU UMA matricula EM FORMATO INVALIDO .DIGITE UMA mat VALIDA ***");
				}
				break;

			case 2:

				System.out.println("\t--------------------");
				System.out.println("\t LISTA DE FUNCIONARIO ");
				System.out.println("\t--------------------");

				if (dadosListFuncionario.size() == 0) {
					System.out.println("NÃO POSSUI FUNCIONARIOS CADASTRADOS");
				} else {

					for (int i = 0; i < dadosListFuncionario.size(); i++) {

						if (dadosListFuncionario.get(i) != null) {
							System.out.println("EMPRE" + "\t--------------------------");
							System.out.println("SA" + "\tNOME : " + dadosListFuncionario.get(i).nome);
							System.out.println(" L " + "\t--------------------------");
							System.out.println(" M " + "\tMATRICULA : " + dadosListFuncionario.get(i).matricula);
							System.out.println(" T " + "\t--------------------------");
							System.out.println(
									" D " + "\tDATA NASCIMENTO: " + sdf.format(dadosListFuncionario.get(i).getData()));
							System.out.println(" A " + "\t--------------------------");
						}

					}
				}
				break;
			case 3:

				System.out.println("\t--------------------");
				System.out.println("\t DELETAR FUNCIONARIO ");
				System.out.println("\t--------------------");

				if (dadosListFuncionario.size() == 0) {
					System.out.println("NÃO POSSUI FUNCIONARIOS CADASTRADOS PARA DELETAR ");
				} else {

					System.out.println("INFORME MATRICULA PARA DELETAR : ");
					int matriculaDeleta = ReaderTransformado.readInt();

					for (int i = 0; i < dadosListFuncionario.size(); i++) {

						if (dadosListFuncionario.get(i).matricula == matriculaDeleta) {
							axou = true;
							dadosListFuncionario.remove(i);
							System.out.println("DELETADO COM SUCESSO !!!");
						}

						if (axou = false) {
							System.out.println("** NUMERO DE MATRICULA NÃO EXISTENTE **");
						}

					}

				}

				break;
			case 4:
				
				if (dadosListFuncionario.size() == 0) {
					System.out.println("NÃO POSSUI FUNCIONARIOS CADASTRADOS PARA EDITAR ");
				} else {
				System.out.println("\t-----------------------------");
				System.out.println("\t EDITAR DADOS DO FUNCIONARIO ");
				System.out.println("\t-----------------------------");
				
				System.out.println("INFORME A MATRICULA : ");
				int matriculaEdita = ReaderTransformado.readInt();

				

					for (int i = 0; i < dadosListFuncionario.size(); i++) {

						if (dadosListFuncionario.get(i).matricula == matriculaEdita) {

							System.out.println("DIGITE NOVO NOME : ");
							String novoNome = ReaderTransformado.readString();
							dadosListFuncionario.get(i).setNome(novoNome);
							System.out.println("*NOVO NOME ALTERADO*");
							axou = true;
						}
					}

					if (!axou) {
						System.out.println("MATRICULA NÃO ENCONTADA");
					}
				}
				break;

			case 0:

				System.out.println("VOCÊ SAIU ####");
				break;

			default:
				System.out.println("OPÇÃO INVALIDA !!!");
				break;
			}

		}
	}

}
