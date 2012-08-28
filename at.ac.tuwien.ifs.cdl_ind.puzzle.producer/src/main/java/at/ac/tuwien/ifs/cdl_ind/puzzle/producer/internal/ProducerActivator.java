package at.ac.tuwien.ifs.cdl_ind.puzzle.producer.internal;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import at.ac.tuwien.ifs.cdl_ind.puzzle.api.EchoService;

/**
 * Extension of the default OSGi bundle activator
 */
public final class ProducerActivator
    implements BundleActivator
{
    /**
     * Called whenever the OSGi framework starts our bundle
     */
    public void start( BundleContext bc )
        throws Exception
    {
        System.out.println( "STARTING at.ac.tuwien.ifs.cdl_ind.puzzle.producer" );

        System.out.println( "REGISTER at.ac.tuwien.ifs.cdl_ind.puzzle.producer.ExampleService" );

        // Register our example service implementation in the OSGi service registry
        bc.registerService( EchoService.class.getName(), new EchoServiceImpl(), null );
    }

    /**
     * Called whenever the OSGi framework stops our bundle
     */
    public void stop( BundleContext bc )
        throws Exception
    {
        System.out.println( "STOPPING at.ac.tuwien.ifs.cdl_ind.puzzle.producer" );

        // no need to unregister our service - the OSGi framework handles it for us
    }
}

