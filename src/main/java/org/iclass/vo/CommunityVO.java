package org.iclass.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
	idx number(10) NOT NULL,
	writer varchar2(50) NOT NULL,	--작성자(로그인계정 정보 등)
	title varchar2(100) NOT NULL,	--글제목
	content varchar2(3000) NOT NULL,	--글 내용
	readCount number(10) DEFAULT 0,	--조회수
	createdAt DATE DEFAULT sysdate,	--작성날짜와시간 기본값
	ip varchar2(15) DEFAULT '127.0.0.1',	--작성자 ip
	commentCount number(10) DEFAULT '0',	--댓글 갯수
	PRIMARY key(idx)
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommunityVO {
	private int number;
	private String writer;
	private String title;
	private String content;
	private String readCount;
	private Date createdAt;
	private String ip;
	private int commentCount;
}
