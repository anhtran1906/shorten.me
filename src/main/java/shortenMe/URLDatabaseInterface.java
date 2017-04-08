package shortenMe;

public interface URLDatabaseInterface {
	String findURLById(String id);
	void storeURL(String id, String url);
}
