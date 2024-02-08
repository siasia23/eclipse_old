package memopad;

import java.text.SimpleDateFormat;
import java.util.Date;

// 메모 하나하나? 
// 메모에 필요한거 : 제목, 내용, 날짜시간, File file
public class Memo {
	
	private String title; // 제목
	
	Date now=new Date();
	SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmm");
	private String nowDate=sdf.format(now); // 제목에 들어가는 날짜
	
	Memo() {
		
	}
	
	Memo(String title, String nowDate) {
		this.title=title;
		this.nowDate=nowDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNowDate() {
		return nowDate;
	}

	public void setNowDate(String nowDate) {
		this.nowDate = nowDate;
	}

	@Override
	public String toString() {
		return "Memo [title=" + title + ", nowDate=" + nowDate + "]";
	}

}
