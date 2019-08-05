package com.exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Java Bean, data object)
//VO (Value Object,값 객체)
//similar function with map collection 
class Student{
	private int id;
	private String tel;
	
	Student(int id,String tel){
		super();
		this.id=id;
		this.tel=tel;
	}

	public int getId() {
		return id;
	}

	public String getTel() {
		return tel;
	}
}
public class HashMapStudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create hashmap
		Map<String, Student> map=new HashMap<String, Student>();
		map.put("Amy", new Student(1,"010-111-1111"));
		map.put("Bibi", new Student(2,"010-222-2222"));
		map.put("Kobe", new Student(3,"010-333-3333"));
		
		Scanner scanner=new Scanner(System.in);
		while(true) {
			System.out.println("Who are you looking for? ");
			String name=scanner.nextLine();
			if(name.equalsIgnoreCase("exit")) {
				break;
			}
			Student stu=map.get(name);
			if(stu==null) {
				System.out.println(name+" is not exist");
			}
			else {
				System.out.println("id:"+stu.getId());
				System.out.println("tel: "+stu.getTel());
			}
		}
				
	}

}
