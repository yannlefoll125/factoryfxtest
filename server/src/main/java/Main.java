import de.factoryfx.jetty.HttpServerConnectorFactory;
import de.factoryfx.server.MicroserviceBuilder;

public class Main {
    public static void main(String[] args) {

        ServerFactory root = new ServerFactory();

        MyJettyServerFactory myJettyServerFactory = new MyJettyServerFactory();

        HttpServerConnectorFactory<Void, ServerFactory> connectorFactory = new HttpServerConnectorFactory<>();
        connectorFactory.host.set("127.0.0.1");
        connectorFactory.port.set(8888);
        myJettyServerFactory.connectors.add(connectorFactory);

        MicroserviceBuilder.buildInMemoryMicroservice(root).start();
        System.out.println("after start");
    }
}
