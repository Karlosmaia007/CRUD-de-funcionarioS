package com.reader.tratamentogeral;


	

	import java.util.Scanner;

	public class ReaderTransformado {

		private static Scanner scanner = new Scanner(System.in);

		public static final String readString() {
			String text = scanner.nextLine();
			return text;
		}

		public static final int readInt() throws Exception {
			int aux2 = 0;
			boolean aux = true;
			int num = 0;

			do {
				String i = scanner.nextLine();
				try {
					num = Integer.parseInt(i);
					aux = true;

				//System.out.println(" entrada válida");

				} catch (NumberFormatException e) {

					aux = false;
					System.out.println("Não foi possível transformar letras em numeros, neste campo só pode digitar numeros, informe numero valido");

					num = ReaderTransformado.readInt();
					System.out.println("digite outra vez o mesmo numero e tecle enter ");
					
				}
			} while (aux == false);

			return num;
			
			/*int ii = 0;
			try {
				ii = Integer.parseInt(i);
			} catch (Exception e) {
				System.out.println("Não foi possível transformar letras em numeros faça uma matricula válida  : " + i + "= ERROR"+" em Inteiro");
				throw e;
			}
			return ii;*/
		}

		public static final double readDouble() throws Exception {
			String db = scanner.nextLine();
			double dd = 0;
			try {
				dd = Double.parseDouble(db);
			} catch (Exception e) {
				System.out.println("Não foi possível transformar: " + db + " em Double");
				throw e;
			}
			return dd;
		}

		public static final boolean readBoolean() throws Exception {
			String b = scanner.nextLine();
			boolean bb = false;
			try {
				bb = Boolean.parseBoolean(b);
			} catch (Exception e) {
				System.out.println("Não foi possível transformar: " + b + " em Boolean");
				throw e;
			}
			return bb;
		}
	}

	
	


