package anonymous;

public class Anonymous_Ex {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.wake();
		anony.method1();
		anony.method2(new Person() {
			void study() {
				System.out.println("�����մϴ�.");
			}
			void wake() {
				System.out.println("8�ÿ� �Ͼ�ϴ�.");
				study();
			}
		});
	}

}