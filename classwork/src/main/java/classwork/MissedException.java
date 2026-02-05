package classwork;

public class MissedException extends Exception {
    public MissedException(String msg) {
        super(msg);

        // wasting time to punish the user
        for(int i = 0; i < 5432; i++) {
            for(int j = 0; j < 1234; j++) {
                for(int k = 0; k < 1234; k++) {
                    int iLoveMath = i * j + k;
                    if(iLoveMath % 3 == 0) {
                        // i hate threeven numbers
                        iLoveMath++;
                    }
                }
            }
        }
    }
}
