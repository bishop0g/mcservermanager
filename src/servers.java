// Containers for server management

abstract class ServerTemplate {
    // SUPERCLASS: Represents generated server instance's folder contents and management of .jar runtime
}

final class JavaServer extends ServerTemplate {
    // SUBCLASS: Vanilla Java Minecraft
}

final class JavaModdedServer extends ServerTemplate {
    // SUBCLASS: Java Server with Fabric mod framework
}

final class BedrockServer extends ServerTemplate {
    // SUBCLASS: Vanilla Bedrock Server
    // TODO: Check host architecture before initializing; if is Linux AND is not Ubuntu.version >= 18, abort due to being unsupported by Microsoft
}

final class BridgeServer extends ServerTemplate {
    // SUBCLASS: Java Server with GeyserMC/Floodgate bridge for Java/Bedrock crossover
}
