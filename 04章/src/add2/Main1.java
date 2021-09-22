package add2;

public class Main1 {

	public static void main(String[] args) {
		String[] name = {"山田", "佐々木", "鈴木", "田中", "高橋"};
		int[] age = {23, 35, 52, 33, 47};
		String[] city = {"東京", "神奈川", "埼玉", "東京", "神奈川"};

		System.out.println("氏名  " + "年齢  " + "住所");
		System.out.println(".......................");
		for(int i =0; i < name.length; i++) {
			if(String.name[1].length() == 3) {
				System.out.println(name[i] + age[i] + city[i]);
			}else {
				System.out.println(name[i]+"  " + age[i]+"  " + city[i]);
			}
			}
	}

}
