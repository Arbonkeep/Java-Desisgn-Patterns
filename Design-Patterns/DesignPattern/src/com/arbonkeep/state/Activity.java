package com.arbonkeep.state;

public class Activity {
	//��ʾ��ǰ�״̬
	State state = null;
	//��ʾ��Ʒ����
	int count = 0;
	
	//�ĸ����Ա�ʾ����״̬
	State noRaffleState = new NoRaffleState(this);
	State canRaffleState = new CanRaffleState(this);
	State depenseState = new DespenseState(this);
	State depenseOutState = new DespenseOutState(this);
	
	//������
	//��ʼ����ǰ״̬Ϊ���ܳ齱������ʼ����Ʒ����
	public Activity(int count) {
		this.state = getNoRaffleState();
		this.count = count;
	}
	
	//�۷�,���õ�ǰ״̬��debuctMoney
	public void debuctMoney() {
		state.deductMoney();
	}
	
	//�齱
	public void raffle() {
		//�����ǰ״̬�ǳ齱�ɹ�
		if(state.raffle()) {
			//��ȡ��Ʒ
			state.dispensePrize();
		}
	}
	
	public State getState() {
		return state;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	//ÿ��ȡһ�ν�Ʒcount--
	public int getCount() {
		int curCount = count;//��¼��ǰ��Ʒ����
		count--;
		return curCount;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public State getNoRaffleState() {
		return noRaffleState;
	}

	public State getCanRaffleState() {
		return canRaffleState;
	}

	public void setCanRaffleState(State canRaffleState) {
		this.canRaffleState = canRaffleState;
	}

	public State getDepenseState() {
		return depenseState;
	}

	public void setDepenseState(State depenseState) {
		this.depenseState = depenseState;
	}

	public State getDepenseOutState() {
		return depenseOutState;
	}

	public void setDepenseOutState(State depenseOutState) {
		this.depenseOutState = depenseOutState;
	}

	public void setNoRaffleState(State noRaffleState) {
		this.noRaffleState = noRaffleState;
	}
	
	
	
	
	
}
