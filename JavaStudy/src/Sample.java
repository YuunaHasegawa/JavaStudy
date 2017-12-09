
public class Sample {

	public static void main(String[] args) {
		numberSample();
		characterSample();
		booleanSample();
	}

	/**
	 * 数字関連の勉強
	 */
	public static void numberSample() {
		// shortは[16ビット整数 -32768～32767]
		short s1 = 8;
		short s2 = 2;

		// intは[32ビット整数 -2147483648～2147483647]
		int i1 = 20;
		int i2 = 10;

		// longは[64ビット整数 -9223372036854775808～9223372036854775807]
		long l1 = 200;
		long l2 = 100;

		// floatは[32ビット単精度浮動小数点数]
		float f1 = 0.1f;
		float f2 = 0.2f;

		// doubleは[64ビット倍精度浮動小数点数]
		double d1 = 0.01;
		double d2 = 0.02;

		System.out.println("[shortの計算]");
		System.out.println(" s1 + s2 = " + (s1 + s2));
		System.out.println(" s1 - s2 = " + (s1 - s2));
		System.out.println(" s1 * s2 = " + (s1 * s2));
		System.out.println(" s1 / s2 = " + (s1 / s2));
		System.out.println();

		System.out.println("[intの計算]");
		System.out.println(" i1 + i2 = " + (i1 + i2));
		System.out.println(" i1 - i2 = " + (i1 - i2));
		System.out.println(" i1 * i2 = " + (i1 * i2));
		System.out.println(" i1 / i2 = " + (i1 / i2));
		System.out.println();

		System.out.println("[longの計算]");
		System.out.println(" l1 + l2 = " + (l1 + l2));
		System.out.println(" l1 - l2 = " + (l1 - l2));
		System.out.println(" l1 * l2 = " + (l1 * l2));
		System.out.println(" l1 / l2 = " + (l1 / l2));
		System.out.println();

		System.out.println("[floatの計算]");
		System.out.println(" f1 + f2 = " + (f1 + f2));
		System.out.println(" f1 - f2 = " + (f1 - f2));
		System.out.println(" f1 * f2 = " + (f1 * f2));
		System.out.println(" f1 / f2 = " + (f1 / f2));
		System.out.println();

		System.out.println("[doubleの計算]");
		System.out.println(" d1 + d2 = " + (d1 + d2));
		System.out.println(" d1 - d2 = " + (d1 - d2));
		System.out.println(" d1 * d2 = " + (d1 * d2));
		System.out.println(" d1 / d2 = " + (d1 / d2));
		System.out.println();
	}

	/**
	 * 文字、文字列の勉強
	 */
	public static void characterSample() {
		// 配列の定義方法の確認
		char[] cList = {'a','b','c'};

		System.out.println("[charと配列]");
		// 配列を順に出力する
		for (int i = 0; i < cList.length; i++) {
			System.out.println(" cList[" + i + "] = " + cList[i]);
		}
		System.out.println();

		// Stringの確認
		String s1 = "あいうえお";
		String s2 = "かきくけこ";

		System.out.println("[文字列の結合]");
		System.out.println(" " + s1 + "\n " + s2);
		System.out.println();
	}

	/**
	 * if, booleanの勉強
	 */
	public static void booleanSample() {
		int i1 = 10, i2 = 20;
		System.out.println("[判定の確認]");
		System.out.println(" i1 = " + i1 + ", i2 = " + i2);

		boolean b1 = i1 < i2;
		boolean b2 = i2 < i1;
		boolean b3 = i1 == i2;

		System.out.print(" i1 < i2  : ");
		if(b1) {
			System.out.println(" true");
		}else {
			System.out.println(" false");
		}

		System.out.print(" i2 < i1  : ");
		if(b2) {
			System.out.println(" true");
		}else {
			System.out.println(" false");
		}

		System.out.print(" i1 == i2 : ");
		if(b3) {
			System.out.println(" true");
		}else {
			System.out.println(" false");
		}


	}
}
