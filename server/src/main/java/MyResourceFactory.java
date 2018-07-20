import de.factoryfx.factory.SimpleFactoryBase;

public class MyResourceFactory extends SimpleFactoryBase<MyResource, Void, ServerFactory> {
    @Override
    public MyResource createImpl() {
        return new MyResource();
    }
}
