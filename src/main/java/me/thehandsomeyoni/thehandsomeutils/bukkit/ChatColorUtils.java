package me.thehandsomeyoni.thehandsomeutils.bukkit;

import org.bukkit.ChatColor;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ChatColorUtils {

    private String string;

    public ChatColorUtils(String text) {
        this.string = text;
    }

    public String color(ChatColor color) {
        return color + string;
    }

    public String color(){
        return string == null ? "" : ChatColor.translateAlternateColorCodes('&', string);
    }

    // returns a list with all ChatColors that exist in the given string.
    public List<ChatColor> getChatColors() {
        List<ChatColor> colors = new ArrayList<>();
        for (ChatColor color : ChatColor.values()) {
            if (string.contains(color.name())) {
                colors.add(color);
            }
        }
        return colors;
    }

    // returns a string that colors the given string with the given RGB color code.
    public String colorWithRGB(int red, int green, int blue) {
        return net.md_5.bungee.api.ChatColor.of(new Color(red, green, blue)) + string;
    }

    // returns a colored string with a given HEX color code.
    public String colorWithHEX(String hex) {
        return net.md_5.bungee.api.ChatColor.of(hex) + string;
    }
}
