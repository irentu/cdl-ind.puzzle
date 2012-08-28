package at.ac.tuwien.ifs.cdl_ind.puzzle.consumer.internal;

import java.util.Timer;
import java.util.TimerTask;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;

import at.ac.tuwien.ifs.cdl_ind.puzzle.api.EchoService;

/**
 * Extension of the default OSGi bundle activator
 */
public final class ConsumerActivator
    implements BundleActivator
{
	private Timer timer;
	
    /**
     * Called whenever the OSGi framework starts our bundle
     */
    public void start( BundleContext bc )
        throws Exception
    {
        System.out.println( "STARTING at.ac.tuwien.ifs.cdl_ind.puzzle.consumer" );
        ServiceTracker echoServiceTracker = new ServiceTracker(
        		bc,
        		EchoService.class.getName(),
        		null);
        echoServiceTracker.open();
        
        callEcho(echoServiceTracker);
    }

	private void callEcho(final ServiceTracker echoServiceTracker) {
		int delay = 5000;
		int period = 5000;
		timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				EchoService echoService = (EchoService) echoServiceTracker.getService();
				
				if (echoService == null) {
					System.out.println("EchoService is not available");
				}
				else {
					System.out.println(echoService.echo("EchoService called"));
				}
			}
		}, delay, period);
	}

	/**
     * Called whenever the OSGi framework stops our bundle
     */
    public void stop( BundleContext bc )
        throws Exception
    {
        System.out.println( "STOPPING at.ac.tuwien.ifs.cdl_ind.puzzle.consumer" );
        timer.cancel();
    }
}

