package trm.membership;

import trm.leadership.Clamps;

public class JoeyMousepad extends Clamps {
    public JoeyMousepad() {

    }

    public void overseeOperation(String operation) {
        System.out.println("Joey Mousepad is overseeing " + operation + ".");
    }

    public static int getProfitPercentValue() {
		return 10;
	}
}
