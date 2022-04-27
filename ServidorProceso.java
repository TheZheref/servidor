package servidor;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServidorProceso {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
			ServidorImpl servidor = new ServidorImpl();
			LocateRegistry.createRegistry(1099);
			String rmiObjectName = "rmi://localhost/Datos";
			Naming.rebind(rmiObjectName, servidor);
			
			System.out.println("SERVIDOR ACTIVO");
	}

}
