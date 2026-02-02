// Basic web scraper for downloading and managing selected server and mods.

abstract class Downloader {

    // Checks if page exists, accesses page, finds download URL, downloads target file to local cache directory
    String url;
}

final class MinecraftDownloader extends Downloader {
    // Connects to minecraft.net URLs, downloads specified server software
    // TODO: May have to split this to address Java-specific and Bedrock-specific pages?
}

final class ModrinthDownloader extends Downloader {
    // Connects to modrinth.com, downloads most recent stable version of specified mod's Fabric package
}

final class FabricDownloader extends Downloader {
    // Connects to fabricmc.net, downloads most recent stable version of Fabric Minecraft server launcher
}
