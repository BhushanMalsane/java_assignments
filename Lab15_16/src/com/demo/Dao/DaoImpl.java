package com.demo.Dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.demo.Beans.Employee;

public class DaoImpl implements DaoIf {
	static ArrayList<Employee> elist;
	static {
		elist = new ArrayList<>();
	}

	@Override
	public void save(Employee e) {
		// TODO Auto-generated method stub
		elist.add(e);
	}

	@Override
	public boolean deletebyid(int id) {
		// TODO Auto-generated method stub
		return elist.remove(new Employee(id,null,null));
	}

	@Override
	public ArrayList<Employee> getAll() {
		// TODO Auto-generated method stub
		return elist;
	}

	@Override
	public void ReadFile() {
//		// TODO Auto-generated method stub
//		try(BufferedReader bis = new BufferedReader(new FileReader("Empdata.txt"));){
//			String str = bis.readLine();
//			while(str!=null) {
//				String star[] = str.split(",");
//				Employee e = new Employee(Integer.parseInt(star[0]),star[1],star[2]);
//				elist.add(e);
//				str = bis.readLine();
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//			System.out.println("Size "+elist.size());
			//Serialization
			File f = new File("Empdata.txt");
			if(f.exists()) {
				try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream ("Empdata.txt"));){
					while(true) {
						Employee es =(Employee)ois.readObject();
						elist.add(es);
					}
				} catch (EOFException es) {
					System.out.println("End of file...");
				} catch (IOException | ClassNotFoundException es) {
					System.out.println(es.getMessage());
				}
			
		}}
	

	@Override
	public void WriteFile() {
//		// TODO Auto-generated method stub
		try(BufferedWriter bos = new BufferedWriter(new FileWriter("Empdata.txt"));){
			for(Employee e:elist) {
				System.out.println(e);
				bos.write(e.getEid()+","+e.getEname()+","+e.getMob());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//DeSerialization
		}
	}

}
