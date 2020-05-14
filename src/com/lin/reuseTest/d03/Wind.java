package com.lin.reuseTest.d03;

/**
 * @Description 
 * @ClassName {@link Wind}
 * @Author Lin.
 * @Date 2020年5月14日 下午9:46:27
 */
public class Wind extends Instrument {
	public static void main(String[] args) {
		Wind wind = new Wind();
		Instrument.tune(wind);
	}
}

/**
 * @Description 乐器
 * @ClassName {@link Instrument}
 * @Author Lin.
 * @Date 2020年5月14日 下午9:47:22
 */
class Instrument {
	
	public void play() {}
	
	/**
	 * @Description 奏乐
	 * @param: @param instrument      
	 * @return: void 
	 * @Author Lin.
	 * @Date 2020年5月14日 下午9:47:35
	 */
	static void tune(Instrument instrument) {
		instrument.play();
	}
}
