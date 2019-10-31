package com.arbonkeep.state;

public class NoRaffleState extends State {
	Activity activity;
	
	//������
	public NoRaffleState(Activity activity) {
		this.activity = activity;
	}
	
	//��ǰ״̬���Կ۳�50���֣�Ȼ��״̬����Ϊ���Գ齱��״̬
	@Override
	public void deductMoney() {
		System.out.println("�۳�50���ֳɹ������Բ���齱�");
		//��Ҫ��״̬����Ϊ���Գ齱��״̬
		activity.setState(activity.getCanRaffleState());
	}

	//��ǰ״̬���ܳ齱
	@Override
	public boolean raffle() {
		System.out.println("��ʱ�����ܲ���齱�");
		return false;
	}

	//��ǰ״̬���ܷ��Ž�Ʒ
	@Override
	public void dispensePrize() {
		System.out.println("��ʱ�����ܹ����Ž�Ʒ");
		
	}

}
