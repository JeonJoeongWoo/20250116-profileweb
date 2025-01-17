package com.woo.profile.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Criteria {
	
	private int amount = 10;		//한 페이지당 보여질 글의 개수(10개)
	private int  pageNum = 1;		//게시판 클릭시 보여지는 페이지 -> 사용자가 클릭한 페이지의 번호가 저장될 변수
	private int  startNum;		//사용자가 클릭한 페이지의 시작 번호가 저장될 변수(디비의 rownum)

}
