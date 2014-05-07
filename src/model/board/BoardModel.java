package model.board;

public class BoardModel {

	/** 번호 */
	private int num;
	/** 제목 */
	private String subject;
	/** 작성자 */
	private String writer;
	/** 내용 */
	private String contents;
	/** 아이피 */
	private String ip;
	/** 조회수 */
	private int hit = 0;
	/** 등록 일시 */
	private String reg_Date;
	/** 수정 일시 */
	private String mod_Date;
	/** 페이지 번호 */
	private String pageNum = "1";
	/** 검색 항목 */
	private String searchType = "";
	/** 검색어 */
	private String searchText = "";
	/** 목록 페이지 게시물 노출 수 */
	private int listCount = 10;
	/** 목록 페이지 네비게이터 블록 수 */
	private int pagePerBlock = 10;
	/** 목록 페이지 시작 인덱스 위치 */
	private int startIndex = 0;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getReg_Date() {
		return reg_Date;
	}
	public void setReg_Date(String reg_Date) {
		this.reg_Date = reg_Date;
	}
	public String getMod_Date() {
		return mod_Date;
	}
	public void setModDate(String mod_Date) {
		this.mod_Date = mod_Date;
	}
	public String getPageNum() {
		return pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getSearchText() {
		return searchText;
	}
	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}
	public int getListCount() {
		return listCount;
	}
	public void setListCount(int listCount) {
		this.listCount = listCount;
	}
	public int getPagePerBlock() {
		return pagePerBlock;
	}
	public void setPagePerBlock(int pagePerBlock) {
		this.pagePerBlock = pagePerBlock;
	}
	public int getStartIndex() {
		startIndex = listCount * (Integer.parseInt(pageNum)-1);
		return startIndex;
	}
	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}
}
