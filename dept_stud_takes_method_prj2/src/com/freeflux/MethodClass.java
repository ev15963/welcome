package com.freeflux;
/** 작업 메서드들만 보유하는 클래스 **/
public class MethodClass {
	public static DataClass dc=null; //객체변수 초기값 null 선언
	
	public MethodClass() {
	} // 생성자 END

	/** 0. 학과, 학생및 성적정보들을 보유하는 클래스 객체 생성 메서드 선언 **/
	public static void createObject() {
		dc= new DataClass();
	} // createObject() END
	
	/** 1. 학점이 A이상(A, A+) 인 학생들의 학번 검색 메서드 호출 
	 * @return **/
	// DataClass객체의 takes배열 데이터 중  take 변수 값을 비교하며 검색
	public static String searchStudentID(String t) {
		dc.initTakes();
		String temp="";
//		System.out.println(dc.takes[10].take);
		for (int i =0; i<dc.takes.length;i++) {
			if(dc.takes[i].take.startsWith(t)); //if안에 변수 넣으면 초기화
				temp=temp+dc.takes[i].stu_id+",";
		} //for() END : int i 소멸
		return temp;
	} //searchStudentID() END : String t / String temp 소멸
	
	/** 2. 검색된 학번을 이용하여 학생들의 이름과 학과번호 검색 메서드 호출 **/
	public static void searchStudentInfo(String stu_id) { //"1292001, ..."
		dc.initStudents();
//		System.out.println(dc.students[7].stu_id);
		String[] temp= {"",""}; //temp[0]:이름들/ temp[1]:학과번호들
		String[] s_ids=stu_id.split(","); //"1292001" "1292001"
		
		for(int i=0;i<dc.students.length;i++) {
			if(dc.students[i].stu_id.equals(s_ids[0])) {
				temp[0]=temp[0]+dc.students[i].name+",";
				temp[1]=temp[1]+dc.students[i].dept_id+",";
			}
		}
		System.out.println(temp[0]);
		System.out.println(temp[1]);
	} //searchStudentInfo() END
	/** 3. 검색된 학번을 이용하여 학과이름 검색 메서드 호출 **/
	public static void convertDepartmentID() {
		
	}
	/** 4. 각 결과 값을 이용하여 결과 출력 메서드 호출 **/
	public static void printResult() {
		
	}
}  // MethodClass END








