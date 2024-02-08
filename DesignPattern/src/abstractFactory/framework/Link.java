package abstractFactory.framework;

import java.net.URL;

public abstract class Link extends Item {

	private String url;
	
	public String getUrl() {
		return url;
	}
	
	@Override
	public abstract String makeHTML();
	
}
