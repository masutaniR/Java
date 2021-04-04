public class Chapter05 {
	public static void main(String[] args) {
		long long1 = 3377889911000L;
		double double1 = 444.222d;
		boolean boo1 = true;
		System.out.println(long1);
		System.out.println(double1);
		System.out.println(boo1);

		Float float1 = Float.valueOf(12.09f);
		Integer int1 = Integer.valueOf(5536547);
		Character char1 = Character.valueOf('お');
		System.out.println(float1);
		System.out.println(int1);
		System.out.println(char1);

		int[] array1 = new int[5];
		array1[0] = 10;
		array1[1] = 20;
		array1[2] = 30;
		array1[3] = 40;
		array1[4] = 50;
		System.out.println(array1[3]);
	}

}
