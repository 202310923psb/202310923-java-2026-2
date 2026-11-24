import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;

class Homework9 {
    public static void main(String[] args) {
        Map<String, String> IDAndPass = new HashMap<String, String>();
        try {
            BufferedReader f = new BufferedReader(new FileReader("db.txt"));

            String line;

            while ((line = f.readLine()) != null) {
                String ID = line.trim();
                line = f.readLine();
                String Pass = line.trim();
                IDAndPass.put(ID, Pass);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }


        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            String input = sc.next();
            if (IDAndPass.containsKey(input.trim())) {
                System.out.print("password : ");
                String inPass = sc.next();
                if (IDAndPass.get(input).equals(inPass.trim())) {
                    System.out.println("id와 비밀번호가 일치합니다.");
                    break;
                }
                else {
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                    System.out.println();
                }
            }
            else {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                System.out.println();
            }
        } while(true);
    }
}
