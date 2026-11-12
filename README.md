# Evolution Boogaloo Minecraft Modpack Companion

Evolution Boogaloo is a lightweight Minecraft modpack companion and curated Forge modpack specification for Minecraft 1.20.1. It combines tech progression, exploration, adventure, magic, and superhero content inspired by Crazy Craft and FTB-style progression while keeping the required mod set smaller and more memory-conscious.

## Install

1. Install Minecraft Java Edition 1.20.1.
2. Install Forge 47.2.0 or another compatible Forge 47.x release.
3. Create a Forge 1.20.1 profile in your preferred modpack launcher.
4. Add the core mods and their required dependencies:
   - JEI
   - Jade
   - Embeddium
   - FerriteCore
   - ModernFix
   - Clumps
   - Sophisticated Backpacks
   - Create
   - Mekanism
   - Thermal Series
   - Applied Energistics 2
   - Powah
   - The Twilight Forest
   - Alex's Mobs
   - Nature's Compass
   - Waystones
   - Lootr
   - Ars Nouveau
   - Palladium
5. Add one Palladium superhero addon that explicitly supports Forge 1.20.1.
6. Optionally add Blue Skies and When Dungeons Arise after confirming their current Forge 1.20.1 files and dependencies.
7. Build the companion mod with Java 17 and Gradle by running `./gradlew build`.
8. Copy the generated JAR from `build/libs` into the profile's `mods` folder.
9. Allocate 6 GB of memory for the core pack. Use about 8 GB only when enabling the optional world-generation mods.

The project does not redistribute third-party mod JAR files. Add those mods through a launcher that resolves their dependencies, and verify that every selected file supports Forge 1.20.1.

## Use

1. Launch the Forge profile and create or open a world.
2. Use JEI to inspect recipes and dependencies.
3. Begin with exploration and Create-based mechanical automation.
4. Progress toward Thermal Series and Powah for midgame utility.
5. Use Mekanism and Applied Energistics 2 for advanced processing, automation, and storage.
6. Explore The Twilight Forest and creature-filled areas from Alex's Mobs.
7. Use Waystones, Nature's Compass, Lootr, and optional structure or dimension mods to support exploration.
8. Progress through Ars Nouveau for magic-focused gameplay.
9. Treat Palladium superhero abilities and high-tier machines as mid-to-late-game goals.
10. Run `/fusionfrontier guide` to display the progression and balance guide.
11. Run `/fusionfrontier about` to display companion mod and version information.

For multiplayer, install the same gameplay mods on the server and clients. Keep client-only performance mods on clients unless their project pages state that they support server installation.

---

More Minecraft mod projects by EnderDevelopment: https://github.com/EnderDevelopment

Project page: https://dash.enderdevelopment.com/community/6cc1efbc-999e-4558-af57-0beb0c7a6868?utm_source=github&utm_medium=readme&utm_campaign=auto_publish&utm_content=6cc1efbc-999e-4558-af57-0beb0c7a6868
