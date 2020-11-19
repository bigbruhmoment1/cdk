# Crash Development Kit (CDK)

## Run all tests using exampleMod2!

# 1. 

Debug Minecraft Client, Observe everything works. Use a before launch configuration of debugMC from gradle. (ugly hack to get resources loaded, not sure of a better way)

# 2. 

Rename mod in run/mods folder to remove .disabled. This is the same mod with the package renamed to com.example.examplemod1. Source included in case you would like to compile yourself. Observe game crash due to inability to find field. Rename examplemod1 to disable it again.


# 3.

Modify the task devMCJar and uncomment line 101. Comment line 102-105. Launch minecraft again. This will copy over a production jar with SRG obfuscated classes. Observe crash again.

# 4.

Rerun steps 2 and 3, but on line 50 of build.gradle, replace `org.spongepowered:mixin:0.8.2` with `org.spongepowered:mixin:0.7.11-SNAPSHOT`.
Observe everything functioning as expected

```
[main/INFO] [minecraft/Minecraft]: Example2 Mixin injected!
[main/INFO] [minecraft/Minecraft]: Example1 Mixin injected!
```

# Notes:

Sometimes the mod itself won't get loaded in. Likely because something went wrong with the ugly resources hack. Just launch it again.

P.S.
If there's a better way to fix the ugly resources hack, please let me know!
