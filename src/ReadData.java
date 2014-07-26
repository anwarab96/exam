import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class ReadData {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			@SuppressWarnings("unused")
			BufferedReader buffer = null;
			
			FileReader file = null;
			 file = new FileReader("/Users/anwarabegum/Desktop/BUFFERED.TXT");
			String  st ;
			 buffer = new BufferedReader(file);
			 while((st = buffer.readLine())!= null)
			 {
				 System.out.println(st);
			 }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
		
	}

}

