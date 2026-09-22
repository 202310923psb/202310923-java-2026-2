import java.util.Scanner;

class Student {
    int studentNum;
    String name;
    String major;
    int phoneNum;

    void setMajor(String m) { major = m; }
    void setStudentNum(int n) { studentNum = n; }
    void setName(String n) { name = n; }
    void setPhoneNum(int p) { phoneNum = p; }

    String getName() { return name; }
    String getMajor() { return major; }
    int getStudentNum() { return studentNum; }
    String getPhoneNum() {
        String sPhoneNum = Integer.toString(phoneNum);
        sPhoneNum = " 0" + sPhoneNum.substring(0, 2) + "-" + sPhoneNum.substring(2, 6) + "-" + sPhoneNum.substring(6, 10);
        return sPhoneNum; }

    void showInfo() {
        String sPhoneNum = Integer.toString(phoneNum);
        System.out.println(studentNum + " " + name + " " + major + getPhoneNum());
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        Student[] sArr = { s1, s2, s3 };

        for (int i = 0; i < 3; i++) {
            System.out.printf("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            sArr[i].setStudentNum(sc.nextInt());
            sArr[i].setName(sc.next());
            sArr[i].setMajor(sc.next());
            sArr[i].setPhoneNum(sc.nextInt());
        }

        System.out.println();
        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");

        for (int i = 0; i < 3; i++) {
            System.out.printf("%d번째 학생: ", (i + 1));
            sArr[i].showInfo();
            System.out.println((i + 1) + "번째 학생: " + sArr[i].getStudentNum() + " " + sArr[i].getName() + " " + sArr[i].getMajor() + sArr[i].getPhoneNum());
        }
    }
}
