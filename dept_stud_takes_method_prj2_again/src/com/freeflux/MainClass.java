package com.freeflux;


public class MainClass {

	public static void main(String[] args) {
		/** 0. 학과, 학생및 성적정보들을 보유하는 클래스 객체 생성 메서드 호출**/
		MethodClass.createObject();
		/** 학점이 A이상(A, A+) 인 학생들의 이름과 학번, 학과명을 출력 **/

		/** 1. 학점이 A이상(A, A+) 인 학생들의 학번 검색 메서드 호출 **/
		MethodClass.searchStudentID("A");
		String temp = MethodClass.searchStudentID("A");
//		System.out.println(temp);


		/** 2. 검색된 학번을 이용하여 학생들의 이름과 학과번호 검색 메서드 호출 **/
		MethodClass.searchStudentInfo(temp);
		String[] me2 = MethodClass.searchStudentInfo(temp);
//		System.out.println("me2[1]"+me2[1]);
		/** 3. 검색된 학번을 이용하여 학과이름 검색 메서드 호출 **/
		MethodClass.convertDepartmentID(temp);
		String me3 = MethodClass.convertDepartmentID(me2[1]);
		System.out.println("me3"+me3);
		/** 4. 각 결과 값을 이용하여 결과 출력 메서드 호출 **/
//		MethodClass.printResult(String A, String me2[1], int no);

	} // main() END

} // class END






