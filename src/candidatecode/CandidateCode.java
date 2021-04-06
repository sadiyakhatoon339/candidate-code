/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidatecode;

/**
 *
 * @author DELL
 */

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {
      BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
      int T=Integer.parseInt(br.readLine());
      for(int i=0;i<T;i++)
      {
      StringTokenizer tk=new StringTokenizer(br.readLine());
      int P=Integer.parseInt(tk.nextToken());
      int N=Integer.parseInt(tk.nextToken());
      int D=Integer.parseInt(tk.nextToken());
      int s;
      s=(D-1)*N+P;
      System.out.println(s);
      
      }
	//Write code here

   }
}
