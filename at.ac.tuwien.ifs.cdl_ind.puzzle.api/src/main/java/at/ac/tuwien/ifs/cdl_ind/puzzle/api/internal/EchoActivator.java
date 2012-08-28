package at.ac.tuwien.ifs.cdl_ind.puzzle.api.internal;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * Extension of the default OSGi bundle activator
 */
public final class EchoActivator
    implements BundleActivator
{
    /**
     * Called whenever the OSGi framework starts our bundle
     */
    public void start( BundleContext bc )
        throws Exception
    {
        System.out.println( "STARTING at.ac.tuwien.ifs.cdl_ind.puzzle.api" );
    }
    

    /**
     * Called whenever the OSGi framework stops our bundle
     */
    public void stop( BundleContext bc )
        throws Exception
    {
        System.out.println( "STOPPING at.ac.tuwien.ifs.cdl_ind.puzzle.api" );
    }
}

