/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThread extends Thread{
    
	private Integer a;
	private Integer b;
	
	public CountThread (Integer A,Integer B) {
		a=A;
		b=B;
	}
	@Override
	public void run() {
		while (a<b) {
			System.out.println(a);
			a++;
		}
	}

}
