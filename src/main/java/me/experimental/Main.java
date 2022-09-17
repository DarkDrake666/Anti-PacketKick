package me.experimental;
/*
    
    This file is licensed by ExperimentalX. Unless you have
    specific permission from ExperimentalX, you are not
    permitted to touch this file at all. It is open
    sourced so you can see how I did it, not for
    you to copy off of it.
    
    Please. If you are trying to learn, don't copy off of
    other people, see what they did, and try to do it better.
    See if you can figure out why it works the way it does.
    
    This was written by ExperimentalX on 9/17/2022 for
    AntiChatPacketKick
    
*/

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class Main extends JavaPlugin {
    public void onEnable(){
        Logger l = getLogger();
        l.severe("If you find a bug,");
        l.severe("please report it here:");
        l.severe("https://discord.gg/VBvKEVjBKF");
        getServer().getPluginManager().registerEvents(new AntiKick(), this);
    }
    public void onDisable(){
        Logger l = getLogger();
        l.severe("If you find a bug,");
        l.severe("please report it here:");
        l.severe("https://discord.gg/VBvKEVjBKF");
    }
}
