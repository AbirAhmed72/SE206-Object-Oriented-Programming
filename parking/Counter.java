package parking;
/*
Counter Class writen to check number count
@author Saeed Siddik
 */
public class Counter {
    private int number = 0;
    public int reused = 0;

    public void add(){
        number = number+1;
    }

    public void initialize(){
        number = 0;
        reused = reused+1;
    }

    public int getNumber(){
        return this.number;
    }
}
