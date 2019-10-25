package com.arbonkeep.template.improve;

public class PureSoyaMilk extends SoyaMilk{

	@Override
	public void addCondiments() {
		// 制作纯豆浆，；默认实现(空实现)
		
	}
	
	@Override
	public boolean isAddCondiments() {
		// 因为制作纯豆浆不需要添加原料，所以返回false
		return false;
	}

}
