import de.factoryfx.factory.atrribute.FactoryReferenceAttribute;
import de.factoryfx.jetty.JettyServerFactory;

import java.util.List;

public class MyJettyServerFactory extends JettyServerFactory<Void, ServerFactory> {

    public final FactoryReferenceAttribute<MyResource, MyResourceFactory> resource = new FactoryReferenceAttribute<>(MyResourceFactory.class).labelText("My Resource");

    @Override
    protected List<Object> getResourcesInstances() {
        return List.of(resource.instance());
    }
}
