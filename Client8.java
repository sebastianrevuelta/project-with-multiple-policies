public class Client3 {
	public void connect() {
        // ruleid: system-setproperty-hardcoded-secret
        System.setProperty("javax.net.ssl.keyStorePassword", "password");
        // ruleid: system-setproperty-hardcoded-secret
        System.setProperty("javax.net.ssl.trustStorePassword", "password");

        // ok: system-setproperty-hardcoded-secret
        System.setProperty("javax.net.ssl.trustStorePassword", config);
        // ok: system-setproperty-hardcoded-secret
        System.setProperty("javax.net.ssl.keyStorePassword", config);
	}

}
