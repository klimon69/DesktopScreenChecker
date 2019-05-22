import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import com.dropbox.core.DbxException;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.FileMetadata;

public class DropBox
{
	
	public static void saveToDropBox() throws DbxException, FileNotFoundException, IOException
	{ 
		
		String ACCESS_TOKEN = "X8BEB7f4jyAAAAAAAAAADJZ3Drq1R1jltor6Kk0giI5nroJFq1HQhNzY7_PGJDYi";
        DbxRequestConfig config = DbxRequestConfig.newBuilder("dropbox/java-tutorial").build();
        DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);
        
        InputStream in = new FileInputStream("C://Development//test.txt");
        {
            FileMetadata metadata = client.files().uploadBuilder("/test.txt")
                .uploadAndFinish(in);
        }
    }
	
	

}
