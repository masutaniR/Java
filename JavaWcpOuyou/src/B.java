public class B {
    public static void main(String[] args) {
    	A b = new A() {
    		@Override
    		public String hello() {
    			return "Hello B!";
    		}
    	};
    	System.out.println(b.hello());
    }
}
