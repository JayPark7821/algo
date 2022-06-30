import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 15649
 *
 * 문제 - 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
 *        1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
 *
 * 입력 - 첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)
 *
 * 출력 - 한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.
 *        수열은 사전 순으로 증가하는 순서로 출력해야 한다.
 *
 * key - backtracking
 *      BackTracking 되추적
 *      노드의 유망성을 판단 -> 해당 노드가 유망하지 않다면 부모 노드로 돌아가 해당노드를 제외한 다른 자식 노드를 탐색하는 방법
 *      결론적으로 모든 노드를 탐색 하지만 그중 유망한 경우의 수만 찾아보는 방법이다.
 *
 *      DFS ( Depth - First - Seach)
 *      깊이 우선 탐색
 *          2 -- 1------3 ------5
 *          /\   /              /\
 *         /  \ /              4--7
 *        6    8
 *
 *      1번 노드부터 탐색 시작 오름차순 탐색
 *    - 1번 노드 탐색 ( 1 )
 *    - 1번의 자식 노드는 2,3 인데 오름차순 탐색이니 2번 탐색 ( 1 -> 2 )
 *    - 2번의 자식 노드는 6,8 인데 오름차순 탐색이니 6번 탐색 ( 1 -> 2 -> 6)
 *    - 6번의 자식 노드는 없으니 6번을 호출한 부모 노드 2번 노드로 돌아감
 *    - 2번 노드의 자식중 탐색한적이 없는 8번 노드 탐색 ( 1 -> 2 -> 6 -> 8 )
 *    - 8번 노드의 자식 노드가 없으니 8번을 호출한 2번노드로 돌아감
 *    - 2번 노드의 자식중에 탐색하지 않은 노드가 없으니 2번을 호출했던 1번노드로 돌아감
 *    - 1번 노드의 자식노드중 탐색하지 않은 3번 노드탐색  ( 1 -> 2 -> 6 -> 8 -> 3 )
 *    - 3번 노드의 자식 노드는 5번 노드 1개이니 5번노드 탐색 ( 1 -> 2 -> 6 -> 8 -> 3 -> 5 )
 *    - 5번 노드의 자식 노드는 4, 7 인데 오름차순 탐색이니 4번노드 탐색 ( 1 -> 2 -> 6 -> 8 -> 3 -> 5 -> 4 )
 *    - 4번 노드의 자식 노드 7번 탐색 ( 1 -> 2 -> 6 -> 8 -> 3 -> 5 -> 4 -> 7 )
 *    - 탐색 완료
 *
 *    예제 입력에서
 *    3 1 입력 -> 1 2 3
 *    4 2 입력 -> 1 2
 *             , 1 3
 *             , 1 4
 *             , 2 1
 *             , 2 3
 *                .
 *                .
 *                .
 *                .
 *
 *
 */

public class bj15649 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        /**
         * StringTokenizer 클래스
         *  - tring클래스에서 제공하는 split()메소드와 같은 기능을 하는 클래스로,
         *  - 생성 시 전달받은 문자열을 구분자로 나누어 각 토큰에 저장한다.
         *
         *  Params:
         *   str – a string to be parsed.
         *   delim – the delimiters.
         *   returnDelims – flag indicating whether to return the delimiters as tokens.
         *  Throws:
         *      NullPointerException – if str is null
         * public StringTokenizer(String str, String delim, boolean returnDelims) {
         * }
         */

        String input = reader.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


    }

    public static
}
