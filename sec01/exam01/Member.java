package sec01.exam01;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id=id;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) { //매개값이 Member형인지 확인
		// -1 Member 형으로 강제 형 변환하고 id필드값이 동일한지 검사후 동일시 true리턴
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
			// -1 여기까지
		}//else {
		return false; //매기값이 Member형이 아니거나 id필드값 다를시 false리턴
		//}
	}
}

