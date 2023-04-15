public class StringAndPrimitiveVariable {
    public static void main(String[] args) {
        // 다음 문장을 살펴보자
        int num1 = 12;
        int num2 = 34;
        System.out.println("출력 결과 : " + num1 + num2);
        // 해당 문장은 기초 자료형 변수인 num1, num2 을 println() 메소드를 통해
        // 화면 상에 표출하는 문장이다
        // 하지만 6번 라인에서 "출력 결과 : " 라는 String 객체가 num1 변수를 먼저 만나게 되어
        // num1 은 문자열로 변환되어 "출력 결과 : " 와 결합된다

        // 이는 자바에서는 문자열과 기초 자료형 변수를 결합하게 되면 자동적으로
        // 기초 자료형으로 문자열을 변환하기 때문이다

        // 따라서 "출력 결과 : (num1의 값)" 이라는 문자열이 되버리고, 이 문자열은
        // 또 다시 num2 의 기초 자료형 변수를 만나게 되어 또 다시 결합하게 된다

        // 결과적으로 해당 문장은 "출력 결과 : (num1의 값)(num2의 값)" 이라는 문자열을
        // 출력하는 기능을 갖게 된다 > 결과 : 출력결과 : 1234


        // 다음 문장을 보도록 하자
        String s1 = "홍길동";
        String s2 = new String("홍길동");
        System.out.println(s1==s2);

        // 위 문장에서는 두 문자열 객체 s1 와 s2 을 비교하여 boolean 결과 값을 얻는 문장이다
        // 문자열 객체는 값을 비교할 때는 참조 변수와 같은 성질을 띄고 있기 떄문에
        // 각각의 문자열 객체가 가리키는 주소 값을 비교하므로
        // s1 와 s2 가 각각 가리키는 주소 값을 확인해야 한다

        // s1 은 문자열 상수("")로 표기하여 객체를 생성했고
        // s2 는 new 연산자를 통해 선언과 동시에 초기화 하였다

        // 이렇게 함으로써 히프 메모리에 문자열 상수로 표기한 s1 의 객체(주소값)과
        // new 연산자를 통해 선언한 s2 의 객체(주소값) 은 다르다는 것을 알 수 있다
        // 따라서 두 객체를 비교하면 다른 주소 값을 가지므로 결과 : false

        // 추가로, 문자열 상수("")로 s2 를 "홍길동" 으로 정의하게 된다면
        // 자바 시스템에서 이미 문자열 상수로 선언한 s1 의 값과 같으므로
        // s2 에 해당하는 새 주소값을 할당하지 않고 기존의 s1 의 주소값을 가리키게 설정하므로
        // 문자열 상수로 선언했는가, new 연산자로 String 객체를 생성했는지를 잘 판별해야한다
    }
}