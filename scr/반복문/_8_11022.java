// 문제 번호    11022
// 문제 이름    A+B - 8
// 문제 내용    A+B를 바로 위 문제보다 아름답게 출력하는 문제

package scr.반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _8_11022 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int t = Integer.parseInt(br.readLine());

    for (int i=1; i<=t; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());

      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      bw.write("Case #" + i + ": " + a + " + " + b + " = " + (a+b) + "\n");
    }

    br.close();
    bw.flush();
    bw.close();
  }
}
