package com.woo.profile.Dao;

import java.util.ArrayList;

import com.woo.profile.Dto.BoardDto;

public interface BoardDao {
	
	public void writeDao(String bid, String bname, String btitle, String bcontent);//글쓰기
	public ArrayList<BoardDto> listDao(int amount, int pageNum);//모든 글 가져오기
	public BoardDto contentViewDao(String bnum);//글 번호로 해당 번호글의 모든 정보 가져오기
	public void contentModifyDao(String bnum, String btitle, String bcontent);//글 수정하기
	public int contentDeleteDao(String bnum);//글 삭제하기 
	
	public int totalBoardCountDao();//게시판 총 글의 갯수
	
	public void updateHitDao(String bnum);		// 조회수 1증가
	
}