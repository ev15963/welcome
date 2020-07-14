package com.freeflux;

/** 하나의 신문사 관련 정보를 담는 클래스 **/
public class NewsClass {
	private String press="";		// 신문사 이름
	private String img="";			// 대표이미지
	private String url="";			// URL 
	private String category=""; 	// 종류

	public NewsClass() {	 //  기본생성자
	} // 기본 생성자 END
	
	/** 외부로부터 전달받은 데이터를 멤버(인스턴스) 변수에 대입하는 생성자 **/
	public NewsClass(String img, String url) {
		this.img=img;
		this.url=url;
	}  // Overloading 생성자 END

	/** 외부로부터 전달받은 데이터를 멤버(인스턴스) 변수에 대입하는 생성자 **/
	public NewsClass(String press, String img, String url, String category) {
		this.press=press;
		this.img=img;
		this.url=url;
		this.category=category;
	}  // Overloading 생성자 END

	/** 아래 메서드는 private 변수데이터에 접근하기 위한 getter 들**/
	public String getPress() {
		return press;
	}

	public String getImg() {
		return img;
	}

	public String getUrl() {
		return url;
	}

	public String getCategory() {
		return category;
	}
	
	
}
