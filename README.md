# mcservermanager
Java-based management software for Minecraft Java and Bedrock Servers.

# Disclaimers
1. This Program relies on third-party server (required) and mod (optional) Files. The use of these Files within the Program is subject to the EULAs and associated licenses/restrictions of the Files and their respective owners.
2. The aforementioned Files can either be integrated "automatically" via included functions that retrieve Files directly from the public URLs listed in configs/mcm_configs.json, or "manually" by uploading required/desired files to /cache/. In either case, the User is responsible for verifying the authenticity of the Files in use; the Developer is not responsible for third-party hosted files.
3. Minecraft owned by Microsoft and Mojang. Contained files originating from Minecraft (namely configs/server_defaults/) are *publicly available configuration files* and inclusion is not intended as infringement of intellectual ownership.
4. Fabric and FabricAPI owned by modmuss50; references throughout.
5. Geyser and Floodgate owned by GeyserMC; references throughout.
6. Modrinth owned by Rinth, Inc.; references throughout.

## Project Folders
- **cache**: Default folder for server and mod downloads to be saved to/pulled from.
- **configs**: Contains mcm_config.json for program configs, and server_defaults subfolder with default Minecraft configs.
- **scripts**: Environment-specific supplementary scripts and files.
- **src**: Project source code (.java).
