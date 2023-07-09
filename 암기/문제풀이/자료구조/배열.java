package 문제풀이.자료구조;

public class 배열 {
    public static void main(String[] args) {

        // 배열 생성 방법
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = i;
        }
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = new int[]{1, 2, 3, 4, 5};


        // 배열 크기 (배열 크기는 ()가 없다 생각 하자)
        System.out.println("arr.length = " + arr.length);
        System.out.println();

        
        
        // 2차원 배열
        int N = 5;
        int M = 8;
        char[][] map = new char[N][M];

        String[] secondArr = {
                "....XXXX",
                "........",
                "XX.X.XX.",
                "........",
                "........"
        };

        for (int i = 0; i < N; i++) {
            map[i] = secondArr[i].toCharArray();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        // 2차원 배열을 돌려서 연산 or 출력 하려면 범위와 배열의 인덱스 모두 바꿔줘야 한다.
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(map[j][i]);
            }
            System.out.println();
        }
    }
}
