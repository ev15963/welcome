package com.freeflux;


public class MainClass {

	public static void main(String[] args) {
		/** 0. �а�, �л��� ������������ �����ϴ� Ŭ���� ��ü ���� �޼��� ȣ��**/
		MethodClass.createObject();
		/** ������ A�̻�(A, A+) �� �л����� �̸��� �й�, �а����� ��� **/

		/** 1. ������ A�̻�(A, A+) �� �л����� �й� �˻� �޼��� ȣ�� **/
		MethodClass.searchStudentID("A");
		String temp = MethodClass.searchStudentID("A");
//		System.out.println(temp);


		/** 2. �˻��� �й��� �̿��Ͽ� �л����� �̸��� �а���ȣ �˻� �޼��� ȣ�� **/
		MethodClass.searchStudentInfo(temp);
		String[] me2 = MethodClass.searchStudentInfo(temp);
		System.out.println("me2[1]"+me2[1]);
		/** 3. �˻��� �й��� �̿��Ͽ� �а��̸� �˻� �޼��� ȣ�� **/
		MethodClass.convertDepartmentID(temp);
		String me3 = MethodClass.convertDepartmentID(me2[1]);
//		System.out.println(me3);
		/** 4. �� ��� ���� �̿��Ͽ� ��� ��� �޼��� ȣ�� **/


	} // main() END

} // class END





