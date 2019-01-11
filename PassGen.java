import java.util.List;

public interface PassGen {

    int getPassLenght();

    void setPassLenght(int passLenght);

    int getPassCount();

    void setPassCount(int passCount);

    void generatePass();

    List<String> getPass();
}
