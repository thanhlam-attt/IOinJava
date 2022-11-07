package THANH.SingleObjectIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingleObjectIOStream {

	public static void main(String[] args) throws IOException {
		Student student = new Student("AT170346", "Lâm Tăng Thành", 3);
			
		// Writer
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("Student.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(student);
			System.out.println("Write Successful!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Write Failed!!");
		} finally {
			fos.close();
			oos.close();
		}

		// Reader
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Object obj = null;
		try {
			fis = new FileInputStream("Student.txt");
			ois = new ObjectInputStream(fis);
			// Read
			obj = ois.readObject();

			System.out.println("Read Successful!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Read Failed!!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Read Failed!!");
		} finally {
			fis.close();
			ois.close();
		}
		if (obj == null) {
			System.out.println("File is empty!");
		}else {
			System.out.println(obj);
		}

	}

}
