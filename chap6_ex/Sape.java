package chap6_ex;

import java.awt.Color;

public abstract class Sape {
	/*
	public void draw() {
		System.out.println("Sape");
	}*/
	
	public abstract void draw();//추상 바디만 있다면  인터페이스임/
	/*메서드가 기능 수행 못함. 객체 못함. 
	추상클래스 = 반드시 서브에서 구현 + 공통으로 사용할 수 있는 특징들 가짐
	*/
	public int x, y;	
	public void fillColor(Color c) {
		
	}//구체적인 요소

}
