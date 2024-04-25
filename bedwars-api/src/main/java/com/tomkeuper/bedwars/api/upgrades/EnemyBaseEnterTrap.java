/*
 * BedWars2023 - A bed wars mini-game.
 * Copyright (C) 2024 Tomas Keuper
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
 *
 * Contact e-mail: contact@fyreblox.com
 */

package com.tomkeuper.bedwars.api.upgrades;

import com.tomkeuper.bedwars.api.arena.team.ITeam;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface EnemyBaseEnterTrap {

    /**
     * Trap name msg path.
     */
    String getNameMsgPath();

    /**
     * Trap lore msg path.
     */
    String getLoreMsgPath();

    /**
     * Trap display item for man gui.
     */
    ItemStack getItemStack();

    /**
     * What to do on trigger.
     */
    void trigger(ITeam trapTeam, Player player);
}
