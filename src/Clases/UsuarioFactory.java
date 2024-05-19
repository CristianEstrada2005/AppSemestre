package Clases;

import PFactory.CConcretaAlumno;
import PFactory.IUsuario;

public class UsuarioFactory {

    public IUsuario crearUsuario(String tipo) {
        if (tipo.equals("Alumno")) {
            System.out.println("Alumno creado");
            return new CConcretaAlumno();
            
        } else if (tipo.equals("Docente")) {
            System.out.println("Docente Creado");
        }
        return null;

    }
}
