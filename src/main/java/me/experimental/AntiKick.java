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

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerKickEvent;

public class AntiKick implements Listener {
    @EventHandler
    public void onKick(PlayerKickEvent e){
        String reason = e.getReason();
        if(reason.contains("Out-of-order")){
            e.setCancelled(true);
        }
    }
}
