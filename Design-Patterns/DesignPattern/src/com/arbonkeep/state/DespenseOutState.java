package com.arbonkeep.state;
//��Ʒ�������״̬˵����������activity�ı��DespenseOutState���齱�����
public class DespenseOutState extends State {
	Activity activity;
	
	//������
	public DespenseOutState(Activity activity) {
		this.activity = activity;
	}
	
	@Override
	public void deductMoney() {
		System.out.println("��Ʒ�����ˣ����´βμ�");
		
	}

	@Override
	public boolean raffle() {
		System.out.println("��Ʒ�����ˣ����´βμ�");
		return false;
	}

	@Override
	public void dispensePrize() {
		System.out.println("��Ʒ�����ˣ����´βμ�");
		
	}

}
