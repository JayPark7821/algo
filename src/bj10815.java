import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

/**
 * 백준 10815
 * 숫자 카드는 정수 하나가 적혀져 있는 카드이다. 상근이는 숫자 카드 N개를 가지고 있다.
 * 정수 M개가 주어졌을 때, 이 수가 적혀있는 숫자 카드를 상근이가 가지고 있는지 아닌지를 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 1. 첫째 줄에 상근이가 가지고 있는 숫자 카드의 개수 N(1 ≤ N ≤ 500,000)이 주어진다.
 *
 * 2. 둘째 줄에는 상근이가 가지고 있는 숫자 카드에 적혀있는 정수가 주어진다.
 *      (-10,000,000 <= 카드숫자 <= 10,000,000  , 각 카드 숫자는 unique )
 *
 * 3. 셋째 줄에는 M(1 ≤ M ≤ 500,000)이 주어진다.
 *
 * 4. 넷째 줄에는 상근이가 가지고 있는 숫자 카드인지 아닌지를 구해야 할 M개의 정수가 주어진다 (공백으로 구분 ,-10,000,000 <= 카드숫자 <= 10,000,000  )
 *
 * key binarySearch
 */

public class bj10815 {

    public static void main(String[]args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // 상근이가 가지고 있는 카드 수 n
        int n = Integer.parseInt(reader.readLine());
        // 상근이가 가지고 있는 카드들 String
        String[] cardsInString = (reader.readLine()).split(" ");
        // 상근이가 가지고 있는 카드들 정렬 int
        Integer[] cards = Stream.of(cardsInString).mapToInt(Integer::parseInt).sorted().boxed().toArray(Integer[]::new);

//        for (Integer card : cards) {
//            System.out.println("card = " + card);
//        }



    }

}


