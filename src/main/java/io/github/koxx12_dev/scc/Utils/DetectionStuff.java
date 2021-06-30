package io.github.koxx12_dev.scc.Utils;

import net.minecraft.client.Minecraft;

public class DetectionStuff {

    /*
        Code stolen from skytils
        @Author My-Name-Is-Jeff
    */

    public static boolean isOnHypixel() {
        Minecraft mc = Minecraft.getMinecraft();
        if (mc != null && mc.theWorld != null && !mc.isSingleplayer()) {
            return mc.getCurrentServerData().serverIP.toLowerCase().contains("hypixel");
        }
        return false;
    }
}
