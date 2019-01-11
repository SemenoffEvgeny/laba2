import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyPassGen implements PassGen {
    private int passLenght;
    private int passCount;
    private List<String> passwords = new ArrayList<String>();
    private String charCategories = "qwertyuiopasdfghjklzxcvbnm1234567890QWERTYUIOPASDFGHJKLZXCVBNM";


    public MyPassGen(int psslength, int pssccount) {
        this.passLenght = psslength;
        this.passCount = pssccount;
    }

    @Override
    public int getPassLenght(){
        return this.passLenght;
    };

    @Override
    public List<String> getPass(){

        return this.passwords;

    };

    @Override
    public void setPassLenght(int passLenght){
        this.passLenght = passLenght;
    };

    @Override
    public int getPassCount(){
        return this.passCount;
    };

    @Override
    public void setPassCount(int passCount){
        this.passCount = passCount;
    };

    @Override
    public void generatePass(){
        Random random = new Random(System.nanoTime());
        for (int i = 0; i < passCount; i++) {
            String pass = "";
            for (int j = 0; j < passLenght; j++){

                pass += (Character.toString(charCategories.charAt(random.nextInt(charCategories.length()))));
            }
            passwords.add( pass);
            pass = "";
        }

    }

}
