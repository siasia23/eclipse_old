package edu.java.collection;

// 기본 데이터 클래스(Java Beans) : private 멤버변수 정의, public 생성자, public getter & setter, public toString Override
// Source 탭에서 선택해서 생성
// 학생 데이터
public class Student {

	private String sno; // 학번
	private String name; // 이름
	private int kor; // 국어점수
	private int eng; // 영어점수
	private int math; // 수학점수

	public Student() {
	}

	public Student(String sno, String name, int kor, int eng, int math) {
		super();
		this.sno = sno;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}

}
