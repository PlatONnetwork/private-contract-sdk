
/*
 * may be some declaration here.
 */
package platon.mpc.proxy;

import com.google.protobuf.InvalidProtocolBufferException;
import net.platon.mpc.proxy.sdk.*;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.utils.Numeric;

import java.util.HashMap;


/**
 * Attention! This file was auto-generated, DO NOT EDIT!
 * More details ref "ProxyFoo-README.TXT".
 * <p>
 * DIGEST:
 * <p>
 * IR NAME: MPCFoo
 * IR HASH: b956c7bcc3b1319d2c403c92b351c427
 * <p>
 * IR FUNC HASH(MD5)                 IR FUNC NAME  IR FUNC PROT
 * 5990cb3c0972e165c2a3eb08cef90739  TestFooAdd01  TestFooAdd01(Foo,Foo)
 * 9f003479e99ad875b197c2645eafdf00  TestFooAdd02  TestFooAdd02(Foo,int)
 * 60e7e4c1bc1dbbeb5c9c976911cb93aa  TestFooAdd03  TestFooAdd03(int,int)
 * 913b11f78f06e4a1d58688a4190afade  TestBarAdd01  TestBarAdd01(Foo,Foo)
 * 45a8fbe6c1573f22b547cee7ee95aa93  TestBarAdd02  TestBarAdd02(Foo,int)
 * dd3d8b98f5a66406145926f17d0894b2  TestBarAdd03  TestBarAdd03(int,int)
 */

public class ProxyFoo extends ProxyClient {
    private String irHash = "b956c7bcc3b1319d2c403c92b351c427";
    private static String sIrHash;

    /**
     * Enum Method
     */
    public enum Method {
        Foo_TestFooAdd01_Foo_Foo,
        Foo_TestFooAdd02_Foo_int,
        Foo_TestFooAdd03_int_int,
        Foo_TestBarAdd01_Foo_Foo,
        Foo_TestBarAdd02_Foo_int,
        Foo_TestBarAdd03_int_int,
    }

    private static HashMap<Method, MethodInfo> mapMethodInfo = new HashMap<Method, MethodInfo>() {{
        put(Method.Foo_TestFooAdd01_Foo_Foo, new MethodInfo("TestFooAdd01", "TestFooAdd01(Foo,Foo)", "5990cb3c0972e165c2a3eb08cef90739", "", "Foo_TestFooAdd01_Foo_Foo"));
        put(Method.Foo_TestFooAdd02_Foo_int, new MethodInfo("TestFooAdd02", "TestFooAdd02(Foo,int)", "9f003479e99ad875b197c2645eafdf00", "", "Foo_TestFooAdd02_Foo_int"));
        put(Method.Foo_TestFooAdd03_int_int, new MethodInfo("TestFooAdd03", "TestFooAdd03(int,int)", "60e7e4c1bc1dbbeb5c9c976911cb93aa", "", "Foo_TestFooAdd03_int_int"));
        put(Method.Foo_TestBarAdd01_Foo_Foo, new MethodInfo("TestBarAdd01", "TestBarAdd01(Foo,Foo)", "913b11f78f06e4a1d58688a4190afade", "", "Foo_TestBarAdd01_Foo_Foo"));
        put(Method.Foo_TestBarAdd02_Foo_int, new MethodInfo("TestBarAdd02", "TestBarAdd02(Foo,int)", "45a8fbe6c1573f22b547cee7ee95aa93", "", "Foo_TestBarAdd02_Foo_int"));
        put(Method.Foo_TestBarAdd03_int_int, new MethodInfo("TestBarAdd03", "TestBarAdd03(int,int)", "dd3d8b98f5a66406145926f17d0894b2", "", "Foo_TestBarAdd03_int_int"));
    }};

    public static void showMethodMap() {
        System.out.println("==== Method Map Beg ====");
        for (MethodInfo info : mapMethodInfo.values()) {
            System.out.println(info.name + "    " + info.prot + "    " + info.enum_name);
        }
        System.out.println("==== Method Map End ====");
    }
    
    /**
     * Constructor
     */
    public ProxyFoo(Web3j web3j, Credentials credentials) {
        super(web3j, credentials);
    }

    public ProxyFoo(String url, Credentials credentials) {
        super(url, credentials);
    }

    public ProxyFoo(String url, String walletPath, String walletPass) {
        super(url, walletPath, walletPass);
    }

    public ProxyFoo(Web3j web3j, String walletPath, String walletPass) {
        super(web3j, walletPath, walletPass);
    }

    /**
     * Public method
     */
    public String startCalc(Method method) {
        return startCalc(method, 0);
    }

    public String startCalc(Method method, int retry) {
        if (!mapMethodInfo.containsKey(method)) {
            // no this method
            return null;
        }
        return startCalc(mapMethodInfo.get(method).name, retry);
    }

    /*
     * Below getXXX, if have, only for this mpc contract
     */
     
    /**
     * Get com.abc.multiproto.FooLite.Foo
     */
    public com.abc.multiproto.FooLite.Foo getFoo(byte[] val) {
        com.abc.multiproto.FooLite.Foo __Foo = null;
        try {
            __Foo = com.abc.multiproto.FooLite.Foo.parseFrom(ethECIES.Decrypt(priHexString, val));
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
        return __Foo;
    }

    public com.abc.multiproto.FooLite.Foo getFoo(String cipher) {
        return getFoo(Numeric.hexStringToByteArray(cipher));
    }

}
