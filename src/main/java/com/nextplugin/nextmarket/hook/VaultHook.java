package com.nextplugin.nextmarket.hook;

import com.google.inject.Singleton;
import com.nextplugin.nextmarket.NextMarket;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.plugin.RegisteredServiceProvider;

@Singleton
public class VaultHook {

    private Economy economy;

    public void registerEconomy() {
        RegisteredServiceProvider<Economy> rsp = NextMarket.getInstance().getServer().getServicesManager().getRegistration(Economy.class);
        economy = rsp.getProvider();
    }

    public Economy getEconomy() {
        return economy;
    }

}
