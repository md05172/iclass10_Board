package org.iclass.vo;
/*
	idx number(10) NOT NULL,	--기본키
	mref number(10) NOT NULL,	--community 테이블의 idx
	writer varchar2(50) NOT NULL,	--작성자
	content varchar2(1000) NOT NULL,	--댓글 내용
	createdAt DATE DEFAULT sysdate,	--작성날짜와 시간 기본값
	ip varchar2(15) DEFAULT '127.0.0.1',	--작성자 ip
	heart number(3) DEFAULT 0,	--좋아요 갯수
	PRIMARY key(idx) 
 */

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommunityCommentsVO {
	private int idx;
	private int mref;
	private String wrtier;
	private String content;
	private Date createdAt;
	private String ip;
	private int heart;
}
