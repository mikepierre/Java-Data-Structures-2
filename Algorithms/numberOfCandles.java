import java.util.ArrayList;
import java.util.List;

public class numberOfCandles {

	public static void main(String[] args) {
		int[] NumberOfCandles = {0,1,2,0,0,1,2,1,0};
		HowManyCandles(NumberOfCandles);
	}
/*
Kripple is turning N years old! Therefore, he has N candles of various heights on his cake I, and candle has height I. Because the taller candles tower over the shorter ones, Kripple can only blow out the tallest candles.

Given the  Height (I) for each individual candle, find and print the number of candles he can successfully blow out.

Input: The first line contains a single integer, N , denoting the number of candles on the cake.
The second line contains N space-separated integers, where each integer I describes the height of candle I.
*/
	public static List HowManyCandles(int[] N){
		int max = 0;
		List<Integer> I = new ArrayList<Integer>();
		for(int i = 0; i < N.length; i++){
			if(N[i] <= max){
				I.add(N[i]);
			}
		}
		return I;
	}
