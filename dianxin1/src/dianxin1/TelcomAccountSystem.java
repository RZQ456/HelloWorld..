package dianxin1;

public class TelcomAccountSystem {
	public static void main(String[] args) {
		// ʵ����-�������û���TelcomUser
		TelcomUser telcomUser = new TelcomUser("13800138000");
		// ����ͨ����¼
		telcomUser.generateCommunicateRecord();
		// ��ӡͨ���굥
		telcomUser.printDetails();
	}
}