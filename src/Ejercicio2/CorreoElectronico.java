package Ejercicio2;

public class CorreoElectronico extends NotificacionBase {
    
    private String asunto;
    private String mensaje;

    public CorreoElectronico(String destinatario, String remitente, String asunto, String mensaje) {
        super(destinatario, remitente);
        this.asunto = asunto;
        this.mensaje = mensaje;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando correo electronico a " + getDestinatario());
        System.out.println("Desde: " + getRemitente());
        System.out.println("Asunto: " + asunto);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Correo electronico enviado.");
    }

}
