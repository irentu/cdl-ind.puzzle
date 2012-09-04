package at.ac.tuwien.ifs.cdl_ind.puzzle.producer.internal;

import java.util.Map;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import at.ac.tuwien.ifs.cdl_ind.puzzle.api.EchoService;

/**
 * Listener for the registration of the Producer service through Blueprint
 */
public final class ProducerListener
{
    /**
     * Called whenever the OSGi framework registers the producer service
     */
    public void onRegister(EchoService echoService, Map properties)
        throws Exception
    {
        System.out.println( "REGISTER at.ac.tuwien.ifs.cdl_ind.puzzle.producer.ExampleService" );

    }

    /**
     * Called whenever the OSGi framework unregisters the producer service
     */
    public void onUnregister(EchoService echoService, Map properties)
    {
        System.out.println( "UNREGISTER at.ac.tuwien.ifs.cdl_ind.puzzle.producer" );
    }
}

