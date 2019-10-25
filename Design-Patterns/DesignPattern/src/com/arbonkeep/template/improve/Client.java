package com.arbonkeep.template.improve;

import com.arbonkeep.template.improve.PureSoyaMilk;

public class Client {
	public static void main(String[] args) {
		
		System.out.println("---------ÖÆ×÷ºÚ¶¹¶¹½¬ -----------------");
		SoyaMilk blackBeanSoyaMilk = new BlackBeanSoyaMilk();
		blackBeanSoyaMilk.make();
		
		System.out.println("---------ÖÆ×÷ºì¶¹¶¹½¬------------------");
		SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
		redBeanSoyaMilk.make();
		
		System.out.println("---------ÖÆ×÷´¿¶¹½¬------------------");
		SoyaMilk pureSoyaMilk = new PureSoyaMilk();
		pureSoyaMilk.make();
	}
}
