package com.woo.profile.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PageDto {
	
	private int total;			// 게시판 글의 총 개수
	private int startPage;		//화면에 보여질 하단 페이지 번호 중 시작 페이지 번호
	private int endPage;		//화면에 보여질 하단 페이지 번호 중 마지막 페이지 번호
	private boolean next;		//현재 보여지고 있는 페이지 번호 이상으로 페이지가 더 있는지 여부
	private boolean prev;		//현재 보여지고 있는 페이지 번호 이하로 페이지가 더 있는지 여부
	private int realEndPage;	//실제 마지막 페이지
	
	private Criteria criteria;	//criteria 내의 변수 값들을 불러오기 위한 객체 선언

	public PageDto(int total, Criteria criteria) {
		super();
		this.total = total;
		this.criteria = criteria;
		
		//criteria.getPageNum() : 사용자가 클릭한 페이지 번호
		this.endPage = (int) ((Math.ceil(criteria.getPageNum()/10.0))*10);//Math.ceil->올림
		this.startPage = this.endPage - 9;
		
		this.realEndPage = (int) Math.ceil(total*1.0/criteria.getAmount());
		// 무조건 마지막 페이지 번호가 10, 20, 30으로 끝나는 경우가 아니라 35 처럼 끝나는 경우->realEndPage=35
		
		if(this.realEndPage < this.endPage) {//실제 페이지의 갯수가 계산된 endPage 수보다 작을때 교체
			this.endPage = this.realEndPage;
		}
		
		this.prev = this.startPage >1;
		this.next = this.realEndPage > this.endPage;
	}
	
}
