package com.freeflux;

/**  학과 및 학생정보들을 보유하는 클래스 **/
public class DataClass {
	Department[] depts=new Department[3];	// 학과정보 배열
	Student[] students=new Student[8];			// 학생정보 배열
	Takes[] takes=new Takes[12];					// 성적정보 배열
	
	public DataClass() { // 기본 생성자
	} // 생성자 END

	/** 학과정보 초기 데이터 메서드 **/
	public void initDepartments() {
		depts[0]=new Department(920, "컴퓨터공학과", "201호");
		depts[1]=new Department(923, "산업공학과", "207호");
		depts[2]=new Department(925, "전자공학과", "308호");
	}
	/** 학생정보 초기 데이터 메서드 **/
	public void initStudents() {
		students[0]=new Student("1292001", "900424-1825409", "김광식", 3, "서울", 920);
		students[1]=new Student("1292002", "900305-1730021", "김정현", 3, "서울", 920);
		students[2]=new Student("1292003", "891021-2308302", "김현정", 4, "대전", 920);
		students[3]=new Student("1292301", "890902-2704012", "김현정", 2, "대구", 923);
		students[4]=new Student("1292303", "910715-1524390", "박광수", 3, "광주", 923);
		students[5]=new Student("1292305", "921011-1809003", "김우주", 4, "부산", 923);
		students[6]=new Student("1292501", "900825-1506390", "박철수", 3, "대전", 925);
		students[7]=new Student("1292502", "911011-1809003", "백태성", 3, "서울", 925);
	}
	
	/** 성적정보 초기 데이터 메서드 **/
	public void initTakes() {
		takes[0]=new Takes("1292001", "C101-01", "B+");
		takes[1]=new Takes("1292001", "C103-01", "A+");
		takes[2]=new Takes("1292001", "C301-01", "A");
		takes[3]=new Takes("1292002", "C102-01", "A");
		takes[4]=new Takes("1292002", "C103-01", "B+");
		takes[5]=new Takes("1292002", "C502-01", "C+");
		takes[6]=new Takes("1292003", "C103-02", "B");
		takes[7]=new Takes("1292003", "C501-02", "A+");
		takes[8]=new Takes("1292301", "C102-01", "C+");
		takes[9]=new Takes("1292303", "C102-01", "C");
		takes[10]=new Takes("1292303", "C103-02", "B+");
		takes[11]=new Takes("1292303", "C501-01", "A+");
	}
	
} // class END
