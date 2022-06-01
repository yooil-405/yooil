import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// 정렬된 map
// TreeMap
// comparator사용
public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(num == 0) {
				if(pq.size() == 0) {
					
					sb.append(0).append('\n');
				} else {
					
					sb.append(pq.poll()).append('\n');
				}
			} else {
				
				pq.offer(num);
			}
		}
		
		System.out.println(sb);
	}
}