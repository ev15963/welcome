package com.lsw;

public class QuizProtocol {

	private static final int WAITING = 0;
	private static final int PROBLEM = 1;
	private static final int ANSWER = 2;

	private static final int NUMPROBLEMS = 3;

	private int state = WAITING; //상태를 저장하는 변수 (PROBLEM

	private int currentProblem = 0;

	// 문제 배열 / 정답 배열
	private String[] problems = { "네트워크 처리 패키지는?", "자바의 안정화된 최신버전은?", "인터넷에서 컴퓨터를 식별한 주소는?" };
	private String[] answers = { "java.net", "1.8", "IP" };

	public QuizProtocol() {
	} // 기본생성자 END

	/** 문제를 제공하고 정답을 확인해주는 전반적인 프로세스 메서드 **/
	public String process(String theInput) {
		String theOutput = null;

		// 초기 대기 상태일 경우, client에게 보여줄 내용
		if (state == WAITING) {
			// client에게 질문
			theOutput = "퀴즈를 시작합니다(y/n)";
			state = PROBLEM;
			// client가 계속 문제를 진행할 것이지 여부
		} else if (state == PROBLEM) {

			// client가 퀴즈 진행을 하겠다고 "y" 또는 "Y"를 입력하였을 때
			if (theInput.equalsIgnoreCase("y")) { // 대소문자 뭇..
				theOutput = problems[currentProblem]; // 문제제공
				state = ANSWER;
			} else {
				state = WAITING;
				theOutput = "quit";
			}

			// 답이 제출되었을 때
		} else if (state == ANSWER) {
			if(theInput.equalsIgnoreCase(answers[currentProblem])) {
				theOutput = "정답입니다. 계속하시겠습니까? (y/n)";
				state = PROBLEM;
			} else {
				state = PROBLEM;
				theOutput = "오답입니다. 계속하시겠습니까? (y/n)";
			}
			currentProblem = (currentProblem + 1) % NUMPROBLEMS;
		}
		return theOutput;
	}

}
