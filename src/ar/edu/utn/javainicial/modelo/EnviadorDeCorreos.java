package ar.edu.utn.javainicial.modelo;

public class EnviadorDeCorreos {
	
	public void  enviarCorreo(CorreoElectronico unCorreo) {
		
		String mensaje = String.format("Enviando Correo: %s con asunto: %s", unCorreo.getDireccionDeCorreo(), unCorreo.getAsunto());
				
		System.out.println(mensaje);
				
		
	}

}
