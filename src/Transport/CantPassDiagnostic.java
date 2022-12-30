package Transport;

public class CantPassDiagnostic extends Exception {

    private Transport transport;

    public CantPassDiagnostic(String message, Transport transport) {
        super(message);
        this.transport = transport;
    }

    public Transport getTransport() {
        return transport;
    }
}
