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
 *
 * input
 * 5
 * 6 3 2 10 -10
 * 8
 * 10 9 -5 2 3 4 5 -10
 * output
 * 1 0 0 1 1 0 0 1
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

        // 상근이 카드와 비교해볼 카드 숫자
        int m = Integer.parseInt(reader.readLine());
        // 상근이가 가지고 있는 카드와 비교할 대상 카드들 String
        String[] compareCardsInString = (reader.readLine()).split(" ");
        // 비교할 대상 카드들 int
        Integer[] compareCards = Stream.of(compareCardsInString).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);

        if( n == cards.length && m == compareCards.length) {
            for (Integer compareCard : compareCards) {
                int startIndex = 0;
                int endIndex = cards.length - 1;

                while(startIndex <= endIndex) {
                    int middleIndex = (startIndex + endIndex) / 2;
                    if (cards[middleIndex].equals(compareCard) ) {
                        System.out.print("1 ");
                        break;
                    }else if(compareCard < cards[middleIndex] ){
                        endIndex = middleIndex - 1;
                    }else if(cards[middleIndex] < compareCard){
                        startIndex = middleIndex + 1;
                    }else{
                        System.out.print("0 ");
                        break;
                    }
                    if(startIndex > endIndex){
                        System.out.print("0 ");
                        break;
                    }
                }
            }
        }
    }
}

