package com.arbonkeep.state;

import java.util.Random;

//�ܹ��齱״̬
public class CanRaffleState extends State {
	Activity activity;
	
	//������
	public CanRaffleState(Activity activity) {
		this.activity = activity;
	}
	
	//��ǰ״̬�Ѿ��۹��˻���	
	@Override
	public void deductMoney() {
		System.out.println("֮ǰ�Ѿ��۹�������");
		
	}

	//��ǰ״̬��Ҫ���г齱�������齱�ɹ��ͽ�״̬����Ϊ���Ž�Ʒ���߲��ܳ齱��״̬��
	@Override
	public boolean raffle() {
		System.out.println("��ʼ�齱�����Ե�");
		Random random = new Random();//�������0��9����
		int num = random.nextInt(10);
		if(num == 3) {
			//�齱�ɹ���״̬����Ϊ���Ž�Ʒ
			activity.setState(activity.getDepenseState());
			return true;
		}else {
			System.out.println("���ź�û�г��н�Ʒ");
			//�齱ʧ�ܽ�״̬����Ϊ���ܳ齱
			activity.setState(activity.getNoRaffleState());
			return false;
		}
		
	}
	//��ǰ״̬���ܷ��Ž�Ʒ
	@Override
	public void dispensePrize() {
		System.out.println("û�н������ܹ����Ž�Ʒ");
		
	}

}
