package com.ham1142.mamber;

public class MainClass {
	public static void main(String[] arge) {
		
		Member member1 = new Member();
		member1.setId("tiger");
		member1.setPw("12345");
		member1.setName("홍길동");
		member1.setEmail("hong@abc.com");
		member1.setAge(27);
		
//		member1.id = "tiger";
//		member1.pw = "12345";
//		member1.name = "홍길동";
//		member1.email = "hong@abc.com";
//		member1.age = 27;
		
		Member member2 = new Member();
		
		member2.setId("lion");
		member2.setPw("12345");
		member2.setName("이순신");
		member2.setEmail("hong@abc.com");
		member2.setAge(32);

		
//		member1.id = "lion";
//		member1.pw = "12345";
//		member1.name = "이순신";
//		member1.email = "lee@abc.com";
//		member1.age = 32;
	
		Member member3 = new Member("whiteat", "88888", "김유신", "white@abc.com", 41);
				// 생성자를 사용하여 필드값이 초기화된 객체 생성
		
		
		System.out.println("회원1이름:"+member1.getId()); // 홍길동
		System.out.println("회원1이름:"+member1.getPw());
		System.out.println("회원1이름:"+member1.getName());
		System.out.println("회원1이름:"+member1.getEmail());
		System.out.println("회원1이름:"+member1.getAge());
		System.out.println();
		System.out.println("회원2이름:"+member2.getId()); // 이순신
		System.out.println("회원2이름:"+member2.getPw());
		System.out.println("회원2이름:"+member2.getName());
		System.out.println("회원2이름:"+member2.getEmail());
		System.out.println("회원2이름:"+member2.getAge());
		System.out.println("회원3이메일:"+member3.getEmail());
		
		
//		System.out.println("회원2이름:"+member2.name); // 이순신
		
		
	}
}
