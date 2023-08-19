import Ejercicio2.INotificacion;
import Ejercicio2.CorreoElectronico;
import Ejercicio2.MensajeTexto;
import Ejercicio2.NotificacionPush;

public class Ejercicio2 {
    public static void main(String[] args) {
        INotificacion correo = new CorreoElectronico("usuario@example.com", "admin@example.com", "Saludo",
                "Hola, ¿como estas?");
        INotificacion mensaje = new MensajeTexto("+123456789", "+987654321", "¡Hola!");
        INotificacion push = new NotificacionPush("Usuario123", "AppServer", "Nueva actualizacion",
                "¡Tenemos nuevas funciones disponibles!");

        System.out.println("--------------------------------");
        enviarNotificacion(correo);
        System.out.println("--------------------------------");
        enviarNotificacion(mensaje);
        System.out.println("--------------------------------");
        enviarNotificacion(push);
        System.out.println("--------------------------------");
    }

    public static void enviarNotificacion(INotificacion notificacion) {
        notificacion.enviar();
        System.out.println();
    }
}
