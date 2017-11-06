package br.com.wdcode.generator;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {

	public static void main(String[] args) throws Exception {
		
			List<Cliente> clientes = new ArrayList<>();
			clientes.add(new Cliente("Ferando", "fernando@exemplo.com", 19, true));
			clientes.add(new Cliente("Maria Silva", "maria@exemplo.com", 35, false));
			clientes.add(new Cliente("Bruno Carlos", "bruno@exemplo.com", 28, false));
			clientes.add(new Cliente("Carlos Silva", "carlos@exemplo.com", 19, true));
		
		 	String csvFile = "clientes.csv";
	        FileWriter writer = new FileWriter(csvFile);
	       
	        //Coluna principal para a listagem
	        CSVUtils.writeLine(writer, Arrays.asList("Nome", "E-mail", "Idade", "Terminado"));
	        
	        //Listagem para as determinadas colunas
	        for(Cliente cliente : clientes) {
	        	 CSVUtils.writeLine(writer, Arrays.asList(cliente.getNome(), cliente.getEmail(), String.valueOf(cliente.getIdade()), String.valueOf(cliente.getStatus() == true? "SIM" : "NAO")));
	        }
	        
	        writer.flush();
	        writer.close();
	}

}
