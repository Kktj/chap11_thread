package com.javalab.thread.pkg03;
/*
 * 실행클래스
 */

public class ThreadEx03 {

	public static void main(String[] args) {
		
//		// 첫 번째 스레드 객체 생성(상속)
//		ThreadEx3_1 t1 = new ThreadEx3_1();
//		
//		// 두 번째 스레드 객체 생성(인터페이스 구현)
//		Runnable r = new ThreadEx3_2();
//		Thread t2 = new Thread(r); // 생성자 Thread(Runnable target)
//		
//		t1.start(); // 스레드 이름 : Thread-0
//		t2.start(); // 스레드 이름 : Thread-1
		
		//싱글 스레드
		for (int i = 0; i < 100; i++) {
			System.out.print(0); // 조상인 Thread의 getName()을 호출
		}
		System.out.println();
		
		for (int i = 0; i < 100; i++) {
			System.out.print(1);
		}

	}

}


