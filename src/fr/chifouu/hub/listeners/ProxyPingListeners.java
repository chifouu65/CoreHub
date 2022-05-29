package fr.chifouu.hub.listeners;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ServerPing;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ConnectedPlayer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.ProxyPingEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class ProxyPingListeners implements Listener {

    @EventHandler
    public void onProxyPing(ProxyPingEvent event){
        final ServerPing serverPing = event.getResponse();

        event.getConnection().getName();

        serverPing.setDescriptionComponent(new TextComponent(ChatColor.RED +"Bonjour vien ici c:"));//set le motd du server
        serverPing.getPlayers().setMax(10);//set max player on server



        event.setResponse(serverPing);
    }

}
