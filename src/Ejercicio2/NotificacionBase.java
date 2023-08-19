package Ejercicio2;

abstract class NotificacionBase implements INotificacion {

    private String destinatario;
    private String remitente;

    public NotificacionBase(String destinatario, String remitente) {
        this.destinatario = destinatario;
        this.remitente = remitente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getRemitente() {
        return remitente;
    }

}
