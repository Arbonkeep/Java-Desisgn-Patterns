package com.arbonkeep.state;

public class DespenseState extends State {
	Activity activity;
	
	//��ʼ��ʱ���������������Ž�Ʒ��ı�״̬
	public DespenseState(Activity activity) {
		this.activity = activity;
	}
		
	@Override
	public void deductMoney() {
		System.out.println("���ܿ۳�����");
		
	}

	@Override
	public boolean raffle() {
		System.out.println("���ܳ齱");
		return false;
	}

	//���Ž�Ʒ
	@Override
	public void dispensePrize() {
		if(activity.getCount() > 0) {
			System.out.println("��ϲ�н���");
			//�ı�״̬Ϊ���ܳ齱
			activity.setState(activity.getNoRaffleState());
		}else {
			//�ı�״̬Ϊ��Ʒ������ϣ�����Ͳ��ܼ����齱
			System.out.println("���ź�����Ʒ������");
			activity.setState(activity.getDepenseOutState());
		}
		
	}

}
