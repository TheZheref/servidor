package servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class ServidorImpl extends UnicastRemoteObject implements Servidor {

	private static ArrayList<Persona> listPersonas() {
		
		ArrayList<Persona> lista = new ArrayList<Persona>();
		lista.add(new Persona(1,"Luis Carlos Gasca Padilla","lcgp@gmail.com","Gerente",1238568));
		lista.add(new Persona(2,"Camilo Andrés Velásquez Duque","cavd@gmail.com","Supervisor",1238568));
		lista.add(new Persona(3,"Jaidiber Bernal Ramos","jbr@gmail.com","Digitador",1238568));
		return lista;
	}
	
	private static String getPersona(int id) {
		
		return "Nombre: "+listPersonas().get(id-1).getNombre()+"\n"
				+ "Cargo: "+listPersonas().get(id-1).getCargo()+"\n"
				+ "Correo: "+listPersonas().get(id-1).getCorreo()+"\n"
				+ "Sueldo: "+listPersonas().get(id-1).getSueldo()+"\n";
	}

	public ServidorImpl() throws RemoteException{
		
	}
		

	public String consultar(int id) throws Exception {
		// TODO Auto-generated method stub
		if (id<listPersonas().size()+1){
			return getPersona(id);
	}
		else
			return "EL USUARIO NO EXISTE";
		
	}
	
	public static void main(String[] args) throws Exception{
	
		ServidorImpl servidor = new ServidorImpl();
		
		System.out.println(servidor.consultar(2));
	}
	
}


