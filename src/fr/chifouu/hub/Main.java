package fr.chifouu.hub;

import fr.chifouu.hub.listeners.PluginMessageListener;
import fr.chifouu.hub.listeners.ProxyPingListeners;
import fr.chifouu.hub.player.Account;
import net.md_5.bungee.api.plugin.Plugin;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main extends Plugin {
    public static Main INSTANCE;
    private ArrayList<Account> accounts = new ArrayList<>();

    @Override
    public void onEnable() {
        INSTANCE = this;
        getProxy().getPluginManager().registerListener(this, new ProxyPingListeners());

        this.getProxy().registerChannel("AdolaChannel");
        this.getProxy().getPluginManager().registerListener(this, new PluginMessageListener());

        accounts.add(new Account(1, UUID.fromString("e19131b2-368f-4a35-ac54-3594f2bcb277"),
                "LA ZONE", 10f, 1, "ADMIN", 1));

    }

    public ArrayList<Account> getAccounts(){
        return this.accounts;
    }

    @Override
    public void onDisable() {

    }
}
