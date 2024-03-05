package class1;

public class ClassStart1 {

    public static void main(String[] args) {

        String[] username = {"주수영", "홍길동", "둘리", "길동이"};
        int[] ages = {33, 41, 6, 15};
        int[] grade = {100, 90, 90, 10};

        for (int i = 0; i < username.length; i++) {
            System.out.println("이름 : " + username[i] + " 나이 : " + ages[i] + " 성적 : " + grade[i]);
        }

    }
}
