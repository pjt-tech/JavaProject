package Marble;

public class MarblesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildProperty child1 = new ChildProperty(15);
		ChildProperty child2 = new ChildProperty(9);
		
		System.out.println("���� �� ������ ��������");
		System.out.println("���1-----------");
		child1.showProperty();
		
		System.out.println("���� �� ������ ��������");
		System.out.println("���2-----------");
		child2.showProperty();
		
		child1.Marbles(child2,2);
		child2.Marbles(child1,7);
		
		System.out.println("==================");
		System.out.println("���� �� ������ ��������");
		System.out.println("��� 1------------");
		child1.showProperty();
		System.out.println("��� 2------------");
		child2.showProperty();
		
		

	}

}
