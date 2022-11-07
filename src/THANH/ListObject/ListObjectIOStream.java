package THANH.ListObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import THANH.SingleObjectIO.Student;

public class ListObjectIOStream {

	public static void main(String[] args) throws IOException {
		Student student1 = new Student("AT170341", "Lâm Tăng Thành 1", 1);
		Student student2 = new Student("AT170342", "Lâm Tăng Thành 2", 2);
		Student student3 = new Student("AT170343", "Lâm Tăng Thành 3", 3);
		Student student4 = new Student("AT170344", "Lâm Tăng Thành 4", 4);
		List<Student> StudentList = new ArrayList<Student>();
		StudentList.add(student1);
		StudentList.add(student4);
		StudentList.add(student3);
		StudentList.add(student2);
		
		// Writer
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("ListStudent.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(StudentList);
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
//		Object obj = null;
		try {
			fis = new FileInputStream("ListStudent.txt");
			ois = new ObjectInputStream(fis);
			// Read
			@SuppressWarnings("unchecked")
			var ResultList = (ArrayList<Object>) ois.readObject();
			for (var obj : ResultList) {
				System.out.println(obj);
			}
			
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

	}

}
