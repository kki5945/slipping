package net.slipp.domain.board;

public class Board {
	private String subject;
	private String content;
	
	public Board() {
	}

	public Board(String subject, String content) {
		this.subject = subject;
		this.content = content;
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		return result;
	}
	

	@Override
	public String toString() {
		return "Board [subject=" + subject + ", content" + content + "]";
	}
}