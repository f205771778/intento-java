package com.tuusuario;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class MiPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Registrar el comando
        this.getCommand("saludo").setExecutor(new SaludoCommand());
        getLogger().info("MiPlugin ha sido habilitado!");
    }

    @Override
    public void onDisable() {
        getLogger().info("MiPlugin ha sido deshabilitado.");
    }

    // Comando que envía un saludo
    public class SaludoCommand implements CommandExecutor {

        @Override
        public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
            if (command.getName().equalsIgnoreCase("saludo")) {
                sender.sendMessage("¡Hola, " + sender.getName() + "! Bienvenido al servidor.");
                return true;
            }
            return false;
        }
    }
}
