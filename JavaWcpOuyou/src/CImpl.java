public class CImpl {
    public static void main(String[] args) {
    	C c = new C() {
    		@Override
    		public String hello() {
    			return "Hello C!";
    		}
    	};
    	System.out.println(c.hello());
    }
}
