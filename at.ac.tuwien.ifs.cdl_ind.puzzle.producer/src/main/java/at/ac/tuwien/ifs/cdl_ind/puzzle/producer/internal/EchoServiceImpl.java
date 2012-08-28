package at.ac.tuwien.ifs.cdl_ind.puzzle.producer.internal;

import at.ac.tuwien.ifs.cdl_ind.puzzle.api.EchoService;


/**
 * Internal implementation of our example OSGi service
 */
public final class EchoServiceImpl
    implements EchoService
{
	@Override
	public String echo(String text) {
		return text;
	}
}

