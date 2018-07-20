import de.factoryfx.factory.SimpleFactoryBase;
import de.factoryfx.factory.atrribute.FactoryReferenceAttribute;
import de.factoryfx.jetty.JettyServer;
import de.factoryfx.jetty.JettyServerFactory;

public class ServerFactory extends SimpleFactoryBase<Object, Void, ServerFactory> {

    public final FactoryReferenceAttribute<JettyServer, JettyServerFactory<Void, ServerFactory>> jettyServer =
            new FactoryReferenceAttribute<JettyServer, JettyServerFactory<Void, ServerFactory>>().labelText("Jetty server");


    @Override
    public Object createImpl() {
        return new Object();
    }
}
