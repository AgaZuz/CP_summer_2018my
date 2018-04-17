package pl.waw.sgh;

import java.util.Map;

public class FileOps {

    public static void main(String[] args) {

        String curDir = System.getProperty("user.home");
        String tmpDir = System.getProperty("java.io.tmpdir");
        System.out.println("user.dir" + curDir);
        System.out.println("TMP: " + tmpDir);

        // -Dprubac.myprop=Hello

        String mySysProp = System.getProperty("prubac.myprop");
        System.out.println("myprop: " + mySysProp);

        String user = System.getenv("USERNAME");
        Map<String, String> env = System.getenv();
        System.out.println(user);

        System.out.println(env.get("HOMEPATH"));


        System.out.println(curDir);
    }
}