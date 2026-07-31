package chapter13;

public class Student {

	
	private String name;
	private int grade;
	private int clR;
	private int clN;
	private String phone;
	private String gender;
	private String infoId;
	
	
	private int korea;
	private int mate;
	private int english;
	private int social;
	private int science;
	public int average;
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the grade
	 */
	public int getGrade() {
		return grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}
	/**
	 * @return the clR
	 */
	public int getClR() {
		return clR;
	}
	/**
	 * @param clR the clR to set
	 */
	public void setClR(int clR) {
		this.clR = clR;
	}
	/**
	 * @return the clN
	 */
	public int getClN() {
		return clN;
	}
	/**
	 * @param clN the clN to set
	 */
	public void setClN(int clN) {
		this.clN = clN;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone.substring(0,3)+"-"+phone.substring(3,7)+"-"+phone.substring(7,11);
	}      //입력된 문자에 기호 넣어 출력.
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		
		String phonestd = phone.replace("-", "");  //입려된 문자중" -"," " 공백은 다지워주고
		
		if (phone.length() == 8) {
			phonestd = "010" + phonestd;  //그리고 입력된 문자길이가 8자일 경우 앞에 010을 붙여서 출력.
		}
		this.phone = phonestd;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		
		if(gender.indexOf("남")==-1 && gender.indexOf("여")==-1) {
			System.out.println("잘못된 입력입니다.");
		}
		if (gender.indexOf("자")!=-1) {
			gender = gender.replace("자", "");
		}
		this.gender=gender;
	}
	/**
	 * @return the infoId
	 */
	public String getInfoId() {
		return infoId;
	}
	/**
	 * @param infoId the infoId to set
	 */
	public void setInfoId(String infoId) {
		
		String str= String.valueOf(this.clR);
		if(clR<10) str +="0" +this.clR;
		else str+=this.clR;
		
		if (clN <10) str+="0" + this.clN;
		else str +=this.clN;
		
		this.infoId=str;
		
		
	}
	/**
	 * @return the korea
	 */
	public int getKorea() {
		return korea;
	}
	/**
	 * @param korea the korea to set
	 */
	public void setKorea(int korea) {
		this.korea = korea;
	}
	/**
	 * @return the mate
	 */
	public int getMate() {
		return mate;
	}
	/**
	 * @param mate the mate to set
	 */
	public void setMate(int mate) {
		this.mate = mate;
	}
	/**
	 * @return the english
	 */
	public int getEnglish() {
		return english;
	}
	/**
	 * @param english the english to set
	 */
	public void setEnglish(int english) {
		this.english = english;
	}
	/**
	 * @return the social
	 */
	public int getSocial() {
		return social;
	}
	/**
	 * @param social the social to set
	 */
	public void setSocial(int social) {
		this.social = social;
	}
	/**
	 * @return the science
	 */
	public int getScience() {
		return science;
	}
	/**
	 * @param science the science to set
	 */
	public void setScience(int science) {
		this.science = science;
	}
	/**
	 * @return the average
	 */
	public void setAverage() {
		this.average = (this.korea+ this.mate + this.social + this.science + this.english) / 5;
	}
	public void setInfoId() {
		// TODO Auto-generated method stub
		
	}
	}
	/**
	 * @param average the average to set
	 */
	//public void setAverage(//파라미터 받을필요 없으민지우기.) {
		//this.average = average;
	
//}

	

		
	

