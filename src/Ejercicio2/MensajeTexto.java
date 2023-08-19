package Ejercicio2;

public class MensajeTexto extends NotificacionBase{

    private String contenido;

    public MensajeTexto(String destinatario, String remitente, String contenido) {
        super(destinatario, remitente);
        this.contenido = contenido;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando mensaje de texto a " + getDestinatario());
        System.out.println("Desde: " + getRemitente());
        System.out.println("Contenido: " + contenido);
        System.out.println("Mensaje de texto enviado.");
    }
    
}
