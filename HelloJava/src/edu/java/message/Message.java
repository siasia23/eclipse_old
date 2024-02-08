package edu.java.message;

import java.io.Serializable;
import java.util.Date;

// JavaBean (데이터객체, 데이터가 되는 오브젝트)
public class Message implements Serializable {

	private static final long serialVersionUID=99L;
	
	private String subject;		// 제목
	private String content; 	// 내용
	private Date writeDate; 	  // 작성일시
	
	public Message() {
	}

	public Message(String subject, String content, Date writeDate) {
		super();
		this.subject = subject;
		this.content = content;
		this.writeDate = writeDate;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}

	@Override
	public String toString() {
		return "Message [subject=" + subject + ", content=" + content + ", writeDate=" + writeDate + "]";
	}
	
}
