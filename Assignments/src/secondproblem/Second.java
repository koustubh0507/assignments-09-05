package secondproblem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Second {

	public static void main(String[] args) {
		String line = "";
		try {
			BufferedReader br = new BufferedReader(
					new FileReader("C:\\Users\\sangita\\.ssh\\Assignment_File_io_and_Collection\\src\\ABC.txt"));
			while ((line = br.readLine()) != null) {
				String[] arr = line.split(" ");
				printing(arr);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void printing(String[] arr) {
		for (String s : arr) {
			System.out.print(s.toUpperCase() + " ");
		}
	}
}
