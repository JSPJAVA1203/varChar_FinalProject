package com.varchar.biz.common;

public class PagingVO {
	
	private int totalPageCnt;
	private int startPage;
	private int endPage;
	
	private int totalCnt;


	private int currentPage;
	private String currentPageStr;
	private String teaCategory; 	//
	private String teaSearchWord; 	// 
	
	private int startRnum;
	private int endRnum;
	
	
	
	public int getStartRnum() {
		return startRnum;
	}
	public void setStartRnum(int startRnum) {
		this.startRnum = startRnum;
	}
	public int getEndRnum() {
		return endRnum;
	}
	public void setEndRnum(int endRnum) {
		this.endRnum = endRnum;
	}
	public String getCurrentPageStr() {
		return currentPageStr;
	}
	public void setCurrentPageStr(String currentPageStr) {
		this.currentPageStr = currentPageStr;
	}
	public int getTotalPageCnt() {
		return totalPageCnt;
	}
	public void setTotalPageCnt(int totalPageCnt) {
		this.totalPageCnt = totalPageCnt;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public int getTotalCnt() {
		return totalCnt;
	}
	public void setTotalCnt(int totalCnt) {
		this.totalCnt = totalCnt;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public String getTeaCategory() {
		return teaCategory;
	}
	public void setTeaCategory(String teaCategory) {
		this.teaCategory = teaCategory;
	}
	public String getTeaSearchWord() {
		return teaSearchWord;
	}
	public void setTeaSearchWord(String teaSearchWord) {
		this.teaSearchWord = teaSearchWord;
	}
	
	
	
	

}