/*
 * Iris is a World Generator for Minecraft Bukkit Servers
 * Copyright (c) 2021 Arcane Arts (Volmit Software)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.volmit.iris.util.decree;

import com.volmit.iris.util.decree.annotations.Decree;
import com.volmit.iris.util.decree.annotations.Param;
import org.bukkit.entity.Player;

public class EXAMPLE extends DecreeCommand {
    @Decree
    public void kick(
            @Param(name = "player", description = "The Player to kick from the server", aliases = "p")
                    Player player,
            @Param(name = "reason", description = "A reason to kick the player for", value = "No reason!", aliases = "k")
                    String reason)
    {
        player.kickPlayer(reason);
        DecreeContext.get().sendMessage("Kicked " + player.getName());
    }
}