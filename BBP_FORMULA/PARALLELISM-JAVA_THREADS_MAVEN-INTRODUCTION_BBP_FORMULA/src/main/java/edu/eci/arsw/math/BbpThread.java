package edu.eci.arsw.math;

public class BbpThread extends Thread {
	private byte[] respuesta;
    private int start;
    private int count;

    public BbpThread(int start, int count){
        this.start=start;
        this.count = count;

    }

    public byte[] getRespuesta(){
        return this.respuesta;
    }

    public void run(){
    
        respuesta = PiDigits.getDigits(start, count);
        
    }
}
