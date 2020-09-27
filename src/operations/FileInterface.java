package operations;

import java.io.FileNotFoundException;

public interface FileInterface {
	
	public void showAllFiles();
	public void addFile();
	public void deleteFile();
	public void searchFile() throws FileNotFoundException;

}
