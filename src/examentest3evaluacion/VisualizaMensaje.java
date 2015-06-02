package examentest3evaluacion;

public class VisualizaMensaje {

    public static String visualizar(Calculo cal) {
        String mensaje = " ";
        if (cal.getNumero1() < 0 && cal.getNumero2() < 0) {
            mensaje = cal.getMensajeResultado();
            System.out.println(mensaje);
        }
        if (cal.getNumero1() > 0 && cal.getNumero2() > 0) {
            mensaje = cal.getMensajeResultado();
            System.out.println("Correcto");
        } else {
            mensaje = cal.getMensajeResultado();
            System.out.println("Incorrecto");
        }
        return mensaje;
    }
}
