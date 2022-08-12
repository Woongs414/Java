package sec01.exam03;

//hashCode()메서드 재정의 추가

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	
	public boolean eqauls(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
}
	@Override
	public int hashCode() {
		return id.hashCode();
	}

}
