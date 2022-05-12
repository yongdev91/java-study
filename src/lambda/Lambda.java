package lambda;

/*
람다식
- 함수(메서드)를 간단한 식으로 표현하는 것
- 익명함수(이름이 없는 함수)
 */
public class Lambda {
    public static void main(String[] args) {
//        Object obj = (a, b) -> a > b ? a : b;
        Object obj = new Object() {
            int max(int a, int b) {
                return a > b ? a : b;
            }
        };

        int value = obj.max(3, 5); // 함수형 인터페이스
    }

    /** 람다식 작성하기*/
    // 1. 메서드의 이름과 반환타입을 제거하고 '->'를 블록({})앞에 추가한다.
    int max(int a, int b) {
        return a > b ? a : b;
    }

    /*
    (int a, int b) -> {
        return a > b ? a : b;
    }
    */


    // 2. 반환값이 있는 경우 식이나 값만 적고 return문 생략 가능
    /*
    (int a, int b) -> {
        return a > b ? a : b;
    }

    (int a, int b) -> a > b ? a : b
     */

    // 3. 함수의 매개변수가 추론 가능하면 생략 가능
    /*
    (int a, int b) -> a > b ? a : b

    (a, b) -> a > b ? a : b
    */

    /** 주의사항*/
    // 1. 매개변수가 하나인 경우 괄호 생략 가능
    /*
    (a) -> a * a
    a -> a * a

    // 2. 블록 안의 문장이 하나인 경우 괄호{} 생략 가능
    (int i) -> {
        System.out.println(i);
    }

    (int i) -> System.out.println(i)
     */
}
