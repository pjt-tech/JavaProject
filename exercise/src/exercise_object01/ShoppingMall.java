package exercise_object01;

public class ShoppingMall {
	
	public static void main(String[] args) {
	Person person =  new Person("홍길동","abc123","서울시 영등포구 여의도동 20번지","PD0345-12","2018년 3월 12일",201803120001L);
		person.PersonResult();
		Person person1 =  new Person("홍미녀","abc1234","서울시 영등포구 여의도동 30번지","PD0345-13","2018년 3월 12일",201803120002L);
		person1.PersonResult();
	}

}
