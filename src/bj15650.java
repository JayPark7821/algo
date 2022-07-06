import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 15650
 *
 * 문제 - 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
 *        1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
 *        고른 수열은 오름차순 이어야 한다.
 *
 * 입력 - 첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)
 *
 * 출력 - 한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.
 *        수열은 사전 순으로 증가하는 순서로 출력해야 한다.
 *

 */

public class bj15650 {

    // 길이가 M인 수열
    public static int[] arr;
    // DFS에서 이미 방문한 노드인지 저장
    public static boolean[] visited;
    public static StringBuilder toPrint = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();
        StringTokenizer st = new StringTokenizer(input);

        // 1부터 N까지 자연수
        int N = Integer.parseInt(st.nextToken());
        visited = new boolean[N];

        //길이가 M인 수열
        int M = Integer.parseInt(st.nextToken());
        arr = new int[M];


        dfs(N, M, 0);

        System.out.println( toPrint);
    }


    public static void dfs(int N, int M, int depth ) {
        if (depth == M) {
            for (int i : arr) {
                toPrint.append(i).append(' ');
            }
            toPrint.append('\n');
            return;
        }
        // 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
        // 1~N 까지 자연수
        for(int i = 0 ; i < N ; i++){
            // 해당 노드를 방문했는지 check
            if(!visited[i]){
                // 방문하지 않았으면 방문하고 visited에 ture
                visited[i] = true;
                // 방문하지 않은 노드를 방문하러 드러왔으니 depth추가 + 1
                if(depth == 0){
                    arr[depth] = i + 1;
                }else{
                    if( arr[depth - 1] < i + 1){
                        arr[depth] = i + 1;
                    }else{

                    }
                }

                dfs(N,M,depth+1 );

                visited[i] = false;
            }
        }

    }
}
