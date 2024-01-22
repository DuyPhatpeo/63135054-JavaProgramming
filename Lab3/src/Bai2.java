public class Bai2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i<= 9;i++) {
			System.out.println("+-------------------------------+");
			System.out.printf("|\tBảng cửu chương "+i+"\t|\n");
			System.out.println("+-------------------------------+");
			for(int j = 1; j<=10;j++) {
				System.out.printf("\t   "+i+" x "+j+" = "+i*j+"\n");
			}
			System.out.println();
		}
	}

}
