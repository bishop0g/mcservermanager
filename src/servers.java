// Containers for server management

abstract class ServerTemplate {

    // SUPERCLASS: Represents generated server instance's folder contents and management of .jar runtime
    String serverName;

    public void printName() {
        System.out.println("Server name: " + serverName);
    }
    /*
    public abstract void new(); // If existing server not found, generates new server
    public abstract void start(); // Starts server runtime (server.jar, server.exe, ./bedrock_server, etc.)
    public abstract void stop(); // Gracefully stops a running server runtime
    */
}

class BedrockServer extends ServerTemplate {
    // SUBCLASS: Vanilla Bedrock Server
    // TODO: Check host architecture before initializing; if is Linux AND is not Ubuntu.version >= 18, abort due to being unsupported
}

class JavaServer extends ServerTemplate {
    // SUBCLASS: Vanilla Java Minecraft
}

class FabricServer extends JavaServer {
    // SUBCLASS: Java Server with Fabric mod framework
}

class BridgeServer extends FabricServer {
    // SUBCLASS: Fabric Server with GeyserMC/Floodgate bridge for Java/Bedrock crossover
}
