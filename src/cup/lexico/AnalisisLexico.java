package cup.lexico;

import java_cup.runtime.*;
import java.io.*;
import java.util.ArrayList;
import java_cup.runtime.Symbol;
import java_cup.runtime.ComplexSymbolFactory;


class AnalisisLexico {

	public static void main(String[] args) throws Exception {
		//Parser parser = new Parser();
		//parser.parse();
		
		// Entrada de datos: teclado por defecto, fichero si hay argumento
		InputStream dataStream = System.in;
		ComplexSymbolFactory f = new ComplexSymbolFactory();
		File file = new File("./input.txt");
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Creamos el objeto scanner
		Lexer scanner = new Lexer(f, fis);
		ArrayList<Symbol> symbols = new ArrayList<Symbol>();
		// Mientras no alcancemos el fin de la entrada
		boolean end = false;
		
		while (!end) {
			try {
				Symbol token = scanner.next_token();
				symbols.add(token);
				end = (token.sym == 0);
				// 0 es EOF y por tanto ultimo
			} catch (Exception x) {
				System.out.println("Ups... algo ha ido mal");
				x.printStackTrace();
			}
		}
		// fin while
		
		symbols.trimToSize();	
		System.out.println("Numero de tokens: " + symbols.size());
		
		for (Symbol simbolo:symbols) {
			System.out.println("Almacenado: {" + simbolo.sym + " - " + sym.terminalNames[simbolo.sym] + "} >>  " + simbolo.toString());
			if (simbolo.value !=null) {
				System.out.println("Valor: " + simbolo.value.toString());
			}
		}
		
		System.out.println("\n\n -- Bye-bye -- ");		
	}	
}
