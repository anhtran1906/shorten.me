package shortenMe;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

	@Service
	public class InMemoryURLDatabase implements URLDatabaseInterface{
	    private Map<String, String> urlByIdMap = new ConcurrentHashMap<>();
		@Override
		public String findURLById(String id) {
			  return urlByIdMap.get(id);
	    }

		@Override
		public void storeURL(String id, String url) {
			urlByIdMap.put(id, url);
	  	
		}
}
