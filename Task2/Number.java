package Task2;

public class Number {
    private long number;

    public Number(long num) {
        this.number = num;
    }

    public int countDigits() {
    	  return String.valueOf(this.number).length();
    }
        
    }
