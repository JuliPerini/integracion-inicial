package ar.edu.utn.javainicial.programa;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import ar.edu.utn.javainicial.modelo.CorreoElectronico;
import ar.edu.utn.javainicial.modelo.EnviadorDeCorreos;

public class Main {

	public static void main(String[] args) {
		
		/*CorreoElectronico unCorreo = new CorreoElectronico() ; 
		
		unCorreo.setAsunto("asunto");
		
		unCorreo.setDireccionDeCorreo("direccion");
		
		
		EnviadorDeCorreos unEnviador = new EnviadorDeCorreos();
		
		unEnviador.enviarCorreo(unCorreo);*/
		
		ArrayList<CorreoElectronico> correos = new ArrayList<>();
		
		Path path = Paths.get("src/main/resources/emails.txt");
	    try(BufferedReader reader = Files.newBufferedReader(path, Charset.forName("UTF-8"))){
	      String currentLine = null;
	      while((currentLine = reader.readLine()) != null){//while there is content on the current line
	    	  CorreoElectronico correo = new CorreoElectronico();
	    	  String[] linea = currentLine.split(",");
	    	  correo.setDireccionDeCorreo(linea[0]);
	    	  correo.setAsunto(linea[1]);
	    	  correos.add(correo);
	        System.out.println(currentLine); // print the current line
	      }
	    }catch(IOException ex){
	      ex.printStackTrace(); //handle an exception here
	    }
	    
	    
	    
	    EnviadorDeCorreos enviador = new EnviadorDeCorreos();
	    for (CorreoElectronico correo : correos) {
	    	enviador.enviarCorreo(correo);
	    	
	    }

	}

}
