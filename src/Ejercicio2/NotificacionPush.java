package Ejercicio2;

public class NotificacionPush extends NotificacionBase {
    private String titulo;
    private String cuerpo;

    public NotificacionPush(String destinatario, String remitente, String titulo, String cuerpo) {
        super(destinatario, remitente);
        this.titulo = titulo;
        this.cuerpo = cuerpo;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando notificacion push a " + getDestinatario());
        System.out.println("Desde: " + getRemitente());
        System.out.println("Titulo: " + titulo);
        System.out.println("Cuerpo: " + cuerpo);
        System.out.println("Notificacion push enviada.");
    }
}
