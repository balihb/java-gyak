import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {
		System.out.println(1.56);
        System.out.println(new BigDecimal(1.56));
		
		
		if(args.length < 2) {
			System.err.println("Nem eleg arg");
		} else {

			File bemenet = new File(args[0]).getAbsoluteFile();
			File kimenet = new File(args[1]).getAbsoluteFile();
			
			System.out.println(bemenet);
			
			if(checkFileIn(bemenet) && checkFileOut(kimenet)) {
				process(bemenet, kimenet);
			} else {
				System.err.println("Rossz bemeneti eleresi ut");
			}
		}
    }
	
	private static void process(File in, File out) {
		try(
			BufferedReader br = new BufferedReader(new FileReader(in));
			PrintWriter pw = new PrintWriter(out)
		) {
			String line;
			while(null != (line = br.readLine())) {
				String[] parts = line.split(",");
				int sum = 0;
				for(String numStr : parts) {
					int num = Integer.parseInt(numStr);
					sum += num;
				}
				pw.println(sum);
			}
		} catch (FileNotFoundException e) {
			System.err.println("FNF exception tortent: " + e.getMessage());
		} catch (IOException e) {
			System.err.println("IO exception tortent");
		}
	}

	private static Boolean checkFileOut(File file) {
		File fileParent = file.getAbsoluteFile().getParentFile();
		if(fileParent.exists() &&
				fileParent.isDirectory() &&
				fileParent.canWrite()
			) {
				return true;
			} else {
				return false;
			}
	}
	
	private static Boolean checkFileIn(File file) {
		if(file.exists() &&
				file.isFile() &&
				file.canRead()
			) {
				return true;
			} else {
				return false;
			}
	}

}