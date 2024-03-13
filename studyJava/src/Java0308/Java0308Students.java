package Java0308;

public class Java0308Students {
    public static void main(String[] args) {
        Students tom = new Students("Tom", 18, "Daejeon", "789456");
        Students steve = new Students("Steve", 25, "seoul", "123456");
        Students paul = new Students();

        paul.setName("Pual");
        paul.setAge(22);
        paul.setAddress("Incheon");

        tom.displayAll();
        steve.displayAll();
        paul.displayAll();

        System.out.println(tom.getPersonalNum());

        // 메소드 호출
        int[] numberList = {12, 34, 56, 32, 84, 99, 73, 69};
        int[] numberList2 = {13, 24, 35, 46, 57, 68};
        getSumAvg(numberList);
        getSumAvg(numberList2);
    }

    public static void getSumAvg(int[] numberList) {
        // 7. 아래 배열의 총합과 평균을 출력
        int sum = 0;
        for (int i = 0; i< numberList.length; i++) {
            sum += numberList[i];
        }

        double average = 0;
        average = (double)sum / (numberList.length);

        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + average);


    }
}
