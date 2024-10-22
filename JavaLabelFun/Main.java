import java.util.Scanner;
import java.io.StringReader;
import java.util.ArrayList;

public class Main{
	public static int gcd(int a, int b){
		if (a == 0) return b;
		return gcd(b%a, a);
	}

	public static int method(){
		Scanner s = new Scanner(System.in);
		StringReader in = new StringReader(s.nextLine());

		ArrayList<Integer> arr = new ArrayList<Integer>();
		int res = 0;
		label1:for (;;){
			int a,b;
			label5:for (;;){
				label4:for (;;){
					label2:for (;;){
						int i = 0, j = 0;
						label3:for (;;){
							try{
								j = in.read();
							}catch(Exception e){
								e.printStackTrace();
								System.exit(-1);
							}
							if (j == -1){
								if (i!=0){
									arr.add(i);
								}
								break label2;
							}
							if (j=='+') break label3;
							if (j < '0') break label1;
							if (j > '9') break label1;
							i *= 10;
							i += j-'0';
						}
						arr.add(i);
					}
					if (arr.get(0) != arr.size()-1) break label1;
					arr.remove(0);
					if (arr.size()<2) break label1;
					a = arr.get(0);
					b = arr.get(1);
					break label4;
				}
				int c = gcd(a, b);
				arr.remove(0);
				arr.remove(0);
				arr.add(c);
				res=c;
			}
		}
		return res;
	}

	public static void main(String[] args){
		int result = method(); // This gets the result of the method
		int target = 20; // This is the target output.

		System.out.println(result); // This prints out the result of the method
		if (result == target){ // This checks if the result is correct.
			System.out.println("The method gives the correct output! :)");
		}else {
			System.out.println("The method does not give the correct output. :(");
		}
	}
};
