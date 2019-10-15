package com.dxc.test.model;

public class Test {
private int questionno;
private String question;
private String answer;

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public Test(int questionno, String question, String answer) {
		super();
		this.questionno = questionno;
		this.question = question;
		this.answer = answer;
	}

	public int getQuestionno() {
		return questionno;
	}

	public void setQuestionno(int questionno) {
		this.questionno = questionno;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((answer == null) ? 0 : answer.hashCode());
		result = prime * result + ((question == null) ? 0 : question.hashCode());
		result = prime * result + questionno;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		if (answer == null) {
			if (other.answer != null)
				return false;
		} else if (!answer.equals(other.answer))
			return false;
		if (question == null) {
			if (other.question != null)
				return false;
		} else if (!question.equals(other.question))
			return false;
		if (questionno != other.questionno)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Test [questionno=" + questionno + ", question=" + question + ", answer=" + answer + "]";
	}

}
