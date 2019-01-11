import java.lang.String;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        if(args.length != 2){
            System.out.println("error in arguments");
            return;
        }
        int psslength = 0;
        int pssccount =	0;
        for(int i = 0; i<args.length; ++i){
            String arg = args[i];
            String [] tokens = arg.split("=");
            if(tokens[0].equals("--psslength"))
                psslength = Integer.parseInt(tokens[1]);
            else if(tokens[0].equals("--pssccount"))
                pssccount = Integer.parseInt(tokens[1]);
        }

        System.out.format("passl=%d, passc=%d\n", psslength, pssccount);

        PassGen pg = new MyPassGen( psslength, pssccount);

        pg.generatePass();

        List<String> passwords = pg.getPass();

        for(int i=0;i<passwords.size();i++){
            System.out.println(passwords.get(i));
        }


    }
}
