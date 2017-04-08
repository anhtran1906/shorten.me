package shortenMe;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ShortenURLRequest {
	@NotNull
	@Size (min = 5, max = 1024)
	private String url;
	
	public String getURL(){
		return url;
	}
	
	public void setURL(String URL){
		url = URL;
	}
	
}
